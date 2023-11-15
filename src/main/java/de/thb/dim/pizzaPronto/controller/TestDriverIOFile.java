package de.thb.dim.pizzaPronto.controller;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.JSONException;

import de.thb.dim.pizzaPronto.businessObjects.io.MenuImporter;
import de.thb.dim.pizzaPronto.valueObjects.MenuVO;




public class TestDriverIOFile {

	public static void main(String[] args) {

		MenuVO menu;
		MenuImporter importer = null;

		try {
			importer = new MenuImporter();
			menu = importer.readMenu("./test/myLittleTestMenu.json");
			System.out.println(menu.toString());
		} catch (FileNotFoundException e1) {
			System.err.println("File not found: " + e1.getMessage());
			e1.printStackTrace();
		} catch (IOException e1) {
		System.err.println("File not found");
		e1.printStackTrace();
		} catch (JSONException e1) {
			System.err.println("JSONException");
			e1.printStackTrace();
	}
	}
}
