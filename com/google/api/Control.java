/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Control$1;
import com.google.api.Control$Builder;
import com.google.api.ControlOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Control
extends GeneratedMessageLite
implements ControlOrBuilder {
    private static final Control DEFAULT_INSTANCE;
    public static final int ENVIRONMENT_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private String environment_ = "";

    static {
        Control control;
        DEFAULT_INSTANCE = control = new Control();
        GeneratedMessageLite.registerDefaultInstance(Control.class, control);
    }

    private Control() {
    }

    public static /* synthetic */ Control access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Control control, String string2) {
        control.setEnvironment(string2);
    }

    public static /* synthetic */ void access$200(Control control) {
        control.clearEnvironment();
    }

    public static /* synthetic */ void access$300(Control control, ByteString byteString) {
        control.setEnvironmentBytes(byteString);
    }

    private void clearEnvironment() {
        String string2;
        this.environment_ = string2 = Control.getDefaultInstance().getEnvironment();
    }

    public static Control getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Control$Builder newBuilder() {
        return (Control$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Control$Builder newBuilder(Control control) {
        return (Control$Builder)DEFAULT_INSTANCE.createBuilder(control);
    }

    public static Control parseDelimitedFrom(InputStream inputStream) {
        return (Control)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Control parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Control)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Control parseFrom(ByteString byteString) {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Control parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Control parseFrom(CodedInputStream codedInputStream) {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Control parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Control parseFrom(InputStream inputStream) {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Control parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Control parseFrom(ByteBuffer byteBuffer) {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Control parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Control parseFrom(byte[] byArray) {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Control parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setEnvironment(String string2) {
        string2.getClass();
        this.environment_ = string2;
    }

    private void setEnvironmentBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.environment_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = Control$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Control.class;
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
                object = new Object[by2];
                object[0] = "environment_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", object);
            }
            case 2: {
                return new Control$Builder(null);
            }
            case 1: 
        }
        return new Control();
    }

    public String getEnvironment() {
        return this.environment_;
    }

    public ByteString getEnvironmentBytes() {
        return ByteString.copyFromUtf8(this.environment_);
    }
}

