package interfaces;

import java.util.concurrent.ConcurrentHashMap;

import models.Cell;

public interface IBoard {
	public ConcurrentHashMap<String, ConcurrentHashMap<String, Cell>> getBoard();
}
