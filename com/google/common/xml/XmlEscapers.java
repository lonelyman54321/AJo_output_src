/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.xml;

import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;
import com.google.common.escape.Escapers$Builder;

public class XmlEscapers {
    private static final char MAX_ASCII_CONTROL_CHAR = '\u001f';
    private static final char MIN_ASCII_CONTROL_CHAR;
    private static final Escaper XML_ATTRIBUTE_ESCAPER;
    private static final Escaper XML_CONTENT_ESCAPER;
    private static final Escaper XML_ESCAPER;

    static {
        char c2;
        char c3;
        char c5;
        Escapers$Builder escapers$Builder = Escapers.builder();
        char c6 = (char)-3;
        char c7 = '\u0000';
        escapers$Builder.setSafeRange('\u0000', c6);
        String string2 = "\ufffd";
        escapers$Builder.setUnsafeReplacement(string2);
        while (true) {
            char c8 = '\u001f';
            c5 = '\r';
            c3 = '\n';
            c2 = '\t';
            if (c7 > c8) break;
            if (c7 != c2 && c7 != c3 && c7 != c5) {
                escapers$Builder.addEscape(c7, string2);
            }
            c7 = (char)(c7 + 1);
        }
        escapers$Builder.addEscape('&', "&amp;");
        escapers$Builder.addEscape('<', "&lt;");
        escapers$Builder.addEscape('>', "&gt;");
        XML_CONTENT_ESCAPER = escapers$Builder.build();
        escapers$Builder.addEscape('\'', "&apos;");
        escapers$Builder.addEscape('\"', "&quot;");
        XML_ESCAPER = escapers$Builder.build();
        escapers$Builder.addEscape(c2, "&#x9;");
        escapers$Builder.addEscape(c3, "&#xA;");
        escapers$Builder.addEscape(c5, "&#xD;");
        XML_ATTRIBUTE_ESCAPER = escapers$Builder.build();
    }

    private XmlEscapers() {
    }

    public static Escaper xmlAttributeEscaper() {
        return XML_ATTRIBUTE_ESCAPER;
    }

    public static Escaper xmlContentEscaper() {
        return XML_CONTENT_ESCAPER;
    }
}

