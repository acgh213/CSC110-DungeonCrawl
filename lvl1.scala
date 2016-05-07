import fang2.sprites._
import fang2.core.Game
import fang2.core.Sound
import java.awt.Color
import memes._

class lvl1 extends Game(900,800) {
 val largeDoor = new ImageSprite("tempDoor.png")
 val door1 = new ImageSprite("door.png")
 val door2 = new ImageSprite("door.png")
 val door3 = new ImageSprite("door.png")
 val hall1l: List[ImageSprite] =  List.tabulate(10)(h1l => new ImageSprite("WoodFloor.png"))
 val hall1r: List[ImageSprite] = List.tabulate(10)(h1r => new ImageSprite("WoodFloor.png"))
 val hall2l: List[ImageSprite] = List.tabulate(20)(h2l => new ImageSprite("WoodFloor.png"))
 val hall2r: List[ImageSprite] = List.tabulate(20)(h2r => new ImageSprite("WoodFloor.png"))
 val hall3l: List[ImageSprite] = List.tabulate(8)(h3l => new ImageSprite("WoodFloor.png"))
 val hall3r: List[ImageSprite] = List.tabulate(8)(h3r => new ImageSprite("WoodFloor.png"))
 override def setup {
   
   for(h1l<- hall1l.indices) {
     hall1l(h1l).setScale(0.025)
     addSprite(hall1l(h1l))
   }
     for(h1r <- hall1r.indices) {
       hall1r(h1r).setScale(0.025)
     addSprite(hall1r(h1r))
   }
   for(h2l<- hall2l.indices) {
     hall2l(h2l).setScale(0.025)
     addSprite(hall2l(h2l))
   }
   for(h2r <- hall2r.indices) {
       hall2r(h2r).setScale(0.025)
     addSprite(hall2r(h2r))
   }
    for(h3l<- hall3l.indices) {
     hall3l(h3l).setScale(0.025)
     addSprite(hall3l(h3l))
   }
     for(h3r <- hall3r.indices) {
       hall3r(h3r).setScale(0.025)
     addSprite(hall3r(h3r))
   }
   largeDoor.setScale(0.05)
   addSprite(largeDoor)
   door1.setScale(0.025)
   door1.setRotationDegrees(90)
   addSprite(door1)
    door2.setScale(0.025)
   addSprite(door2)
    door3.setScale(0.025)
   addSprite(door3)
 }
 override def advance {
   
   def hall1 (x: Double, y: Double) {
   for(h1l <- hall1l.indices) {
     var setHall1l = hall1l(h1l).setLocation(x+0.025,y-0.025*h1l)
   }
   for (h1r <- hall1r.indices) {
     var setHall1r = hall1r(h1r).setLocation(x+0.05,y-0.025*h1r)
   }
   var setDoor = {largeDoor.setLocation(0.04+x,y-0.25)
   door1.setLocation(x+0.07,y-0.165)}
   }
   def hall2 (x:Double , y:Double) {
     for(h2l <- hall2l.indices) {
     var setHall2l = hall2l(h2l).setLocation(0.025+x+0.025*h2l,0.075+y-0.25)
   }
   for (h2r <- hall2r.indices) {
     var setHall2r = hall2r(h2r).setLocation(0.025+x+0.025*h2r,0.1+y-0.25)
   }
   for(h3l <- hall3l.indices) {
     var setHall3l = hall3l(h3l).setLocation(0.3+x+0.025,0.075+y-0.025*h3l-0.15)
   }
   for (h3r <- hall3r.indices) {
     var setHall3r = hall3r(h3r).setLocation(0.3+x+0.05,0.075+y-0.025*h3r-0.15)
   }
   var setDoors = { door2.setLocation(0.335+x,y-0.13)
   door3.setLocation(0.335+x, y-0.195)
   }
   }
   
   def buildPath {
  hall1(0.025,0.9)
  hall2(0.025,0.9)
 }
 buildPath
}
}
