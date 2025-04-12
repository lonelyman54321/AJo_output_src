/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.ResourceReference;
import com.google.api.ResourceReference$1;
import com.google.api.ResourceReferenceOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class ResourceReference$Builder
extends GeneratedMessageLite$Builder
implements ResourceReferenceOrBuilder {
    private ResourceReference$Builder() {
        ResourceReference resourceReference = ResourceReference.access$000();
        super(resourceReference);
    }

    public /* synthetic */ ResourceReference$Builder(ResourceReference$1 resourceReference$1) {
        this();
    }

    public ResourceReference$Builder clearChildType() {
        this.copyOnWrite();
        ResourceReference.access$500((ResourceReference)this.instance);
        return this;
    }

    public ResourceReference$Builder clearType() {
        this.copyOnWrite();
        ResourceReference.access$200((ResourceReference)this.instance);
        return this;
    }

    public String getChildType() {
        return ((ResourceReference)this.instance).getChildType();
    }

    public ByteString getChildTypeBytes() {
        return ((ResourceReference)this.instance).getChildTypeBytes();
    }

    public String getType() {
        return ((ResourceReference)this.instance).getType();
    }

    public ByteString getTypeBytes() {
        return ((ResourceReference)this.instance).getTypeBytes();
    }

    public ResourceReference$Builder setChildType(String string2) {
        this.copyOnWrite();
        ResourceReference.access$400((ResourceReference)this.instance, string2);
        return this;
    }

    public ResourceReference$Builder setChildTypeBytes(ByteString byteString) {
        this.copyOnWrite();
        ResourceReference.access$600((ResourceReference)this.instance, byteString);
        return this;
    }

    public ResourceReference$Builder setType(String string2) {
        this.copyOnWrite();
        ResourceReference.access$100((ResourceReference)this.instance, string2);
        return this;
    }

    public ResourceReference$Builder setTypeBytes(ByteString byteString) {
        this.copyOnWrite();
        ResourceReference.access$300((ResourceReference)this.instance, byteString);
        return this;
    }
}

