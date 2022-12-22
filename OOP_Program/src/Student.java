
public class Student {
	//Attributes
		private String name;
		private int score;
//method
	public void setName(String Name) {
		name=Name;
	}
	public String getName() {
		return name;
	}
	public void setScore(int Score) {
		score = Score;
	}
	public int getScore() {
		return score;
	}
	public boolean checkScore() {
		if(score >=0&&score<=100) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isPass() {
		if(score>=50) {
			return true;
		}else {
			return false;
		}
		
	}
	public String findGrade(int Score) {
		return (score>=80&&score<=100? "A":
				(score>=75)?"B+":
					(score>=70)?"B":
						(score>=65)?"C+":
							(score>=60)?"C":
								(score>=55)?"D+":
									(score>=50)?"D":"F");
	}

}
