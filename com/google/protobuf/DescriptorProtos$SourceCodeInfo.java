/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$SourceCodeInfo$Builder;
import com.google.protobuf.DescriptorProtos$SourceCodeInfo$Location;
import com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder;
import com.google.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class DescriptorProtos$SourceCodeInfo
extends GeneratedMessageLite
implements DescriptorProtos$SourceCodeInfoOrBuilder {
    private static final DescriptorProtos$SourceCodeInfo DEFAULT_INSTANCE;
    public static final int LOCATION_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private Internal$ProtobufList location_;

    static {
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo;
        DEFAULT_INSTANCE = descriptorProtos$SourceCodeInfo = new DescriptorProtos$SourceCodeInfo();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$SourceCodeInfo.class, descriptorProtos$SourceCodeInfo);
    }

    private DescriptorProtos$SourceCodeInfo() {
        Internal$ProtobufList internal$ProtobufList;
        this.location_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ DescriptorProtos$SourceCodeInfo access$44700() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$44800(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo, int n3, DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location) {
        descriptorProtos$SourceCodeInfo.setLocation(n3, descriptorProtos$SourceCodeInfo$Location);
    }

    public static /* synthetic */ void access$44900(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo, DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location) {
        descriptorProtos$SourceCodeInfo.addLocation(descriptorProtos$SourceCodeInfo$Location);
    }

    public static /* synthetic */ void access$45000(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo, int n3, DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location) {
        descriptorProtos$SourceCodeInfo.addLocation(n3, descriptorProtos$SourceCodeInfo$Location);
    }

    public static /* synthetic */ void access$45100(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo, Iterable iterable) {
        descriptorProtos$SourceCodeInfo.addAllLocation(iterable);
    }

    public static /* synthetic */ void access$45200(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        descriptorProtos$SourceCodeInfo.clearLocation();
    }

    public static /* synthetic */ void access$45300(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo, int n3) {
        descriptorProtos$SourceCodeInfo.removeLocation(n3);
    }

    private void addAllLocation(Iterable iterable) {
        this.ensureLocationIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.location_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addLocation(int n3, DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location) {
        descriptorProtos$SourceCodeInfo$Location.getClass();
        this.ensureLocationIsMutable();
        this.location_.add(n3, descriptorProtos$SourceCodeInfo$Location);
    }

    private void addLocation(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location) {
        descriptorProtos$SourceCodeInfo$Location.getClass();
        this.ensureLocationIsMutable();
        this.location_.add(descriptorProtos$SourceCodeInfo$Location);
    }

    private void clearLocation() {
        Internal$ProtobufList internal$ProtobufList;
        this.location_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureLocationIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.location_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.location_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static DescriptorProtos$SourceCodeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$SourceCodeInfo$Builder newBuilder() {
        return (DescriptorProtos$SourceCodeInfo$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$SourceCodeInfo$Builder newBuilder(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        return (DescriptorProtos$SourceCodeInfo$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$SourceCodeInfo);
    }

    public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$SourceCodeInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$SourceCodeInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteString byteString) {
        return (DescriptorProtos$SourceCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$SourceCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$SourceCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$SourceCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputStream) {
        return (DescriptorProtos$SourceCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$SourceCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$SourceCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$SourceCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(byte[] byArray) {
        return (DescriptorProtos$SourceCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$SourceCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeLocation(int n3) {
        this.ensureLocationIsMutable();
        this.location_.remove(n3);
    }

    private void setLocation(int n3, DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location) {
        descriptorProtos$SourceCodeInfo$Location.getClass();
        this.ensureLocationIsMutable();
        this.location_.set(n3, descriptorProtos$SourceCodeInfo$Location);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = DescriptorProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = DescriptorProtos$SourceCodeInfo.class;
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
                object[0] = "location_";
                object[by2] = DescriptorProtos$SourceCodeInfo$Location.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", object);
            }
            case 2: {
                return new DescriptorProtos$SourceCodeInfo$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$SourceCodeInfo();
    }

    public DescriptorProtos$SourceCodeInfo$Location getLocation(int n3) {
        return (DescriptorProtos$SourceCodeInfo$Location)this.location_.get(n3);
    }

    public int getLocationCount() {
        return this.location_.size();
    }

    public List getLocationList() {
        return this.location_;
    }

    public DescriptorProtos$SourceCodeInfo$LocationOrBuilder getLocationOrBuilder(int n3) {
        return (DescriptorProtos$SourceCodeInfo$LocationOrBuilder)this.location_.get(n3);
    }

    public List getLocationOrBuilderList() {
        return this.location_;
    }
}

