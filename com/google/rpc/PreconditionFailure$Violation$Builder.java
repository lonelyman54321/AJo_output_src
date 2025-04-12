/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.PreconditionFailure$1;
import com.google.rpc.PreconditionFailure$Violation;
import com.google.rpc.PreconditionFailure$ViolationOrBuilder;

public final class PreconditionFailure$Violation$Builder
extends GeneratedMessageLite$Builder
implements PreconditionFailure$ViolationOrBuilder {
    private PreconditionFailure$Violation$Builder() {
        PreconditionFailure$Violation preconditionFailure$Violation = PreconditionFailure$Violation.access$000();
        super(preconditionFailure$Violation);
    }

    public /* synthetic */ PreconditionFailure$Violation$Builder(PreconditionFailure$1 preconditionFailure$1) {
        this();
    }

    public PreconditionFailure$Violation$Builder clearDescription() {
        this.copyOnWrite();
        PreconditionFailure$Violation.access$800((PreconditionFailure$Violation)this.instance);
        return this;
    }

    public PreconditionFailure$Violation$Builder clearSubject() {
        this.copyOnWrite();
        PreconditionFailure$Violation.access$500((PreconditionFailure$Violation)this.instance);
        return this;
    }

    public PreconditionFailure$Violation$Builder clearType() {
        this.copyOnWrite();
        PreconditionFailure$Violation.access$200((PreconditionFailure$Violation)this.instance);
        return this;
    }

    public String getDescription() {
        return ((PreconditionFailure$Violation)this.instance).getDescription();
    }

    public ByteString getDescriptionBytes() {
        return ((PreconditionFailure$Violation)this.instance).getDescriptionBytes();
    }

    public String getSubject() {
        return ((PreconditionFailure$Violation)this.instance).getSubject();
    }

    public ByteString getSubjectBytes() {
        return ((PreconditionFailure$Violation)this.instance).getSubjectBytes();
    }

    public String getType() {
        return ((PreconditionFailure$Violation)this.instance).getType();
    }

    public ByteString getTypeBytes() {
        return ((PreconditionFailure$Violation)this.instance).getTypeBytes();
    }

    public PreconditionFailure$Violation$Builder setDescription(String string2) {
        this.copyOnWrite();
        PreconditionFailure$Violation.access$700((PreconditionFailure$Violation)this.instance, string2);
        return this;
    }

    public PreconditionFailure$Violation$Builder setDescriptionBytes(ByteString byteString) {
        this.copyOnWrite();
        PreconditionFailure$Violation.access$900((PreconditionFailure$Violation)this.instance, byteString);
        return this;
    }

    public PreconditionFailure$Violation$Builder setSubject(String string2) {
        this.copyOnWrite();
        PreconditionFailure$Violation.access$400((PreconditionFailure$Violation)this.instance, string2);
        return this;
    }

    public PreconditionFailure$Violation$Builder setSubjectBytes(ByteString byteString) {
        this.copyOnWrite();
        PreconditionFailure$Violation.access$600((PreconditionFailure$Violation)this.instance, byteString);
        return this;
    }

    public PreconditionFailure$Violation$Builder setType(String string2) {
        this.copyOnWrite();
        PreconditionFailure$Violation.access$100((PreconditionFailure$Violation)this.instance, string2);
        return this;
    }

    public PreconditionFailure$Violation$Builder setTypeBytes(ByteString byteString) {
        this.copyOnWrite();
        PreconditionFailure$Violation.access$300((PreconditionFailure$Violation)this.instance, byteString);
        return this;
    }
}

