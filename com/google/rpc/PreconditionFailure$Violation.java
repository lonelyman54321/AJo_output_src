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
import com.google.rpc.PreconditionFailure$1;
import com.google.rpc.PreconditionFailure$Violation$Builder;
import com.google.rpc.PreconditionFailure$ViolationOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class PreconditionFailure$Violation
extends GeneratedMessageLite
implements PreconditionFailure$ViolationOrBuilder {
    private static final PreconditionFailure$Violation DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    public static final int SUBJECT_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String description_;
    private String subject_;
    private String type_;

    static {
        PreconditionFailure$Violation preconditionFailure$Violation;
        DEFAULT_INSTANCE = preconditionFailure$Violation = new PreconditionFailure$Violation();
        GeneratedMessageLite.registerDefaultInstance(PreconditionFailure$Violation.class, preconditionFailure$Violation);
    }

    private PreconditionFailure$Violation() {
        String string2;
        this.type_ = string2 = "";
        this.subject_ = string2;
        this.description_ = string2;
    }

    public static /* synthetic */ PreconditionFailure$Violation access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(PreconditionFailure$Violation preconditionFailure$Violation, String string2) {
        preconditionFailure$Violation.setType(string2);
    }

    public static /* synthetic */ void access$200(PreconditionFailure$Violation preconditionFailure$Violation) {
        preconditionFailure$Violation.clearType();
    }

    public static /* synthetic */ void access$300(PreconditionFailure$Violation preconditionFailure$Violation, ByteString byteString) {
        preconditionFailure$Violation.setTypeBytes(byteString);
    }

    public static /* synthetic */ void access$400(PreconditionFailure$Violation preconditionFailure$Violation, String string2) {
        preconditionFailure$Violation.setSubject(string2);
    }

    public static /* synthetic */ void access$500(PreconditionFailure$Violation preconditionFailure$Violation) {
        preconditionFailure$Violation.clearSubject();
    }

    public static /* synthetic */ void access$600(PreconditionFailure$Violation preconditionFailure$Violation, ByteString byteString) {
        preconditionFailure$Violation.setSubjectBytes(byteString);
    }

    public static /* synthetic */ void access$700(PreconditionFailure$Violation preconditionFailure$Violation, String string2) {
        preconditionFailure$Violation.setDescription(string2);
    }

    public static /* synthetic */ void access$800(PreconditionFailure$Violation preconditionFailure$Violation) {
        preconditionFailure$Violation.clearDescription();
    }

    public static /* synthetic */ void access$900(PreconditionFailure$Violation preconditionFailure$Violation, ByteString byteString) {
        preconditionFailure$Violation.setDescriptionBytes(byteString);
    }

    private void clearDescription() {
        String string2;
        this.description_ = string2 = PreconditionFailure$Violation.getDefaultInstance().getDescription();
    }

    private void clearSubject() {
        String string2;
        this.subject_ = string2 = PreconditionFailure$Violation.getDefaultInstance().getSubject();
    }

    private void clearType() {
        String string2;
        this.type_ = string2 = PreconditionFailure$Violation.getDefaultInstance().getType();
    }

    public static PreconditionFailure$Violation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static PreconditionFailure$Violation$Builder newBuilder() {
        return (PreconditionFailure$Violation$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static PreconditionFailure$Violation$Builder newBuilder(PreconditionFailure$Violation preconditionFailure$Violation) {
        return (PreconditionFailure$Violation$Builder)DEFAULT_INSTANCE.createBuilder(preconditionFailure$Violation);
    }

    public static PreconditionFailure$Violation parseDelimitedFrom(InputStream inputStream) {
        return (PreconditionFailure$Violation)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreconditionFailure$Violation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PreconditionFailure$Violation)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PreconditionFailure$Violation parseFrom(ByteString byteString) {
        return (PreconditionFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static PreconditionFailure$Violation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (PreconditionFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PreconditionFailure$Violation parseFrom(CodedInputStream codedInputStream) {
        return (PreconditionFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static PreconditionFailure$Violation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PreconditionFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static PreconditionFailure$Violation parseFrom(InputStream inputStream) {
        return (PreconditionFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static PreconditionFailure$Violation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PreconditionFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PreconditionFailure$Violation parseFrom(ByteBuffer byteBuffer) {
        return (PreconditionFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static PreconditionFailure$Violation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (PreconditionFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PreconditionFailure$Violation parseFrom(byte[] byArray) {
        return (PreconditionFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static PreconditionFailure$Violation parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (PreconditionFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
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

    private void setSubject(String string2) {
        string2.getClass();
        this.subject_ = string2;
    }

    private void setSubjectBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.subject_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setType(String string2) {
        string2.getClass();
        this.type_ = string2;
    }

    private void setTypeBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.type_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = PreconditionFailure$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = PreconditionFailure$Violation.class;
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
                objectArray = new Object[3];
                objectArray[0] = "type_";
                objectArray[by2] = "subject_";
                objectArray[2] = "description_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", objectArray);
            }
            case 2: {
                return new PreconditionFailure$Violation$Builder(null);
            }
            case 1: 
        }
        return new PreconditionFailure$Violation();
    }

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    public String getSubject() {
        return this.subject_;
    }

    public ByteString getSubjectBytes() {
        return ByteString.copyFromUtf8(this.subject_);
    }

    public String getType() {
        return this.type_;
    }

    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }
}

