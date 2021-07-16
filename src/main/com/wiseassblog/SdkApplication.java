package com.wiseassblog.sudoku;

import com.wiseassblog.sudoku.buildlogic.SudokuBuildLogic;
import com.wiseassblog.sudoku.userinterFace.IUserInterfaceContract;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;


public class SdkApplication extends Application {
    private IUserInterfaceContract.View uiImpl;

    @Override
    public void start(Stage primaryStage) throws IOException {
        //Get SudokuGame object for a new game
        uiImpl = new UserInterfaceImpl(primaryStage);

        try {
            SudokuBuildLogic.build(uiImpl);
        } catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args){
        launch(args);
    }
}