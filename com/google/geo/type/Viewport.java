/*
 * Decompiled with CFR 0.152.
 */
package com.google.geo.type;

import com.google.geo.type.Viewport$1;
import com.google.geo.type.Viewport$Builder;
import com.google.geo.type.ViewportOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import com.google.type.LatLng;
import com.google.type.LatLng$Builder;
import com.google.type.LatLngOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Viewport
extends GeneratedMessageLite
implements ViewportOrBuilder {
    private static final Viewport DEFAULT_INSTANCE;
    public static final int HIGH_FIELD_NUMBER = 2;
    public static final int LOW_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private LatLng high_;
    private LatLng low_;

    static {
        Viewport viewport;
        DEFAULT_INSTANCE = viewport = new Viewport();
        GeneratedMessageLite.registerDefaultInstance(Viewport.class, viewport);
    }

    private Viewport() {
    }

    public static /* synthetic */ Viewport access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Viewport viewport, LatLng latLng) {
        viewport.setLow(latLng);
    }

    public static /* synthetic */ void access$200(Viewport viewport, LatLng latLng) {
        viewport.mergeLow(latLng);
    }

    public static /* synthetic */ void access$300(Viewport viewport) {
        viewport.clearLow();
    }

    public static /* synthetic */ void access$400(Viewport viewport, LatLng latLng) {
        viewport.setHigh(latLng);
    }

    public static /* synthetic */ void access$500(Viewport viewport, LatLng latLng) {
        viewport.mergeHigh(latLng);
    }

    public static /* synthetic */ void access$600(Viewport viewport) {
        viewport.clearHigh();
    }

    private void clearHigh() {
        this.high_ = null;
    }

    private void clearLow() {
        this.low_ = null;
    }

    public static Viewport getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeHigh(LatLng latLng) {
        LatLng latLng2;
        latLng.getClass();
        LatLngOrBuilder latLngOrBuilder = this.high_;
        if (latLngOrBuilder != null && latLngOrBuilder != (latLng2 = LatLng.getDefaultInstance())) {
            latLngOrBuilder = LatLng.newBuilder(this.high_);
            this.high_ = latLng = (LatLng)((LatLng$Builder)((GeneratedMessageLite$Builder)((Object)latLngOrBuilder)).mergeFrom(latLng)).buildPartial();
        } else {
            this.high_ = latLng;
        }
    }

    private void mergeLow(LatLng latLng) {
        LatLng latLng2;
        latLng.getClass();
        LatLngOrBuilder latLngOrBuilder = this.low_;
        if (latLngOrBuilder != null && latLngOrBuilder != (latLng2 = LatLng.getDefaultInstance())) {
            latLngOrBuilder = LatLng.newBuilder(this.low_);
            this.low_ = latLng = (LatLng)((LatLng$Builder)((GeneratedMessageLite$Builder)((Object)latLngOrBuilder)).mergeFrom(latLng)).buildPartial();
        } else {
            this.low_ = latLng;
        }
    }

    public static Viewport$Builder newBuilder() {
        return (Viewport$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Viewport$Builder newBuilder(Viewport viewport) {
        return (Viewport$Builder)DEFAULT_INSTANCE.createBuilder(viewport);
    }

    public static Viewport parseDelimitedFrom(InputStream inputStream) {
        return (Viewport)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Viewport parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Viewport)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Viewport parseFrom(ByteString byteString) {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Viewport parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Viewport parseFrom(CodedInputStream codedInputStream) {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Viewport parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Viewport parseFrom(InputStream inputStream) {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Viewport parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Viewport parseFrom(ByteBuffer byteBuffer) {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Viewport parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Viewport parseFrom(byte[] byArray) {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Viewport parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setHigh(LatLng latLng) {
        latLng.getClass();
        this.high_ = latLng;
    }

    private void setLow(LatLng latLng) {
        latLng.getClass();
        this.low_ = latLng;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = Viewport$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Viewport.class;
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
                object[0] = "low_";
                object[by2] = "high_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", object);
            }
            case 2: {
                return new Viewport$Builder(null);
            }
            case 1: 
        }
        return new Viewport();
    }

    public LatLng getHigh() {
        LatLng latLng = this.high_;
        if (latLng == null) {
            latLng = LatLng.getDefaultInstance();
        }
        return latLng;
    }

    public LatLng getLow() {
        LatLng latLng = this.low_;
        if (latLng == null) {
            latLng = LatLng.getDefaultInstance();
        }
        return latLng;
    }

    public boolean hasHigh() {
        boolean bl2;
        LatLng latLng = this.high_;
        if (latLng != null) {
            bl2 = true;
        } else {
            bl2 = false;
            latLng = null;
        }
        return bl2;
    }

    public boolean hasLow() {
        boolean bl2;
        LatLng latLng = this.low_;
        if (latLng != null) {
            bl2 = true;
        } else {
            bl2 = false;
            latLng = null;
        }
        return bl2;
    }
}

