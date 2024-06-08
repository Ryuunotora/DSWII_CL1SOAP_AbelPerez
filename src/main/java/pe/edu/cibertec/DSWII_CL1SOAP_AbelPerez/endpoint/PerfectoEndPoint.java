package pe.edu.cibertec.DSWII_CL1SOAP_AbelPerez.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.PerfectoRequest;
import pe.edu.cibertec.ws.objects.PerfectoResponse;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@Endpoint
public class PerfectoEndPoint {

    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "PerfectoRequest")
    @ResponsePayload
    public PerfectoResponse checkPerfecto(@RequestPayload PerfectoRequest request) {
        PerfectoResponse response = new PerfectoResponse();
        List<Integer> numerosPerfectos = new ArrayList<>();

        for (int i = 1; i <= request.getLimite(); i++) {
            if (esNumeroPerfecto(i)) {
                numerosPerfectos.add(i);
            }
        }

        response.setNumeroPerfecto(numerosPerfectos.toString());
        return response;
    }

    private boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == numero;
    }
}
