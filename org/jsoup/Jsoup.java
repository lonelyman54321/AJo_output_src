/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document$OutputSettings;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Safelist;

public class Jsoup {
    private Jsoup() {
    }

    public static String clean(String object, String object2, Safelist safelist) {
        object = Jsoup.parseBodyFragment((String)object, (String)object2);
        object2 = new Cleaner(safelist);
        return ((Cleaner)object2).clean((Document)object).body().html();
    }

    public static String clean(String object, String object2, Safelist safelist, Document.OutputSettings outputSettings) {
        object = Jsoup.parseBodyFragment((String)object, (String)object2);
        object2 = new Cleaner(safelist);
        object = ((Cleaner)object2).clean((Document)object);
        ((Document)object).outputSettings(outputSettings);
        return ((Document)object).body().html();
    }

    public static String clean(String string2, Safelist safelist) {
        return Jsoup.clean(string2, "", safelist);
    }

    public static Connection connect(String string2) {
        return HttpConnection.connect(string2);
    }

    public static boolean isValid(String string2, Safelist safelist) {
        Cleaner cleaner = new Cleaner(safelist);
        return cleaner.isValidBodyHtml(string2);
    }

    public static Connection newSession() {
        HttpConnection httpConnection = new HttpConnection();
        return httpConnection;
    }

    public static Document parse(File file) {
        String string2 = file.getAbsolutePath();
        return DataUtil.load(file, null, string2);
    }

    public static Document parse(File file, String string2) {
        String string3 = file.getAbsolutePath();
        return DataUtil.load(file, string2, string3);
    }

    public static Document parse(File file, String string2, String string3) {
        return DataUtil.load(file, string2, string3);
    }

    public static Document parse(File file, String string2, String string3, Parser parser) {
        return DataUtil.load(file, string2, string3, parser);
    }

    public static Document parse(InputStream inputStream, String string2, String string3) {
        return DataUtil.load(inputStream, string2, string3);
    }

    public static Document parse(InputStream inputStream, String string2, String string3, Parser parser) {
        return DataUtil.load(inputStream, string2, string3, parser);
    }

    public static Document parse(String string2) {
        return Parser.parse(string2, "");
    }

    public static Document parse(String string2, String string3) {
        return Parser.parse(string2, string3);
    }

    public static Document parse(String string2, String string3, Parser parser) {
        return parser.parseInput(string2, string3);
    }

    public static Document parse(String string2, Parser parser) {
        return parser.parseInput(string2, "");
    }

    public static Document parse(URL object, int n3) {
        object = HttpConnection.connect((URL)object);
        object.timeout(n3);
        return object.get();
    }

    public static Document parseBodyFragment(String string2) {
        return Parser.parseBodyFragment(string2, "");
    }

    public static Document parseBodyFragment(String string2, String string3) {
        return Parser.parseBodyFragment(string2, string3);
    }
}

