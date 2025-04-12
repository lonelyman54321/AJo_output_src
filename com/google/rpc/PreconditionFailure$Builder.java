/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.PreconditionFailure;
import com.google.rpc.PreconditionFailure$1;
import com.google.rpc.PreconditionFailure$Violation;
import com.google.rpc.PreconditionFailure$Violation$Builder;
import com.google.rpc.PreconditionFailureOrBuilder;
import java.util.Collections;
import java.util.List;

public final class PreconditionFailure$Builder
extends GeneratedMessageLite$Builder
implements PreconditionFailureOrBuilder {
    private PreconditionFailure$Builder() {
        PreconditionFailure preconditionFailure = PreconditionFailure.access$1100();
        super(preconditionFailure);
    }

    public /* synthetic */ PreconditionFailure$Builder(PreconditionFailure$1 preconditionFailure$1) {
        this();
    }

    public PreconditionFailure$Builder addAllViolations(Iterable iterable) {
        this.copyOnWrite();
        PreconditionFailure.access$1500((PreconditionFailure)this.instance, iterable);
        return this;
    }

    public PreconditionFailure$Builder addViolations(int n3, PreconditionFailure$Violation$Builder preconditionFailure$ViolationOrBuilder) {
        this.copyOnWrite();
        PreconditionFailure preconditionFailure = (PreconditionFailure)this.instance;
        preconditionFailure$ViolationOrBuilder = (PreconditionFailure$Violation)preconditionFailure$ViolationOrBuilder.build();
        PreconditionFailure.access$1400(preconditionFailure, n3, (PreconditionFailure$Violation)preconditionFailure$ViolationOrBuilder);
        return this;
    }

    public PreconditionFailure$Builder addViolations(int n3, PreconditionFailure$Violation preconditionFailure$Violation) {
        this.copyOnWrite();
        PreconditionFailure.access$1400((PreconditionFailure)this.instance, n3, preconditionFailure$Violation);
        return this;
    }

    public PreconditionFailure$Builder addViolations(PreconditionFailure$Violation$Builder preconditionFailure$ViolationOrBuilder) {
        this.copyOnWrite();
        PreconditionFailure preconditionFailure = (PreconditionFailure)this.instance;
        preconditionFailure$ViolationOrBuilder = (PreconditionFailure$Violation)preconditionFailure$ViolationOrBuilder.build();
        PreconditionFailure.access$1300(preconditionFailure, (PreconditionFailure$Violation)preconditionFailure$ViolationOrBuilder);
        return this;
    }

    public PreconditionFailure$Builder addViolations(PreconditionFailure$Violation preconditionFailure$Violation) {
        this.copyOnWrite();
        PreconditionFailure.access$1300((PreconditionFailure)this.instance, preconditionFailure$Violation);
        return this;
    }

    public PreconditionFailure$Builder clearViolations() {
        this.copyOnWrite();
        PreconditionFailure.access$1600((PreconditionFailure)this.instance);
        return this;
    }

    public PreconditionFailure$Violation getViolations(int n3) {
        return ((PreconditionFailure)this.instance).getViolations(n3);
    }

    public int getViolationsCount() {
        return ((PreconditionFailure)this.instance).getViolationsCount();
    }

    public List getViolationsList() {
        return Collections.unmodifiableList(((PreconditionFailure)this.instance).getViolationsList());
    }

    public PreconditionFailure$Builder removeViolations(int n3) {
        this.copyOnWrite();
        PreconditionFailure.access$1700((PreconditionFailure)this.instance, n3);
        return this;
    }

    public PreconditionFailure$Builder setViolations(int n3, PreconditionFailure$Violation$Builder preconditionFailure$ViolationOrBuilder) {
        this.copyOnWrite();
        PreconditionFailure preconditionFailure = (PreconditionFailure)this.instance;
        preconditionFailure$ViolationOrBuilder = (PreconditionFailure$Violation)preconditionFailure$ViolationOrBuilder.build();
        PreconditionFailure.access$1200(preconditionFailure, n3, (PreconditionFailure$Violation)preconditionFailure$ViolationOrBuilder);
        return this;
    }

    public PreconditionFailure$Builder setViolations(int n3, PreconditionFailure$Violation preconditionFailure$Violation) {
        this.copyOnWrite();
        PreconditionFailure.access$1200((PreconditionFailure)this.instance, n3, preconditionFailure$Violation);
        return this;
    }
}

