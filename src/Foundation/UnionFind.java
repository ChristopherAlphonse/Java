
package Foundation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnionFind {

	private int[] parent; // parent[i] = parent of i
	private byte[] rank; // rank[i] = rank of subtree rooted at i (never more than 31)
	private int count; // number of components

	/**
	 * Initializes an empty union-find data structure with {@code n} elements {@code 0} through
	 * {@code n-1}. Initially, each element is in its own set.
	 *
	 * @param n the number of elements
	 * @throws IllegalArgumentException if {@code n < 0}
	 */
	public UnionFind(int n) {
		if (n < 0)
			throw new IllegalArgumentException();
		count = n;
		parent = new int[n];
		rank = new byte[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
			rank[i] = 0;
		}
	}

	/**
	 * Returns the canonical element of the set containing element {@code p}.
	 *
	 * @param p an element
	 * @return the canonical element of the set containing {@code p}
	 * @throws IllegalArgumentException unless {@code 0 <= p < n}
	 */
	public int find(int p) {
		validate(p);
		while (p != parent[p]) {
			parent[p] = parent[parent[p]]; // path compression by halving
			p = parent[p];
		}
		return p;
	}

	/**
	 * Returns the number of sets.
	 *
	 * @return the number of sets (between {@code 1} and {@code n})
	 */
	public int count() {
		return count;
	}

	/**
	 * Merges the set containing element {@code p} with the set containing element {@code q}.
	 *
	 * @param p one element
	 * @param q the other element
	 * @throws IllegalArgumentException unless both {@code 0 <= p < n} and {@code 0 <= q < n}
	 */
	public void union(int p, int q) {
		int rootP = find(p);
		int rootQ = find(q);
		if (rootP == rootQ)
			return;

		// make root of smaller rank point to root of larger rank
		if (rank[rootP] < rank[rootQ])
			parent[rootP] = rootQ;
		else if (rank[rootP] > rank[rootQ])
			parent[rootQ] = rootP;
		else {
			parent[rootQ] = rootP;
			rank[rootP]++;
		}
		count--;
	}

	// validate that p is a valid index
	private void validate(int p) {
		int n = parent.length;
		if (p < 0 || p >= n) {
			throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n - 1));
		}
	}

	/**
	 * Reads an integer {@code n} and a sequence of pairs of integers (between {@code 0} and
	 * {@code n-1}) from standard input, where each integer in the pair represents some element; if
	 * the elements are in different sets, merge the two sets and print the pair to standard output.
	 *
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		UnionFind uf = new UnionFind(n);
		String line;
		while ((line = reader.readLine()) != null) {
			String[] pair = line.split(" ");
			int p = Integer.parseInt(pair[0]);
			int q = Integer.parseInt(pair[1]);
			if (uf.find(p) == uf.find(q))
				continue;
			uf.union(p, q);
			System.out.println(p + " " + q);
		}
		System.out.println(uf.count() + " components");
	}
}
