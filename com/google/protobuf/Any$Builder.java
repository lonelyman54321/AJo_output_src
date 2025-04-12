/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Any;
import com.google.protobuf.Any$1;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class Any$Builder
extends GeneratedMessageLite$Builder
implements AnyOrBuilder {
    private Any$Builder() {
        Any any = Any.access$000();
        super(any);
    }

    public /* synthetic */ Any$Builder(Any$1 any$1) {
        this();
    }

    public Any$Builder clearTypeUrl() {
        this.copyOnWrite();
        Any.access$200((Any)this.instance);
        return this;
    }

    public Any$Builder clearValue() {
        this.copyOnWrite();
        Any.access$500((Any)this.instance);
        return this;
    }

    public String getTypeUrl() {
        return ((Any)this.instance).getTypeUrl();
    }

    public ByteString getTypeUrlBytes() {
        return ((Any)this.instance).getTypeUrlBytes();
    }

    public ByteString getValue() {
        return ((Any)this.instance).getValue();
    }

    public Any$Builder setTypeUrl(String string2) {
        this.copyOnWrite();
        Any.access$100((Any)this.instance, string2);
        return this;
    }

    public Any$Builder setTypeUrlBytes(ByteString byteString) {
        this.copyOnWrite();
        Any.access$300((Any)this.instance, byteString);
        return this;
    }

    public Any$Builder setValue(ByteString byteString) {
        this.copyOnWrite();
        Any.access$400((Any)this.instance, byteString);
        return this;
    }
}

