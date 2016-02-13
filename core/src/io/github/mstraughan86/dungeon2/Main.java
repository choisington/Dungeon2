package io.github.mstraughan86.dungeon2;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class Main extends ApplicationAdapter {
	Stage stage;
	
	//called when application begins
	@Override
	public void create () {
		
		//stage = new Stage(new ScreenViewport());
		
		//abstract input handling into the stage
		//Gdx.input.setInputProcessor(stage);
	}
	
	//resizing the window.
	public void resize (int width, int height) {
		SceneController.INSTANCE.getStage().getViewport().update(width, height, true);
	}

	//application looping method
	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		//Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		//batch.begin();
		//batch.draw(img, 0, 0);
		//batch.end();
		SceneController.INSTANCE.getStage().draw();
	}

	//called when application ends
	public void dispose () {
		SceneController.INSTANCE.getStage().dispose();
	}

	//pausing the game.
	public void pause() {}
	
	//resuming the game.
	public void resume() {}
}
