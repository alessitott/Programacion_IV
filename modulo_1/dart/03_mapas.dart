void main(){
    print("mapas");
    final Map<String, dynamic> pokemon = {
      "name": "Pikachu",
      "hp": 100,
      "isAlive": true,
      "abilities": <String>["impostor"],
      "sprites": {
        1: "src/front.jpg",
        2: "src/back.jpg"
      }
    };
    print("pokemon: $pokemon");
    print(pokemon["name"]);
    print(pokemon["sprites"]);
    print(pokemon["isAlive"]);
}