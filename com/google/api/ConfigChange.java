/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Advice;
import com.google.api.AdviceOrBuilder;
import com.google.api.ChangeType;
import com.google.api.ConfigChange$1;
import com.google.api.ConfigChange$Builder;
import com.google.api.ConfigChangeOrBuilder;
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

public final class ConfigChange
extends GeneratedMessageLite
implements ConfigChangeOrBuilder {
    public static final int ADVICES_FIELD_NUMBER = 5;
    public static final int CHANGE_TYPE_FIELD_NUMBER = 4;
    private static final ConfigChange DEFAULT_INSTANCE;
    public static final int ELEMENT_FIELD_NUMBER = 1;
    public static final int NEW_VALUE_FIELD_NUMBER = 3;
    public static final int OLD_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    private Internal$ProtobufList advices_;
    private int changeType_;
    private String element_;
    private String newValue_;
    private String oldValue_;

    static {
        ConfigChange configChange;
        DEFAULT_INSTANCE = configChange = new ConfigChange();
        GeneratedMessageLite.registerDefaultInstance(ConfigChange.class, configChange);
    }

    private ConfigChange() {
        Object object = "";
        this.element_ = object;
        this.oldValue_ = object;
        this.newValue_ = object;
        this.advices_ = object = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ ConfigChange access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(ConfigChange configChange, String string2) {
        configChange.setElement(string2);
    }

    public static /* synthetic */ void access$1000(ConfigChange configChange, int n3) {
        configChange.setChangeTypeValue(n3);
    }

    public static /* synthetic */ void access$1100(ConfigChange configChange, ChangeType changeType) {
        configChange.setChangeType(changeType);
    }

    public static /* synthetic */ void access$1200(ConfigChange configChange) {
        configChange.clearChangeType();
    }

    public static /* synthetic */ void access$1300(ConfigChange configChange, int n3, Advice advice) {
        configChange.setAdvices(n3, advice);
    }

    public static /* synthetic */ void access$1400(ConfigChange configChange, Advice advice) {
        configChange.addAdvices(advice);
    }

    public static /* synthetic */ void access$1500(ConfigChange configChange, int n3, Advice advice) {
        configChange.addAdvices(n3, advice);
    }

    public static /* synthetic */ void access$1600(ConfigChange configChange, Iterable iterable) {
        configChange.addAllAdvices(iterable);
    }

    public static /* synthetic */ void access$1700(ConfigChange configChange) {
        configChange.clearAdvices();
    }

    public static /* synthetic */ void access$1800(ConfigChange configChange, int n3) {
        configChange.removeAdvices(n3);
    }

    public static /* synthetic */ void access$200(ConfigChange configChange) {
        configChange.clearElement();
    }

    public static /* synthetic */ void access$300(ConfigChange configChange, ByteString byteString) {
        configChange.setElementBytes(byteString);
    }

    public static /* synthetic */ void access$400(ConfigChange configChange, String string2) {
        configChange.setOldValue(string2);
    }

    public static /* synthetic */ void access$500(ConfigChange configChange) {
        configChange.clearOldValue();
    }

    public static /* synthetic */ void access$600(ConfigChange configChange, ByteString byteString) {
        configChange.setOldValueBytes(byteString);
    }

    public static /* synthetic */ void access$700(ConfigChange configChange, String string2) {
        configChange.setNewValue(string2);
    }

    public static /* synthetic */ void access$800(ConfigChange configChange) {
        configChange.clearNewValue();
    }

    public static /* synthetic */ void access$900(ConfigChange configChange, ByteString byteString) {
        configChange.setNewValueBytes(byteString);
    }

    private void addAdvices(int n3, Advice advice) {
        advice.getClass();
        this.ensureAdvicesIsMutable();
        this.advices_.add(n3, advice);
    }

    private void addAdvices(Advice advice) {
        advice.getClass();
        this.ensureAdvicesIsMutable();
        this.advices_.add(advice);
    }

    private void addAllAdvices(Iterable iterable) {
        this.ensureAdvicesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.advices_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void clearAdvices() {
        Internal$ProtobufList internal$ProtobufList;
        this.advices_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearChangeType() {
        this.changeType_ = 0;
    }

    private void clearElement() {
        String string2;
        this.element_ = string2 = ConfigChange.getDefaultInstance().getElement();
    }

    private void clearNewValue() {
        String string2;
        this.newValue_ = string2 = ConfigChange.getDefaultInstance().getNewValue();
    }

    private void clearOldValue() {
        String string2;
        this.oldValue_ = string2 = ConfigChange.getDefaultInstance().getOldValue();
    }

    private void ensureAdvicesIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.advices_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.advices_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static ConfigChange getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ConfigChange$Builder newBuilder() {
        return (ConfigChange$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static ConfigChange$Builder newBuilder(ConfigChange configChange) {
        return (ConfigChange$Builder)DEFAULT_INSTANCE.createBuilder(configChange);
    }

    public static ConfigChange parseDelimitedFrom(InputStream inputStream) {
        return (ConfigChange)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfigChange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ConfigChange)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ConfigChange parseFrom(ByteString byteString) {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static ConfigChange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ConfigChange parseFrom(CodedInputStream codedInputStream) {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static ConfigChange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static ConfigChange parseFrom(InputStream inputStream) {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static ConfigChange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ConfigChange parseFrom(ByteBuffer byteBuffer) {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static ConfigChange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ConfigChange parseFrom(byte[] byArray) {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static ConfigChange parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAdvices(int n3) {
        this.ensureAdvicesIsMutable();
        this.advices_.remove(n3);
    }

    private void setAdvices(int n3, Advice advice) {
        advice.getClass();
        this.ensureAdvicesIsMutable();
        this.advices_.set(n3, advice);
    }

    private void setChangeType(ChangeType changeType) {
        int n3;
        this.changeType_ = n3 = changeType.getNumber();
    }

    private void setChangeTypeValue(int n3) {
        this.changeType_ = n3;
    }

    private void setElement(String string2) {
        string2.getClass();
        this.element_ = string2;
    }

    private void setElementBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.element_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setNewValue(String string2) {
        string2.getClass();
        this.newValue_ = string2;
    }

    private void setNewValueBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.newValue_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setOldValue(String string2) {
        string2.getClass();
        this.oldValue_ = string2;
    }

    private void setOldValueBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.oldValue_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = ConfigChange$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = ConfigChange.class;
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
                objectArray[0] = "element_";
                objectArray[by2] = "oldValue_";
                objectArray[2] = "newValue_";
                objectArray[3] = "changeType_";
                objectArray[4] = "advices_";
                objectArray[5] = Advice.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\f\u0005\u001b", objectArray);
            }
            case 2: {
                return new ConfigChange$Builder(null);
            }
            case 1: 
        }
        return new ConfigChange();
    }

    public Advice getAdvices(int n3) {
        return (Advice)this.advices_.get(n3);
    }

    public int getAdvicesCount() {
        return this.advices_.size();
    }

    public List getAdvicesList() {
        return this.advices_;
    }

    public AdviceOrBuilder getAdvicesOrBuilder(int n3) {
        return (AdviceOrBuilder)this.advices_.get(n3);
    }

    public List getAdvicesOrBuilderList() {
        return this.advices_;
    }

    public ChangeType getChangeType() {
        int n3 = this.changeType_;
        ChangeType changeType = ChangeType.forNumber(n3);
        if (changeType == null) {
            changeType = ChangeType.UNRECOGNIZED;
        }
        return changeType;
    }

    public int getChangeTypeValue() {
        return this.changeType_;
    }

    public String getElement() {
        return this.element_;
    }

    public ByteString getElementBytes() {
        return ByteString.copyFromUtf8(this.element_);
    }

    public String getNewValue() {
        return this.newValue_;
    }

    public ByteString getNewValueBytes() {
        return ByteString.copyFromUtf8(this.newValue_);
    }

    public String getOldValue() {
        return this.oldValue_;
    }

    public ByteString getOldValueBytes() {
        return ByteString.copyFromUtf8(this.oldValue_);
    }
}

