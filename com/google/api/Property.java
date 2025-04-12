/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Property$1;
import com.google.api.Property$Builder;
import com.google.api.Property$PropertyType;
import com.google.api.PropertyOrBuilder;
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

public final class Property
extends GeneratedMessageLite
implements PropertyOrBuilder {
    private static final Property DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    public static final int TYPE_FIELD_NUMBER = 2;
    private String description_;
    private String name_;
    private int type_;

    static {
        Property property;
        DEFAULT_INSTANCE = property = new Property();
        GeneratedMessageLite.registerDefaultInstance(Property.class, property);
    }

    private Property() {
        String string2;
        this.name_ = string2 = "";
        this.description_ = string2;
    }

    public static /* synthetic */ Property access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Property property, String string2) {
        property.setName(string2);
    }

    public static /* synthetic */ void access$200(Property property) {
        property.clearName();
    }

    public static /* synthetic */ void access$300(Property property, ByteString byteString) {
        property.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(Property property, int n3) {
        property.setTypeValue(n3);
    }

    public static /* synthetic */ void access$500(Property property, Property$PropertyType property$PropertyType) {
        property.setType(property$PropertyType);
    }

    public static /* synthetic */ void access$600(Property property) {
        property.clearType();
    }

    public static /* synthetic */ void access$700(Property property, String string2) {
        property.setDescription(string2);
    }

    public static /* synthetic */ void access$800(Property property) {
        property.clearDescription();
    }

    public static /* synthetic */ void access$900(Property property, ByteString byteString) {
        property.setDescriptionBytes(byteString);
    }

    private void clearDescription() {
        String string2;
        this.description_ = string2 = Property.getDefaultInstance().getDescription();
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = Property.getDefaultInstance().getName();
    }

    private void clearType() {
        this.type_ = 0;
    }

    public static Property getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Property$Builder newBuilder() {
        return (Property$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Property$Builder newBuilder(Property property) {
        return (Property$Builder)DEFAULT_INSTANCE.createBuilder(property);
    }

    public static Property parseDelimitedFrom(InputStream inputStream) {
        return (Property)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Property parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Property)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Property parseFrom(ByteString byteString) {
        return (Property)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Property parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Property)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Property parseFrom(CodedInputStream codedInputStream) {
        return (Property)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Property parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Property)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Property parseFrom(InputStream inputStream) {
        return (Property)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Property parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Property)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Property parseFrom(ByteBuffer byteBuffer) {
        return (Property)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Property parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Property)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Property parseFrom(byte[] byArray) {
        return (Property)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Property parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Property)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
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

    private void setName(String string2) {
        string2.getClass();
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.name_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setType(Property$PropertyType property$PropertyType) {
        int n3;
        this.type_ = n3 = property$PropertyType.getNumber();
    }

    private void setTypeValue(int n3) {
        this.type_ = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Property$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Property.class;
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
                objectArray[0] = "name_";
                objectArray[by2] = "type_";
                objectArray[2] = "description_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u0208", objectArray);
            }
            case 2: {
                return new Property$Builder(null);
            }
            case 1: 
        }
        return new Property();
    }

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public Property$PropertyType getType() {
        int n3 = this.type_;
        Property$PropertyType property$PropertyType = Property$PropertyType.forNumber(n3);
        if (property$PropertyType == null) {
            property$PropertyType = Property$PropertyType.UNRECOGNIZED;
        }
        return property$PropertyType;
    }

    public int getTypeValue() {
        return this.type_;
    }
}

