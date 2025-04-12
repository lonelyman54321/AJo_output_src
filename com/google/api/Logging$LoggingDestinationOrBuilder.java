/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface Logging$LoggingDestinationOrBuilder
extends MessageLiteOrBuilder {
    public String getLogs(int var1);

    public ByteString getLogsBytes(int var1);

    public int getLogsCount();

    public List getLogsList();

    public String getMonitoredResource();

    public ByteString getMonitoredResourceBytes();
}

