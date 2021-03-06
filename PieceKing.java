import javafx.scene.image.Image;

public class PieceKing extends Piece {
	public String name = "King";
	public String imgname = "king.png";
	private Piece[][] boardstate;
	private int i;
	private int j;
	private int te;

	public PieceKing(int type, int ii, int jj) {
		super(type);
		te=type;
		i = ii;
		j = jj;
	}
	
	@Override
	public Image image(){
	 if(te==1)
	 return new Image("whitekingcursor.png");
	 else
	 return new Image("blackkingcursor.png");
	}
	
	@Override
	public int icoord(){
		if(i > 8){
		return 7;}
		
		if(i < 0){
		return 0;}
		
		else{return i;}
	}
	
	@Override
	public int jcoord(){
		if(j > 8){
		return 7;}
		
		if(j < 0){
		return 0;}
		
		else{return j;}
	}
	
	@Override
	public String toString(){
		return name;
	}
	
	@Override
	public String imagefilename(){
		return imgname;
	}
	
	public Piece[][] moveking(Piece k, Piece t, Piece[][] bs){
		boardstate = bs;
		// Move pawn
		boardstate[t.icoord()][t.jcoord()] = new PieceKing(k.type(), t.icoord(), t.jcoord());
		boardstate[k.icoord()][k.jcoord()] = new Empty(0, k.icoord(), k.jcoord());
		// Return the new board
		return boardstate;
	}
}
