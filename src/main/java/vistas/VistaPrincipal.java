package vistas;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.exito.com/")
public class VistaPrincipal extends PageObject {


    public static final Target INPUT_BUSCAR_ARTICULO = Target.the("Caja de texto de busqueda de articulo").locatedBy("//input[@type='text']");
    public static final Target LINK_TEMA = Target.the("link de tema que contiene muchas categorias").locatedBy("//li[@data-currenttabindex]//a[contains(text(),'{0}')]");

    //public static final Target LINK_PRINCIPAL_MENU = Target.the("Caja de texto de busqueda de articulo").locatedBy("//svg[@id='menu_hamburguesa']");
    public static final Target LINK_PRINCIPAL_MENU = Target.the("Caja de texto de busqueda de articulo").locatedBy("//div[@data-fs-menu-icon-container='true']");

    //public static final Target LINK_CATEGORY = Target.the("link de categorias").locatedBy("(//p[contains(text(),'{0}')])[1]");
    public static final Target LINK_CATEGORY = Target.the("link de categorias").locatedBy("(//*[contains(@href,'flecha')])[3]");


}
