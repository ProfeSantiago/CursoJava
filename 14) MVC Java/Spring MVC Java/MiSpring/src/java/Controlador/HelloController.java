package Controlador;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import Servicio.HolaServicio;

public class HelloController extends SimpleFormController {

    private HolaServicio helloService; //Instancia del Servicio

    public void setHelloService(HolaServicio helloService) {
        this.helloService = helloService;
    }

    public HelloController() {
        setCommandClass(Nombre.class);
        setCommandName("name");//Instancia del Bean declarada abajo
        setSuccessView("HolaVista");//Pagina Final de la Vista
        setFormView("NombreVista");//Pagina Inicial de la Vista
    }

    @Override
    protected ModelAndView onSubmit(Object command) throws Exception {
        Nombre name = (Nombre) command;
        ModelAndView mv = new ModelAndView(getSuccessView());
        mv.addObject("Mensaje_Saludo", helloService.sayHello(name.getValue()));
        return mv;
    }
}