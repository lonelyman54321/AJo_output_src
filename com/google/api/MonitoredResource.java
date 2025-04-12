/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.MonitoredResource$1;
import com.google.api.MonitoredResource$Builder;
import com.google.api.MonitoredResource$LabelsDefaultEntryHolder;
import com.google.api.MonitoredResourceOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;

public final class MonitoredResource
extends GeneratedMessageLite
implements MonitoredResourceOrBuilder {
    private static final MonitoredResource DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int TYPE_FIELD_NUMBER = 1;
    private MapFieldLite labels_;
    private String type_;

    static {
        MonitoredResource monitoredResource;
        DEFAULT_INSTANCE = monitoredResource = new MonitoredResource();
        GeneratedMessageLite.registerDefaultInstance(MonitoredResource.class, monitoredResource);
    }

    private MonitoredResource() {
        MapFieldLite mapFieldLite;
        this.labels_ = mapFieldLite = MapFieldLite.emptyMapField();
        this.type_ = "";
    }

    public static /* synthetic */ MonitoredResource access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(MonitoredResource monitoredResource, String string2) {
        monitoredResource.setType(string2);
    }

    public static /* synthetic */ void access$200(MonitoredResource monitoredResource) {
        monitoredResource.clearType();
    }

    public static /* synthetic */ void access$300(MonitoredResource monitoredResource, ByteString byteString) {
        monitoredResource.setTypeBytes(byteString);
    }

    public static /* synthetic */ Map access$400(MonitoredResource monitoredResource) {
        return monitoredResource.getMutableLabelsMap();
    }

    private void clearType() {
        String string2;
        this.type_ = string2 = MonitoredResource.getDefaultInstance().getType();
    }

    public static MonitoredResource getDefaultInstance() {
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

    public static MonitoredResource$Builder newBuilder() {
        return (MonitoredResource$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static MonitoredResource$Builder newBuilder(MonitoredResource monitoredResource) {
        return (MonitoredResource$Builder)DEFAULT_INSTANCE.createBuilder(monitoredResource);
    }

    public static MonitoredResource parseDelimitedFrom(InputStream inputStream) {
        return (MonitoredResource)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (MonitoredResource)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MonitoredResource parseFrom(ByteString byteString) {
        return (MonitoredResource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static MonitoredResource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (MonitoredResource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MonitoredResource parseFrom(CodedInputStream codedInputStream) {
        return (MonitoredResource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static MonitoredResource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (MonitoredResource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static MonitoredResource parseFrom(InputStream inputStream) {
        return (MonitoredResource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (MonitoredResource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MonitoredResource parseFrom(ByteBuffer byteBuffer) {
        return (MonitoredResource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static MonitoredResource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (MonitoredResource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MonitoredResource parseFrom(byte[] byArray) {
        return (MonitoredResource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static MonitoredResource parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (MonitoredResource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setType(String string2) {
        string2.getClass();
        this.type_ = string2;
    }

    private void setTypeBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.type_ = object = ((ByteString)object).toStringUtf8();
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
        object2 = MonitoredResource$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                object = MonitoredResource.class;
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
                objectArray = new Object[3];
                objectArray[0] = "type_";
                objectArray[by2] = "labels_";
                objectArray[2] = object = MonitoredResource$LabelsDefaultEntryHolder.defaultEntry;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0208\u00022", objectArray);
            }
            case 2: {
                return new MonitoredResource$Builder(null);
            }
            case 1: 
        }
        return new MonitoredResource();
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

    public String getType() {
        return this.type_;
    }

    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }
}

