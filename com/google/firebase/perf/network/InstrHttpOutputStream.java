/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.network.NetworkRequestMetricBuilderUtil;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;

public final class InstrHttpOutputStream
extends OutputStream {
    long bytesWritten = -1;
    NetworkRequestMetricBuilder networkMetricBuilder;
    private final OutputStream outputStream;
    private final Timer timer;

    public InstrHttpOutputStream(OutputStream outputStream, NetworkRequestMetricBuilder networkRequestMetricBuilder, Timer timer) {
        this.outputStream = outputStream;
        this.networkMetricBuilder = networkRequestMetricBuilder;
        this.timer = timer;
    }

    public void close() {
        long l2 = this.bytesWritten;
        long l3 = -1;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
            networkRequestMetricBuilder.setRequestPayloadBytes(l2);
        }
        Object object2 = this.networkMetricBuilder;
        Object object3 = this.timer;
        long l7 = ((Timer)object3).getDurationMicros();
        ((NetworkRequestMetricBuilder)object2).setTimeToRequestCompletedMicros(l7);
        try {
            object2 = this.outputStream;
        }
        catch (IOException iOException) {
            object3 = this.networkMetricBuilder;
            l3 = this.timer.getDurationMicros();
            ((NetworkRequestMetricBuilder)object3).setTimeToResponseCompletedMicros(l3);
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw iOException;
        }
        ((OutputStream)object2).close();
    }

    public void flush() {
        OutputStream outputStream;
        try {
            outputStream = this.outputStream;
        }
        catch (IOException iOException) {
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
            long l2 = this.timer.getDurationMicros();
            networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l2);
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw iOException;
        }
        outputStream.flush();
    }

    public void write(int n3) {
        Object object;
        try {
            object = this.outputStream;
        }
        catch (IOException iOException) {
            object = this.networkMetricBuilder;
            long l2 = this.timer.getDurationMicros();
            ((NetworkRequestMetricBuilder)object).setTimeToResponseCompletedMicros(l2);
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw iOException;
        }
        ((OutputStream)object).write(n3);
        long l3 = this.bytesWritten;
        long l4 = 1L;
        l3 += l4;
        this.bytesWritten = l3;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
        networkRequestMetricBuilder.setRequestPayloadBytes(l3);
    }

    public void write(byte[] object) {
        Object object2;
        try {
            object2 = this.outputStream;
        }
        catch (IOException iOException) {
            object2 = this.networkMetricBuilder;
            long l2 = this.timer.getDurationMicros();
            ((NetworkRequestMetricBuilder)object2).setTimeToResponseCompletedMicros(l2);
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw iOException;
        }
        ((OutputStream)object2).write((byte[])object);
        long l3 = this.bytesWritten;
        int n3 = ((byte[])object).length;
        long l4 = n3;
        l3 += l4;
        this.bytesWritten = l3;
        object = this.networkMetricBuilder;
        ((NetworkRequestMetricBuilder)object).setRequestPayloadBytes(l3);
    }

    public void write(byte[] byArray, int n3, int n4) {
        long l2;
        OutputStream outputStream;
        try {
            outputStream = this.outputStream;
        }
        catch (IOException iOException) {
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
            l2 = this.timer.getDurationMicros();
            networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l2);
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw iOException;
        }
        outputStream.write(byArray, n3, n4);
        long l3 = this.bytesWritten;
        l2 = n4;
        l3 += l2;
        this.bytesWritten = l3;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
        networkRequestMetricBuilder.setRequestPayloadBytes(l3);
    }
}

