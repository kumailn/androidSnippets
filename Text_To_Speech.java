//Text to speech example
TextToSpeech t1;
String toSpeak = "Hello";
t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);


//Optional - Push sound to ringtone
AudioAttributes aa = new AudioAttributes.Builder()
                        .setUsage(AudioAttributes.USAGE_ALARM)
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .build();
t1.setAudioAttributes(aa);
