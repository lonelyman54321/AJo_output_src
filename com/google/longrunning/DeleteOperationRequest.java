/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.longrunning.DeleteOperationRequest$1;
import com.google.longrunning.DeleteOperationRequest$Builder;
import com.google.longrunning.DeleteOperationRequestOrBuilder;
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

public final class DeleteOperationRequest
extends GeneratedMessageLite
implements DeleteOperationRequestOrBuilder {
    private static final DeleteOperationRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private String name_ = "";

    static {
        DeleteOperationRequest deleteOperationRequest;
        DEFAULT_INSTANCE = deleteOperationRequest = new DeleteOperationRequest();
        GeneratedMessageLite.registerDefaultInstance(DeleteOperationRequest.class, deleteOperationRequest);
    }

    private DeleteOperationRequest() {
    }

    public static /* synthetic */ DeleteOperationRequest access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(DeleteOperationRequest deleteOperationRequest, String string2) {
        deleteOperationRequest.setName(string2);
    }

    public static /* synthetic */ void access$200(DeleteOperationRequest deleteOperationRequest) {
        deleteOperationRequest.clearName();
    }

    public static /* synthetic */ void access$300(DeleteOperationRequest deleteOperationRequest, ByteString byteString) {
        deleteOperationRequest.setNameBytes(byteString);
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = DeleteOperationRequest.getDefaultInstance().getName();
    }

    public static DeleteOperationRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static DeleteOperationRequest$Builder newBuilder() {
        return (DeleteOperationRequest$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DeleteOperationRequest$Builder newBuilder(DeleteOperationRequest deleteOperationRequest) {
        return (DeleteOperationRequest$Builder)DEFAULT_INSTANCE.createBuilder(deleteOperationRequest);
    }

    public static DeleteOperationRequest parseDelimitedFrom(InputStream inputStream) {
        return (DeleteOperationRequest)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeleteOperationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DeleteOperationRequest)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DeleteOperationRequest parseFrom(ByteString byteString) {
        return (DeleteOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DeleteOperationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DeleteOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DeleteOperationRequest parseFrom(CodedInputStream codedInputStream) {
        return (DeleteOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DeleteOperationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DeleteOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DeleteOperationRequest parseFrom(InputStream inputStream) {
        return (DeleteOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DeleteOperationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DeleteOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DeleteOperationRequest parseFrom(ByteBuffer byteBuffer) {
        return (DeleteOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DeleteOperationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DeleteOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DeleteOperationRequest parseFrom(byte[] byArray) {
        return (DeleteOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DeleteOperationRequest parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DeleteOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = DeleteOperationRequest$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = DeleteOperationRequest.class;
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
                object[0] = "name_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", object);
            }
            case 2: {
                return new DeleteOperationRequest$Builder(null);
            }
            case 1: 
        }
        return new DeleteOperationRequest();
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }
}

