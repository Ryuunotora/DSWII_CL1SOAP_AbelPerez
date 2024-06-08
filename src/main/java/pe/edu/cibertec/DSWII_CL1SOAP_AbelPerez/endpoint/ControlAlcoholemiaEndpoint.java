package pe.edu.cibertec.DSWII_CL1SOAP_AbelPerez.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.ControlAlcoholemiaRequest;
import pe.edu.cibertec.ws.objects.ControlAlcoholemiaResponse;

@AllArgsConstructor
@Endpoint
public class ControlAlcoholemiaEndpoint {

    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "ControlAlcoholemiaRequest")
    @ResponsePayload
    public ControlAlcoholemiaResponse checkAlcoholemia(@RequestPayload ControlAlcoholemiaRequest request) {
        ControlAlcoholemiaResponse response = new ControlAlcoholemiaResponse();
        if (request.getVehiculo().equals("C") || request.getVehiculo().equals("A") || request.getVehiculo().equals("M")) {
            if (request.getTasaAlcohol() <= 0.3) {
                response.setResultado("El conductor NO da positivo en el control de alcoholemia.");
            } else {
                response.setResultado("El conductor da positivo en el control de alcoholemia.");
            }
        } else if (request.getVehiculo().equals("T")) {
            if (request.getTasaAlcohol() <= 0.5) {
                response.setResultado("El conductor NO da positivo en el control de alcoholemia.");
            } else {
                response.setResultado("El conductor da positivo en el control de alcoholemia.");
            }
        } else {
            response.setResultado("Indicador de vehículo no válido.");
        }
        return response;
    }
}