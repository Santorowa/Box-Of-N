package com.level1;

import java.util.Calendar;

class Solution {
	public static String solution(int a, int b) {
		String answer = "";
		final String[] DAY_OF_WEEK = { "", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		Calendar date = Calendar.getInstance();
		if (a <= 12 && a >= 1) {
			switch (a) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (b <= 31 && b >= 1) {
					date.set(2016, a - 1, b);
					break;
				} else {
					System.out.println("올바른 날짜를 입력하시오.");
					break;
				}
			case 2:
				if (b <= 29 && b >= 1) {
					date.set(2016, a - 1, b);
					break;
				} else {
					System.out.println("올바른 날짜를 입력하시오.");
					break;
				}
			default:
				if (b <= 30 && b >= 1) {
					date.set(2016, a - 1, b);
					break;
				} else {
					System.out.println("올바른 날짜를 입력하시오.");
					break;
				}
			}

		} else
			System.out.println("올바른 날짜를 입력하시오.");

		answer = DAY_OF_WEEK[date.get(Calendar.DAY_OF_WEEK)];

		return answer;
	}
	public static void main(String[] args) {
		String res;
		res = solution(6, 30);
		System.out.println(res);
	}
}