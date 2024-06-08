package pe.edu.cibertec.DSWII_CL1SOAP_AbelPerez.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.AñoRequest;
import pe.edu.cibertec.ws.objects.AñoResponse;

@AllArgsConstructor
@Endpoint
public class AñoEndPoint {

    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";



    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AñoRequest")
    @ResponsePayload
    public AñoResponse checkAño(@RequestPayload AñoRequest request) {
        AñoResponse response = new AñoResponse();
        response.setAñobisiesto(AñoBisiesto(request.getAño()) ? "Sí es bisiesto" : "No es bisiesto");
        return response;
    }

    private boolean AñoBisiesto(int año) {
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            return true;
        }
        return false;
    }
}