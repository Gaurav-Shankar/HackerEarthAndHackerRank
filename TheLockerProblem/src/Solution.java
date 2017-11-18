/*
 * There are 1,000 lockers in a school and they have been numbered from 1 through 1,000.
During recess (remember this is a fictional problem), the students decide to try an experiment. When recess is over each student will walk into the school one at a time. The first student will open all of the locker doors. The second student will close all of the locker doors with even numbers. The third student will change all of the locker doors that are multiples of 3 (change means closing lockers that are open, and opening lockers that are closed.) The fourth student will change the position of all locker doors numbered with multiples of four and so on.

After 1,000 students have entered the school, which locker doors will be open, and why?


You can compute using this website, not only the answer for this, but for any number of lockers and students. 
amazing isn't it.
http://www.ar09.hostei.com/problem.php
 */
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Students : ");
		int students = sc.nextInt();
		System.out.println("Enter Lockers : ");
		int lockers = sc.nextInt();
		int count =0;
		boolean status[] = new boolean[lockers];
		for(int i=0;i<students;i++)
		{
			for(int j=0;j<status.length;j++)
			{
				int mul = (i+1)*(j+1);
				if(mul>lockers)
				{
					continue;
				}
				if(mul<=lockers)
				{
					if(status[mul-1] == true)
					{
						status[mul-1] = false;
					}
					else if(status[mul-1] == false)
					{
						status[mul-1] = true;
					}
				}
			}
		}
		for(int i=0;i<status.length;i++)
		{
			if(status[i] == false)
			{
				count++;
			}
			else

			{

			}

		}
		System.out.println("Numbers of closed lockers  = " + count);
		System.out.println("Numbers of open lockers  = " + (lockers-count));
	}
}
