package evm;

public class Balloting_unit {
	private Candidates candidate1;
	private Candidates candidate2;
	private Candidates candidate3;
	private Candidates candidate4;
	private Candidates candidate5;
	
	
	public Balloting_unit(Candidates candidate1, Candidates candidate2,
			Candidates candidate3, Candidates candidate4, Candidates candidate5) {
		super();
		this.candidate1 = candidate1;
		this.candidate2 = candidate2;
		this.candidate3 = candidate3;
		this.candidate4 = candidate4;
		this.candidate5 = candidate5;
	}
	
	public void castVote(int vote)
	    {
	        if (vote == 1)
	            candidate1.incrementVoteCount();
	        else if (vote == 2)
	            candidate2.incrementVoteCount();
	        else if (vote == 3)
	            candidate3.incrementVoteCount();
	        else if (vote == 4)
	        	candidate4.incrementVoteCount();
	        else if (vote == 5)
	        	candidate5.incrementVoteCount();
	    }

	public String reportResults(){
		findWinner();
		void compareWinner(Candidate candidate)

		
	}
	
	
	
	
}
