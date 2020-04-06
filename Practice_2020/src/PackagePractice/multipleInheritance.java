package PackagePractice;

public class multipleInheritance {
	public static void main(String[] args) 	{
		AllAnimals al = new AllAnimals();
		al.Irun();
		al.Iwalk();
		al.anm();
	}}
class animal{
	void anm()	{
		System.out.println("in animal");
	}}
interface run{
	abstract void Irun();
}
interface walk{
	abstract void Iwalk();
}
class AllAnimals extends animal implements run, walk {
	public void Irun()	{
		System.out.println("AllAnimals > Irun");
	}
	public void Iwalk()	{
		System.out.println("AllAnimals > Iwalk");
	}
}






















