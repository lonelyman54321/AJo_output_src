/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.QuotaFailure$1;
import com.google.rpc.QuotaFailure$Violation;
import com.google.rpc.QuotaFailure$ViolationOrBuilder;

public final class QuotaFailure$Violation$Builder
extends GeneratedMessageLite$Builder
implements QuotaFailure$ViolationOrBuilder {
    private QuotaFailure$Violation$Builder() {
        QuotaFailure$Violation quotaFailure$Violation = QuotaFailure$Violation.access$000();
        super(quotaFailure$Violation);
    }

    public /* synthetic */ QuotaFailure$Violation$Builder(QuotaFailure$1 quotaFailure$1) {
        this();
    }

    public QuotaFailure$Violation$Builder clearDescription() {
        this.copyOnWrite();
        QuotaFailure$Violation.access$500((QuotaFailure$Violation)this.instance);
        return this;
    }

    public QuotaFailure$Violation$Builder clearSubject() {
        this.copyOnWrite();
        QuotaFailure$Violation.access$200((QuotaFailure$Violation)this.instance);
        return this;
    }

    public String getDescription() {
        return ((QuotaFailure$Violation)this.instance).getDescription();
    }

    public ByteString getDescriptionBytes() {
        return ((QuotaFailure$Violation)this.instance).getDescriptionBytes();
    }

    public String getSubject() {
        return ((QuotaFailure$Violation)this.instance).getSubject();
    }

    public ByteString getSubjectBytes() {
        return ((QuotaFailure$Violation)this.instance).getSubjectBytes();
    }

    public QuotaFailure$Violation$Builder setDescription(String string2) {
        this.copyOnWrite();
        QuotaFailure$Violation.access$400((QuotaFailure$Violation)this.instance, string2);
        return this;
    }

    public QuotaFailure$Violation$Builder setDescriptionBytes(ByteString byteString) {
        this.copyOnWrite();
        QuotaFailure$Violation.access$600((QuotaFailure$Violation)this.instance, byteString);
        return this;
    }

    public QuotaFailure$Violation$Builder setSubject(String string2) {
        this.copyOnWrite();
        QuotaFailure$Violation.access$100((QuotaFailure$Violation)this.instance, string2);
        return this;
    }

    public QuotaFailure$Violation$Builder setSubjectBytes(ByteString byteString) {
        this.copyOnWrite();
        QuotaFailure$Violation.access$300((QuotaFailure$Violation)this.instance, byteString);
        return this;
    }
}

