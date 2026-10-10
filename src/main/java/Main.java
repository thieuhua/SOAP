import ptit.dblab.judge.network.server.soap.*;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        SoapDataService soapService = new DataService().getSoapDataServicePort();

        List<Integer> data = soapService.getData("B23DCCN788", "4C96zMiy");

        String result = data.stream()
                .map(String::valueOf)
                .sorted((a, b)->(b+a).compareTo(a+b))
                .collect(Collectors.joining());
        System.out.println(result);
        soapService.submitDataString("B23DCCN788", "4C96zMiy", result);
    }
}