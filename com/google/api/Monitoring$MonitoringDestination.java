/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Monitoring$1;
import com.google.api.Monitoring$MonitoringDestination$Builder;
import com.google.api.Monitoring$MonitoringDestinationOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Monitoring$MonitoringDestination
extends GeneratedMessageLite
implements Monitoring$MonitoringDestinationOrBuilder {
    private static final Monitoring$MonitoringDestination DEFAULT_INSTANCE;
    public static final int METRICS_FIELD_NUMBER = 2;
    public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private Internal$ProtobufList metrics_;
    private String monitoredResource_ = "";

    static {
        Monitoring$MonitoringDestination monitoring$MonitoringDestination;
        DEFAULT_INSTANCE = monitoring$MonitoringDestination = new Monitoring$MonitoringDestination();
        GeneratedMessageLite.registerDefaultInstance(Monitoring$MonitoringDestination.class, monitoring$MonitoringDestination);
    }

    private Monitoring$MonitoringDestination() {
        Internal$ProtobufList internal$ProtobufList;
        this.metrics_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ Monitoring$MonitoringDestination access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Monitoring$MonitoringDestination monitoring$MonitoringDestination, String string2) {
        monitoring$MonitoringDestination.setMonitoredResource(string2);
    }

    public static /* synthetic */ void access$200(Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        monitoring$MonitoringDestination.clearMonitoredResource();
    }

    public static /* synthetic */ void access$300(Monitoring$MonitoringDestination monitoring$MonitoringDestination, ByteString byteString) {
        monitoring$MonitoringDestination.setMonitoredResourceBytes(byteString);
    }

    public static /* synthetic */ void access$400(Monitoring$MonitoringDestination monitoring$MonitoringDestination, int n3, String string2) {
        monitoring$MonitoringDestination.setMetrics(n3, string2);
    }

    public static /* synthetic */ void access$500(Monitoring$MonitoringDestination monitoring$MonitoringDestination, String string2) {
        monitoring$MonitoringDestination.addMetrics(string2);
    }

    public static /* synthetic */ void access$600(Monitoring$MonitoringDestination monitoring$MonitoringDestination, Iterable iterable) {
        monitoring$MonitoringDestination.addAllMetrics(iterable);
    }

    public static /* synthetic */ void access$700(Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        monitoring$MonitoringDestination.clearMetrics();
    }

    public static /* synthetic */ void access$800(Monitoring$MonitoringDestination monitoring$MonitoringDestination, ByteString byteString) {
        monitoring$MonitoringDestination.addMetricsBytes(byteString);
    }

    private void addAllMetrics(Iterable iterable) {
        this.ensureMetricsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.metrics_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addMetrics(String string2) {
        string2.getClass();
        this.ensureMetricsIsMutable();
        this.metrics_.add(string2);
    }

    private void addMetricsBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.ensureMetricsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.metrics_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
    }

    private void clearMetrics() {
        Internal$ProtobufList internal$ProtobufList;
        this.metrics_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearMonitoredResource() {
        String string2;
        this.monitoredResource_ = string2 = Monitoring$MonitoringDestination.getDefaultInstance().getMonitoredResource();
    }

    private void ensureMetricsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.metrics_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.metrics_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Monitoring$MonitoringDestination getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Monitoring$MonitoringDestination$Builder newBuilder() {
        return (Monitoring$MonitoringDestination$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Monitoring$MonitoringDestination$Builder newBuilder(Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        return (Monitoring$MonitoringDestination$Builder)DEFAULT_INSTANCE.createBuilder(monitoring$MonitoringDestination);
    }

    public static Monitoring$MonitoringDestination parseDelimitedFrom(InputStream inputStream) {
        return (Monitoring$MonitoringDestination)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Monitoring$MonitoringDestination parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Monitoring$MonitoringDestination)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Monitoring$MonitoringDestination parseFrom(ByteString byteString) {
        return (Monitoring$MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Monitoring$MonitoringDestination parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Monitoring$MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Monitoring$MonitoringDestination parseFrom(CodedInputStream codedInputStream) {
        return (Monitoring$MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Monitoring$MonitoringDestination parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Monitoring$MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Monitoring$MonitoringDestination parseFrom(InputStream inputStream) {
        return (Monitoring$MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Monitoring$MonitoringDestination parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Monitoring$MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Monitoring$MonitoringDestination parseFrom(ByteBuffer byteBuffer) {
        return (Monitoring$MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Monitoring$MonitoringDestination parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Monitoring$MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Monitoring$MonitoringDestination parseFrom(byte[] byArray) {
        return (Monitoring$MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Monitoring$MonitoringDestination parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Monitoring$MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setMetrics(int n3, String string2) {
        string2.getClass();
        this.ensureMetricsIsMutable();
        this.metrics_.set(n3, string2);
    }

    private void setMonitoredResource(String string2) {
        string2.getClass();
        this.monitoredResource_ = string2;
    }

    private void setMonitoredResourceBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.monitoredResource_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = Monitoring$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object3 = object.ordinal();
        object3 = object2[object3];
        object2 = null;
        switch (object3) {
            default: {
                object = new UnsupportedOperationException();
                throw object;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                object = PARSER;
                if (object != null) return object;
                clazz = Monitoring$MonitoringDestination.class;
                synchronized (clazz) {
                    try {
                        object = PARSER;
                        if (object != null) return object;
                        object2 = DEFAULT_INSTANCE;
                        PARSER = object = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object2);
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                object = new Object[2];
                object[0] = "monitoredResource_";
                object[by2] = "metrics_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u021a", object);
            }
            case 2: {
                return new Monitoring$MonitoringDestination$Builder(null);
            }
            case 1: 
        }
        return new Monitoring$MonitoringDestination();
    }

    public String getMetrics(int n3) {
        return (String)this.metrics_.get(n3);
    }

    public ByteString getMetricsBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.metrics_.get(n3));
    }

    public int getMetricsCount() {
        return this.metrics_.size();
    }

    public List getMetricsList() {
        return this.metrics_;
    }

    public String getMonitoredResource() {
        return this.monitoredResource_;
    }

    public ByteString getMonitoredResourceBytes() {
        return ByteString.copyFromUtf8(this.monitoredResource_);
    }
}

