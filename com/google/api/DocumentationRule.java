/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.DocumentationRule$1;
import com.google.api.DocumentationRule$Builder;
import com.google.api.DocumentationRuleOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DocumentationRule
extends GeneratedMessageLite
implements DocumentationRuleOrBuilder {
    private static final DocumentationRule DEFAULT_INSTANCE;
    public static final int DEPRECATION_DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String deprecationDescription_;
    private String description_;
    private String selector_;

    static {
        DocumentationRule documentationRule;
        DEFAULT_INSTANCE = documentationRule = new DocumentationRule();
        GeneratedMessageLite.registerDefaultInstance(DocumentationRule.class, documentationRule);
    }

    private DocumentationRule() {
        String string2;
        this.selector_ = string2 = "";
        this.description_ = string2;
        this.deprecationDescription_ = string2;
    }

    public static /* synthetic */ DocumentationRule access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(DocumentationRule documentationRule, String string2) {
        documentationRule.setSelector(string2);
    }

    public static /* synthetic */ void access$200(DocumentationRule documentationRule) {
        documentationRule.clearSelector();
    }

    public static /* synthetic */ void access$300(DocumentationRule documentationRule, ByteString byteString) {
        documentationRule.setSelectorBytes(byteString);
    }

    public static /* synthetic */ void access$400(DocumentationRule documentationRule, String string2) {
        documentationRule.setDescription(string2);
    }

    public static /* synthetic */ void access$500(DocumentationRule documentationRule) {
        documentationRule.clearDescription();
    }

    public static /* synthetic */ void access$600(DocumentationRule documentationRule, ByteString byteString) {
        documentationRule.setDescriptionBytes(byteString);
    }

    public static /* synthetic */ void access$700(DocumentationRule documentationRule, String string2) {
        documentationRule.setDeprecationDescription(string2);
    }

    public static /* synthetic */ void access$800(DocumentationRule documentationRule) {
        documentationRule.clearDeprecationDescription();
    }

    public static /* synthetic */ void access$900(DocumentationRule documentationRule, ByteString byteString) {
        documentationRule.setDeprecationDescriptionBytes(byteString);
    }

    private void clearDeprecationDescription() {
        String string2;
        this.deprecationDescription_ = string2 = DocumentationRule.getDefaultInstance().getDeprecationDescription();
    }

    private void clearDescription() {
        String string2;
        this.description_ = string2 = DocumentationRule.getDefaultInstance().getDescription();
    }

    private void clearSelector() {
        String string2;
        this.selector_ = string2 = DocumentationRule.getDefaultInstance().getSelector();
    }

    public static DocumentationRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static DocumentationRule$Builder newBuilder() {
        return (DocumentationRule$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DocumentationRule$Builder newBuilder(DocumentationRule documentationRule) {
        return (DocumentationRule$Builder)DEFAULT_INSTANCE.createBuilder(documentationRule);
    }

    public static DocumentationRule parseDelimitedFrom(InputStream inputStream) {
        return (DocumentationRule)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DocumentationRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DocumentationRule)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DocumentationRule parseFrom(ByteString byteString) {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DocumentationRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DocumentationRule parseFrom(CodedInputStream codedInputStream) {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DocumentationRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DocumentationRule parseFrom(InputStream inputStream) {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DocumentationRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DocumentationRule parseFrom(ByteBuffer byteBuffer) {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DocumentationRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DocumentationRule parseFrom(byte[] byArray) {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DocumentationRule parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDeprecationDescription(String string2) {
        string2.getClass();
        this.deprecationDescription_ = string2;
    }

    private void setDeprecationDescriptionBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.deprecationDescription_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setDescription(String string2) {
        string2.getClass();
        this.description_ = string2;
    }

    private void setDescriptionBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.description_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setSelector(String string2) {
        string2.getClass();
        this.selector_ = string2;
    }

    private void setSelectorBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.selector_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = DocumentationRule$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = DocumentationRule.class;
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
                objectArray[0] = "selector_";
                objectArray[by2] = "description_";
                objectArray[2] = "deprecationDescription_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", objectArray);
            }
            case 2: {
                return new DocumentationRule$Builder(null);
            }
            case 1: 
        }
        return new DocumentationRule();
    }

    public String getDeprecationDescription() {
        return this.deprecationDescription_;
    }

    public ByteString getDeprecationDescriptionBytes() {
        return ByteString.copyFromUtf8(this.deprecationDescription_);
    }

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    public String getSelector() {
        return this.selector_;
    }

    public ByteString getSelectorBytes() {
        return ByteString.copyFromUtf8(this.selector_);
    }
}

