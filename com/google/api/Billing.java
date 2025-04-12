/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Billing$1;
import com.google.api.Billing$BillingDestination;
import com.google.api.Billing$BillingDestinationOrBuilder;
import com.google.api.Billing$Builder;
import com.google.api.BillingOrBuilder;
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

public final class Billing
extends GeneratedMessageLite
implements BillingOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 8;
    private static final Billing DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    private Internal$ProtobufList consumerDestinations_;

    static {
        Billing billing;
        DEFAULT_INSTANCE = billing = new Billing();
        GeneratedMessageLite.registerDefaultInstance(Billing.class, billing);
    }

    private Billing() {
        Internal$ProtobufList internal$ProtobufList;
        this.consumerDestinations_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ Billing access$1000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$1100(Billing billing, int n3, Billing$BillingDestination billing$BillingDestination) {
        billing.setConsumerDestinations(n3, billing$BillingDestination);
    }

    public static /* synthetic */ void access$1200(Billing billing, Billing$BillingDestination billing$BillingDestination) {
        billing.addConsumerDestinations(billing$BillingDestination);
    }

    public static /* synthetic */ void access$1300(Billing billing, int n3, Billing$BillingDestination billing$BillingDestination) {
        billing.addConsumerDestinations(n3, billing$BillingDestination);
    }

    public static /* synthetic */ void access$1400(Billing billing, Iterable iterable) {
        billing.addAllConsumerDestinations(iterable);
    }

    public static /* synthetic */ void access$1500(Billing billing) {
        billing.clearConsumerDestinations();
    }

    public static /* synthetic */ void access$1600(Billing billing, int n3) {
        billing.removeConsumerDestinations(n3);
    }

    private void addAllConsumerDestinations(Iterable iterable) {
        this.ensureConsumerDestinationsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.consumerDestinations_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addConsumerDestinations(int n3, Billing$BillingDestination billing$BillingDestination) {
        billing$BillingDestination.getClass();
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(n3, billing$BillingDestination);
    }

    private void addConsumerDestinations(Billing$BillingDestination billing$BillingDestination) {
        billing$BillingDestination.getClass();
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(billing$BillingDestination);
    }

    private void clearConsumerDestinations() {
        Internal$ProtobufList internal$ProtobufList;
        this.consumerDestinations_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureConsumerDestinationsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.consumerDestinations_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.consumerDestinations_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Billing getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Billing$Builder newBuilder() {
        return (Billing$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Billing$Builder newBuilder(Billing billing) {
        return (Billing$Builder)DEFAULT_INSTANCE.createBuilder(billing);
    }

    public static Billing parseDelimitedFrom(InputStream inputStream) {
        return (Billing)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Billing parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Billing)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Billing parseFrom(ByteString byteString) {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Billing parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Billing parseFrom(CodedInputStream codedInputStream) {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Billing parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Billing parseFrom(InputStream inputStream) {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Billing parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Billing parseFrom(ByteBuffer byteBuffer) {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Billing parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Billing parseFrom(byte[] byArray) {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Billing parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeConsumerDestinations(int n3) {
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.remove(n3);
    }

    private void setConsumerDestinations(int n3, Billing$BillingDestination billing$BillingDestination) {
        billing$BillingDestination.getClass();
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(n3, billing$BillingDestination);
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
                clazz = Billing.class;
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
                object[0] = "consumerDestinations_";
                object[by2] = Billing$BillingDestination.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", object);
            }
            case 2: {
                return new Billing$Builder(null);
            }
            case 1: 
        }
        return new Billing();
    }

    public Billing$BillingDestination getConsumerDestinations(int n3) {
        return (Billing$BillingDestination)this.consumerDestinations_.get(n3);
    }

    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    public List getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public Billing$BillingDestinationOrBuilder getConsumerDestinationsOrBuilder(int n3) {
        return (Billing$BillingDestinationOrBuilder)this.consumerDestinations_.get(n3);
    }

    public List getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }
}

