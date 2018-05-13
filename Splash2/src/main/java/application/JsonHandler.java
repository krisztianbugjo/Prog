package application;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import models.Reservation;

/**
 * 
 *A fájl módosítását vezénylõ metódus.
 */

public class JsonHandler {
	
/**
 * 
 * A fájl írását lebonyolító metódus.
 */
	public void jWrite(List<Reservation> list) {
		JSONObject MainObj = new JSONObject();
		JSONArray JsonList = new JSONArray();
		for (Reservation reservation : list) {

			JSONObject obj = new JSONObject();
			obj.put("pool_id", reservation.getPoolId());
			obj.put("date", reservation.getDate());
			obj.put("lane_id", reservation.getLane());
			obj.put("time", reservation.getTime());
			JsonList.add(obj);
		}
		MainObj.put("reservations", JsonList);


		try (FileWriter file = new FileWriter("reservations.json")) {

			file.write(MainObj.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}


	}
	
	/**
	 * 
	 * A fájl olvasását lebonyolító metódus.
	 */

	public List<Reservation> read() {
		JSONParser parser = new JSONParser();
		List<Reservation> reservations = new ArrayList<Reservation>();

		try {
			Object obj;

			obj = parser.parse(new FileReader("reservations.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray reservationJSonArray = (JSONArray) jsonObject.get("reservations");
			Iterator<JSONObject> iterator = reservationJSonArray.iterator();
			while (iterator.hasNext()) {

				JSONObject jsonObjectIterator = (JSONObject) iterator.next();

				String poolId = (String) jsonObjectIterator.get("pool_id");
				String laneId = (String) jsonObjectIterator.get("lane_id");
				String time = (String) jsonObjectIterator.get("time");
				String date = (String) jsonObjectIterator.get("date");

				Reservation reservation = new Reservation(poolId, date, laneId, time);
				reservations.add(reservation);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
		return reservations;
	}

}
