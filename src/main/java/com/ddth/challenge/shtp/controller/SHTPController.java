package com.ddth.challenge.shtp.controller;

import com.ddth.challenge.shtp.algorithm.ShortestPath;
import com.ddth.challenge.shtp.model.ResponseMessage;

import org.json.JSONArray;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class SHTPController {

	private static String lastestMessage = "Hello World";
	private int cost;
	private int distance;
	private int allCost;

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/hello")
	public ResponseMessage helloGet() {
		ResponseMessage hm = new ResponseMessage();
		hm.setMessage(lastestMessage);
		hm.setStatus("OK");
		hm.setDate("01/01/0101");
		return hm;
	}

	@PostMapping(value = "/set-hello-message")
	public HttpStatus setResponseMessage(@RequestParam ResponseMessage message) {
		// lastestMessage = message.getMessage();
		return HttpStatus.OK;
	}

	@GetMapping(value = "short")
	public String ShortestPath() {
		ShortestPath a = new ShortestPath();
		return "Just a sample";
	}

	@GetMapping(value = "/graph/shortestPath")
	public ResponseMessage shortestPath() {
		ResponseMessage shtp = new ResponseMessage();
		return shtp;
	}

	@PostMapping(value = "/graph")
	public HttpStatus setGraph(@RequestBody JSONArray g) {
		ResponseMessage graph = new ResponseMessage();
		for (int i = 0; i < g.length(); i++) {
			graph.setNodes(g.getJSONObject(i).getString("name"));
		}
		return HttpStatus.OK;
	}

	public int findCost(Object g)) {
		cost = g.cost();
		return cost;
	}

	public int findDistance(Object g)) {
		distance = g.distance();
		return distance;
	}

	public int path(String from, String to) {
		for (int i = 0; i < edge.size(); i++) {
			if (/* check from equal */edge.get(i).equals(from) &&
			/* check to equal */edge.get(i).equals(to)) {
				distance = getDistance(edge.get(i));
				allCost = findCost(edge.get(i)) * findDistance(edge.get(i));
			}
		}
	}
}
