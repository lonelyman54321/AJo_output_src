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
import com.google.rpc.Help$1;
import com.google.rpc.Help$Link$Builder;
import com.google.rpc.Help$LinkOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Help$Link
extends GeneratedMessageLite
implements Help$LinkOrBuilder {
    private static final Help$Link DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    public static final int URL_FIELD_NUMBER = 2;
    private String description_;
    private String url_;

    static {
        Help$Link help$Link;
        DEFAULT_INSTANCE = help$Link = new Help$Link();
        GeneratedMessageLite.registerDefaultInstance(Help$Link.class, help$Link);
    }

    private Help$Link() {
        String string2;
        this.description_ = string2 = "";
        this.url_ = string2;
    }

    public static /* synthetic */ Help$Link access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Help$Link help$Link, String string2) {
        help$Link.setDescription(string2);
    }

    public static /* synthetic */ void access$200(Help$Link help$Link) {
        help$Link.clearDescription();
    }

    public static /* synthetic */ void access$300(Help$Link help$Link, ByteString byteString) {
        help$Link.setDescriptionBytes(byteString);
    }

    public static /* synthetic */ void access$400(Help$Link help$Link, String string2) {
        help$Link.setUrl(string2);
    }

    public static /* synthetic */ void access$500(Help$Link help$Link) {
        help$Link.clearUrl();
    }

    public static /* synthetic */ void access$600(Help$Link help$Link, ByteString byteString) {
        help$Link.setUrlBytes(byteString);
    }

    private void clearDescription() {
        String string2;
        this.description_ = string2 = Help$Link.getDefaultInstance().getDescription();
    }

    private void clearUrl() {
        String string2;
        this.url_ = string2 = Help$Link.getDefaultInstance().getUrl();
    }

    public static Help$Link getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Help$Link$Builder newBuilder() {
        return (Help$Link$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Help$Link$Builder newBuilder(Help$Link help$Link) {
        return (Help$Link$Builder)DEFAULT_INSTANCE.createBuilder(help$Link);
    }

    public static Help$Link parseDelimitedFrom(InputStream inputStream) {
        return (Help$Link)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Help$Link parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Help$Link)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Help$Link parseFrom(ByteString byteString) {
        return (Help$Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Help$Link parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Help$Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Help$Link parseFrom(CodedInputStream codedInputStream) {
        return (Help$Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Help$Link parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Help$Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Help$Link parseFrom(InputStream inputStream) {
        return (Help$Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Help$Link parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Help$Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Help$Link parseFrom(ByteBuffer byteBuffer) {
        return (Help$Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Help$Link parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Help$Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Help$Link parseFrom(byte[] byArray) {
        return (Help$Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Help$Link parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Help$Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDescription(String string2) {
        string2.getClass();
        this.description_ = string2;
    }

    private void setDescriptionBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.description_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setUrl(String string2) {
        string2.getClass();
        this.url_ = string2;
    }

    private void setUrlBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.url_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = Help$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Help$Link.class;
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
                object[0] = "description_";
                object[by2] = "url_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", object);
            }
            case 2: {
                return new Help$Link$Builder(null);
            }
            case 1: 
        }
        return new Help$Link();
    }

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }
}

