package io.github.mstraughan86.dungeon2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class Scene01 {
	
	class MyActor extends Actor {
		Texture texture = new Texture(Gdx.files.internal("badlogic.jpg"));
		@Override
		public void draw(Batch batch, float parentAlpha) {
			batch.draw(texture, 0, 0);
		}
	}
	
	Stage stage;
	
	public Scene01() {
		stage = new Stage(new ScreenViewport());
		MyActor actor = new MyActor();
		stage.addActor(actor);
		//abstract input handling into the stage
		Gdx.input.setInputProcessor(stage);
	}
	

	
	
}
