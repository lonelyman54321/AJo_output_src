/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.longrunning.ListOperationsRequest$1;
import com.google.longrunning.ListOperationsRequest$Builder;
import com.google.longrunning.ListOperationsRequestOrBuilder;
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

public final class ListOperationsRequest
extends GeneratedMessageLite
implements ListOperationsRequestOrBuilder {
    private static final ListOperationsRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    private String filter_;
    private String name_;
    private int pageSize_;
    private String pageToken_;

    static {
        ListOperationsRequest listOperationsRequest;
        DEFAULT_INSTANCE = listOperationsRequest = new ListOperationsRequest();
        GeneratedMessageLite.registerDefaultInstance(ListOperationsRequest.class, listOperationsRequest);
    }

    private ListOperationsRequest() {
        String string2;
        this.name_ = string2 = "";
        this.filter_ = string2;
        this.pageToken_ = string2;
    }

    public static /* synthetic */ ListOperationsRequest access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(ListOperationsRequest listOperationsRequest, String string2) {
        listOperationsRequest.setName(string2);
    }

    public static /* synthetic */ void access$1000(ListOperationsRequest listOperationsRequest) {
        listOperationsRequest.clearPageToken();
    }

    public static /* synthetic */ void access$1100(ListOperationsRequest listOperationsRequest, ByteString byteString) {
        listOperationsRequest.setPageTokenBytes(byteString);
    }

    public static /* synthetic */ void access$200(ListOperationsRequest listOperationsRequest) {
        listOperationsRequest.clearName();
    }

    public static /* synthetic */ void access$300(ListOperationsRequest listOperationsRequest, ByteString byteString) {
        listOperationsRequest.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(ListOperationsRequest listOperationsRequest, String string2) {
        listOperationsRequest.setFilter(string2);
    }

    public static /* synthetic */ void access$500(ListOperationsRequest listOperationsRequest) {
        listOperationsRequest.clearFilter();
    }

    public static /* synthetic */ void access$600(ListOperationsRequest listOperationsRequest, ByteString byteString) {
        listOperationsRequest.setFilterBytes(byteString);
    }

    public static /* synthetic */ void access$700(ListOperationsRequest listOperationsRequest, int n3) {
        listOperationsRequest.setPageSize(n3);
    }

    public static /* synthetic */ void access$800(ListOperationsRequest listOperationsRequest) {
        listOperationsRequest.clearPageSize();
    }

    public static /* synthetic */ void access$900(ListOperationsRequest listOperationsRequest, String string2) {
        listOperationsRequest.setPageToken(string2);
    }

    private void clearFilter() {
        String string2;
        this.filter_ = string2 = ListOperationsRequest.getDefaultInstance().getFilter();
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = ListOperationsRequest.getDefaultInstance().getName();
    }

    private void clearPageSize() {
        this.pageSize_ = 0;
    }

    private void clearPageToken() {
        String string2;
        this.pageToken_ = string2 = ListOperationsRequest.getDefaultInstance().getPageToken();
    }

    public static ListOperationsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ListOperationsRequest$Builder newBuilder() {
        return (ListOperationsRequest$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static ListOperationsRequest$Builder newBuilder(ListOperationsRequest listOperationsRequest) {
        return (ListOperationsRequest$Builder)DEFAULT_INSTANCE.createBuilder(listOperationsRequest);
    }

    public static ListOperationsRequest parseDelimitedFrom(InputStream inputStream) {
        return (ListOperationsRequest)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListOperationsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ListOperationsRequest)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListOperationsRequest parseFrom(ByteString byteString) {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static ListOperationsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ListOperationsRequest parseFrom(CodedInputStream codedInputStream) {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static ListOperationsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static ListOperationsRequest parseFrom(InputStream inputStream) {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static ListOperationsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListOperationsRequest parseFrom(ByteBuffer byteBuffer) {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static ListOperationsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ListOperationsRequest parseFrom(byte[] byArray) {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static ListOperationsRequest parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setFilter(String string2) {
        string2.getClass();
        this.filter_ = string2;
    }

    private void setFilterBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.filter_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setName(String string2) {
        string2.getClass();
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.name_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setPageSize(int n3) {
        this.pageSize_ = n3;
    }

    private void setPageToken(String string2) {
        string2.getClass();
        this.pageToken_ = string2;
    }

    private void setPageTokenBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.pageToken_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = ListOperationsRequest$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = ListOperationsRequest.class;
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
                objectArray[0] = "filter_";
                objectArray[by2] = "pageSize_";
                objectArray[2] = "pageToken_";
                objectArray[3] = "name_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0003\u0208\u0004\u0208", objectArray);
            }
            case 2: {
                return new ListOperationsRequest$Builder(null);
            }
            case 1: 
        }
        return new ListOperationsRequest();
    }

    public String getFilter() {
        return this.filter_;
    }

    public ByteString getFilterBytes() {
        return ByteString.copyFromUtf8(this.filter_);
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public int getPageSize() {
        return this.pageSize_;
    }

    public String getPageToken() {
        return this.pageToken_;
    }

    public ByteString getPageTokenBytes() {
        return ByteString.copyFromUtf8(this.pageToken_);
    }
}

