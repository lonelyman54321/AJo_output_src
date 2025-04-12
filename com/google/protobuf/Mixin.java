/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Mixin$1;
import com.google.protobuf.Mixin$Builder;
import com.google.protobuf.MixinOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Mixin
extends GeneratedMessageLite
implements MixinOrBuilder {
    private static final Mixin DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_;
    private String root_;

    static {
        Mixin mixin;
        DEFAULT_INSTANCE = mixin = new Mixin();
        GeneratedMessageLite.registerDefaultInstance(Mixin.class, mixin);
    }

    private Mixin() {
        String string2;
        this.name_ = string2 = "";
        this.root_ = string2;
    }

    public static /* synthetic */ Mixin access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Mixin mixin, String string2) {
        mixin.setName(string2);
    }

    public static /* synthetic */ void access$200(Mixin mixin) {
        mixin.clearName();
    }

    public static /* synthetic */ void access$300(Mixin mixin, ByteString byteString) {
        mixin.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(Mixin mixin, String string2) {
        mixin.setRoot(string2);
    }

    public static /* synthetic */ void access$500(Mixin mixin) {
        mixin.clearRoot();
    }

    public static /* synthetic */ void access$600(Mixin mixin, ByteString byteString) {
        mixin.setRootBytes(byteString);
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = Mixin.getDefaultInstance().getName();
    }

    private void clearRoot() {
        String string2;
        this.root_ = string2 = Mixin.getDefaultInstance().getRoot();
    }

    public static Mixin getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Mixin$Builder newBuilder() {
        return (Mixin$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Mixin$Builder newBuilder(Mixin mixin) {
        return (Mixin$Builder)DEFAULT_INSTANCE.createBuilder(mixin);
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream) {
        return (Mixin)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Mixin)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Mixin parseFrom(ByteString byteString) {
        return (Mixin)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Mixin parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Mixin)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Mixin parseFrom(CodedInputStream codedInputStream) {
        return (Mixin)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Mixin parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Mixin)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Mixin parseFrom(InputStream inputStream) {
        return (Mixin)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Mixin parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Mixin)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer) {
        return (Mixin)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Mixin)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Mixin parseFrom(byte[] byArray) {
        return (Mixin)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Mixin parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Mixin)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setName(String string2) {
        string2.getClass();
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.name_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setRoot(String string2) {
        string2.getClass();
        this.root_ = string2;
    }

    private void setRootBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.root_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = Mixin$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Mixin.class;
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
                object[0] = "name_";
                object[by2] = "root_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", object);
            }
            case 2: {
                return new Mixin$Builder(null);
            }
            case 1: 
        }
        return new Mixin();
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public String getRoot() {
        return this.root_;
    }

    public ByteString getRootBytes() {
        return ByteString.copyFromUtf8(this.root_);
    }
}

