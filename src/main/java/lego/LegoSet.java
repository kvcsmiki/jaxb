package lego;


import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.net.URL;
import java.time.Year;
import java.util.List;
import java.util.Set;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@NoArgsConstructor
@XmlType(propOrder = {"number", "name", "theme", "subtheme", "year", "pieces", "tags", "minifigs", "weight", "url"})
@lombok.Data
public class LegoSet {
    @XmlAttribute
    String number;
    String name;
    String theme;
    String subtheme;
    @XmlJavaTypeAdapter(YearAdapter.class)
    Year year;
    int pieces;
    @XmlElementWrapper(name = "tags")
            @XmlElement(name = "tag")
    Set<String> tags;
    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    List<Minifig> minifigs;
    Weight weight;
    URL url;
}
