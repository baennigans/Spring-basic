package exam.di.entity;

public class HighTechExam implements Exam {

	private int kor;
	private int eng;
	private int math;
	private int com;
	
	public HighTechExam() {
		
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	
	@Override
	public int total() {
		int result = kor+eng+math+com;
		return result;
	}
	
	@Override
	public float avg() {
		float result = (float)(total()/4);
		return result;
	}
}
