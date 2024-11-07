/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyD.gui;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class KeyGenerator2 {
    Random rr = new Random();

	public String getKeys() {
		String str = "";
		str = String.valueOf(rr.nextInt(10)) 
		+ String.valueOf((char)(rr.nextInt(26)+'a'))
		+ String.valueOf(rr.nextInt(10))
		+ String.valueOf((char)(rr.nextInt(26)+'a'))
		+ String.valueOf(rr.nextInt(10))
		+ String.valueOf((char)(rr.nextInt(26)+'a'))
		+ String.valueOf(rr.nextInt(10))
		+ String.valueOf((char)(rr.nextInt(26)+'a'))
		+ String.valueOf(rr.nextInt(10))
		+ String.valueOf((char)(rr.nextInt(26)+'a'))
		+ String.valueOf(rr.nextInt(10))
		+ String.valueOf((char)(rr.nextInt(26)+'a'))
		+ String.valueOf(rr.nextInt(10))
		+ String.valueOf((char)(rr.nextInt(26)+'a'))
		+ String.valueOf(rr.nextInt(10))
		+ String.valueOf((char)(rr.nextInt(26)+'a'))
		+ String.valueOf(rr.nextInt(10))
		+ String.valueOf((char)(rr.nextInt(26)+'a'))
		+ String.valueOf(rr.nextInt(10))
		+ String.valueOf((char)(rr.nextInt(26)+'a'))
		+ String.valueOf(rr.nextInt(10))
		+ String.valueOf((char)(rr.nextInt(26)+'a'))
		+ String.valueOf(rr.nextInt(10))
		+ String.valueOf((char)(rr.nextInt(26)+'a'))
		+ String.valueOf(rr.nextInt(10))
		+ String.valueOf((char)(rr.nextInt(26)+'a'))
		+ String.valueOf(rr.nextInt(10))
		+ String.valueOf((char)(rr.nextInt(26)+'a'))
		+ String.valueOf(rr.nextInt(10))
		+ String.valueOf((char)(rr.nextInt(26)+'a'))
		+ String.valueOf(rr.nextInt(10))
		+ String.valueOf((char)(rr.nextInt(26)+'a'));

		return str;
	}
	public static void main(String args[]) {

		KeyGenerator2 Generator = new KeyGenerator2();

		System.out.println(Generator.getKeys());
	}   
}
