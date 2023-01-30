package java_switch_statement;

public class Enum_Switch_30jan2023 {
	enum Day {
		  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
		}
	public static void main(String[] args) {
		
			  Day day = Day.MONDAY;

			  switch(day) {
			    case MONDAY:
			      System.out.println("Monday");
			      break;
			    case TUESDAY:
			      System.out.println("Tuesday");
			      break;
			    case WEDNESDAY:
			      System.out.println("Wednesday");
			      break;
			    case THURSDAY:
			      System.out.println("Thursday");
			      break;
			    case FRIDAY:
			      System.out.println("Friday");
			      break;
			    case SATURDAY:
			      System.out.println("Saturday");
			      break;
			    case SUNDAY:
			      System.out.println("Sunday");
			      break;
			  }
			}

	}

