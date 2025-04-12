/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Advice;
import com.google.api.Advice$1;
import com.google.api.AdviceOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class Advice$Builder
extends GeneratedMessageLite$Builder
implements AdviceOrBuilder {
    private Advice$Builder() {
        Advice advice = Advice.access$000();
        super(advice);
    }

    public /* synthetic */ Advice$Builder(Advice$1 advice$1) {
        this();
    }

    public Advice$Builder clearDescription() {
        this.copyOnWrite();
        Advice.access$200((Advice)this.instance);
        return this;
    }

    public String getDescription() {
        return ((Advice)this.instance).getDescription();
    }

    public ByteString getDescriptionBytes() {
        return ((Advice)this.instance).getDescriptionBytes();
    }

    public Advice$Builder setDescription(String string2) {
        this.copyOnWrite();
        Advice.access$100((Advice)this.instance, string2);
        return this;
    }

    public Advice$Builder setDescriptionBytes(ByteString byteString) {
        this.copyOnWrite();
        Advice.access$300((Advice)this.instance, byteString);
        return this;
    }
}

