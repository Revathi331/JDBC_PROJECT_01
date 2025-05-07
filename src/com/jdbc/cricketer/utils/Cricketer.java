package com.jdbc.cricketer.utils;

public class Cricketer {
	int cid,age,matches,runs,wickets,catches,mom;
	String cname,country;
	double avg;
	public Cricketer( int age, int matches, int runs, int wickets, int catches, int mom, String cname,
			String country, double avg) {
		super();
		this.age = age; 
		this.matches = matches;
		this.runs = runs;
		this.wickets = wickets;
		this.catches = catches;
		this.mom = mom;
		this.cname = cname;
		this.country = country;
		this.avg = avg;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getCatches() {
		return catches;
	}
	public void setCatches(int catches) {
		this.catches = catches;
	}
	public int getMom() {
		return mom;
	}
	public void setMom(int mom) {
		this.mom = mom;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
}
