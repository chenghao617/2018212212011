package java;

public class TestTV {
	public static void main(String[] args) {
		TV tv1= new TV();
		tv1.turn0n();
		tv1.setChannel(30);
		tv1.setVolume(3);
		
		TV tv2=new TV();
		tv2.turn0n();
		tv2.channe1Up();
		tv2.channe1Up();
		tv2.volumeUp();
		
		System.out.println("tv1's channel is "+tv1.channel+"and volume level is "+tv1.volumeLevel);
		System.out.println("tv2's channel is "+tv2.channel+"and volume level is "+tv2.volumeLevel);
		
	}

}
