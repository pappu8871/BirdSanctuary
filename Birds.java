package com.bridgelabz.birdsanctuary;

enum Colour {
	BLACK, WHITE, BlACK_WHITE, GREEN	
}
public abstract class Birds {
	String  id;
	Colour colour;

	static int totalCount;
	public abstract  void incrementCount();
	public abstract void decrementConut();

	public abstract void  eat();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + totalCount;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Birds other = (Birds) obj;
		if (totalCount != other.totalCount)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}




