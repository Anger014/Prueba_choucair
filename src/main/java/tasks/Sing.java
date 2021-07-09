package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SingInterface;

public class Sing implements Task {
    public static Sing form() {
        return Tasks.instrumented(Sing.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Enter.theValue("Anger014@gmail.com").into(SingInterface.INPUT_USER),
                        Enter.theValue("Angersito312").into(SingInterface.INPUT_PASS),
                        Click.on(SingInterface.CHECK_REMENBER),
                        Click.on(SingInterface.SUBMIT_BUTTON)

        );

    }
}
