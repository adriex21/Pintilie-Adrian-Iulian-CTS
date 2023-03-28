package ro.acs.prototype;

public class Client implements AbstractPrototype {
	
	private String clientName;
	private String phoneNumber;
	private String email;
	
	private Client() {
		
	}
	

	public Client(String clientName, String phoneNumber, String email) {
		
		if(clientName.length() >= 3) {
			this.clientName = clientName;
		}
		else {
			throw new IllegalArgumentException();
		}
		
		this.phoneNumber = phoneNumber;
		
		if(email.contains("@")) {
			this.email = email;
		} else {
			throw new IllegalArgumentException();
		}
		
	}

	public AbstractPrototype createADeepCopy() {
		Client client = new Client();
		client.clientName = this.clientName;
		client.phoneNumber = this.phoneNumber;
		client.email = this.email;
		return (AbstractPrototype)client;
	}
	@Override
	public AbstractPrototype createACopy() throws CloneNotSupportedException {
		return (AbstractPrototype)this.clone();
	}


	@Override
	public String toString() {
		return "Client [clientName=" + clientName + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	
	
	
}
