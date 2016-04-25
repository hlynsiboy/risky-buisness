public class Slot {
	public int x;
	puclic int y;
	Piece piece;
	
	public Slot(int x, int y){
		super();
		this.x = x;
		this.y = y;
		piece = null;
	}
	
// should moves be validated here? If not, we need a new class that checks if a move is valid.
}