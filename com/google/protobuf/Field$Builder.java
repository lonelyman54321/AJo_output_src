/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.Field;
import com.google.protobuf.Field$1;
import com.google.protobuf.Field$Cardinality;
import com.google.protobuf.Field$Kind;
import com.google.protobuf.FieldOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Option;
import com.google.protobuf.Option$Builder;
import java.util.Collections;
import java.util.List;

public final class Field$Builder
extends GeneratedMessageLite$Builder
implements FieldOrBuilder {
    private Field$Builder() {
        Field field = Field.access$000();
        super(field);
    }

    public /* synthetic */ Field$Builder(Field$1 field$1) {
        this();
    }

    public Field$Builder addAllOptions(Iterable iterable) {
        this.copyOnWrite();
        Field.access$2200((Field)this.instance, iterable);
        return this;
    }

    public Field$Builder addOptions(int n3, Option$Builder optionOrBuilder) {
        this.copyOnWrite();
        Field field = (Field)this.instance;
        optionOrBuilder = (Option)optionOrBuilder.build();
        Field.access$2100(field, n3, (Option)optionOrBuilder);
        return this;
    }

    public Field$Builder addOptions(int n3, Option option) {
        this.copyOnWrite();
        Field.access$2100((Field)this.instance, n3, option);
        return this;
    }

    public Field$Builder addOptions(Option$Builder optionOrBuilder) {
        this.copyOnWrite();
        Field field = (Field)this.instance;
        optionOrBuilder = (Option)optionOrBuilder.build();
        Field.access$2000(field, (Option)optionOrBuilder);
        return this;
    }

    public Field$Builder addOptions(Option option) {
        this.copyOnWrite();
        Field.access$2000((Field)this.instance, option);
        return this;
    }

    public Field$Builder clearCardinality() {
        this.copyOnWrite();
        Field.access$600((Field)this.instance);
        return this;
    }

    public Field$Builder clearDefaultValue() {
        this.copyOnWrite();
        Field.access$2900((Field)this.instance);
        return this;
    }

    public Field$Builder clearJsonName() {
        this.copyOnWrite();
        Field.access$2600((Field)this.instance);
        return this;
    }

    public Field$Builder clearKind() {
        this.copyOnWrite();
        Field.access$300((Field)this.instance);
        return this;
    }

    public Field$Builder clearName() {
        this.copyOnWrite();
        Field.access$1000((Field)this.instance);
        return this;
    }

    public Field$Builder clearNumber() {
        this.copyOnWrite();
        Field.access$800((Field)this.instance);
        return this;
    }

    public Field$Builder clearOneofIndex() {
        this.copyOnWrite();
        Field.access$1600((Field)this.instance);
        return this;
    }

    public Field$Builder clearOptions() {
        this.copyOnWrite();
        Field.access$2300((Field)this.instance);
        return this;
    }

    public Field$Builder clearPacked() {
        this.copyOnWrite();
        Field.access$1800((Field)this.instance);
        return this;
    }

    public Field$Builder clearTypeUrl() {
        this.copyOnWrite();
        Field.access$1300((Field)this.instance);
        return this;
    }

    public Field$Cardinality getCardinality() {
        return ((Field)this.instance).getCardinality();
    }

    public int getCardinalityValue() {
        return ((Field)this.instance).getCardinalityValue();
    }

    public String getDefaultValue() {
        return ((Field)this.instance).getDefaultValue();
    }

    public ByteString getDefaultValueBytes() {
        return ((Field)this.instance).getDefaultValueBytes();
    }

    public String getJsonName() {
        return ((Field)this.instance).getJsonName();
    }

    public ByteString getJsonNameBytes() {
        return ((Field)this.instance).getJsonNameBytes();
    }

    public Field$Kind getKind() {
        return ((Field)this.instance).getKind();
    }

    public int getKindValue() {
        return ((Field)this.instance).getKindValue();
    }

    public String getName() {
        return ((Field)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((Field)this.instance).getNameBytes();
    }

    public int getNumber() {
        return ((Field)this.instance).getNumber();
    }

    public int getOneofIndex() {
        return ((Field)this.instance).getOneofIndex();
    }

    public Option getOptions(int n3) {
        return ((Field)this.instance).getOptions(n3);
    }

    public int getOptionsCount() {
        return ((Field)this.instance).getOptionsCount();
    }

    public List getOptionsList() {
        return Collections.unmodifiableList(((Field)this.instance).getOptionsList());
    }

    public boolean getPacked() {
        return ((Field)this.instance).getPacked();
    }

    public String getTypeUrl() {
        return ((Field)this.instance).getTypeUrl();
    }

    public ByteString getTypeUrlBytes() {
        return ((Field)this.instance).getTypeUrlBytes();
    }

    public Field$Builder removeOptions(int n3) {
        this.copyOnWrite();
        Field.access$2400((Field)this.instance, n3);
        return this;
    }

    public Field$Builder setCardinality(Field$Cardinality field$Cardinality) {
        this.copyOnWrite();
        Field.access$500((Field)this.instance, field$Cardinality);
        return this;
    }

    public Field$Builder setCardinalityValue(int n3) {
        this.copyOnWrite();
        Field.access$400((Field)this.instance, n3);
        return this;
    }

    public Field$Builder setDefaultValue(String string2) {
        this.copyOnWrite();
        Field.access$2800((Field)this.instance, string2);
        return this;
    }

    public Field$Builder setDefaultValueBytes(ByteString byteString) {
        this.copyOnWrite();
        Field.access$3000((Field)this.instance, byteString);
        return this;
    }

    public Field$Builder setJsonName(String string2) {
        this.copyOnWrite();
        Field.access$2500((Field)this.instance, string2);
        return this;
    }

    public Field$Builder setJsonNameBytes(ByteString byteString) {
        this.copyOnWrite();
        Field.access$2700((Field)this.instance, byteString);
        return this;
    }

    public Field$Builder setKind(Field$Kind field$Kind) {
        this.copyOnWrite();
        Field.access$200((Field)this.instance, field$Kind);
        return this;
    }

    public Field$Builder setKindValue(int n3) {
        this.copyOnWrite();
        Field.access$100((Field)this.instance, n3);
        return this;
    }

    public Field$Builder setName(String string2) {
        this.copyOnWrite();
        Field.access$900((Field)this.instance, string2);
        return this;
    }

    public Field$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        Field.access$1100((Field)this.instance, byteString);
        return this;
    }

    public Field$Builder setNumber(int n3) {
        this.copyOnWrite();
        Field.access$700((Field)this.instance, n3);
        return this;
    }

    public Field$Builder setOneofIndex(int n3) {
        this.copyOnWrite();
        Field.access$1500((Field)this.instance, n3);
        return this;
    }

    public Field$Builder setOptions(int n3, Option$Builder optionOrBuilder) {
        this.copyOnWrite();
        Field field = (Field)this.instance;
        optionOrBuilder = (Option)optionOrBuilder.build();
        Field.access$1900(field, n3, (Option)optionOrBuilder);
        return this;
    }

    public Field$Builder setOptions(int n3, Option option) {
        this.copyOnWrite();
        Field.access$1900((Field)this.instance, n3, option);
        return this;
    }

    public Field$Builder setPacked(boolean bl2) {
        this.copyOnWrite();
        Field.access$1700((Field)this.instance, bl2);
        return this;
    }

    public Field$Builder setTypeUrl(String string2) {
        this.copyOnWrite();
        Field.access$1200((Field)this.instance, string2);
        return this;
    }

    public Field$Builder setTypeUrlBytes(ByteString byteString) {
        this.copyOnWrite();
        Field.access$1400((Field)this.instance, byteString);
        return this;
    }
}

