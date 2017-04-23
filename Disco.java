package unlam.edu.ar.pg2;

public class Disco {

	private Double radioInterior;
	private Double radioExterior;
	
	
	public Disco(Double radioInterior,Double radioExterior){
		
		this.radioInterior=radioInterior;
		this.radioExterior=radioExterior;
		
	}
	
	public Double calcularPerimetroInterior(){
		
		Double perimetroInterior;
		perimetroInterior=2*Math.PI*radioInterior;
		return perimetroInterior;
		
	}
	
	public Double calcularPerimetroExterior(){
		
		Double perimetroExterior;
		perimetroExterior=2*Math.PI*radioExterior;
		return perimetroExterior;
		
	}
	
	public Double calcularSuperficieTotalDeUnDisco(){
		
		Double superficieRadioInterior;
		Double superficieRadioExterior;
		Double superficieDeUnDisco;
		superficieRadioInterior=Math.PI*(Math.pow(radioInterior, radioInterior));
		superficieRadioExterior=Math.PI*(Math.pow(radioExterior, radioExterior));
		superficieDeUnDisco=superficieRadioExterior-superficieRadioInterior;
		return superficieDeUnDisco;
		
	}
}
