package MeetingRoom_num_1931;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int finaltime = 0;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int meetingcount = sc.nextInt();
		
		ArrayList<Time> list = new ArrayList<Time>();
		
		for(int i = 0; i < meetingcount; i++) {
			int start = sc.nextInt();
			int finish = sc.nextInt();
			list.add(new Time(start, finish));
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < meetingcount; i++) {
			if(finaltime <= list.get(i).getStartTime()) {
				result++;
				finaltime = list.get(i).getFinishTime();
			}
		}
		
		System.out.println(result);		
	}	
}
