package in.reqres.stepDefinitions;

import in.reqres.questions.RespuestaServidorCodigo;
import in.reqres.tasks.usuarios.ObtenerUsuarioTask;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import static in.reqres.constants.Constantes.URL_BASE_USER;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class GetUsuarioStepDefinitions {


    @Cuando("el usuario consume en endpoint")
    public void elUsuarioConsumeEnEndpoint() {
        Actor usuario = Actor.named("usuario")
                .whoCan(CallAnApi.at(URL_BASE_USER));
        usuario.attemptsTo(
                ObtenerUsuarioTask.llamarUsuario()
        );
    }
    @Entonces("el usuario podra ver el status code {int}")
    public void elUsuarioPodraVerElStatusCode(Integer code) {
        Actor usuario = Actor.named("Usuario");

        usuario.should(
                seeThat("el codigo de respuesta es: ",
                        RespuestaServidorCodigo.was(),
                        equalTo(code)
                )
        );
    }
}
