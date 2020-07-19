package battle.characters;

public abstract class Character {
    int position;
    int health;
    String name;

    public abstract void attack(Character[] characters);

    public void isTargetDead(Character[] characters, int targetPosition) {
        if (characters[targetPosition].getHealth() <= 0) {
            System.out.println(characters[targetPosition].getName() + " убит!\n");
            characters[targetPosition] = null;
        }
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
