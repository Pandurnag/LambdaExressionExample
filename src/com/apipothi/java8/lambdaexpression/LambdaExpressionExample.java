package com.apipothi.java8.lambdaexpression;

public class LambdaExpressionExample {
	
	public static void main(String[] args) {
		
		String myPlaylist="JAVA 8";
		//LambdaExpressionExample example=new LambdaExpressionExample();
		//example.getPlaylistName(myPlaylist);
		
		MyPlaylist playlist= (String playlistname) -> {
			System.out.println("API POTHI PLAY LIST NAME IS - "+playlistname);
			return playlistname;
	};
	
	
	playlist.getPlaylistName(myPlaylist);
	
	 
	}

	/*

	@Override
	public String getPlaylistName(String playlistname) {
	System.out.println("API POTHI PLAY LIST NAME IS - "+playlistname);
	return playlistname;
    */
	}	
