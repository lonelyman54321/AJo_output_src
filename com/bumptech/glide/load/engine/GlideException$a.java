/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

public final class GlideException$a
implements Appendable {
    public final Appendable a;
    public boolean b = true;

    public GlideException$a(Appendable appendable) {
        this.a = appendable;
    }

    public final Appendable append(char c2) {
        char c3 = this.b;
        Appendable appendable = this.a;
        boolean bl2 = false;
        if (c3 != '\u0000') {
            this.b = false;
            String string2 = "  ";
            appendable.append(string2);
        }
        if (c2 == (c3 = '\n')) {
            bl2 = true;
        }
        this.b = bl2;
        appendable.append(c2);
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        int n3 = charSequence.length();
        this.append(charSequence, 0, n3);
        return this;
    }

    public final Appendable append(CharSequence charSequence, int n3, int n4) {
        if (charSequence == null) {
            charSequence = "";
        }
        int n7 = this.b;
        Appendable appendable = this.a;
        boolean bl2 = false;
        if (n7 != 0) {
            this.b = false;
            String string2 = "  ";
            appendable.append(string2);
        }
        if ((n7 = charSequence.length()) > 0) {
            int n8;
            n7 = n4 + -1;
            if ((n7 = (int)charSequence.charAt(n7)) == (n8 = 10)) {
                bl2 = true;
            }
        }
        this.b = bl2;
        appendable.append(charSequence, n3, n4);
        return this;
    }
}

