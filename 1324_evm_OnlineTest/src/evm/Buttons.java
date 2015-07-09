package evm;

import java.util.Scanner;

public class Buttons {

	private Scanner keyboard;
	private Balloting_unit ballot;
    private String votingMessage;

    public Buttons(){
    	keyboard = new Scanner(System.in);
    }
    
    public void vote_menu(){
    	int entry=-1;
    	while(entry !=0){
    		display_vote_menu();
    		entry=getVoterEntry();
    		execute(entry);
    	}
    }

	private void display_vote_menu() {
		// TODO Auto-generated method stub
		System.out.println("Candidate Name"+"\t\t"+"Button\n");
		System.out.println("Anish Joshi"+"\t\t"+"Press 1");
		System.out.println("Vaibhav Vainginkar"+"\t\t"+"Press 2");
		System.out.println("Siddhesh Bhagat"+"\t"+"Press 3");
		System.out.println("Vishal Kinjavdekar"+"\t"+"Press 4");
		System.out.println("Jarret Fernandes"+"\t"+"Press 5\n\n\n\n\n\n");
		System.out.println("To Close"+"\t"+"Press 0");
	}
	
	
	
	
	
	private void execute(int entry) {
		// TODO Auto-generated method stub
		if(entry==1){
			candidate1.increment_vote_count();
		}
		
		else if(entry==2){
			candidate2.increment_vote_count();
		}
		
		else if(entry==3){
			candidate3.increment_vote_count();
		}
		
		else if(entry==4){
			candidate4.increment_vote_count();
		}
		
		else if(entry==5){
			candidate5.increment_vote_count();
		}
		
		else if(entry==0){
			System.out.println("Thank You!! Voting Closed");
		}
		
		else
		{
			System.out.println("Unknown Command");
            Candidates.castVote();
		}
		
	}

	private int getVoterEntry() {
		// TODO Auto-generated method stub
		return 0;
	}

}
