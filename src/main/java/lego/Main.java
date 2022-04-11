package lego;


import jaxb.JAXBHelper;

import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception{
        var legoset = new LegoSet();
        legoset.number = "75211";
        legoset.name = "Imperial TIE Fighter";
        legoset.theme = "Star Wars";
        legoset.subtheme = "Solo";
        legoset.year = Year.of(2018);
        legoset.pieces = 519;
        legoset.tags = new HashSet<>();
        legoset.tags.add("Starfighter");
        legoset.tags.add("Stormtrooper");
        legoset.tags.add("Star Wars");
        legoset.tags.add("Solo");
        legoset.minifigs = new ArrayList<>();
        legoset.minifigs.add(new Minifig("Imperial Mudtrooper",2));
        legoset.minifigs.add(new Minifig("Imperial Pilot",1));
        legoset.minifigs.add(new Minifig("Mimban Stormtrooper",1));
        legoset.weight = new Weight(0.89, "kg");
        legoset.url = new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");

        JAXBHelper.toXML(legoset,System.out);
    }
}
