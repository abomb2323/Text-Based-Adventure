package main;

import main.io.*;

/**
 * Main class for the Text Based Adventure Game, where it all comes together
 * This is where we'll take the various parts from all over and use them to construct the game.
 * 
 * @author Adam Crick
 * @version 0.0.1:1
 * 
 * 
 */
public class Game {
	
	/**
	 * Version ID, Release.Major.Minor:Build 
	 * Must be same throughout all clients.
	 */
	private static final String versionID = "0.0.1:1";
	
	public static void main(String[] args){
		ConsoleScreen console = new ConsoleScreen("Text Based Adventure v" + versionID, 880, 600);
		
		
	}
	
}
