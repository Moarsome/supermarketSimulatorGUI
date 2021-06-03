/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarketsimulatorgui;

import java.awt.BorderLayout;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author kyliec
 */
public class MainPanel extends JPanel 
{

    private User user;
    private HeaderPanel headerPanel;
    private BodyPanel bodyPanel;
    private FooterPanel footerPanel;
    private InventoryPanel inventoryPanel;
    private IsleMarker isleManagement;
    
    public MainPanel(User user, InventoryPanel inventoryPanel)
    {
        this.inventoryPanel = inventoryPanel;
        this.user = user;
        this.setLayout(new BorderLayout());
        JLayeredPane layeredPane = new JLayeredPane();
        isleManagement = new IsleMarker(this);
        
        headerPanel = new HeaderPanel(this);
        footerPanel = new FooterPanel(this);
        bodyPanel = new BodyPanel(this);
        
        isleManagement.createPanels();
        
        headerPanel.addListeners();
        
        for (int i = 0; i < 9; i++)
        {
            layeredPane.add(isleManagement.getItemPanel(i),JLayeredPane.PALETTE_LAYER);
        }
        
        this.setOpaque (false);

        this.add(footerPanel, BorderLayout.SOUTH);
        
        bodyPanel.setBounds(0,5,750,750);
        
        layeredPane.add(bodyPanel,JLayeredPane.DEFAULT_LAYER);
        
        
        this.add(layeredPane, BorderLayout.CENTER);
        
        this.add(headerPanel, BorderLayout.NORTH);

        this.setVisible(true);
    }
    
    public HeaderPanel getHeaderPanel()
    {
        return this.headerPanel;
    }
    
    public BodyPanel getBodyPanel()
    {
        return this.bodyPanel;
    }
    
    public FooterPanel getFooterPanel()
    {
        return this.footerPanel;
    }
    
    public InventoryPanel getInventoryPanel()
    {
        return this.inventoryPanel;
    }
    
    public IsleMarker getIsleMarker()
    {
        return this.isleManagement;
    }
    
    public User getUser()
    {
        return this.user;
    }
    
    public void enableVisible()
    {
        this.setVisible(true);
    }
}
