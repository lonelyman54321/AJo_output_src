/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.rpc.context.AttributeContext$1;
import com.google.rpc.context.AttributeContext$Peer$Builder;
import com.google.rpc.context.AttributeContext$Peer$LabelsDefaultEntryHolder;
import com.google.rpc.context.AttributeContext$PeerOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;

public final class AttributeContext$Peer
extends GeneratedMessageLite
implements AttributeContext$PeerOrBuilder {
    private static final AttributeContext$Peer DEFAULT_INSTANCE;
    public static final int IP_FIELD_NUMBER = 1;
    public static final int LABELS_FIELD_NUMBER = 6;
    private static volatile Parser PARSER;
    public static final int PORT_FIELD_NUMBER = 2;
    public static final int PRINCIPAL_FIELD_NUMBER = 7;
    public static final int REGION_CODE_FIELD_NUMBER = 8;
    private String ip_;
    private MapFieldLite labels_;
    private long port_;
    private String principal_;
    private String regionCode_;

    static {
        AttributeContext$Peer attributeContext$Peer;
        DEFAULT_INSTANCE = attributeContext$Peer = new AttributeContext$Peer();
        GeneratedMessageLite.registerDefaultInstance(AttributeContext$Peer.class, attributeContext$Peer);
    }

    private AttributeContext$Peer() {
        Object object = MapFieldLite.emptyMapField();
        this.labels_ = object;
        this.ip_ = object = "";
        this.principal_ = object;
        this.regionCode_ = object;
    }

    public static /* synthetic */ AttributeContext$Peer access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(AttributeContext$Peer attributeContext$Peer, String string2) {
        attributeContext$Peer.setIp(string2);
    }

    public static /* synthetic */ void access$1000(AttributeContext$Peer attributeContext$Peer, String string2) {
        attributeContext$Peer.setRegionCode(string2);
    }

    public static /* synthetic */ void access$1100(AttributeContext$Peer attributeContext$Peer) {
        attributeContext$Peer.clearRegionCode();
    }

    public static /* synthetic */ void access$1200(AttributeContext$Peer attributeContext$Peer, ByteString byteString) {
        attributeContext$Peer.setRegionCodeBytes(byteString);
    }

    public static /* synthetic */ void access$200(AttributeContext$Peer attributeContext$Peer) {
        attributeContext$Peer.clearIp();
    }

    public static /* synthetic */ void access$300(AttributeContext$Peer attributeContext$Peer, ByteString byteString) {
        attributeContext$Peer.setIpBytes(byteString);
    }

    public static /* synthetic */ void access$400(AttributeContext$Peer attributeContext$Peer, long l2) {
        attributeContext$Peer.setPort(l2);
    }

    public static /* synthetic */ void access$500(AttributeContext$Peer attributeContext$Peer) {
        attributeContext$Peer.clearPort();
    }

    public static /* synthetic */ Map access$600(AttributeContext$Peer attributeContext$Peer) {
        return attributeContext$Peer.getMutableLabelsMap();
    }

    public static /* synthetic */ void access$700(AttributeContext$Peer attributeContext$Peer, String string2) {
        attributeContext$Peer.setPrincipal(string2);
    }

    public static /* synthetic */ void access$800(AttributeContext$Peer attributeContext$Peer) {
        attributeContext$Peer.clearPrincipal();
    }

    public static /* synthetic */ void access$900(AttributeContext$Peer attributeContext$Peer, ByteString byteString) {
        attributeContext$Peer.setPrincipalBytes(byteString);
    }

    private void clearIp() {
        String string2;
        this.ip_ = string2 = AttributeContext$Peer.getDefaultInstance().getIp();
    }

    private void clearPort() {
        this.port_ = 0L;
    }

    private void clearPrincipal() {
        String string2;
        this.principal_ = string2 = AttributeContext$Peer.getDefaultInstance().getPrincipal();
    }

    private void clearRegionCode() {
        String string2;
        this.regionCode_ = string2 = AttributeContext$Peer.getDefaultInstance().getRegionCode();
    }

    public static AttributeContext$Peer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map getMutableLabelsMap() {
        return this.internalGetMutableLabels();
    }

    private MapFieldLite internalGetLabels() {
        return this.labels_;
    }

    private MapFieldLite internalGetMutableLabels() {
        MapFieldLite mapFieldLite = this.labels_;
        boolean bl2 = mapFieldLite.isMutable();
        if (!bl2) {
            this.labels_ = mapFieldLite = this.labels_.mutableCopy();
        }
        return this.labels_;
    }

    public static AttributeContext$Peer$Builder newBuilder() {
        return (AttributeContext$Peer$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static AttributeContext$Peer$Builder newBuilder(AttributeContext$Peer attributeContext$Peer) {
        return (AttributeContext$Peer$Builder)DEFAULT_INSTANCE.createBuilder(attributeContext$Peer);
    }

    public static AttributeContext$Peer parseDelimitedFrom(InputStream inputStream) {
        return (AttributeContext$Peer)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext$Peer parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Peer)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AttributeContext$Peer parseFrom(ByteString byteString) {
        return (AttributeContext$Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static AttributeContext$Peer parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AttributeContext$Peer parseFrom(CodedInputStream codedInputStream) {
        return (AttributeContext$Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static AttributeContext$Peer parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AttributeContext$Peer parseFrom(InputStream inputStream) {
        return (AttributeContext$Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext$Peer parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AttributeContext$Peer parseFrom(ByteBuffer byteBuffer) {
        return (AttributeContext$Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static AttributeContext$Peer parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AttributeContext$Peer parseFrom(byte[] byArray) {
        return (AttributeContext$Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static AttributeContext$Peer parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setIp(String string2) {
        string2.getClass();
        this.ip_ = string2;
    }

    private void setIpBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.ip_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setPort(long l2) {
        this.port_ = l2;
    }

    private void setPrincipal(String string2) {
        string2.getClass();
        this.principal_ = string2;
    }

    private void setPrincipalBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.principal_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setRegionCode(String string2) {
        string2.getClass();
        this.regionCode_ = string2;
    }

    private void setRegionCodeBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.regionCode_ = object = ((ByteString)object).toStringUtf8();
    }

    public boolean containsLabels(String string2) {
        string2.getClass();
        return ((AbstractMap)this.internalGetLabels()).containsKey(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object object, Object object2) {
        byte by2 = 1;
        object2 = AttributeContext$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object3 = objectArray.ordinal();
        object3 = object2[object3];
        object2 = null;
        switch (object3) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                objectArray = PARSER;
                if (objectArray != null) return objectArray;
                object = AttributeContext$Peer.class;
                synchronized (object) {
                    try {
                        objectArray = PARSER;
                        if (objectArray != null) return objectArray;
                        object2 = DEFAULT_INSTANCE;
                        PARSER = objectArray = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object2);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                objectArray = new Object[6];
                objectArray[0] = "ip_";
                objectArray[by2] = "port_";
                objectArray[2] = "labels_";
                objectArray[3] = object = AttributeContext$Peer$LabelsDefaultEntryHolder.defaultEntry;
                objectArray[4] = "principal_";
                objectArray[5] = "regionCode_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\b\u0005\u0001\u0000\u0000\u0001\u0208\u0002\u0002\u00062\u0007\u0208\b\u0208", objectArray);
            }
            case 2: {
                return new AttributeContext$Peer$Builder(null);
            }
            case 1: 
        }
        return new AttributeContext$Peer();
    }

    public String getIp() {
        return this.ip_;
    }

    public ByteString getIpBytes() {
        return ByteString.copyFromUtf8(this.ip_);
    }

    public Map getLabels() {
        return this.getLabelsMap();
    }

    public int getLabelsCount() {
        return ((AbstractMap)this.internalGetLabels()).size();
    }

    public Map getLabelsMap() {
        return Collections.unmodifiableMap(this.internalGetLabels());
    }

    public String getLabelsOrDefault(String string2, String string3) {
        string2.getClass();
        MapFieldLite mapFieldLite = this.internalGetLabels();
        boolean bl2 = mapFieldLite.containsKey(string2);
        if (bl2) {
            string3 = string2 = mapFieldLite.get(string2);
            string3 = string2;
        }
        return string3;
    }

    public String getLabelsOrThrow(String object) {
        object.getClass();
        MapFieldLite mapFieldLite = this.internalGetLabels();
        boolean bl2 = mapFieldLite.containsKey(object);
        if (bl2) {
            return (String)mapFieldLite.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public long getPort() {
        return this.port_;
    }

    public String getPrincipal() {
        return this.principal_;
    }

    public ByteString getPrincipalBytes() {
        return ByteString.copyFromUtf8(this.principal_);
    }

    public String getRegionCode() {
        return this.regionCode_;
    }

    public ByteString getRegionCodeBytes() {
        return ByteString.copyFromUtf8(this.regionCode_);
    }
}

