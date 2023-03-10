package bai03;

public class Cylinder {
	private float h, r;

	public Cylinder(float h, float r) {
		this.h = h;
		this.r = r;
	}

	public Cylinder() {
		h = 0;
		r = 0;
	}

	public float getH() {
		return h;
	}

	public void setH(float h) {
		this.h = h;
	}

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	public double tinhDienTichXungQuanh() {
		return 2 * 3.14 * r * h;
	}

	public double tinhDienTichToanPhan() {
		return 2 * 3.14 * r * h + 2 * 3.14 * r * r;
	}

	public double tinhTheTich() {
		return 3.14 * r * r * h;
	}

	public String toString() {
		return "Cylinder [h=" + h + ", r=" + r + "]";
	}

}
