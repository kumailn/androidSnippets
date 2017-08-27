//Load data saved via SharedPreferences

public String load(){
        SharedPreferences sharedPreferences = getSharedPreferences("myData", Context.MODE_PRIVATE);
        String value1 = sharedPreferences.getString("Item1", defaultMethod);
        return Integer.parseInt(value1);
    }
