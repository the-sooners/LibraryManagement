/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Librarymanagement;

import java.sql.SQLException;

/**
 *
 * @author 26625
 */
public class Main {
    
    protected static LoginMenu_100 lm;
    
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        lm = new LoginMenu_100();
        lm.setLocationRelativeTo(null);
        lm.setVisible(true);
    }
}
