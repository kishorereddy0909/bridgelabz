package com.bridgelabz.inventorymangement;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

public interface InventoryDAO {
	
	public void addInventory(String item);

	public void writeInventory(String item, String itemName, double itemWeight, double itemPrice)
			throws IOException, ParseException;

	public double readInventory(String item) throws IOException, ParseException;

	public double calItem(JSONArray array);

}
