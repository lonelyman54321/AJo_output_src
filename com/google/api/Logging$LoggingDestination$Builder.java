/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Logging$1;
import com.google.api.Logging$LoggingDestination;
import com.google.api.Logging$LoggingDestinationOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class Logging$LoggingDestination$Builder
extends GeneratedMessageLite$Builder
implements Logging$LoggingDestinationOrBuilder {
    private Logging$LoggingDestination$Builder() {
        Logging$LoggingDestination logging$LoggingDestination = Logging$LoggingDestination.access$000();
        super(logging$LoggingDestination);
    }

    public /* synthetic */ Logging$LoggingDestination$Builder(Logging$1 logging$1) {
        this();
    }

    public Logging$LoggingDestination$Builder addAllLogs(Iterable iterable) {
        this.copyOnWrite();
        Logging$LoggingDestination.access$600((Logging$LoggingDestination)this.instance, iterable);
        return this;
    }

    public Logging$LoggingDestination$Builder addLogs(String string2) {
        this.copyOnWrite();
        Logging$LoggingDestination.access$500((Logging$LoggingDestination)this.instance, string2);
        return this;
    }

    public Logging$LoggingDestination$Builder addLogsBytes(ByteString byteString) {
        this.copyOnWrite();
        Logging$LoggingDestination.access$800((Logging$LoggingDestination)this.instance, byteString);
        return this;
    }

    public Logging$LoggingDestination$Builder clearLogs() {
        this.copyOnWrite();
        Logging$LoggingDestination.access$700((Logging$LoggingDestination)this.instance);
        return this;
    }

    public Logging$LoggingDestination$Builder clearMonitoredResource() {
        this.copyOnWrite();
        Logging$LoggingDestination.access$200((Logging$LoggingDestination)this.instance);
        return this;
    }

    public String getLogs(int n3) {
        return ((Logging$LoggingDestination)this.instance).getLogs(n3);
    }

    public ByteString getLogsBytes(int n3) {
        return ((Logging$LoggingDestination)this.instance).getLogsBytes(n3);
    }

    public int getLogsCount() {
        return ((Logging$LoggingDestination)this.instance).getLogsCount();
    }

    public List getLogsList() {
        return Collections.unmodifiableList(((Logging$LoggingDestination)this.instance).getLogsList());
    }

    public String getMonitoredResource() {
        return ((Logging$LoggingDestination)this.instance).getMonitoredResource();
    }

    public ByteString getMonitoredResourceBytes() {
        return ((Logging$LoggingDestination)this.instance).getMonitoredResourceBytes();
    }

    public Logging$LoggingDestination$Builder setLogs(int n3, String string2) {
        this.copyOnWrite();
        Logging$LoggingDestination.access$400((Logging$LoggingDestination)this.instance, n3, string2);
        return this;
    }

    public Logging$LoggingDestination$Builder setMonitoredResource(String string2) {
        this.copyOnWrite();
        Logging$LoggingDestination.access$100((Logging$LoggingDestination)this.instance, string2);
        return this;
    }

    public Logging$LoggingDestination$Builder setMonitoredResourceBytes(ByteString byteString) {
        this.copyOnWrite();
        Logging$LoggingDestination.access$300((Logging$LoggingDestination)this.instance, byteString);
        return this;
    }
}

