/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Monitoring$1;
import com.google.api.Monitoring$Builder;
import com.google.api.Monitoring$MonitoringDestination;
import com.google.api.Monitoring$MonitoringDestinationOrBuilder;
import com.google.api.MonitoringOrBuilder;
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

public final class Monitoring
extends GeneratedMessageLite
implements MonitoringOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final Monitoring DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private Internal$ProtobufList consumerDestinations_;
    private Internal$ProtobufList producerDestinations_;

    static {
        Monitoring monitoring;
        DEFAULT_INSTANCE = monitoring = new Monitoring();
        GeneratedMessageLite.registerDefaultInstance(Monitoring.class, monitoring);
    }

    private Monitoring() {
        Internal$ProtobufList internal$ProtobufList;
        this.producerDestinations_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.consumerDestinations_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ Monitoring access$1000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$1100(Monitoring monitoring, int n3, Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        monitoring.setProducerDestinations(n3, monitoring$MonitoringDestination);
    }

    public static /* synthetic */ void access$1200(Monitoring monitoring, Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        monitoring.addProducerDestinations(monitoring$MonitoringDestination);
    }

    public static /* synthetic */ void access$1300(Monitoring monitoring, int n3, Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        monitoring.addProducerDestinations(n3, monitoring$MonitoringDestination);
    }

    public static /* synthetic */ void access$1400(Monitoring monitoring, Iterable iterable) {
        monitoring.addAllProducerDestinations(iterable);
    }

    public static /* synthetic */ void access$1500(Monitoring monitoring) {
        monitoring.clearProducerDestinations();
    }

    public static /* synthetic */ void access$1600(Monitoring monitoring, int n3) {
        monitoring.removeProducerDestinations(n3);
    }

    public static /* synthetic */ void access$1700(Monitoring monitoring, int n3, Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        monitoring.setConsumerDestinations(n3, monitoring$MonitoringDestination);
    }

    public static /* synthetic */ void access$1800(Monitoring monitoring, Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        monitoring.addConsumerDestinations(monitoring$MonitoringDestination);
    }

    public static /* synthetic */ void access$1900(Monitoring monitoring, int n3, Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        monitoring.addConsumerDestinations(n3, monitoring$MonitoringDestination);
    }

    public static /* synthetic */ void access$2000(Monitoring monitoring, Iterable iterable) {
        monitoring.addAllConsumerDestinations(iterable);
    }

    public static /* synthetic */ void access$2100(Monitoring monitoring) {
        monitoring.clearConsumerDestinations();
    }

    public static /* synthetic */ void access$2200(Monitoring monitoring, int n3) {
        monitoring.removeConsumerDestinations(n3);
    }

    private void addAllConsumerDestinations(Iterable iterable) {
        this.ensureConsumerDestinationsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.consumerDestinations_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllProducerDestinations(Iterable iterable) {
        this.ensureProducerDestinationsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.producerDestinations_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addConsumerDestinations(int n3, Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        monitoring$MonitoringDestination.getClass();
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(n3, monitoring$MonitoringDestination);
    }

    private void addConsumerDestinations(Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        monitoring$MonitoringDestination.getClass();
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(monitoring$MonitoringDestination);
    }

    private void addProducerDestinations(int n3, Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        monitoring$MonitoringDestination.getClass();
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(n3, monitoring$MonitoringDestination);
    }

    private void addProducerDestinations(Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        monitoring$MonitoringDestination.getClass();
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(monitoring$MonitoringDestination);
    }

    private void clearConsumerDestinations() {
        Internal$ProtobufList internal$ProtobufList;
        this.consumerDestinations_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearProducerDestinations() {
        Internal$ProtobufList internal$ProtobufList;
        this.producerDestinations_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureConsumerDestinationsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.consumerDestinations_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.consumerDestinations_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureProducerDestinationsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.producerDestinations_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.producerDestinations_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Monitoring getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Monitoring$Builder newBuilder() {
        return (Monitoring$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Monitoring$Builder newBuilder(Monitoring monitoring) {
        return (Monitoring$Builder)DEFAULT_INSTANCE.createBuilder(monitoring);
    }

    public static Monitoring parseDelimitedFrom(InputStream inputStream) {
        return (Monitoring)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Monitoring parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Monitoring)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Monitoring parseFrom(ByteString byteString) {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Monitoring parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Monitoring parseFrom(CodedInputStream codedInputStream) {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Monitoring parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Monitoring parseFrom(InputStream inputStream) {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Monitoring parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Monitoring parseFrom(ByteBuffer byteBuffer) {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Monitoring parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Monitoring parseFrom(byte[] byArray) {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Monitoring parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeConsumerDestinations(int n3) {
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.remove(n3);
    }

    private void removeProducerDestinations(int n3) {
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.remove(n3);
    }

    private void setConsumerDestinations(int n3, Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        monitoring$MonitoringDestination.getClass();
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(n3, monitoring$MonitoringDestination);
    }

    private void setProducerDestinations(int n3, Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        monitoring$MonitoringDestination.getClass();
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.set(n3, monitoring$MonitoringDestination);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Monitoring$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Monitoring.class;
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
                objectArray = new Object[4];
                objectArray[0] = "producerDestinations_";
                object = Monitoring$MonitoringDestination.class;
                objectArray[by2] = object;
                objectArray[2] = "consumerDestinations_";
                objectArray[3] = object;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", objectArray);
            }
            case 2: {
                return new Monitoring$Builder(null);
            }
            case 1: 
        }
        return new Monitoring();
    }

    public Monitoring$MonitoringDestination getConsumerDestinations(int n3) {
        return (Monitoring$MonitoringDestination)this.consumerDestinations_.get(n3);
    }

    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    public List getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public Monitoring$MonitoringDestinationOrBuilder getConsumerDestinationsOrBuilder(int n3) {
        return (Monitoring$MonitoringDestinationOrBuilder)this.consumerDestinations_.get(n3);
    }

    public List getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    public Monitoring$MonitoringDestination getProducerDestinations(int n3) {
        return (Monitoring$MonitoringDestination)this.producerDestinations_.get(n3);
    }

    public int getProducerDestinationsCount() {
        return this.producerDestinations_.size();
    }

    public List getProducerDestinationsList() {
        return this.producerDestinations_;
    }

    public Monitoring$MonitoringDestinationOrBuilder getProducerDestinationsOrBuilder(int n3) {
        return (Monitoring$MonitoringDestinationOrBuilder)this.producerDestinations_.get(n3);
    }

    public List getProducerDestinationsOrBuilderList() {
        return this.producerDestinations_;
    }
}

