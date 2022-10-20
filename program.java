

class Program
{
	static double bannerPrice(Banner info,int copies)
	{
		float rate = copies<5?0.60f:0.40f;
		return rate *copies *info.area();

	}

	public static void main(String[] args)
	{
		
	float w = Float.parseFloat(args[0]);
	float h = Float.parseFloat(args[1]);
	int r = Integer.parseInt(args[2]);

	Banner b = new Banner(w,h);
	Curvedbanner cb =new Curvedbanner(w,h,r);
	System.out.printf("Size of banner=%.2f ",b.area());
	System.out.printf("\nSize of curvedbanner = %2f",cb.area());
	System.out.printf("price of banner = %.2f",bannerPrice(b,4));
	System.out.printf("price of curvedbanner = %.2f\n",bannerPrice(cb,6));
	}
}

