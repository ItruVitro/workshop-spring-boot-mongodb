package com.itruvitro.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String text;
	private Date date;
	private AuthorDTO author;

	public CommentDTO() {
	}

	public CommentDTO(String text, Date dat, AuthorDTO author) {
		super();
		this.text = text;
		this.date = dat;
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDat() {
		return date;
	}

	public void setDat(Date dat) {
		this.date = dat;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}

}
