/*
 * Decompiled with CFR 0.152.
 */
package androidx.constraintlayout.core.parser;

public class CLParsingException
extends Exception {
    public final String a;
    public final int b;
    public final String c;

    public CLParsingException(String string2, QG qG) {
        super(string2);
        this.a = string2;
        if (qG != null) {
            this.c = string2 = qG.i();
            string2 = null;
            qG.getClass();
            this.b = 0;
        } else {
            this.c = "unknown";
            string2 = null;
            this.b = 0;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CLParsingException (");
        int n3 = this.hashCode();
        stringBuilder.append(n3);
        stringBuilder.append(") : ");
        CharSequence charSequence = new StringBuilder();
        String string2 = this.a;
        charSequence.append(string2);
        charSequence.append(" (");
        string2 = this.c;
        charSequence.append(string2);
        charSequence.append(" at line ");
        int n4 = this.b;
        charSequence.append(n4);
        charSequence.append(")");
        charSequence = charSequence.toString();
        stringBuilder.append((String)charSequence);
        return stringBuilder.toString();
    }
}

