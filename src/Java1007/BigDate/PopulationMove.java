package Java1007.BigDate;
// constructor추가 fromSido, toSido를 받아서 멤버변수에 넣는 기능
public class PopulationMove {
    private int fromSido;
    private int toSido;

    // data(String)으로 넘어온 데이터를 parsing 생성자
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public int getFromSido() {
        return fromSido;
    }

    public void setFromSido(int fromSido) {
        this.fromSido = fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    public void setToSido(int toSido) {
        this.toSido = toSido;
    }

}