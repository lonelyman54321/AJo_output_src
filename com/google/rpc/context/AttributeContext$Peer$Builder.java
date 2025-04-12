/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.context.AttributeContext$1;
import com.google.rpc.context.AttributeContext$Peer;
import com.google.rpc.context.AttributeContext$PeerOrBuilder;
import java.util.Collections;
import java.util.Map;

public final class AttributeContext$Peer$Builder
extends GeneratedMessageLite$Builder
implements AttributeContext$PeerOrBuilder {
    private AttributeContext$Peer$Builder() {
        AttributeContext$Peer attributeContext$Peer = AttributeContext$Peer.access$000();
        super(attributeContext$Peer);
    }

    public /* synthetic */ AttributeContext$Peer$Builder(AttributeContext$1 attributeContext$1) {
        this();
    }

    public AttributeContext$Peer$Builder clearIp() {
        this.copyOnWrite();
        AttributeContext$Peer.access$200((AttributeContext$Peer)this.instance);
        return this;
    }

    public AttributeContext$Peer$Builder clearLabels() {
        this.copyOnWrite();
        AttributeContext$Peer.access$600((AttributeContext$Peer)this.instance).clear();
        return this;
    }

    public AttributeContext$Peer$Builder clearPort() {
        this.copyOnWrite();
        AttributeContext$Peer.access$500((AttributeContext$Peer)this.instance);
        return this;
    }

    public AttributeContext$Peer$Builder clearPrincipal() {
        this.copyOnWrite();
        AttributeContext$Peer.access$800((AttributeContext$Peer)this.instance);
        return this;
    }

    public AttributeContext$Peer$Builder clearRegionCode() {
        this.copyOnWrite();
        AttributeContext$Peer.access$1100((AttributeContext$Peer)this.instance);
        return this;
    }

    public boolean containsLabels(String string2) {
        string2.getClass();
        return ((AttributeContext$Peer)this.instance).getLabelsMap().containsKey(string2);
    }

    public String getIp() {
        return ((AttributeContext$Peer)this.instance).getIp();
    }

    public ByteString getIpBytes() {
        return ((AttributeContext$Peer)this.instance).getIpBytes();
    }

    public Map getLabels() {
        return this.getLabelsMap();
    }

    public int getLabelsCount() {
        return ((AttributeContext$Peer)this.instance).getLabelsMap().size();
    }

    public Map getLabelsMap() {
        return Collections.unmodifiableMap(((AttributeContext$Peer)this.instance).getLabelsMap());
    }

    public String getLabelsOrDefault(String string2, String string3) {
        string2.getClass();
        Map map2 = ((AttributeContext$Peer)this.instance).getLabelsMap();
        boolean bl2 = map2.containsKey(string2);
        if (bl2) {
            string3 = string2 = map2.get(string2);
            string3 = string2;
        }
        return string3;
    }

    public String getLabelsOrThrow(String object) {
        object.getClass();
        Map map2 = ((AttributeContext$Peer)this.instance).getLabelsMap();
        boolean bl2 = map2.containsKey(object);
        if (bl2) {
            return (String)map2.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public long getPort() {
        return ((AttributeContext$Peer)this.instance).getPort();
    }

    public String getPrincipal() {
        return ((AttributeContext$Peer)this.instance).getPrincipal();
    }

    public ByteString getPrincipalBytes() {
        return ((AttributeContext$Peer)this.instance).getPrincipalBytes();
    }

    public String getRegionCode() {
        return ((AttributeContext$Peer)this.instance).getRegionCode();
    }

    public ByteString getRegionCodeBytes() {
        return ((AttributeContext$Peer)this.instance).getRegionCodeBytes();
    }

    public AttributeContext$Peer$Builder putAllLabels(Map map2) {
        this.copyOnWrite();
        AttributeContext$Peer.access$600((AttributeContext$Peer)this.instance).putAll(map2);
        return this;
    }

    public AttributeContext$Peer$Builder putLabels(String string2, String string3) {
        string2.getClass();
        string3.getClass();
        this.copyOnWrite();
        AttributeContext$Peer.access$600((AttributeContext$Peer)this.instance).put(string2, string3);
        return this;
    }

    public AttributeContext$Peer$Builder removeLabels(String string2) {
        string2.getClass();
        this.copyOnWrite();
        AttributeContext$Peer.access$600((AttributeContext$Peer)this.instance).remove(string2);
        return this;
    }

    public AttributeContext$Peer$Builder setIp(String string2) {
        this.copyOnWrite();
        AttributeContext$Peer.access$100((AttributeContext$Peer)this.instance, string2);
        return this;
    }

    public AttributeContext$Peer$Builder setIpBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Peer.access$300((AttributeContext$Peer)this.instance, byteString);
        return this;
    }

    public AttributeContext$Peer$Builder setPort(long l2) {
        this.copyOnWrite();
        AttributeContext$Peer.access$400((AttributeContext$Peer)this.instance, l2);
        return this;
    }

    public AttributeContext$Peer$Builder setPrincipal(String string2) {
        this.copyOnWrite();
        AttributeContext$Peer.access$700((AttributeContext$Peer)this.instance, string2);
        return this;
    }

    public AttributeContext$Peer$Builder setPrincipalBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Peer.access$900((AttributeContext$Peer)this.instance, byteString);
        return this;
    }

    public AttributeContext$Peer$Builder setRegionCode(String string2) {
        this.copyOnWrite();
        AttributeContext$Peer.access$1000((AttributeContext$Peer)this.instance, string2);
        return this;
    }

    public AttributeContext$Peer$Builder setRegionCodeBytes(ByteString byteString) {
        this.copyOnWrite();
        AttributeContext$Peer.access$1200((AttributeContext$Peer)this.instance, byteString);
        return this;
    }
}

