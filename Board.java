public class Board{
	private Slot[][] slots = new Slot[30][30];
	
	public Board(){
		super();
		for(int i=0; i < slots.length; i++){
			for(int j=0; j < slots.lenght; j++){
				this.slots[i][j] = new Slot(i,j);
			}
		}
	}
	
	public Slot getSlot(int x, int y){
		return slots[x][y];
	}
}