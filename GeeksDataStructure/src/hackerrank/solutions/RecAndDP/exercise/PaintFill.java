package hackerrank.solutions.RecAndDP.exercise;

public class PaintFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	enum Color { Black, White, Red, Yellow, Green }
	boolean paintFill(Color[][] screen, int r, int c, Color ncolor) {
		if (screen[r][c] == ncolor) return false;
		return paintFill(screen, r, c, screen[r][c], ncolor);
	}
//	dfs
	boolean paintFill(Color[][] screen, int r, int c, Color ocolor, Color ncolor) {
		if (r < 0 || r > screen.length || c < 0 || c >= screen[0].length) {
			return false;
		}
		if (screen[r][c] == ocolor) {
			screen[r][c] = ncolor;
			paintFill(screen, r - 1, c, ocolor, ncolor); // up
			paintFill(screen, r + 1, c, ocolor, ncolor); // down
			paintFill(screen, r, c - 1, ocolor, ncolor); // left
			paintFill(screen, r, c + 1, ocolor, ncolor); // down
		}
		return true;
	}

}
