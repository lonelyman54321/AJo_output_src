/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import java.util.Arrays;

public final class EncodedPayload {
    private final byte[] bytes;
    private final Encoding encoding;

    public EncodedPayload(Encoding object, byte[] byArray) {
        if (object != null) {
            if (byArray != null) {
                this.encoding = object;
                this.bytes = byArray;
                return;
            }
            object = new NullPointerException("bytes is null");
            throw object;
        }
        object = new NullPointerException("encoding is null");
        throw object;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof EncodedPayload;
        if (!bl2) {
            return false;
        }
        object = (EncodedPayload)object;
        Object object2 = this.encoding;
        Encoding encoding = ((EncodedPayload)object).encoding;
        bl2 = ((Encoding)object2).equals(encoding);
        if (!bl2) {
            return false;
        }
        object2 = this.bytes;
        object = ((EncodedPayload)object).bytes;
        return Arrays.equals((byte[])object2, (byte[])object);
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public Encoding getEncoding() {
        return this.encoding;
    }

    public int hashCode() {
        int n3 = this.encoding.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        n4 = Arrays.hashCode(this.bytes);
        return n3 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("EncodedPayload{encoding=");
        Encoding encoding = this.encoding;
        stringBuilder.append(encoding);
        stringBuilder.append(", bytes=[...]}");
        return stringBuilder.toString();
    }
}

