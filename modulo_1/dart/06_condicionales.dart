void main(){
  int a = 10;
  if(a > 5){
    print("$a es mayor que 5");
  }
  if (a < 0){
    print("$a es negativo");
  } else {
    print("$a es positivo");
  }
  int age = 18;
  String ageDescription = (age < 18) ? "Menor de edad" : "Mayor de edad";
  print(ageDescription);
}