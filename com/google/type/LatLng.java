/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import com.google.type.LatLng$1;
import com.google.type.LatLng$Builder;
import com.google.type.LatLngOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class LatLng
extends GeneratedMessageLite
implements LatLngOrBuilder {
    private static final LatLng DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    private double latitude_;
    private double longitude_;

    static {
        LatLng latLng;
        DEFAULT_INSTANCE = latLng = new LatLng();
        GeneratedMessageLite.registerDefaultInstance(LatLng.class, latLng);
    }

    private LatLng() {
    }

    public static /* synthetic */ LatLng access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(LatLng latLng, double d2) {
        latLng.setLatitude(d2);
    }

    public static /* synthetic */ void access$200(LatLng latLng) {
        latLng.clearLatitude();
    }

    public static /* synthetic */ void access$300(LatLng latLng, double d2) {
        latLng.setLongitude(d2);
    }

    public static /* synthetic */ void access$400(LatLng latLng) {
        latLng.clearLongitude();
    }

    private void clearLatitude() {
        this.latitude_ = 0.0;
    }

    private void clearLongitude() {
        this.longitude_ = 0.0;
    }

    public static LatLng getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static LatLng$Builder newBuilder() {
        return (LatLng$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static LatLng$Builder newBuilder(LatLng latLng) {
        return (LatLng$Builder)DEFAULT_INSTANCE.createBuilder(latLng);
    }

    public static LatLng parseDelimitedFrom(InputStream inputStream) {
        return (LatLng)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LatLng parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LatLng)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LatLng parseFrom(ByteString byteString) {
        return (LatLng)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static LatLng parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (LatLng)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LatLng parseFrom(CodedInputStream codedInputStream) {
        return (LatLng)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static LatLng parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LatLng)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static LatLng parseFrom(InputStream inputStream) {
        return (LatLng)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static LatLng parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LatLng)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LatLng parseFrom(ByteBuffer byteBuffer) {
        return (LatLng)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static LatLng parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (LatLng)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LatLng parseFrom(byte[] byArray) {
        return (LatLng)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static LatLng parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (LatLng)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setLatitude(double d2) {
        this.latitude_ = d2;
    }

    private void setLongitude(double d2) {
        this.longitude_ = d2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = LatLng$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object3 = object.ordinal();
        object3 = object2[object3];
        object2 = null;
        switch (object3) {
            default: {
                object = new UnsupportedOperationException();
                throw object;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                object = PARSER;
                if (object != null) return object;
                clazz = LatLng.class;
                synchronized (clazz) {
                    try {
                        object = PARSER;
                        if (object != null) return object;
                        object2 = DEFAULT_INSTANCE;
                        PARSER = object = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object2);
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                object = new Object[2];
                object[0] = "latitude_";
                object[by2] = "longitude_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", object);
            }
            case 2: {
                return new LatLng$Builder(null);
            }
            case 1: 
        }
        return new LatLng();
    }

    public double getLatitude() {
        return this.latitude_;
    }

    public double getLongitude() {
        return this.longitude_;
    }
}

