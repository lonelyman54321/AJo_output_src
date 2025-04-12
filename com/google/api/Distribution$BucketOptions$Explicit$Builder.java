/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Distribution$1;
import com.google.api.Distribution$BucketOptions$Explicit;
import com.google.api.Distribution$BucketOptions$ExplicitOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class Distribution$BucketOptions$Explicit$Builder
extends GeneratedMessageLite$Builder
implements Distribution$BucketOptions$ExplicitOrBuilder {
    private Distribution$BucketOptions$Explicit$Builder() {
        Distribution$BucketOptions$Explicit distribution$BucketOptions$Explicit = Distribution$BucketOptions$Explicit.access$2200();
        super(distribution$BucketOptions$Explicit);
    }

    public /* synthetic */ Distribution$BucketOptions$Explicit$Builder(Distribution$1 distribution$1) {
        this();
    }

    public Distribution$BucketOptions$Explicit$Builder addAllBounds(Iterable iterable) {
        this.copyOnWrite();
        Distribution$BucketOptions$Explicit.access$2500((Distribution$BucketOptions$Explicit)this.instance, iterable);
        return this;
    }

    public Distribution$BucketOptions$Explicit$Builder addBounds(double d2) {
        this.copyOnWrite();
        Distribution$BucketOptions$Explicit.access$2400((Distribution$BucketOptions$Explicit)this.instance, d2);
        return this;
    }

    public Distribution$BucketOptions$Explicit$Builder clearBounds() {
        this.copyOnWrite();
        Distribution$BucketOptions$Explicit.access$2600((Distribution$BucketOptions$Explicit)this.instance);
        return this;
    }

    public double getBounds(int n3) {
        return ((Distribution$BucketOptions$Explicit)this.instance).getBounds(n3);
    }

    public int getBoundsCount() {
        return ((Distribution$BucketOptions$Explicit)this.instance).getBoundsCount();
    }

    public List getBoundsList() {
        return Collections.unmodifiableList(((Distribution$BucketOptions$Explicit)this.instance).getBoundsList());
    }

    public Distribution$BucketOptions$Explicit$Builder setBounds(int n3, double d2) {
        this.copyOnWrite();
        Distribution$BucketOptions$Explicit.access$2300((Distribution$BucketOptions$Explicit)this.instance, n3, d2);
        return this;
    }
}

