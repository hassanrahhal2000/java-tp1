package partie_5;
import java.util.*;
public class TreMap {
	public static void main(String[] args) {
		//1
	TreeMap<Integer,String>Tp= new TreeMap<>();
	//2
	Tp.put(187,"karim");
	Tp.put(29,"smail");
	Tp.put(62,"imran");
	Tp.put(4,"sofian");
	Tp.put(556,"ali");
	//3
	for (Map.Entry<Integer, String> e : Tp.entrySet()) {
	   System.out.println(e.getKey()+" : "+e.getValue());
 }
	System.out.println(".........................................................");
	//4
	System.out.println("premier etudiant : " + Tp.firstEntry());	
	System.out.println("dernier etudiant : " + Tp.lastEntry());
	//5
	System.out.println(".........................................................");
	for (Map.Entry<Integer, String> e : Tp.entrySet()) {
	if(e.getKey()>100) {	
		System.out.println("les etudiant ayant un mumero supereur a 100 est:"+e.getKey());
	}}}}
	
	

