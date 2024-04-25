package com.example.tictactoe2.Controller;

import com.example.tictactoe2.exceptions.InvalidException;
import com.example.tictactoe2.models.Game;
import com.example.tictactoe2.models.GameState;
import com.example.tictactoe2.models.Player;

import java.util.*;
import java.util.ArrayList;

public class GameController {
    public Game startGame(int dimension, List<Player> players) {
        //TODO
        return new Game(dimension, players);
    }

    public void makeMove(Game game) throws InvalidException {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }
}
