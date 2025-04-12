/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.StringValue;
import com.google.protobuf.StringValue$1;
import com.google.protobuf.StringValueOrBuilder;

public final class StringValue$Builder
extends GeneratedMessageLite$Builder
implements StringValueOrBuilder {
    private StringValue$Builder() {
        StringValue stringValue = StringValue.access$000();
        super(stringValue);
    }

    public /* synthetic */ StringValue$Builder(StringValue$1 stringValue$1) {
        this();
    }

    public StringValue$Builder clearValue() {
        this.copyOnWrite();
        StringValue.access$200((StringValue)this.instance);
        return this;
    }

    public String getValue() {
        return ((StringValue)this.instance).getValue();
    }

    public ByteString getValueBytes() {
        return ((StringValue)this.instance).getValueBytes();
    }

    public StringValue$Builder setValue(String string2) {
        this.copyOnWrite();
        StringValue.access$100((StringValue)this.instance, string2);
        return this;
    }

    public StringValue$Builder setValueBytes(ByteString byteString) {
        this.copyOnWrite();
        StringValue.access$300((StringValue)this.instance, byteString);
        return this;
    }
}

