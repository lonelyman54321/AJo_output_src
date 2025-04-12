/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import com.google.rpc.QuotaFailure$1;
import com.google.rpc.QuotaFailure$Builder;
import com.google.rpc.QuotaFailure$Violation;
import com.google.rpc.QuotaFailure$ViolationOrBuilder;
import com.google.rpc.QuotaFailureOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class QuotaFailure
extends GeneratedMessageLite
implements QuotaFailureOrBuilder {
    private static final QuotaFailure DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private Internal$ProtobufList violations_;

    static {
        QuotaFailure quotaFailure;
        DEFAULT_INSTANCE = quotaFailure = new QuotaFailure();
        GeneratedMessageLite.registerDefaultInstance(QuotaFailure.class, quotaFailure);
    }

    private QuotaFailure() {
        Internal$ProtobufList internal$ProtobufList;
        this.violations_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ void access$1000(QuotaFailure quotaFailure, QuotaFailure$Violation quotaFailure$Violation) {
        quotaFailure.addViolations(quotaFailure$Violation);
    }

    public static /* synthetic */ void access$1100(QuotaFailure quotaFailure, int n3, QuotaFailure$Violation quotaFailure$Violation) {
        quotaFailure.addViolations(n3, quotaFailure$Violation);
    }

    public static /* synthetic */ void access$1200(QuotaFailure quotaFailure, Iterable iterable) {
        quotaFailure.addAllViolations(iterable);
    }

    public static /* synthetic */ void access$1300(QuotaFailure quotaFailure) {
        quotaFailure.clearViolations();
    }

    public static /* synthetic */ void access$1400(QuotaFailure quotaFailure, int n3) {
        quotaFailure.removeViolations(n3);
    }

    public static /* synthetic */ QuotaFailure access$800() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$900(QuotaFailure quotaFailure, int n3, QuotaFailure$Violation quotaFailure$Violation) {
        quotaFailure.setViolations(n3, quotaFailure$Violation);
    }

    private void addAllViolations(Iterable iterable) {
        this.ensureViolationsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.violations_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addViolations(int n3, QuotaFailure$Violation quotaFailure$Violation) {
        quotaFailure$Violation.getClass();
        this.ensureViolationsIsMutable();
        this.violations_.add(n3, quotaFailure$Violation);
    }

    private void addViolations(QuotaFailure$Violation quotaFailure$Violation) {
        quotaFailure$Violation.getClass();
        this.ensureViolationsIsMutable();
        this.violations_.add(quotaFailure$Violation);
    }

    private void clearViolations() {
        Internal$ProtobufList internal$ProtobufList;
        this.violations_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureViolationsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.violations_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.violations_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static QuotaFailure getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static QuotaFailure$Builder newBuilder() {
        return (QuotaFailure$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static QuotaFailure$Builder newBuilder(QuotaFailure quotaFailure) {
        return (QuotaFailure$Builder)DEFAULT_INSTANCE.createBuilder(quotaFailure);
    }

    public static QuotaFailure parseDelimitedFrom(InputStream inputStream) {
        return (QuotaFailure)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QuotaFailure parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (QuotaFailure)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QuotaFailure parseFrom(ByteString byteString) {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static QuotaFailure parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static QuotaFailure parseFrom(CodedInputStream codedInputStream) {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static QuotaFailure parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static QuotaFailure parseFrom(InputStream inputStream) {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static QuotaFailure parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QuotaFailure parseFrom(ByteBuffer byteBuffer) {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static QuotaFailure parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static QuotaFailure parseFrom(byte[] byArray) {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static QuotaFailure parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeViolations(int n3) {
        this.ensureViolationsIsMutable();
        this.violations_.remove(n3);
    }

    private void setViolations(int n3, QuotaFailure$Violation quotaFailure$Violation) {
        quotaFailure$Violation.getClass();
        this.ensureViolationsIsMutable();
        this.violations_.set(n3, quotaFailure$Violation);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = QuotaFailure$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = QuotaFailure.class;
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
                object[0] = "violations_";
                object[by2] = QuotaFailure$Violation.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", object);
            }
            case 2: {
                return new QuotaFailure$Builder(null);
            }
            case 1: 
        }
        return new QuotaFailure();
    }

    public QuotaFailure$Violation getViolations(int n3) {
        return (QuotaFailure$Violation)this.violations_.get(n3);
    }

    public int getViolationsCount() {
        return this.violations_.size();
    }

    public List getViolationsList() {
        return this.violations_;
    }

    public QuotaFailure$ViolationOrBuilder getViolationsOrBuilder(int n3) {
        return (QuotaFailure$ViolationOrBuilder)this.violations_.get(n3);
    }

    public List getViolationsOrBuilderList() {
        return this.violations_;
    }
}

