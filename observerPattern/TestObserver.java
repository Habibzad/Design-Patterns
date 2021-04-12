package observerPattern;

public class TestObserver {
	public static void main(String args[]) {
        Channel channel1 = new Channel("Channel1");
        Follower follower1 = new Follower("Joe");
        channel1.registerObserver(follower1);
    }
}
