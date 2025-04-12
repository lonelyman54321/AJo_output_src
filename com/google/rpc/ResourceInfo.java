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
import com.google.rpc.ResourceInfo$1;
import com.google.rpc.ResourceInfo$Builder;
import com.google.rpc.ResourceInfoOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ResourceInfo
extends GeneratedMessageLite
implements ResourceInfoOrBuilder {
    private static final ResourceInfo DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int OWNER_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 2;
    public static final int RESOURCE_TYPE_FIELD_NUMBER = 1;
    private String description_;
    private String owner_;
    private String resourceName_;
    private String resourceType_;

    static {
        ResourceInfo resourceInfo;
        DEFAULT_INSTANCE = resourceInfo = new ResourceInfo();
        GeneratedMessageLite.registerDefaultInstance(ResourceInfo.class, resourceInfo);
    }

    private ResourceInfo() {
        String string2;
        this.resourceType_ = string2 = "";
        this.resourceName_ = string2;
        this.owner_ = string2;
        this.description_ = string2;
    }

    public static /* synthetic */ ResourceInfo access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(ResourceInfo resourceInfo, String string2) {
        resourceInfo.setResourceType(string2);
    }

    public static /* synthetic */ void access$1000(ResourceInfo resourceInfo, String string2) {
        resourceInfo.setDescription(string2);
    }

    public static /* synthetic */ void access$1100(ResourceInfo resourceInfo) {
        resourceInfo.clearDescription();
    }

    public static /* synthetic */ void access$1200(ResourceInfo resourceInfo, ByteString byteString) {
        resourceInfo.setDescriptionBytes(byteString);
    }

    public static /* synthetic */ void access$200(ResourceInfo resourceInfo) {
        resourceInfo.clearResourceType();
    }

    public static /* synthetic */ void access$300(ResourceInfo resourceInfo, ByteString byteString) {
        resourceInfo.setResourceTypeBytes(byteString);
    }

    public static /* synthetic */ void access$400(ResourceInfo resourceInfo, String string2) {
        resourceInfo.setResourceName(string2);
    }

    public static /* synthetic */ void access$500(ResourceInfo resourceInfo) {
        resourceInfo.clearResourceName();
    }

    public static /* synthetic */ void access$600(ResourceInfo resourceInfo, ByteString byteString) {
        resourceInfo.setResourceNameBytes(byteString);
    }

    public static /* synthetic */ void access$700(ResourceInfo resourceInfo, String string2) {
        resourceInfo.setOwner(string2);
    }

    public static /* synthetic */ void access$800(ResourceInfo resourceInfo) {
        resourceInfo.clearOwner();
    }

    public static /* synthetic */ void access$900(ResourceInfo resourceInfo, ByteString byteString) {
        resourceInfo.setOwnerBytes(byteString);
    }

    private void clearDescription() {
        String string2;
        this.description_ = string2 = ResourceInfo.getDefaultInstance().getDescription();
    }

    private void clearOwner() {
        String string2;
        this.owner_ = string2 = ResourceInfo.getDefaultInstance().getOwner();
    }

    private void clearResourceName() {
        String string2;
        this.resourceName_ = string2 = ResourceInfo.getDefaultInstance().getResourceName();
    }

    private void clearResourceType() {
        String string2;
        this.resourceType_ = string2 = ResourceInfo.getDefaultInstance().getResourceType();
    }

    public static ResourceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ResourceInfo$Builder newBuilder() {
        return (ResourceInfo$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static ResourceInfo$Builder newBuilder(ResourceInfo resourceInfo) {
        return (ResourceInfo$Builder)DEFAULT_INSTANCE.createBuilder(resourceInfo);
    }

    public static ResourceInfo parseDelimitedFrom(InputStream inputStream) {
        return (ResourceInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ResourceInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResourceInfo parseFrom(ByteString byteString) {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static ResourceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ResourceInfo parseFrom(CodedInputStream codedInputStream) {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static ResourceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static ResourceInfo parseFrom(InputStream inputStream) {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResourceInfo parseFrom(ByteBuffer byteBuffer) {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static ResourceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ResourceInfo parseFrom(byte[] byArray) {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static ResourceInfo parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
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

    private void setOwner(String string2) {
        string2.getClass();
        this.owner_ = string2;
    }

    private void setOwnerBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.owner_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setResourceName(String string2) {
        string2.getClass();
        this.resourceName_ = string2;
    }

    private void setResourceNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.resourceName_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setResourceType(String string2) {
        string2.getClass();
        this.resourceType_ = string2;
    }

    private void setResourceTypeBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.resourceType_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = ResourceInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = ResourceInfo.class;
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
                objectArray[0] = "resourceType_";
                objectArray[by2] = "resourceName_";
                objectArray[2] = "owner_";
                objectArray[3] = "description_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208", objectArray);
            }
            case 2: {
                return new ResourceInfo$Builder(null);
            }
            case 1: 
        }
        return new ResourceInfo();
    }

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    public String getOwner() {
        return this.owner_;
    }

    public ByteString getOwnerBytes() {
        return ByteString.copyFromUtf8(this.owner_);
    }

    public String getResourceName() {
        return this.resourceName_;
    }

    public ByteString getResourceNameBytes() {
        return ByteString.copyFromUtf8(this.resourceName_);
    }

    public String getResourceType() {
        return this.resourceType_;
    }

    public ByteString getResourceTypeBytes() {
        return ByteString.copyFromUtf8(this.resourceType_);
    }
}

