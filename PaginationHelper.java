package test.some;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PaginationHelper<I> {
    private List<I> collections;
    private int itemsPerPage;
    private Map<Integer, List<I> > pages;
    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collections = collection;
        this.itemsPerPage = itemsPerPage;

        this.pages = IntStream.range(0, (int) Math.ceil((double) collection.size() / itemsPerPage))
                .boxed()
                .collect(Collectors.toMap(
                        i -> i,
                        i -> collection.subList(
                                itemsPerPage * i,
                                Math.min((i + 1) * itemsPerPage, collection.size())
                        )
                ));
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collections.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (int) Math.ceil((double) collections.size() / itemsPerPage);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        int pageItemCount = (pages.keySet().contains(pageIndex))? pages.get(pageIndex).size() : -1;
        return pageItemCount;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        int pageIndex = (collections.size() > itemIndex && itemIndex >= 0)? (itemIndex / itemsPerPage): -1;
        return pageIndex;
    }
}
