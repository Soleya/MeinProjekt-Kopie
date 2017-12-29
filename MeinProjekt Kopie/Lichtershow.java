package MeinProjekt;

import ledControl.BoardController;

public class Lichtershow {

	public static void main(String[] args) {
        
		BoardController controller = BoardController.getBoardController();
		
		int[][][] color = new int[12][12][3];
		
		int zeile = 0;
		
		int spalte = 0;
		
		int farbe = 0;
		
		color[spalte][zeile][farbe] = 80;
		
		controller.setColors(color);
		
		controller.updateLedStripe();
		
		int zaehler = 12;
		
		while(zaehler > 8){
			
			if(zeile < zaehler){
				
				if(zeile == 0){
					
				color[spalte][zeile][farbe] = 80;
				
				controller.setColors(color);
				
				controller.updateLedStripe();
				
				zeile++;
				
				}else{
					
					color[spalte][zeile - 1][farbe] = 0;
					
					color[spalte][zeile][farbe] = 80;
					
					controller.setColors(color);
					
					controller.updateLedStripe();
					
					zeile++;
					
				}
				
			}else{
				
				zaehler --;
				
				zeile = 0;
				
//				if(zaehler == 8){
//					
//					break;
//					
//				}
				
			}
			
		}//Hier endet die while Schleife! Nun stehen unten 4 Punkte!
		
		controller.sleep(100);
		
		zaehler = 5;
		
		int count = zeile;
		
		int geheRechts = 1;
		
		while(geheRechts < zaehler){
			
			while(count < 12){
					
					color[geheRechts][count][farbe] = 80;
					
					color[geheRechts - 1][count][farbe] = 0;
					
//					for(int j = 0; j < zeile; j++){
//						
//						color[geheRechts][j][farbe] = 0;
//						
//					}
					
					count++;
				
			}
			
			for(int j = 0; j < 8; j++){
				
				color[geheRechts][j][farbe] = 0;
				
			}
			
			controller.setColors(color);
			
			controller.updateLedStripe();
			
			geheRechts++;
			
			count = zeile;
			
		}
		
    }
	
}
