package telran.color.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.ToString;

@Getter

public class BackgroundColors {
	@JsonAlias({"closest_palette_color"})
String closestPaletteColor;
	
String closest_palette_color_parent;
String percent;
@Override
public String toString() {
	return closestPaletteColor  +"\t"+ 
			 closest_palette_color_parent + "\t" +"\t" + percent;
}
}
