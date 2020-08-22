package list04_03;


import java.util.ArrayList;
import java.util.List;

class Hero {
	public String name; /*}*/  /* equals()をオーバーライドしていない */

	//	ここは自分で記述	/*①	*/
//public boolean equals(Object o) {
//	if(o==this)return true;
//	if(o==null)return false;
//	if(!(o instanceof Hero))return false;
//	Hero h = (Hero)o;
//	if(!this.name.trim().equals(h.name.trim())) {return false;}
//	return true;
//}

//@Override
//public String toString() {
//	return "Hero [name=" + name + "]";
//}
}/*---------*/

public class Main {
    public static void main(String[] args) {
//        Hero型のリストを作る
        List<Hero> list = new ArrayList<Hero>();
        System.out.println("Hero型のArrayList[list]を作る");
        System.out.println("");
        Hero h1 = new Hero(); h1.name = "ミナト";
        System.out.println("Hero型の変数[h1]を作る");
        System.out.println("");
        															//		System.out.println("h1 = " + h1);/*list04_03.Hero@7637f22*/

//        lsitに加える
/*[1]h1とする*/list.add(h1);            /* インスタンスを作って格納 */
		System.out.println("[h1]をlsitに加える");
        System.out.println("");
		System.out.println("h1.hashCode()         ="+h1.hashCode());
		System.out.println("list.get(0).hashCode()="+list.get(0).hashCode());
															//        System.out.println("h1 = "+h1);/*list04_03.Hero@7637f22*/
															//        System.out.println("list.get(0) = "+list.get(0));
        System.out.println("");
        System.out.println("要素数=" + list.size());
        System.out.println("");

//        h1を新たに初期化？それにより当然アドレスが変わる？
//        初期化ではない。何故なら、「Hero h1」ではなく「h1」、つまり、型が付いてないので同じ変数に違うもの(アドレス)を入れてるだけと思われる
//        int num = 10;
//        System.out.println(num);→10
//        num = 20;
//        System.out.println(num);→20  と同じことと思われる

/*[2]h1とする*/h1 = new Hero();	h1.name = "ミナト"; 	/*②*/
		System.out.println("「h1」をnew Hero()に上書き。名前はミナト");

//		違和感があるのは、普通なら変数名の重複は許されないのに重複してるように見えるから。

		System.out.println("h1.hashCode()         ="+h1.hashCode());
		System.out.println("list.get(0).hashCode()="+list.get(0).hashCode());
        System.out.println("");
		System.out.println("h1 = "+h1);			/*list04_03.Hero@7637f22*/
		System.out.println("list.get(0) = "+list.get(0));
														//		System.out.println("h1 = " + h1);		/*list04_03.Hero@3830f1c0*/

//        初期化したものを新たにaddする
        list.add(h1);
        System.out.println("");
        System.out.println("初期化したものを新たにaddする");
        System.out.println("");
        System.out.println("要素数=" + list.size());
        System.out.println("");
        System.out.println("h1 = "+h1);			/*list04_03.Hero@3830f1c0*/
        System.out.println("list.get(0) = "+list.get(0));
        System.out.println(list.remove(h1));            /* 名前が「ミナト」の勇者を削除 */
//        list.remove(list.get(0));とすれば除去できる
        System.out.println("? = "+h1);
        System.out.println("要素数=" + list.size());
        System.out.println("");
        System.out.println("");
    }
//    ①が無くても、②も無ければ要素数は０になる。
}
//		ある程度分かった気がするが、一つ不明点がある。
//		h1を変更してもlsit.get（0）がかわらないこと。同じアドレスなのに、、、。誤作動か、、、？
//set()を試したい
