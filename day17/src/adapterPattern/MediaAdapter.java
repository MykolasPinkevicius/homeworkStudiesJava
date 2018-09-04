package adapterPattern;

public class MediaAdapter implements MediaPlayer{

	AdvancedMediaPlayer advancedMusicPlayer;
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("VLC")) {
			advancedMusicPlayer = new VlcPlayer();
		} else if(audioType.equalsIgnoreCase("MP4")) {
			advancedMusicPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("VLC")) {
			advancedMusicPlayer.playVlc(fileName);
		}
		else if (audioType.equalsIgnoreCase("MP4")) {
			advancedMusicPlayer.playMp4(fileName);
		}
	}
}
