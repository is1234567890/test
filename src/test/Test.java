package test;

import child.Child;

/**
 * アプリケーション起動クラス.<br/>
 * 
 * <p>
 * このクラスは特殊なクラスのためどこからもオーバーライドされたりしない。
 * </p>
 */
public class Test {

	/**
	 * このクラスが
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Child child = new Child();
		child.a();

	}

}
