/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.LabelDescriptor;
import com.google.api.LabelDescriptorOrBuilder;
import com.google.api.LaunchStage;
import com.google.api.MetricDescriptor$1;
import com.google.api.MetricDescriptor$Builder;
import com.google.api.MetricDescriptor$MetricDescriptorMetadata;
import com.google.api.MetricDescriptor$MetricDescriptorMetadata$Builder;
import com.google.api.MetricDescriptor$MetricDescriptorMetadataOrBuilder;
import com.google.api.MetricDescriptor$MetricKind;
import com.google.api.MetricDescriptor$ValueType;
import com.google.api.MetricDescriptorOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class MetricDescriptor
extends GeneratedMessageLite
implements MetricDescriptorOrBuilder {
    private static final MetricDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 7;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 12;
    public static final int METADATA_FIELD_NUMBER = 10;
    public static final int METRIC_KIND_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int UNIT_FIELD_NUMBER = 5;
    public static final int VALUE_TYPE_FIELD_NUMBER = 4;
    private String description_;
    private String displayName_;
    private Internal$ProtobufList labels_;
    private int launchStage_;
    private MetricDescriptor$MetricDescriptorMetadata metadata_;
    private int metricKind_;
    private String name_;
    private String type_;
    private String unit_;
    private int valueType_;

    static {
        MetricDescriptor metricDescriptor;
        DEFAULT_INSTANCE = metricDescriptor = new MetricDescriptor();
        GeneratedMessageLite.registerDefaultInstance(MetricDescriptor.class, metricDescriptor);
    }

    private MetricDescriptor() {
        Internal$ProtobufList internal$ProtobufList;
        String string2;
        this.name_ = string2 = "";
        this.type_ = string2;
        this.labels_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.unit_ = string2;
        this.description_ = string2;
        this.displayName_ = string2;
    }

    public static /* synthetic */ MetricDescriptor access$1100() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$1200(MetricDescriptor metricDescriptor, String string2) {
        metricDescriptor.setName(string2);
    }

    public static /* synthetic */ void access$1300(MetricDescriptor metricDescriptor) {
        metricDescriptor.clearName();
    }

    public static /* synthetic */ void access$1400(MetricDescriptor metricDescriptor, ByteString byteString) {
        metricDescriptor.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$1500(MetricDescriptor metricDescriptor, String string2) {
        metricDescriptor.setType(string2);
    }

    public static /* synthetic */ void access$1600(MetricDescriptor metricDescriptor) {
        metricDescriptor.clearType();
    }

    public static /* synthetic */ void access$1700(MetricDescriptor metricDescriptor, ByteString byteString) {
        metricDescriptor.setTypeBytes(byteString);
    }

    public static /* synthetic */ void access$1800(MetricDescriptor metricDescriptor, int n3, LabelDescriptor labelDescriptor) {
        metricDescriptor.setLabels(n3, labelDescriptor);
    }

    public static /* synthetic */ void access$1900(MetricDescriptor metricDescriptor, LabelDescriptor labelDescriptor) {
        metricDescriptor.addLabels(labelDescriptor);
    }

    public static /* synthetic */ void access$2000(MetricDescriptor metricDescriptor, int n3, LabelDescriptor labelDescriptor) {
        metricDescriptor.addLabels(n3, labelDescriptor);
    }

    public static /* synthetic */ void access$2100(MetricDescriptor metricDescriptor, Iterable iterable) {
        metricDescriptor.addAllLabels(iterable);
    }

    public static /* synthetic */ void access$2200(MetricDescriptor metricDescriptor) {
        metricDescriptor.clearLabels();
    }

    public static /* synthetic */ void access$2300(MetricDescriptor metricDescriptor, int n3) {
        metricDescriptor.removeLabels(n3);
    }

    public static /* synthetic */ void access$2400(MetricDescriptor metricDescriptor, int n3) {
        metricDescriptor.setMetricKindValue(n3);
    }

    public static /* synthetic */ void access$2500(MetricDescriptor metricDescriptor, MetricDescriptor$MetricKind metricDescriptor$MetricKind) {
        metricDescriptor.setMetricKind(metricDescriptor$MetricKind);
    }

    public static /* synthetic */ void access$2600(MetricDescriptor metricDescriptor) {
        metricDescriptor.clearMetricKind();
    }

    public static /* synthetic */ void access$2700(MetricDescriptor metricDescriptor, int n3) {
        metricDescriptor.setValueTypeValue(n3);
    }

    public static /* synthetic */ void access$2800(MetricDescriptor metricDescriptor, MetricDescriptor$ValueType metricDescriptor$ValueType) {
        metricDescriptor.setValueType(metricDescriptor$ValueType);
    }

    public static /* synthetic */ void access$2900(MetricDescriptor metricDescriptor) {
        metricDescriptor.clearValueType();
    }

    public static /* synthetic */ void access$3000(MetricDescriptor metricDescriptor, String string2) {
        metricDescriptor.setUnit(string2);
    }

    public static /* synthetic */ void access$3100(MetricDescriptor metricDescriptor) {
        metricDescriptor.clearUnit();
    }

    public static /* synthetic */ void access$3200(MetricDescriptor metricDescriptor, ByteString byteString) {
        metricDescriptor.setUnitBytes(byteString);
    }

    public static /* synthetic */ void access$3300(MetricDescriptor metricDescriptor, String string2) {
        metricDescriptor.setDescription(string2);
    }

    public static /* synthetic */ void access$3400(MetricDescriptor metricDescriptor) {
        metricDescriptor.clearDescription();
    }

    public static /* synthetic */ void access$3500(MetricDescriptor metricDescriptor, ByteString byteString) {
        metricDescriptor.setDescriptionBytes(byteString);
    }

    public static /* synthetic */ void access$3600(MetricDescriptor metricDescriptor, String string2) {
        metricDescriptor.setDisplayName(string2);
    }

    public static /* synthetic */ void access$3700(MetricDescriptor metricDescriptor) {
        metricDescriptor.clearDisplayName();
    }

    public static /* synthetic */ void access$3800(MetricDescriptor metricDescriptor, ByteString byteString) {
        metricDescriptor.setDisplayNameBytes(byteString);
    }

    public static /* synthetic */ void access$3900(MetricDescriptor metricDescriptor, MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata) {
        metricDescriptor.setMetadata(metricDescriptor$MetricDescriptorMetadata);
    }

    public static /* synthetic */ void access$4000(MetricDescriptor metricDescriptor, MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata) {
        metricDescriptor.mergeMetadata(metricDescriptor$MetricDescriptorMetadata);
    }

    public static /* synthetic */ void access$4100(MetricDescriptor metricDescriptor) {
        metricDescriptor.clearMetadata();
    }

    public static /* synthetic */ void access$4200(MetricDescriptor metricDescriptor, int n3) {
        metricDescriptor.setLaunchStageValue(n3);
    }

    public static /* synthetic */ void access$4300(MetricDescriptor metricDescriptor, LaunchStage launchStage) {
        metricDescriptor.setLaunchStage(launchStage);
    }

    public static /* synthetic */ void access$4400(MetricDescriptor metricDescriptor) {
        metricDescriptor.clearLaunchStage();
    }

    private void addAllLabels(Iterable iterable) {
        this.ensureLabelsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.labels_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addLabels(int n3, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        this.ensureLabelsIsMutable();
        this.labels_.add(n3, labelDescriptor);
    }

    private void addLabels(LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        this.ensureLabelsIsMutable();
        this.labels_.add(labelDescriptor);
    }

    private void clearDescription() {
        String string2;
        this.description_ = string2 = MetricDescriptor.getDefaultInstance().getDescription();
    }

    private void clearDisplayName() {
        String string2;
        this.displayName_ = string2 = MetricDescriptor.getDefaultInstance().getDisplayName();
    }

    private void clearLabels() {
        Internal$ProtobufList internal$ProtobufList;
        this.labels_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearLaunchStage() {
        this.launchStage_ = 0;
    }

    private void clearMetadata() {
        this.metadata_ = null;
    }

    private void clearMetricKind() {
        this.metricKind_ = 0;
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = MetricDescriptor.getDefaultInstance().getName();
    }

    private void clearType() {
        String string2;
        this.type_ = string2 = MetricDescriptor.getDefaultInstance().getType();
    }

    private void clearUnit() {
        String string2;
        this.unit_ = string2 = MetricDescriptor.getDefaultInstance().getUnit();
    }

    private void clearValueType() {
        this.valueType_ = 0;
    }

    private void ensureLabelsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.labels_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.labels_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static MetricDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeMetadata(MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata) {
        MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata2;
        metricDescriptor$MetricDescriptorMetadata.getClass();
        MetricDescriptor$MetricDescriptorMetadataOrBuilder metricDescriptor$MetricDescriptorMetadataOrBuilder = this.metadata_;
        if (metricDescriptor$MetricDescriptorMetadataOrBuilder != null && metricDescriptor$MetricDescriptorMetadataOrBuilder != (metricDescriptor$MetricDescriptorMetadata2 = MetricDescriptor$MetricDescriptorMetadata.getDefaultInstance())) {
            metricDescriptor$MetricDescriptorMetadataOrBuilder = MetricDescriptor$MetricDescriptorMetadata.newBuilder(this.metadata_);
            this.metadata_ = metricDescriptor$MetricDescriptorMetadata = (MetricDescriptor$MetricDescriptorMetadata)((MetricDescriptor$MetricDescriptorMetadata$Builder)((GeneratedMessageLite$Builder)((Object)metricDescriptor$MetricDescriptorMetadataOrBuilder)).mergeFrom(metricDescriptor$MetricDescriptorMetadata)).buildPartial();
        } else {
            this.metadata_ = metricDescriptor$MetricDescriptorMetadata;
        }
    }

    public static MetricDescriptor$Builder newBuilder() {
        return (MetricDescriptor$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static MetricDescriptor$Builder newBuilder(MetricDescriptor metricDescriptor) {
        return (MetricDescriptor$Builder)DEFAULT_INSTANCE.createBuilder(metricDescriptor);
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream) {
        return (MetricDescriptor)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (MetricDescriptor)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(ByteString byteString) {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static MetricDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(CodedInputStream codedInputStream) {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static MetricDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream) {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer) {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(byte[] byArray) {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static MetricDescriptor parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeLabels(int n3) {
        this.ensureLabelsIsMutable();
        this.labels_.remove(n3);
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

    private void setLabels(int n3, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        this.ensureLabelsIsMutable();
        this.labels_.set(n3, labelDescriptor);
    }

    private void setLaunchStage(LaunchStage launchStage) {
        int n3;
        this.launchStage_ = n3 = launchStage.getNumber();
    }

    private void setLaunchStageValue(int n3) {
        this.launchStage_ = n3;
    }

    private void setMetadata(MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata) {
        metricDescriptor$MetricDescriptorMetadata.getClass();
        this.metadata_ = metricDescriptor$MetricDescriptorMetadata;
    }

    private void setMetricKind(MetricDescriptor$MetricKind metricDescriptor$MetricKind) {
        int n3;
        this.metricKind_ = n3 = metricDescriptor$MetricKind.getNumber();
    }

    private void setMetricKindValue(int n3) {
        this.metricKind_ = n3;
    }

    private void setName(String string2) {
        string2.getClass();
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.name_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setType(String string2) {
        string2.getClass();
        this.type_ = string2;
    }

    private void setTypeBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.type_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setUnit(String string2) {
        string2.getClass();
        this.unit_ = string2;
    }

    private void setUnitBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.unit_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setValueType(MetricDescriptor$ValueType metricDescriptor$ValueType) {
        int n3;
        this.valueType_ = n3 = metricDescriptor$ValueType.getNumber();
    }

    private void setValueTypeValue(int n3) {
        this.valueType_ = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = MetricDescriptor$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = MetricDescriptor.class;
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
                objectArray = new Object[11];
                objectArray[0] = "name_";
                objectArray[by2] = "labels_";
                objectArray[2] = LabelDescriptor.class;
                objectArray[3] = "metricKind_";
                objectArray[4] = "valueType_";
                objectArray[5] = "unit_";
                objectArray[6] = "description_";
                objectArray[7] = "displayName_";
                objectArray[8] = "type_";
                objectArray[9] = "metadata_";
                objectArray[10] = "launchStage_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\f\n\u0000\u0001\u0000\u0001\u0208\u0002\u001b\u0003\f\u0004\f\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\n\t\f\f", objectArray);
            }
            case 2: {
                return new MetricDescriptor$Builder(null);
            }
            case 1: 
        }
        return new MetricDescriptor();
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

    public LabelDescriptor getLabels(int n3) {
        return (LabelDescriptor)this.labels_.get(n3);
    }

    public int getLabelsCount() {
        return this.labels_.size();
    }

    public List getLabelsList() {
        return this.labels_;
    }

    public LabelDescriptorOrBuilder getLabelsOrBuilder(int n3) {
        return (LabelDescriptorOrBuilder)this.labels_.get(n3);
    }

    public List getLabelsOrBuilderList() {
        return this.labels_;
    }

    public LaunchStage getLaunchStage() {
        int n3 = this.launchStage_;
        LaunchStage launchStage = LaunchStage.forNumber(n3);
        if (launchStage == null) {
            launchStage = LaunchStage.UNRECOGNIZED;
        }
        return launchStage;
    }

    public int getLaunchStageValue() {
        return this.launchStage_;
    }

    public MetricDescriptor$MetricDescriptorMetadata getMetadata() {
        MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata = this.metadata_;
        if (metricDescriptor$MetricDescriptorMetadata == null) {
            metricDescriptor$MetricDescriptorMetadata = MetricDescriptor$MetricDescriptorMetadata.getDefaultInstance();
        }
        return metricDescriptor$MetricDescriptorMetadata;
    }

    public MetricDescriptor$MetricKind getMetricKind() {
        int n3 = this.metricKind_;
        MetricDescriptor$MetricKind metricDescriptor$MetricKind = MetricDescriptor$MetricKind.forNumber(n3);
        if (metricDescriptor$MetricKind == null) {
            metricDescriptor$MetricKind = MetricDescriptor$MetricKind.UNRECOGNIZED;
        }
        return metricDescriptor$MetricKind;
    }

    public int getMetricKindValue() {
        return this.metricKind_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public String getType() {
        return this.type_;
    }

    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    public String getUnit() {
        return this.unit_;
    }

    public ByteString getUnitBytes() {
        return ByteString.copyFromUtf8(this.unit_);
    }

    public MetricDescriptor$ValueType getValueType() {
        int n3 = this.valueType_;
        MetricDescriptor$ValueType metricDescriptor$ValueType = MetricDescriptor$ValueType.forNumber(n3);
        if (metricDescriptor$ValueType == null) {
            metricDescriptor$ValueType = MetricDescriptor$ValueType.UNRECOGNIZED;
        }
        return metricDescriptor$ValueType;
    }

    public int getValueTypeValue() {
        return this.valueType_;
    }

    public boolean hasMetadata() {
        boolean bl2;
        MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata = this.metadata_;
        if (metricDescriptor$MetricDescriptorMetadata != null) {
            bl2 = true;
        } else {
            bl2 = false;
            metricDescriptor$MetricDescriptorMetadata = null;
        }
        return bl2;
    }
}

