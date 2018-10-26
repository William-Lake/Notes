package com.lakedev.notes;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.stage.Stage;

public class PrimaryUI extends Application
{

	public static void main(String[] args)
	{
		launch(args);
	}
	
	private List<Note> notes;

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		addNewNote();
	}
	
	public void addNewNote()
	{
		if (notes == null) notes = new ArrayList<>();
		
		notes.add(new Note(this));
	}

}
