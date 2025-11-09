/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sz;

import dialogs.LoginPage;
import java.net.URL;

/**
 *
 * @author ADVAN
 */
public class TestURL {
    public static void main(String[] args) {
        try {
            URL url = LoginPage.class.getResource("img/bg_sepatu.jpg");
            System.out.println("URL = " + url);
        } catch (Exception e) {
        }
    }
}
