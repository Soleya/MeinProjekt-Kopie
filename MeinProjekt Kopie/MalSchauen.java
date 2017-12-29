package MeinProjekt;

import java.util.Random;

import ledControl.BoardController;

public class MalSchauen {
	
	public static void main(String[] args) {

		int[][][] color = new int[12][12][3];
		
//		int green = 1;
//		
//		int red = 0;
//		
//		int blue = 2;
		
//		BoardController controller = BoardController.getBoardController();
		
		randomBlinker(color);
		
	}
	
	protected static void randomBlinker(int[][][] color){
		
		int zaehltMit = 0;
		
		BoardController controller = BoardController.getBoardController();
		
		while(zaehltMit < 10){
		
//		BoardController controller = BoardController.getBoardController();
		
		Random random  = new Random();
		
		int spalte1 = (int) (Math.random()*10 + 1);
		
		int zeile1 = (int) (Math.random()*10 + 1);
		
		int farbe = 1;
		
        int spalte2 = (int) (Math.random()*10 + 1);
		
		int zeile2 = (int) (Math.random()*10 + 1);
		
        int spalte3 = (int) (Math.random()*10 + 1);
		
		int zeile3 = (int) (Math.random()*10 + 1);
		
		int intensitaet = 50;
		
		color[spalte1][zeile1][farbe] = intensitaet;
		
		color[spalte2][zeile2][farbe] = intensitaet;
		
		color[spalte3][zeile3][farbe] = intensitaet;
		
		while(true){
		
		if(intensitaet < 120){
		
		while(intensitaet < 120){
			
			color[spalte2][zeile2][farbe] = intensitaet;
			
			color[spalte1][zeile1][farbe] = intensitaet;
			
			color[spalte3][zeile3][farbe] = intensitaet;
			
			controller.setColors(color);
			
			controller.sleep(25);
			
			controller.updateLedStripe();
			
			intensitaet = intensitaet + 20;
			
		}
		
		continue;
		
		}else{
			
			while(intensitaet > 30){
				
				if(intensitaet > 120){
					
					intensitaet = 120;
					
					continue;
					
				}else{
				
				color[spalte1][zeile1][farbe] = intensitaet;
				
				color[spalte2][zeile2][farbe] = intensitaet;
				
				color[spalte3][zeile3][farbe] = intensitaet;
				
				controller.setColors(color);
				
				controller.sleep(25);
				
				controller.updateLedStripe();
				
				intensitaet = intensitaet - 20;
				
				}
				
			}
			
			break;
			
		}
		
	}
		
        zaehltMit++;
		
		continue;
		
		}

		wischer(color);
		
		randomBlinker(color);
	
}
	
	protected static void wischer(int[][][] wischer){
		
		BoardController controller = BoardController.getBoardController();
		
//		wischer = new int[12][12][3];
		
        int intensitaet = 120;
		
		int counter = 0;
		
		int farbe = (int)(Math.random()*3-1);
		
		for(counter = 0; counter < wischer.length; counter++){
			
			if(counter == 0){
				
				for(int zaehler = 0; zaehler < wischer.length; zaehler++){
					
					wischer[counter][zaehler][0] = 0;
					
					wischer[counter][zaehler][1] = 0;
					
					wischer[counter][zaehler][farbe] = intensitaet;
					
				}
				
				controller.setColors(wischer);
				
				controller.sleep(60);
				
				controller.updateLedStripe();
				
				continue;
				
			}else{
			
			for(int zaehler = 0; zaehler < wischer.length; zaehler++){
			
				wischer[counter-1][zaehler][0] = 0;
				
				wischer[counter-1][zaehler][1] = 0;
				
				wischer[counter-1][zaehler][2] = 0;
				
				wischer[counter][zaehler][farbe] = intensitaet;
				
			
			}
			
			controller.setColors(wischer);
			
			controller.sleep(60);
			
			controller.updateLedStripe();
			
//			continue;
			
			}
		
		}
		
		for(int zaehler = 0; zaehler < wischer.length; zaehler++){
			
			wischer[counter-1][zaehler][0] = 0;
			
			wischer[counter-1][zaehler][1] = 0;
			
			wischer[counter-1][zaehler][farbe] = 0;
			
		}
		
		controller.setColors(wischer);
		
		controller.sleep(60);
		
		controller.updateLedStripe();
		
	}
		
}
	



