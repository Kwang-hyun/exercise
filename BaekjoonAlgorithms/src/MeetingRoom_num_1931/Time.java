package MeetingRoom_num_1931;

public class Time implements Comparable<Time>{
	
	private int startTime = 0;
	private int finishTime = 0;
	
	Time(int start, int finish) {
		startTime = start;
		finishTime = finish;
	}

	@Override
	public int compareTo(Time o) {

		if( this.finishTime == o.finishTime) {
			return this.startTime - o.startTime;
		}
		else {
			return this.finishTime - o.finishTime;
		}
	}
	
	public int getStartTime() {
		return startTime;
	}
	
	public int getFinishTime() {
		return finishTime;
	}

}
