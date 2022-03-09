package fp.hotel;


public class Hotel {
	
	public static Temporada calculaTemporada (String a) {
		 Temporada temporada;
		switch(a) {
        case "dd/07/yyyy": case "dd/08/yyyy": case "dd/09/yyyy":               
        	temporada = Temporada.ALTA;
            break;
        case "dd/05/yyyy": case "dd/06/yyyy": case "dd/10/yyyy":              
        	temporada = Temporada.MEDIA;
            break;
        default:             
        	temporada = Temporada.BAJA;
            break;
		
		}return temporada;
		
	}

}
