import fang2.sprites._
import fang2.core.Game
import fang2.core.Sound
import java.awt.Color
import CSC110-DungeonCrawl._

class Castle extends Game {
var wall(w:int): Array[ImageSprite] = Array.tabulate(10)(x-> new ImageSprite("/sprites/StoneWall.png"))

	override def setup{
	wall(w).setscale(0.01)

	addsprite(wall(w))
}
	override def advance{

def buildWall {
	wall.setlocation(0,1)
}
}
}
//val room1 (n:int) (l:int) (w:int) = for(i <- 0 until n) yield new wall(l,w)