package _07_Meeting_Scheduler;

import java.util.ArrayList;
import java.util.HashMap;

public class MeetingScheduler {
    /*
     * Your task is to code a method to find a meeting time for two people
     * given their schedules.
     * 
     * Code the method below so that it returns a Schedule object that contains
     * all the times during the week that are in BOTH people's schedules. The
     * Schedule class is included in this package.
     * 
     * Example:
     * person1 availability - Monday at 9, Tuesday at 14, and Friday 10
     * person2 availability - Tuesday at 14, Friday 8, and Monday at 9
     * The returned HashMap should contain: Tuesday 14 and Monday 9
     * 
     * The returned Schedule object represents the times both people are
     * available for a meeting.
     * 
     * Time availability is always at the top of the hour, so 9:30 is not valid
     * Time availability always represents 1 hour
     * Assume both schedules are in the same time zones
     */
    public static Schedule getMutualAvailability(Schedule person1, Schedule person2) {
    	
    	HashMap<String, ArrayList<Integer>> pone = person1.getSchedule();
    	HashMap<String, ArrayList<Integer>> ptwo = person2.getSchedule();
    	Schedule meet = new Schedule();
    	
    	ArrayList<String> days = new ArrayList<String>();
    	days.add("Monday");
    	days.add("Tuesday");
    	days.add("Wednesday");
    	days.add("Thursday");
    	days.add("Friday");
    	days.add("Saturday");
    	days.add("Sunday");
    		
    	for(int i=0;i<7;i++) {
    		ArrayList<Integer> day = pone.get(days.get(i));
    		ArrayList<Integer> day2 = ptwo.get(days.get(i));
    		    	
    		System.out.println(day);
    		System.out.println("");
    		
    		for(int j=0;j<3;j++) {
    			if(day.get(j) == day2.get(j)) {
    				meet.addAvailability(days.get(i), day.get(0));
    			}
    		}
    		
    	}
    	
        return meet;
    }
}