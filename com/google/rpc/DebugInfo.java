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
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import com.google.rpc.DebugInfo$1;
import com.google.rpc.DebugInfo$Builder;
import com.google.rpc.DebugInfoOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class DebugInfo
extends GeneratedMessageLite
implements DebugInfoOrBuilder {
    private static final DebugInfo DEFAULT_INSTANCE;
    public static final int DETAIL_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int STACK_ENTRIES_FIELD_NUMBER = 1;
    private String detail_;
    private Internal$ProtobufList stackEntries_;

    static {
        DebugInfo debugInfo;
        DEFAULT_INSTANCE = debugInfo = new DebugInfo();
        GeneratedMessageLite.registerDefaultInstance(DebugInfo.class, debugInfo);
    }

    private DebugInfo() {
        Internal$ProtobufList internal$ProtobufList;
        this.stackEntries_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.detail_ = "";
    }

    public static /* synthetic */ DebugInfo access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(DebugInfo debugInfo, int n3, String string2) {
        debugInfo.setStackEntries(n3, string2);
    }

    public static /* synthetic */ void access$200(DebugInfo debugInfo, String string2) {
        debugInfo.addStackEntries(string2);
    }

    public static /* synthetic */ void access$300(DebugInfo debugInfo, Iterable iterable) {
        debugInfo.addAllStackEntries(iterable);
    }

    public static /* synthetic */ void access$400(DebugInfo debugInfo) {
        debugInfo.clearStackEntries();
    }

    public static /* synthetic */ void access$500(DebugInfo debugInfo, ByteString byteString) {
        debugInfo.addStackEntriesBytes(byteString);
    }

    public static /* synthetic */ void access$600(DebugInfo debugInfo, String string2) {
        debugInfo.setDetail(string2);
    }

    public static /* synthetic */ void access$700(DebugInfo debugInfo) {
        debugInfo.clearDetail();
    }

    public static /* synthetic */ void access$800(DebugInfo debugInfo, ByteString byteString) {
        debugInfo.setDetailBytes(byteString);
    }

    private void addAllStackEntries(Iterable iterable) {
        this.ensureStackEntriesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.stackEntries_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addStackEntries(String string2) {
        string2.getClass();
        this.ensureStackEntriesIsMutable();
        this.stackEntries_.add(string2);
    }

    private void addStackEntriesBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.ensureStackEntriesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.stackEntries_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
    }

    private void clearDetail() {
        String string2;
        this.detail_ = string2 = DebugInfo.getDefaultInstance().getDetail();
    }

    private void clearStackEntries() {
        Internal$ProtobufList internal$ProtobufList;
        this.stackEntries_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureStackEntriesIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.stackEntries_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.stackEntries_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static DebugInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static DebugInfo$Builder newBuilder() {
        return (DebugInfo$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DebugInfo$Builder newBuilder(DebugInfo debugInfo) {
        return (DebugInfo$Builder)DEFAULT_INSTANCE.createBuilder(debugInfo);
    }

    public static DebugInfo parseDelimitedFrom(InputStream inputStream) {
        return (DebugInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DebugInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DebugInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DebugInfo parseFrom(ByteString byteString) {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DebugInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DebugInfo parseFrom(CodedInputStream codedInputStream) {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DebugInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DebugInfo parseFrom(InputStream inputStream) {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DebugInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DebugInfo parseFrom(ByteBuffer byteBuffer) {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DebugInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DebugInfo parseFrom(byte[] byArray) {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DebugInfo parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDetail(String string2) {
        string2.getClass();
        this.detail_ = string2;
    }

    private void setDetailBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.detail_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setStackEntries(int n3, String string2) {
        string2.getClass();
        this.ensureStackEntriesIsMutable();
        this.stackEntries_.set(n3, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = DebugInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = DebugInfo.class;
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
                object[0] = "stackEntries_";
                object[by2] = "detail_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u021a\u0002\u0208", object);
            }
            case 2: {
                return new DebugInfo$Builder(null);
            }
            case 1: 
        }
        return new DebugInfo();
    }

    public String getDetail() {
        return this.detail_;
    }

    public ByteString getDetailBytes() {
        return ByteString.copyFromUtf8(this.detail_);
    }

    public String getStackEntries(int n3) {
        return (String)this.stackEntries_.get(n3);
    }

    public ByteString getStackEntriesBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.stackEntries_.get(n3));
    }

    public int getStackEntriesCount() {
        return this.stackEntries_.size();
    }

    public List getStackEntriesList() {
        return this.stackEntries_;
    }
}

