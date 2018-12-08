public class ParticipantChessCompetition extends ParticipantCompetitionAbstract {
    private String des;
    private String name;


    public ParticipantChessCompetition(String n, String d) {

        {

            this.name = n;
            this.des = d;

        }


    }


    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double check() {

        double result = 0;
        if (this.des.equals("Pro")) {


            result = Math.floor(Math.random() * 76);
            if (this.name.equals("Samer")) {
//Samer always win
//result=Math.floor(Math.random()*200+100);

//Samer wins mostly
                //   result = Math.floor(Math.random() * 50 + 50);
            }
        } else if (this.des.equals("Amu")) {


            result = Math.floor(Math.random() * 26);

        }

        return result;


    }
}