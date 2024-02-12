
public class Scores {
    private String name;    
    private Double sum;
    private int numberScores;

    public Scores(String name) {
        this.name = name;
        sum = 0.0;
        numberScores = 0;
    }
    public String getName() {
        return name;
    }

    private int validScore(double score){
        if(score > 0.0 && score < 100.0){
            return 1;
        }
        else{
            return 0;
        }
    }

        public void addScore( double score){
            if(validScore(score) == 1){
                sum += score;
                numberScores++;
            }
        }

        public double numGrade(){
            if(numberScores >= 1){
                return (sum/numberScores);
            }
            else{
            return 0.0;
            }
        }

        public String toString(){
            return "Student: "+ getName() + " " + numGrade();
        }   



    }

    






