package dk.mide.fas.cmnightlies.model;

public class Change implements ListItem {
	public int id;
	public String last_updated;
	public String project;
	public String subject;
	public boolean isSection(){
		return false;
	}
	
}
