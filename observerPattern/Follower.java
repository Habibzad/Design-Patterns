package observerPattern;

public class Follower implements Observer {

	private String followerName;
	
	public Follower(String name) {
		this.followerName = name;
	}
	@Override
	public void update(String status) {
		System.out.println(status + " was updated");
	}
	
	public void play() {
		System.out.println(followerName + " is playing");
	}

}
