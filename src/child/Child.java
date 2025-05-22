package child;

import parent.Parent;

/**
 * 子クラス.<br/>
 * 
 * <p>
 * Parentクラスを継承して、aメソッドをオーバーライドします。
 * ↓はアノテーション＋作成情報の書き方
 * </p>
 * 
 * @author SI
 * @since 2025/04/03
 * @version 1.0
 */
public class Child extends Parent {

	/** フィールド変数コメント */
	private final String CHILD = "child";
	
	/** フィールド変数コメント */
	private final String TARO = "太郎";
	
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
		System.out.println(b(CHILD, TARO));
	}
	
	/**
	 * 文字列連結（private:このクラスしか使えない）.<br/>
	 * 
	 * <p>
	 * オーバーロード.
	 * </p>
	 * 
	 * @param arg メソッド引数
	 * @return 変換した文字列
	 */
	private String b(String arg) {
		return arg.concat("です。");
	}
	
	/**
	 * 文字列連結（private:このクラスしか使えない）.<br/>
	 *
	 * <p>
	 * オーバーロード.
	 * </p>

	 * @param arg メソッド引数
	 * @return 変換した文字列
	 */
	private String b(String arg, String arg2) {
		return arg.concat(arg2).concat("です。");
	}
}
