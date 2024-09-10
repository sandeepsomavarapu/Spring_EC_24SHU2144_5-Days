package com.ericsson.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class BufferedReaderEx {
	public static void main(String args[]) throws IOException {
		FileReader fr = new FileReader("ericsson.txt");
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}
}

/*
 * take the input from user like username and password and check weather that
 * uname and pwd present in file(one user info) or not if it present login
 * success other wise failure.....
 */
