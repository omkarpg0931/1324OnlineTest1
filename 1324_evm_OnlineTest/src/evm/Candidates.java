package evm;

import java.util.ArrayList;

public class Candidates {
	private String name;
	private int votes;

	

	public Candidates(String name) {
		super();
		this.name = name;
		votes=0;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void incrementVoteCount()
	{
		votes++;
	}
	
	public int getNumberOfVotes()
	{
		return votes;
	}
	
	public String getName() {
		return name;
	}

}
