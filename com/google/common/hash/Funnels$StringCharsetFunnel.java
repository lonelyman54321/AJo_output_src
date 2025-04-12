/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.Funnel;
import com.google.common.hash.Funnels$StringCharsetFunnel$SerializedForm;
import com.google.common.hash.PrimitiveSink;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;

class Funnels$StringCharsetFunnel
implements Funnel,
Serializable {
    private final Charset charset;

    public Funnels$StringCharsetFunnel(Charset charset) {
        this.charset = charset = (Charset)Preconditions.checkNotNull(charset);
    }

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("Use SerializedForm");
        throw object;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof Funnels$StringCharsetFunnel;
        if (bl2) {
            object = (Funnels$StringCharsetFunnel)object;
            Charset charset = this.charset;
            object = ((Funnels$StringCharsetFunnel)object).charset;
            return charset.equals(object);
        }
        return false;
    }

    public void funnel(CharSequence charSequence, PrimitiveSink primitiveSink) {
        Charset charset = this.charset;
        primitiveSink.putString(charSequence, charset);
    }

    public int hashCode() {
        int n3 = Funnels$StringCharsetFunnel.class.hashCode();
        int n4 = this.charset.hashCode();
        return n3 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Funnels.stringFunnel(");
        String string2 = this.charset.name();
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Object writeReplace() {
        Charset charset = this.charset;
        Funnels$StringCharsetFunnel$SerializedForm funnels$StringCharsetFunnel$SerializedForm = new Funnels$StringCharsetFunnel$SerializedForm(charset);
        return funnels$StringCharsetFunnel$SerializedForm;
    }
}

