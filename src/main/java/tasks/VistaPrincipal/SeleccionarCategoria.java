package tasks.VistaPrincipal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static vistas.VistaPrincipal.*;


public class SeleccionarCategoria implements Task {


    private String categoria;
    public SeleccionarCategoria(String tema ){
        this.categoria=categoria;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        validarVentanaEmergente(actor);
        //Wait.until(the(LINK_CATEGORY), isPresent()).forNoLongerThan(5);
        actor.attemptsTo(Scroll.to(LINK_CATEGORY).andAlignToTop());



        //actor.attemptsTo(Click.on(LINK_CATEGORY.of(categoria)));
    }
    public static SeleccionarCategoria conTitulo(String categoria) {
        return instrumented(SeleccionarCategoria.class,categoria);
    }

    private <T extends Actor> void validarVentanaEmergente(T actor) {
       // Wait.until(the(LINK_PRINCIPAL_MENU), isPresent()).forNoLongerThan(5);
        if (Visibility.of(LINK_PRINCIPAL_MENU).viewedBy(actor).asBoolean())
            actor.attemptsTo(Click.on(LINK_PRINCIPAL_MENU));
    }




}
