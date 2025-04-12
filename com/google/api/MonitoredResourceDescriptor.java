/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.LabelDescriptor;
import com.google.api.LabelDescriptorOrBuilder;
import com.google.api.LaunchStage;
import com.google.api.MonitoredResourceDescriptor$1;
import com.google.api.MonitoredResourceDescriptor$Builder;
import com.google.api.MonitoredResourceDescriptorOrBuilder;
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

public final class MonitoredResourceDescriptor
extends GeneratedMessageLite
implements MonitoredResourceDescriptorOrBuilder {
    private static final MonitoredResourceDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
    public static final int LABELS_FIELD_NUMBER = 4;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile Parser PARSER;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String description_;
    private String displayName_;
    private Internal$ProtobufList labels_;
    private int launchStage_;
    private String name_;
    private String type_;

    static {
        MonitoredResourceDescriptor monitoredResourceDescriptor;
        DEFAULT_INSTANCE = monitoredResourceDescriptor = new MonitoredResourceDescriptor();
        GeneratedMessageLite.registerDefaultInstance(MonitoredResourceDescriptor.class, monitoredResourceDescriptor);
    }

    private MonitoredResourceDescriptor() {
        Object object = "";
        this.name_ = object;
        this.type_ = object;
        this.displayName_ = object;
        this.description_ = object;
        this.labels_ = object = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ MonitoredResourceDescriptor access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(MonitoredResourceDescriptor monitoredResourceDescriptor, String string2) {
        monitoredResourceDescriptor.setName(string2);
    }

    public static /* synthetic */ void access$1000(MonitoredResourceDescriptor monitoredResourceDescriptor, String string2) {
        monitoredResourceDescriptor.setDescription(string2);
    }

    public static /* synthetic */ void access$1100(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.clearDescription();
    }

    public static /* synthetic */ void access$1200(MonitoredResourceDescriptor monitoredResourceDescriptor, ByteString byteString) {
        monitoredResourceDescriptor.setDescriptionBytes(byteString);
    }

    public static /* synthetic */ void access$1300(MonitoredResourceDescriptor monitoredResourceDescriptor, int n3, LabelDescriptor labelDescriptor) {
        monitoredResourceDescriptor.setLabels(n3, labelDescriptor);
    }

    public static /* synthetic */ void access$1400(MonitoredResourceDescriptor monitoredResourceDescriptor, LabelDescriptor labelDescriptor) {
        monitoredResourceDescriptor.addLabels(labelDescriptor);
    }

    public static /* synthetic */ void access$1500(MonitoredResourceDescriptor monitoredResourceDescriptor, int n3, LabelDescriptor labelDescriptor) {
        monitoredResourceDescriptor.addLabels(n3, labelDescriptor);
    }

    public static /* synthetic */ void access$1600(MonitoredResourceDescriptor monitoredResourceDescriptor, Iterable iterable) {
        monitoredResourceDescriptor.addAllLabels(iterable);
    }

    public static /* synthetic */ void access$1700(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.clearLabels();
    }

    public static /* synthetic */ void access$1800(MonitoredResourceDescriptor monitoredResourceDescriptor, int n3) {
        monitoredResourceDescriptor.removeLabels(n3);
    }

    public static /* synthetic */ void access$1900(MonitoredResourceDescriptor monitoredResourceDescriptor, int n3) {
        monitoredResourceDescriptor.setLaunchStageValue(n3);
    }

    public static /* synthetic */ void access$200(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.clearName();
    }

    public static /* synthetic */ void access$2000(MonitoredResourceDescriptor monitoredResourceDescriptor, LaunchStage launchStage) {
        monitoredResourceDescriptor.setLaunchStage(launchStage);
    }

    public static /* synthetic */ void access$2100(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.clearLaunchStage();
    }

    public static /* synthetic */ void access$300(MonitoredResourceDescriptor monitoredResourceDescriptor, ByteString byteString) {
        monitoredResourceDescriptor.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(MonitoredResourceDescriptor monitoredResourceDescriptor, String string2) {
        monitoredResourceDescriptor.setType(string2);
    }

    public static /* synthetic */ void access$500(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.clearType();
    }

    public static /* synthetic */ void access$600(MonitoredResourceDescriptor monitoredResourceDescriptor, ByteString byteString) {
        monitoredResourceDescriptor.setTypeBytes(byteString);
    }

    public static /* synthetic */ void access$700(MonitoredResourceDescriptor monitoredResourceDescriptor, String string2) {
        monitoredResourceDescriptor.setDisplayName(string2);
    }

    public static /* synthetic */ void access$800(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.clearDisplayName();
    }

    public static /* synthetic */ void access$900(MonitoredResourceDescriptor monitoredResourceDescriptor, ByteString byteString) {
        monitoredResourceDescriptor.setDisplayNameBytes(byteString);
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
        this.description_ = string2 = MonitoredResourceDescriptor.getDefaultInstance().getDescription();
    }

    private void clearDisplayName() {
        String string2;
        this.displayName_ = string2 = MonitoredResourceDescriptor.getDefaultInstance().getDisplayName();
    }

    private void clearLabels() {
        Internal$ProtobufList internal$ProtobufList;
        this.labels_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearLaunchStage() {
        this.launchStage_ = 0;
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = MonitoredResourceDescriptor.getDefaultInstance().getName();
    }

    private void clearType() {
        String string2;
        this.type_ = string2 = MonitoredResourceDescriptor.getDefaultInstance().getType();
    }

    private void ensureLabelsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.labels_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.labels_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static MonitoredResourceDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static MonitoredResourceDescriptor$Builder newBuilder() {
        return (MonitoredResourceDescriptor$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static MonitoredResourceDescriptor$Builder newBuilder(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        return (MonitoredResourceDescriptor$Builder)DEFAULT_INSTANCE.createBuilder(monitoredResourceDescriptor);
    }

    public static MonitoredResourceDescriptor parseDelimitedFrom(InputStream inputStream) {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResourceDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MonitoredResourceDescriptor parseFrom(ByteString byteString) {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static MonitoredResourceDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MonitoredResourceDescriptor parseFrom(CodedInputStream codedInputStream) {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static MonitoredResourceDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static MonitoredResourceDescriptor parseFrom(InputStream inputStream) {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResourceDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MonitoredResourceDescriptor parseFrom(ByteBuffer byteBuffer) {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static MonitoredResourceDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MonitoredResourceDescriptor parseFrom(byte[] byArray) {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static MonitoredResourceDescriptor parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
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

    private void setLaunchStage(LaunchStage launchStage) {
        int n3;
        this.launchStage_ = n3 = launchStage.getNumber();
    }

    private void setLaunchStageValue(int n3) {
        this.launchStage_ = n3;
    }

    private void setName(String string2) {
        string2.getClass();
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.name_ = object = ((ByteString)object).toStringUtf8();
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
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = MonitoredResourceDescriptor$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = MonitoredResourceDescriptor.class;
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
                objectArray = new Object[7];
                objectArray[0] = "type_";
                objectArray[by2] = "displayName_";
                objectArray[2] = "description_";
                objectArray[3] = "labels_";
                objectArray[4] = LabelDescriptor.class;
                objectArray[5] = "name_";
                objectArray[6] = "launchStage_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u001b\u0005\u0208\u0007\f", objectArray);
            }
            case 2: {
                return new MonitoredResourceDescriptor$Builder(null);
            }
            case 1: 
        }
        return new MonitoredResourceDescriptor();
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

    public LaunchStage getLaunchStage() {
        int n3 = this.launchStage_;
        LaunchStage launchStage = LaunchStage.forNumber(n3);
        if (launchStage == null) {
            launchStage = LaunchStage.UNRECOGNIZED;
        }
        return launchStage;
    }

    public int getLaunchStageValue() {
        return this.launchStage_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public String getType() {
        return this.type_;
    }

    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }
}

