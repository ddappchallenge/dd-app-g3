package com.ddth.challenge.shtp.model;

import java.util.ArrayList;

public class ResponseMessage {
	private String message;
	private String status;
	private String date;
	private ArrayList<String> nodes = new ArrayList<String>();
	private ArrayList<Object> edges = new ArrayList<Object>();

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setNodes(ArrayList<String> nodes) {
		this.nodes = nodes;
	}

	public void setEdges(ArrayList<Object> edges) {
		this.edges = edges;
	}

	public String getDate() {
		return date;
	}

	public String getMessage() {
		return message;
	}

	public String getStatus() {
		return status;
	}

	public ArrayList<String> getNodes() {
		return nodes;
	}

	public ArrayList<String> getEdges() {
		return edges;
	}
}
