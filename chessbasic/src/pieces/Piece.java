package pieces;
import Default.*;

import java.util.ArrayList;


public class Piece {
    private char representation = ' ';
    private String teamString = "";
    private String representationString= "";
    private char team = ' ';
    private int currentTileID;


    public Piece(){}

    public Piece(char i, char t, int ID){
        representation = i;
        setTeam(t);
        setCurrentTileID(ID);
    }

    public ArrayList<String> canMove(Tile[][] board){
        return new ArrayList<String>();
    }

    public String toString(){
        representationString =""+ team + representation;
        return representationString;
    }
    
    public char getTeam() {
        return team;
    }

    public int getCurrentTileID() {
        return currentTileID;
    }

    public void setCurrentTileID(int currentTileID) {
        if(currentTileID > 0 && currentTileID < 65)
            this.currentTileID = currentTileID;
    }

    public void setTeam(char team) {
        if(team == 'W' || team == 'B')
            this.team = team;
        else
            System.out.println("Invalid Team");
    }

    public char getRepresentation() {
        return representation;
    }

    public boolean inBounds(int i, int j, int newI, int newJ){
        boolean inBounds= false;
        if (i> newI){
            if(j> newJ){
                if(newI >= 0 && newJ >= 0){
                    inBounds = true;
                    System.out.println("i- j- newI and NewJ GTZ true");}

            }
            else if(j< newJ){
                if(newI >= 0 && newJ <= 7){
                    inBounds = true;
                    System.out.println("i- j+ newI  GTZ  newJ STS true");
                }
            }
            else if(j == newJ){
                if(newI>= 0){
                    inBounds = true;
                    System.out.println("i- j= newI  GTZ  newJ same");
                }
            }
        }
        else if(i< newI){
            if(j> newJ){
                if(newI <= 7 && newJ >= 0){
                    inBounds = true;
                    System.out.println("i+ j- newI STS and newJ GTZ true");}

            }
            else if(j< newJ){
                if(newI <= 7 && newJ <= 7){
                    inBounds = true;
                    System.out.println("i+ j+ newI and NewJ STS true");}
            }
            else if(j == newJ){
                if(newI<=7){
                    inBounds = true;
                    System.out.println("i+ j= newI  STS  newJ same");
                }
            }


        }
        else if(i == newI){
            if(j> newJ){
                if(newJ >= 0){
                    inBounds = true;
                    System.out.println("i= j- newI same and NewJ GTZ true");}

            }
            else if(j< newJ){
                if(newJ <= 7){
                    inBounds = true;
                    System.out.println("i= j+ newI  same  newJ STS true");
                }
            }
        }
        return inBounds;
    }
}
