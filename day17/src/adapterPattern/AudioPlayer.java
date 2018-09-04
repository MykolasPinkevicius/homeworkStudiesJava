package adapterPattern;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		//Inbuild support to play mp3 files
		if(audioType.equalsIgnoreCase("MP3")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		}
		else if(audioType.equalsIgnoreCase("VLC") || audioType.equalsIgnoreCase("MP4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		else {
			System.out.println("Invalid media. " + audioType + " format not supported");
		}
		
	}

}
