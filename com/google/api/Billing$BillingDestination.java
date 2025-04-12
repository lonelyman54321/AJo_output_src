/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Billing$1;
import com.google.api.Billing$BillingDestination$Builder;
import com.google.api.Billing$BillingDestinationOrBuilder;
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

public final class Billing$BillingDestination
extends GeneratedMessageLite
implements Billing$BillingDestinationOrBuilder {
    private static final Billing$BillingDestination DEFAULT_INSTANCE;
    public static final int METRICS_FIELD_NUMBER = 2;
    public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private Internal$ProtobufList metrics_;
    private String monitoredResource_ = "";

    static {
        Billing$BillingDestination billing$BillingDestination;
        DEFAULT_INSTANCE = billing$BillingDestination = new Billing$BillingDestination();
        GeneratedMessageLite.registerDefaultInstance(Billing$BillingDestination.class, billing$BillingDestination);
    }

    private Billing$BillingDestination() {
        Internal$ProtobufList internal$ProtobufList;
        this.metrics_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ Billing$BillingDestination access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Billing$BillingDestination billing$BillingDestination, String string2) {
        billing$BillingDestination.setMonitoredResource(string2);
    }

    public static /* synthetic */ void access$200(Billing$BillingDestination billing$BillingDestination) {
        billing$BillingDestination.clearMonitoredResource();
    }

    public static /* synthetic */ void access$300(Billing$BillingDestination billing$BillingDestination, ByteString byteString) {
        billing$BillingDestination.setMonitoredResourceBytes(byteString);
    }

    public static /* synthetic */ void access$400(Billing$BillingDestination billing$BillingDestination, int n3, String string2) {
        billing$BillingDestination.setMetrics(n3, string2);
    }

    public static /* synthetic */ void access$500(Billing$BillingDestination billing$BillingDestination, String string2) {
        billing$BillingDestination.addMetrics(string2);
    }

    public static /* synthetic */ void access$600(Billing$BillingDestination billing$BillingDestination, Iterable iterable) {
        billing$BillingDestination.addAllMetrics(iterable);
    }

    public static /* synthetic */ void access$700(Billing$BillingDestination billing$BillingDestination) {
        billing$BillingDestination.clearMetrics();
    }

    public static /* synthetic */ void access$800(Billing$BillingDestination billing$BillingDestination, ByteString byteString) {
        billing$BillingDestination.addMetricsBytes(byteString);
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
        this.monitoredResource_ = string2 = Billing$BillingDestination.getDefaultInstance().getMonitoredResource();
    }

    private void ensureMetricsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.metrics_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.metrics_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Billing$BillingDestination getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Billing$BillingDestination$Builder newBuilder() {
        return (Billing$BillingDestination$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Billing$BillingDestination$Builder newBuilder(Billing$BillingDestination billing$BillingDestination) {
        return (Billing$BillingDestination$Builder)DEFAULT_INSTANCE.createBuilder(billing$BillingDestination);
    }

    public static Billing$BillingDestination parseDelimitedFrom(InputStream inputStream) {
        return (Billing$BillingDestination)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Billing$BillingDestination parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Billing$BillingDestination)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Billing$BillingDestination parseFrom(ByteString byteString) {
        return (Billing$BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Billing$BillingDestination parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Billing$BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Billing$BillingDestination parseFrom(CodedInputStream codedInputStream) {
        return (Billing$BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Billing$BillingDestination parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Billing$BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Billing$BillingDestination parseFrom(InputStream inputStream) {
        return (Billing$BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Billing$BillingDestination parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Billing$BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Billing$BillingDestination parseFrom(ByteBuffer byteBuffer) {
        return (Billing$BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Billing$BillingDestination parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Billing$BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Billing$BillingDestination parseFrom(byte[] byArray) {
        return (Billing$BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Billing$BillingDestination parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Billing$BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
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
        object2 = Billing$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Billing$BillingDestination.class;
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
                return new Billing$BillingDestination$Builder(null);
            }
            case 1: 
        }
        return new Billing$BillingDestination();
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

