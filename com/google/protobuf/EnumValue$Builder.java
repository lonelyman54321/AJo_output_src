/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.EnumValue;
import com.google.protobuf.EnumValue$1;
import com.google.protobuf.EnumValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Option;
import com.google.protobuf.Option$Builder;
import java.util.Collections;
import java.util.List;

public final class EnumValue$Builder
extends GeneratedMessageLite$Builder
implements EnumValueOrBuilder {
    private EnumValue$Builder() {
        EnumValue enumValue = EnumValue.access$000();
        super(enumValue);
    }

    public /* synthetic */ EnumValue$Builder(EnumValue$1 enumValue$1) {
        this();
    }

    public EnumValue$Builder addAllOptions(Iterable iterable) {
        this.copyOnWrite();
        EnumValue.access$900((EnumValue)this.instance, iterable);
        return this;
    }

    public EnumValue$Builder addOptions(int n3, Option$Builder optionOrBuilder) {
        this.copyOnWrite();
        EnumValue enumValue = (EnumValue)this.instance;
        optionOrBuilder = (Option)optionOrBuilder.build();
        EnumValue.access$800(enumValue, n3, (Option)optionOrBuilder);
        return this;
    }

    public EnumValue$Builder addOptions(int n3, Option option) {
        this.copyOnWrite();
        EnumValue.access$800((EnumValue)this.instance, n3, option);
        return this;
    }

    public EnumValue$Builder addOptions(Option$Builder optionOrBuilder) {
        this.copyOnWrite();
        EnumValue enumValue = (EnumValue)this.instance;
        optionOrBuilder = (Option)optionOrBuilder.build();
        EnumValue.access$700(enumValue, (Option)optionOrBuilder);
        return this;
    }

    public EnumValue$Builder addOptions(Option option) {
        this.copyOnWrite();
        EnumValue.access$700((EnumValue)this.instance, option);
        return this;
    }

    public EnumValue$Builder clearName() {
        this.copyOnWrite();
        EnumValue.access$200((EnumValue)this.instance);
        return this;
    }

    public EnumValue$Builder clearNumber() {
        this.copyOnWrite();
        EnumValue.access$500((EnumValue)this.instance);
        return this;
    }

    public EnumValue$Builder clearOptions() {
        this.copyOnWrite();
        EnumValue.access$1000((EnumValue)this.instance);
        return this;
    }

    public String getName() {
        return ((EnumValue)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((EnumValue)this.instance).getNameBytes();
    }

    public int getNumber() {
        return ((EnumValue)this.instance).getNumber();
    }

    public Option getOptions(int n3) {
        return ((EnumValue)this.instance).getOptions(n3);
    }

    public int getOptionsCount() {
        return ((EnumValue)this.instance).getOptionsCount();
    }

    public List getOptionsList() {
        return Collections.unmodifiableList(((EnumValue)this.instance).getOptionsList());
    }

    public EnumValue$Builder removeOptions(int n3) {
        this.copyOnWrite();
        EnumValue.access$1100((EnumValue)this.instance, n3);
        return this;
    }

    public EnumValue$Builder setName(String string2) {
        this.copyOnWrite();
        EnumValue.access$100((EnumValue)this.instance, string2);
        return this;
    }

    public EnumValue$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        EnumValue.access$300((EnumValue)this.instance, byteString);
        return this;
    }

    public EnumValue$Builder setNumber(int n3) {
        this.copyOnWrite();
        EnumValue.access$400((EnumValue)this.instance, n3);
        return this;
    }

    public EnumValue$Builder setOptions(int n3, Option$Builder optionOrBuilder) {
        this.copyOnWrite();
        EnumValue enumValue = (EnumValue)this.instance;
        optionOrBuilder = (Option)optionOrBuilder.build();
        EnumValue.access$600(enumValue, n3, (Option)optionOrBuilder);
        return this;
    }

    public EnumValue$Builder setOptions(int n3, Option option) {
        this.copyOnWrite();
        EnumValue.access$600((EnumValue)this.instance, n3, option);
        return this;
    }
}

