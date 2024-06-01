/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import javax.swing.JOptionPane;
import dao.InventoryUtils;

/**
 *
 * @author Ramy_V
 */
public class OpenPdf {

    public static void OpenById(String id) {
        try {
            String billPath = InventoryUtils.billPath + id + ".pdf";
            // Ensure the file path is quoted
            String command = "rundll32 url.dll,FileProtocolHandler \"" + billPath + "\"";
            System.out.println("Executing command: " + command); // Debugging statement
            Process p = Runtime.getRuntime().exec(command);
            p.waitFor(); // Optionally wait for the process to complete
        } catch (Exception e) {
            e.printStackTrace(); // Print stack trace for detailed error information
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
