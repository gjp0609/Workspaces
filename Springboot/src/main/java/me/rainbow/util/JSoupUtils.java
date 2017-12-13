package me.rainbow.util;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * @author guojinpeng
 * @date 17.12.6 09:43
 */
public class JSoupUtils {

    public static Document get(String url) {
        Document doc = null;
        try {
            Connection connection = Jsoup.connect(url);
            doc = connection.get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

    public static void main(String[] args) {
        Document document = get("https://github.com/jhy/jsoup");
        System.out.println(document.title());
        System.out.println(document.location());
    }
}