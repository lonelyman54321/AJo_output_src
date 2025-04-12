/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.QuotaFailure;
import com.google.rpc.QuotaFailure$1;
import com.google.rpc.QuotaFailure$Violation;
import com.google.rpc.QuotaFailure$Violation$Builder;
import com.google.rpc.QuotaFailureOrBuilder;
import java.util.Collections;
import java.util.List;

public final class QuotaFailure$Builder
extends GeneratedMessageLite$Builder
implements QuotaFailureOrBuilder {
    private QuotaFailure$Builder() {
        QuotaFailure quotaFailure = QuotaFailure.access$800();
        super(quotaFailure);
    }

    public /* synthetic */ QuotaFailure$Builder(QuotaFailure$1 quotaFailure$1) {
        this();
    }

    public QuotaFailure$Builder addAllViolations(Iterable iterable) {
        this.copyOnWrite();
        QuotaFailure.access$1200((QuotaFailure)this.instance, iterable);
        return this;
    }

    public QuotaFailure$Builder addViolations(int n3, QuotaFailure$Violation$Builder quotaFailure$ViolationOrBuilder) {
        this.copyOnWrite();
        QuotaFailure quotaFailure = (QuotaFailure)this.instance;
        quotaFailure$ViolationOrBuilder = (QuotaFailure$Violation)quotaFailure$ViolationOrBuilder.build();
        QuotaFailure.access$1100(quotaFailure, n3, (QuotaFailure$Violation)quotaFailure$ViolationOrBuilder);
        return this;
    }

    public QuotaFailure$Builder addViolations(int n3, QuotaFailure$Violation quotaFailure$Violation) {
        this.copyOnWrite();
        QuotaFailure.access$1100((QuotaFailure)this.instance, n3, quotaFailure$Violation);
        return this;
    }

    public QuotaFailure$Builder addViolations(QuotaFailure$Violation$Builder quotaFailure$ViolationOrBuilder) {
        this.copyOnWrite();
        QuotaFailure quotaFailure = (QuotaFailure)this.instance;
        quotaFailure$ViolationOrBuilder = (QuotaFailure$Violation)quotaFailure$ViolationOrBuilder.build();
        QuotaFailure.access$1000(quotaFailure, (QuotaFailure$Violation)quotaFailure$ViolationOrBuilder);
        return this;
    }

    public QuotaFailure$Builder addViolations(QuotaFailure$Violation quotaFailure$Violation) {
        this.copyOnWrite();
        QuotaFailure.access$1000((QuotaFailure)this.instance, quotaFailure$Violation);
        return this;
    }

    public QuotaFailure$Builder clearViolations() {
        this.copyOnWrite();
        QuotaFailure.access$1300((QuotaFailure)this.instance);
        return this;
    }

    public QuotaFailure$Violation getViolations(int n3) {
        return ((QuotaFailure)this.instance).getViolations(n3);
    }

    public int getViolationsCount() {
        return ((QuotaFailure)this.instance).getViolationsCount();
    }

    public List getViolationsList() {
        return Collections.unmodifiableList(((QuotaFailure)this.instance).getViolationsList());
    }

    public QuotaFailure$Builder removeViolations(int n3) {
        this.copyOnWrite();
        QuotaFailure.access$1400((QuotaFailure)this.instance, n3);
        return this;
    }

    public QuotaFailure$Builder setViolations(int n3, QuotaFailure$Violation$Builder quotaFailure$ViolationOrBuilder) {
        this.copyOnWrite();
        QuotaFailure quotaFailure = (QuotaFailure)this.instance;
        quotaFailure$ViolationOrBuilder = (QuotaFailure$Violation)quotaFailure$ViolationOrBuilder.build();
        QuotaFailure.access$900(quotaFailure, n3, (QuotaFailure$Violation)quotaFailure$ViolationOrBuilder);
        return this;
    }

    public QuotaFailure$Builder setViolations(int n3, QuotaFailure$Violation quotaFailure$Violation) {
        this.copyOnWrite();
        QuotaFailure.access$900((QuotaFailure)this.instance, n3, quotaFailure$Violation);
        return this;
    }
}

