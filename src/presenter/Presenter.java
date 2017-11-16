package presenter;

import model.Ampelphase;
import model.Model;
import view.PassiveView;

public class Presenter {

    private Model model;
    private PassiveView passiveView;

    public Presenter(PassiveView passiveView) {
        this.passiveView = passiveView;
        this.model = new Model(this);
    }

    public void weiter() {
        model.weiter();
    }

    public void setAmpelzustand(Ampelphase phase) {
        switch (phase) {
            case ROT:
                passiveView.rotAn();
                passiveView.gelbAus();
                passiveView.gruenAus();
                break;
            case ROTGELB:
                passiveView.rotAn();
                passiveView.gelbAn();
                passiveView.gruenAus();
                break;
            case GRUEN:
                passiveView.gruenAn();
                passiveView.gelbAus();
                passiveView.rotAus();
                break;
            case GELB:
                passiveView.rotAus();
                passiveView.gelbAn();
                passiveView.gruenAus();
                break;
        }
    }

}
