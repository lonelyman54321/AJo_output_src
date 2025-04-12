/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.Any;
import com.google.protobuf.Any$Builder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.Status;
import com.google.rpc.Status$1;
import com.google.rpc.StatusOrBuilder;
import java.util.Collections;
import java.util.List;

public final class Status$Builder
extends GeneratedMessageLite$Builder
implements StatusOrBuilder {
    private Status$Builder() {
        Status status = Status.access$000();
        super(status);
    }

    public /* synthetic */ Status$Builder(Status$1 status$1) {
        this();
    }

    public Status$Builder addAllDetails(Iterable iterable) {
        this.copyOnWrite();
        Status.access$900((Status)this.instance, iterable);
        return this;
    }

    public Status$Builder addDetails(int n3, Any$Builder anyOrBuilder) {
        this.copyOnWrite();
        Status status = (Status)this.instance;
        anyOrBuilder = (Any)anyOrBuilder.build();
        Status.access$800(status, n3, (Any)anyOrBuilder);
        return this;
    }

    public Status$Builder addDetails(int n3, Any any) {
        this.copyOnWrite();
        Status.access$800((Status)this.instance, n3, any);
        return this;
    }

    public Status$Builder addDetails(Any$Builder anyOrBuilder) {
        this.copyOnWrite();
        Status status = (Status)this.instance;
        anyOrBuilder = (Any)anyOrBuilder.build();
        Status.access$700(status, (Any)anyOrBuilder);
        return this;
    }

    public Status$Builder addDetails(Any any) {
        this.copyOnWrite();
        Status.access$700((Status)this.instance, any);
        return this;
    }

    public Status$Builder clearCode() {
        this.copyOnWrite();
        Status.access$200((Status)this.instance);
        return this;
    }

    public Status$Builder clearDetails() {
        this.copyOnWrite();
        Status.access$1000((Status)this.instance);
        return this;
    }

    public Status$Builder clearMessage() {
        this.copyOnWrite();
        Status.access$400((Status)this.instance);
        return this;
    }

    public int getCode() {
        return ((Status)this.instance).getCode();
    }

    public Any getDetails(int n3) {
        return ((Status)this.instance).getDetails(n3);
    }

    public int getDetailsCount() {
        return ((Status)this.instance).getDetailsCount();
    }

    public List getDetailsList() {
        return Collections.unmodifiableList(((Status)this.instance).getDetailsList());
    }

    public String getMessage() {
        return ((Status)this.instance).getMessage();
    }

    public ByteString getMessageBytes() {
        return ((Status)this.instance).getMessageBytes();
    }

    public Status$Builder removeDetails(int n3) {
        this.copyOnWrite();
        Status.access$1100((Status)this.instance, n3);
        return this;
    }

    public Status$Builder setCode(int n3) {
        this.copyOnWrite();
        Status.access$100((Status)this.instance, n3);
        return this;
    }

    public Status$Builder setDetails(int n3, Any$Builder anyOrBuilder) {
        this.copyOnWrite();
        Status status = (Status)this.instance;
        anyOrBuilder = (Any)anyOrBuilder.build();
        Status.access$600(status, n3, (Any)anyOrBuilder);
        return this;
    }

    public Status$Builder setDetails(int n3, Any any) {
        this.copyOnWrite();
        Status.access$600((Status)this.instance, n3, any);
        return this;
    }

    public Status$Builder setMessage(String string2) {
        this.copyOnWrite();
        Status.access$300((Status)this.instance, string2);
        return this;
    }

    public Status$Builder setMessageBytes(ByteString byteString) {
        this.copyOnWrite();
        Status.access$500((Status)this.instance, byteString);
        return this;
    }
}

