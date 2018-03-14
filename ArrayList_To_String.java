//Convert ArrayList to String
StringBuilder stringBuilder = new StringBuilder();
                for(String str : sampleArray){
                    stringBuilder.append(str).append(";"); //separating contents using semi colon
                }

String finalString = stringBuilder.toString();

//Alternatively a much easier solution:
String finalStringTwo = Arrays.toString(sampleArray); 
