class Rectangle{
	double width,height;//	widthは横幅，heightは高さ
	Rectangle(double width,double height){
		 this.width=width; this.height=height;
	 }
	double getArea(double width,double height) {
		return width*height;
	}
	public static void main(String args[]) {
		Rectangle rec =new Rectangle(5.0,6.0);
		System.out.println("面積は"+rec.getArea(rec.width,rec.height));
	}
	
}