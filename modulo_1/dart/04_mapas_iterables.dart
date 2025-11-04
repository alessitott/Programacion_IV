void main(){
  print("mapas iterables");
  final numbers =[1,2,3,4,5,6,78,9,10]; 
  print("Lista original: $numbers");
  print("Tamaño ${numbers.length}");
  print("Indice 4: ${numbers[4]}");
  print("Primero elemento: ${numbers.first}");
  print("reverso de la lista: ${numbers.reversed}");
  final reversedNumbers = numbers.reversed;
  print("reverso de la lista: $reversedNumbers");
  print("List: ${reversedNumbers.toList()}");
  print("Set: ${reversedNumbers.toSet()}"); 
}