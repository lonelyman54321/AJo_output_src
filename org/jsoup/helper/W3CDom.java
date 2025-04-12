/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.helper;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathFactoryConfigurationException;
import org.jsoup.helper.Validate;
import org.jsoup.helper.W3CDom$W3CBuilder;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document$OutputSettings$Syntax;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.Selector$SelectorParseException;
import org.w3c.dom.DOMException;
import org.w3c.dom.NodeList;

public class W3CDom {
    private static final String ContextNodeProperty = "jsoupContextNode";
    private static final String ContextProperty = "jsoupContextSource";
    public static final String SourceProperty = "jsoupSource";
    public static final String XPathFactoryProperty = "javax.xml.xpath.XPathFactory:jsoup";
    protected DocumentBuilderFactory factory;
    private boolean namespaceAware;

    public W3CDom() {
        DocumentBuilderFactory documentBuilderFactory;
        boolean bl2;
        this.namespaceAware = bl2 = true;
        this.factory = documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(bl2);
    }

    public static HashMap OutputHtml() {
        return W3CDom.methodMap("html");
    }

    public static HashMap OutputXml() {
        return W3CDom.methodMap("xml");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String asString(org.w3c.dom.Document object, Map object2) {
        TransformerException transformerException2;
        block8: {
            Object object3;
            StreamResult streamResult;
            StringWriter stringWriter;
            DOMSource dOMSource;
            block7: {
                try {
                    dOMSource = new DOMSource((org.w3c.dom.Node)object);
                    stringWriter = new StringWriter();
                    streamResult = new StreamResult(stringWriter);
                    object3 = TransformerFactory.newInstance();
                    object3 = ((TransformerFactory)object3).newTransformer();
                    if (object2 == null) break block7;
                    object2 = W3CDom.propertiesFromMap((Map)object2);
                    ((Transformer)object3).setOutputProperties((Properties)object2);
                }
                catch (TransformerException transformerException2) {
                    break block8;
                }
            }
            if ((object2 = object.getDoctype()) != null) {
                String string2;
                object2 = (object = object.getDoctype()).getPublicId();
                boolean bl2 = StringUtil.isBlank((String)object2);
                if (!bl2) {
                    object2 = "doctype-public";
                    string2 = object.getPublicId();
                    ((Transformer)object3).setOutputProperty((String)object2, string2);
                }
                object2 = object.getSystemId();
                bl2 = StringUtil.isBlank((String)object2);
                string2 = "doctype-system";
                if (!bl2) {
                    object = object.getSystemId();
                    ((Transformer)object3).setOutputProperty(string2, (String)object);
                } else {
                    boolean bl3;
                    String string3;
                    object2 = object.getName();
                    bl2 = ((String)object2).equalsIgnoreCase(string3 = "html");
                    if (bl2 && (bl2 = StringUtil.isBlank((String)(object2 = object.getPublicId()))) && (bl3 = StringUtil.isBlank((String)(object = object.getSystemId())))) {
                        object = "about:legacy-compat";
                        ((Transformer)object3).setOutputProperty(string2, (String)object);
                    }
                }
            }
            ((Transformer)object3).transform(dOMSource, streamResult);
            return stringWriter.toString();
        }
        object2 = new IllegalStateException(transformerException2);
        throw object2;
    }

    public static org.w3c.dom.Document convert(Document document) {
        W3CDom w3CDom = new W3CDom();
        return w3CDom.fromJsoup(document);
    }

    private static HashMap methodMap(String string2) {
        return p3.a("method", string2);
    }

    public static Properties propertiesFromMap(Map map2) {
        Properties properties = new Properties();
        properties.putAll((Map<?, ?>)map2);
        return properties;
    }

    public String asString(org.w3c.dom.Document document) {
        return W3CDom.asString(document, null);
    }

    public org.w3c.dom.Node contextNode(org.w3c.dom.Document document) {
        return (org.w3c.dom.Node)document.getUserData(ContextNodeProperty);
    }

    public void convert(Document document, org.w3c.dom.Document document2) {
        this.convert((Element)document, document2);
    }

    public void convert(Element element, org.w3c.dom.Document object) {
        boolean bl2;
        W3CDom$W3CBuilder w3CDom$W3CBuilder = new W3CDom$W3CBuilder((org.w3c.dom.Document)object);
        boolean bl3 = this.namespaceAware;
        W3CDom$W3CBuilder.access$002(w3CDom$W3CBuilder, bl3);
        Document document = element.ownerDocument();
        if (document != null) {
            String string2 = document.location();
            boolean bl4 = StringUtil.isBlank(string2);
            if (!bl4) {
                string2 = document.location();
                object.setDocumentURI(string2);
            }
            object = document.outputSettings().syntax();
            W3CDom$W3CBuilder.access$102(w3CDom$W3CBuilder, (Document$OutputSettings$Syntax)((Object)object));
        }
        if (bl2 = element instanceof Document) {
            element = element.firstElementChild();
        }
        NodeTraversor.traverse((NodeVisitor)w3CDom$W3CBuilder, element);
    }

    public org.w3c.dom.Document fromJsoup(Document document) {
        return this.fromJsoup((Element)document);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public org.w3c.dom.Document fromJsoup(Element element) {
        ParserConfigurationException parserConfigurationException2;
        Object object;
        block9: {
            Object object2;
            Document document;
            Object object3;
            block7: {
                block8: {
                    boolean bl2;
                    Validate.notNull(element);
                    try {
                        object = this.factory;
                        object = ((DocumentBuilderFactory)object).newDocumentBuilder();
                        object3 = ((DocumentBuilder)object).getDOMImplementation();
                        object = ((DocumentBuilder)object).newDocument();
                        document = element.ownerDocument();
                        object2 = document != null ? document.documentType() : null;
                        if (object2 != null) {
                            try {
                                String string2 = ((DocumentType)object2).name();
                                String string3 = ((DocumentType)object2).publicId();
                                object2 = ((DocumentType)object2).systemId();
                                object3 = object3.createDocumentType(string2, string3, (String)object2);
                                object.appendChild((org.w3c.dom.Node)object3);
                            }
                            catch (DOMException dOMException) {}
                        }
                        bl2 = true;
                        object.setXmlStandalone(bl2);
                    }
                    catch (ParserConfigurationException parserConfigurationException2) {}
                    bl2 = element instanceof Document;
                    if (!bl2) break block8;
                    object3 = element.firstElementChild();
                    break block7;
                    break block9;
                }
                object3 = element;
            }
            object2 = ContextProperty;
            object.setUserData((String)object2, object3, null);
            if (document != null) {
                element = document;
            }
            this.convert(element, (org.w3c.dom.Document)object);
            return object;
        }
        object = new IllegalStateException(parserConfigurationException2);
        throw object;
    }

    public W3CDom namespaceAware(boolean bl2) {
        this.namespaceAware = bl2;
        this.factory.setNamespaceAware(bl2);
        return this;
    }

    public boolean namespaceAware() {
        return this.namespaceAware;
    }

    public NodeList selectXpath(String string2, org.w3c.dom.Document document) {
        return this.selectXpath(string2, (org.w3c.dom.Node)document);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public NodeList selectXpath(String string2, org.w3c.dom.Node object) {
        void var2_5;
        Object object2;
        block5: {
            block4: {
                block3: {
                    Validate.notEmptyParam(string2, "xpath");
                    Validate.notNullParam(object, "contextNode");
                    object2 = XPathFactoryProperty;
                    try {
                        object2 = System.getProperty((String)object2);
                        if (object2 == null) break block3;
                        object2 = "jsoup";
                        object2 = XPathFactory.newInstance((String)object2);
                        break block4;
                    }
                    catch (XPathFactoryConfigurationException xPathFactoryConfigurationException) {
                        break block5;
                    }
                    catch (XPathExpressionException xPathExpressionException) {
                        break block5;
                    }
                }
                object2 = XPathFactory.newInstance();
            }
            object2 = ((XPathFactory)object2).newXPath();
            object2 = object2.compile(string2);
            QName qName = XPathConstants.NODESET;
            object = object2.evaluate(object, qName);
            object = (NodeList)object;
            Validate.notNull(object);
            return object;
        }
        String string3 = var2_5.getMessage();
        Object[] objectArray = new Object[]{string2, string3};
        object2 = new Selector$SelectorParseException((Throwable)var2_5, "Could not evaluate XPath query [%s]: %s", objectArray);
        throw object2;
    }

    public List sourceNodes(NodeList nodeList, Class clazz) {
        int n3;
        Validate.notNull(nodeList);
        Validate.notNull(clazz);
        int n4 = nodeList.getLength();
        ArrayList<Object> arrayList = new ArrayList<Object>(n4);
        for (n4 = 0; n4 < (n3 = nodeList.getLength()); ++n4) {
            Object object = nodeList.item(n4);
            String string2 = SourceProperty;
            boolean bl2 = clazz.isInstance(object = object.getUserData(string2));
            if (!bl2) continue;
            object = (Node)clazz.cast(object);
            arrayList.add(object);
        }
        return arrayList;
    }
}

