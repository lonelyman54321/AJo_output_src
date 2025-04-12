/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.LabelDescriptor;
import com.google.api.LabelDescriptor$1;
import com.google.api.LabelDescriptor$ValueType;
import com.google.api.LabelDescriptorOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class LabelDescriptor$Builder
extends GeneratedMessageLite$Builder
implements LabelDescriptorOrBuilder {
    private LabelDescriptor$Builder() {
        LabelDescriptor labelDescriptor = LabelDescriptor.access$000();
        super(labelDescriptor);
    }

    public /* synthetic */ LabelDescriptor$Builder(LabelDescriptor$1 labelDescriptor$1) {
        this();
    }

    public LabelDescriptor$Builder clearDescription() {
        this.copyOnWrite();
        LabelDescriptor.access$800((LabelDescriptor)this.instance);
        return this;
    }

    public LabelDescriptor$Builder clearKey() {
        this.copyOnWrite();
        LabelDescriptor.access$200((LabelDescriptor)this.instance);
        return this;
    }

    public LabelDescriptor$Builder clearValueType() {
        this.copyOnWrite();
        LabelDescriptor.access$600((LabelDescriptor)this.instance);
        return this;
    }

    public String getDescription() {
        return ((LabelDescriptor)this.instance).getDescription();
    }

    public ByteString getDescriptionBytes() {
        return ((LabelDescriptor)this.instance).getDescriptionBytes();
    }

    public String getKey() {
        return ((LabelDescriptor)this.instance).getKey();
    }

    public ByteString getKeyBytes() {
        return ((LabelDescriptor)this.instance).getKeyBytes();
    }

    public LabelDescriptor$ValueType getValueType() {
        return ((LabelDescriptor)this.instance).getValueType();
    }

    public int getValueTypeValue() {
        return ((LabelDescriptor)this.instance).getValueTypeValue();
    }

    public LabelDescriptor$Builder setDescription(String string2) {
        this.copyOnWrite();
        LabelDescriptor.access$700((LabelDescriptor)this.instance, string2);
        return this;
    }

    public LabelDescriptor$Builder setDescriptionBytes(ByteString byteString) {
        this.copyOnWrite();
        LabelDescriptor.access$900((LabelDescriptor)this.instance, byteString);
        return this;
    }

    public LabelDescriptor$Builder setKey(String string2) {
        this.copyOnWrite();
        LabelDescriptor.access$100((LabelDescriptor)this.instance, string2);
        return this;
    }

    public LabelDescriptor$Builder setKeyBytes(ByteString byteString) {
        this.copyOnWrite();
        LabelDescriptor.access$300((LabelDescriptor)this.instance, byteString);
        return this;
    }

    public LabelDescriptor$Builder setValueType(LabelDescriptor$ValueType labelDescriptor$ValueType) {
        this.copyOnWrite();
        LabelDescriptor.access$500((LabelDescriptor)this.instance, labelDescriptor$ValueType);
        return this;
    }

    public LabelDescriptor$Builder setValueTypeValue(int n3) {
        this.copyOnWrite();
        LabelDescriptor.access$400((LabelDescriptor)this.instance, n3);
        return this;
    }
}

