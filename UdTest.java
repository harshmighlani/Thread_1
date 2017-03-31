package com.fil.test.thread;

import java.util.Scanner;

public class UdTest {

	public static void main(String[] args) {
		Mythread th = new Mythread();
		th.start();
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		th.shutdown();
	}

}

class Mythread extends Thread {
	private volatile  boolean running = true;

	public void run() {
		while (running) {
			System.out.println("...");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void shutdown() {
		running = false;
	}
}
