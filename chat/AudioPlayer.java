import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class AudioPlayer {
    public static void main(String[] args) {
        try {
            // Substitua "audiofile.wav" pelo caminho para o seu arquivo WAV
            File audioFile = new File("audiofile.wav");

            // Obtém um fluxo de áudio do arquivo
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            // Obtém um clip de áudio
            Clip audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);

            // Reproduz o áudio
            audioClip.start();

            // Aguarda a reprodução terminar
            // Isto é necessário para garantir que o programa não termine antes do áudio acabar
            Thread.sleep(audioClip.getMicrosecondLength() / 1000);

            // Fecha o fluxo de áudio
            audioStream.close();
        } catch (UnsupportedAudioFileException | IOException | InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
