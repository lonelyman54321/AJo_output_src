/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Logging$1;
import com.google.api.Logging$LoggingDestination$Builder;
import com.google.api.Logging$LoggingDestinationOrBuilder;
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

public final class Logging$LoggingDestination
extends GeneratedMessageLite
implements Logging$LoggingDestinationOrBuilder {
    private static final Logging$LoggingDestination DEFAULT_INSTANCE;
    public static final int LOGS_FIELD_NUMBER = 1;
    public static final int MONITORED_RESOURCE_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    private Internal$ProtobufList logs_;
    private String monitoredResource_ = "";

    static {
        Logging$LoggingDestination logging$LoggingDestination;
        DEFAULT_INSTANCE = logging$LoggingDestination = new Logging$LoggingDestination();
        GeneratedMessageLite.registerDefaultInstance(Logging$LoggingDestination.class, logging$LoggingDestination);
    }

    private Logging$LoggingDestination() {
        Internal$ProtobufList internal$ProtobufList;
        this.logs_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ Logging$LoggingDestination access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Logging$LoggingDestination logging$LoggingDestination, String string2) {
        logging$LoggingDestination.setMonitoredResource(string2);
    }

    public static /* synthetic */ void access$200(Logging$LoggingDestination logging$LoggingDestination) {
        logging$LoggingDestination.clearMonitoredResource();
    }

    public static /* synthetic */ void access$300(Logging$LoggingDestination logging$LoggingDestination, ByteString byteString) {
        logging$LoggingDestination.setMonitoredResourceBytes(byteString);
    }

    public static /* synthetic */ void access$400(Logging$LoggingDestination logging$LoggingDestination, int n3, String string2) {
        logging$LoggingDestination.setLogs(n3, string2);
    }

    public static /* synthetic */ void access$500(Logging$LoggingDestination logging$LoggingDestination, String string2) {
        logging$LoggingDestination.addLogs(string2);
    }

    public static /* synthetic */ void access$600(Logging$LoggingDestination logging$LoggingDestination, Iterable iterable) {
        logging$LoggingDestination.addAllLogs(iterable);
    }

    public static /* synthetic */ void access$700(Logging$LoggingDestination logging$LoggingDestination) {
        logging$LoggingDestination.clearLogs();
    }

    public static /* synthetic */ void access$800(Logging$LoggingDestination logging$LoggingDestination, ByteString byteString) {
        logging$LoggingDestination.addLogsBytes(byteString);
    }

    private void addAllLogs(Iterable iterable) {
        this.ensureLogsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.logs_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addLogs(String string2) {
        string2.getClass();
        this.ensureLogsIsMutable();
        this.logs_.add(string2);
    }

    private void addLogsBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.ensureLogsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.logs_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
    }

    private void clearLogs() {
        Internal$ProtobufList internal$ProtobufList;
        this.logs_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearMonitoredResource() {
        String string2;
        this.monitoredResource_ = string2 = Logging$LoggingDestination.getDefaultInstance().getMonitoredResource();
    }

    private void ensureLogsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.logs_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.logs_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Logging$LoggingDestination getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Logging$LoggingDestination$Builder newBuilder() {
        return (Logging$LoggingDestination$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Logging$LoggingDestination$Builder newBuilder(Logging$LoggingDestination logging$LoggingDestination) {
        return (Logging$LoggingDestination$Builder)DEFAULT_INSTANCE.createBuilder(logging$LoggingDestination);
    }

    public static Logging$LoggingDestination parseDelimitedFrom(InputStream inputStream) {
        return (Logging$LoggingDestination)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Logging$LoggingDestination parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Logging$LoggingDestination)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Logging$LoggingDestination parseFrom(ByteString byteString) {
        return (Logging$LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Logging$LoggingDestination parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Logging$LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Logging$LoggingDestination parseFrom(CodedInputStream codedInputStream) {
        return (Logging$LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Logging$LoggingDestination parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Logging$LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Logging$LoggingDestination parseFrom(InputStream inputStream) {
        return (Logging$LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Logging$LoggingDestination parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Logging$LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Logging$LoggingDestination parseFrom(ByteBuffer byteBuffer) {
        return (Logging$LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Logging$LoggingDestination parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Logging$LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Logging$LoggingDestination parseFrom(byte[] byArray) {
        return (Logging$LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Logging$LoggingDestination parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Logging$LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setLogs(int n3, String string2) {
        string2.getClass();
        this.ensureLogsIsMutable();
        this.logs_.set(n3, string2);
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
        object2 = Logging$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Logging$LoggingDestination.class;
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
                object[0] = "logs_";
                object[by2] = "monitoredResource_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u021a\u0003\u0208", object);
            }
            case 2: {
                return new Logging$LoggingDestination$Builder(null);
            }
            case 1: 
        }
        return new Logging$LoggingDestination();
    }

    public String getLogs(int n3) {
        return (String)this.logs_.get(n3);
    }

    public ByteString getLogsBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.logs_.get(n3));
    }

    public int getLogsCount() {
        return this.logs_.size();
    }

    public List getLogsList() {
        return this.logs_;
    }

    public String getMonitoredResource() {
        return this.monitoredResource_;
    }

    public ByteString getMonitoredResourceBytes() {
        return ByteString.copyFromUtf8(this.monitoredResource_);
    }
}

