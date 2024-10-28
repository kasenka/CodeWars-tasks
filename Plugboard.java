package test.some;

import java.util.HashMap;

public class Plugboard {
    private HashMap<Character,Character> wiring;

    public Plugboard(String wires) throws IllegalArgumentException {
        if ((wires.length() % 2 != 0) || (wires.chars().distinct().count() < wires.length()) || (wires.length() > 20)){
            throw new IllegalArgumentException() ;
        }

        else {
            wiring = new HashMap<>();

            for (int i = 0; i < wires.length() - 1; i+=2) {
                var char1 = wires.charAt(i);
                var char2 = wires.charAt(i+1);

                wiring.put(char1, char2);
                wiring.put(char2, char1);
            }
        }

    }

    public String process(String wire) {
        wire = (this.wiring.containsKey(wire.charAt(0)))? String.valueOf(this.wiring.get(wire.charAt(0))) : wire;
        return wire;
    }
}
