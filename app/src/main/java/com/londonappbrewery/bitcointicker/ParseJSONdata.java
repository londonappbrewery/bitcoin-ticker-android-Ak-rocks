package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Akshay on 26-09-2017.
 */

public class ParseJSONdata {
    private String price;

    public static ParseJSONdata fromJson(JSONObject responce) {

        try {
            ParseJSONdata priceData = new ParseJSONdata();
            priceData.price = responce.getString("price");

            return priceData;

        } catch (JSONException e) {

            e.printStackTrace();
            return null;
        }
    }

    public String getPrice() {
        return price;
    }
}
