package controller;

import model.Triqui;
import view.CustomEvent;
import view.CustomEventResponse;
import view.IOManager;

public class Services implements CustomEvent{
	private CustomEventResponse event; 
	
	public void init() {

		double h = 0.1;
		
		System.out.println(h);
	}
	@Override
	public void reiniciar() {
		event.restarGame();	
	}
	
	public CustomEventResponse getEvent() {
		return event;
	}
	public void setEvent(CustomEventResponse event) {
		this.event = event;
	}


	@Override
	public void sendTriqui(String[] boxMirror, int i) {
		Triqui t = new Triqui();
		int winOp [];
		String resultString = t.isWinner(boxMirror, i);
		if(!resultString.equals("-")) { 
			System.out.println();
			System.out.println("Entro");
			winOp = t.getWinOption(boxMirror,resultString);
            event.showWinner(winOp,resultString);
		}
		
	}
}
