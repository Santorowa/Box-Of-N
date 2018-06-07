package com.test.skp;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class solution1 {
	public String[] solution(String[] movie) {
		String[] ans = {};
        
		List <String> sampleList = (List<String>)Arrays.asList(movie);
		Map<String, Integer> testmap = new HashMap<>();
		for (String input : movie) {
			int freq = Collections.frequency(sampleList, input);
			if (!testmap.containsKey(input)) {
				testmap.put(input, freq);
			}
		}
		
		
		return ans;
	}
}
 