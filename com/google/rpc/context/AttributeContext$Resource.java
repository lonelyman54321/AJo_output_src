/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.rpc.context.AttributeContext$1;
import com.google.rpc.context.AttributeContext$Resource$Builder;
import com.google.rpc.context.AttributeContext$Resource$LabelsDefaultEntryHolder;
import com.google.rpc.context.AttributeContext$ResourceOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;

public final class AttributeContext$Resource
extends GeneratedMessageLite
implements AttributeContext$ResourceOrBuilder {
    private static final AttributeContext$Resource DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int SERVICE_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 3;
    private MapFieldLite labels_;
    private String name_;
    private String service_;
    private String type_;

    static {
        AttributeContext$Resource attributeContext$Resource;
        DEFAULT_INSTANCE = attributeContext$Resource = new AttributeContext$Resource();
        GeneratedMessageLite.registerDefaultInstance(AttributeContext$Resource.class, attributeContext$Resource);
    }

    private AttributeContext$Resource() {
        Object object = MapFieldLite.emptyMapField();
        this.labels_ = object;
        this.service_ = object = "";
        this.name_ = object;
        this.type_ = object;
    }

    public static /* synthetic */ void access$10000(AttributeContext$Resource attributeContext$Resource, ByteString byteString) {
        attributeContext$Resource.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$10100(AttributeContext$Resource attributeContext$Resource, String string2) {
        attributeContext$Resource.setType(string2);
    }

    public static /* synthetic */ void access$10200(AttributeContext$Resource attributeContext$Resource) {
        attributeContext$Resource.clearType();
    }

    public static /* synthetic */ void access$10300(AttributeContext$Resource attributeContext$Resource, ByteString byteString) {
        attributeContext$Resource.setTypeBytes(byteString);
    }

    public static /* synthetic */ Map access$10400(AttributeContext$Resource attributeContext$Resource) {
        return attributeContext$Resource.getMutableLabelsMap();
    }

    public static /* synthetic */ AttributeContext$Resource access$9400() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$9500(AttributeContext$Resource attributeContext$Resource, String string2) {
        attributeContext$Resource.setService(string2);
    }

    public static /* synthetic */ void access$9600(AttributeContext$Resource attributeContext$Resource) {
        attributeContext$Resource.clearService();
    }

    public static /* synthetic */ void access$9700(AttributeContext$Resource attributeContext$Resource, ByteString byteString) {
        attributeContext$Resource.setServiceBytes(byteString);
    }

    public static /* synthetic */ void access$9800(AttributeContext$Resource attributeContext$Resource, String string2) {
        attributeContext$Resource.setName(string2);
    }

    public static /* synthetic */ void access$9900(AttributeContext$Resource attributeContext$Resource) {
        attributeContext$Resource.clearName();
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = AttributeContext$Resource.getDefaultInstance().getName();
    }

    private void clearService() {
        String string2;
        this.service_ = string2 = AttributeContext$Resource.getDefaultInstance().getService();
    }

    private void clearType() {
        String string2;
        this.type_ = string2 = AttributeContext$Resource.getDefaultInstance().getType();
    }

    public static AttributeContext$Resource getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map getMutableLabelsMap() {
        return this.internalGetMutableLabels();
    }

    private MapFieldLite internalGetLabels() {
        return this.labels_;
    }

    private MapFieldLite internalGetMutableLabels() {
        MapFieldLite mapFieldLite = this.labels_;
        boolean bl2 = mapFieldLite.isMutable();
        if (!bl2) {
            this.labels_ = mapFieldLite = this.labels_.mutableCopy();
        }
        return this.labels_;
    }

    public static AttributeContext$Resource$Builder newBuilder() {
        return (AttributeContext$Resource$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static AttributeContext$Resource$Builder newBuilder(AttributeContext$Resource attributeContext$Resource) {
        return (AttributeContext$Resource$Builder)DEFAULT_INSTANCE.createBuilder(attributeContext$Resource);
    }

    public static AttributeContext$Resource parseDelimitedFrom(InputStream inputStream) {
        return (AttributeContext$Resource)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext$Resource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Resource)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AttributeContext$Resource parseFrom(ByteString byteString) {
        return (AttributeContext$Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static AttributeContext$Resource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AttributeContext$Resource parseFrom(CodedInputStream codedInputStream) {
        return (AttributeContext$Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static AttributeContext$Resource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AttributeContext$Resource parseFrom(InputStream inputStream) {
        return (AttributeContext$Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext$Resource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AttributeContext$Resource parseFrom(ByteBuffer byteBuffer) {
        return (AttributeContext$Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static AttributeContext$Resource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AttributeContext$Resource parseFrom(byte[] byArray) {
        return (AttributeContext$Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static AttributeContext$Resource parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setName(String string2) {
        string2.getClass();
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.name_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setService(String string2) {
        string2.getClass();
        this.service_ = string2;
    }

    private void setServiceBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.service_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setType(String string2) {
        string2.getClass();
        this.type_ = string2;
    }

    private void setTypeBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.type_ = object = ((ByteString)object).toStringUtf8();
    }

    public boolean containsLabels(String string2) {
        string2.getClass();
        return ((AbstractMap)this.internalGetLabels()).containsKey(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object object, Object object2) {
        byte by2 = 1;
        object2 = AttributeContext$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object3 = objectArray.ordinal();
        object3 = object2[object3];
        object2 = null;
        switch (object3) {
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
                object = AttributeContext$Resource.class;
                synchronized (object) {
                    try {
                        objectArray = PARSER;
                        if (objectArray != null) return objectArray;
                        object2 = DEFAULT_INSTANCE;
                        PARSER = objectArray = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object2);
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
                objectArray = new Object[5];
                objectArray[0] = "service_";
                objectArray[by2] = "name_";
                objectArray[2] = "type_";
                objectArray[3] = "labels_";
                objectArray[4] = object = AttributeContext$Resource$LabelsDefaultEntryHolder.defaultEntry;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u00042", objectArray);
            }
            case 2: {
                return new AttributeContext$Resource$Builder(null);
            }
            case 1: 
        }
        return new AttributeContext$Resource();
    }

    public Map getLabels() {
        return this.getLabelsMap();
    }

    public int getLabelsCount() {
        return ((AbstractMap)this.internalGetLabels()).size();
    }

    public Map getLabelsMap() {
        return Collections.unmodifiableMap(this.internalGetLabels());
    }

    public String getLabelsOrDefault(String string2, String string3) {
        string2.getClass();
        MapFieldLite mapFieldLite = this.internalGetLabels();
        boolean bl2 = mapFieldLite.containsKey(string2);
        if (bl2) {
            string3 = string2 = mapFieldLite.get(string2);
            string3 = string2;
        }
        return string3;
    }

    public String getLabelsOrThrow(String object) {
        object.getClass();
        MapFieldLite mapFieldLite = this.internalGetLabels();
        boolean bl2 = mapFieldLite.containsKey(object);
        if (bl2) {
            return (String)mapFieldLite.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public String getService() {
        return this.service_;
    }

    public ByteString getServiceBytes() {
        return ByteString.copyFromUtf8(this.service_);
    }

    public String getType() {
        return this.type_;
    }

    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }
}

