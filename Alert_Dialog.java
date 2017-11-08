public void makeAlertDialog(){
    new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_map).setTitle("Hi!").setMessage("Hello this is a test")
            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getApplicationContext(), "You clicked the button", Toast.LENGTH_SHORT).show();
                }
            })
            .setNegativeButton("No", null).show();

}
