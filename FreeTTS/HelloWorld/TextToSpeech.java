/* TextToSpeech Class Code */
/* TTS Demo */

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextToSpeech {
	private String name;
	private com.sun.speech.freetts.Voice voice;
	
	public TextToSpeech(String name) {
		this.name = name;
		this.voice = VoiceManager.getInstance().getVoice(this.name);
		
		if(this.voice != null)
			this.voice.allocate();
		else
			throw new IllegalStateException("Cannot find voice: " + this.voice);
	}
	
	public void say(String something) {
		try {
			this.voice.speak(something);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void sayMultiple(String[] sayMePls) {
		for(int i=0; i<sayMePls.length; i++) {
			this.say(sayMePls[i]);
		}
	}
}
