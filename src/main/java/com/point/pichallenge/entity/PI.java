package com.point.pichallenge.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PI {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "descricao", length = 50, nullable = false)
	private String descricao;

	@Column(name = "cordX", nullable = false)
	private int cordX;

	@Column(name = "cordY", nullable = false)
	private int cordY;

	@Column(name = "cordCalculated", nullable = false)
	private int cordCalculated;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCordX() {
		return cordX;
	}

	public void setCordX(int cordX) {
		this.cordX = cordX;
	}

	public int getCordY() {
		return cordY;
	}

	public void setCordY(int cordY) {
		this.cordY = cordY;
	}

	public int getCordCalculated(int x,int y) {
		int cordCalculated = (int) (Math.pow(x, 2) + Math.pow(y, 2));

		
		return (int) Math.sqrt(cordCalculated);

	}

	public int getCordCalculated() {
		return cordCalculated;
	}

	public void setCordCalculated(int cordCalculated) {
		this.cordCalculated = cordCalculated;
	}

}
