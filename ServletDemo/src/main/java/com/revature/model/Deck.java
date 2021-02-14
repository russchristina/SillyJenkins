package com.revature.model;

public class Deck {

	private int id;
	private int player_id;

	public Deck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Deck(int id, int player_id) {
		super();
		this.id = id;
		this.player_id = player_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + player_id;
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
		Deck other = (Deck) obj;
		if (id != other.id)
			return false;
		if (player_id != other.player_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Deck [id=" + id + ", player_id=" + player_id + "]";
	}

}
