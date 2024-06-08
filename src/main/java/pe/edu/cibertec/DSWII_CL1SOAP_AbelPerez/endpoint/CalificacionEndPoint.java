package pe.edu.cibertec.DSWII_CL1SOAP_AbelPerez.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.CalificacionRequest;
import pe.edu.cibertec.ws.objects.CalificacionResponse;

@Endpoint
public class CalificacionEndPoint {

    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CalificacionRequest")
    @ResponsePayload
    public CalificacionResponse verificarCalificacion(@RequestPayload CalificacionRequest request) {
        int promedio = calcularPromedio(request.getCalificacion1(), request.getCalificacion2(), request.getCalificacion3());
        String resultado = promedio >= 70 ? "Aprobado" : "Reprobado";
        CalificacionResponse response = new CalificacionResponse();
        response.setResultado(resultado);
        return response;
    }

    private int calcularPromedio(int calificacion1, int calificacion2, int calificacion3) {
        return (calificacion1 + calificacion2 + calificacion3) / 3;
    }
}