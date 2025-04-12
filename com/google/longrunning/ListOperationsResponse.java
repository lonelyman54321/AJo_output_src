/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.longrunning.ListOperationsResponse$1;
import com.google.longrunning.ListOperationsResponse$Builder;
import com.google.longrunning.ListOperationsResponseOrBuilder;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class ListOperationsResponse
extends GeneratedMessageLite
implements ListOperationsResponseOrBuilder {
    private static final ListOperationsResponse DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    public static final int OPERATIONS_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private String nextPageToken_;
    private Internal$ProtobufList operations_;

    static {
        ListOperationsResponse listOperationsResponse;
        DEFAULT_INSTANCE = listOperationsResponse = new ListOperationsResponse();
        GeneratedMessageLite.registerDefaultInstance(ListOperationsResponse.class, listOperationsResponse);
    }

    private ListOperationsResponse() {
        Internal$ProtobufList internal$ProtobufList;
        this.operations_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.nextPageToken_ = "";
    }

    public static /* synthetic */ ListOperationsResponse access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(ListOperationsResponse listOperationsResponse, int n3, Operation operation) {
        listOperationsResponse.setOperations(n3, operation);
    }

    public static /* synthetic */ void access$200(ListOperationsResponse listOperationsResponse, Operation operation) {
        listOperationsResponse.addOperations(operation);
    }

    public static /* synthetic */ void access$300(ListOperationsResponse listOperationsResponse, int n3, Operation operation) {
        listOperationsResponse.addOperations(n3, operation);
    }

    public static /* synthetic */ void access$400(ListOperationsResponse listOperationsResponse, Iterable iterable) {
        listOperationsResponse.addAllOperations(iterable);
    }

    public static /* synthetic */ void access$500(ListOperationsResponse listOperationsResponse) {
        listOperationsResponse.clearOperations();
    }

    public static /* synthetic */ void access$600(ListOperationsResponse listOperationsResponse, int n3) {
        listOperationsResponse.removeOperations(n3);
    }

    public static /* synthetic */ void access$700(ListOperationsResponse listOperationsResponse, String string2) {
        listOperationsResponse.setNextPageToken(string2);
    }

    public static /* synthetic */ void access$800(ListOperationsResponse listOperationsResponse) {
        listOperationsResponse.clearNextPageToken();
    }

    public static /* synthetic */ void access$900(ListOperationsResponse listOperationsResponse, ByteString byteString) {
        listOperationsResponse.setNextPageTokenBytes(byteString);
    }

    private void addAllOperations(Iterable iterable) {
        this.ensureOperationsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.operations_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addOperations(int n3, Operation operation) {
        operation.getClass();
        this.ensureOperationsIsMutable();
        this.operations_.add(n3, operation);
    }

    private void addOperations(Operation operation) {
        operation.getClass();
        this.ensureOperationsIsMutable();
        this.operations_.add(operation);
    }

    private void clearNextPageToken() {
        String string2;
        this.nextPageToken_ = string2 = ListOperationsResponse.getDefaultInstance().getNextPageToken();
    }

    private void clearOperations() {
        Internal$ProtobufList internal$ProtobufList;
        this.operations_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureOperationsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.operations_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.operations_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static ListOperationsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ListOperationsResponse$Builder newBuilder() {
        return (ListOperationsResponse$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static ListOperationsResponse$Builder newBuilder(ListOperationsResponse listOperationsResponse) {
        return (ListOperationsResponse$Builder)DEFAULT_INSTANCE.createBuilder(listOperationsResponse);
    }

    public static ListOperationsResponse parseDelimitedFrom(InputStream inputStream) {
        return (ListOperationsResponse)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListOperationsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ListOperationsResponse)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListOperationsResponse parseFrom(ByteString byteString) {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static ListOperationsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ListOperationsResponse parseFrom(CodedInputStream codedInputStream) {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static ListOperationsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static ListOperationsResponse parseFrom(InputStream inputStream) {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static ListOperationsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListOperationsResponse parseFrom(ByteBuffer byteBuffer) {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static ListOperationsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ListOperationsResponse parseFrom(byte[] byArray) {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static ListOperationsResponse parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeOperations(int n3) {
        this.ensureOperationsIsMutable();
        this.operations_.remove(n3);
    }

    private void setNextPageToken(String string2) {
        string2.getClass();
        this.nextPageToken_ = string2;
    }

    private void setNextPageTokenBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.nextPageToken_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setOperations(int n3, Operation operation) {
        operation.getClass();
        this.ensureOperationsIsMutable();
        this.operations_.set(n3, operation);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = ListOperationsResponse$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = ListOperationsResponse.class;
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
                objectArray = new Object[3];
                objectArray[0] = "operations_";
                objectArray[by2] = Operation.class;
                objectArray[2] = "nextPageToken_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0208", objectArray);
            }
            case 2: {
                return new ListOperationsResponse$Builder(null);
            }
            case 1: 
        }
        return new ListOperationsResponse();
    }

    public String getNextPageToken() {
        return this.nextPageToken_;
    }

    public ByteString getNextPageTokenBytes() {
        return ByteString.copyFromUtf8(this.nextPageToken_);
    }

    public Operation getOperations(int n3) {
        return (Operation)this.operations_.get(n3);
    }

    public int getOperationsCount() {
        return this.operations_.size();
    }

    public List getOperationsList() {
        return this.operations_;
    }

    public OperationOrBuilder getOperationsOrBuilder(int n3) {
        return (OperationOrBuilder)this.operations_.get(n3);
    }

    public List getOperationsOrBuilderList() {
        return this.operations_;
    }
}

