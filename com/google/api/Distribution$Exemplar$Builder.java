/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Distribution$1;
import com.google.api.Distribution$Exemplar;
import com.google.api.Distribution$ExemplarOrBuilder;
import com.google.protobuf.Any;
import com.google.protobuf.Any$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.Timestamp$Builder;
import java.util.Collections;
import java.util.List;

public final class Distribution$Exemplar$Builder
extends GeneratedMessageLite$Builder
implements Distribution$ExemplarOrBuilder {
    private Distribution$Exemplar$Builder() {
        Distribution$Exemplar distribution$Exemplar = Distribution$Exemplar.access$4000();
        super(distribution$Exemplar);
    }

    public /* synthetic */ Distribution$Exemplar$Builder(Distribution$1 distribution$1) {
        this();
    }

    public Distribution$Exemplar$Builder addAllAttachments(Iterable iterable) {
        this.copyOnWrite();
        Distribution$Exemplar.access$4900((Distribution$Exemplar)this.instance, iterable);
        return this;
    }

    public Distribution$Exemplar$Builder addAttachments(int n3, Any$Builder anyOrBuilder) {
        this.copyOnWrite();
        Distribution$Exemplar distribution$Exemplar = (Distribution$Exemplar)this.instance;
        anyOrBuilder = (Any)anyOrBuilder.build();
        Distribution$Exemplar.access$4800(distribution$Exemplar, n3, (Any)anyOrBuilder);
        return this;
    }

    public Distribution$Exemplar$Builder addAttachments(int n3, Any any) {
        this.copyOnWrite();
        Distribution$Exemplar.access$4800((Distribution$Exemplar)this.instance, n3, any);
        return this;
    }

    public Distribution$Exemplar$Builder addAttachments(Any$Builder anyOrBuilder) {
        this.copyOnWrite();
        Distribution$Exemplar distribution$Exemplar = (Distribution$Exemplar)this.instance;
        anyOrBuilder = (Any)anyOrBuilder.build();
        Distribution$Exemplar.access$4700(distribution$Exemplar, (Any)anyOrBuilder);
        return this;
    }

    public Distribution$Exemplar$Builder addAttachments(Any any) {
        this.copyOnWrite();
        Distribution$Exemplar.access$4700((Distribution$Exemplar)this.instance, any);
        return this;
    }

    public Distribution$Exemplar$Builder clearAttachments() {
        this.copyOnWrite();
        Distribution$Exemplar.access$5000((Distribution$Exemplar)this.instance);
        return this;
    }

    public Distribution$Exemplar$Builder clearTimestamp() {
        this.copyOnWrite();
        Distribution$Exemplar.access$4500((Distribution$Exemplar)this.instance);
        return this;
    }

    public Distribution$Exemplar$Builder clearValue() {
        this.copyOnWrite();
        Distribution$Exemplar.access$4200((Distribution$Exemplar)this.instance);
        return this;
    }

    public Any getAttachments(int n3) {
        return ((Distribution$Exemplar)this.instance).getAttachments(n3);
    }

    public int getAttachmentsCount() {
        return ((Distribution$Exemplar)this.instance).getAttachmentsCount();
    }

    public List getAttachmentsList() {
        return Collections.unmodifiableList(((Distribution$Exemplar)this.instance).getAttachmentsList());
    }

    public Timestamp getTimestamp() {
        return ((Distribution$Exemplar)this.instance).getTimestamp();
    }

    public double getValue() {
        return ((Distribution$Exemplar)this.instance).getValue();
    }

    public boolean hasTimestamp() {
        return ((Distribution$Exemplar)this.instance).hasTimestamp();
    }

    public Distribution$Exemplar$Builder mergeTimestamp(Timestamp timestamp) {
        this.copyOnWrite();
        Distribution$Exemplar.access$4400((Distribution$Exemplar)this.instance, timestamp);
        return this;
    }

    public Distribution$Exemplar$Builder removeAttachments(int n3) {
        this.copyOnWrite();
        Distribution$Exemplar.access$5100((Distribution$Exemplar)this.instance, n3);
        return this;
    }

    public Distribution$Exemplar$Builder setAttachments(int n3, Any$Builder anyOrBuilder) {
        this.copyOnWrite();
        Distribution$Exemplar distribution$Exemplar = (Distribution$Exemplar)this.instance;
        anyOrBuilder = (Any)anyOrBuilder.build();
        Distribution$Exemplar.access$4600(distribution$Exemplar, n3, (Any)anyOrBuilder);
        return this;
    }

    public Distribution$Exemplar$Builder setAttachments(int n3, Any any) {
        this.copyOnWrite();
        Distribution$Exemplar.access$4600((Distribution$Exemplar)this.instance, n3, any);
        return this;
    }

    public Distribution$Exemplar$Builder setTimestamp(Timestamp$Builder timestampOrBuilder) {
        this.copyOnWrite();
        Distribution$Exemplar distribution$Exemplar = (Distribution$Exemplar)this.instance;
        timestampOrBuilder = (Timestamp)timestampOrBuilder.build();
        Distribution$Exemplar.access$4300(distribution$Exemplar, (Timestamp)timestampOrBuilder);
        return this;
    }

    public Distribution$Exemplar$Builder setTimestamp(Timestamp timestamp) {
        this.copyOnWrite();
        Distribution$Exemplar.access$4300((Distribution$Exemplar)this.instance, timestamp);
        return this;
    }

    public Distribution$Exemplar$Builder setValue(double d2) {
        this.copyOnWrite();
        Distribution$Exemplar.access$4100((Distribution$Exemplar)this.instance, d2);
        return this;
    }
}

