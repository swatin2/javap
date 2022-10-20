class Banner
{
	private float width;
	private float height;

	public Banner()
	{
	   this(12.5f,20.6f);
	}
	public Banner(float w,float h)
	{
		width=w;
		height=h;
	}
	public float getwidth()
	{
		return width;
	}
	public float getheight()
	{
		return height;
	}
	public void setWidth(float w)
	{
		width=w;
	}
	public void setHeight(float h)
	{
		height=h;
	}
	public double area()
	{
		return width*height;
	}
}
