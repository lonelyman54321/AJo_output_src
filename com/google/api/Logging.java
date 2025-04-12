/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Logging$1;
import com.google.api.Logging$Builder;
import com.google.api.Logging$LoggingDestination;
import com.google.api.Logging$LoggingDestinationOrBuilder;
import com.google.api.LoggingOrBuilder;
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

public final class Logging
extends GeneratedMessageLite
implements LoggingOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final Logging DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private Internal$ProtobufList consumerDestinations_;
    private Internal$ProtobufList producerDestinations_;

    static {
        Logging logging;
        DEFAULT_INSTANCE = logging = new Logging();
        GeneratedMessageLite.registerDefaultInstance(Logging.class, logging);
    }

    private Logging() {
        Internal$ProtobufList internal$ProtobufList;
        this.producerDestinations_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.consumerDestinations_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ Logging access$1000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$1100(Logging logging, int n3, Logging$LoggingDestination logging$LoggingDestination) {
        logging.setProducerDestinations(n3, logging$LoggingDestination);
    }

    public static /* synthetic */ void access$1200(Logging logging, Logging$LoggingDestination logging$LoggingDestination) {
        logging.addProducerDestinations(logging$LoggingDestination);
    }

    public static /* synthetic */ void access$1300(Logging logging, int n3, Logging$LoggingDestination logging$LoggingDestination) {
        logging.addProducerDestinations(n3, logging$LoggingDestination);
    }

    public static /* synthetic */ void access$1400(Logging logging, Iterable iterable) {
        logging.addAllProducerDestinations(iterable);
    }

    public static /* synthetic */ void access$1500(Logging logging) {
        logging.clearProducerDestinations();
    }

    public static /* synthetic */ void access$1600(Logging logging, int n3) {
        logging.removeProducerDestinations(n3);
    }

    public static /* synthetic */ void access$1700(Logging logging, int n3, Logging$LoggingDestination logging$LoggingDestination) {
        logging.setConsumerDestinations(n3, logging$LoggingDestination);
    }

    public static /* synthetic */ void access$1800(Logging logging, Logging$LoggingDestination logging$LoggingDestination) {
        logging.addConsumerDestinations(logging$LoggingDestination);
    }

    public static /* synthetic */ void access$1900(Logging logging, int n3, Logging$LoggingDestination logging$LoggingDestination) {
        logging.addConsumerDestinations(n3, logging$LoggingDestination);
    }

    public static /* synthetic */ void access$2000(Logging logging, Iterable iterable) {
        logging.addAllConsumerDestinations(iterable);
    }

    public static /* synthetic */ void access$2100(Logging logging) {
        logging.clearConsumerDestinations();
    }

    public static /* synthetic */ void access$2200(Logging logging, int n3) {
        logging.removeConsumerDestinations(n3);
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

    private void addConsumerDestinations(int n3, Logging$LoggingDestination logging$LoggingDestination) {
        logging$LoggingDestination.getClass();
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(n3, logging$LoggingDestination);
    }

    private void addConsumerDestinations(Logging$LoggingDestination logging$LoggingDestination) {
        logging$LoggingDestination.getClass();
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(logging$LoggingDestination);
    }

    private void addProducerDestinations(int n3, Logging$LoggingDestination logging$LoggingDestination) {
        logging$LoggingDestination.getClass();
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(n3, logging$LoggingDestination);
    }

    private void addProducerDestinations(Logging$LoggingDestination logging$LoggingDestination) {
        logging$LoggingDestination.getClass();
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(logging$LoggingDestination);
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

    public static Logging getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Logging$Builder newBuilder() {
        return (Logging$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Logging$Builder newBuilder(Logging logging) {
        return (Logging$Builder)DEFAULT_INSTANCE.createBuilder(logging);
    }

    public static Logging parseDelimitedFrom(InputStream inputStream) {
        return (Logging)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Logging parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Logging)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Logging parseFrom(ByteString byteString) {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Logging parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Logging parseFrom(CodedInputStream codedInputStream) {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Logging parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Logging parseFrom(InputStream inputStream) {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Logging parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Logging parseFrom(ByteBuffer byteBuffer) {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Logging parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Logging parseFrom(byte[] byArray) {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Logging parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
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

    private void setConsumerDestinations(int n3, Logging$LoggingDestination logging$LoggingDestination) {
        logging$LoggingDestination.getClass();
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(n3, logging$LoggingDestination);
    }

    private void setProducerDestinations(int n3, Logging$LoggingDestination logging$LoggingDestination) {
        logging$LoggingDestination.getClass();
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.set(n3, logging$LoggingDestination);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Logging$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Logging.class;
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
                object = Logging$LoggingDestination.class;
                objectArray[by2] = object;
                objectArray[2] = "consumerDestinations_";
                objectArray[3] = object;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", objectArray);
            }
            case 2: {
                return new Logging$Builder(null);
            }
            case 1: 
        }
        return new Logging();
    }

    public Logging$LoggingDestination getConsumerDestinations(int n3) {
        return (Logging$LoggingDestination)this.consumerDestinations_.get(n3);
    }

    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    public List getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public Logging$LoggingDestinationOrBuilder getConsumerDestinationsOrBuilder(int n3) {
        return (Logging$LoggingDestinationOrBuilder)this.consumerDestinations_.get(n3);
    }

    public List getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    public Logging$LoggingDestination getProducerDestinations(int n3) {
        return (Logging$LoggingDestination)this.producerDestinations_.get(n3);
    }

    public int getProducerDestinationsCount() {
        return this.producerDestinations_.size();
    }

    public List getProducerDestinationsList() {
        return this.producerDestinations_;
    }

    public Logging$LoggingDestinationOrBuilder getProducerDestinationsOrBuilder(int n3) {
        return (Logging$LoggingDestinationOrBuilder)this.producerDestinations_.get(n3);
    }

    public List getProducerDestinationsOrBuilderList() {
        return this.producerDestinations_;
    }
}

