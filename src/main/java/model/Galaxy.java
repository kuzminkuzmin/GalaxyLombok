package model;

import lombok.*;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Galaxy {
    @NonNull
    private String name;
    private ArrayList<Planet> planets = new ArrayList<>();

    /**
     * метод поведения галактики (название behavior), который обращается к каждой планете
     * из галактики, вызывает для нее behavior
     *
     * @return строка, содержащая все результаты вызовов behavior каждой планеты
     */
    public String behavior() {
        StringBuilder res = new StringBuilder();
        for (Planet planet : this.planets) {
            res.append(planet.behavior()).append(" ");
        }
        return res.toString();
    }

    /**
     * Метод добавления новой планеты в список всех планет текущей галактики
     *
     * @param newPlanet объект новой планеты
     * @return true - если планета добавлена, false если такая планета уже есть
     */
    public boolean addPlanet(Planet newPlanet) {
        if (this.planets.contains(newPlanet)) {
            return false;
        }
        this.planets.add(newPlanet);
        return true;
    }

    /**
     * Метод поиска планеты по ее имени
     *
     * @param planetName имя искомой планеты
     * @return объект искомой планеты, null если такой планеты нет
     */
    public Planet search(String planetName) {
        for (Planet planet : this.planets) {
            if (planet.getName().equals(planetName)) {
                return planet;
            }
        }
        return null;
    }

    /**
     * Метод поиск планеты по объекту самой планеты
     *
     * @param planet объект искомой планеты
     * @return индекс вхождения
     */
    public int search(Planet planet) {
        return this.planets.indexOf(planet);
    }

    /**
     * Метод удаления планеты из галактики по ее имени
     *
     * @param name имя удаляемо планеты
     * @return объект удаляемой планеты, null если планеты не было в галактике
     */
    public Planet deletePlanet(String name) {
        Planet res = search(name);
        if (res == null) {
            return null;
        }
        this.planets.remove(res);
        return res;
    }

    /**
     * Метод удаления по объекту самой планеты
     *
     * @param planet объект удаляемой планеты
     * @return true если планета удалена, false если планеты не было в галактике
     */
    public boolean deletePlanet(Planet planet) {
        return this.planets.remove(planet);
    }
}
