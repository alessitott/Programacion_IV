void main(){
  final numero1 = 10;
  final numero2 = 5;
  String operacion = "division";
  final calculadora = Calculadora(numero1: numero1, numero2: numero2, operacion: operacion);
  print("Resultado: ${calculadora.calcular()}");

}
class Calculadora{
  int numero1= 0;
  int numero2= 0;
  String operacion= "";
  Calculadora({required this.numero1, required this.numero2, required this.operacion});
  int calcular(){
    switch(operacion){
      case "suma":
        return numero1 + numero2;
      case "resta":
        return numero1 - numero2;
      case "multiplicacion":
        return numero1 * numero2;
      case "division":
        return numero1 ~/ numero2;
      default:
        return 0;
    }
  }
}