package MeinProjekt;

import ledControl.BoardController;

public class wanderndeArrays {

	public static void main(String[] args) {
		
		while(true){

		BoardController controller = BoardController.getBoardController();
		
		int[][][] farbe = new int[12][12][3];
		
		for(int i = 2; i < 6; i++){
			
			farbe[0][i][1] = 80;
			
		}
		
		controller.setColors(farbe);
		
		controller.updateLedStripe();
		
		int zaehler = 1;
		
		int i = 2;
		
		while(zaehler < farbe[i].length){
			
			for(int j = 2; j < 6; j++){
				
				farbe[zaehler][j][1] = 80;
				
				farbe[zaehler -1][j][1] = 0;
				
			}
			
			zaehler++;
			
			controller.setColors(farbe);
			
			controller.sleep(20);
			
			controller.updateLedStripe();
			
		}
		
		farbe[11][5][1] = 80;
		
		controller.setColors(farbe);
		
		controller.updateLedStripe();
		
		int counter = 5;
		
		int count = 11;
		
		while(counter > 1){
	
	for(count = 11; -1 < count ; count--){
		
		if(count == 11){
			
			continue;
			
	    }else{
		
		farbe[count][counter][1] = 80;
		
		farbe[count + 1][counter][1] = 0;
		
		controller.setColors(farbe);
		
		controller.updateLedStripe();
				
	}
		
	}
	
	count = 11;
	
	counter--;
	
	}
		
		int count2 = 4;//4 und 3 muss erreicht werden! also count2 - 1!
		
		for(int j = 0; j < 6; j++){
			
			if(j == 0){
				
				continue;
				
			}else{
				
			farbe[j][count2][1] = 80;
			
			farbe[j][count2 - 1][1] = 80;
			
			farbe[j - 1][count2][1] = 0;
			
			farbe[j - 1][count2 - 1][1] = 0;
			
			controller.setColors(farbe);
			
			controller.updateLedStripe();
			
			}
			
		}
		
		for(int zaehl = count2; zaehl < farbe.length; zaehl++){
			
			if(zaehl == count2){
				
				continue;
				
			}else{
				
				farbe[5][zaehl][1] = 80;
				
				farbe[5][zaehl - 1][1] = 0;
				
				controller.setColors(farbe);
				
				controller.updateLedStripe();
				
			}
			
		}
		
         for(int zaehl = 11; zaehl > count2 - 1; zaehl--){
			
			if(zaehl == 11){
				
				continue;
				
			}else{
				
				farbe[5][zaehl][1] = 80;
				
				farbe[5][zaehl + 1][1] = 0;
				
				controller.setColors(farbe);
				
				controller.updateLedStripe();
				
			}
			
		}
         
         counter = 4;
         
         for(int zaehl2 = 5; zaehl2 > -1; zaehl2--){
        	 
        	 if(zaehl2 == 5){
        		 
        		 continue;
        		 
        	 }else{
        		 
        		 farbe[zaehl2][counter][1] = 80;
        		 
        		 farbe[zaehl2][counter - 1][1] = 80;
        		 
        		 farbe[zaehl2 + 1][counter][1] = 0;
        		 
        		 farbe[zaehl2 + 1][counter - 1][1] = 0;
        		 
        		 controller.setColors(farbe);
        		 
        		 controller.updateLedStripe();
        		 
        	 }
        	 
         }
         
	}
	
	}

}




