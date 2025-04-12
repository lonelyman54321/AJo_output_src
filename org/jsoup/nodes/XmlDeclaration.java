/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import java.io.IOException;
import java.util.Iterator;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document$OutputSettings;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.LeafNode;

public class XmlDeclaration
extends LeafNode {
    private final boolean isProcessingInstruction;

    public XmlDeclaration(String string2, boolean bl2) {
        Validate.notNull(string2);
        this.value = string2;
        this.isProcessingInstruction = bl2;
    }

    private void getWholeDeclaration(Appendable appendable, Document$OutputSettings document$OutputSettings) {
        char c2;
        Iterator iterator = this.attributes().iterator();
        while ((c2 = iterator.hasNext()) != '\u0000') {
            Object object = (Attribute)iterator.next();
            Object object2 = ((Attribute)object).getKey();
            Object object3 = ((Attribute)object).getValue();
            object = this.nodeName();
            c2 = ((String)object2).equals(object);
            if (c2 != '\u0000') continue;
            appendable.append(' ');
            appendable.append((CharSequence)object2);
            c2 = ((String)object3).isEmpty();
            if (c2 != '\u0000') continue;
            object = "=\"";
            appendable.append((CharSequence)object);
            boolean bl2 = true;
            Entities.escape(appendable, (String)object3, document$OutputSettings, bl2, false, false, false);
            c2 = '\"';
            appendable.append(c2);
        }
    }

    public XmlDeclaration clone() {
        return (XmlDeclaration)super.clone();
    }

    public String getWholeDeclaration() {
        Object object;
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        try {
            object = new Document$OutputSettings();
        }
        catch (IOException iOException) {
            object = new SerializationException(iOException);
            throw object;
        }
        this.getWholeDeclaration(stringBuilder, (Document$OutputSettings)object);
        return StringUtil.releaseBuilder(stringBuilder).trim();
    }

    public String name() {
        return this.coreValue();
    }

    public String nodeName() {
        return "#declaration";
    }

    public void outerHtmlHead(Appendable appendable, int n3, Document$OutputSettings document$OutputSettings) {
        Appendable appendable2 = appendable.append("<");
        boolean bl2 = this.isProcessingInstruction;
        String string2 = "?";
        String string3 = "!";
        String string4 = bl2 ? string3 : string2;
        appendable2 = appendable2.append(string4);
        string4 = this.coreValue();
        appendable2.append(string4);
        this.getWholeDeclaration(appendable, document$OutputSettings);
        n3 = (int)(this.isProcessingInstruction ? 1 : 0);
        if (n3 != 0) {
            string2 = string3;
        }
        appendable.append(string2).append(">");
    }

    public void outerHtmlTail(Appendable appendable, int n3, Document$OutputSettings document$OutputSettings) {
    }

    public String toString() {
        return this.outerHtml();
    }
}

