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
import com.google.rpc.BadRequest$1;
import com.google.rpc.BadRequest$Builder;
import com.google.rpc.BadRequest$FieldViolation;
import com.google.rpc.BadRequest$FieldViolationOrBuilder;
import com.google.rpc.BadRequestOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class BadRequest
extends GeneratedMessageLite
implements BadRequestOrBuilder {
    private static final BadRequest DEFAULT_INSTANCE;
    public static final int FIELD_VIOLATIONS_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private Internal$ProtobufList fieldViolations_;

    static {
        BadRequest badRequest;
        DEFAULT_INSTANCE = badRequest = new BadRequest();
        GeneratedMessageLite.registerDefaultInstance(BadRequest.class, badRequest);
    }

    private BadRequest() {
        Internal$ProtobufList internal$ProtobufList;
        this.fieldViolations_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ void access$1000(BadRequest badRequest, BadRequest$FieldViolation badRequest$FieldViolation) {
        badRequest.addFieldViolations(badRequest$FieldViolation);
    }

    public static /* synthetic */ void access$1100(BadRequest badRequest, int n3, BadRequest$FieldViolation badRequest$FieldViolation) {
        badRequest.addFieldViolations(n3, badRequest$FieldViolation);
    }

    public static /* synthetic */ void access$1200(BadRequest badRequest, Iterable iterable) {
        badRequest.addAllFieldViolations(iterable);
    }

    public static /* synthetic */ void access$1300(BadRequest badRequest) {
        badRequest.clearFieldViolations();
    }

    public static /* synthetic */ void access$1400(BadRequest badRequest, int n3) {
        badRequest.removeFieldViolations(n3);
    }

    public static /* synthetic */ BadRequest access$800() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$900(BadRequest badRequest, int n3, BadRequest$FieldViolation badRequest$FieldViolation) {
        badRequest.setFieldViolations(n3, badRequest$FieldViolation);
    }

    private void addAllFieldViolations(Iterable iterable) {
        this.ensureFieldViolationsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.fieldViolations_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addFieldViolations(int n3, BadRequest$FieldViolation badRequest$FieldViolation) {
        badRequest$FieldViolation.getClass();
        this.ensureFieldViolationsIsMutable();
        this.fieldViolations_.add(n3, badRequest$FieldViolation);
    }

    private void addFieldViolations(BadRequest$FieldViolation badRequest$FieldViolation) {
        badRequest$FieldViolation.getClass();
        this.ensureFieldViolationsIsMutable();
        this.fieldViolations_.add(badRequest$FieldViolation);
    }

    private void clearFieldViolations() {
        Internal$ProtobufList internal$ProtobufList;
        this.fieldViolations_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureFieldViolationsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.fieldViolations_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.fieldViolations_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static BadRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static BadRequest$Builder newBuilder() {
        return (BadRequest$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static BadRequest$Builder newBuilder(BadRequest badRequest) {
        return (BadRequest$Builder)DEFAULT_INSTANCE.createBuilder(badRequest);
    }

    public static BadRequest parseDelimitedFrom(InputStream inputStream) {
        return (BadRequest)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BadRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BadRequest)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BadRequest parseFrom(ByteString byteString) {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static BadRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BadRequest parseFrom(CodedInputStream codedInputStream) {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static BadRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static BadRequest parseFrom(InputStream inputStream) {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static BadRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BadRequest parseFrom(ByteBuffer byteBuffer) {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static BadRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BadRequest parseFrom(byte[] byArray) {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static BadRequest parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeFieldViolations(int n3) {
        this.ensureFieldViolationsIsMutable();
        this.fieldViolations_.remove(n3);
    }

    private void setFieldViolations(int n3, BadRequest$FieldViolation badRequest$FieldViolation) {
        badRequest$FieldViolation.getClass();
        this.ensureFieldViolationsIsMutable();
        this.fieldViolations_.set(n3, badRequest$FieldViolation);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = BadRequest$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = BadRequest.class;
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
                object[0] = "fieldViolations_";
                object[by2] = BadRequest$FieldViolation.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", object);
            }
            case 2: {
                return new BadRequest$Builder(null);
            }
            case 1: 
        }
        return new BadRequest();
    }

    public BadRequest$FieldViolation getFieldViolations(int n3) {
        return (BadRequest$FieldViolation)this.fieldViolations_.get(n3);
    }

    public int getFieldViolationsCount() {
        return this.fieldViolations_.size();
    }

    public List getFieldViolationsList() {
        return this.fieldViolations_;
    }

    public BadRequest$FieldViolationOrBuilder getFieldViolationsOrBuilder(int n3) {
        return (BadRequest$FieldViolationOrBuilder)this.fieldViolations_.get(n3);
    }

    public List getFieldViolationsOrBuilderList() {
        return this.fieldViolations_;
    }
}

