void main(){
  //FINAL; variable constante
  print("Tipo de variable");
  final String pokemon = "Pikachu";
  print(pokemon);
  //sin final; variable cambiante
  String myName = "David";
  myName = "Cordova";
  print(myName);
  
  const String elemento = "Fuego";
  print("elemento: $elemento");
  
  bool active = false;
  print("Es activo: $active");
  
  int hp= 1000;
  print("caballos de fuerza: $hp");
  
  List<String> abilities = ["impostor","correlon"];
  print("habilidades: $abilities");
  
  final sprites = <String> ["src/image1.jpg", "image2"];
  print("Imagenes: $sprites");
  
  
print("Impresion en varias lienas");
print("""
 Spokemon
 Shp
 $sprites
 $abilities
"""); 
  
  
  
  
  
  
 
  
}