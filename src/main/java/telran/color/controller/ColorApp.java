package telran.color.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import telran.color.dto.ColorDto;


public class ColorApp {
	static RestTemplate restTemplate = new RestTemplate();
	final static String TOKEN = "Basic YWNjX2EwYTU4OTc5NmMzMzY2Mzo4ZTc4N2Q4ODlhNmM0N2M1M2MzNjU2MDEwZmQ5Y2Q2ZA==";
	public static void main(String[] args) throws URISyntaxException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", TOKEN);
		RequestEntity<String> requestEntity = new RequestEntity<String>(headers,HttpMethod.GET,new URI("https://api.imagga.com/v2/colors?image_url=https://imagga.com/static/images/tagging/wind-farm-538576_640.jpg"));
		
		System.out.println("color name"+ "\t"+ "color parent"+"\t"+"percent");
		ResponseEntity<ColorDto> responseEntity = restTemplate.exchange(requestEntity, ColorDto.class);
		Arrays.stream(responseEntity.getBody().getResult().getColors().getImage_colors())
		.forEach(System.out::println);
		Arrays.stream(responseEntity.getBody().getResult().getColors().getForeground_colors())
		.forEach(System.out::println);
		Arrays.stream(responseEntity.getBody().getResult().getColors().getBackground_colors())
		.forEach(System.out::println);
	}

}
