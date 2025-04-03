package parent;

/**
 * 抽象クラス.<br/>
 * 
 * <p>
 * このクラスはインスタンス化不可。
 * 子クラスで共通に実装する必要のある部品（フィールド変数やメソッド）を
 * 定義するクラス。
 * </p>
 */
public abstract class Parent {
	
	/**
	 * このメソッドは同一パッケージと子クラス（サブクラス）しか使用できない.
	 */
	protected void a() {
		System.out.println("parent");
	}

}
