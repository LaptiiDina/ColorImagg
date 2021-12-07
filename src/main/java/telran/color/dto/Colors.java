package telran.color.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Colors {
	
	BackgroundColors[]background_colors;
	ForegroundColors[]foreground_colors;
	ImageColors[]image_colors;
}
