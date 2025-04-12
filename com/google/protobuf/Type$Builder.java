/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.Field;
import com.google.protobuf.Field$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Option;
import com.google.protobuf.Option$Builder;
import com.google.protobuf.SourceContext;
import com.google.protobuf.SourceContext$Builder;
import com.google.protobuf.Syntax;
import com.google.protobuf.Type;
import com.google.protobuf.Type$1;
import com.google.protobuf.TypeOrBuilder;
import java.util.Collections;
import java.util.List;

public final class Type$Builder
extends GeneratedMessageLite$Builder
implements TypeOrBuilder {
    private Type$Builder() {
        Type type2 = Type.access$000();
        super(type2);
    }

    public /* synthetic */ Type$Builder(Type$1 type$1) {
        this();
    }

    public Type$Builder addAllFields(Iterable iterable) {
        this.copyOnWrite();
        Type.access$700((Type)this.instance, iterable);
        return this;
    }

    public Type$Builder addAllOneofs(Iterable iterable) {
        this.copyOnWrite();
        Type.access$1200((Type)this.instance, iterable);
        return this;
    }

    public Type$Builder addAllOptions(Iterable iterable) {
        this.copyOnWrite();
        Type.access$1800((Type)this.instance, iterable);
        return this;
    }

    public Type$Builder addFields(int n3, Field$Builder fieldOrBuilder) {
        this.copyOnWrite();
        Type type2 = (Type)this.instance;
        fieldOrBuilder = (Field)fieldOrBuilder.build();
        Type.access$600(type2, n3, (Field)fieldOrBuilder);
        return this;
    }

    public Type$Builder addFields(int n3, Field field) {
        this.copyOnWrite();
        Type.access$600((Type)this.instance, n3, field);
        return this;
    }

    public Type$Builder addFields(Field$Builder fieldOrBuilder) {
        this.copyOnWrite();
        Type type2 = (Type)this.instance;
        fieldOrBuilder = (Field)fieldOrBuilder.build();
        Type.access$500(type2, (Field)fieldOrBuilder);
        return this;
    }

    public Type$Builder addFields(Field field) {
        this.copyOnWrite();
        Type.access$500((Type)this.instance, field);
        return this;
    }

    public Type$Builder addOneofs(String string2) {
        this.copyOnWrite();
        Type.access$1100((Type)this.instance, string2);
        return this;
    }

    public Type$Builder addOneofsBytes(ByteString byteString) {
        this.copyOnWrite();
        Type.access$1400((Type)this.instance, byteString);
        return this;
    }

    public Type$Builder addOptions(int n3, Option$Builder optionOrBuilder) {
        this.copyOnWrite();
        Type type2 = (Type)this.instance;
        optionOrBuilder = (Option)optionOrBuilder.build();
        Type.access$1700(type2, n3, (Option)optionOrBuilder);
        return this;
    }

    public Type$Builder addOptions(int n3, Option option) {
        this.copyOnWrite();
        Type.access$1700((Type)this.instance, n3, option);
        return this;
    }

    public Type$Builder addOptions(Option$Builder optionOrBuilder) {
        this.copyOnWrite();
        Type type2 = (Type)this.instance;
        optionOrBuilder = (Option)optionOrBuilder.build();
        Type.access$1600(type2, (Option)optionOrBuilder);
        return this;
    }

    public Type$Builder addOptions(Option option) {
        this.copyOnWrite();
        Type.access$1600((Type)this.instance, option);
        return this;
    }

    public Type$Builder clearEdition() {
        this.copyOnWrite();
        Type.access$2800((Type)this.instance);
        return this;
    }

    public Type$Builder clearFields() {
        this.copyOnWrite();
        Type.access$800((Type)this.instance);
        return this;
    }

    public Type$Builder clearName() {
        this.copyOnWrite();
        Type.access$200((Type)this.instance);
        return this;
    }

    public Type$Builder clearOneofs() {
        this.copyOnWrite();
        Type.access$1300((Type)this.instance);
        return this;
    }

    public Type$Builder clearOptions() {
        this.copyOnWrite();
        Type.access$1900((Type)this.instance);
        return this;
    }

    public Type$Builder clearSourceContext() {
        this.copyOnWrite();
        Type.access$2300((Type)this.instance);
        return this;
    }

    public Type$Builder clearSyntax() {
        this.copyOnWrite();
        Type.access$2600((Type)this.instance);
        return this;
    }

    public String getEdition() {
        return ((Type)this.instance).getEdition();
    }

    public ByteString getEditionBytes() {
        return ((Type)this.instance).getEditionBytes();
    }

    public Field getFields(int n3) {
        return ((Type)this.instance).getFields(n3);
    }

    public int getFieldsCount() {
        return ((Type)this.instance).getFieldsCount();
    }

    public List getFieldsList() {
        return Collections.unmodifiableList(((Type)this.instance).getFieldsList());
    }

    public String getName() {
        return ((Type)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((Type)this.instance).getNameBytes();
    }

    public String getOneofs(int n3) {
        return ((Type)this.instance).getOneofs(n3);
    }

    public ByteString getOneofsBytes(int n3) {
        return ((Type)this.instance).getOneofsBytes(n3);
    }

    public int getOneofsCount() {
        return ((Type)this.instance).getOneofsCount();
    }

    public List getOneofsList() {
        return Collections.unmodifiableList(((Type)this.instance).getOneofsList());
    }

    public Option getOptions(int n3) {
        return ((Type)this.instance).getOptions(n3);
    }

    public int getOptionsCount() {
        return ((Type)this.instance).getOptionsCount();
    }

    public List getOptionsList() {
        return Collections.unmodifiableList(((Type)this.instance).getOptionsList());
    }

    public SourceContext getSourceContext() {
        return ((Type)this.instance).getSourceContext();
    }

    public Syntax getSyntax() {
        return ((Type)this.instance).getSyntax();
    }

    public int getSyntaxValue() {
        return ((Type)this.instance).getSyntaxValue();
    }

    public boolean hasSourceContext() {
        return ((Type)this.instance).hasSourceContext();
    }

    public Type$Builder mergeSourceContext(SourceContext sourceContext) {
        this.copyOnWrite();
        Type.access$2200((Type)this.instance, sourceContext);
        return this;
    }

    public Type$Builder removeFields(int n3) {
        this.copyOnWrite();
        Type.access$900((Type)this.instance, n3);
        return this;
    }

    public Type$Builder removeOptions(int n3) {
        this.copyOnWrite();
        Type.access$2000((Type)this.instance, n3);
        return this;
    }

    public Type$Builder setEdition(String string2) {
        this.copyOnWrite();
        Type.access$2700((Type)this.instance, string2);
        return this;
    }

    public Type$Builder setEditionBytes(ByteString byteString) {
        this.copyOnWrite();
        Type.access$2900((Type)this.instance, byteString);
        return this;
    }

    public Type$Builder setFields(int n3, Field$Builder fieldOrBuilder) {
        this.copyOnWrite();
        Type type2 = (Type)this.instance;
        fieldOrBuilder = (Field)fieldOrBuilder.build();
        Type.access$400(type2, n3, (Field)fieldOrBuilder);
        return this;
    }

    public Type$Builder setFields(int n3, Field field) {
        this.copyOnWrite();
        Type.access$400((Type)this.instance, n3, field);
        return this;
    }

    public Type$Builder setName(String string2) {
        this.copyOnWrite();
        Type.access$100((Type)this.instance, string2);
        return this;
    }

    public Type$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        Type.access$300((Type)this.instance, byteString);
        return this;
    }

    public Type$Builder setOneofs(int n3, String string2) {
        this.copyOnWrite();
        Type.access$1000((Type)this.instance, n3, string2);
        return this;
    }

    public Type$Builder setOptions(int n3, Option$Builder optionOrBuilder) {
        this.copyOnWrite();
        Type type2 = (Type)this.instance;
        optionOrBuilder = (Option)optionOrBuilder.build();
        Type.access$1500(type2, n3, (Option)optionOrBuilder);
        return this;
    }

    public Type$Builder setOptions(int n3, Option option) {
        this.copyOnWrite();
        Type.access$1500((Type)this.instance, n3, option);
        return this;
    }

    public Type$Builder setSourceContext(SourceContext$Builder sourceContextOrBuilder) {
        this.copyOnWrite();
        Type type2 = (Type)this.instance;
        sourceContextOrBuilder = (SourceContext)sourceContextOrBuilder.build();
        Type.access$2100(type2, (SourceContext)sourceContextOrBuilder);
        return this;
    }

    public Type$Builder setSourceContext(SourceContext sourceContext) {
        this.copyOnWrite();
        Type.access$2100((Type)this.instance, sourceContext);
        return this;
    }

    public Type$Builder setSyntax(Syntax syntax) {
        this.copyOnWrite();
        Type.access$2500((Type)this.instance, syntax);
        return this;
    }

    public Type$Builder setSyntaxValue(int n3) {
        this.copyOnWrite();
        Type.access$2400((Type)this.instance, n3);
        return this;
    }
}

