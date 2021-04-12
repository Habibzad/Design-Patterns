package observerPattern;

import java.util.ArrayList;


public class Channel implements Subject {

	private ArrayList<Observer> observers;
	private String channelName;
	private String status;

	
	public Channel(String name) {
		observers = new ArrayList<Observer>();
		this.channelName = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);

	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update("delete");
			}
	}
}
