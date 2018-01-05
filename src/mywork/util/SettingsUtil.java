/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mywork.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author jiao
 */
public class SettingsUtil {

    public static String serverIP = "";

    public static String GetServerIPFromSettings() {
        File f = new File("settings.xml");
        if (!f.exists()) {
            return null;
        }

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(f);
            NodeList nl = doc.getElementsByTagName("Settings");
            
            System.out.print(nl.getLength());
            System.out.print(nl.item(0));
            System.out.print(nl.item(0).getFirstChild());
            System.out.print(nl.item(0).getFirstChild().getNodeValue());

            return doc.getElementsByTagName("Settings").item(0).getFirstChild().getNodeValue();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void SetServerIPToSettings(String s) {
        try {
            //创建XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document dom = builder.newDocument();
            
            Element root = dom.getDocumentElement();
            Element elementRoot = dom.createElement("Root");
            Element elementSettings = dom.createElement("Settings");
            elementRoot.appendChild(elementSettings);

            elementSettings.setTextContent(s);
            dom.appendChild(elementRoot);

            //XML转字符串
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            t.setOutputProperty("encoding", "UTF-8");
            //t.setOutputProperty("indent", "yes");

            //File f = new File("settings.xml");

            DOMSource source = new DOMSource();
            source.setNode(dom);
            StreamResult result = new StreamResult();
                      
            result.setOutputStream(new FileOutputStream("settings.xml"));
            t.transform(source, result);
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(SettingsUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(SettingsUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(SettingsUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SettingsUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
