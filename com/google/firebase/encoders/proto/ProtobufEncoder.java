/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.proto.ProtobufDataEncoderContext;
import com.google.firebase.encoders.proto.ProtobufEncoder$Builder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

public class ProtobufEncoder {
    private final ObjectEncoder fallbackEncoder;
    private final Map objectEncoders;
    private final Map valueEncoders;

    public ProtobufEncoder(Map map2, Map map3, ObjectEncoder objectEncoder) {
        this.objectEncoders = map2;
        this.valueEncoders = map3;
        this.fallbackEncoder = objectEncoder;
    }

    public static ProtobufEncoder$Builder builder() {
        ProtobufEncoder$Builder protobufEncoder$Builder = new ProtobufEncoder$Builder();
        return protobufEncoder$Builder;
    }

    public void encode(Object object, OutputStream outputStream) {
        Map map2 = this.objectEncoders;
        Map map3 = this.valueEncoders;
        ObjectEncoder objectEncoder = this.fallbackEncoder;
        ProtobufDataEncoderContext protobufDataEncoderContext = new ProtobufDataEncoderContext(outputStream, map2, map3, objectEncoder);
        protobufDataEncoderContext.encode(object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public byte[] encode(Object object) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.encode(object, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            return byteArrayOutputStream.toByteArray();
        }
    }
}

