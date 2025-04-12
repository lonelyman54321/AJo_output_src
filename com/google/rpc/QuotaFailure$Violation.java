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
import com.google.rpc.QuotaFailure$1;
import com.google.rpc.QuotaFailure$Violation$Builder;
import com.google.rpc.QuotaFailure$ViolationOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class QuotaFailure$Violation
extends GeneratedMessageLite
implements QuotaFailure$ViolationOrBuilder {
    private static final QuotaFailure$Violation DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int SUBJECT_FIELD_NUMBER = 1;
    private String description_;
    private String subject_;

    static {
        QuotaFailure$Violation quotaFailure$Violation;
        DEFAULT_INSTANCE = quotaFailure$Violation = new QuotaFailure$Violation();
        GeneratedMessageLite.registerDefaultInstance(QuotaFailure$Violation.class, quotaFailure$Violation);
    }

    private QuotaFailure$Violation() {
        String string2;
        this.subject_ = string2 = "";
        this.description_ = string2;
    }

    public static /* synthetic */ QuotaFailure$Violation access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(QuotaFailure$Violation quotaFailure$Violation, String string2) {
        quotaFailure$Violation.setSubject(string2);
    }

    public static /* synthetic */ void access$200(QuotaFailure$Violation quotaFailure$Violation) {
        quotaFailure$Violation.clearSubject();
    }

    public static /* synthetic */ void access$300(QuotaFailure$Violation quotaFailure$Violation, ByteString byteString) {
        quotaFailure$Violation.setSubjectBytes(byteString);
    }

    public static /* synthetic */ void access$400(QuotaFailure$Violation quotaFailure$Violation, String string2) {
        quotaFailure$Violation.setDescription(string2);
    }

    public static /* synthetic */ void access$500(QuotaFailure$Violation quotaFailure$Violation) {
        quotaFailure$Violation.clearDescription();
    }

    public static /* synthetic */ void access$600(QuotaFailure$Violation quotaFailure$Violation, ByteString byteString) {
        quotaFailure$Violation.setDescriptionBytes(byteString);
    }

    private void clearDescription() {
        String string2;
        this.description_ = string2 = QuotaFailure$Violation.getDefaultInstance().getDescription();
    }

    private void clearSubject() {
        String string2;
        this.subject_ = string2 = QuotaFailure$Violation.getDefaultInstance().getSubject();
    }

    public static QuotaFailure$Violation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static QuotaFailure$Violation$Builder newBuilder() {
        return (QuotaFailure$Violation$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static QuotaFailure$Violation$Builder newBuilder(QuotaFailure$Violation quotaFailure$Violation) {
        return (QuotaFailure$Violation$Builder)DEFAULT_INSTANCE.createBuilder(quotaFailure$Violation);
    }

    public static QuotaFailure$Violation parseDelimitedFrom(InputStream inputStream) {
        return (QuotaFailure$Violation)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QuotaFailure$Violation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (QuotaFailure$Violation)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QuotaFailure$Violation parseFrom(ByteString byteString) {
        return (QuotaFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static QuotaFailure$Violation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (QuotaFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static QuotaFailure$Violation parseFrom(CodedInputStream codedInputStream) {
        return (QuotaFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static QuotaFailure$Violation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (QuotaFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static QuotaFailure$Violation parseFrom(InputStream inputStream) {
        return (QuotaFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static QuotaFailure$Violation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (QuotaFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QuotaFailure$Violation parseFrom(ByteBuffer byteBuffer) {
        return (QuotaFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static QuotaFailure$Violation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (QuotaFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static QuotaFailure$Violation parseFrom(byte[] byArray) {
        return (QuotaFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static QuotaFailure$Violation parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (QuotaFailure$Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
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
                clazz = QuotaFailure$Violation.class;
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
                object[0] = "subject_";
                object[by2] = "description_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", object);
            }
            case 2: {
                return new QuotaFailure$Violation$Builder(null);
            }
            case 1: 
        }
        return new QuotaFailure$Violation();
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
}

