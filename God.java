package test.some;

public class God {
    public static Human[] create(){
        //code

        return new Human[]{new Man(),new Woman()};
    }
}
//code
class Human {
    private  String name;

    public String getName() {return this.name;}

    public void setName(String name) {this.name = name;}
}
class Man extends Human{
}

class Woman extends Human{
}
