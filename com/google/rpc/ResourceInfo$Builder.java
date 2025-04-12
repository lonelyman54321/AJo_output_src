/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.ResourceInfo;
import com.google.rpc.ResourceInfo$1;
import com.google.rpc.ResourceInfoOrBuilder;

public final class ResourceInfo$Builder
extends GeneratedMessageLite$Builder
implements ResourceInfoOrBuilder {
    private ResourceInfo$Builder() {
        ResourceInfo resourceInfo = ResourceInfo.access$000();
        super(resourceInfo);
    }

    public /* synthetic */ ResourceInfo$Builder(ResourceInfo$1 resourceInfo$1) {
        this();
    }

    public ResourceInfo$Builder clearDescription() {
        this.copyOnWrite();
        ResourceInfo.access$1100((ResourceInfo)this.instance);
        return this;
    }

    public ResourceInfo$Builder clearOwner() {
        this.copyOnWrite();
        ResourceInfo.access$800((ResourceInfo)this.instance);
        return this;
    }

    public ResourceInfo$Builder clearResourceName() {
        this.copyOnWrite();
        ResourceInfo.access$500((ResourceInfo)this.instance);
        return this;
    }

    public ResourceInfo$Builder clearResourceType() {
        this.copyOnWrite();
        ResourceInfo.access$200((ResourceInfo)this.instance);
        return this;
    }

    public String getDescription() {
        return ((ResourceInfo)this.instance).getDescription();
    }

    public ByteString getDescriptionBytes() {
        return ((ResourceInfo)this.instance).getDescriptionBytes();
    }

    public String getOwner() {
        return ((ResourceInfo)this.instance).getOwner();
    }

    public ByteString getOwnerBytes() {
        return ((ResourceInfo)this.instance).getOwnerBytes();
    }

    public String getResourceName() {
        return ((ResourceInfo)this.instance).getResourceName();
    }

    public ByteString getResourceNameBytes() {
        return ((ResourceInfo)this.instance).getResourceNameBytes();
    }

    public String getResourceType() {
        return ((ResourceInfo)this.instance).getResourceType();
    }

    public ByteString getResourceTypeBytes() {
        return ((ResourceInfo)this.instance).getResourceTypeBytes();
    }

    public ResourceInfo$Builder setDescription(String string2) {
        this.copyOnWrite();
        ResourceInfo.access$1000((ResourceInfo)this.instance, string2);
        return this;
    }

    public ResourceInfo$Builder setDescriptionBytes(ByteString byteString) {
        this.copyOnWrite();
        ResourceInfo.access$1200((ResourceInfo)this.instance, byteString);
        return this;
    }

    public ResourceInfo$Builder setOwner(String string2) {
        this.copyOnWrite();
        ResourceInfo.access$700((ResourceInfo)this.instance, string2);
        return this;
    }

    public ResourceInfo$Builder setOwnerBytes(ByteString byteString) {
        this.copyOnWrite();
        ResourceInfo.access$900((ResourceInfo)this.instance, byteString);
        return this;
    }

    public ResourceInfo$Builder setResourceName(String string2) {
        this.copyOnWrite();
        ResourceInfo.access$400((ResourceInfo)this.instance, string2);
        return this;
    }

    public ResourceInfo$Builder setResourceNameBytes(ByteString byteString) {
        this.copyOnWrite();
        ResourceInfo.access$600((ResourceInfo)this.instance, byteString);
        return this;
    }

    public ResourceInfo$Builder setResourceType(String string2) {
        this.copyOnWrite();
        ResourceInfo.access$100((ResourceInfo)this.instance, string2);
        return this;
    }

    public ResourceInfo$Builder setResourceTypeBytes(ByteString byteString) {
        this.copyOnWrite();
        ResourceInfo.access$300((ResourceInfo)this.instance, byteString);
        return this;
    }
}

