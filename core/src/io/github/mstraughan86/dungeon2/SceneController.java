package io.github.mstraughan86.dungeon2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public enum SceneController {
	INSTANCE;
	
	Stage currentStage;
	Stage previousStage;
	//TO ADD: maybe add universal scenes... such as pause menu, escape menu, overlay menu?
	
	private SceneController() {
		//temp code.
		currentStage = new Stage(new ScreenViewport());
		Gdx.input.setInputProcessor(currentStage);
	}
	
	public Stage getStage() {
		return currentStage;
	}
	
	public void setStage(Stage stage) {
		previousStage = currentStage;
		currentStage = stage;
		Gdx.input.setInputProcessor(currentStage);
	}
}
