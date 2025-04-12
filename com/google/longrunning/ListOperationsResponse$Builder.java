/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.longrunning.ListOperationsResponse;
import com.google.longrunning.ListOperationsResponse$1;
import com.google.longrunning.ListOperationsResponseOrBuilder;
import com.google.longrunning.Operation;
import com.google.longrunning.Operation$Builder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class ListOperationsResponse$Builder
extends GeneratedMessageLite$Builder
implements ListOperationsResponseOrBuilder {
    private ListOperationsResponse$Builder() {
        ListOperationsResponse listOperationsResponse = ListOperationsResponse.access$000();
        super(listOperationsResponse);
    }

    public /* synthetic */ ListOperationsResponse$Builder(ListOperationsResponse$1 listOperationsResponse$1) {
        this();
    }

    public ListOperationsResponse$Builder addAllOperations(Iterable iterable) {
        this.copyOnWrite();
        ListOperationsResponse.access$400((ListOperationsResponse)this.instance, iterable);
        return this;
    }

    public ListOperationsResponse$Builder addOperations(int n3, Operation$Builder operationOrBuilder) {
        this.copyOnWrite();
        ListOperationsResponse listOperationsResponse = (ListOperationsResponse)this.instance;
        operationOrBuilder = (Operation)operationOrBuilder.build();
        ListOperationsResponse.access$300(listOperationsResponse, n3, (Operation)operationOrBuilder);
        return this;
    }

    public ListOperationsResponse$Builder addOperations(int n3, Operation operation) {
        this.copyOnWrite();
        ListOperationsResponse.access$300((ListOperationsResponse)this.instance, n3, operation);
        return this;
    }

    public ListOperationsResponse$Builder addOperations(Operation$Builder operationOrBuilder) {
        this.copyOnWrite();
        ListOperationsResponse listOperationsResponse = (ListOperationsResponse)this.instance;
        operationOrBuilder = (Operation)operationOrBuilder.build();
        ListOperationsResponse.access$200(listOperationsResponse, (Operation)operationOrBuilder);
        return this;
    }

    public ListOperationsResponse$Builder addOperations(Operation operation) {
        this.copyOnWrite();
        ListOperationsResponse.access$200((ListOperationsResponse)this.instance, operation);
        return this;
    }

    public ListOperationsResponse$Builder clearNextPageToken() {
        this.copyOnWrite();
        ListOperationsResponse.access$800((ListOperationsResponse)this.instance);
        return this;
    }

    public ListOperationsResponse$Builder clearOperations() {
        this.copyOnWrite();
        ListOperationsResponse.access$500((ListOperationsResponse)this.instance);
        return this;
    }

    public String getNextPageToken() {
        return ((ListOperationsResponse)this.instance).getNextPageToken();
    }

    public ByteString getNextPageTokenBytes() {
        return ((ListOperationsResponse)this.instance).getNextPageTokenBytes();
    }

    public Operation getOperations(int n3) {
        return ((ListOperationsResponse)this.instance).getOperations(n3);
    }

    public int getOperationsCount() {
        return ((ListOperationsResponse)this.instance).getOperationsCount();
    }

    public List getOperationsList() {
        return Collections.unmodifiableList(((ListOperationsResponse)this.instance).getOperationsList());
    }

    public ListOperationsResponse$Builder removeOperations(int n3) {
        this.copyOnWrite();
        ListOperationsResponse.access$600((ListOperationsResponse)this.instance, n3);
        return this;
    }

    public ListOperationsResponse$Builder setNextPageToken(String string2) {
        this.copyOnWrite();
        ListOperationsResponse.access$700((ListOperationsResponse)this.instance, string2);
        return this;
    }

    public ListOperationsResponse$Builder setNextPageTokenBytes(ByteString byteString) {
        this.copyOnWrite();
        ListOperationsResponse.access$900((ListOperationsResponse)this.instance, byteString);
        return this;
    }

    public ListOperationsResponse$Builder setOperations(int n3, Operation$Builder operationOrBuilder) {
        this.copyOnWrite();
        ListOperationsResponse listOperationsResponse = (ListOperationsResponse)this.instance;
        operationOrBuilder = (Operation)operationOrBuilder.build();
        ListOperationsResponse.access$100(listOperationsResponse, n3, (Operation)operationOrBuilder);
        return this;
    }

    public ListOperationsResponse$Builder setOperations(int n3, Operation operation) {
        this.copyOnWrite();
        ListOperationsResponse.access$100((ListOperationsResponse)this.instance, n3, operation);
        return this;
    }
}

