/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.LaunchStage;
import com.google.api.MetricDescriptor$1;
import com.google.api.MetricDescriptor$MetricDescriptorMetadata$Builder;
import com.google.api.MetricDescriptor$MetricDescriptorMetadataOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.Duration$Builder;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class MetricDescriptor$MetricDescriptorMetadata
extends GeneratedMessageLite
implements MetricDescriptor$MetricDescriptorMetadataOrBuilder {
    private static final MetricDescriptor$MetricDescriptorMetadata DEFAULT_INSTANCE;
    public static final int INGEST_DELAY_FIELD_NUMBER = 3;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    public static final int SAMPLE_PERIOD_FIELD_NUMBER = 2;
    private Duration ingestDelay_;
    private int launchStage_;
    private Duration samplePeriod_;

    static {
        MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata;
        DEFAULT_INSTANCE = metricDescriptor$MetricDescriptorMetadata = new MetricDescriptor$MetricDescriptorMetadata();
        GeneratedMessageLite.registerDefaultInstance(MetricDescriptor$MetricDescriptorMetadata.class, metricDescriptor$MetricDescriptorMetadata);
    }

    private MetricDescriptor$MetricDescriptorMetadata() {
    }

    public static /* synthetic */ MetricDescriptor$MetricDescriptorMetadata access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata, int n3) {
        metricDescriptor$MetricDescriptorMetadata.setLaunchStageValue(n3);
    }

    public static /* synthetic */ void access$200(MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata, LaunchStage launchStage) {
        metricDescriptor$MetricDescriptorMetadata.setLaunchStage(launchStage);
    }

    public static /* synthetic */ void access$300(MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata) {
        metricDescriptor$MetricDescriptorMetadata.clearLaunchStage();
    }

    public static /* synthetic */ void access$400(MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata, Duration duration) {
        metricDescriptor$MetricDescriptorMetadata.setSamplePeriod(duration);
    }

    public static /* synthetic */ void access$500(MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata, Duration duration) {
        metricDescriptor$MetricDescriptorMetadata.mergeSamplePeriod(duration);
    }

    public static /* synthetic */ void access$600(MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata) {
        metricDescriptor$MetricDescriptorMetadata.clearSamplePeriod();
    }

    public static /* synthetic */ void access$700(MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata, Duration duration) {
        metricDescriptor$MetricDescriptorMetadata.setIngestDelay(duration);
    }

    public static /* synthetic */ void access$800(MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata, Duration duration) {
        metricDescriptor$MetricDescriptorMetadata.mergeIngestDelay(duration);
    }

    public static /* synthetic */ void access$900(MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata) {
        metricDescriptor$MetricDescriptorMetadata.clearIngestDelay();
    }

    private void clearIngestDelay() {
        this.ingestDelay_ = null;
    }

    private void clearLaunchStage() {
        this.launchStage_ = 0;
    }

    private void clearSamplePeriod() {
        this.samplePeriod_ = null;
    }

    public static MetricDescriptor$MetricDescriptorMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeIngestDelay(Duration duration) {
        Duration duration2;
        duration.getClass();
        DurationOrBuilder durationOrBuilder = this.ingestDelay_;
        if (durationOrBuilder != null && durationOrBuilder != (duration2 = Duration.getDefaultInstance())) {
            durationOrBuilder = Duration.newBuilder(this.ingestDelay_);
            this.ingestDelay_ = duration = (Duration)((Duration$Builder)((GeneratedMessageLite$Builder)((Object)durationOrBuilder)).mergeFrom(duration)).buildPartial();
        } else {
            this.ingestDelay_ = duration;
        }
    }

    private void mergeSamplePeriod(Duration duration) {
        Duration duration2;
        duration.getClass();
        DurationOrBuilder durationOrBuilder = this.samplePeriod_;
        if (durationOrBuilder != null && durationOrBuilder != (duration2 = Duration.getDefaultInstance())) {
            durationOrBuilder = Duration.newBuilder(this.samplePeriod_);
            this.samplePeriod_ = duration = (Duration)((Duration$Builder)((GeneratedMessageLite$Builder)((Object)durationOrBuilder)).mergeFrom(duration)).buildPartial();
        } else {
            this.samplePeriod_ = duration;
        }
    }

    public static MetricDescriptor$MetricDescriptorMetadata$Builder newBuilder() {
        return (MetricDescriptor$MetricDescriptorMetadata$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static MetricDescriptor$MetricDescriptorMetadata$Builder newBuilder(MetricDescriptor$MetricDescriptorMetadata metricDescriptor$MetricDescriptorMetadata) {
        return (MetricDescriptor$MetricDescriptorMetadata$Builder)DEFAULT_INSTANCE.createBuilder(metricDescriptor$MetricDescriptorMetadata);
    }

    public static MetricDescriptor$MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream) {
        return (MetricDescriptor$MetricDescriptorMetadata)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricDescriptor$MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (MetricDescriptor$MetricDescriptorMetadata)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricDescriptor$MetricDescriptorMetadata parseFrom(ByteString byteString) {
        return (MetricDescriptor$MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static MetricDescriptor$MetricDescriptorMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (MetricDescriptor$MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MetricDescriptor$MetricDescriptorMetadata parseFrom(CodedInputStream codedInputStream) {
        return (MetricDescriptor$MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static MetricDescriptor$MetricDescriptorMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (MetricDescriptor$MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static MetricDescriptor$MetricDescriptorMetadata parseFrom(InputStream inputStream) {
        return (MetricDescriptor$MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static MetricDescriptor$MetricDescriptorMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (MetricDescriptor$MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricDescriptor$MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer) {
        return (MetricDescriptor$MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static MetricDescriptor$MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (MetricDescriptor$MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MetricDescriptor$MetricDescriptorMetadata parseFrom(byte[] byArray) {
        return (MetricDescriptor$MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static MetricDescriptor$MetricDescriptorMetadata parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (MetricDescriptor$MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setIngestDelay(Duration duration) {
        duration.getClass();
        this.ingestDelay_ = duration;
    }

    private void setLaunchStage(LaunchStage launchStage) {
        int n3;
        this.launchStage_ = n3 = launchStage.getNumber();
    }

    private void setLaunchStageValue(int n3) {
        this.launchStage_ = n3;
    }

    private void setSamplePeriod(Duration duration) {
        duration.getClass();
        this.samplePeriod_ = duration;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = MetricDescriptor$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object2 = objectArray.ordinal();
        object2 = object[object2];
        object = null;
        switch (object2) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                objectArray = PARSER;
                if (objectArray != null) return objectArray;
                clazz = MetricDescriptor$MetricDescriptorMetadata.class;
                synchronized (clazz) {
                    try {
                        objectArray = PARSER;
                        if (objectArray != null) return objectArray;
                        object = DEFAULT_INSTANCE;
                        PARSER = objectArray = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                objectArray = new Object[3];
                objectArray[0] = "launchStage_";
                objectArray[by2] = "samplePeriod_";
                objectArray[2] = "ingestDelay_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", objectArray);
            }
            case 2: {
                return new MetricDescriptor$MetricDescriptorMetadata$Builder(null);
            }
            case 1: 
        }
        return new MetricDescriptor$MetricDescriptorMetadata();
    }

    public Duration getIngestDelay() {
        Duration duration = this.ingestDelay_;
        if (duration == null) {
            duration = Duration.getDefaultInstance();
        }
        return duration;
    }

    public LaunchStage getLaunchStage() {
        int n3 = this.launchStage_;
        LaunchStage launchStage = LaunchStage.forNumber(n3);
        if (launchStage == null) {
            launchStage = LaunchStage.UNRECOGNIZED;
        }
        return launchStage;
    }

    public int getLaunchStageValue() {
        return this.launchStage_;
    }

    public Duration getSamplePeriod() {
        Duration duration = this.samplePeriod_;
        if (duration == null) {
            duration = Duration.getDefaultInstance();
        }
        return duration;
    }

    public boolean hasIngestDelay() {
        boolean bl2;
        Duration duration = this.ingestDelay_;
        if (duration != null) {
            bl2 = true;
        } else {
            bl2 = false;
            duration = null;
        }
        return bl2;
    }

    public boolean hasSamplePeriod() {
        boolean bl2;
        Duration duration = this.samplePeriod_;
        if (duration != null) {
            bl2 = true;
        } else {
            bl2 = false;
            duration = null;
        }
        return bl2;
    }
}

