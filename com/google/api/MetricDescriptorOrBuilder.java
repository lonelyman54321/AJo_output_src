/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.LabelDescriptor;
import com.google.api.LaunchStage;
import com.google.api.MetricDescriptor$MetricDescriptorMetadata;
import com.google.api.MetricDescriptor$MetricKind;
import com.google.api.MetricDescriptor$ValueType;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface MetricDescriptorOrBuilder
extends MessageLiteOrBuilder {
    public String getDescription();

    public ByteString getDescriptionBytes();

    public String getDisplayName();

    public ByteString getDisplayNameBytes();

    public LabelDescriptor getLabels(int var1);

    public int getLabelsCount();

    public List getLabelsList();

    public LaunchStage getLaunchStage();

    public int getLaunchStageValue();

    public MetricDescriptor.MetricDescriptorMetadata getMetadata();

    public MetricDescriptor$MetricKind getMetricKind();

    public int getMetricKindValue();

    public String getName();

    public ByteString getNameBytes();

    public String getType();

    public ByteString getTypeBytes();

    public String getUnit();

    public ByteString getUnitBytes();

    public MetricDescriptor$ValueType getValueType();

    public int getValueTypeValue();

    public boolean hasMetadata();
}

