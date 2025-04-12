/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.Enum;
import com.google.protobuf.Enum$1;
import com.google.protobuf.EnumOrBuilder;
import com.google.protobuf.EnumValue;
import com.google.protobuf.EnumValue$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Option;
import com.google.protobuf.Option$Builder;
import com.google.protobuf.SourceContext;
import com.google.protobuf.SourceContext$Builder;
import com.google.protobuf.Syntax;
import java.util.Collections;
import java.util.List;

public final class Enum$Builder
extends GeneratedMessageLite$Builder
implements EnumOrBuilder {
    private Enum$Builder() {
        Enum enum_ = Enum.access$000();
        super(enum_);
    }

    public /* synthetic */ Enum$Builder(Enum$1 enum$1) {
        this();
    }

    public Enum$Builder addAllEnumvalue(Iterable iterable) {
        this.copyOnWrite();
        Enum.access$700((Enum)this.instance, iterable);
        return this;
    }

    public Enum$Builder addAllOptions(Iterable iterable) {
        this.copyOnWrite();
        Enum.access$1300((Enum)this.instance, iterable);
        return this;
    }

    public Enum$Builder addEnumvalue(int n3, EnumValue$Builder enumValueOrBuilder) {
        this.copyOnWrite();
        Enum enum_ = (Enum)this.instance;
        enumValueOrBuilder = (EnumValue)enumValueOrBuilder.build();
        Enum.access$600(enum_, n3, (EnumValue)enumValueOrBuilder);
        return this;
    }

    public Enum$Builder addEnumvalue(int n3, EnumValue enumValue) {
        this.copyOnWrite();
        Enum.access$600((Enum)this.instance, n3, enumValue);
        return this;
    }

    public Enum$Builder addEnumvalue(EnumValue$Builder enumValueOrBuilder) {
        this.copyOnWrite();
        Enum enum_ = (Enum)this.instance;
        enumValueOrBuilder = (EnumValue)enumValueOrBuilder.build();
        Enum.access$500(enum_, (EnumValue)enumValueOrBuilder);
        return this;
    }

    public Enum$Builder addEnumvalue(EnumValue enumValue) {
        this.copyOnWrite();
        Enum.access$500((Enum)this.instance, enumValue);
        return this;
    }

    public Enum$Builder addOptions(int n3, Option$Builder optionOrBuilder) {
        this.copyOnWrite();
        Enum enum_ = (Enum)this.instance;
        optionOrBuilder = (Option)optionOrBuilder.build();
        Enum.access$1200(enum_, n3, (Option)optionOrBuilder);
        return this;
    }

    public Enum$Builder addOptions(int n3, Option option) {
        this.copyOnWrite();
        Enum.access$1200((Enum)this.instance, n3, option);
        return this;
    }

    public Enum$Builder addOptions(Option$Builder optionOrBuilder) {
        this.copyOnWrite();
        Enum enum_ = (Enum)this.instance;
        optionOrBuilder = (Option)optionOrBuilder.build();
        Enum.access$1100(enum_, (Option)optionOrBuilder);
        return this;
    }

    public Enum$Builder addOptions(Option option) {
        this.copyOnWrite();
        Enum.access$1100((Enum)this.instance, option);
        return this;
    }

    public Enum$Builder clearEdition() {
        this.copyOnWrite();
        Enum.access$2300((Enum)this.instance);
        return this;
    }

    public Enum$Builder clearEnumvalue() {
        this.copyOnWrite();
        Enum.access$800((Enum)this.instance);
        return this;
    }

    public Enum$Builder clearName() {
        this.copyOnWrite();
        Enum.access$200((Enum)this.instance);
        return this;
    }

    public Enum$Builder clearOptions() {
        this.copyOnWrite();
        Enum.access$1400((Enum)this.instance);
        return this;
    }

    public Enum$Builder clearSourceContext() {
        this.copyOnWrite();
        Enum.access$1800((Enum)this.instance);
        return this;
    }

    public Enum$Builder clearSyntax() {
        this.copyOnWrite();
        Enum.access$2100((Enum)this.instance);
        return this;
    }

    public String getEdition() {
        return ((Enum)this.instance).getEdition();
    }

    public ByteString getEditionBytes() {
        return ((Enum)this.instance).getEditionBytes();
    }

    public EnumValue getEnumvalue(int n3) {
        return ((Enum)this.instance).getEnumvalue(n3);
    }

    public int getEnumvalueCount() {
        return ((Enum)this.instance).getEnumvalueCount();
    }

    public List getEnumvalueList() {
        return Collections.unmodifiableList(((Enum)this.instance).getEnumvalueList());
    }

    public String getName() {
        return ((Enum)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((Enum)this.instance).getNameBytes();
    }

    public Option getOptions(int n3) {
        return ((Enum)this.instance).getOptions(n3);
    }

    public int getOptionsCount() {
        return ((Enum)this.instance).getOptionsCount();
    }

    public List getOptionsList() {
        return Collections.unmodifiableList(((Enum)this.instance).getOptionsList());
    }

    public SourceContext getSourceContext() {
        return ((Enum)this.instance).getSourceContext();
    }

    public Syntax getSyntax() {
        return ((Enum)this.instance).getSyntax();
    }

    public int getSyntaxValue() {
        return ((Enum)this.instance).getSyntaxValue();
    }

    public boolean hasSourceContext() {
        return ((Enum)this.instance).hasSourceContext();
    }

    public Enum$Builder mergeSourceContext(SourceContext sourceContext) {
        this.copyOnWrite();
        Enum.access$1700((Enum)this.instance, sourceContext);
        return this;
    }

    public Enum$Builder removeEnumvalue(int n3) {
        this.copyOnWrite();
        Enum.access$900((Enum)this.instance, n3);
        return this;
    }

    public Enum$Builder removeOptions(int n3) {
        this.copyOnWrite();
        Enum.access$1500((Enum)this.instance, n3);
        return this;
    }

    public Enum$Builder setEdition(String string2) {
        this.copyOnWrite();
        Enum.access$2200((Enum)this.instance, string2);
        return this;
    }

    public Enum$Builder setEditionBytes(ByteString byteString) {
        this.copyOnWrite();
        Enum.access$2400((Enum)this.instance, byteString);
        return this;
    }

    public Enum$Builder setEnumvalue(int n3, EnumValue$Builder enumValueOrBuilder) {
        this.copyOnWrite();
        Enum enum_ = (Enum)this.instance;
        enumValueOrBuilder = (EnumValue)enumValueOrBuilder.build();
        Enum.access$400(enum_, n3, (EnumValue)enumValueOrBuilder);
        return this;
    }

    public Enum$Builder setEnumvalue(int n3, EnumValue enumValue) {
        this.copyOnWrite();
        Enum.access$400((Enum)this.instance, n3, enumValue);
        return this;
    }

    public Enum$Builder setName(String string2) {
        this.copyOnWrite();
        Enum.access$100((Enum)this.instance, string2);
        return this;
    }

    public Enum$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        Enum.access$300((Enum)this.instance, byteString);
        return this;
    }

    public Enum$Builder setOptions(int n3, Option$Builder optionOrBuilder) {
        this.copyOnWrite();
        Enum enum_ = (Enum)this.instance;
        optionOrBuilder = (Option)optionOrBuilder.build();
        Enum.access$1000(enum_, n3, (Option)optionOrBuilder);
        return this;
    }

    public Enum$Builder setOptions(int n3, Option option) {
        this.copyOnWrite();
        Enum.access$1000((Enum)this.instance, n3, option);
        return this;
    }

    public Enum$Builder setSourceContext(SourceContext$Builder sourceContextOrBuilder) {
        this.copyOnWrite();
        Enum enum_ = (Enum)this.instance;
        sourceContextOrBuilder = (SourceContext)sourceContextOrBuilder.build();
        Enum.access$1600(enum_, (SourceContext)sourceContextOrBuilder);
        return this;
    }

    public Enum$Builder setSourceContext(SourceContext sourceContext) {
        this.copyOnWrite();
        Enum.access$1600((Enum)this.instance, sourceContext);
        return this;
    }

    public Enum$Builder setSyntax(Syntax syntax) {
        this.copyOnWrite();
        Enum.access$2000((Enum)this.instance, syntax);
        return this;
    }

    public Enum$Builder setSyntaxValue(int n3) {
        this.copyOnWrite();
        Enum.access$1900((Enum)this.instance, n3);
        return this;
    }
}

