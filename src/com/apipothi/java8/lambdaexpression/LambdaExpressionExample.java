package com.apipothi.java8.lambdaexpression;

public class LambdaExpressionExample implements MyPlaylist{
	
	public static void main(String[] args) {
		
		String mychennal="API POTHI";
		int count=9;
		LambdaExpressionExample example=new LambdaExpressionExample();
		
		example.getPlaylistCount(mychennal, count);
	}

	@Override
	public int getPlaylistCount(String chennalName, int Count) {
		System.out.println("My Chennal Name is -"+chennalName+"Conatin "+Count+"number of playlist");
		return Count;
	}
}
		
	
