/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Advice;
import com.google.api.Advice$Builder;
import com.google.api.ChangeType;
import com.google.api.ConfigChange;
import com.google.api.ConfigChange$1;
import com.google.api.ConfigChangeOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class ConfigChange$Builder
extends GeneratedMessageLite$Builder
implements ConfigChangeOrBuilder {
    private ConfigChange$Builder() {
        ConfigChange configChange = ConfigChange.access$000();
        super(configChange);
    }

    public /* synthetic */ ConfigChange$Builder(ConfigChange$1 configChange$1) {
        this();
    }

    public ConfigChange$Builder addAdvices(int n3, Advice$Builder adviceOrBuilder) {
        this.copyOnWrite();
        ConfigChange configChange = (ConfigChange)this.instance;
        adviceOrBuilder = (Advice)adviceOrBuilder.build();
        ConfigChange.access$1500(configChange, n3, (Advice)adviceOrBuilder);
        return this;
    }

    public ConfigChange$Builder addAdvices(int n3, Advice advice) {
        this.copyOnWrite();
        ConfigChange.access$1500((ConfigChange)this.instance, n3, advice);
        return this;
    }

    public ConfigChange$Builder addAdvices(Advice$Builder adviceOrBuilder) {
        this.copyOnWrite();
        ConfigChange configChange = (ConfigChange)this.instance;
        adviceOrBuilder = (Advice)adviceOrBuilder.build();
        ConfigChange.access$1400(configChange, (Advice)adviceOrBuilder);
        return this;
    }

    public ConfigChange$Builder addAdvices(Advice advice) {
        this.copyOnWrite();
        ConfigChange.access$1400((ConfigChange)this.instance, advice);
        return this;
    }

    public ConfigChange$Builder addAllAdvices(Iterable iterable) {
        this.copyOnWrite();
        ConfigChange.access$1600((ConfigChange)this.instance, iterable);
        return this;
    }

    public ConfigChange$Builder clearAdvices() {
        this.copyOnWrite();
        ConfigChange.access$1700((ConfigChange)this.instance);
        return this;
    }

    public ConfigChange$Builder clearChangeType() {
        this.copyOnWrite();
        ConfigChange.access$1200((ConfigChange)this.instance);
        return this;
    }

    public ConfigChange$Builder clearElement() {
        this.copyOnWrite();
        ConfigChange.access$200((ConfigChange)this.instance);
        return this;
    }

    public ConfigChange$Builder clearNewValue() {
        this.copyOnWrite();
        ConfigChange.access$800((ConfigChange)this.instance);
        return this;
    }

    public ConfigChange$Builder clearOldValue() {
        this.copyOnWrite();
        ConfigChange.access$500((ConfigChange)this.instance);
        return this;
    }

    public Advice getAdvices(int n3) {
        return ((ConfigChange)this.instance).getAdvices(n3);
    }

    public int getAdvicesCount() {
        return ((ConfigChange)this.instance).getAdvicesCount();
    }

    public List getAdvicesList() {
        return Collections.unmodifiableList(((ConfigChange)this.instance).getAdvicesList());
    }

    public ChangeType getChangeType() {
        return ((ConfigChange)this.instance).getChangeType();
    }

    public int getChangeTypeValue() {
        return ((ConfigChange)this.instance).getChangeTypeValue();
    }

    public String getElement() {
        return ((ConfigChange)this.instance).getElement();
    }

    public ByteString getElementBytes() {
        return ((ConfigChange)this.instance).getElementBytes();
    }

    public String getNewValue() {
        return ((ConfigChange)this.instance).getNewValue();
    }

    public ByteString getNewValueBytes() {
        return ((ConfigChange)this.instance).getNewValueBytes();
    }

    public String getOldValue() {
        return ((ConfigChange)this.instance).getOldValue();
    }

    public ByteString getOldValueBytes() {
        return ((ConfigChange)this.instance).getOldValueBytes();
    }

    public ConfigChange$Builder removeAdvices(int n3) {
        this.copyOnWrite();
        ConfigChange.access$1800((ConfigChange)this.instance, n3);
        return this;
    }

    public ConfigChange$Builder setAdvices(int n3, Advice$Builder adviceOrBuilder) {
        this.copyOnWrite();
        ConfigChange configChange = (ConfigChange)this.instance;
        adviceOrBuilder = (Advice)adviceOrBuilder.build();
        ConfigChange.access$1300(configChange, n3, (Advice)adviceOrBuilder);
        return this;
    }

    public ConfigChange$Builder setAdvices(int n3, Advice advice) {
        this.copyOnWrite();
        ConfigChange.access$1300((ConfigChange)this.instance, n3, advice);
        return this;
    }

    public ConfigChange$Builder setChangeType(ChangeType changeType) {
        this.copyOnWrite();
        ConfigChange.access$1100((ConfigChange)this.instance, changeType);
        return this;
    }

    public ConfigChange$Builder setChangeTypeValue(int n3) {
        this.copyOnWrite();
        ConfigChange.access$1000((ConfigChange)this.instance, n3);
        return this;
    }

    public ConfigChange$Builder setElement(String string2) {
        this.copyOnWrite();
        ConfigChange.access$100((ConfigChange)this.instance, string2);
        return this;
    }

    public ConfigChange$Builder setElementBytes(ByteString byteString) {
        this.copyOnWrite();
        ConfigChange.access$300((ConfigChange)this.instance, byteString);
        return this;
    }

    public ConfigChange$Builder setNewValue(String string2) {
        this.copyOnWrite();
        ConfigChange.access$700((ConfigChange)this.instance, string2);
        return this;
    }

    public ConfigChange$Builder setNewValueBytes(ByteString byteString) {
        this.copyOnWrite();
        ConfigChange.access$900((ConfigChange)this.instance, byteString);
        return this;
    }

    public ConfigChange$Builder setOldValue(String string2) {
        this.copyOnWrite();
        ConfigChange.access$400((ConfigChange)this.instance, string2);
        return this;
    }

    public ConfigChange$Builder setOldValueBytes(ByteString byteString) {
        this.copyOnWrite();
        ConfigChange.access$600((ConfigChange)this.instance, byteString);
        return this;
    }
}

