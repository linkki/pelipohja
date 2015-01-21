package mygame.implementation;

import java.util.ArrayList;
import java.util.LinkedList;

public class SceneManager {

    private LinkedList allScenes;
    private int currentScene;
    private ArrayList<Scene> sceneList;

    public SceneManager() {
        sceneList = new ArrayList<Scene>();
        allScenes = new LinkedList();
    }

    public void addScene(Scene scene) {
        sceneList.add(scene);
        allScenes.addLast(scene);
    }

    public Scene getScene(int index) {
        return (Scene) allScenes.get(index);
    }

    public void nextScene() {
        currentScene++;
    }

    public void setCurrentScene(int scene) {
        this.currentScene = scene;
    }

    public Scene getCurrentScene() {
        return sceneList.get(currentScene);
    }

    public ArrayList<Scene> getScenes(){
        return sceneList;
    }
}
