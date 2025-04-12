/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.longrunning.DeleteOperationRequest;
import com.google.longrunning.DeleteOperationRequest$1;
import com.google.longrunning.DeleteOperationRequestOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class DeleteOperationRequest$Builder
extends GeneratedMessageLite$Builder
implements DeleteOperationRequestOrBuilder {
    private DeleteOperationRequest$Builder() {
        DeleteOperationRequest deleteOperationRequest = DeleteOperationRequest.access$000();
        super(deleteOperationRequest);
    }

    public /* synthetic */ DeleteOperationRequest$Builder(DeleteOperationRequest$1 deleteOperationRequest$1) {
        this();
    }

    public DeleteOperationRequest$Builder clearName() {
        this.copyOnWrite();
        DeleteOperationRequest.access$200((DeleteOperationRequest)this.instance);
        return this;
    }

    public String getName() {
        return ((DeleteOperationRequest)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((DeleteOperationRequest)this.instance).getNameBytes();
    }

    public DeleteOperationRequest$Builder setName(String string2) {
        this.copyOnWrite();
        DeleteOperationRequest.access$100((DeleteOperationRequest)this.instance, string2);
        return this;
    }

    public DeleteOperationRequest$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        DeleteOperationRequest.access$300((DeleteOperationRequest)this.instance, byteString);
        return this;
    }
}

