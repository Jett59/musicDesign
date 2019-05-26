import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.jfugue.midi.MidiFileManager;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;

public class MusicDesignerMain {
public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException, IOException {
    Player player = new Player();
    Pattern pattern1 = new Pattern("c ew2 r c b4w2 r");
    pattern1.setInstrument("Clarinet");
    pattern1.setVoice(0);
    pattern1.repeat(2);
    Pattern pattern2 = new Pattern("c b4w2 r c dw2 r");
    pattern2.setInstrument("Clarinet");
    pattern2.setVoice(1);
    pattern2.repeat(2);
    Pattern pattern3 = new Pattern("c cw2 r c cw2 r");
    pattern3.setInstrument("Clarinet");
    pattern3.setVoice(2);
    pattern3.repeat(2);
    Rhythm r1 = new Rhythm();
    r1.addLayer("");
    
    
    
    
    
    
    
    
    Pattern combined = new Pattern();
    combined.add(pattern1);
    combined.add(pattern2);
    combined.add(pattern3);
    player.play(combined);
    MidiFileManager.savePatternToMidi(combined, new File("sound.mid"));
}
}
