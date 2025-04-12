/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.ProjectProperties$1;
import com.google.api.ProjectProperties$Builder;
import com.google.api.ProjectPropertiesOrBuilder;
import com.google.api.Property;
import com.google.api.PropertyOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class ProjectProperties
extends GeneratedMessageLite
implements ProjectPropertiesOrBuilder {
    private static final ProjectProperties DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int PROPERTIES_FIELD_NUMBER = 1;
    private Internal$ProtobufList properties_;

    static {
        ProjectProperties projectProperties;
        DEFAULT_INSTANCE = projectProperties = new ProjectProperties();
        GeneratedMessageLite.registerDefaultInstance(ProjectProperties.class, projectProperties);
    }

    private ProjectProperties() {
        Internal$ProtobufList internal$ProtobufList;
        this.properties_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ ProjectProperties access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(ProjectProperties projectProperties, int n3, Property property) {
        projectProperties.setProperties(n3, property);
    }

    public static /* synthetic */ void access$200(ProjectProperties projectProperties, Property property) {
        projectProperties.addProperties(property);
    }

    public static /* synthetic */ void access$300(ProjectProperties projectProperties, int n3, Property property) {
        projectProperties.addProperties(n3, property);
    }

    public static /* synthetic */ void access$400(ProjectProperties projectProperties, Iterable iterable) {
        projectProperties.addAllProperties(iterable);
    }

    public static /* synthetic */ void access$500(ProjectProperties projectProperties) {
        projectProperties.clearProperties();
    }

    public static /* synthetic */ void access$600(ProjectProperties projectProperties, int n3) {
        projectProperties.removeProperties(n3);
    }

    private void addAllProperties(Iterable iterable) {
        this.ensurePropertiesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.properties_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addProperties(int n3, Property property) {
        property.getClass();
        this.ensurePropertiesIsMutable();
        this.properties_.add(n3, property);
    }

    private void addProperties(Property property) {
        property.getClass();
        this.ensurePropertiesIsMutable();
        this.properties_.add(property);
    }

    private void clearProperties() {
        Internal$ProtobufList internal$ProtobufList;
        this.properties_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePropertiesIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.properties_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.properties_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static ProjectProperties getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ProjectProperties$Builder newBuilder() {
        return (ProjectProperties$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static ProjectProperties$Builder newBuilder(ProjectProperties projectProperties) {
        return (ProjectProperties$Builder)DEFAULT_INSTANCE.createBuilder(projectProperties);
    }

    public static ProjectProperties parseDelimitedFrom(InputStream inputStream) {
        return (ProjectProperties)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ProjectProperties parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ProjectProperties)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ProjectProperties parseFrom(ByteString byteString) {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static ProjectProperties parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ProjectProperties parseFrom(CodedInputStream codedInputStream) {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static ProjectProperties parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static ProjectProperties parseFrom(InputStream inputStream) {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static ProjectProperties parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ProjectProperties parseFrom(ByteBuffer byteBuffer) {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static ProjectProperties parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ProjectProperties parseFrom(byte[] byArray) {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static ProjectProperties parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeProperties(int n3) {
        this.ensurePropertiesIsMutable();
        this.properties_.remove(n3);
    }

    private void setProperties(int n3, Property property) {
        property.getClass();
        this.ensurePropertiesIsMutable();
        this.properties_.set(n3, property);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = ProjectProperties$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = ProjectProperties.class;
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
                object[0] = "properties_";
                object[by2] = Property.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", object);
            }
            case 2: {
                return new ProjectProperties$Builder(null);
            }
            case 1: 
        }
        return new ProjectProperties();
    }

    public Property getProperties(int n3) {
        return (Property)this.properties_.get(n3);
    }

    public int getPropertiesCount() {
        return this.properties_.size();
    }

    public List getPropertiesList() {
        return this.properties_;
    }

    public PropertyOrBuilder getPropertiesOrBuilder(int n3) {
        return (PropertyOrBuilder)this.properties_.get(n3);
    }

    public List getPropertiesOrBuilderList() {
        return this.properties_;
    }
}

