package com.lakedev.notes;

import java.time.LocalDate;
import java.time.LocalTime;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Note extends Stage
{
	private PrimaryUI parent;

	public Note(PrimaryUI parent)
	{
		this.parent = parent;
		
		VBox root = new VBox();
		
		MenuBar menuBar = new MenuBar();
		
		Menu menu = new Menu("File");
		
		MenuItem menuItem = new MenuItem("New Note");
		
		menuItem.setOnAction((selected) -> parent.addNewNote());
		
		menu.getItems().add(menuItem);
		
		menuBar.getMenus().add(menu);
		
		TextArea txtData = new TextArea();
		
		txtData.setWrapText(true);
		
		VBox.setVgrow(txtData, Priority.ALWAYS);
		
		root.getChildren().addAll(menuBar,txtData);
		
		setTitle(String.format("Note Created %s @ %s", LocalDate.now().toString(), LocalTime.now().toString()));
		
		setResizable(false);
		
		setAlwaysOnTop(true);
		
		setScene(new Scene(root, 200, 200));
		
		show();
	}
}
