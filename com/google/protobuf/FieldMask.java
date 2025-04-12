/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FieldMask$1;
import com.google.protobuf.FieldMask$Builder;
import com.google.protobuf.FieldMaskOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class FieldMask
extends GeneratedMessageLite
implements FieldMaskOrBuilder {
    private static final FieldMask DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int PATHS_FIELD_NUMBER = 1;
    private Internal$ProtobufList paths_;

    static {
        FieldMask fieldMask;
        DEFAULT_INSTANCE = fieldMask = new FieldMask();
        GeneratedMessageLite.registerDefaultInstance(FieldMask.class, fieldMask);
    }

    private FieldMask() {
        Internal$ProtobufList internal$ProtobufList;
        this.paths_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ FieldMask access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(FieldMask fieldMask, int n3, String string2) {
        fieldMask.setPaths(n3, string2);
    }

    public static /* synthetic */ void access$200(FieldMask fieldMask, String string2) {
        fieldMask.addPaths(string2);
    }

    public static /* synthetic */ void access$300(FieldMask fieldMask, Iterable iterable) {
        fieldMask.addAllPaths(iterable);
    }

    public static /* synthetic */ void access$400(FieldMask fieldMask) {
        fieldMask.clearPaths();
    }

    public static /* synthetic */ void access$500(FieldMask fieldMask, ByteString byteString) {
        fieldMask.addPathsBytes(byteString);
    }

    private void addAllPaths(Iterable iterable) {
        this.ensurePathsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.paths_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addPaths(String string2) {
        string2.getClass();
        this.ensurePathsIsMutable();
        this.paths_.add(string2);
    }

    private void addPathsBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.ensurePathsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.paths_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
    }

    private void clearPaths() {
        Internal$ProtobufList internal$ProtobufList;
        this.paths_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePathsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.paths_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.paths_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static FieldMask$Builder newBuilder() {
        return (FieldMask$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static FieldMask$Builder newBuilder(FieldMask fieldMask) {
        return (FieldMask$Builder)DEFAULT_INSTANCE.createBuilder(fieldMask);
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream) {
        return (FieldMask)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (FieldMask)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FieldMask parseFrom(ByteString byteString) {
        return (FieldMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static FieldMask parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (FieldMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FieldMask parseFrom(CodedInputStream codedInputStream) {
        return (FieldMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static FieldMask parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (FieldMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FieldMask parseFrom(InputStream inputStream) {
        return (FieldMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (FieldMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer) {
        return (FieldMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (FieldMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FieldMask parseFrom(byte[] byArray) {
        return (FieldMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static FieldMask parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (FieldMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setPaths(int n3, String string2) {
        string2.getClass();
        this.ensurePathsIsMutable();
        this.paths_.set(n3, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = FieldMask$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = FieldMask.class;
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
                object = new Object[by2];
                object[0] = "paths_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u021a", object);
            }
            case 2: {
                return new FieldMask$Builder(null);
            }
            case 1: 
        }
        return new FieldMask();
    }

    public String getPaths(int n3) {
        return (String)this.paths_.get(n3);
    }

    public ByteString getPathsBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.paths_.get(n3));
    }

    public int getPathsCount() {
        return this.paths_.size();
    }

    public List getPathsList() {
        return this.paths_;
    }
}

