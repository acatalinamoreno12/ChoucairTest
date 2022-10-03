package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task{
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairAcademyPage.LOGIN_BUTTON),
                Enter.theValue("ingresarUsuario").into(ChoucairAcademyPage.INPUT_USER),
                Enter.theValue("ingresarContraseña").into(ChoucairAcademyPage.INPUT_PASSWORD),
                Click.on(ChoucairAcademyPage.ENTER_BUTTON)

                );

    }
}
