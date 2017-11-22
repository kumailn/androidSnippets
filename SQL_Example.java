//Create SQL database
SQLiteDatabase database = openOrCreateDatabase("databaseName", MODE_PRIVATE, null);
//Execute SQL statement on database
database.execSQL("CREATE TABLE IF NOT EXISTS tableName(fieldOne VARCHAT, field2 INT)");

//Use a cursor object to return a value 
Cursor c = database.rawQuery("SELECT something FROM tableName", null);
c.moveToFirst();
