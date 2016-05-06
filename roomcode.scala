import fang2.sprites._
import fang2.core.Game
import fang2.core.Sound
import java.awt.Color

class Walls extends Game {
	//single wall
	case class Wall(x: Double, y: Double, aspectRatio:Double, scale: Double, sprite: ImageSprite = null) 

	// create the walls
	var wallList = List(Wall(x=0.2, y=0.3, aspectRatio=1.0, scale=0.1),
						Wall(x=0.1, y=0.2, aspectRatio=1.0, scale= 0.1),
 						Wall(x=0.5, y=0.5, aspectRatio=1.0, scale=0.05),
		      			Wall(x=0.8, y=0.8, aspectRatio=1.0, scale=0.2))
  	var wallsLeft = wallList.length
	//setup override
  override def setup {
     // setup wall sprites
     var newList = List[Wall]()
     for (w <- wallList) {
        val s = new ImageSprite(w.aspectRatio)
	s.setLocation(w.x, w.y)
	s.setScale(w.scale)
	addSprite(s)
	// Append a copy of this wall with the sprite added to it to a new list
	newList = w.copy(sprite=s)::newList
    }
    wallList = newList


    // Start game immediately
    startGameImmediately()  // Otherwise, paused initially
  }
}