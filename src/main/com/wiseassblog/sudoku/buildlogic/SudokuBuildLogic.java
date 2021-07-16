package com.wiseassblog.sudoku.buildlogic;

import com.wiseassblog.sudoku.computationlogic.GameLogic;
import com.wiseassblog.sudoku.persistence.LocalStorageImpl;
import com.wiseassblog.sudoku.problemdomain.IStorage;
import com.wiseassblog.sudoku.problemdomain.SudokuGame;
import com.wiseassblog.sudoku.userinterface.IUserInterfaceContract;
import com.wiseassblog.sudoku.userinterface.logic.ControlLogic;

import java.io.IOException;

public class SudokuBuildLogic {

    public static void build(IUserInterfaceContract.View userInterface) throws IOException {
        SudokuGame initialState;
        IStorage storage = new LocalStorageImpl();

        try {

            initialState = storage.getGameData();
        } catch (IOException e) {

            initialState = GameLogic.getNewGame();

            storage.updateGameData(initialState);
        }

        IUserInterfaceContract.EventListener uiLogic = new ControllLogic(storage, userInterface);
        userInterface.setListener(uiLogic);
        userInterface.updateBoard(initialState);
    }
}