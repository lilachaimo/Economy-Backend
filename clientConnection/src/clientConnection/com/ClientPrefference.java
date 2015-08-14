package clientConnection.com;

public class ClientPrefference {
	
	
	private final int DEFAULT_VALUE = 1;
	private double socialParameter =DEFAULT_VALUE;
	private double envirmentParameter = DEFAULT_VALUE;
	private double govermentalCoperation = DEFAULT_VALUE;
	
	
	


	public ClientPrefference(double socialParameter, double envirmentParameter,
			double govermentalCoperation) {
		
		this.socialParameter = socialParameter;
		this.envirmentParameter = envirmentParameter;
		this.govermentalCoperation = govermentalCoperation;
	}

	
	public ClientPrefference(double socialParameter, double envirmentParameter) {
		
		this.socialParameter = socialParameter;
		this.envirmentParameter = envirmentParameter;
	}

	

	public double getSocialParameter() {
		return socialParameter;
	}


	public void setSocialParameter(double socialParameter) {
		this.socialParameter = socialParameter;
	}


	public double getEnvirmentParameter() {
		return envirmentParameter;
	}


	public void setEnvirmentParameter(double envirmentParameter) {
		this.envirmentParameter = envirmentParameter;
	}


	public double getGovermentalCoperation() {
		return govermentalCoperation;
	}


	public void setGovermentalCoperation(double govermentalCoperation) {
		this.govermentalCoperation = govermentalCoperation;
	}
	
	

}
