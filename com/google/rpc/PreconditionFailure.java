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
import com.google.rpc.PreconditionFailure$1;
import com.google.rpc.PreconditionFailure$Builder;
import com.google.rpc.PreconditionFailure$Violation;
import com.google.rpc.PreconditionFailure$ViolationOrBuilder;
import com.google.rpc.PreconditionFailureOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class PreconditionFailure
extends GeneratedMessageLite
implements PreconditionFailureOrBuilder {
    private static final PreconditionFailure DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private Internal$ProtobufList violations_;

    static {
        PreconditionFailure preconditionFailure;
        DEFAULT_INSTANCE = preconditionFailure = new PreconditionFailure();
        GeneratedMessageLite.registerDefaultInstance(PreconditionFailure.class, preconditionFailure);
    }

    private PreconditionFailure() {
        Internal$ProtobufList internal$ProtobufList;
        this.violations_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ PreconditionFailure access$1100() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$1200(PreconditionFailure preconditionFailure, int n3, PreconditionFailure$Violation preconditionFailure$Violation) {
        preconditionFailure.setViolations(n3, preconditionFailure$Violation);
    }

    public static /* synthetic */ void access$1300(PreconditionFailure preconditionFailure, PreconditionFailure$Violation preconditionFailure$Violation) {
        preconditionFailure.addViolations(preconditionFailure$Violation);
    }

    public static /* synthetic */ void access$1400(PreconditionFailure preconditionFailure, int n3, PreconditionFailure$Violation preconditionFailure$Violation) {
        preconditionFailure.addViolations(n3, preconditionFailure$Violation);
    }

    public static /* synthetic */ void access$1500(PreconditionFailure preconditionFailure, Iterable iterable) {
        preconditionFailure.addAllViolations(iterable);
    }

    public static /* synthetic */ void access$1600(PreconditionFailure preconditionFailure) {
        preconditionFailure.clearViolations();
    }

    public static /* synthetic */ void access$1700(PreconditionFailure preconditionFailure, int n3) {
        preconditionFailure.removeViolations(n3);
    }

    private void addAllViolations(Iterable iterable) {
        this.ensureViolationsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.violations_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addViolations(int n3, PreconditionFailure$Violation preconditionFailure$Violation) {
        preconditionFailure$Violation.getClass();
        this.ensureViolationsIsMutable();
        this.violations_.add(n3, preconditionFailure$Violation);
    }

    private void addViolations(PreconditionFailure$Violation preconditionFailure$Violation) {
        preconditionFailure$Violation.getClass();
        this.ensureViolationsIsMutable();
        this.violations_.add(preconditionFailure$Violation);
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

    public static PreconditionFailure getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static PreconditionFailure$Builder newBuilder() {
        return (PreconditionFailure$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static PreconditionFailure$Builder newBuilder(PreconditionFailure preconditionFailure) {
        return (PreconditionFailure$Builder)DEFAULT_INSTANCE.createBuilder(preconditionFailure);
    }

    public static PreconditionFailure parseDelimitedFrom(InputStream inputStream) {
        return (PreconditionFailure)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreconditionFailure parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PreconditionFailure)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PreconditionFailure parseFrom(ByteString byteString) {
        return (PreconditionFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static PreconditionFailure parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (PreconditionFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PreconditionFailure parseFrom(CodedInputStream codedInputStream) {
        return (PreconditionFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static PreconditionFailure parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PreconditionFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static PreconditionFailure parseFrom(InputStream inputStream) {
        return (PreconditionFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static PreconditionFailure parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PreconditionFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PreconditionFailure parseFrom(ByteBuffer byteBuffer) {
        return (PreconditionFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static PreconditionFailure parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (PreconditionFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PreconditionFailure parseFrom(byte[] byArray) {
        return (PreconditionFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static PreconditionFailure parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (PreconditionFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeViolations(int n3) {
        this.ensureViolationsIsMutable();
        this.violations_.remove(n3);
    }

    private void setViolations(int n3, PreconditionFailure$Violation preconditionFailure$Violation) {
        preconditionFailure$Violation.getClass();
        this.ensureViolationsIsMutable();
        this.violations_.set(n3, preconditionFailure$Violation);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = PreconditionFailure$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = PreconditionFailure.class;
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
                object[by2] = PreconditionFailure$Violation.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", object);
            }
            case 2: {
                return new PreconditionFailure$Builder(null);
            }
            case 1: 
        }
        return new PreconditionFailure();
    }

    public PreconditionFailure$Violation getViolations(int n3) {
        return (PreconditionFailure$Violation)this.violations_.get(n3);
    }

    public int getViolationsCount() {
        return this.violations_.size();
    }

    public List getViolationsList() {
        return this.violations_;
    }

    public PreconditionFailure$ViolationOrBuilder getViolationsOrBuilder(int n3) {
        return (PreconditionFailure$ViolationOrBuilder)this.violations_.get(n3);
    }

    public List getViolationsOrBuilderList() {
        return this.violations_;
    }
}

