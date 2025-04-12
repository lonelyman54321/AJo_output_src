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
import com.google.protobuf.Parser;
import com.google.rpc.BadRequest$1;
import com.google.rpc.BadRequest$FieldViolation$Builder;
import com.google.rpc.BadRequest$FieldViolationOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BadRequest$FieldViolation
extends GeneratedMessageLite
implements BadRequest$FieldViolationOrBuilder {
    private static final BadRequest$FieldViolation DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private String description_;
    private String field_;

    static {
        BadRequest$FieldViolation badRequest$FieldViolation;
        DEFAULT_INSTANCE = badRequest$FieldViolation = new BadRequest$FieldViolation();
        GeneratedMessageLite.registerDefaultInstance(BadRequest$FieldViolation.class, badRequest$FieldViolation);
    }

    private BadRequest$FieldViolation() {
        String string2;
        this.field_ = string2 = "";
        this.description_ = string2;
    }

    public static /* synthetic */ BadRequest$FieldViolation access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(BadRequest$FieldViolation badRequest$FieldViolation, String string2) {
        badRequest$FieldViolation.setField(string2);
    }

    public static /* synthetic */ void access$200(BadRequest$FieldViolation badRequest$FieldViolation) {
        badRequest$FieldViolation.clearField();
    }

    public static /* synthetic */ void access$300(BadRequest$FieldViolation badRequest$FieldViolation, ByteString byteString) {
        badRequest$FieldViolation.setFieldBytes(byteString);
    }

    public static /* synthetic */ void access$400(BadRequest$FieldViolation badRequest$FieldViolation, String string2) {
        badRequest$FieldViolation.setDescription(string2);
    }

    public static /* synthetic */ void access$500(BadRequest$FieldViolation badRequest$FieldViolation) {
        badRequest$FieldViolation.clearDescription();
    }

    public static /* synthetic */ void access$600(BadRequest$FieldViolation badRequest$FieldViolation, ByteString byteString) {
        badRequest$FieldViolation.setDescriptionBytes(byteString);
    }

    private void clearDescription() {
        String string2;
        this.description_ = string2 = BadRequest$FieldViolation.getDefaultInstance().getDescription();
    }

    private void clearField() {
        String string2;
        this.field_ = string2 = BadRequest$FieldViolation.getDefaultInstance().getField();
    }

    public static BadRequest$FieldViolation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static BadRequest$FieldViolation$Builder newBuilder() {
        return (BadRequest$FieldViolation$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static BadRequest$FieldViolation$Builder newBuilder(BadRequest$FieldViolation badRequest$FieldViolation) {
        return (BadRequest$FieldViolation$Builder)DEFAULT_INSTANCE.createBuilder(badRequest$FieldViolation);
    }

    public static BadRequest$FieldViolation parseDelimitedFrom(InputStream inputStream) {
        return (BadRequest$FieldViolation)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BadRequest$FieldViolation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BadRequest$FieldViolation)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BadRequest$FieldViolation parseFrom(ByteString byteString) {
        return (BadRequest$FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static BadRequest$FieldViolation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (BadRequest$FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BadRequest$FieldViolation parseFrom(CodedInputStream codedInputStream) {
        return (BadRequest$FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static BadRequest$FieldViolation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BadRequest$FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static BadRequest$FieldViolation parseFrom(InputStream inputStream) {
        return (BadRequest$FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static BadRequest$FieldViolation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BadRequest$FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BadRequest$FieldViolation parseFrom(ByteBuffer byteBuffer) {
        return (BadRequest$FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static BadRequest$FieldViolation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (BadRequest$FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BadRequest$FieldViolation parseFrom(byte[] byArray) {
        return (BadRequest$FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static BadRequest$FieldViolation parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (BadRequest$FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDescription(String string2) {
        string2.getClass();
        this.description_ = string2;
    }

    private void setDescriptionBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.description_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setField(String string2) {
        string2.getClass();
        this.field_ = string2;
    }

    private void setFieldBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.field_ = object = ((ByteString)object).toStringUtf8();
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
                clazz = BadRequest$FieldViolation.class;
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
                object[0] = "field_";
                object[by2] = "description_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", object);
            }
            case 2: {
                return new BadRequest$FieldViolation$Builder(null);
            }
            case 1: 
        }
        return new BadRequest$FieldViolation();
    }

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    public String getField() {
        return this.field_;
    }

    public ByteString getFieldBytes() {
        return ByteString.copyFromUtf8(this.field_);
    }
}

