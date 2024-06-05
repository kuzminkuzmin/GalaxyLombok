package model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Planet {
    private String name;
    private double radius;
    private double period;

    public double speed() {
        return 2 * Math.PI * this.radius / this.period;
    }

    public String behavior() {
        return this.name + " " + this.speed();
    }
}
