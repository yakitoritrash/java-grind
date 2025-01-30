public class Euler{
	public static int eulerPhi(int n) {
		if (n == 1) return 1;
		int result = n;

		if (n % 2 == 0) {
			result -= result/2;
			while (n % 2 == 0) n /= 2;
		}

		for (int p =3; p*p <=n; p+=2) {
			if(n % p == 0)
		}
	
	}

}
