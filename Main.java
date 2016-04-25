public class Main {
	private Board board = new Board();
	private Player player1;
	private Player player2;
	public Main(){
		super();
	}
	
	public Board getBoard(){
		return board;
	}
	
	public void setBoard(Board board){
		this.board = board;
	}
	
	public Player getPlayer(){
		return player;
	}
	
	public void setPlayer(Player player){
		this.player = player; % This makes no sense, given that player is either player1 or player2	
	}
}