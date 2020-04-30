package clases;

public abstract class MiembroUPV extends Persona{

	public String carnet;

	
	
	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	
	public abstract void menuIntranet();
	
}
