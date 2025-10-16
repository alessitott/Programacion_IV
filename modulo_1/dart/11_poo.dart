void main(){
  final Hero ironman = Hero(name: "Ironman", power: "Dinero");
  print(ironman);
  print(ironman.name);
  print(ironman.power);
}
class Hero{
  String name="";
  String power= "";
  Hero(
    {
      required this.name,
      this.power = "No tiene poder"}
  );
  @override
  String toString(){
    return 'Hero(name: $name, power: $power)';
  }

}

