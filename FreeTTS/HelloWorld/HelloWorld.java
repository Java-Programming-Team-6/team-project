/* TTS Demo Hello, World! Code */

public class HelloWorld {
	public static void main(String[] args) {
		System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
		TextToSpeech voice = new TextToSpeech("kevin16");
		
		String[] sayMe = new String[] {
				"Hello world!",
				"This is TTS test!",
				"I am speaking normally!"
		};
		
		voice.sayMultiple(sayMe);
	}
}
