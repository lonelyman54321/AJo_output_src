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
import com.google.type.Fraction$1;
import com.google.type.Fraction$Builder;
import com.google.type.FractionOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Fraction
extends GeneratedMessageLite
implements FractionOrBuilder {
    private static final Fraction DEFAULT_INSTANCE;
    public static final int DENOMINATOR_FIELD_NUMBER = 2;
    public static final int NUMERATOR_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private long denominator_;
    private long numerator_;

    static {
        Fraction fraction;
        DEFAULT_INSTANCE = fraction = new Fraction();
        GeneratedMessageLite.registerDefaultInstance(Fraction.class, fraction);
    }

    private Fraction() {
    }

    public static /* synthetic */ Fraction access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Fraction fraction, long l2) {
        fraction.setNumerator(l2);
    }

    public static /* synthetic */ void access$200(Fraction fraction) {
        fraction.clearNumerator();
    }

    public static /* synthetic */ void access$300(Fraction fraction, long l2) {
        fraction.setDenominator(l2);
    }

    public static /* synthetic */ void access$400(Fraction fraction) {
        fraction.clearDenominator();
    }

    private void clearDenominator() {
        this.denominator_ = 0L;
    }

    private void clearNumerator() {
        this.numerator_ = 0L;
    }

    public static Fraction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Fraction$Builder newBuilder() {
        return (Fraction$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Fraction$Builder newBuilder(Fraction fraction) {
        return (Fraction$Builder)DEFAULT_INSTANCE.createBuilder(fraction);
    }

    public static Fraction parseDelimitedFrom(InputStream inputStream) {
        return (Fraction)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Fraction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Fraction)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Fraction parseFrom(ByteString byteString) {
        return (Fraction)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Fraction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Fraction)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Fraction parseFrom(CodedInputStream codedInputStream) {
        return (Fraction)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Fraction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Fraction)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Fraction parseFrom(InputStream inputStream) {
        return (Fraction)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Fraction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Fraction)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Fraction parseFrom(ByteBuffer byteBuffer) {
        return (Fraction)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Fraction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Fraction)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Fraction parseFrom(byte[] byArray) {
        return (Fraction)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Fraction parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Fraction)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDenominator(long l2) {
        this.denominator_ = l2;
    }

    private void setNumerator(long l2) {
        this.numerator_ = l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = Fraction$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Fraction.class;
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
                object[0] = "numerator_";
                object[by2] = "denominator_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", object);
            }
            case 2: {
                return new Fraction$Builder(null);
            }
            case 1: 
        }
        return new Fraction();
    }

    public long getDenominator() {
        return this.denominator_;
    }

    public long getNumerator() {
        return this.numerator_;
    }
}

