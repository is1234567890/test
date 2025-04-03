package child;

import parent.Parent;

/**
 * 子クラス.<br/>
 * 
 * <p>
 * Parentクラスを継承して、aメソッドをオーバーライド（ポリモーフィズム）します。
 * </p>
 * 
 * @author SOU
 * @since 2025/04/03
 * @version 1.0
 */
public class Child extends Parent {

	/** フィールド変数コメント */
	private final String CHILD = "child";
	
	/**
	 * メソッドコメント（public:どこからでも使用できる）.<br/>
	 * 
	 * <p>
	 * Parentクラスのメソッドの処理を書き換える（オーバーライド）。
	 * </p>
	 */
	@Override
	public void a() {
		super.a();
		System.out.println(b(CHILD));
	}
	
	/**
	 * 文字列連結（private:このクラスしか使えない）.<br/>
	 * 
	 * @param arg メソッド引数
	 * @return 変換した文字列
	 */
	private String b(String arg) {
		return arg.concat("です。");
	}

}
