//

//Add timestamp to notification
.setWhen(System.currentTimeMillis()).setShowWhen(true)


//Regex find between
String myString = "hello this is a test";
        Pattern pattern = Pattern.compile("he(.*?)st");
        Matcher matcher = pattern.matcher(myString);

        while(matcher.find()){
            System.out.println(matcher.group(1));
        }


//Convert milliseconds to database
SimpleDateFormat sdf = new SimpleDateFormat("MMM dd/yyyy hh:mm");
Date date = new Date(System.currentTimeMillis());
String dateString = sdf.format(date);
