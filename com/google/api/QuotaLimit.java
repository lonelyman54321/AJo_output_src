/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.QuotaLimit$1;
import com.google.api.QuotaLimit$Builder;
import com.google.api.QuotaLimit$ValuesDefaultEntryHolder;
import com.google.api.QuotaLimitOrBuilder;
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

public final class QuotaLimit
extends GeneratedMessageLite
implements QuotaLimitOrBuilder {
    private static final QuotaLimit DEFAULT_INSTANCE;
    public static final int DEFAULT_LIMIT_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 12;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int FREE_TIER_FIELD_NUMBER = 7;
    public static final int MAX_LIMIT_FIELD_NUMBER = 4;
    public static final int METRIC_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 6;
    private static volatile Parser PARSER;
    public static final int UNIT_FIELD_NUMBER = 9;
    public static final int VALUES_FIELD_NUMBER = 10;
    private long defaultLimit_;
    private String description_;
    private String displayName_;
    private String duration_;
    private long freeTier_;
    private long maxLimit_;
    private String metric_;
    private String name_;
    private String unit_;
    private MapFieldLite values_;

    static {
        QuotaLimit quotaLimit;
        DEFAULT_INSTANCE = quotaLimit = new QuotaLimit();
        GeneratedMessageLite.registerDefaultInstance(QuotaLimit.class, quotaLimit);
    }

    private QuotaLimit() {
        Object object = MapFieldLite.emptyMapField();
        this.values_ = object;
        this.name_ = object = "";
        this.description_ = object;
        this.duration_ = object;
        this.metric_ = object;
        this.unit_ = object;
        this.displayName_ = object;
    }

    public static /* synthetic */ QuotaLimit access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(QuotaLimit quotaLimit, String string2) {
        quotaLimit.setName(string2);
    }

    public static /* synthetic */ void access$1000(QuotaLimit quotaLimit) {
        quotaLimit.clearMaxLimit();
    }

    public static /* synthetic */ void access$1100(QuotaLimit quotaLimit, long l2) {
        quotaLimit.setFreeTier(l2);
    }

    public static /* synthetic */ void access$1200(QuotaLimit quotaLimit) {
        quotaLimit.clearFreeTier();
    }

    public static /* synthetic */ void access$1300(QuotaLimit quotaLimit, String string2) {
        quotaLimit.setDuration(string2);
    }

    public static /* synthetic */ void access$1400(QuotaLimit quotaLimit) {
        quotaLimit.clearDuration();
    }

    public static /* synthetic */ void access$1500(QuotaLimit quotaLimit, ByteString byteString) {
        quotaLimit.setDurationBytes(byteString);
    }

    public static /* synthetic */ void access$1600(QuotaLimit quotaLimit, String string2) {
        quotaLimit.setMetric(string2);
    }

    public static /* synthetic */ void access$1700(QuotaLimit quotaLimit) {
        quotaLimit.clearMetric();
    }

    public static /* synthetic */ void access$1800(QuotaLimit quotaLimit, ByteString byteString) {
        quotaLimit.setMetricBytes(byteString);
    }

    public static /* synthetic */ void access$1900(QuotaLimit quotaLimit, String string2) {
        quotaLimit.setUnit(string2);
    }

    public static /* synthetic */ void access$200(QuotaLimit quotaLimit) {
        quotaLimit.clearName();
    }

    public static /* synthetic */ void access$2000(QuotaLimit quotaLimit) {
        quotaLimit.clearUnit();
    }

    public static /* synthetic */ void access$2100(QuotaLimit quotaLimit, ByteString byteString) {
        quotaLimit.setUnitBytes(byteString);
    }

    public static /* synthetic */ Map access$2200(QuotaLimit quotaLimit) {
        return quotaLimit.getMutableValuesMap();
    }

    public static /* synthetic */ void access$2300(QuotaLimit quotaLimit, String string2) {
        quotaLimit.setDisplayName(string2);
    }

    public static /* synthetic */ void access$2400(QuotaLimit quotaLimit) {
        quotaLimit.clearDisplayName();
    }

    public static /* synthetic */ void access$2500(QuotaLimit quotaLimit, ByteString byteString) {
        quotaLimit.setDisplayNameBytes(byteString);
    }

    public static /* synthetic */ void access$300(QuotaLimit quotaLimit, ByteString byteString) {
        quotaLimit.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(QuotaLimit quotaLimit, String string2) {
        quotaLimit.setDescription(string2);
    }

    public static /* synthetic */ void access$500(QuotaLimit quotaLimit) {
        quotaLimit.clearDescription();
    }

    public static /* synthetic */ void access$600(QuotaLimit quotaLimit, ByteString byteString) {
        quotaLimit.setDescriptionBytes(byteString);
    }

    public static /* synthetic */ void access$700(QuotaLimit quotaLimit, long l2) {
        quotaLimit.setDefaultLimit(l2);
    }

    public static /* synthetic */ void access$800(QuotaLimit quotaLimit) {
        quotaLimit.clearDefaultLimit();
    }

    public static /* synthetic */ void access$900(QuotaLimit quotaLimit, long l2) {
        quotaLimit.setMaxLimit(l2);
    }

    private void clearDefaultLimit() {
        this.defaultLimit_ = 0L;
    }

    private void clearDescription() {
        String string2;
        this.description_ = string2 = QuotaLimit.getDefaultInstance().getDescription();
    }

    private void clearDisplayName() {
        String string2;
        this.displayName_ = string2 = QuotaLimit.getDefaultInstance().getDisplayName();
    }

    private void clearDuration() {
        String string2;
        this.duration_ = string2 = QuotaLimit.getDefaultInstance().getDuration();
    }

    private void clearFreeTier() {
        this.freeTier_ = 0L;
    }

    private void clearMaxLimit() {
        this.maxLimit_ = 0L;
    }

    private void clearMetric() {
        String string2;
        this.metric_ = string2 = QuotaLimit.getDefaultInstance().getMetric();
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = QuotaLimit.getDefaultInstance().getName();
    }

    private void clearUnit() {
        String string2;
        this.unit_ = string2 = QuotaLimit.getDefaultInstance().getUnit();
    }

    public static QuotaLimit getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map getMutableValuesMap() {
        return this.internalGetMutableValues();
    }

    private MapFieldLite internalGetMutableValues() {
        MapFieldLite mapFieldLite = this.values_;
        boolean bl2 = mapFieldLite.isMutable();
        if (!bl2) {
            this.values_ = mapFieldLite = this.values_.mutableCopy();
        }
        return this.values_;
    }

    private MapFieldLite internalGetValues() {
        return this.values_;
    }

    public static QuotaLimit$Builder newBuilder() {
        return (QuotaLimit$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static QuotaLimit$Builder newBuilder(QuotaLimit quotaLimit) {
        return (QuotaLimit$Builder)DEFAULT_INSTANCE.createBuilder(quotaLimit);
    }

    public static QuotaLimit parseDelimitedFrom(InputStream inputStream) {
        return (QuotaLimit)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QuotaLimit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (QuotaLimit)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QuotaLimit parseFrom(ByteString byteString) {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static QuotaLimit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static QuotaLimit parseFrom(CodedInputStream codedInputStream) {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static QuotaLimit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static QuotaLimit parseFrom(InputStream inputStream) {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static QuotaLimit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QuotaLimit parseFrom(ByteBuffer byteBuffer) {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static QuotaLimit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static QuotaLimit parseFrom(byte[] byArray) {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static QuotaLimit parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDefaultLimit(long l2) {
        this.defaultLimit_ = l2;
    }

    private void setDescription(String string2) {
        string2.getClass();
        this.description_ = string2;
    }

    private void setDescriptionBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.description_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setDisplayName(String string2) {
        string2.getClass();
        this.displayName_ = string2;
    }

    private void setDisplayNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.displayName_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setDuration(String string2) {
        string2.getClass();
        this.duration_ = string2;
    }

    private void setDurationBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.duration_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setFreeTier(long l2) {
        this.freeTier_ = l2;
    }

    private void setMaxLimit(long l2) {
        this.maxLimit_ = l2;
    }

    private void setMetric(String string2) {
        string2.getClass();
        this.metric_ = string2;
    }

    private void setMetricBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.metric_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setName(String string2) {
        string2.getClass();
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.name_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setUnit(String string2) {
        string2.getClass();
        this.unit_ = string2;
    }

    private void setUnitBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.unit_ = object = ((ByteString)object).toStringUtf8();
    }

    public boolean containsValues(String string2) {
        string2.getClass();
        return ((AbstractMap)this.internalGetValues()).containsKey(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object object, Object object2) {
        byte by2 = 1;
        object2 = QuotaLimit$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                object = QuotaLimit.class;
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
                objectArray = new Object[11];
                objectArray[0] = "description_";
                objectArray[by2] = "defaultLimit_";
                objectArray[2] = "maxLimit_";
                objectArray[3] = "duration_";
                objectArray[4] = "name_";
                objectArray[5] = "freeTier_";
                objectArray[6] = "metric_";
                objectArray[7] = "unit_";
                objectArray[8] = "values_";
                objectArray[9] = object = QuotaLimit$ValuesDefaultEntryHolder.defaultEntry;
                objectArray[10] = "displayName_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0002\f\n\u0001\u0000\u0000\u0002\u0208\u0003\u0002\u0004\u0002\u0005\u0208\u0006\u0208\u0007\u0002\b\u0208\t\u0208\n2\f\u0208", objectArray);
            }
            case 2: {
                return new QuotaLimit$Builder(null);
            }
            case 1: 
        }
        return new QuotaLimit();
    }

    public long getDefaultLimit() {
        return this.defaultLimit_;
    }

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    public String getDisplayName() {
        return this.displayName_;
    }

    public ByteString getDisplayNameBytes() {
        return ByteString.copyFromUtf8(this.displayName_);
    }

    public String getDuration() {
        return this.duration_;
    }

    public ByteString getDurationBytes() {
        return ByteString.copyFromUtf8(this.duration_);
    }

    public long getFreeTier() {
        return this.freeTier_;
    }

    public long getMaxLimit() {
        return this.maxLimit_;
    }

    public String getMetric() {
        return this.metric_;
    }

    public ByteString getMetricBytes() {
        return ByteString.copyFromUtf8(this.metric_);
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public String getUnit() {
        return this.unit_;
    }

    public ByteString getUnitBytes() {
        return ByteString.copyFromUtf8(this.unit_);
    }

    public Map getValues() {
        return this.getValuesMap();
    }

    public int getValuesCount() {
        return ((AbstractMap)this.internalGetValues()).size();
    }

    public Map getValuesMap() {
        return Collections.unmodifiableMap(this.internalGetValues());
    }

    public long getValuesOrDefault(String object, long l2) {
        object.getClass();
        MapFieldLite mapFieldLite = this.internalGetValues();
        boolean bl2 = mapFieldLite.containsKey(object);
        if (bl2) {
            object = (Long)mapFieldLite.get(object);
            l2 = (Long)object;
        }
        return l2;
    }

    public long getValuesOrThrow(String object) {
        object.getClass();
        MapFieldLite mapFieldLite = this.internalGetValues();
        boolean bl2 = mapFieldLite.containsKey(object);
        if (bl2) {
            return (Long)mapFieldLite.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }
}

