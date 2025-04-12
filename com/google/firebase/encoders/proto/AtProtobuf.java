/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.AtProtobuf$ProtobufImpl;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.encoders.proto.Protobuf$IntEncoding;

public final class AtProtobuf {
    private Protobuf$IntEncoding intEncoding;
    private int tag;

    public AtProtobuf() {
        Protobuf$IntEncoding protobuf$IntEncoding;
        this.intEncoding = protobuf$IntEncoding = Protobuf$IntEncoding.DEFAULT;
    }

    public static AtProtobuf builder() {
        AtProtobuf atProtobuf = new AtProtobuf();
        return atProtobuf;
    }

    public Protobuf build() {
        int n3 = this.tag;
        Protobuf$IntEncoding protobuf$IntEncoding = this.intEncoding;
        AtProtobuf$ProtobufImpl atProtobuf$ProtobufImpl = new AtProtobuf$ProtobufImpl(n3, protobuf$IntEncoding);
        return atProtobuf$ProtobufImpl;
    }

    public AtProtobuf intEncoding(Protobuf$IntEncoding protobuf$IntEncoding) {
        this.intEncoding = protobuf$IntEncoding;
        return this;
    }

    public AtProtobuf tag(int n3) {
        this.tag = n3;
        return this;
    }
}

