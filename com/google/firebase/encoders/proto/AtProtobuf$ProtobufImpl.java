/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.encoders.proto.Protobuf$IntEncoding;

final class AtProtobuf$ProtobufImpl
implements Protobuf {
    private final Protobuf$IntEncoding intEncoding;
    private final int tag;

    public AtProtobuf$ProtobufImpl(int n3, Protobuf$IntEncoding protobuf$IntEncoding) {
        this.tag = n3;
        this.intEncoding = protobuf$IntEncoding;
    }

    public Class annotationType() {
        return Protobuf.class;
    }

    public boolean equals(Object object) {
        Protobuf$IntEncoding protobuf$IntEncoding;
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        int n3 = object instanceof Protobuf;
        if (n3 == 0) {
            return false;
        }
        n3 = this.tag;
        int n4 = (object = (Protobuf)object).tag();
        if (n3 != n4 || !(bl2 = ((Object)((Object)(protobuf$IntEncoding = this.intEncoding))).equals(object = object.intEncoding()))) {
            bl3 = false;
        }
        return bl3;
    }

    public int hashCode() {
        int n3 = this.tag;
        int n4 = 0xDE0D66 ^ n3;
        n3 = ((Object)((Object)this.intEncoding)).hashCode() ^ 0x79AD669E;
        return n4 + n3;
    }

    public Protobuf$IntEncoding intEncoding() {
        return this.intEncoding;
    }

    public int tag() {
        return this.tag;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("@com.google.firebase.encoders.proto.Protobuf(tag=");
        int n3 = this.tag;
        stringBuilder.append(n3);
        stringBuilder.append("intEncoding=");
        Protobuf$IntEncoding protobuf$IntEncoding = this.intEncoding;
        stringBuilder.append((Object)protobuf$IntEncoding);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

