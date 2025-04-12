/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.ResourceReference$1;
import com.google.api.ResourceReference$Builder;
import com.google.api.ResourceReferenceOrBuilder;
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

public final class ResourceReference
extends GeneratedMessageLite
implements ResourceReferenceOrBuilder {
    public static final int CHILD_TYPE_FIELD_NUMBER = 2;
    private static final ResourceReference DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String childType_;
    private String type_;

    static {
        ResourceReference resourceReference;
        DEFAULT_INSTANCE = resourceReference = new ResourceReference();
        GeneratedMessageLite.registerDefaultInstance(ResourceReference.class, resourceReference);
    }

    private ResourceReference() {
        String string2;
        this.type_ = string2 = "";
        this.childType_ = string2;
    }

    public static /* synthetic */ ResourceReference access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(ResourceReference resourceReference, String string2) {
        resourceReference.setType(string2);
    }

    public static /* synthetic */ void access$200(ResourceReference resourceReference) {
        resourceReference.clearType();
    }

    public static /* synthetic */ void access$300(ResourceReference resourceReference, ByteString byteString) {
        resourceReference.setTypeBytes(byteString);
    }

    public static /* synthetic */ void access$400(ResourceReference resourceReference, String string2) {
        resourceReference.setChildType(string2);
    }

    public static /* synthetic */ void access$500(ResourceReference resourceReference) {
        resourceReference.clearChildType();
    }

    public static /* synthetic */ void access$600(ResourceReference resourceReference, ByteString byteString) {
        resourceReference.setChildTypeBytes(byteString);
    }

    private void clearChildType() {
        String string2;
        this.childType_ = string2 = ResourceReference.getDefaultInstance().getChildType();
    }

    private void clearType() {
        String string2;
        this.type_ = string2 = ResourceReference.getDefaultInstance().getType();
    }

    public static ResourceReference getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ResourceReference$Builder newBuilder() {
        return (ResourceReference$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static ResourceReference$Builder newBuilder(ResourceReference resourceReference) {
        return (ResourceReference$Builder)DEFAULT_INSTANCE.createBuilder(resourceReference);
    }

    public static ResourceReference parseDelimitedFrom(InputStream inputStream) {
        return (ResourceReference)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceReference parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ResourceReference)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResourceReference parseFrom(ByteString byteString) {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static ResourceReference parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ResourceReference parseFrom(CodedInputStream codedInputStream) {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static ResourceReference parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static ResourceReference parseFrom(InputStream inputStream) {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceReference parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResourceReference parseFrom(ByteBuffer byteBuffer) {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static ResourceReference parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ResourceReference parseFrom(byte[] byArray) {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static ResourceReference parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setChildType(String string2) {
        string2.getClass();
        this.childType_ = string2;
    }

    private void setChildTypeBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.childType_ = object = ((ByteString)object).toStringUtf8();
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
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = ResourceReference$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = ResourceReference.class;
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
                object[0] = "type_";
                object[by2] = "childType_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", object);
            }
            case 2: {
                return new ResourceReference$Builder(null);
            }
            case 1: 
        }
        return new ResourceReference();
    }

    public String getChildType() {
        return this.childType_;
    }

    public ByteString getChildTypeBytes() {
        return ByteString.copyFromUtf8(this.childType_);
    }

    public String getType() {
        return this.type_;
    }

    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }
}

