public class DownloadTask extends AsyncTask<String , Void, String>{
        @Override
        protected String doInBackground(String... strings) {
            Log.e("Download form URL: ", strings[0]);
            String result = "";
            URL url;
            HttpURLConnection urlConnection = null;
            try{
                url = new URL(strings[0]);
                urlConnection = (HttpURLConnection) url.openConnection();
                InputStream in = urlConnection.getInputStream();
                InputStreamReader reader = new InputStreamReader(in);
                int data = reader.read();
                while(data != -1){
                    char current = (char)(data);
                    result += current;
                    data = reader.read();
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
            //Result is a string of the websites complete HTML data
            return result;

        }
    }
