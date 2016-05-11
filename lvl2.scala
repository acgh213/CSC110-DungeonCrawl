import fang2.sprites._
import fang2.core.Game
import fang2.core.Sound
import java.awt.Color

class lvl2 extends Game(900,800) {
	var playerChar = new ImageSprite("you.png")
	case class Enemy(name: String, str: Int, spd: Int, hp: Int, armor: Int, xp: Int)
	case class Wall(x: Double, y: Double, aspectRatio:Double,
	scale: Double, sprite: ImageSprite =null)
//wall creation
	var wallList = List(Wall(x=0.2, y=0.3, aspectRatio=4.0, scale=0.1),
                      Wall(x=0.1, y=0.2, aspectRatio=1.0/4.0, scale=0.1),
		      Wall(x=0.5, y=0.5, aspectRatio=10.0, scale=0.05),
		      Wall(x=0.8, y=0.8, aspectRatio=0.1, scale=0.2),
          Wall(x=0.2, y=0.4, aspectRatio=2.0, scale=0.2))
  var wallsLeft = wallList.length
 val playerStartPos = (0.05,0.875)
 val playerSpd = 0.00625
 var playerStr = 6
 var playerSpeed = 1
 var playerLvl = 1
 var youHp = 20
 var youArmor = 0
 var swingTime = 1
 var curXp = 0
 var xpNeeded = 20*(playerLvl*playerLvl)

 // Override Setup 

 override def setup {
 	var newList = List[Wall]()
 	for (w <- wallList) {
 		val s = new ImageSprite("StoneWall.png")
 	}
 	s.setLocation(w.x,w.y)
 	s.setScale(w.scale) 
 	addsprite(s)
 	newList = w.copy(sprite=s)::newList
 	//puts a copy of this image sprite added to the list
 }
wallList = newList
setHelpText("There is no help currently ready for this level, you are on your own.")
startGameImmediately() 

override def advance {
    val mouse = getMouse2D
    for (w <- wallList){
       if (w.sprite != null && w.sprite.isVisible() && mouse.intersects(w.sprite)) {
          // A wall was clicked.  Remove it (make it invisible)
	  w.sprite.setVisible(false)
  	  println("You hit a wall!")
	  updateWallCount(-1)
	}
  }
}
  def moveMe {
  if (leftPressed) {
    playerChar.translateX(-playerSpd)
    swingTime -= 1
  }
   else if (upPressed) {
    playerChar.translateY(-playerSpd)
    swingTime -= 1
   }
   else if (rightPressed)  {
    playerChar.translateX(playerSpd)
    swingTime -= 1
   
   }
   else if (downPressed) {
    playerChar.translateY(playerSpd)
    swingTime -= 1
	}
  else if (keyPressed) {
    val c = getKeyPressed
    c match {
   case i => 
}
  /*****
   * updateWallCount
   *    Update the number of walls remaining
   *****/
  def updateWallCount(amount: Int) {
    wallsLeft += amount
    if (wallsLeft <= 0) {
        println("You win!")
	System.exit(0)
}}
}
}
}

