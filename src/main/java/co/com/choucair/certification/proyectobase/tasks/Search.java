package co.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Performable;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Search implements Task{
    public static Performable the(String course) {
        return Tasks.instrumented(Search.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
