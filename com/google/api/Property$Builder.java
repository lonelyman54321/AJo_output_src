/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Property;
import com.google.api.Property$1;
import com.google.api.Property$PropertyType;
import com.google.api.PropertyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class Property$Builder
extends GeneratedMessageLite$Builder
implements PropertyOrBuilder {
    private Property$Builder() {
        Property property = Property.access$000();
        super(property);
    }

    public /* synthetic */ Property$Builder(Property$1 property$1) {
        this();
    }

    public Property$Builder clearDescription() {
        this.copyOnWrite();
        Property.access$800((Property)this.instance);
        return this;
    }

    public Property$Builder clearName() {
        this.copyOnWrite();
        Property.access$200((Property)this.instance);
        return this;
    }

    public Property$Builder clearType() {
        this.copyOnWrite();
        Property.access$600((Property)this.instance);
        return this;
    }

    public String getDescription() {
        return ((Property)this.instance).getDescription();
    }

    public ByteString getDescriptionBytes() {
        return ((Property)this.instance).getDescriptionBytes();
    }

    public String getName() {
        return ((Property)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((Property)this.instance).getNameBytes();
    }

    public Property$PropertyType getType() {
        return ((Property)this.instance).getType();
    }

    public int getTypeValue() {
        return ((Property)this.instance).getTypeValue();
    }

    public Property$Builder setDescription(String string2) {
        this.copyOnWrite();
        Property.access$700((Property)this.instance, string2);
        return this;
    }

    public Property$Builder setDescriptionBytes(ByteString byteString) {
        this.copyOnWrite();
        Property.access$900((Property)this.instance, byteString);
        return this;
    }

    public Property$Builder setName(String string2) {
        this.copyOnWrite();
        Property.access$100((Property)this.instance, string2);
        return this;
    }

    public Property$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        Property.access$300((Property)this.instance, byteString);
        return this;
    }

    public Property$Builder setType(Property$PropertyType property$PropertyType) {
        this.copyOnWrite();
        Property.access$500((Property)this.instance, property$PropertyType);
        return this;
    }

    public Property$Builder setTypeValue(int n3) {
        this.copyOnWrite();
        Property.access$400((Property)this.instance, n3);
        return this;
    }
}

