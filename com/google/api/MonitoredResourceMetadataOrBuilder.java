/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Struct;
import java.util.Map;

public interface MonitoredResourceMetadataOrBuilder
extends MessageLiteOrBuilder {
    public boolean containsUserLabels(String var1);

    public Struct getSystemLabels();

    public Map getUserLabels();

    public int getUserLabelsCount();

    public Map getUserLabelsMap();

    public String getUserLabelsOrDefault(String var1, String var2);

    public String getUserLabelsOrThrow(String var1);

    public boolean hasSystemLabels();
}

