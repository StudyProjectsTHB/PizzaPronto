package de.thb.dim.pizzaProntoView.generalGui;

import de.thb.dim.pizzaProntoView.authentication.gui.LoginPanel;
import de.thb.dim.pizzaProntoView.authentication.rest.IAuthenticationRESTController;
import de.thb.dim.pizzaProntoView.customer.rest.ICustomerRESTController;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;

@Getter
@Setter
public class MainPanel extends JPanel {
    private LayoutPanel layoutPanel;
    private LoginPanel loginPanel;

    private IAuthenticationRESTController authenticationRESTController;
    private ICustomerRESTController customerRESTController;

    public MainPanel(IAuthenticationRESTController authenticationRESTController,ICustomerRESTController customerRESTController){
        setAuthenticationRESTController(authenticationRESTController);
        setCustomerRESTController(customerRESTController);

        layoutPanel = new LayoutPanel(customerRESTController);
        loginPanel = new LoginPanel(this);

        setLayout(new CardLayout());

        add(loginPanel, "loginPanel");
        add(layoutPanel, "layoutPanel");
    }

    public void showLayoutPanel(){
        ((CardLayout)getLayout()).show(this, "layoutPanel");
    }
}
