/*
 ParseJSON using Volley without AsyncTask:


 Add
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
 to Android_Manifest

 Add "com.mcxiaoke.volley:library:1.0.19" to dependancies in Build.Gradle
*/

public static locationReturnStatement;

RequestQueue requestQueue;
public String parseJSON(double lat, double lon){
    requestQueue = Volley.newRequestQueue(this);
    String jsonURL = "https://maps.googleapis.com/maps/api/geocode/json?latlng=42.2199983,-108.4569983&key=AIzaSyDBjz8G41V2MUToug2aWJ3TLxqVUnZAog4";
    String jsonURL = "https://maps.googleapis.com/maps/api/geocode/json?latlng=" + String.valueOf(lat) + "," + String.valueOf(lon) + "&key=AIzaSyDBjz8G41V2MUToug2aWJ3TLxqVUnZAog4";
    Log.e(String.valueOf(lat),String.valueOf(lon));
    Log.e(jsonURL, "");
    JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, jsonURL,
            new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    try {
                        //JSONArray jsonArray = response.getJSONArray("name");
                        String aaa = response.getJSONArray("results").getJSONObject(0).getString("formatted_address");
                        MainActivity.locationReturnStatement = aaa;
                        //Toast.makeText(MainActivity.this, "JSON WORKS", Toast.LENGTH_SHORT).show();
                        Log.e("JSONVOLLEY", aaa);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

            },
            new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.e("VOLLEY", "ERROR");
                }
            }
    );
    strs.add("f");
    requestQueue.add(jsonObjectRequest);
    Log.e("JSON", String.valueOf(strs.get(0)));
    if (!MainActivity.locationReturnStatement.equals("a")){
        return MainActivity.locationReturnStatement;
    }
    return "";


}
