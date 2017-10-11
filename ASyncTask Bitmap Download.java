//AsyncTask class - String (input type), Void (Action), String (return type)
public class ImageDownloader extends AsyncTask<String, Void, Bitmap>{

        @Override
        protected Bitmap doInBackground(String... strings) {
            try {
              //New url from string
                URL url = new URL(strings[0]);
                //Open HTTP connection to url
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                //Connect
                httpURLConnection.connect();
                //Create inputStream
                InputStream inputStream = httpURLConnection.getInputStream();
                //Convert input stream to bitmap with BitmapFactory
                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                //Return resulting bitmap
                return  bitmap;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
