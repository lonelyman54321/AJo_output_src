/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.longrunning.ListOperationsRequest;
import com.google.longrunning.ListOperationsRequest$1;
import com.google.longrunning.ListOperationsRequestOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class ListOperationsRequest$Builder
extends GeneratedMessageLite$Builder
implements ListOperationsRequestOrBuilder {
    private ListOperationsRequest$Builder() {
        ListOperationsRequest listOperationsRequest = ListOperationsRequest.access$000();
        super(listOperationsRequest);
    }

    public /* synthetic */ ListOperationsRequest$Builder(ListOperationsRequest$1 listOperationsRequest$1) {
        this();
    }

    public ListOperationsRequest$Builder clearFilter() {
        this.copyOnWrite();
        ListOperationsRequest.access$500((ListOperationsRequest)this.instance);
        return this;
    }

    public ListOperationsRequest$Builder clearName() {
        this.copyOnWrite();
        ListOperationsRequest.access$200((ListOperationsRequest)this.instance);
        return this;
    }

    public ListOperationsRequest$Builder clearPageSize() {
        this.copyOnWrite();
        ListOperationsRequest.access$800((ListOperationsRequest)this.instance);
        return this;
    }

    public ListOperationsRequest$Builder clearPageToken() {
        this.copyOnWrite();
        ListOperationsRequest.access$1000((ListOperationsRequest)this.instance);
        return this;
    }

    public String getFilter() {
        return ((ListOperationsRequest)this.instance).getFilter();
    }

    public ByteString getFilterBytes() {
        return ((ListOperationsRequest)this.instance).getFilterBytes();
    }

    public String getName() {
        return ((ListOperationsRequest)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((ListOperationsRequest)this.instance).getNameBytes();
    }

    public int getPageSize() {
        return ((ListOperationsRequest)this.instance).getPageSize();
    }

    public String getPageToken() {
        return ((ListOperationsRequest)this.instance).getPageToken();
    }

    public ByteString getPageTokenBytes() {
        return ((ListOperationsRequest)this.instance).getPageTokenBytes();
    }

    public ListOperationsRequest$Builder setFilter(String string2) {
        this.copyOnWrite();
        ListOperationsRequest.access$400((ListOperationsRequest)this.instance, string2);
        return this;
    }

    public ListOperationsRequest$Builder setFilterBytes(ByteString byteString) {
        this.copyOnWrite();
        ListOperationsRequest.access$600((ListOperationsRequest)this.instance, byteString);
        return this;
    }

    public ListOperationsRequest$Builder setName(String string2) {
        this.copyOnWrite();
        ListOperationsRequest.access$100((ListOperationsRequest)this.instance, string2);
        return this;
    }

    public ListOperationsRequest$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        ListOperationsRequest.access$300((ListOperationsRequest)this.instance, byteString);
        return this;
    }

    public ListOperationsRequest$Builder setPageSize(int n3) {
        this.copyOnWrite();
        ListOperationsRequest.access$700((ListOperationsRequest)this.instance, n3);
        return this;
    }

    public ListOperationsRequest$Builder setPageToken(String string2) {
        this.copyOnWrite();
        ListOperationsRequest.access$900((ListOperationsRequest)this.instance, string2);
        return this;
    }

    public ListOperationsRequest$Builder setPageTokenBytes(ByteString byteString) {
        this.copyOnWrite();
        ListOperationsRequest.access$1100((ListOperationsRequest)this.instance, byteString);
        return this;
    }
}

