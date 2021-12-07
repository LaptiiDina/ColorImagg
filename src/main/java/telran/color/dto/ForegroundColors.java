package telran.color.dto;

import lombok.Getter;
import lombok.ToString;

@Getter

public class ForegroundColors {
String closest_palette_color;
String closest_palette_color_parent;
String percent;
@Override
public String toString() {
	return closest_palette_color  +"\t"+ 
			 closest_palette_color_parent + "\t" +"\t" + percent;
}
}
