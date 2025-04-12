/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Metric$1;
import com.google.api.Metric$Builder;
import com.google.api.Metric$LabelsDefaultEntryHolder;
import com.google.api.MetricOrBuilder;
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

public final class Metric
extends GeneratedMessageLite
implements MetricOrBuilder {
    private static final Metric DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int TYPE_FIELD_NUMBER = 3;
    private MapFieldLite labels_;
    private String type_;

    static {
        Metric metric;
        DEFAULT_INSTANCE = metric = new Metric();
        GeneratedMessageLite.registerDefaultInstance(Metric.class, metric);
    }

    private Metric() {
        MapFieldLite mapFieldLite;
        this.labels_ = mapFieldLite = MapFieldLite.emptyMapField();
        this.type_ = "";
    }

    public static /* synthetic */ Metric access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Metric metric, String string2) {
        metric.setType(string2);
    }

    public static /* synthetic */ void access$200(Metric metric) {
        metric.clearType();
    }

    public static /* synthetic */ void access$300(Metric metric, ByteString byteString) {
        metric.setTypeBytes(byteString);
    }

    public static /* synthetic */ Map access$400(Metric metric) {
        return metric.getMutableLabelsMap();
    }

    private void clearType() {
        String string2;
        this.type_ = string2 = Metric.getDefaultInstance().getType();
    }

    public static Metric getDefaultInstance() {
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

    public static Metric$Builder newBuilder() {
        return (Metric$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Metric$Builder newBuilder(Metric metric) {
        return (Metric$Builder)DEFAULT_INSTANCE.createBuilder(metric);
    }

    public static Metric parseDelimitedFrom(InputStream inputStream) {
        return (Metric)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Metric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Metric)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Metric parseFrom(ByteString byteString) {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Metric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Metric parseFrom(CodedInputStream codedInputStream) {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Metric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Metric parseFrom(InputStream inputStream) {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Metric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Metric parseFrom(ByteBuffer byteBuffer) {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Metric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Metric parseFrom(byte[] byArray) {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Metric parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
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
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Metric$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object2 = objectArray.ordinal();
        object2 = object[object2];
        object = null;
        switch (object2) {
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
                clazz = Metric.class;
                synchronized (clazz) {
                    try {
                        objectArray = PARSER;
                        if (objectArray != null) return objectArray;
                        object = DEFAULT_INSTANCE;
                        PARSER = objectArray = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object);
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
                objectArray[0] = "labels_";
                objectArray[by2] = object = Metric$LabelsDefaultEntryHolder.defaultEntry;
                objectArray[2] = "type_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0001\u0000\u0000\u00022\u0003\u0208", objectArray);
            }
            case 2: {
                return new Metric$Builder(null);
            }
            case 1: 
        }
        return new Metric();
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

