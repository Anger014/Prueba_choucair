package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import userinterface.UtestLoginPage;


public class Login implements Task {



    public static Login onPage() {
        return Tasks.instrumented(Login.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestLoginPage.JOIN_BUTTON),
                Enter.theValue("anyer smith").into(UtestLoginPage.INPUT_FIRST_NAME),
                Enter.theValue("Contreras Velez").into(UtestLoginPage.INPUT_LAST_NAME),
                Enter.theValue("anger023@gmail.com").into(UtestLoginPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("June").from(UtestLoginPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText("2").from(UtestLoginPage.SELECT_DAY),
                SelectFromOptions.byVisibleText("1994").from(UtestLoginPage.SELECT_YEAR),

                Click.on(UtestLoginPage.NEXT_BUTTON_LOCATION),
                Hit.the(Keys.ENTER).into(UtestLoginPage.INPUT_CITY),
                Enter.theValue("050012").into(UtestLoginPage.INPUT_ZIP),
                Click.on(UtestLoginPage.NEXT_BUTTON_DEVICES),
                Hit.the(Keys.ENTER).into(UtestLoginPage.Search_device_OS),
                Hit.the(Keys.ENTER).into(UtestLoginPage.Search_device_version),
                Hit.the(Keys.ENTER).into(UtestLoginPage.Search_device_language),
                Click.on(UtestLoginPage.NEXT_BUTTON_LAST),
                Enter.theValue("Angersito312").into(UtestLoginPage.INPUT_PASSWORD),
                Enter.theValue("Angersito312").into(UtestLoginPage.INPUT_CONFIRM_PASSWORD),

                Click.on(UtestLoginPage.CHECK_UTEST_TERMS),
                Click.on(UtestLoginPage.CHECK_PRIVACY),

                Click.on(UtestLoginPage.NEXT_BUTTON_COMPLETE)

                );

    }
}
