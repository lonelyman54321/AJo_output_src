/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.LabelDescriptor;
import com.google.api.LabelDescriptor$Builder;
import com.google.api.LaunchStage;
import com.google.api.MetricDescriptor;
import com.google.api.MetricDescriptor$1;
import com.google.api.MetricDescriptor$MetricDescriptorMetadata;
import com.google.api.MetricDescriptor$MetricDescriptorMetadata$Builder;
import com.google.api.MetricDescriptor$MetricKind;
import com.google.api.MetricDescriptor$ValueType;
import com.google.api.MetricDescriptorOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class MetricDescriptor$Builder
extends GeneratedMessageLite$Builder
implements MetricDescriptorOrBuilder {
    private MetricDescriptor$Builder() {
        MetricDescriptor metricDescriptor = MetricDescriptor.access$1100();
        super(metricDescriptor);
    }

    public /* synthetic */ MetricDescriptor$Builder(MetricDescriptor$1 metricDescriptor$1) {
        this();
    }

    public MetricDescriptor$Builder addAllLabels(Iterable iterable) {
        this.copyOnWrite();
        MetricDescriptor.access$2100((MetricDescriptor)this.instance, iterable);
        return this;
    }

    public MetricDescriptor$Builder addLabels(int n3, LabelDescriptor$Builder labelDescriptorOrBuilder) {
        this.copyOnWrite();
        MetricDescriptor metricDescriptor = (MetricDescriptor)this.instance;
        labelDescriptorOrBuilder = (LabelDescriptor)labelDescriptorOrBuilder.build();
        MetricDescriptor.access$2000(metricDescriptor, n3, (LabelDescriptor)labelDescriptorOrBuilder);
        return this;
    }

    public MetricDescriptor$Builder addLabels(int n3, LabelDescriptor labelDescriptor) {
        this.copyOnWrite();
        MetricDescriptor.access$2000((MetricDescriptor)this.instance, n3, labelDescriptor);
        return this;
    }

    public MetricDescriptor$Builder addLabels(LabelDescriptor$Builder labelDescriptorOrBuilder) {
        this.copyOnWrite();
        MetricDescriptor metricDescriptor = (MetricDescriptor)this.instance;
        labelDescriptorOrBuilder = (LabelDescriptor)labelDescriptorOrBuilder.build();
        MetricDescriptor.access$1900(metricDescriptor, (LabelDescriptor)labelDescriptorOrBuilder);
        return this;
    }

    public MetricDescriptor$Builder addLabels(LabelDescriptor labelDescriptor) {
        this.copyOnWrite();
        MetricDescriptor.access$1900((MetricDescriptor)this.instance, labelDescriptor);
        return this;
    }

    public MetricDescriptor$Builder clearDescription() {
        this.copyOnWrite();
        MetricDescriptor.access$3400((MetricDescriptor)this.instance);
        return this;
    }

    public MetricDescriptor$Builder clearDisplayName() {
        this.copyOnWrite();
        MetricDescriptor.access$3700((MetricDescriptor)this.instance);
        return this;
    }

    public MetricDescriptor$Builder clearLabels() {
        this.copyOnWrite();
        MetricDescriptor.access$2200((MetricDescriptor)this.instance);
        return this;
    }

    public MetricDescriptor$Builder clearLaunchStage() {
        this.copyOnWrite();
        MetricDescriptor.access$4400((MetricDescriptor)this.instance);
        return this;
    }

    public MetricDescriptor$Builder clearMetadata() {
        this.copyOnWrite();
        MetricDescriptor.access$4100((MetricDescriptor)this.instance);
        return this;
    }

    public MetricDescriptor$Builder clearMetricKind() {
        this.copyOnWrite();
        MetricDescriptor.access$2600((MetricDescriptor)this.instance);
        return this;
    }

    public MetricDescriptor$Builder clearName() {
        this.copyOnWrite();
        MetricDescriptor.access$1300((MetricDescriptor)this.instance);
        return this;
    }

    public MetricDescriptor$Builder clearType() {
        this.copyOnWrite();
        MetricDescriptor.access$1600((MetricDescriptor)this.instance);
        return this;
    }

    public MetricDescriptor$Builder clearUnit() {
        this.copyOnWrite();
        MetricDescriptor.access$3100((MetricDescriptor)this.instance);
        return this;
    }

    public MetricDescriptor$Builder clearValueType() {
        this.copyOnWrite();
        MetricDescriptor.access$2900((MetricDescriptor)this.instance);
        return this;
    }

    public String getDescription() {
        return ((MetricDescriptor)this.instance).getDescription();
    }

    public ByteString getDescriptionBytes() {
        return ((MetricDescriptor)this.instance).getDescriptionBytes();
    }

    public String getDisplayName() {
        return ((MetricDescriptor)this.instance).getDisplayName();
    }

    public ByteString getDisplayNameBytes() {
        return ((MetricDescriptor)this.instance).getDisplayNameBytes();
    }

    public LabelDescriptor getLabels(int n3) {
        return ((MetricDescriptor)this.instance).getLabels(n3);
    }

    public int getLabelsCount() {
        return ((MetricDescriptor)this.instance).getLabelsCount();
    }

    public List getLabelsList() {
        return Collections.unmodifiableList(((MetricDescriptor)this.instance).getLabelsList());
    }

    public LaunchStage getLaunchStage() {
        return ((MetricDescriptor)this.instance).getLaunchStage();
    }

    public int getLaunchStageValue() {
        return ((MetricDescriptor)this.instance).getLaunchStageValue();
    }

    public MetricDescriptor$MetricDescriptorMetadata getMetadata() {
        return ((MetricDescriptor)this.instance).getMetadata();
    }

    public MetricDescriptor$MetricKind getMetricKind() {
        return ((MetricDescriptor)this.instance).getMetricKind();
    }

    public int getMetricKindValue() {
        return ((MetricDescriptor)this.instance).getMetricKindValue();
    }

    public String getName() {
        return ((MetricDescriptor)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((MetricDescriptor)this.instance).getNameBytes();
    }

    public String getType() {
        return ((MetricDescriptor)this.instance).getType();
    }

    public ByteString getTypeBytes() {
        return ((MetricDescriptor)this.instance).getTypeBytes();
    }

    public String getUnit() {
        return ((MetricDescriptor)this.instance).getUnit();
    }

    public ByteString getUnitBytes() {
        return ((MetricDescriptor)this.instance).getUnitBytes();
    }

    public MetricDescriptor$ValueType getValueType() {
        return ((MetricDescriptor)this.instance).getValueType();
    }

    public int getValueTypeValue() {
        return ((MetricDescriptor)this.instance).getValueTypeValue();
    }

    public boolean hasMetadata() {
        return ((MetricDescriptor)this.instance).hasMetadata();
    }

    public MetricDescriptor$Builder mergeMetadata(MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata) {
        this.copyOnWrite();
        MetricDescriptor.access$4000((MetricDescriptor)this.instance, metricDescriptor$MetricDescriptorMetadata);
        return this;
    }

    public MetricDescriptor$Builder removeLabels(int n3) {
        this.copyOnWrite();
        MetricDescriptor.access$2300((MetricDescriptor)this.instance, n3);
        return this;
    }

    public MetricDescriptor$Builder setDescription(String string2) {
        this.copyOnWrite();
        MetricDescriptor.access$3300((MetricDescriptor)this.instance, string2);
        return this;
    }

    public MetricDescriptor$Builder setDescriptionBytes(ByteString byteString) {
        this.copyOnWrite();
        MetricDescriptor.access$3500((MetricDescriptor)this.instance, byteString);
        return this;
    }

    public MetricDescriptor$Builder setDisplayName(String string2) {
        this.copyOnWrite();
        MetricDescriptor.access$3600((MetricDescriptor)this.instance, string2);
        return this;
    }

    public MetricDescriptor$Builder setDisplayNameBytes(ByteString byteString) {
        this.copyOnWrite();
        MetricDescriptor.access$3800((MetricDescriptor)this.instance, byteString);
        return this;
    }

    public MetricDescriptor$Builder setLabels(int n3, LabelDescriptor$Builder labelDescriptorOrBuilder) {
        this.copyOnWrite();
        MetricDescriptor metricDescriptor = (MetricDescriptor)this.instance;
        labelDescriptorOrBuilder = (LabelDescriptor)labelDescriptorOrBuilder.build();
        MetricDescriptor.access$1800(metricDescriptor, n3, (LabelDescriptor)labelDescriptorOrBuilder);
        return this;
    }

    public MetricDescriptor$Builder setLabels(int n3, LabelDescriptor labelDescriptor) {
        this.copyOnWrite();
        MetricDescriptor.access$1800((MetricDescriptor)this.instance, n3, labelDescriptor);
        return this;
    }

    public MetricDescriptor$Builder setLaunchStage(LaunchStage launchStage) {
        this.copyOnWrite();
        MetricDescriptor.access$4300((MetricDescriptor)this.instance, launchStage);
        return this;
    }

    public MetricDescriptor$Builder setLaunchStageValue(int n3) {
        this.copyOnWrite();
        MetricDescriptor.access$4200((MetricDescriptor)this.instance, n3);
        return this;
    }

    public MetricDescriptor$Builder setMetadata(MetricDescriptor$MetricDescriptorMetadata$Builder metricDescriptor$MetricDescriptorMetadataOrBuilder) {
        this.copyOnWrite();
        MetricDescriptor metricDescriptor = (MetricDescriptor)this.instance;
        metricDescriptor$MetricDescriptorMetadataOrBuilder = (MetricDescriptor$MetricDescriptorMetadata)metricDescriptor$MetricDescriptorMetadataOrBuilder.build();
        MetricDescriptor.access$3900(metricDescriptor, (MetricDescriptor$MetricDescriptorMetadata)metricDescriptor$MetricDescriptorMetadataOrBuilder);
        return this;
    }

    public MetricDescriptor$Builder setMetadata(MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata) {
        this.copyOnWrite();
        MetricDescriptor.access$3900((MetricDescriptor)this.instance, metricDescriptor$MetricDescriptorMetadata);
        return this;
    }

    public MetricDescriptor$Builder setMetricKind(MetricDescriptor$MetricKind metricDescriptor$MetricKind) {
        this.copyOnWrite();
        MetricDescriptor.access$2500((MetricDescriptor)this.instance, metricDescriptor$MetricKind);
        return this;
    }

    public MetricDescriptor$Builder setMetricKindValue(int n3) {
        this.copyOnWrite();
        MetricDescriptor.access$2400((MetricDescriptor)this.instance, n3);
        return this;
    }

    public MetricDescriptor$Builder setName(String string2) {
        this.copyOnWrite();
        MetricDescriptor.access$1200((MetricDescriptor)this.instance, string2);
        return this;
    }

    public MetricDescriptor$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        MetricDescriptor.access$1400((MetricDescriptor)this.instance, byteString);
        return this;
    }

    public MetricDescriptor$Builder setType(String string2) {
        this.copyOnWrite();
        MetricDescriptor.access$1500((MetricDescriptor)this.instance, string2);
        return this;
    }

    public MetricDescriptor$Builder setTypeBytes(ByteString byteString) {
        this.copyOnWrite();
        MetricDescriptor.access$1700((MetricDescriptor)this.instance, byteString);
        return this;
    }

    public MetricDescriptor$Builder setUnit(String string2) {
        this.copyOnWrite();
        MetricDescriptor.access$3000((MetricDescriptor)this.instance, string2);
        return this;
    }

    public MetricDescriptor$Builder setUnitBytes(ByteString byteString) {
        this.copyOnWrite();
        MetricDescriptor.access$3200((MetricDescriptor)this.instance, byteString);
        return this;
    }

    public MetricDescriptor$Builder setValueType(MetricDescriptor$ValueType metricDescriptor$ValueType) {
        this.copyOnWrite();
        MetricDescriptor.access$2800((MetricDescriptor)this.instance, metricDescriptor$ValueType);
        return this;
    }

    public MetricDescriptor$Builder setValueTypeValue(int n3) {
        this.copyOnWrite();
        MetricDescriptor.access$2700((MetricDescriptor)this.instance, n3);
        return this;
    }
}

