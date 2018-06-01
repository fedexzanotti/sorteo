

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] grupo1 = {"Palmeiras","Gremio","Libertad (P)","River Plate","Cruzeiro","Corinthians","Atl. Nacional","Santos"};
		String[] grupo2 = {"Cerro Porteño","Racing Club","Flamengo","Independiente","Atl Tucuman","Boca Juniors","Estudiantes (LP)","Colo Colo"};
		
		String[] grupo1m ={};
		String[] grupo2m ={};
		
		ArrayMezclado grupo = new ArrayMezclado();

	    
	    System.out.println("Cruces por sorteo"); 
	    
	    grupo1m = grupo1;
	    grupo2m = grupo2;
	    	  
		
	    grupo.mezclaArray(grupo2m);
	    grupo.mezclaArray(grupo1m);
	    
		    
		for (int y=0; y<8 ;y++){
			 System.out.println((y+1) + " " + grupo1m[y] + " vs " + grupo2m[y]);
			 };
	   
	    }
	    

	

}
