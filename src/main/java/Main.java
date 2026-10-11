import ptit.dblab.judge.network.server.soap.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        SoapCharacterService service=  new CharacterService().getSoapCharacterServicePort();
        String data = service.requestString("B23DCCN788", "KyvYWlNP");
        String reversed = new StringBuilder(data).reverse().toString();
        service.submitString("B23DCCN788", "KyvYWlNP", reversed);
    }
}
