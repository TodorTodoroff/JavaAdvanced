package DefiningClassesT6.Exercise.PokemonTrainer06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Trainer {
    private int numberOfBadges;
    private List<Pokemon> pokemons;

    public Trainer() {
        this.numberOfBadges = 0;
        this.pokemons = new ArrayList<>();
    }

    public void setNumberOfBadges() {
        this.numberOfBadges++;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }


    public List<Pokemon> getPokemons() {
        return new ArrayList<>(this.pokemons);
    }

    public int pokemonCollectionSize() {
        return this.pokemons.size();
    }

    public void killedPokemon() {
        this.pokemons = this.pokemons.stream()
                .map(damagePokemon).filter(pokemon -> pokemon.getHealth() > 0).collect(Collectors.toList());
    }

    private final UnaryOperator<Pokemon> damagePokemon = pokemon ->
            new Pokemon(pokemon.getName(), pokemon.getElement(), pokemon.getHealth() - 10);


}


