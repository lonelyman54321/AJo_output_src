/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.MetricRule$1;
import com.google.api.MetricRule$Builder;
import com.google.api.MetricRule$MetricCostsDefaultEntryHolder;
import com.google.api.MetricRuleOrBuilder;
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

public final class MetricRule
extends GeneratedMessageLite
implements MetricRuleOrBuilder {
    private static final MetricRule DEFAULT_INSTANCE;
    public static final int METRIC_COSTS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private MapFieldLite metricCosts_;
    private String selector_;

    static {
        MetricRule metricRule;
        DEFAULT_INSTANCE = metricRule = new MetricRule();
        GeneratedMessageLite.registerDefaultInstance(MetricRule.class, metricRule);
    }

    private MetricRule() {
        MapFieldLite mapFieldLite;
        this.metricCosts_ = mapFieldLite = MapFieldLite.emptyMapField();
        this.selector_ = "";
    }

    public static /* synthetic */ MetricRule access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(MetricRule metricRule, String string2) {
        metricRule.setSelector(string2);
    }

    public static /* synthetic */ void access$200(MetricRule metricRule) {
        metricRule.clearSelector();
    }

    public static /* synthetic */ void access$300(MetricRule metricRule, ByteString byteString) {
        metricRule.setSelectorBytes(byteString);
    }

    public static /* synthetic */ Map access$400(MetricRule metricRule) {
        return metricRule.getMutableMetricCostsMap();
    }

    private void clearSelector() {
        String string2;
        this.selector_ = string2 = MetricRule.getDefaultInstance().getSelector();
    }

    public static MetricRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map getMutableMetricCostsMap() {
        return this.internalGetMutableMetricCosts();
    }

    private MapFieldLite internalGetMetricCosts() {
        return this.metricCosts_;
    }

    private MapFieldLite internalGetMutableMetricCosts() {
        MapFieldLite mapFieldLite = this.metricCosts_;
        boolean bl2 = mapFieldLite.isMutable();
        if (!bl2) {
            this.metricCosts_ = mapFieldLite = this.metricCosts_.mutableCopy();
        }
        return this.metricCosts_;
    }

    public static MetricRule$Builder newBuilder() {
        return (MetricRule$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static MetricRule$Builder newBuilder(MetricRule metricRule) {
        return (MetricRule$Builder)DEFAULT_INSTANCE.createBuilder(metricRule);
    }

    public static MetricRule parseDelimitedFrom(InputStream inputStream) {
        return (MetricRule)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (MetricRule)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricRule parseFrom(ByteString byteString) {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static MetricRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MetricRule parseFrom(CodedInputStream codedInputStream) {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static MetricRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static MetricRule parseFrom(InputStream inputStream) {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static MetricRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricRule parseFrom(ByteBuffer byteBuffer) {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static MetricRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MetricRule parseFrom(byte[] byArray) {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static MetricRule parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setSelector(String string2) {
        string2.getClass();
        this.selector_ = string2;
    }

    private void setSelectorBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.selector_ = object = ((ByteString)object).toStringUtf8();
    }

    public boolean containsMetricCosts(String string2) {
        string2.getClass();
        return ((AbstractMap)this.internalGetMetricCosts()).containsKey(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object object, Object object2) {
        byte by2 = 1;
        object2 = MetricRule$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                object = MetricRule.class;
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
                objectArray[0] = "selector_";
                objectArray[by2] = "metricCosts_";
                objectArray[2] = object = MetricRule$MetricCostsDefaultEntryHolder.defaultEntry;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0208\u00022", objectArray);
            }
            case 2: {
                return new MetricRule$Builder(null);
            }
            case 1: 
        }
        return new MetricRule();
    }

    public Map getMetricCosts() {
        return this.getMetricCostsMap();
    }

    public int getMetricCostsCount() {
        return ((AbstractMap)this.internalGetMetricCosts()).size();
    }

    public Map getMetricCostsMap() {
        return Collections.unmodifiableMap(this.internalGetMetricCosts());
    }

    public long getMetricCostsOrDefault(String object, long l2) {
        object.getClass();
        MapFieldLite mapFieldLite = this.internalGetMetricCosts();
        boolean bl2 = mapFieldLite.containsKey(object);
        if (bl2) {
            object = (Long)mapFieldLite.get(object);
            l2 = (Long)object;
        }
        return l2;
    }

    public long getMetricCostsOrThrow(String object) {
        object.getClass();
        MapFieldLite mapFieldLite = this.internalGetMetricCosts();
        boolean bl2 = mapFieldLite.containsKey(object);
        if (bl2) {
            return (Long)mapFieldLite.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public String getSelector() {
        return this.selector_;
    }

    public ByteString getSelectorBytes() {
        return ByteString.copyFromUtf8(this.selector_);
    }
}

