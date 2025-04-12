/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Distribution$1;
import com.google.api.Distribution$Exemplar$Builder;
import com.google.api.Distribution$ExemplarOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.protobuf.Timestamp$Builder;
import com.google.protobuf.TimestampOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Distribution$Exemplar
extends GeneratedMessageLite
implements Distribution$ExemplarOrBuilder {
    public static final int ATTACHMENTS_FIELD_NUMBER = 3;
    private static final Distribution$Exemplar DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    public static final int VALUE_FIELD_NUMBER = 1;
    private Internal$ProtobufList attachments_;
    private Timestamp timestamp_;
    private double value_;

    static {
        Distribution$Exemplar distribution$Exemplar;
        DEFAULT_INSTANCE = distribution$Exemplar = new Distribution$Exemplar();
        GeneratedMessageLite.registerDefaultInstance(Distribution$Exemplar.class, distribution$Exemplar);
    }

    private Distribution$Exemplar() {
        Internal$ProtobufList internal$ProtobufList;
        this.attachments_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ Distribution$Exemplar access$4000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$4100(Distribution$Exemplar distribution$Exemplar, double d2) {
        distribution$Exemplar.setValue(d2);
    }

    public static /* synthetic */ void access$4200(Distribution$Exemplar distribution$Exemplar) {
        distribution$Exemplar.clearValue();
    }

    public static /* synthetic */ void access$4300(Distribution$Exemplar distribution$Exemplar, Timestamp timestamp) {
        distribution$Exemplar.setTimestamp(timestamp);
    }

    public static /* synthetic */ void access$4400(Distribution$Exemplar distribution$Exemplar, Timestamp timestamp) {
        distribution$Exemplar.mergeTimestamp(timestamp);
    }

    public static /* synthetic */ void access$4500(Distribution$Exemplar distribution$Exemplar) {
        distribution$Exemplar.clearTimestamp();
    }

    public static /* synthetic */ void access$4600(Distribution$Exemplar distribution$Exemplar, int n3, Any any) {
        distribution$Exemplar.setAttachments(n3, any);
    }

    public static /* synthetic */ void access$4700(Distribution$Exemplar distribution$Exemplar, Any any) {
        distribution$Exemplar.addAttachments(any);
    }

    public static /* synthetic */ void access$4800(Distribution$Exemplar distribution$Exemplar, int n3, Any any) {
        distribution$Exemplar.addAttachments(n3, any);
    }

    public static /* synthetic */ void access$4900(Distribution$Exemplar distribution$Exemplar, Iterable iterable) {
        distribution$Exemplar.addAllAttachments(iterable);
    }

    public static /* synthetic */ void access$5000(Distribution$Exemplar distribution$Exemplar) {
        distribution$Exemplar.clearAttachments();
    }

    public static /* synthetic */ void access$5100(Distribution$Exemplar distribution$Exemplar, int n3) {
        distribution$Exemplar.removeAttachments(n3);
    }

    private void addAllAttachments(Iterable iterable) {
        this.ensureAttachmentsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.attachments_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAttachments(int n3, Any any) {
        any.getClass();
        this.ensureAttachmentsIsMutable();
        this.attachments_.add(n3, any);
    }

    private void addAttachments(Any any) {
        any.getClass();
        this.ensureAttachmentsIsMutable();
        this.attachments_.add(any);
    }

    private void clearAttachments() {
        Internal$ProtobufList internal$ProtobufList;
        this.attachments_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearTimestamp() {
        this.timestamp_ = null;
    }

    private void clearValue() {
        this.value_ = 0.0;
    }

    private void ensureAttachmentsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.attachments_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.attachments_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Distribution$Exemplar getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeTimestamp(Timestamp timestamp) {
        Timestamp timestamp2;
        timestamp.getClass();
        TimestampOrBuilder timestampOrBuilder = this.timestamp_;
        if (timestampOrBuilder != null && timestampOrBuilder != (timestamp2 = Timestamp.getDefaultInstance())) {
            timestampOrBuilder = Timestamp.newBuilder(this.timestamp_);
            this.timestamp_ = timestamp = (Timestamp)((Timestamp$Builder)((GeneratedMessageLite$Builder)((Object)timestampOrBuilder)).mergeFrom(timestamp)).buildPartial();
        } else {
            this.timestamp_ = timestamp;
        }
    }

    public static Distribution$Exemplar$Builder newBuilder() {
        return (Distribution$Exemplar$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Distribution$Exemplar$Builder newBuilder(Distribution$Exemplar distribution$Exemplar) {
        return (Distribution$Exemplar$Builder)DEFAULT_INSTANCE.createBuilder(distribution$Exemplar);
    }

    public static Distribution$Exemplar parseDelimitedFrom(InputStream inputStream) {
        return (Distribution$Exemplar)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution$Exemplar parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$Exemplar)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Distribution$Exemplar parseFrom(ByteString byteString) {
        return (Distribution$Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Distribution$Exemplar parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Distribution$Exemplar parseFrom(CodedInputStream codedInputStream) {
        return (Distribution$Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Distribution$Exemplar parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Distribution$Exemplar parseFrom(InputStream inputStream) {
        return (Distribution$Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution$Exemplar parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Distribution$Exemplar parseFrom(ByteBuffer byteBuffer) {
        return (Distribution$Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Distribution$Exemplar parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Distribution$Exemplar parseFrom(byte[] byArray) {
        return (Distribution$Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Distribution$Exemplar parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Distribution$Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAttachments(int n3) {
        this.ensureAttachmentsIsMutable();
        this.attachments_.remove(n3);
    }

    private void setAttachments(int n3, Any any) {
        any.getClass();
        this.ensureAttachmentsIsMutable();
        this.attachments_.set(n3, any);
    }

    private void setTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        this.timestamp_ = timestamp;
    }

    private void setValue(double d2) {
        this.value_ = d2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Distribution$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Distribution$Exemplar.class;
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
                objectArray[0] = "value_";
                objectArray[by2] = "timestamp_";
                objectArray[2] = "attachments_";
                objectArray[3] = Any.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0000\u0002\t\u0003\u001b", objectArray);
            }
            case 2: {
                return new Distribution$Exemplar$Builder(null);
            }
            case 1: 
        }
        return new Distribution$Exemplar();
    }

    public Any getAttachments(int n3) {
        return (Any)this.attachments_.get(n3);
    }

    public int getAttachmentsCount() {
        return this.attachments_.size();
    }

    public List getAttachmentsList() {
        return this.attachments_;
    }

    public AnyOrBuilder getAttachmentsOrBuilder(int n3) {
        return (AnyOrBuilder)this.attachments_.get(n3);
    }

    public List getAttachmentsOrBuilderList() {
        return this.attachments_;
    }

    public Timestamp getTimestamp() {
        Timestamp timestamp = this.timestamp_;
        if (timestamp == null) {
            timestamp = Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    public double getValue() {
        return this.value_;
    }

    public boolean hasTimestamp() {
        boolean bl2;
        Timestamp timestamp = this.timestamp_;
        if (timestamp != null) {
            bl2 = true;
        } else {
            bl2 = false;
            timestamp = null;
        }
        return bl2;
    }
}

