package tables;

import javax.persistence.Entity;

@Entity
public class LiveProject extends Project
{
    private float cost;

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
}
