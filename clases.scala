case class Enemy(type: String, str: Int = 4, spd: Int = 4, ,hp: Int = 20, armor: Int = 0)
case class Weapon(type: String, dmg: Int, def: Int, wpSpd: Double = 1.0, acc: Double = 1.0)
case class Armor(type: String, def: Int, weight: Double = 0.0)

val goblin = Enemy("Goblin", 3, 6, 10, 0)
val rat = Enemy("Rat", 2, 8, 5, 0)
val slime = Enemy("Slime", 1, 2, 40, 0)
val skeleton = Enemy("Skeleton", 4, 4, 15, 1)
val snake = Enemy("Snake", 6, 6, 10, 0)
val spider = Enemy("Spider", 5, 8, 15, 1)
val skeletonGuard = Enemy("SkeletonGuard", 6, 4, 30, 4)

val dagger = Weapon("Dagger", 2, 0, 1.5, 1.2)
val club = Weapon("Club", 4, 0, 0.8, 0.8)
val sword = Weapon("Sword", 4, 2, 1.0, 1.0)
val hammer = Weapon("Hammer", 8, 2, 0.7, 0.9)
val mace = Weapon("Mace", 6, 0, 0.8, .9)

val wdShield = Armor("Wooden Shield", 1, 0.1)
val kiteShield = Armor("Kite Shield", 3, 0.3)
val lrgMtShield = Armor("Large Metal Shield", 6, 0.6)
val lthrHelm = Armor("Leather Helm", 1, 0.1)
val lthrChest = Armor("Leather Chest", 1, 0.1)
val lthrPants = Armor("Leather Pants", 1, 0.1)
val metalHelm = Armor("Metal Helm", 2, 0.2)
val metalChest = Armor("Metal Chest", 2, 0.2)
val metalPants = Armor("Metal Legs", 2, 0.2)
val plateHelm = Armor("Plate Helm", 4, 0.3)
val plateChest = Armor("Plate Chest", 4, 0.3)
val platePants = Armor("Plate Legs", 4, 0.3)



