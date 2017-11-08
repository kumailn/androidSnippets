//Save data via SharedPreferences

public void save(String myString){
    //Creates xml file in local directory containging key-value pairs
    SharedPreferences sharedPreferences = getSharedPreferences("myData", Context.MODE_PRIVATE);
    SharedPreferences.Editor editor = sharedPreferences.edit();
    // Key name = Item1, Value = myString
    editor.putString("Item1", myString);
    editor.commit();
}

//Shorter method to save to SharedPreferences
public String loadTwo(){
        SharedPreferences sharedPreferences = getSharedPreferences("myData", Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("KEY", "VALUE").apply();
}
