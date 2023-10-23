package java_class;

public class WatchShowRoom {

	Sonata getsonata() {
		Sonata s1=new Sonata();
		return s1;
	}
	
	FastTrack getfast() {
		FastTrack f1=new FastTrack();
		return f1;
	}
	
	public static void main(String[] args) {
		WatchShowRoom w1=new WatchShowRoom();
		Sonata s=w1.getsonata();
		System.out.println(s);
		FastTrack f=w1.getfast();
		System.out.println(f);
	}
}
