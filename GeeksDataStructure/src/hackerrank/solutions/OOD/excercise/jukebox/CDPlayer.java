package hackerrank.solutions.OOD.excercise.jukebox;

public class CDPlayer {
	private Playlist p;
	private CD c;
	/*
	 * Constructors.
	 */
	public CDPlayer(CD c, Playlist p) {
		
	}
	public CDPlayer(Playlist p) {
		this.p = p;
	}
	public CDPlayer(CD c) {
		this.c = c;
	}
	/*
	 * Play song
	 */
	public void playSong(Song s) {
		
	}
	/*
	 * Getters and setters
	 */
	public Playlist getP() {
		return p;
	}
	public void setP(Playlist p) {
		this.p = p;
	}
	public CD getC() {
		return c;
	}
	public void setC(CD c) {
		this.c = c;
	}

}
