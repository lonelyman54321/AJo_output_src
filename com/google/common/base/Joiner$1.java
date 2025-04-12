/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Joiner;

class Joiner$1
extends Joiner {
    final /* synthetic */ Joiner this$0;
    final /* synthetic */ String val$nullText;

    public Joiner$1(Joiner joiner, Joiner joiner2, String string2) {
        this.this$0 = joiner;
        this.val$nullText = string2;
        super(joiner2, null);
    }

    public Joiner skipNulls() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("already specified useForNull");
        throw unsupportedOperationException;
    }

    public CharSequence toString(Object object) {
        if (object == null) {
            object = this.val$nullText;
        } else {
            Joiner joiner = this.this$0;
            object = joiner.toString(object);
        }
        return object;
    }

    public Joiner useForNull(String object) {
        object = new UnsupportedOperationException("already specified useForNull");
        throw object;
    }
}

