/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.LaunchStage;
import com.google.protobuf.Duration;
import com.google.protobuf.MessageLiteOrBuilder;

public interface MetricDescriptor$MetricDescriptorMetadataOrBuilder
extends MessageLiteOrBuilder {
    public Duration getIngestDelay();

    public LaunchStage getLaunchStage();

    public int getLaunchStageValue();

    public Duration getSamplePeriod();

    public boolean hasIngestDelay();

    public boolean hasSamplePeriod();
}

