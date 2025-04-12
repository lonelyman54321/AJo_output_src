/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document$OutputSettings$Syntax;
import org.jsoup.nodes.Entities$CoreCharset;
import org.jsoup.nodes.Entities$EscapeMode;

public class Document$OutputSettings
implements Cloneable {
    private Charset charset;
    Entities$CoreCharset coreCharset;
    private final ThreadLocal encoderThreadLocal;
    private Entities$EscapeMode escapeMode;
    private int indentAmount;
    private int maxPaddingWidth;
    private boolean outline;
    private boolean prettyPrint;
    private Document$OutputSettings$Syntax syntax;

    public Document$OutputSettings() {
        boolean bl2;
        Object object;
        this.escapeMode = object = Entities$EscapeMode.base;
        this.encoderThreadLocal = object;
        this.prettyPrint = bl2 = true;
        this.outline = false;
        this.indentAmount = (int)(bl2 ? 1 : 0);
        this.maxPaddingWidth = 30;
        object = Document$OutputSettings$Syntax.html;
        this.syntax = object;
        object = DataUtil.UTF_8;
        this.charset((Charset)object);
    }

    public Charset charset() {
        return this.charset;
    }

    public Document$OutputSettings charset(String object) {
        object = Charset.forName((String)object);
        this.charset((Charset)object);
        return this;
    }

    public Document$OutputSettings charset(Charset object) {
        this.charset = object;
        object = Entities$CoreCharset.byName(object.name());
        this.coreCharset = object;
        return this;
    }

    public Document$OutputSettings clone() {
        Object object;
        try {
            object = super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            RuntimeException runtimeException = new RuntimeException(cloneNotSupportedException);
            throw runtimeException;
        }
        object = (Document$OutputSettings)object;
        Object object2 = this.charset.name();
        ((Document$OutputSettings)object).charset((String)object2);
        object2 = Entities$EscapeMode.valueOf(this.escapeMode.name());
        ((Document$OutputSettings)object).escapeMode = object2;
        return object;
    }

    public CharsetEncoder encoder() {
        CharsetEncoder charsetEncoder = (CharsetEncoder)this.encoderThreadLocal.get();
        if (charsetEncoder == null) {
            charsetEncoder = this.prepareEncoder();
        }
        return charsetEncoder;
    }

    public Document$OutputSettings escapeMode(Entities$EscapeMode entities$EscapeMode) {
        this.escapeMode = entities$EscapeMode;
        return this;
    }

    public Entities$EscapeMode escapeMode() {
        return this.escapeMode;
    }

    public int indentAmount() {
        return this.indentAmount;
    }

    public Document$OutputSettings indentAmount(int n3) {
        boolean bl2 = n3 >= 0;
        Validate.isTrue(bl2);
        this.indentAmount = n3;
        return this;
    }

    public int maxPaddingWidth() {
        return this.maxPaddingWidth;
    }

    public Document$OutputSettings maxPaddingWidth(int n3) {
        int n4 = -1;
        n4 = n3 >= n4 ? 1 : 0;
        Validate.isTrue(n4 != 0);
        this.maxPaddingWidth = n3;
        return this;
    }

    public Document$OutputSettings outline(boolean bl2) {
        this.outline = bl2;
        return this;
    }

    public boolean outline() {
        return this.outline;
    }

    public CharsetEncoder prepareEncoder() {
        CharsetEncoder charsetEncoder = this.charset.newEncoder();
        this.encoderThreadLocal.set(charsetEncoder);
        return charsetEncoder;
    }

    public Document$OutputSettings prettyPrint(boolean bl2) {
        this.prettyPrint = bl2;
        return this;
    }

    public boolean prettyPrint() {
        return this.prettyPrint;
    }

    public Document$OutputSettings$Syntax syntax() {
        return this.syntax;
    }

    public Document$OutputSettings syntax(Document$OutputSettings$Syntax enum_) {
        this.syntax = enum_;
        Document$OutputSettings$Syntax document$OutputSettings$Syntax = Document$OutputSettings$Syntax.xml;
        if (enum_ == document$OutputSettings$Syntax) {
            enum_ = Entities$EscapeMode.xhtml;
            this.escapeMode((Entities$EscapeMode)enum_);
        }
        return this;
    }
}

