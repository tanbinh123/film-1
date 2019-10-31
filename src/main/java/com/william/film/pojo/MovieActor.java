package com.william.film.pojo;

public class MovieActor extends MovieActorKey {
	private Integer personRole;

	private String playRoleName;

	public Integer getPersonRole() {
		return personRole;
	}

	public void setPersonRole(Integer personRole) {
		this.personRole = personRole;
	}

	public String getPlayRoleName() {
		return playRoleName;
	}

	public void setPlayRoleName(String playRoleName) {
		this.playRoleName = playRoleName;
	}
}