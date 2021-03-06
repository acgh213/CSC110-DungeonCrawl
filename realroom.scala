import fang2.sprites._
import fang2.core.Game
import fang2.core.Sound
import java.awt.Color
import sprites._

class Castle extends Game(900, 800) {
val wall: List[ImageSprite] = List.tabulate(20)(w => new ImageSprite("StoneWall.png"))
val wallAcc: List[ImageSprite] = List.tabulate(20)(w2 => new ImageSprite("StoneWall.png"))
val floor: List[ImageSprite] = List.tabulate(20)(f => new ImageSprite("WoodFloor.png"))
val floor2: List[ImageSprite] = List.tabulate(20)(f2 => new ImageSprite("WoodFloor.png"))
val floor3: List[ImageSprite] = List.tabulate(20)(f3 => new ImageSprite("WoodFloor.png"))

	override def setup{
	  for(w <- wall.indices) {
	wall(w).setScale(0.025)
	addSprite(wall(w))
	  }
	for( w2 <- wallAcc.indices){
	wallAcc(w2).setScale(0.025)
	addSprite(wallAcc(w2))
	  }
	  for(f <- floor.indices) {
	    floor(f).setScale(0.025)
	    addSprite(floor(f))
}
  for (f2 <- floor2.indices){
    floor2(f2).setScale(0.025)
    addSprite(floor2(f2))
  }
  for (f3 <- floor3.indices){
    floor3(f3).setScale(0.025)
    addSprite(floor3(f3))
  }
  }
	override def advance{

def buildWall (x: Double, y: Double)  {
  for(w <- wall.indices){
	var wall1 = wall(w).setLocation(x,y-0.025*w)
	}
	for(w2 <- wallAcc.indices){
	var wall2 = wallAcc(w2).setLocation(x+0.1,y-0.025*w2)
	}
}
def setFloor (x: Double, y: Double) {
  for (f <- floor.indices){
    var setfloor = floor(f).setLocation(x,y-0.025*f)
  }
    for(f2 <- floor2.indices){
      var setfloor2 = floor2(f2).setLocation(x+0.025,y-0.025*f2)
    }
     for(f3 <- floor3.indices){
      var setfloor3 = floor3(f3).setLocation(x+0.05,y-0.025*f3)
    } 
}
def horizWall (x:Double, y: Double) {
  for(w <- wall.indices){
    var wallh = wall(w).setLocation(x+0.025*w,y)
  }
  for(w2 <- wallAcc.indices){
	var wall2 = wallAcc(w2).setLocation(x+0.025*w2,y-0.1)
	}
}
	def horizFloor (x: Double, y: Double) {
	for (f <- floor.indices){
    var setfloor = floor(f).setLocation(x+0.025*f,y-0.025)
  }
    for(f2 <- floor2.indices){
      var setfloor2 = floor2(f2).setLocation(x+0.025*f2,y-0.05)
    }
     for(f3 <- floor3.indices){
      var setfloor3 = floor3(f3).setLocation(x+0.025*f3,y-0.075)
    } 
  }

def hall(wallx:Double, wally: Double, floorx: Double, floory: Double) {
buildWall(wallx,wally)
setFloor(floorx,floory)
}
val hall1 = hall(0.025, 1, 0.05, 1)
val hall2 ={horizWall(0.5, 0.75)
horizFloor(0.5, 0.75)}

}
}
  