package Default;

import pieces.Piece;

public class Tile {

    private static int tileCounter = 0;
    private int tileID;
    private Piece currentPiece= null;
    private Boolean piecePresent = false;
    private Boolean validMove = false;



    public Tile(){
        tileID = tileCounter;
        tileCounter++;
    }

    public Tile(Piece p){
        tileID = tileCounter;
        tileCounter++;
        this.setPiecePresent(true);
        currentPiece = p;
    }


    public Boolean getPiecePresent() {
        return piecePresent;
    }

    public void setPiecePresent(Boolean piecePresent) {
        this.piecePresent = piecePresent;
    }

    public int getTileID() {
        return tileID;
    }

    public String toString(){
        if(!validMove){
            if(piecePresent)
                return currentPiece.toString();
            return "==";
        }
        else{
            if(piecePresent)
                return currentPiece.toString().toLowerCase();
            return "()";
        }
    }

    public Piece getCurrentPiece() {
        return currentPiece;
    }

    public void setCurrentPiece(Piece currentPiece) {
        this.currentPiece = currentPiece;
    }

    public Boolean getValidMove() {
        return validMove;
    }

    public void setValidMove(Boolean validMove) {
        this.validMove = validMove;
    }
}
