class Judge {

	public static void main(String[] args) {
		int n = 3;
		int[][] trust = {{1,3}, {2, 3}, {3,1}};

		System.out.println(findJudge(n, trust));
	}
	public static int findJudge (int n, int[][] trust) {
		if (trust[0].length <= 0 || n <= 0)
			return -1;

		int[] people = new int[n + 1];

		for (int[] i : trust) {
			people[i[0]]--;
			people[i[1]]++;
		}

		for (int i = 1; i <= n; i++) {
			if (people[i] == (n-1)) {
				return i;
			}
		}
		return -1;
	}
}
