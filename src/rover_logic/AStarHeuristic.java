package rover_logic;

public interface AStarHeuristic {

	public float getCost(TileBasedMap map, Path mover, int x, int y, int tx, int ty);
}