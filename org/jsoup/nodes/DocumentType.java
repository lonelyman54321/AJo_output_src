/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document$OutputSettings;
import org.jsoup.nodes.Document$OutputSettings$Syntax;
import org.jsoup.nodes.LeafNode;

public class DocumentType
extends LeafNode {
    private static final String NAME = "name";
    private static final String PUBLIC_ID = "publicId";
    public static final String PUBLIC_KEY = "PUBLIC";
    private static final String PUB_SYS_KEY = "pubSysKey";
    private static final String SYSTEM_ID = "systemId";
    public static final String SYSTEM_KEY = "SYSTEM";

    public DocumentType(String string2, String string3, String string4) {
        Validate.notNull(string2);
        Validate.notNull(string3);
        Validate.notNull(string4);
        this.attr(NAME, string2);
        this.attr(PUBLIC_ID, string3);
        this.attr(SYSTEM_ID, string4);
        this.updatePubSyskey();
    }

    private boolean has(String string2) {
        return StringUtil.isBlank(this.attr(string2)) ^ true;
    }

    private void updatePubSyskey() {
        String string2 = PUBLIC_ID;
        boolean bl2 = this.has(string2);
        String string3 = PUB_SYS_KEY;
        if (bl2) {
            string2 = PUBLIC_KEY;
            this.attr(string3, string2);
        } else {
            string2 = SYSTEM_ID;
            bl2 = this.has(string2);
            if (bl2) {
                string2 = SYSTEM_KEY;
                this.attr(string3, string2);
            }
        }
    }

    public String name() {
        return this.attr(NAME);
    }

    public String nodeName() {
        return "#doctype";
    }

    public void outerHtmlHead(Appendable appendable, int n3, Document$OutputSettings object) {
        n3 = this.siblingIndex;
        if (n3 > 0 && (n3 = (int)(((Document$OutputSettings)object).prettyPrint() ? 1 : 0)) != 0) {
            n3 = 10;
            appendable.append((char)n3);
        }
        Object object2 = ((Document$OutputSettings)object).syntax();
        object = Document$OutputSettings$Syntax.html;
        String string2 = SYSTEM_ID;
        String string3 = PUBLIC_ID;
        if (object2 == object && (n3 = (int)(this.has(string3) ? 1 : 0)) == 0 && (n3 = (int)(this.has(string2) ? 1 : 0)) == 0) {
            object2 = "<!doctype";
            appendable.append((CharSequence)object2);
        } else {
            object2 = "<!DOCTYPE";
            appendable.append((CharSequence)object2);
        }
        object2 = NAME;
        char c2 = this.has((String)object2);
        String string4 = " ";
        if (c2 != '\u0000') {
            object = appendable.append(string4);
            object2 = this.attr((String)object2);
            object.append((CharSequence)object2);
        }
        if ((c2 = this.has((String)(object2 = PUB_SYS_KEY))) != '\u0000') {
            object = appendable.append(string4);
            object2 = this.attr((String)object2);
            object.append((CharSequence)object2);
        }
        n3 = (int)(this.has(string3) ? 1 : 0);
        c2 = '\"';
        string4 = " \"";
        if (n3 != 0) {
            object2 = appendable.append(string4);
            string3 = this.attr(string3);
            object2 = object2.append(string3);
            object2.append(c2);
        }
        if ((n3 = (int)(this.has(string2) ? 1 : 0)) != 0) {
            object2 = appendable.append(string4);
            string2 = this.attr(string2);
            object2 = object2.append(string2);
            object2.append(c2);
        }
        appendable.append('>');
    }

    public void outerHtmlTail(Appendable appendable, int n3, Document$OutputSettings document$OutputSettings) {
    }

    public String publicId() {
        return this.attr(PUBLIC_ID);
    }

    public void setPubSysKey(String string2) {
        if (string2 != null) {
            String string3 = PUB_SYS_KEY;
            this.attr(string3, string2);
        }
    }

    public String systemId() {
        return this.attr(SYSTEM_ID);
    }
}

