package com.horses.template.model.entities;

import java.io.Serializable;

public class PokemonEntity implements Serializable {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeedAttack() {
        return speed_attack;
    }

    public void setSpeedAttack(int speed_attack) {
        this.speed_attack = speed_attack;
    }

    public int getSpeedDefense() {
        return speed_defense;
    }

    public void setSpeedDefense(int speed_defense) {
        this.speed_defense = speed_defense;
    }

    public String getPokeType() {
        return poke_type;
    }

    public void setPokeType(String poke_type) {
        this.poke_type = poke_type;
    }

    public String getSprite() {
        return "http://img.pokemondb.net/sprites" + sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public String getArtwork() {
        return "http://img.pokemondb.net/artwork" + artwork;
    }

    public void setArtwork(String artwork) {
        this.artwork = artwork;
    }

    private int id;
    private String name;
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private int speed_attack;
    private int speed_defense;
    private String poke_type;
    private String sprite;
    private String artwork;

}
