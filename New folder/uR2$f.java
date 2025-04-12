/*
 * Decompiled with CFR 0.152.
 */
import org.xml.sax.Attributes;
import org.xml.sax.ext.DefaultHandler2;

public final class uR2$f
extends DefaultHandler2 {
    public final /* synthetic */ uR2 a;

    public uR2$f(uR2 uR22) {
        this.a = uR22;
    }

    public final void characters(char[] cArray, int n3, int n4) {
        String string2 = new String(cArray, n3, n4);
        this.a.G(string2);
    }

    public final void endDocument() {
        this.a.getClass();
    }

    public final void endElement(String string2, String string3, String string4) {
        this.a.c(string2, string3, string4);
    }

    public final void processingInstruction(String string2, String string3) {
        uR2$i uR2$i = new uR2$i(string3);
        this.a.getClass();
        uR2.z(uR2$i);
        string2.equals("xml-stylesheet");
    }

    public final void startDocument() {
        rR2 rR22;
        uR2 uR22 = this.a;
        uR22.getClass();
        uR22.a = rR22 = new rR2();
    }

    public final void startElement(String string2, String string3, String string4, Attributes attributes) {
        this.a.F(string2, string3, string4, attributes);
    }
}

