/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.xmlpull.v1.XmlPullParser
 */
import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

public final class uR2$j
implements Attributes {
    public XmlPullParser a;

    public final int getIndex(String string2) {
        return -1;
    }

    public final int getIndex(String string2, String string3) {
        return -1;
    }

    public final int getLength() {
        return this.a.getAttributeCount();
    }

    public final String getLocalName(int n3) {
        return this.a.getAttributeName(n3);
    }

    public final String getQName(int n3) {
        XmlPullParser xmlPullParser = this.a;
        String string2 = xmlPullParser.getAttributeName(n3);
        CharSequence charSequence = xmlPullParser.getAttributePrefix(n3);
        if (charSequence != null) {
            charSequence = new StringBuilder();
            String string3 = xmlPullParser.getAttributePrefix(n3);
            ((StringBuilder)charSequence).append(string3);
            n3 = 58;
            ((StringBuilder)charSequence).append((char)n3);
            ((StringBuilder)charSequence).append(string2);
            string2 = ((StringBuilder)charSequence).toString();
        }
        return string2;
    }

    public final String getType(int n3) {
        return null;
    }

    public final String getType(String string2) {
        return null;
    }

    public final String getType(String string2, String string3) {
        return null;
    }

    public final String getURI(int n3) {
        return this.a.getAttributeNamespace(n3);
    }

    public final String getValue(int n3) {
        return this.a.getAttributeValue(n3);
    }

    public final String getValue(String string2) {
        return null;
    }

    public final String getValue(String string2, String string3) {
        return null;
    }
}

