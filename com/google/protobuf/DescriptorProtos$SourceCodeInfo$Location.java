/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$SourceCodeInfo$Location$Builder;
import com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$IntList;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class DescriptorProtos$SourceCodeInfo$Location
extends GeneratedMessageLite
implements DescriptorProtos$SourceCodeInfo$LocationOrBuilder {
    private static final DescriptorProtos$SourceCodeInfo$Location DEFAULT_INSTANCE;
    public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
    public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
    private static volatile Parser PARSER;
    public static final int PATH_FIELD_NUMBER = 1;
    public static final int SPAN_FIELD_NUMBER = 2;
    public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
    private int bitField0_;
    private String leadingComments_;
    private Internal$ProtobufList leadingDetachedComments_;
    private int pathMemoizedSerializedSize;
    private Internal$IntList path_;
    private int spanMemoizedSerializedSize;
    private Internal$IntList span_;
    private String trailingComments_;

    static {
        DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location;
        DEFAULT_INSTANCE = descriptorProtos$SourceCodeInfo$Location = new DescriptorProtos$SourceCodeInfo$Location();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$SourceCodeInfo$Location.class, descriptorProtos$SourceCodeInfo$Location);
    }

    private DescriptorProtos$SourceCodeInfo$Location() {
        int n3;
        this.pathMemoizedSerializedSize = n3 = -1;
        this.spanMemoizedSerializedSize = n3;
        Object object = GeneratedMessageLite.emptyIntList();
        this.path_ = object;
        object = GeneratedMessageLite.emptyIntList();
        this.span_ = object;
        this.leadingComments_ = object = "";
        this.trailingComments_ = object;
        this.leadingDetachedComments_ = object = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ DescriptorProtos$SourceCodeInfo$Location access$42600() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$42700(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location, int n3, int n4) {
        descriptorProtos$SourceCodeInfo$Location.setPath(n3, n4);
    }

    public static /* synthetic */ void access$42800(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location, int n3) {
        descriptorProtos$SourceCodeInfo$Location.addPath(n3);
    }

    public static /* synthetic */ void access$42900(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location, Iterable iterable) {
        descriptorProtos$SourceCodeInfo$Location.addAllPath(iterable);
    }

    public static /* synthetic */ void access$43000(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location) {
        descriptorProtos$SourceCodeInfo$Location.clearPath();
    }

    public static /* synthetic */ void access$43100(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location, int n3, int n4) {
        descriptorProtos$SourceCodeInfo$Location.setSpan(n3, n4);
    }

    public static /* synthetic */ void access$43200(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location, int n3) {
        descriptorProtos$SourceCodeInfo$Location.addSpan(n3);
    }

    public static /* synthetic */ void access$43300(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location, Iterable iterable) {
        descriptorProtos$SourceCodeInfo$Location.addAllSpan(iterable);
    }

    public static /* synthetic */ void access$43400(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location) {
        descriptorProtos$SourceCodeInfo$Location.clearSpan();
    }

    public static /* synthetic */ void access$43500(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location, String string2) {
        descriptorProtos$SourceCodeInfo$Location.setLeadingComments(string2);
    }

    public static /* synthetic */ void access$43600(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location) {
        descriptorProtos$SourceCodeInfo$Location.clearLeadingComments();
    }

    public static /* synthetic */ void access$43700(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location, ByteString byteString) {
        descriptorProtos$SourceCodeInfo$Location.setLeadingCommentsBytes(byteString);
    }

    public static /* synthetic */ void access$43800(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location, String string2) {
        descriptorProtos$SourceCodeInfo$Location.setTrailingComments(string2);
    }

    public static /* synthetic */ void access$43900(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location) {
        descriptorProtos$SourceCodeInfo$Location.clearTrailingComments();
    }

    public static /* synthetic */ void access$44000(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location, ByteString byteString) {
        descriptorProtos$SourceCodeInfo$Location.setTrailingCommentsBytes(byteString);
    }

    public static /* synthetic */ void access$44100(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location, int n3, String string2) {
        descriptorProtos$SourceCodeInfo$Location.setLeadingDetachedComments(n3, string2);
    }

    public static /* synthetic */ void access$44200(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location, String string2) {
        descriptorProtos$SourceCodeInfo$Location.addLeadingDetachedComments(string2);
    }

    public static /* synthetic */ void access$44300(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location, Iterable iterable) {
        descriptorProtos$SourceCodeInfo$Location.addAllLeadingDetachedComments(iterable);
    }

    public static /* synthetic */ void access$44400(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location) {
        descriptorProtos$SourceCodeInfo$Location.clearLeadingDetachedComments();
    }

    public static /* synthetic */ void access$44500(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location, ByteString byteString) {
        descriptorProtos$SourceCodeInfo$Location.addLeadingDetachedCommentsBytes(byteString);
    }

    private void addAllLeadingDetachedComments(Iterable iterable) {
        this.ensureLeadingDetachedCommentsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.leadingDetachedComments_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllPath(Iterable iterable) {
        this.ensurePathIsMutable();
        Internal$IntList internal$IntList = this.path_;
        AbstractMessageLite.addAll(iterable, internal$IntList);
    }

    private void addAllSpan(Iterable iterable) {
        this.ensureSpanIsMutable();
        Internal$IntList internal$IntList = this.span_;
        AbstractMessageLite.addAll(iterable, internal$IntList);
    }

    private void addLeadingDetachedComments(String string2) {
        string2.getClass();
        this.ensureLeadingDetachedCommentsIsMutable();
        this.leadingDetachedComments_.add(string2);
    }

    private void addLeadingDetachedCommentsBytes(ByteString object) {
        this.ensureLeadingDetachedCommentsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.leadingDetachedComments_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
    }

    private void addPath(int n3) {
        this.ensurePathIsMutable();
        this.path_.addInt(n3);
    }

    private void addSpan(int n3) {
        this.ensureSpanIsMutable();
        this.span_.addInt(n3);
    }

    private void clearLeadingComments() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.leadingComments_ = string2 = DescriptorProtos$SourceCodeInfo$Location.getDefaultInstance().getLeadingComments();
    }

    private void clearLeadingDetachedComments() {
        Internal$ProtobufList internal$ProtobufList;
        this.leadingDetachedComments_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearPath() {
        Internal$IntList internal$IntList;
        this.path_ = internal$IntList = GeneratedMessageLite.emptyIntList();
    }

    private void clearSpan() {
        Internal$IntList internal$IntList;
        this.span_ = internal$IntList = GeneratedMessageLite.emptyIntList();
    }

    private void clearTrailingComments() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.trailingComments_ = string2 = DescriptorProtos$SourceCodeInfo$Location.getDefaultInstance().getTrailingComments();
    }

    private void ensureLeadingDetachedCommentsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.leadingDetachedComments_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.leadingDetachedComments_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensurePathIsMutable() {
        Internal$IntList internal$IntList = this.path_;
        boolean bl2 = internal$IntList.isModifiable();
        if (!bl2) {
            this.path_ = internal$IntList = GeneratedMessageLite.mutableCopy(internal$IntList);
        }
    }

    private void ensureSpanIsMutable() {
        Internal$IntList internal$IntList = this.span_;
        boolean bl2 = internal$IntList.isModifiable();
        if (!bl2) {
            this.span_ = internal$IntList = GeneratedMessageLite.mutableCopy(internal$IntList);
        }
    }

    public static DescriptorProtos$SourceCodeInfo$Location getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$SourceCodeInfo$Location$Builder newBuilder() {
        return (DescriptorProtos$SourceCodeInfo$Location$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$SourceCodeInfo$Location$Builder newBuilder(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location) {
        return (DescriptorProtos$SourceCodeInfo$Location$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$SourceCodeInfo$Location);
    }

    public static DescriptorProtos$SourceCodeInfo$Location parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$SourceCodeInfo$Location)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo$Location parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$SourceCodeInfo$Location)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$SourceCodeInfo$Location parseFrom(ByteString byteString) {
        return (DescriptorProtos$SourceCodeInfo$Location)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$SourceCodeInfo$Location parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$SourceCodeInfo$Location)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$SourceCodeInfo$Location parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$SourceCodeInfo$Location)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$SourceCodeInfo$Location parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$SourceCodeInfo$Location)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$SourceCodeInfo$Location parseFrom(InputStream inputStream) {
        return (DescriptorProtos$SourceCodeInfo$Location)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo$Location parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$SourceCodeInfo$Location)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$SourceCodeInfo$Location parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$SourceCodeInfo$Location)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$SourceCodeInfo$Location parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$SourceCodeInfo$Location)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$SourceCodeInfo$Location parseFrom(byte[] byArray) {
        return (DescriptorProtos$SourceCodeInfo$Location)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$SourceCodeInfo$Location parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$SourceCodeInfo$Location)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setLeadingComments(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 1;
        this.leadingComments_ = string2;
    }

    private void setLeadingCommentsBytes(ByteString object) {
        int n3;
        this.leadingComments_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 1;
    }

    private void setLeadingDetachedComments(int n3, String string2) {
        string2.getClass();
        this.ensureLeadingDetachedCommentsIsMutable();
        this.leadingDetachedComments_.set(n3, string2);
    }

    private void setPath(int n3, int n4) {
        this.ensurePathIsMutable();
        this.path_.setInt(n3, n4);
    }

    private void setSpan(int n3, int n4) {
        this.ensureSpanIsMutable();
        this.span_.setInt(n3, n4);
    }

    private void setTrailingComments(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 2;
        this.trailingComments_ = string2;
    }

    private void setTrailingCommentsBytes(ByteString object) {
        int n3;
        this.trailingComments_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = DescriptorProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = DescriptorProtos$SourceCodeInfo$Location.class;
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
                objectArray = new Object[6];
                objectArray[0] = "bitField0_";
                objectArray[by2] = "path_";
                objectArray[2] = "span_";
                objectArray[3] = "leadingComments_";
                objectArray[4] = "trailingComments_";
                objectArray[5] = "leadingDetachedComments_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001'\u0002'\u0003\u1008\u0000\u0004\u1008\u0001\u0006\u001a", objectArray);
            }
            case 2: {
                return new DescriptorProtos$SourceCodeInfo$Location$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$SourceCodeInfo$Location();
    }

    public String getLeadingComments() {
        return this.leadingComments_;
    }

    public ByteString getLeadingCommentsBytes() {
        return ByteString.copyFromUtf8(this.leadingComments_);
    }

    public String getLeadingDetachedComments(int n3) {
        return (String)this.leadingDetachedComments_.get(n3);
    }

    public ByteString getLeadingDetachedCommentsBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.leadingDetachedComments_.get(n3));
    }

    public int getLeadingDetachedCommentsCount() {
        return this.leadingDetachedComments_.size();
    }

    public List getLeadingDetachedCommentsList() {
        return this.leadingDetachedComments_;
    }

    public int getPath(int n3) {
        return this.path_.getInt(n3);
    }

    public int getPathCount() {
        return this.path_.size();
    }

    public List getPathList() {
        return this.path_;
    }

    public int getSpan(int n3) {
        return this.span_.getInt(n3);
    }

    public int getSpanCount() {
        return this.span_.size();
    }

    public List getSpanList() {
        return this.span_;
    }

    public String getTrailingComments() {
        return this.trailingComments_;
    }

    public ByteString getTrailingCommentsBytes() {
        return ByteString.copyFromUtf8(this.trailingComments_);
    }

    public boolean hasLeadingComments() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean hasTrailingComments() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }
}

