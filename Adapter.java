

public class Adapter extends Robot implements Spieler{


	public int geheNachLinks(int a) {
		
		double xPosition = getX();
		xPosition -= a;
		return (int) xPosition;
	}


	public int geheNachRechts(int a) {
		double xPosition = getX();
		xPosition += a;
		return (int) xPosition;
	}


	public int geheNachOben(int a) {
		double yPosition = getY();
		yPosition += a;
		return (int) yPosition;
	}


	public int geheNachUnten(int a) {
		double yPosition = getY();
		yPosition -= a;
		return (int) yPosition;
	}
	
	  public static void main(String[] args){

		  Adapter Hans = new Adapter(); //Statt Robot legt man den Adapter an, welcher als übersetzter von Robot dient.
		  System.out.println(Hans.geheNachOben(6));
	}

}

