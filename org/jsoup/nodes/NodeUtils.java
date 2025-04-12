/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;
import org.jsoup.helper.Validate;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document$OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeIterator;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TreeBuilder;
import org.w3c.dom.NodeList;

final class NodeUtils {
    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Document$OutputSettings outputSettings(Node cloneable) {
        void var0_2;
        Document document = ((Node)cloneable).ownerDocument();
        if (document != null) {
            return var0_2.outputSettings();
        }
        String string2 = "";
        Document document2 = new Document(string2);
        return var0_2.outputSettings();
    }

    public static Parser parser(Node object) {
        Object object2;
        if ((object = ((Node)object).ownerDocument()) != null && (object2 = ((Document)object).parser()) != null) {
            object = ((Document)object).parser();
        } else {
            object2 = new HtmlTreeBuilder();
            object = new Parser((TreeBuilder)object2);
        }
        return object;
    }

    public static List selectXpath(String object, Element object2, Class clazz) {
        Validate.notEmpty((String)object);
        Validate.notNull(object2);
        Validate.notNull(clazz);
        W3CDom w3CDom = new W3CDom();
        w3CDom = w3CDom.namespaceAware(false);
        object2 = w3CDom.fromJsoup((Element)object2);
        object2 = w3CDom.contextNode((org.w3c.dom.Document)object2);
        object = w3CDom.selectXpath((String)object, (org.w3c.dom.Node)object2);
        return w3CDom.sourceNodes((NodeList)object, clazz);
    }

    public static Spliterator spliterator(Iterator iterator) {
        return j42_0.a(iterator);
    }

    public static Stream stream(Node node, Class clazz) {
        NodeIterator nodeIterator = new NodeIterator(node, clazz);
        return mx_1.b(NodeUtils.spliterator(nodeIterator));
    }
}

