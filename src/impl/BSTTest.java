package impl;

/**
 * @author 12312821
 *
 * Test Class as requested in Part 1 (b)
 */
public class BSTTest {

	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
//		System.out.println(tree);
		tree.insert(24);
		System.out.println(tree);
		tree.insert(12);
		System.out.println(tree);
		tree.insert(36);
		System.out.println(tree);
		tree.insert(5);
		System.out.println(tree);
		tree.insert(7);
		System.out.println(tree);
		tree.insert(2);
		System.out.println(tree);
		tree.insert(76);
		System.out.println(tree);
		tree.remove(24);
		System.out.println(tree);
		tree.insert(18);
		System.out.println(tree);
		tree.insert(24);
		System.out.println(tree);
	}

}
