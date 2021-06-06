import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class DictionaryTTS {
	private String name;
	private com.sun.speech.freetts.Voice voice;
	
	public DictionaryTTS(String name) {
		this.name = name;
		this.voice = VoiceManager.getInstance().getVoice(this.name);
		
		if(this.voice != null) {
			this.voice.allocate();
		}
		else {
			throw new IllegalStateException("Cannot find voice : " + this.voice);
		}
	}
	
	public void say(String something) {
		try {
			this.voice.speak(something);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void sayMultiple(String[] something) {
		for(int i=0; i<something.length; i++) {
			this.say(something[i]);
		}
	}
}
