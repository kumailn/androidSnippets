//AsyncTask class - String (input type), Void (Action), String (return type)
    public class DownloadTask extends AsyncTask<String , Void, String>{
        @Override
        //main method
        protected String doInBackground(String... strings) {
            Log.e("Download from URL: ", strings[0]);
            String result = "";
            URL url;
            //new HTTP connection
            HttpURLConnection urlConnection = null;
            try{
                //create URL type from input string
                url = new URL(strings[0]);
                //Open URL connection with given URL
                urlConnection = (HttpURLConnection) url.openConnection();
                //Create input stream
                InputStream in = urlConnection.getInputStream();
                //Create input stream reader
                InputStreamReader reader = new InputStreamReader(in);
                int data = reader.read();
                //last element of data == -1
                while(data != -1){
                    //cast data to char
                    char current = (char)(data);
                    //add char to result string
                    result += current;
                    //move onto next character
                    data = reader.read();
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
            //Return string of HTML data
            return result;

        }
    }
