/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FloatValue;
import com.google.protobuf.FloatValue$Builder;
import com.google.protobuf.FloatValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import com.google.type.Color$1;
import com.google.type.Color$Builder;
import com.google.type.ColorOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Color
extends GeneratedMessageLite
implements ColorOrBuilder {
    public static final int ALPHA_FIELD_NUMBER = 4;
    public static final int BLUE_FIELD_NUMBER = 3;
    private static final Color DEFAULT_INSTANCE;
    public static final int GREEN_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int RED_FIELD_NUMBER = 1;
    private FloatValue alpha_;
    private float blue_;
    private float green_;
    private float red_;

    static {
        Color color2;
        DEFAULT_INSTANCE = color2 = new Color();
        GeneratedMessageLite.registerDefaultInstance(Color.class, color2);
    }

    private Color() {
    }

    public static /* synthetic */ Color access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Color color2, float f5) {
        color2.setRed(f5);
    }

    public static /* synthetic */ void access$200(Color color2) {
        color2.clearRed();
    }

    public static /* synthetic */ void access$300(Color color2, float f5) {
        color2.setGreen(f5);
    }

    public static /* synthetic */ void access$400(Color color2) {
        color2.clearGreen();
    }

    public static /* synthetic */ void access$500(Color color2, float f5) {
        color2.setBlue(f5);
    }

    public static /* synthetic */ void access$600(Color color2) {
        color2.clearBlue();
    }

    public static /* synthetic */ void access$700(Color color2, FloatValue floatValue) {
        color2.setAlpha(floatValue);
    }

    public static /* synthetic */ void access$800(Color color2, FloatValue floatValue) {
        color2.mergeAlpha(floatValue);
    }

    public static /* synthetic */ void access$900(Color color2) {
        color2.clearAlpha();
    }

    private void clearAlpha() {
        this.alpha_ = null;
    }

    private void clearBlue() {
        this.blue_ = 0.0f;
    }

    private void clearGreen() {
        this.green_ = 0.0f;
    }

    private void clearRed() {
        this.red_ = 0.0f;
    }

    public static Color getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAlpha(FloatValue floatValue) {
        FloatValue floatValue2;
        floatValue.getClass();
        FloatValueOrBuilder floatValueOrBuilder = this.alpha_;
        if (floatValueOrBuilder != null && floatValueOrBuilder != (floatValue2 = FloatValue.getDefaultInstance())) {
            floatValueOrBuilder = FloatValue.newBuilder(this.alpha_);
            this.alpha_ = floatValue = (FloatValue)((FloatValue$Builder)((GeneratedMessageLite$Builder)((Object)floatValueOrBuilder)).mergeFrom(floatValue)).buildPartial();
        } else {
            this.alpha_ = floatValue;
        }
    }

    public static Color$Builder newBuilder() {
        return (Color$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Color$Builder newBuilder(Color color2) {
        return (Color$Builder)DEFAULT_INSTANCE.createBuilder(color2);
    }

    public static Color parseDelimitedFrom(InputStream inputStream) {
        return (Color)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Color parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Color)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Color parseFrom(ByteString byteString) {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Color parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Color parseFrom(CodedInputStream codedInputStream) {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Color parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Color parseFrom(InputStream inputStream) {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Color parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Color parseFrom(ByteBuffer byteBuffer) {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Color parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Color parseFrom(byte[] byArray) {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Color parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAlpha(FloatValue floatValue) {
        floatValue.getClass();
        this.alpha_ = floatValue;
    }

    private void setBlue(float f5) {
        this.blue_ = f5;
    }

    private void setGreen(float f5) {
        this.green_ = f5;
    }

    private void setRed(float f5) {
        this.red_ = f5;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Color$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Color.class;
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
                objectArray[0] = "red_";
                objectArray[by2] = "green_";
                objectArray[2] = "blue_";
                objectArray[3] = "alpha_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\t", objectArray);
            }
            case 2: {
                return new Color$Builder(null);
            }
            case 1: 
        }
        return new Color();
    }

    public FloatValue getAlpha() {
        FloatValue floatValue = this.alpha_;
        if (floatValue == null) {
            floatValue = FloatValue.getDefaultInstance();
        }
        return floatValue;
    }

    public float getBlue() {
        return this.blue_;
    }

    public float getGreen() {
        return this.green_;
    }

    public float getRed() {
        return this.red_;
    }

    public boolean hasAlpha() {
        boolean bl2;
        FloatValue floatValue = this.alpha_;
        if (floatValue != null) {
            bl2 = true;
        } else {
            bl2 = false;
            floatValue = null;
        }
        return bl2;
    }
}

