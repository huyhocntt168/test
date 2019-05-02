package Exe6;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Exe6 {
	public static void main(String[] args) {
		JsonArray course = new JsonArray();
		createJson(course);
		System.out.println(course);
		System.out.println();
		System.out.println("Print all coures information from json:");
		printCourse(course);
	}

	public static String[] getJsonData(JsonArray jarray) {

		String results[] = new String[jarray.size()];

		for (int i = 0; i < jarray.size(); i++) {
			JsonObject json = new JsonObject();
			json = jarray.get(i).getAsJsonObject();
			String result = "CoureID: " + json.get("courseId").getAsString() + "\nCoureName: " + json.get("courseName").getAsString() + "\nInstructors: "
					+ json.get("instructors").getAsString() + "\nStartDate:  " + json.get("startDate").getAsString();
			results[i] = result;
		}
		return results;
	}

	public static void printCourse(JsonArray jarray) {
		for (int i = 0; i < jarray.size(); i++) {
			System.out.println(i + 1);
			System.out.println(getJsonData(jarray)[i]);
			System.out.println();
		}

	}
	
	public static void createJson(JsonArray jarray) {
		JsonObject course1 = new JsonObject();
		course1.addProperty("courseId", "AWTB_181210DN");
		course1.addProperty("courseName", "API_webservice_testing_level_1");
		course1.addProperty("instructors", "thuong.dang");
		course1.addProperty("startDate", "10-Dec-2018");
		jarray.add(course1);
		JsonObject course2 = new JsonObject();
		course2.addProperty("courseId", "AWTA_181211");
		course2.addProperty("courseName", "API_webservice_testing_Level_2");
		course2.addProperty("instructors", "lam.hoang.nguyen ");
		course2.addProperty("startDate", "11-Dec-2018");
		jarray.add(course2);
	}
}
