/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.MonitoredResourceMetadata$1;
import com.google.api.MonitoredResourceMetadata$Builder;
import com.google.api.MonitoredResourceMetadata$UserLabelsDefaultEntryHolder;
import com.google.api.MonitoredResourceMetadataOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Struct;
import com.google.protobuf.Struct$Builder;
import com.google.protobuf.StructOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;

public final class MonitoredResourceMetadata
extends GeneratedMessageLite
implements MonitoredResourceMetadataOrBuilder {
    private static final MonitoredResourceMetadata DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int SYSTEM_LABELS_FIELD_NUMBER = 1;
    public static final int USER_LABELS_FIELD_NUMBER = 2;
    private Struct systemLabels_;
    private MapFieldLite userLabels_;

    static {
        MonitoredResourceMetadata monitoredResourceMetadata;
        DEFAULT_INSTANCE = monitoredResourceMetadata = new MonitoredResourceMetadata();
        GeneratedMessageLite.registerDefaultInstance(MonitoredResourceMetadata.class, monitoredResourceMetadata);
    }

    private MonitoredResourceMetadata() {
        MapFieldLite mapFieldLite;
        this.userLabels_ = mapFieldLite = MapFieldLite.emptyMapField();
    }

    public static /* synthetic */ MonitoredResourceMetadata access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(MonitoredResourceMetadata monitoredResourceMetadata, Struct struct) {
        monitoredResourceMetadata.setSystemLabels(struct);
    }

    public static /* synthetic */ void access$200(MonitoredResourceMetadata monitoredResourceMetadata, Struct struct) {
        monitoredResourceMetadata.mergeSystemLabels(struct);
    }

    public static /* synthetic */ void access$300(MonitoredResourceMetadata monitoredResourceMetadata) {
        monitoredResourceMetadata.clearSystemLabels();
    }

    public static /* synthetic */ Map access$400(MonitoredResourceMetadata monitoredResourceMetadata) {
        return monitoredResourceMetadata.getMutableUserLabelsMap();
    }

    private void clearSystemLabels() {
        this.systemLabels_ = null;
    }

    public static MonitoredResourceMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map getMutableUserLabelsMap() {
        return this.internalGetMutableUserLabels();
    }

    private MapFieldLite internalGetMutableUserLabels() {
        MapFieldLite mapFieldLite = this.userLabels_;
        boolean bl2 = mapFieldLite.isMutable();
        if (!bl2) {
            this.userLabels_ = mapFieldLite = this.userLabels_.mutableCopy();
        }
        return this.userLabels_;
    }

    private MapFieldLite internalGetUserLabels() {
        return this.userLabels_;
    }

    private void mergeSystemLabels(Struct struct) {
        Struct struct2;
        struct.getClass();
        StructOrBuilder structOrBuilder = this.systemLabels_;
        if (structOrBuilder != null && structOrBuilder != (struct2 = Struct.getDefaultInstance())) {
            structOrBuilder = Struct.newBuilder(this.systemLabels_);
            this.systemLabels_ = struct = (Struct)((Struct$Builder)((GeneratedMessageLite$Builder)((Object)structOrBuilder)).mergeFrom(struct)).buildPartial();
        } else {
            this.systemLabels_ = struct;
        }
    }

    public static MonitoredResourceMetadata$Builder newBuilder() {
        return (MonitoredResourceMetadata$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static MonitoredResourceMetadata$Builder newBuilder(MonitoredResourceMetadata monitoredResourceMetadata) {
        return (MonitoredResourceMetadata$Builder)DEFAULT_INSTANCE.createBuilder(monitoredResourceMetadata);
    }

    public static MonitoredResourceMetadata parseDelimitedFrom(InputStream inputStream) {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResourceMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MonitoredResourceMetadata parseFrom(ByteString byteString) {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static MonitoredResourceMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MonitoredResourceMetadata parseFrom(CodedInputStream codedInputStream) {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static MonitoredResourceMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static MonitoredResourceMetadata parseFrom(InputStream inputStream) {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResourceMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MonitoredResourceMetadata parseFrom(ByteBuffer byteBuffer) {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static MonitoredResourceMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MonitoredResourceMetadata parseFrom(byte[] byArray) {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static MonitoredResourceMetadata parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setSystemLabels(Struct struct) {
        struct.getClass();
        this.systemLabels_ = struct;
    }

    public boolean containsUserLabels(String string2) {
        string2.getClass();
        return ((AbstractMap)this.internalGetUserLabels()).containsKey(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object object, Object object2) {
        byte by2 = 1;
        object2 = MonitoredResourceMetadata$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                object = MonitoredResourceMetadata.class;
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
                objectArray[0] = "systemLabels_";
                objectArray[by2] = "userLabels_";
                objectArray[2] = object = MonitoredResourceMetadata$UserLabelsDefaultEntryHolder.defaultEntry;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\t\u00022", objectArray);
            }
            case 2: {
                return new MonitoredResourceMetadata$Builder(null);
            }
            case 1: 
        }
        return new MonitoredResourceMetadata();
    }

    public Struct getSystemLabels() {
        Struct struct = this.systemLabels_;
        if (struct == null) {
            struct = Struct.getDefaultInstance();
        }
        return struct;
    }

    public Map getUserLabels() {
        return this.getUserLabelsMap();
    }

    public int getUserLabelsCount() {
        return ((AbstractMap)this.internalGetUserLabels()).size();
    }

    public Map getUserLabelsMap() {
        return Collections.unmodifiableMap(this.internalGetUserLabels());
    }

    public String getUserLabelsOrDefault(String string2, String string3) {
        string2.getClass();
        MapFieldLite mapFieldLite = this.internalGetUserLabels();
        boolean bl2 = mapFieldLite.containsKey(string2);
        if (bl2) {
            string3 = string2 = mapFieldLite.get(string2);
            string3 = string2;
        }
        return string3;
    }

    public String getUserLabelsOrThrow(String object) {
        object.getClass();
        MapFieldLite mapFieldLite = this.internalGetUserLabels();
        boolean bl2 = mapFieldLite.containsKey(object);
        if (bl2) {
            return (String)mapFieldLite.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public boolean hasSystemLabels() {
        boolean bl2;
        Struct struct = this.systemLabels_;
        if (struct != null) {
            bl2 = true;
        } else {
            bl2 = false;
            struct = null;
        }
        return bl2;
    }
}

