package Game.Scenes.GameScene.Entites.Player.Upgrades;

public class Upgrade {
    private String title,name,description,img;
    public Upgrade(){
        title = "";
        name = "";
        description = "";
        img = "";
    }
    public void upgradeEvent(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
