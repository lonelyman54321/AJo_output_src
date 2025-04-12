/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

class BaseEncoding$4
implements Appendable {
    int charsUntilSeparator;
    final /* synthetic */ int val$afterEveryChars;
    final /* synthetic */ Appendable val$delegate;
    final /* synthetic */ String val$separator;

    public BaseEncoding$4(int n3, Appendable appendable, String string2) {
        this.val$afterEveryChars = n3;
        this.val$delegate = appendable;
        this.val$separator = string2;
        this.charsUntilSeparator = n3;
    }

    public Appendable append(char c2) {
        int n3 = this.charsUntilSeparator;
        if (n3 == 0) {
            Appendable appendable = this.val$delegate;
            String string2 = this.val$separator;
            appendable.append(string2);
            this.charsUntilSeparator = n3 = this.val$afterEveryChars;
        }
        this.val$delegate.append(c2);
        c2 = (char)(this.charsUntilSeparator + -1);
        this.charsUntilSeparator = c2;
        return this;
    }

    public Appendable append(CharSequence object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public Appendable append(CharSequence object, int n3, int n4) {
        object = new UnsupportedOperationException();
        throw object;
    }
}

