//Include in activity with menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //test
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


//main_menu.xml file example:
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:title="Settings"
        android:id="@+id/settings"/>
    <item android:title="Help"
        android:id="@+id/help"/>
</menu>


//Setup on click events for each Item1
@Override
public boolean onOptionsItemSelected(MenuItem item) {
    if(item.getItemId() == R.id.Settings){

        Toast.makeText(getApplicationContext(), "Click Works", Toast.LENGTH_SHORT).show();
    }
    return super.onOptionsItemSelected(item);
}
