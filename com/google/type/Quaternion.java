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
import com.google.type.Quaternion$1;
import com.google.type.Quaternion$Builder;
import com.google.type.QuaternionOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Quaternion
extends GeneratedMessageLite
implements QuaternionOrBuilder {
    private static final Quaternion DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int W_FIELD_NUMBER = 4;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    public static final int Z_FIELD_NUMBER = 3;
    private double w_;
    private double x_;
    private double y_;
    private double z_;

    static {
        Quaternion quaternion;
        DEFAULT_INSTANCE = quaternion = new Quaternion();
        GeneratedMessageLite.registerDefaultInstance(Quaternion.class, quaternion);
    }

    private Quaternion() {
    }

    public static /* synthetic */ Quaternion access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Quaternion quaternion, double d2) {
        quaternion.setX(d2);
    }

    public static /* synthetic */ void access$200(Quaternion quaternion) {
        quaternion.clearX();
    }

    public static /* synthetic */ void access$300(Quaternion quaternion, double d2) {
        quaternion.setY(d2);
    }

    public static /* synthetic */ void access$400(Quaternion quaternion) {
        quaternion.clearY();
    }

    public static /* synthetic */ void access$500(Quaternion quaternion, double d2) {
        quaternion.setZ(d2);
    }

    public static /* synthetic */ void access$600(Quaternion quaternion) {
        quaternion.clearZ();
    }

    public static /* synthetic */ void access$700(Quaternion quaternion, double d2) {
        quaternion.setW(d2);
    }

    public static /* synthetic */ void access$800(Quaternion quaternion) {
        quaternion.clearW();
    }

    private void clearW() {
        this.w_ = 0.0;
    }

    private void clearX() {
        this.x_ = 0.0;
    }

    private void clearY() {
        this.y_ = 0.0;
    }

    private void clearZ() {
        this.z_ = 0.0;
    }

    public static Quaternion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Quaternion$Builder newBuilder() {
        return (Quaternion$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Quaternion$Builder newBuilder(Quaternion quaternion) {
        return (Quaternion$Builder)DEFAULT_INSTANCE.createBuilder(quaternion);
    }

    public static Quaternion parseDelimitedFrom(InputStream inputStream) {
        return (Quaternion)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quaternion parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Quaternion)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Quaternion parseFrom(ByteString byteString) {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Quaternion parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Quaternion parseFrom(CodedInputStream codedInputStream) {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Quaternion parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Quaternion parseFrom(InputStream inputStream) {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Quaternion parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Quaternion parseFrom(ByteBuffer byteBuffer) {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Quaternion parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Quaternion parseFrom(byte[] byArray) {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Quaternion parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setW(double d2) {
        this.w_ = d2;
    }

    private void setX(double d2) {
        this.x_ = d2;
    }

    private void setY(double d2) {
        this.y_ = d2;
    }

    private void setZ(double d2) {
        this.z_ = d2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Quaternion$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object2 = objectArray.ordinal();
        object2 = object[object2];
        object = null;
        switch (object2) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                objectArray = PARSER;
                if (objectArray != null) return objectArray;
                clazz = Quaternion.class;
                synchronized (clazz) {
                    try {
                        objectArray = PARSER;
                        if (objectArray != null) return objectArray;
                        object = DEFAULT_INSTANCE;
                        PARSER = objectArray = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                objectArray = new Object[4];
                objectArray[0] = "x_";
                objectArray[by2] = "y_";
                objectArray[2] = "z_";
                objectArray[3] = "w_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004\u0000", objectArray);
            }
            case 2: {
                return new Quaternion$Builder(null);
            }
            case 1: 
        }
        return new Quaternion();
    }

    public double getW() {
        return this.w_;
    }

    public double getX() {
        return this.x_;
    }

    public double getY() {
        return this.y_;
    }

    public double getZ() {
        return this.z_;
    }
}

