package model;

public class Triqui {

	private int [][] winCond= {
			{0,1,2},
			{3,4,5},
			{6,7,8},
			{0,3,6},
			{1,4,7},
			{2,5,8},
			{0,4,8},
			{2,4,6},
	};

	public Triqui() {

	}

	public String isWinner(String [] triqui, int k) {
           System.out.println(k);
		for(int i =0; i< winCond.length;i++) {
			if(triqui[winCond[i][0]].equals("X") &&
					triqui[winCond[i][1]].equals("X")&&
					triqui[winCond[i][2]].equals("X")) {
					return "X";
			}else if(triqui[winCond[i][0]].equals("O") &&
					triqui[winCond[i][1]].equals("O")&&
					triqui[winCond[i][2]].equals("O")) {
					return "O";
			}
		}
		return "-";
	}
	
	public int [] getWinOption(String [] triqui, String resultString) {
		int [] a  = new int [3];
		for(int i =0; i< winCond.length;i++) {
			if(triqui[winCond[i][0]].equals(resultString) &&
					triqui[winCond[i][1]].equals(resultString)&&
					triqui[winCond[i][2]].equals(resultString)) {
                    a[0]=winCond[i][0];
                    a[1]=winCond[i][1];
                    a[2]=winCond[i][2];
                    
			}
		}
		return a;
	}
}
