/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.network.NetworkRequestMetricBuilderUtil;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;

public final class InstrHttpInputStream
extends InputStream {
    private long bytesRead;
    private final InputStream inputStream;
    private final NetworkRequestMetricBuilder networkMetricBuilder;
    private long timeToResponseInitiated;
    private long timeToResponseLastRead;
    private final Timer timer;

    public InstrHttpInputStream(InputStream inputStream, NetworkRequestMetricBuilder networkRequestMetricBuilder, Timer timer) {
        long l2;
        long l3;
        this.bytesRead = l3 = (long)-1;
        this.timeToResponseLastRead = l3;
        this.timer = timer;
        this.inputStream = inputStream;
        this.networkMetricBuilder = networkRequestMetricBuilder;
        this.timeToResponseInitiated = l2 = networkRequestMetricBuilder.getTimeToResponseInitiatedMicros();
    }

    public int available() {
        InputStream inputStream;
        try {
            inputStream = this.inputStream;
        }
        catch (IOException iOException) {
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
            long l2 = this.timer.getDurationMicros();
            networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l2);
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw iOException;
        }
        return inputStream.available();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void close() {
        IOException iOException2;
        long l2;
        block5: {
            long l3;
            NetworkRequestMetricBuilder networkRequestMetricBuilder;
            long l4;
            long l7;
            long l8;
            Object object;
            block4: {
                object = this.timer;
                l8 = ((Timer)object).getDurationMicros();
                l2 = this.timeToResponseLastRead;
                l7 = -1;
                long l12 = l2 - l7;
                Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                if (object2 == false) {
                    this.timeToResponseLastRead = l8;
                }
                try {
                    object = this.inputStream;
                    ((InputStream)object).close();
                    l8 = this.bytesRead;
                    l4 = l8 == l7 ? 0 : (l8 < l7 ? -1 : 1);
                    if (l4 == false) break block4;
                    networkRequestMetricBuilder = this.networkMetricBuilder;
                    networkRequestMetricBuilder.setResponsePayloadBytes(l8);
                }
                catch (IOException iOException2) {
                    break block5;
                }
            }
            if ((l4 = (l3 = (l8 = this.timeToResponseInitiated) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
                networkRequestMetricBuilder = this.networkMetricBuilder;
                networkRequestMetricBuilder.setTimeToResponseInitiatedMicros(l8);
            }
            object = this.networkMetricBuilder;
            long l14 = this.timeToResponseLastRead;
            ((NetworkRequestMetricBuilder)object).setTimeToResponseCompletedMicros(l14);
            object = this.networkMetricBuilder;
            ((NetworkRequestMetricBuilder)object).build();
            return;
        }
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
        l2 = this.timer.getDurationMicros();
        networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l2);
        NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
        throw iOException2;
    }

    public void mark(int n3) {
        this.inputStream.mark(n3);
    }

    public boolean markSupported() {
        return this.inputStream.markSupported();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int read() {
        IOException iOException2;
        block4: {
            long l2;
            int n3;
            long l3;
            long l4;
            long l7;
            long l8;
            Object object;
            int n4;
            block3: {
                try {
                    InputStream inputStream = this.inputStream;
                    n4 = inputStream.read();
                    object = this.timer;
                    l8 = ((Timer)object).getDurationMicros();
                    l7 = this.timeToResponseInitiated;
                    l4 = -1;
                    l3 = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1);
                    if (l3 != false) break block3;
                    this.timeToResponseInitiated = l8;
                }
                catch (IOException iOException2) {
                    break block4;
                }
            }
            if (n4 == (n3 = -1) && (l3 = (l2 = (l7 = this.timeToResponseLastRead) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                this.timeToResponseLastRead = l8;
                NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
                networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l8);
                object = this.networkMetricBuilder;
                ((NetworkRequestMetricBuilder)object).build();
                return n4;
            }
            l8 = this.bytesRead;
            l7 = 1L;
            this.bytesRead = l8 += l7;
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
            networkRequestMetricBuilder.setResponsePayloadBytes(l8);
            return n4;
        }
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
        long l12 = this.timer.getDurationMicros();
        networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l12);
        NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
        throw iOException2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int read(byte[] byArray) {
        IOException iOException2;
        block4: {
            long l2;
            int n3;
            long l3;
            long l4;
            long l7;
            long l8;
            int n4;
            Object object;
            block3: {
                try {
                    object = this.inputStream;
                    n4 = ((InputStream)object).read(byArray);
                    object = this.timer;
                    l8 = ((Timer)object).getDurationMicros();
                    l7 = this.timeToResponseInitiated;
                    l4 = -1;
                    l3 = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1);
                    if (l3 != false) break block3;
                    this.timeToResponseInitiated = l8;
                }
                catch (IOException iOException2) {
                    break block4;
                }
            }
            if (n4 == (n3 = -1) && (l3 = (l2 = (l7 = this.timeToResponseLastRead) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                this.timeToResponseLastRead = l8;
                NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
                networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l8);
                object = this.networkMetricBuilder;
                ((NetworkRequestMetricBuilder)object).build();
                return n4;
            }
            l8 = this.bytesRead;
            l7 = n4;
            this.bytesRead = l8 += l7;
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
            networkRequestMetricBuilder.setResponsePayloadBytes(l8);
            return n4;
        }
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
        long l12 = this.timer.getDurationMicros();
        networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l12);
        NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
        throw iOException2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int read(byte[] byArray, int n3, int n4) {
        IOException iOException2;
        block4: {
            long l2;
            int n7;
            long l3;
            long l4;
            long l7;
            long l8;
            Object object;
            int n8;
            Object object2;
            block3: {
                try {
                    object2 = this.inputStream;
                    n8 = ((InputStream)object2).read(byArray, n3, n4);
                    object = this.timer;
                    l8 = ((Timer)object).getDurationMicros();
                    l7 = this.timeToResponseInitiated;
                    l4 = -1;
                    l3 = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1);
                    if (l3 != false) break block3;
                    this.timeToResponseInitiated = l8;
                }
                catch (IOException iOException2) {
                    break block4;
                }
            }
            if (n8 == (n7 = -1) && (l3 = (l2 = (l7 = this.timeToResponseLastRead) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                this.timeToResponseLastRead = l8;
                object2 = this.networkMetricBuilder;
                ((NetworkRequestMetricBuilder)object2).setTimeToResponseCompletedMicros(l8);
                object = this.networkMetricBuilder;
                ((NetworkRequestMetricBuilder)object).build();
                return n8;
            }
            l8 = this.bytesRead;
            l7 = n8;
            this.bytesRead = l8 += l7;
            object2 = this.networkMetricBuilder;
            ((NetworkRequestMetricBuilder)object2).setResponsePayloadBytes(l8);
            return n8;
        }
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
        long l12 = this.timer.getDurationMicros();
        networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l12);
        NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
        throw iOException2;
    }

    public void reset() {
        InputStream inputStream;
        try {
            inputStream = this.inputStream;
        }
        catch (IOException iOException) {
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
            long l2 = this.timer.getDurationMicros();
            networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l2);
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw iOException;
        }
        inputStream.reset();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long skip(long l2) {
        IOException iOException2;
        block4: {
            long l3;
            long l4;
            long l7;
            long l8;
            long l12;
            long l14;
            block3: {
                try {
                    Object object = this.inputStream;
                    l2 = ((InputStream)object).skip(l2);
                    object = this.timer;
                    l14 = ((Timer)object).getDurationMicros();
                    l12 = this.timeToResponseInitiated;
                    l8 = -1;
                    l7 = l12 == l8 ? 0 : (l12 < l8 ? -1 : 1);
                    if (l7 != false) break block3;
                    this.timeToResponseInitiated = l14;
                }
                catch (IOException iOException2) {
                    break block4;
                }
            }
            if ((l4 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1)) == false && (l7 = (l3 = (l12 = this.timeToResponseLastRead) - l8) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                this.timeToResponseLastRead = l14;
                NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
                networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l14);
                return l2;
            }
            this.bytesRead = l14 = this.bytesRead + l2;
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
            networkRequestMetricBuilder.setResponsePayloadBytes(l14);
            return l2;
        }
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
        long l15 = this.timer.getDurationMicros();
        networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l15);
        NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
        throw iOException2;
    }
}

