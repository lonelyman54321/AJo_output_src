/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.LabelDescriptor;
import com.google.api.LabelDescriptor$Builder;
import com.google.api.LaunchStage;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.MonitoredResourceDescriptor$1;
import com.google.api.MonitoredResourceDescriptorOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class MonitoredResourceDescriptor$Builder
extends GeneratedMessageLite$Builder
implements MonitoredResourceDescriptorOrBuilder {
    private MonitoredResourceDescriptor$Builder() {
        MonitoredResourceDescriptor monitoredResourceDescriptor = MonitoredResourceDescriptor.access$000();
        super(monitoredResourceDescriptor);
    }

    public /* synthetic */ MonitoredResourceDescriptor$Builder(MonitoredResourceDescriptor$1 monitoredResourceDescriptor$1) {
        this();
    }

    public MonitoredResourceDescriptor$Builder addAllLabels(Iterable iterable) {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$1600((MonitoredResourceDescriptor)this.instance, iterable);
        return this;
    }

    public MonitoredResourceDescriptor$Builder addLabels(int n3, LabelDescriptor$Builder labelDescriptorOrBuilder) {
        this.copyOnWrite();
        MonitoredResourceDescriptor monitoredResourceDescriptor = (MonitoredResourceDescriptor)this.instance;
        labelDescriptorOrBuilder = (LabelDescriptor)labelDescriptorOrBuilder.build();
        MonitoredResourceDescriptor.access$1500(monitoredResourceDescriptor, n3, (LabelDescriptor)labelDescriptorOrBuilder);
        return this;
    }

    public MonitoredResourceDescriptor$Builder addLabels(int n3, LabelDescriptor labelDescriptor) {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$1500((MonitoredResourceDescriptor)this.instance, n3, labelDescriptor);
        return this;
    }

    public MonitoredResourceDescriptor$Builder addLabels(LabelDescriptor$Builder labelDescriptorOrBuilder) {
        this.copyOnWrite();
        MonitoredResourceDescriptor monitoredResourceDescriptor = (MonitoredResourceDescriptor)this.instance;
        labelDescriptorOrBuilder = (LabelDescriptor)labelDescriptorOrBuilder.build();
        MonitoredResourceDescriptor.access$1400(monitoredResourceDescriptor, (LabelDescriptor)labelDescriptorOrBuilder);
        return this;
    }

    public MonitoredResourceDescriptor$Builder addLabels(LabelDescriptor labelDescriptor) {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$1400((MonitoredResourceDescriptor)this.instance, labelDescriptor);
        return this;
    }

    public MonitoredResourceDescriptor$Builder clearDescription() {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$1100((MonitoredResourceDescriptor)this.instance);
        return this;
    }

    public MonitoredResourceDescriptor$Builder clearDisplayName() {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$800((MonitoredResourceDescriptor)this.instance);
        return this;
    }

    public MonitoredResourceDescriptor$Builder clearLabels() {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$1700((MonitoredResourceDescriptor)this.instance);
        return this;
    }

    public MonitoredResourceDescriptor$Builder clearLaunchStage() {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$2100((MonitoredResourceDescriptor)this.instance);
        return this;
    }

    public MonitoredResourceDescriptor$Builder clearName() {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$200((MonitoredResourceDescriptor)this.instance);
        return this;
    }

    public MonitoredResourceDescriptor$Builder clearType() {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$500((MonitoredResourceDescriptor)this.instance);
        return this;
    }

    public String getDescription() {
        return ((MonitoredResourceDescriptor)this.instance).getDescription();
    }

    public ByteString getDescriptionBytes() {
        return ((MonitoredResourceDescriptor)this.instance).getDescriptionBytes();
    }

    public String getDisplayName() {
        return ((MonitoredResourceDescriptor)this.instance).getDisplayName();
    }

    public ByteString getDisplayNameBytes() {
        return ((MonitoredResourceDescriptor)this.instance).getDisplayNameBytes();
    }

    public LabelDescriptor getLabels(int n3) {
        return ((MonitoredResourceDescriptor)this.instance).getLabels(n3);
    }

    public int getLabelsCount() {
        return ((MonitoredResourceDescriptor)this.instance).getLabelsCount();
    }

    public List getLabelsList() {
        return Collections.unmodifiableList(((MonitoredResourceDescriptor)this.instance).getLabelsList());
    }

    public LaunchStage getLaunchStage() {
        return ((MonitoredResourceDescriptor)this.instance).getLaunchStage();
    }

    public int getLaunchStageValue() {
        return ((MonitoredResourceDescriptor)this.instance).getLaunchStageValue();
    }

    public String getName() {
        return ((MonitoredResourceDescriptor)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((MonitoredResourceDescriptor)this.instance).getNameBytes();
    }

    public String getType() {
        return ((MonitoredResourceDescriptor)this.instance).getType();
    }

    public ByteString getTypeBytes() {
        return ((MonitoredResourceDescriptor)this.instance).getTypeBytes();
    }

    public MonitoredResourceDescriptor$Builder removeLabels(int n3) {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$1800((MonitoredResourceDescriptor)this.instance, n3);
        return this;
    }

    public MonitoredResourceDescriptor$Builder setDescription(String string2) {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$1000((MonitoredResourceDescriptor)this.instance, string2);
        return this;
    }

    public MonitoredResourceDescriptor$Builder setDescriptionBytes(ByteString byteString) {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$1200((MonitoredResourceDescriptor)this.instance, byteString);
        return this;
    }

    public MonitoredResourceDescriptor$Builder setDisplayName(String string2) {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$700((MonitoredResourceDescriptor)this.instance, string2);
        return this;
    }

    public MonitoredResourceDescriptor$Builder setDisplayNameBytes(ByteString byteString) {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$900((MonitoredResourceDescriptor)this.instance, byteString);
        return this;
    }

    public MonitoredResourceDescriptor$Builder setLabels(int n3, LabelDescriptor$Builder labelDescriptorOrBuilder) {
        this.copyOnWrite();
        MonitoredResourceDescriptor monitoredResourceDescriptor = (MonitoredResourceDescriptor)this.instance;
        labelDescriptorOrBuilder = (LabelDescriptor)labelDescriptorOrBuilder.build();
        MonitoredResourceDescriptor.access$1300(monitoredResourceDescriptor, n3, (LabelDescriptor)labelDescriptorOrBuilder);
        return this;
    }

    public MonitoredResourceDescriptor$Builder setLabels(int n3, LabelDescriptor labelDescriptor) {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$1300((MonitoredResourceDescriptor)this.instance, n3, labelDescriptor);
        return this;
    }

    public MonitoredResourceDescriptor$Builder setLaunchStage(LaunchStage launchStage) {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$2000((MonitoredResourceDescriptor)this.instance, launchStage);
        return this;
    }

    public MonitoredResourceDescriptor$Builder setLaunchStageValue(int n3) {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$1900((MonitoredResourceDescriptor)this.instance, n3);
        return this;
    }

    public MonitoredResourceDescriptor$Builder setName(String string2) {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$100((MonitoredResourceDescriptor)this.instance, string2);
        return this;
    }

    public MonitoredResourceDescriptor$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$300((MonitoredResourceDescriptor)this.instance, byteString);
        return this;
    }

    public MonitoredResourceDescriptor$Builder setType(String string2) {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$400((MonitoredResourceDescriptor)this.instance, string2);
        return this;
    }

    public MonitoredResourceDescriptor$Builder setTypeBytes(ByteString byteString) {
        this.copyOnWrite();
        MonitoredResourceDescriptor.access$600((MonitoredResourceDescriptor)this.instance, byteString);
        return this;
    }
}

