/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.context.AttributeContext$1;
import com.google.rpc.context.AttributeContext$Resource;
import com.google.rpc.context.AttributeContext$ResourceOrBuilder;
import java.util.Collections;
import java.util.Map;

public final class AttributeContext$Resource$Builder
extends GeneratedMessageLite$Builder
implements AttributeContext$ResourceOrBuilder {
    private AttributeContext$Resource$Builder() {
        AttributeContext$Resource attributeContext$Resource = AttributeContext$Resource.access$9400();
        super(attributeContext$Resource);
    }

    public /* synthetic */ AttributeContext$Resource$Builder(AttributeContext$1 attributeContext$1) {
        this();
    }

    public AttributeContext$Resource$Builder clearLabels() {
        this.copyOnWrite();
        AttributeContext$Resource.access$10400((AttributeContext$Resource)this.instance).clear();
        return this;
    }

    public AttributeContext$Resource$Builder clearName() {
        this.copyOnWrite();
        AttributeContext$Resource.access$9900((AttributeContext$Resource)this.instance);
        return this;
    }

    public AttributeContext$Resource$Builder clearService() {
        this.copyOnWrite();
        AttributeContext$Resource.access$9600((AttributeContext$Resource)this.instance);
        return this;
    }

    public AttributeContext$Resource$Builder clearType() {
        this.copyOnWrite();
        AttributeContext$Resource.access$10200((AttributeContext$Resource)this.instance);
        return this;
    }

    public boolean containsLabels(String string2) {
        string2.getClass();
        return ((AttributeContext$Resource)this.instance).getLabelsMap().containsKey(string2);
    }

    public Map getLabels() {
        return this.getLabelsMap();
    }

    public int getLabelsCount() {
        return ((AttributeContext$Resource)this.instance).getLabelsMap().size();
    }

    public Map getLabelsMap() {
        return Collections.unmodifiableMap(((AttributeContext$Resource)this.instance).getLabelsMap());
    }

    public String getLabelsOrDefault(String string2, String string3) {
        string2.getClass();
        Map map2 = ((AttributeContext$Resource)this.instance).getLabelsMap();
        boolean bl2 = map2.containsKey(string2);
        if (bl2) {
            string3 = string2 = map2.get(string2);
            string3 = string2;
        }
        return string3;
    }

    public String getLabelsOrThrow(String object) {
        object.getClass();
        Map map2 = ((AttributeContext$Resource)this.instance).getLabelsMap();
        boolean bl2 = map2.containsKey(object);
        if (bl2) {
            return (String)map2.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public String getName() {
        return ((AttributeContext$Resource)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((AttributeContext$Resource)this.instance).getNameBytes();
    }

    public String getService() {
        return ((AttributeContext$Resource)this.instance).getService();
    }

    public ByteString getServiceBytes() {
        return ((AttributeContext$Resource)this.instance).getServiceBytes();
    }

    public String getType() {
        return ((AttributeContext$Resource)this.instance).getType();
    }

    public ByteString getTypeBytes() {
        return ((AttributeContext$Resource)this.instance).getTypeBytes();
    }

    public AttributeContext$Resource$Builder putAllLabels(Map map2) {
        this.copyOnWrite();
        AttributeContext$Resource.access$10400((AttributeContext$Resource)this.instance).putAll(map2);
        return this;
    }

    public AttributeContext$Resource$Builder putLabels(String string2, String string3) {
        string2.getClass();
        string3.getClass();
        this.copyOnWrite();
        AttributeContext$Resource.access$10400((AttributeContext$Resource)this.instance).put(string2, string3);
        return this;
    }

    public AttributeContext$Resource$Builder removeLabels(String string2) {
        string2.getClass();
        this.copyOnWrite();
        AttributeContext$Resource.access$10400((AttributeContext$Resource)this.instance).remove(string2);
        return this;
    }

    public AttributeContext$Resource$Builder setName(String string2) {
        this.copyOnWrite();
        AttributeContext$Resource.access$9800((AttributeContext$Resource)this.instance, string2);
        return this;
    }

    public AttributeContext$Resource$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Resource.access$10000((AttributeContext$Resource)this.instance, byteString);
        return this;
    }

    public AttributeContext$Resource$Builder setService(String string2) {
        this.copyOnWrite();
        AttributeContext$Resource.access$9500((AttributeContext$Resource)this.instance, string2);
        return this;
    }

    public AttributeContext$Resource$Builder setServiceBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Resource.access$9700((AttributeContext$Resource)this.instance, byteString);
        return this;
    }

    public AttributeContext$Resource$Builder setType(String string2) {
        this.copyOnWrite();
        AttributeContext$Resource.access$10100((AttributeContext$Resource)this.instance, string2);
        return this;
    }

    public AttributeContext$Resource$Builder setTypeBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Resource.access$10300((AttributeContext$Resource)this.instance, byteString);
        return this;
    }
}

