package fp.hotel;

import java.time.LocalDate;

public class Hotel {
	
	public static Temporada calculaTemporada (LocalDate a) {
		 Temporada temporada;
		switch(a.getMonthValue()) {
        case 7: case 8: case 9:               
        	temporada = Temporada.ALTA;
            break;
        case 5: case 6: case 10:              
        	temporada = Temporada.MEDIA;
            break;
        default:             
        	temporada = Temporada.BAJA;
            break;
		
		}return temporada;
		
	}

}
