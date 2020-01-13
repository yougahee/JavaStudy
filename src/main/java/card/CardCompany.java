package card;

public class CardCompany {

    //cardCompany는 유일한 객체이다.
    //private이기 때문에 객체에 접근하기 위해서는 getter가 필요하다.
    private static CardCompany instance = new CardCompany();

    public static CardCompany getInstance() {
        if(instance == null) {
            instance = new CardCompany();
        }
        return instance;
    }

    //생성자--> 다른 클래스에서 접근할 수 없음. 즉, 유일한 객체라는 의미
    private CardCompany() {}

    //카드 생성
    public Card createCard() {
        Card card = new Card();

        return card;
    }





}
