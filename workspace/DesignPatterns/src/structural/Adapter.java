package structural;

public class Adapter {

	public static void main(String[] args) {
		
		FilmStar TonyStark = new FilmStar();
		Fans Richard = new EnglishFans();
		Fans Sakura = new JapaneseFans(); 
		
		Richard.askAutograph();
		TonyStark.sign(Richard);
		
		Sakura.askAutograph();
		TonyStark.sign(Sakura);
		
	}
}

abstract class Fans{

 String lang;	
 abstract void askAutograph();
	
}

class JapaneseFans extends Fans{

	public JapaneseFans() {
		this.lang = "Japanese";
		// TODO Auto-generated constructor stub
	}
	@Override
	public void askAutograph() {
	
		System.out.println("Watashi ni sain o shite kudasai ataemasu");
		
	}
		
}

class EnglishFans extends Fans{

	public EnglishFans() {
		this.lang = "English";
		// TODO Auto-generated constructor stub
	}
	@Override
	public void askAutograph() {
	
		System.out.println("Give me your autograph please");
		
	}
		
}

class StarAdapter extends FilmStar{

	JapaneseFans japanFan;
	public void sign(Fans japanFan) {
		
		System.out.println("Converting to English for you now Sir!");
		System.out.println("Okay..now I understand..Giving autograph now..'le chaat bsdk.'");
		
	}
	
}

class FilmStar{
	
	String name;
	StarAdapter starAdapter ;
	public void sign(Fans fan) {
		
	if(fan.lang == "English") {   
	System.out.println("Have a good day, be well.");
	}
	else {
		starAdapter = new StarAdapter();
		starAdapter.sign(fan);
		//starAdapter.
	    	
	}
  }
	
	
}