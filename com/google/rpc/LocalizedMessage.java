/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import com.google.rpc.LocalizedMessage$1;
import com.google.rpc.LocalizedMessage$Builder;
import com.google.rpc.LocalizedMessageOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class LocalizedMessage
extends GeneratedMessageLite
implements LocalizedMessageOrBuilder {
    private static final LocalizedMessage DEFAULT_INSTANCE;
    public static final int LOCALE_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    private String locale_;
    private String message_;

    static {
        LocalizedMessage localizedMessage;
        DEFAULT_INSTANCE = localizedMessage = new LocalizedMessage();
        GeneratedMessageLite.registerDefaultInstance(LocalizedMessage.class, localizedMessage);
    }

    private LocalizedMessage() {
        String string2;
        this.locale_ = string2 = "";
        this.message_ = string2;
    }

    public static /* synthetic */ LocalizedMessage access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(LocalizedMessage localizedMessage, String string2) {
        localizedMessage.setLocale(string2);
    }

    public static /* synthetic */ void access$200(LocalizedMessage localizedMessage) {
        localizedMessage.clearLocale();
    }

    public static /* synthetic */ void access$300(LocalizedMessage localizedMessage, ByteString byteString) {
        localizedMessage.setLocaleBytes(byteString);
    }

    public static /* synthetic */ void access$400(LocalizedMessage localizedMessage, String string2) {
        localizedMessage.setMessage(string2);
    }

    public static /* synthetic */ void access$500(LocalizedMessage localizedMessage) {
        localizedMessage.clearMessage();
    }

    public static /* synthetic */ void access$600(LocalizedMessage localizedMessage, ByteString byteString) {
        localizedMessage.setMessageBytes(byteString);
    }

    private void clearLocale() {
        String string2;
        this.locale_ = string2 = LocalizedMessage.getDefaultInstance().getLocale();
    }

    private void clearMessage() {
        String string2;
        this.message_ = string2 = LocalizedMessage.getDefaultInstance().getMessage();
    }

    public static LocalizedMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static LocalizedMessage$Builder newBuilder() {
        return (LocalizedMessage$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static LocalizedMessage$Builder newBuilder(LocalizedMessage localizedMessage) {
        return (LocalizedMessage$Builder)DEFAULT_INSTANCE.createBuilder(localizedMessage);
    }

    public static LocalizedMessage parseDelimitedFrom(InputStream inputStream) {
        return (LocalizedMessage)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocalizedMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LocalizedMessage)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LocalizedMessage parseFrom(ByteString byteString) {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static LocalizedMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LocalizedMessage parseFrom(CodedInputStream codedInputStream) {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static LocalizedMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static LocalizedMessage parseFrom(InputStream inputStream) {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static LocalizedMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LocalizedMessage parseFrom(ByteBuffer byteBuffer) {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static LocalizedMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LocalizedMessage parseFrom(byte[] byArray) {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static LocalizedMessage parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setLocale(String string2) {
        string2.getClass();
        this.locale_ = string2;
    }

    private void setLocaleBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.locale_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setMessage(String string2) {
        string2.getClass();
        this.message_ = string2;
    }

    private void setMessageBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.message_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = LocalizedMessage$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = LocalizedMessage.class;
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
                object[0] = "locale_";
                object[by2] = "message_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", object);
            }
            case 2: {
                return new LocalizedMessage$Builder(null);
            }
            case 1: 
        }
        return new LocalizedMessage();
    }

    public String getLocale() {
        return this.locale_;
    }

    public ByteString getLocaleBytes() {
        return ByteString.copyFromUtf8(this.locale_);
    }

    public String getMessage() {
        return this.message_;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }
}

