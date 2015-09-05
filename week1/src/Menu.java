import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Menu {
	private Scanner input = new Scanner(System.in);
	private Map<String, String> students = new TreeMap<String, String>();
	private boolean end = false;


	public Menu(){
		promtUser();
	}
	
	
	
	private void showOptions(){
		System.out.println("-----------------------------");
		System.out.println("option 1 = end");
		System.out.println("-----------------------------");
		System.out.println("option 2 = add student");
		System.out.println("-----------------------------");
		System.out.println("option 3 = change grade");
		System.out.println("-----------------------------");
		System.out.println("option 4 = remove student");
		System.out.println("-----------------------------");
		System.out.println("option 5 = show all grades");
		System.out.println("-----------------------------");
		System.out.println("\n\n");
	}
	private int getOption(){
		System.out.print("option: ");
		return input.nextInt();
	}
	private String getName(){
		System.out.print("name student: ");
		return input.next();
	}
	private String getGrade(){
		System.out.print("grade: ");
		return input.next();
	}
	private void promtUser(){
		while(!end){
			showOptions();
			int option = getOption();
			if (option == 1){
				end = true;
			} else if(option == 2){
				addStudent();
			} else if(option == 3){
				changeGrade();
			} else if(option == 4){
				removeStudent();
			} else if(option == 5){
				showAll();
			}
		}
		
		
	}
	private void addStudent(){
		String name = getName();
		String grade = getGrade();
		students.put(name, grade);
	}
	private void showAll(){
		for(String st : students.keySet()){
			System.out.println(st + " " + students.get(st));
		}
	}
	private void removeStudent(){
		students.remove(getName());
	}
	private void changeGrade(){
		students.put(getName(), getGrade());
	}

}
