package Massa;

import org.json.JSONObject;

public class Massa {
	static Devs dev = new Devs();
	static JSONObject json = new JSONObject();

	public static String Uri() {
		String uri = "https://reqres.in/api/users;";
		return uri;

	}

	public static String Body() {

		json.put("name", dev.getNome());
		json.put("job", "QA Tester");

		return json.toString();

	}

	public static String BodyUpdate() {
		json.put("name", "Roque QA - Pleno");
		json.put("job", dev.getNome() + " - Quality assurence");
		return json.toString();
	}

	public static String BodyPatch() {
		json.put("name", "Roque QA");
		json.put("job", "QA Tester - Quality assurence");
		return json.toString();
	}
}
