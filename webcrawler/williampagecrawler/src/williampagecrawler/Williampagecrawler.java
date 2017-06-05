/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package williampagecrawler;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author william
 */
public class Williampagecrawler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Document doc = Jsoup.connect("https://www.limetorrents.cc/search/all/udemy/").get();
            org.jsoup.select.Elements links = doc.select("a href");
            links.forEach ((Element e) -> {
                if ((e.toString().toLowerCase().contains("html")))
                       
                {
                System.out.println(e.attr("abs:href"));
                }
            });
        } catch (IOException ex) {
            Logger.getLogger(Williampagecrawler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
