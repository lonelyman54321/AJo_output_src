/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import com.google.rpc.Status$1;
import com.google.rpc.Status$Builder;
import com.google.rpc.StatusOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Status
extends GeneratedMessageLite
implements StatusOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final Status DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    private int code_;
    private Internal$ProtobufList details_;
    private String message_ = "";

    static {
        Status status;
        DEFAULT_INSTANCE = status = new Status();
        GeneratedMessageLite.registerDefaultInstance(Status.class, status);
    }

    private Status() {
        Internal$ProtobufList internal$ProtobufList;
        this.details_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ Status access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Status status, int n3) {
        status.setCode(n3);
    }

    public static /* synthetic */ void access$1000(Status status) {
        status.clearDetails();
    }

    public static /* synthetic */ void access$1100(Status status, int n3) {
        status.removeDetails(n3);
    }

    public static /* synthetic */ void access$200(Status status) {
        status.clearCode();
    }

    public static /* synthetic */ void access$300(Status status, String string2) {
        status.setMessage(string2);
    }

    public static /* synthetic */ void access$400(Status status) {
        status.clearMessage();
    }

    public static /* synthetic */ void access$500(Status status, ByteString byteString) {
        status.setMessageBytes(byteString);
    }

    public static /* synthetic */ void access$600(Status status, int n3, Any any) {
        status.setDetails(n3, any);
    }

    public static /* synthetic */ void access$700(Status status, Any any) {
        status.addDetails(any);
    }

    public static /* synthetic */ void access$800(Status status, int n3, Any any) {
        status.addDetails(n3, any);
    }

    public static /* synthetic */ void access$900(Status status, Iterable iterable) {
        status.addAllDetails(iterable);
    }

    private void addAllDetails(Iterable iterable) {
        this.ensureDetailsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.details_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addDetails(int n3, Any any) {
        any.getClass();
        this.ensureDetailsIsMutable();
        this.details_.add(n3, any);
    }

    private void addDetails(Any any) {
        any.getClass();
        this.ensureDetailsIsMutable();
        this.details_.add(any);
    }

    private void clearCode() {
        this.code_ = 0;
    }

    private void clearDetails() {
        Internal$ProtobufList internal$ProtobufList;
        this.details_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearMessage() {
        String string2;
        this.message_ = string2 = Status.getDefaultInstance().getMessage();
    }

    private void ensureDetailsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.details_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.details_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Status getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Status$Builder newBuilder() {
        return (Status$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Status$Builder newBuilder(Status status) {
        return (Status$Builder)DEFAULT_INSTANCE.createBuilder(status);
    }

    public static Status parseDelimitedFrom(InputStream inputStream) {
        return (Status)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Status parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Status)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Status parseFrom(ByteString byteString) {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Status parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Status parseFrom(CodedInputStream codedInputStream) {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Status parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Status parseFrom(InputStream inputStream) {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Status parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Status parseFrom(ByteBuffer byteBuffer) {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Status parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Status parseFrom(byte[] byArray) {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Status parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeDetails(int n3) {
        this.ensureDetailsIsMutable();
        this.details_.remove(n3);
    }

    private void setCode(int n3) {
        this.code_ = n3;
    }

    private void setDetails(int n3, Any any) {
        any.getClass();
        this.ensureDetailsIsMutable();
        this.details_.set(n3, any);
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
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Status$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Status.class;
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
                objectArray[0] = "code_";
                objectArray[by2] = "message_";
                objectArray[2] = "details_";
                objectArray[3] = Any.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002\u0208\u0003\u001b", objectArray);
            }
            case 2: {
                return new Status$Builder(null);
            }
            case 1: 
        }
        return new Status();
    }

    public int getCode() {
        return this.code_;
    }

    public Any getDetails(int n3) {
        return (Any)this.details_.get(n3);
    }

    public int getDetailsCount() {
        return this.details_.size();
    }

    public List getDetailsList() {
        return this.details_;
    }

    public AnyOrBuilder getDetailsOrBuilder(int n3) {
        return (AnyOrBuilder)this.details_.get(n3);
    }

    public List getDetailsOrBuilderList() {
        return this.details_;
    }

    public String getMessage() {
        return this.message_;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }
}

