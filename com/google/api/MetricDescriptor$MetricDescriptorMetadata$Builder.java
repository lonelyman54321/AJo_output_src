/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.LaunchStage;
import com.google.api.MetricDescriptor$1;
import com.google.api.MetricDescriptor$MetricDescriptorMetadata;
import com.google.api.MetricDescriptor$MetricDescriptorMetadataOrBuilder;
import com.google.protobuf.Duration;
import com.google.protobuf.Duration$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class MetricDescriptor$MetricDescriptorMetadata$Builder
extends GeneratedMessageLite$Builder
implements MetricDescriptor$MetricDescriptorMetadataOrBuilder {
    private MetricDescriptor$MetricDescriptorMetadata$Builder() {
        MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata = MetricDescriptor$MetricDescriptorMetadata.access$000();
        super(metricDescriptor$MetricDescriptorMetadata);
    }

    public /* synthetic */ MetricDescriptor$MetricDescriptorMetadata$Builder(MetricDescriptor$1 metricDescriptor$1) {
        this();
    }

    public MetricDescriptor$MetricDescriptorMetadata$Builder clearIngestDelay() {
        this.copyOnWrite();
        MetricDescriptor$MetricDescriptorMetadata.access$900((MetricDescriptor$MetricDescriptorMetadata)this.instance);
        return this;
    }

    public MetricDescriptor$MetricDescriptorMetadata$Builder clearLaunchStage() {
        this.copyOnWrite();
        MetricDescriptor$MetricDescriptorMetadata.access$300((MetricDescriptor$MetricDescriptorMetadata)this.instance);
        return this;
    }

    public MetricDescriptor$MetricDescriptorMetadata$Builder clearSamplePeriod() {
        this.copyOnWrite();
        MetricDescriptor$MetricDescriptorMetadata.access$600((MetricDescriptor$MetricDescriptorMetadata)this.instance);
        return this;
    }

    public Duration getIngestDelay() {
        return ((MetricDescriptor$MetricDescriptorMetadata)this.instance).getIngestDelay();
    }

    public LaunchStage getLaunchStage() {
        return ((MetricDescriptor$MetricDescriptorMetadata)this.instance).getLaunchStage();
    }

    public int getLaunchStageValue() {
        return ((MetricDescriptor$MetricDescriptorMetadata)this.instance).getLaunchStageValue();
    }

    public Duration getSamplePeriod() {
        return ((MetricDescriptor$MetricDescriptorMetadata)this.instance).getSamplePeriod();
    }

    public boolean hasIngestDelay() {
        return ((MetricDescriptor$MetricDescriptorMetadata)this.instance).hasIngestDelay();
    }

    public boolean hasSamplePeriod() {
        return ((MetricDescriptor$MetricDescriptorMetadata)this.instance).hasSamplePeriod();
    }

    public MetricDescriptor$MetricDescriptorMetadata$Builder mergeIngestDelay(Duration duration) {
        this.copyOnWrite();
        MetricDescriptor$MetricDescriptorMetadata.access$800((MetricDescriptor$MetricDescriptorMetadata)this.instance, duration);
        return this;
    }

    public MetricDescriptor$MetricDescriptorMetadata$Builder mergeSamplePeriod(Duration duration) {
        this.copyOnWrite();
        MetricDescriptor$MetricDescriptorMetadata.access$500((MetricDescriptor$MetricDescriptorMetadata)this.instance, duration);
        return this;
    }

    public MetricDescriptor$MetricDescriptorMetadata$Builder setIngestDelay(Duration$Builder durationOrBuilder) {
        this.copyOnWrite();
        MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata = (MetricDescriptor$MetricDescriptorMetadata)this.instance;
        durationOrBuilder = (Duration)durationOrBuilder.build();
        MetricDescriptor$MetricDescriptorMetadata.access$700(metricDescriptor$MetricDescriptorMetadata, (Duration)durationOrBuilder);
        return this;
    }

    public MetricDescriptor$MetricDescriptorMetadata$Builder setIngestDelay(Duration duration) {
        this.copyOnWrite();
        MetricDescriptor$MetricDescriptorMetadata.access$700((MetricDescriptor$MetricDescriptorMetadata)this.instance, duration);
        return this;
    }

    public MetricDescriptor$MetricDescriptorMetadata$Builder setLaunchStage(LaunchStage launchStage) {
        this.copyOnWrite();
        MetricDescriptor$MetricDescriptorMetadata.access$200((MetricDescriptor$MetricDescriptorMetadata)this.instance, launchStage);
        return this;
    }

    public MetricDescriptor$MetricDescriptorMetadata$Builder setLaunchStageValue(int n3) {
        this.copyOnWrite();
        MetricDescriptor$MetricDescriptorMetadata.access$100((MetricDescriptor$MetricDescriptorMetadata)this.instance, n3);
        return this;
    }

    public MetricDescriptor$MetricDescriptorMetadata$Builder setSamplePeriod(Duration$Builder durationOrBuilder) {
        this.copyOnWrite();
        MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata = (MetricDescriptor$MetricDescriptorMetadata)this.instance;
        durationOrBuilder = (Duration)durationOrBuilder.build();
        MetricDescriptor$MetricDescriptorMetadata.access$400(metricDescriptor$MetricDescriptorMetadata, (Duration)durationOrBuilder);
        return this;
    }

    public MetricDescriptor$MetricDescriptorMetadata$Builder setSamplePeriod(Duration duration) {
        this.copyOnWrite();
        MetricDescriptor$MetricDescriptorMetadata.access$400((MetricDescriptor$MetricDescriptorMetadata)this.instance, duration);
        return this;
    }
}

