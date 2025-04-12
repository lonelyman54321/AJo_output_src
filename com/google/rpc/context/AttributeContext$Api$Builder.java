/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.context.AttributeContext$1;
import com.google.rpc.context.AttributeContext$Api;
import com.google.rpc.context.AttributeContext$ApiOrBuilder;

public final class AttributeContext$Api$Builder
extends GeneratedMessageLite$Builder
implements AttributeContext$ApiOrBuilder {
    private AttributeContext$Api$Builder() {
        AttributeContext$Api attributeContext$Api = AttributeContext$Api.access$1400();
        super(attributeContext$Api);
    }

    public /* synthetic */ AttributeContext$Api$Builder(AttributeContext$1 attributeContext$1) {
        this();
    }

    public AttributeContext$Api$Builder clearOperation() {
        this.copyOnWrite();
        AttributeContext$Api.access$1900((AttributeContext$Api)this.instance);
        return this;
    }

    public AttributeContext$Api$Builder clearProtocol() {
        this.copyOnWrite();
        AttributeContext$Api.access$2200((AttributeContext$Api)this.instance);
        return this;
    }

    public AttributeContext$Api$Builder clearService() {
        this.copyOnWrite();
        AttributeContext$Api.access$1600((AttributeContext$Api)this.instance);
        return this;
    }

    public AttributeContext$Api$Builder clearVersion() {
        this.copyOnWrite();
        AttributeContext$Api.access$2500((AttributeContext$Api)this.instance);
        return this;
    }

    public String getOperation() {
        return ((AttributeContext$Api)this.instance).getOperation();
    }

    public ByteString getOperationBytes() {
        return ((AttributeContext$Api)this.instance).getOperationBytes();
    }

    public String getProtocol() {
        return ((AttributeContext$Api)this.instance).getProtocol();
    }

    public ByteString getProtocolBytes() {
        return ((AttributeContext$Api)this.instance).getProtocolBytes();
    }

    public String getService() {
        return ((AttributeContext$Api)this.instance).getService();
    }

    public ByteString getServiceBytes() {
        return ((AttributeContext$Api)this.instance).getServiceBytes();
    }

    public String getVersion() {
        return ((AttributeContext$Api)this.instance).getVersion();
    }

    public ByteString getVersionBytes() {
        return ((AttributeContext$Api)this.instance).getVersionBytes();
    }

    public AttributeContext$Api$Builder setOperation(String string2) {
        this.copyOnWrite();
        AttributeContext$Api.access$1800((AttributeContext$Api)this.instance, string2);
        return this;
    }

    public AttributeContext$Api$Builder setOperationBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Api.access$2000((AttributeContext$Api)this.instance, byteString);
        return this;
    }

    public AttributeContext$Api$Builder setProtocol(String string2) {
        this.copyOnWrite();
        AttributeContext$Api.access$2100((AttributeContext$Api)this.instance, string2);
        return this;
    }

    public AttributeContext$Api$Builder setProtocolBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Api.access$2300((AttributeContext$Api)this.instance, byteString);
        return this;
    }

    public AttributeContext$Api$Builder setService(String string2) {
        this.copyOnWrite();
        AttributeContext$Api.access$1500((AttributeContext$Api)this.instance, string2);
        return this;
    }

    public AttributeContext$Api$Builder setServiceBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Api.access$1700((AttributeContext$Api)this.instance, byteString);
        return this;
    }

    public AttributeContext$Api$Builder setVersion(String string2) {
        this.copyOnWrite();
        AttributeContext$Api.access$2400((AttributeContext$Api)this.instance, string2);
        return this;
    }

    public AttributeContext$Api$Builder setVersionBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Api.access$2600((AttributeContext$Api)this.instance, byteString);
        return this;
    }
}

