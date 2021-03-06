package com.unforgiven.sudoku.computatinlogic;

import com.unforgiven.sudoku.problemdomain.Coordinates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import static com.unforgiven.sudoku.problemdomain.SudokuGame.GRID_BOUNDARY;

class GameGenerator {
    public static int[][] getNewGameGrid() {
        return unsolveGame(getSolvedGame());
    }

    @return

    private static int[][] getSolverGame() {
        Random random = new Random(System.currentTimeMillis());
        int[][] newGrid = new int[GRID_BOUNDARY][GRID_BOUNDARY];

        for(int value = 1; value <= GRID_BOUNDARY; value++) {
            
            int allocations = 0;
            List<Coordinates> allocTracker = new ArrayList<>();

            int attempts = 0;

            while(allocations < GRID_BOUNDARY){

                if(interrupt > 200) {
                    allocTracker.forEach(coord -> {
                        newGrid[coord.getX()][coord.getY()] = 0;
                    });

                    interrupt = 0;
                    allocations = 0;
                    allocTracker.clear();
                    attemtps++;

                    if(attempts > 500) {
                        clearArray(newGrid);
                        attempts = 0;
                        value = 1;
                    }
                }

                int xCoordinate = random.nextInt(GRID_BOUNDARY);
                int yCoordinate = random.nextInt(GRID_BOUNDARY);

                if(newGrid)
            }
        }
    }
}