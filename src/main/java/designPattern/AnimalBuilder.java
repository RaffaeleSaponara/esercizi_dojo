package designPattern;

import java.util.List;

//https://italiancoders.it/builder-pattern-un-ottima-alternativa-al-costruttore/
public final class AnimalBuilder {

    private String id;
    private String name;
    private String pedigreeName;
    private String owner;
    private String race;
    private String residence;
    private Boolean isVaccinated;
    private Boolean isChampion;
    private List<String> sons;
    private Animal.Sex sex;
    private Double weight;
    private Double height;

    private AnimalBuilder(String id) {
        this.id = id;
    }

    public static AnimalBuilder newBuilder(String id) {
        return new AnimalBuilder(id);
    }

    public AnimalBuilder name(String name) {
        this.name = name;
        return this;
    }

    public AnimalBuilder pedigreeName(String pedigreeName) {
        this.pedigreeName = pedigreeName;
        return this;
    }

    public AnimalBuilder owner(String owner) {
        this.owner = owner;
        return this;
    }

    public AnimalBuilder race(String race) {
        this.race = race;
        return this;
    }

    public AnimalBuilder residence(String residence) {
        this.residence = residence;
        return this;
    }

    public AnimalBuilder isVaccinated(Boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
        return this;
    }

    public AnimalBuilder isChampion(Boolean isChampion) {
        this.isChampion = isChampion;
        return this;
    }

    public AnimalBuilder sons(List<String> sons) {
        this.sons = sons;
        return this;
    }

    public AnimalBuilder sex(Animal.Sex sex) {
        this.sex = sex;
        return this;
    }

    public AnimalBuilder weight(Double weight) {
        this.weight = weight;
        return this;
    }

    public AnimalBuilder height(Double height) {
        this.height = height;
        return this;
    }

    public Animal build() {
        return new Animal(name, pedigreeName, id, owner, race, residence, isVaccinated, isChampion, sons, sex, weight, height);
    }
}

class UsaAnimalBuilder{
    public static void main (String[] a){

        Animal pluto = AnimalBuilder.newBuilder("0000001")
                .name("0000001")
                .pedigreeName("PlutoSecondo")
                .owner("Marco Rossi")
                .race("labrador")
                .residence("Via x")
                .isVaccinated(true)
                .isChampion(false)
                .sons(null)
                .sex(Animal.Sex.MALE)
                .weight(40.5)
                .height(30.0)
                .build();

        AnimalBuilder animalBuilder = AnimalBuilder.newBuilder("0000001")
                .name("0000001")
                .pedigreeName("PlutoSecondo")
                .owner("Marco Rossi")
                .race("labrador")
                .residence("Via x")
                .isVaccinated(true)
                .isChampion(false)
                .sons(null)
                .sex(Animal.Sex.MALE)
                .weight(40.5)
                .height(30.0);

        Animal animal3A = animalBuilder.build();
        Animal animal3AClone = animalBuilder.build();
        Animal animal3B = animalBuilder.sex(Animal.Sex.FEMALE).build();
    }


}
