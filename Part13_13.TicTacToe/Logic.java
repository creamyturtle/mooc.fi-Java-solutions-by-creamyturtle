package ticTacToe;
 

public class Logic {
    
    private String playerX;
    private String playerO;
    public String activePlayer;
    
    private String pos1;
    private String pos2;
    private String pos3;
    private String pos4;
    private String pos5;
    private String pos6;
    private String pos7;
    private String pos8;
    private String pos9;
    
    public boolean oneIsPlayed;
    public boolean twoIsPlayed;
    public boolean threeIsPlayed;
    public boolean fourIsPlayed;
    public boolean fiveIsPlayed;
    public boolean sixIsPlayed;
    public boolean sevenIsPlayed;
    public boolean eightIsPlayed;
    public boolean nineIsPlayed;
    
    
 
    
    
    public Logic() {
        
        playerX = "X";
        playerO = "O";
        
        pos1 = "a";
        pos2 = "b";
        pos3 = "c";
        pos4 = "d";
        pos5 = "e";
        pos6 = "f";
        pos7 = "g";
        pos8 = "h";
        pos9 = "i";
        
        oneIsPlayed = false;
        twoIsPlayed = false;
        threeIsPlayed = false;
        fourIsPlayed = false;
        fiveIsPlayed = false;
        sixIsPlayed = false;
        sevenIsPlayed = false;
        eightIsPlayed = false;
        nineIsPlayed = false;
        
        activePlayer = playerX;
        
    }
    
    
    public String box1(String player) {
        
        pos1 = player;
        oneIsPlayed = true;
        return player;
        
    }
    
    public String box2(String player) {
        
        pos2 = player;
        twoIsPlayed = true;
        return player;
        
    }
    
    public String box3(String player) {
        
        pos3 = player;
        threeIsPlayed = true;
        return player;
        
    }
    
    public String box4(String player) {
        
        pos4 = player;
        fourIsPlayed = true;
        return player;
        
    }
    
    public String box5(String player) {
        
        pos5 = player;
        fiveIsPlayed = true;
        return player;
        
    }
    
    public String box6(String player) {
        
        pos6 = player;
        sixIsPlayed = true;
        return player;
        
    }
    
    public String box7(String player) {
        
        pos7 = player;
        sevenIsPlayed = true;
        return player;
        
    }
    
    public String box8(String player) {
        
        pos8 = player;
        eightIsPlayed = true;
        return player;
        
    }
    
    
    public String box9(String player) {
        
        pos9 = player;
        nineIsPlayed = true;
        return player;
        
    }
    
    
    public void setActivePlayer(String player) {
        
        if (playerX.equals(player)) {
            activePlayer = playerO;
        }
        
        if (playerO.equals(player)) {
            activePlayer = playerX;
        }
              
        
    }
    
    public String getActivePlayer() {
        return activePlayer;
    }
    
    
    public boolean ticTacToe() {
        
        //horizontal wins
        if (pos1.equals(pos2) && pos2.equals(pos3) && pos1.equals(pos3)) {
            return true;
        }
        
        if (pos4.equals(pos5) && pos5.equals(pos6) && pos4.equals(pos6)) {
            return true;
        }
        
        if (pos7.equals(pos8) && pos8.equals(pos9) && pos7.equals(pos9)) {
            return true;
        }
        
        
        //vertical wins
        if (pos1.equals(pos4) && pos4.equals(pos7) && pos1.equals(pos7)) {
            return true;
        }
        
        if (pos2.equals(pos5) && pos5.equals(pos8) && pos2.equals(pos8)) {
            return true;
        }
        
        if (pos3.equals(pos6) && pos6.equals(pos9) && pos3.equals(pos9)) {
            return true;
        }
        
        
        //diagonal wins
        if (pos1.equals(pos5) && pos5.equals(pos9) && pos1.equals(pos9)) {
            return true;
        }
        
        if (pos3.equals(pos5) && pos5.equals(pos7) && pos3.equals(pos7)) {
            return true;
        }
        
 
        
        return false;
    }
    
    
    
    
    
}
