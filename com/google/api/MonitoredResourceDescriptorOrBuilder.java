/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.LabelDescriptor;
import com.google.api.LaunchStage;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface MonitoredResourceDescriptorOrBuilder
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

    public String getName();

    public ByteString getNameBytes();

    public String getType();

    public ByteString getTypeBytes();
}

