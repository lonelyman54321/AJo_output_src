/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.Timestamp$Builder;
import com.google.rpc.context.AttributeContext$1;
import com.google.rpc.context.AttributeContext$Response;
import com.google.rpc.context.AttributeContext$ResponseOrBuilder;
import java.util.Collections;
import java.util.Map;

public final class AttributeContext$Response$Builder
extends GeneratedMessageLite$Builder
implements AttributeContext$ResponseOrBuilder {
    private AttributeContext$Response$Builder() {
        AttributeContext$Response attributeContext$Response = AttributeContext$Response.access$8400();
        super(attributeContext$Response);
    }

    public /* synthetic */ AttributeContext$Response$Builder(AttributeContext$1 attributeContext$1) {
        this();
    }

    public AttributeContext$Response$Builder clearCode() {
        this.copyOnWrite();
        AttributeContext$Response.access$8600((AttributeContext$Response)this.instance);
        return this;
    }

    public AttributeContext$Response$Builder clearHeaders() {
        this.copyOnWrite();
        AttributeContext$Response.access$8900((AttributeContext$Response)this.instance).clear();
        return this;
    }

    public AttributeContext$Response$Builder clearSize() {
        this.copyOnWrite();
        AttributeContext$Response.access$8800((AttributeContext$Response)this.instance);
        return this;
    }

    public AttributeContext$Response$Builder clearTime() {
        this.copyOnWrite();
        AttributeContext$Response.access$9200((AttributeContext$Response)this.instance);
        return this;
    }

    public boolean containsHeaders(String string2) {
        string2.getClass();
        return ((AttributeContext$Response)this.instance).getHeadersMap().containsKey(string2);
    }

    public long getCode() {
        return ((AttributeContext$Response)this.instance).getCode();
    }

    public Map getHeaders() {
        return this.getHeadersMap();
    }

    public int getHeadersCount() {
        return ((AttributeContext$Response)this.instance).getHeadersMap().size();
    }

    public Map getHeadersMap() {
        return Collections.unmodifiableMap(((AttributeContext$Response)this.instance).getHeadersMap());
    }

    public String getHeadersOrDefault(String string2, String string3) {
        string2.getClass();
        Map map2 = ((AttributeContext$Response)this.instance).getHeadersMap();
        boolean bl2 = map2.containsKey(string2);
        if (bl2) {
            string3 = string2 = map2.get(string2);
            string3 = string2;
        }
        return string3;
    }

    public String getHeadersOrThrow(String object) {
        object.getClass();
        Map map2 = ((AttributeContext$Response)this.instance).getHeadersMap();
        boolean bl2 = map2.containsKey(object);
        if (bl2) {
            return (String)map2.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public long getSize() {
        return ((AttributeContext$Response)this.instance).getSize();
    }

    public Timestamp getTime() {
        return ((AttributeContext$Response)this.instance).getTime();
    }

    public boolean hasTime() {
        return ((AttributeContext$Response)this.instance).hasTime();
    }

    public AttributeContext$Response$Builder mergeTime(Timestamp timestamp) {
        this.copyOnWrite();
        AttributeContext$Response.access$9100((AttributeContext$Response)this.instance, timestamp);
        return this;
    }

    public AttributeContext$Response$Builder putAllHeaders(Map map2) {
        this.copyOnWrite();
        AttributeContext$Response.access$8900((AttributeContext$Response)this.instance).putAll(map2);
        return this;
    }

    public AttributeContext$Response$Builder putHeaders(String string2, String string3) {
        string2.getClass();
        string3.getClass();
        this.copyOnWrite();
        AttributeContext$Response.access$8900((AttributeContext$Response)this.instance).put(string2, string3);
        return this;
    }

    public AttributeContext$Response$Builder removeHeaders(String string2) {
        string2.getClass();
        this.copyOnWrite();
        AttributeContext$Response.access$8900((AttributeContext$Response)this.instance).remove(string2);
        return this;
    }

    public AttributeContext$Response$Builder setCode(long l2) {
        this.copyOnWrite();
        AttributeContext$Response.access$8500((AttributeContext$Response)this.instance, l2);
        return this;
    }

    public AttributeContext$Response$Builder setSize(long l2) {
        this.copyOnWrite();
        AttributeContext$Response.access$8700((AttributeContext$Response)this.instance, l2);
        return this;
    }

    public AttributeContext$Response$Builder setTime(Timestamp$Builder timestampOrBuilder) {
        this.copyOnWrite();
        AttributeContext$Response attributeContext$Response = (AttributeContext$Response)this.instance;
        timestampOrBuilder = (Timestamp)timestampOrBuilder.build();
        AttributeContext$Response.access$9000(attributeContext$Response, (Timestamp)timestampOrBuilder);
        return this;
    }

    public AttributeContext$Response$Builder setTime(Timestamp timestamp) {
        this.copyOnWrite();
        AttributeContext$Response.access$9000((AttributeContext$Response)this.instance, timestamp);
        return this;
    }
}

