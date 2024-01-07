package hackerrank.solutions.OOD.excercise.jukebox;

import java.util.Queue;

public class Playlist {

	private Song song;
	private Queue<Song> queue;
	public Playlist(Song song, Queue<Song> queue) {
		
	}
	public Song hetNextSToPlay() {
		return queue.peek();
	}
	public void queueUpSong(Song s) {
		queue.add(s);
	}
}
