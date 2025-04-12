/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Any;
import com.google.protobuf.Any$Builder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Option;
import com.google.protobuf.Option$1;
import com.google.protobuf.OptionOrBuilder;

public final class Option$Builder
extends GeneratedMessageLite$Builder
implements OptionOrBuilder {
    private Option$Builder() {
        Option option = Option.access$000();
        super(option);
    }

    public /* synthetic */ Option$Builder(Option$1 option$1) {
        this();
    }

    public Option$Builder clearName() {
        this.copyOnWrite();
        Option.access$200((Option)this.instance);
        return this;
    }

    public Option$Builder clearValue() {
        this.copyOnWrite();
        Option.access$600((Option)this.instance);
        return this;
    }

    public String getName() {
        return ((Option)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((Option)this.instance).getNameBytes();
    }

    public Any getValue() {
        return ((Option)this.instance).getValue();
    }

    public boolean hasValue() {
        return ((Option)this.instance).hasValue();
    }

    public Option$Builder mergeValue(Any any) {
        this.copyOnWrite();
        Option.access$500((Option)this.instance, any);
        return this;
    }

    public Option$Builder setName(String string2) {
        this.copyOnWrite();
        Option.access$100((Option)this.instance, string2);
        return this;
    }

    public Option$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        Option.access$300((Option)this.instance, byteString);
        return this;
    }

    public Option$Builder setValue(Any$Builder anyOrBuilder) {
        this.copyOnWrite();
        Option option = (Option)this.instance;
        anyOrBuilder = (Any)anyOrBuilder.build();
        Option.access$400(option, (Any)anyOrBuilder);
        return this;
    }

    public Option$Builder setValue(Any any) {
        this.copyOnWrite();
        Option.access$400((Option)this.instance, any);
        return this;
    }
}

