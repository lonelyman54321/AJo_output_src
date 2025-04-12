/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.LabelDescriptor;
import com.google.api.LabelDescriptorOrBuilder;
import com.google.api.LogDescriptor$1;
import com.google.api.LogDescriptor$Builder;
import com.google.api.LogDescriptorOrBuilder;
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

public final class LogDescriptor
extends GeneratedMessageLite
implements LogDescriptorOrBuilder {
    private static final LogDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 4;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private String description_;
    private String displayName_;
    private Internal$ProtobufList labels_;
    private String name_;

    static {
        LogDescriptor logDescriptor;
        DEFAULT_INSTANCE = logDescriptor = new LogDescriptor();
        GeneratedMessageLite.registerDefaultInstance(LogDescriptor.class, logDescriptor);
    }

    private LogDescriptor() {
        Internal$ProtobufList internal$ProtobufList;
        String string2;
        this.name_ = string2 = "";
        this.labels_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.description_ = string2;
        this.displayName_ = string2;
    }

    public static /* synthetic */ LogDescriptor access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(LogDescriptor logDescriptor, String string2) {
        logDescriptor.setName(string2);
    }

    public static /* synthetic */ void access$1000(LogDescriptor logDescriptor, String string2) {
        logDescriptor.setDescription(string2);
    }

    public static /* synthetic */ void access$1100(LogDescriptor logDescriptor) {
        logDescriptor.clearDescription();
    }

    public static /* synthetic */ void access$1200(LogDescriptor logDescriptor, ByteString byteString) {
        logDescriptor.setDescriptionBytes(byteString);
    }

    public static /* synthetic */ void access$1300(LogDescriptor logDescriptor, String string2) {
        logDescriptor.setDisplayName(string2);
    }

    public static /* synthetic */ void access$1400(LogDescriptor logDescriptor) {
        logDescriptor.clearDisplayName();
    }

    public static /* synthetic */ void access$1500(LogDescriptor logDescriptor, ByteString byteString) {
        logDescriptor.setDisplayNameBytes(byteString);
    }

    public static /* synthetic */ void access$200(LogDescriptor logDescriptor) {
        logDescriptor.clearName();
    }

    public static /* synthetic */ void access$300(LogDescriptor logDescriptor, ByteString byteString) {
        logDescriptor.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(LogDescriptor logDescriptor, int n3, LabelDescriptor labelDescriptor) {
        logDescriptor.setLabels(n3, labelDescriptor);
    }

    public static /* synthetic */ void access$500(LogDescriptor logDescriptor, LabelDescriptor labelDescriptor) {
        logDescriptor.addLabels(labelDescriptor);
    }

    public static /* synthetic */ void access$600(LogDescriptor logDescriptor, int n3, LabelDescriptor labelDescriptor) {
        logDescriptor.addLabels(n3, labelDescriptor);
    }

    public static /* synthetic */ void access$700(LogDescriptor logDescriptor, Iterable iterable) {
        logDescriptor.addAllLabels(iterable);
    }

    public static /* synthetic */ void access$800(LogDescriptor logDescriptor) {
        logDescriptor.clearLabels();
    }

    public static /* synthetic */ void access$900(LogDescriptor logDescriptor, int n3) {
        logDescriptor.removeLabels(n3);
    }

    private void addAllLabels(Iterable iterable) {
        this.ensureLabelsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.labels_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addLabels(int n3, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        this.ensureLabelsIsMutable();
        this.labels_.add(n3, labelDescriptor);
    }

    private void addLabels(LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        this.ensureLabelsIsMutable();
        this.labels_.add(labelDescriptor);
    }

    private void clearDescription() {
        String string2;
        this.description_ = string2 = LogDescriptor.getDefaultInstance().getDescription();
    }

    private void clearDisplayName() {
        String string2;
        this.displayName_ = string2 = LogDescriptor.getDefaultInstance().getDisplayName();
    }

    private void clearLabels() {
        Internal$ProtobufList internal$ProtobufList;
        this.labels_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = LogDescriptor.getDefaultInstance().getName();
    }

    private void ensureLabelsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.labels_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.labels_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static LogDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static LogDescriptor$Builder newBuilder() {
        return (LogDescriptor$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static LogDescriptor$Builder newBuilder(LogDescriptor logDescriptor) {
        return (LogDescriptor$Builder)DEFAULT_INSTANCE.createBuilder(logDescriptor);
    }

    public static LogDescriptor parseDelimitedFrom(InputStream inputStream) {
        return (LogDescriptor)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LogDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LogDescriptor)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LogDescriptor parseFrom(ByteString byteString) {
        return (LogDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static LogDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (LogDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LogDescriptor parseFrom(CodedInputStream codedInputStream) {
        return (LogDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static LogDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LogDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static LogDescriptor parseFrom(InputStream inputStream) {
        return (LogDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static LogDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LogDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LogDescriptor parseFrom(ByteBuffer byteBuffer) {
        return (LogDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static LogDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (LogDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LogDescriptor parseFrom(byte[] byArray) {
        return (LogDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static LogDescriptor parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (LogDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeLabels(int n3) {
        this.ensureLabelsIsMutable();
        this.labels_.remove(n3);
    }

    private void setDescription(String string2) {
        string2.getClass();
        this.description_ = string2;
    }

    private void setDescriptionBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.description_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setDisplayName(String string2) {
        string2.getClass();
        this.displayName_ = string2;
    }

    private void setDisplayNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.displayName_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setLabels(int n3, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        this.ensureLabelsIsMutable();
        this.labels_.set(n3, labelDescriptor);
    }

    private void setName(String string2) {
        string2.getClass();
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.name_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = LogDescriptor$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = LogDescriptor.class;
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
                objectArray = new Object[5];
                objectArray[0] = "name_";
                objectArray[by2] = "labels_";
                objectArray[2] = LabelDescriptor.class;
                objectArray[3] = "description_";
                objectArray[4] = "displayName_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0208\u0002\u001b\u0003\u0208\u0004\u0208", objectArray);
            }
            case 2: {
                return new LogDescriptor$Builder(null);
            }
            case 1: 
        }
        return new LogDescriptor();
    }

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    public String getDisplayName() {
        return this.displayName_;
    }

    public ByteString getDisplayNameBytes() {
        return ByteString.copyFromUtf8(this.displayName_);
    }

    public LabelDescriptor getLabels(int n3) {
        return (LabelDescriptor)this.labels_.get(n3);
    }

    public int getLabelsCount() {
        return this.labels_.size();
    }

    public List getLabelsList() {
        return this.labels_;
    }

    public LabelDescriptorOrBuilder getLabelsOrBuilder(int n3) {
        return (LabelDescriptorOrBuilder)this.labels_.get(n3);
    }

    public List getLabelsOrBuilderList() {
        return this.labels_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }
}

