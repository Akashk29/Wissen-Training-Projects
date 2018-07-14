package structural;

public class Proxy_Ex {

	public static void main(String[] args) {
        
		Security s = new Security();
		Logging l = new Logging();
		NexWave n = new NexWave();
		
		Proxy p = new Proxy(s, l, n);
		p.getIn();
	}

}

class NexWave {

	public void getTraining() {

		System.out.println("getiing trained..");
	}

}	

class Security {

	public void doSec() {

		System.out.println("security..");
	}

}

class Logging {

	public void doLog() {

		System.out.println("logging..");
	}

}	
class Proxy{
    	
	    private Security security;
	    private Logging logging;
        private NexWave nexwave;
        
        Proxy(Security security, Logging logging, NexWave nexwave){
        	 this.security = security;
        	 this.logging = logging;
        	 this.nexwave = nexwave;
        }
        
        public void getIn() {
        	
        	security.doSec();
        	logging.doLog();
        	nexwave.getTraining();
        	logging.doLog();
       	 	
        }
}		

