package com.comviva.day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStoreAndRetrieve {
	private static void storeDevice(Devices device) throws IOException {
		File file = new File("devices.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(device);
		System.out.println("Object stored");

		oos.close();
	}

	private static Devices getDevice() throws IOException,
			ClassNotFoundException {
		File file = new File("devices.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Devices dev = new Devices();
		dev = (Devices) ois.readObject();
		//Devices dev = (Devices) ois.readObject();
		
		ois.close();
		return dev;
	}

	public static void main(String[] args) {
		try {
			storeDevice(new Devices(102, "Monitor", 40000));
			System.out.println(getDevice());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
