/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Enum$1;
import com.google.protobuf.Enum$Builder;
import com.google.protobuf.EnumOrBuilder;
import com.google.protobuf.EnumValue;
import com.google.protobuf.EnumValueOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Option;
import com.google.protobuf.OptionOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.SourceContext;
import com.google.protobuf.SourceContext$Builder;
import com.google.protobuf.SourceContextOrBuilder;
import com.google.protobuf.Syntax;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Enum
extends GeneratedMessageLite
implements EnumOrBuilder {
    private static final Enum DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 6;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private int bitField0_;
    private String edition_;
    private Internal$ProtobufList enumvalue_;
    private String name_;
    private Internal$ProtobufList options_;
    private SourceContext sourceContext_;
    private int syntax_;

    static {
        Enum enum_;
        DEFAULT_INSTANCE = enum_ = new Enum();
        GeneratedMessageLite.registerDefaultInstance(Enum.class, enum_);
    }

    private Enum() {
        Internal$ProtobufList internal$ProtobufList;
        String string2;
        this.name_ = string2 = "";
        this.enumvalue_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.options_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.edition_ = string2;
    }

    public static /* synthetic */ Enum access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Enum enum_, String string2) {
        enum_.setName(string2);
    }

    public static /* synthetic */ void access$1000(Enum enum_, int n3, Option option) {
        enum_.setOptions(n3, option);
    }

    public static /* synthetic */ void access$1100(Enum enum_, Option option) {
        enum_.addOptions(option);
    }

    public static /* synthetic */ void access$1200(Enum enum_, int n3, Option option) {
        enum_.addOptions(n3, option);
    }

    public static /* synthetic */ void access$1300(Enum enum_, Iterable iterable) {
        enum_.addAllOptions(iterable);
    }

    public static /* synthetic */ void access$1400(Enum enum_) {
        enum_.clearOptions();
    }

    public static /* synthetic */ void access$1500(Enum enum_, int n3) {
        enum_.removeOptions(n3);
    }

    public static /* synthetic */ void access$1600(Enum enum_, SourceContext sourceContext) {
        enum_.setSourceContext(sourceContext);
    }

    public static /* synthetic */ void access$1700(Enum enum_, SourceContext sourceContext) {
        enum_.mergeSourceContext(sourceContext);
    }

    public static /* synthetic */ void access$1800(Enum enum_) {
        enum_.clearSourceContext();
    }

    public static /* synthetic */ void access$1900(Enum enum_, int n3) {
        enum_.setSyntaxValue(n3);
    }

    public static /* synthetic */ void access$200(Enum enum_) {
        enum_.clearName();
    }

    public static /* synthetic */ void access$2000(Enum enum_, Syntax syntax) {
        enum_.setSyntax(syntax);
    }

    public static /* synthetic */ void access$2100(Enum enum_) {
        enum_.clearSyntax();
    }

    public static /* synthetic */ void access$2200(Enum enum_, String string2) {
        enum_.setEdition(string2);
    }

    public static /* synthetic */ void access$2300(Enum enum_) {
        enum_.clearEdition();
    }

    public static /* synthetic */ void access$2400(Enum enum_, ByteString byteString) {
        enum_.setEditionBytes(byteString);
    }

    public static /* synthetic */ void access$300(Enum enum_, ByteString byteString) {
        enum_.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(Enum enum_, int n3, EnumValue enumValue) {
        enum_.setEnumvalue(n3, enumValue);
    }

    public static /* synthetic */ void access$500(Enum enum_, EnumValue enumValue) {
        enum_.addEnumvalue(enumValue);
    }

    public static /* synthetic */ void access$600(Enum enum_, int n3, EnumValue enumValue) {
        enum_.addEnumvalue(n3, enumValue);
    }

    public static /* synthetic */ void access$700(Enum enum_, Iterable iterable) {
        enum_.addAllEnumvalue(iterable);
    }

    public static /* synthetic */ void access$800(Enum enum_) {
        enum_.clearEnumvalue();
    }

    public static /* synthetic */ void access$900(Enum enum_, int n3) {
        enum_.removeEnumvalue(n3);
    }

    private void addAllEnumvalue(Iterable iterable) {
        this.ensureEnumvalueIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.enumvalue_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllOptions(Iterable iterable) {
        this.ensureOptionsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.options_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addEnumvalue(int n3, EnumValue enumValue) {
        enumValue.getClass();
        this.ensureEnumvalueIsMutable();
        this.enumvalue_.add(n3, enumValue);
    }

    private void addEnumvalue(EnumValue enumValue) {
        enumValue.getClass();
        this.ensureEnumvalueIsMutable();
        this.enumvalue_.add(enumValue);
    }

    private void addOptions(int n3, Option option) {
        option.getClass();
        this.ensureOptionsIsMutable();
        this.options_.add(n3, option);
    }

    private void addOptions(Option option) {
        option.getClass();
        this.ensureOptionsIsMutable();
        this.options_.add(option);
    }

    private void clearEdition() {
        String string2;
        this.edition_ = string2 = Enum.getDefaultInstance().getEdition();
    }

    private void clearEnumvalue() {
        Internal$ProtobufList internal$ProtobufList;
        this.enumvalue_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = Enum.getDefaultInstance().getName();
    }

    private void clearOptions() {
        Internal$ProtobufList internal$ProtobufList;
        this.options_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearSourceContext() {
        int n3;
        this.sourceContext_ = null;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
    }

    private void clearSyntax() {
        this.syntax_ = 0;
    }

    private void ensureEnumvalueIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.enumvalue_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.enumvalue_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureOptionsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.options_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.options_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Enum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeSourceContext(SourceContext sourceContext) {
        int n3;
        SourceContext sourceContext2;
        sourceContext.getClass();
        SourceContextOrBuilder sourceContextOrBuilder = this.sourceContext_;
        if (sourceContextOrBuilder != null && sourceContextOrBuilder != (sourceContext2 = SourceContext.getDefaultInstance())) {
            sourceContextOrBuilder = SourceContext.newBuilder(this.sourceContext_);
            this.sourceContext_ = sourceContext = (SourceContext)((SourceContext$Builder)((GeneratedMessageLite$Builder)((Object)sourceContextOrBuilder)).mergeFrom(sourceContext)).buildPartial();
        } else {
            this.sourceContext_ = sourceContext;
        }
        this.bitField0_ = n3 = this.bitField0_ | 1;
    }

    public static Enum$Builder newBuilder() {
        return (Enum$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Enum$Builder newBuilder(Enum enum_) {
        return (Enum$Builder)DEFAULT_INSTANCE.createBuilder(enum_);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream) {
        return (Enum)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Enum)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Enum parseFrom(ByteString byteString) {
        return (Enum)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Enum parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Enum)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Enum parseFrom(CodedInputStream codedInputStream) {
        return (Enum)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Enum parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Enum)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Enum parseFrom(InputStream inputStream) {
        return (Enum)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Enum parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Enum)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer) {
        return (Enum)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Enum)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Enum parseFrom(byte[] byArray) {
        return (Enum)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Enum parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Enum)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeEnumvalue(int n3) {
        this.ensureEnumvalueIsMutable();
        this.enumvalue_.remove(n3);
    }

    private void removeOptions(int n3) {
        this.ensureOptionsIsMutable();
        this.options_.remove(n3);
    }

    private void setEdition(String string2) {
        string2.getClass();
        this.edition_ = string2;
    }

    private void setEditionBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.edition_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setEnumvalue(int n3, EnumValue enumValue) {
        enumValue.getClass();
        this.ensureEnumvalueIsMutable();
        this.enumvalue_.set(n3, enumValue);
    }

    private void setName(String string2) {
        string2.getClass();
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.name_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setOptions(int n3, Option option) {
        option.getClass();
        this.ensureOptionsIsMutable();
        this.options_.set(n3, option);
    }

    private void setSourceContext(SourceContext sourceContext) {
        int n3;
        sourceContext.getClass();
        this.sourceContext_ = sourceContext;
        this.bitField0_ = n3 = this.bitField0_ | 1;
    }

    private void setSyntax(Syntax syntax) {
        int n3;
        this.syntax_ = n3 = syntax.getNumber();
    }

    private void setSyntaxValue(int n3) {
        this.syntax_ = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Enum$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Enum.class;
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
                objectArray = new Object[9];
                objectArray[0] = "bitField0_";
                objectArray[by2] = "name_";
                objectArray[2] = "enumvalue_";
                objectArray[3] = EnumValue.class;
                objectArray[4] = "options_";
                objectArray[5] = Option.class;
                objectArray[6] = "sourceContext_";
                objectArray[7] = "syntax_";
                objectArray[8] = "edition_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0208\u0002\u001b\u0003\u001b\u0004\u1009\u0000\u0005\f\u0006\u0208", objectArray);
            }
            case 2: {
                return new Enum$Builder(null);
            }
            case 1: 
        }
        return new Enum();
    }

    public String getEdition() {
        return this.edition_;
    }

    public ByteString getEditionBytes() {
        return ByteString.copyFromUtf8(this.edition_);
    }

    public EnumValue getEnumvalue(int n3) {
        return (EnumValue)this.enumvalue_.get(n3);
    }

    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    public List getEnumvalueList() {
        return this.enumvalue_;
    }

    public EnumValueOrBuilder getEnumvalueOrBuilder(int n3) {
        return (EnumValueOrBuilder)this.enumvalue_.get(n3);
    }

    public List getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public Option getOptions(int n3) {
        return (Option)this.options_.get(n3);
    }

    public int getOptionsCount() {
        return this.options_.size();
    }

    public List getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int n3) {
        return (OptionOrBuilder)this.options_.get(n3);
    }

    public List getOptionsOrBuilderList() {
        return this.options_;
    }

    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        if (sourceContext == null) {
            sourceContext = SourceContext.getDefaultInstance();
        }
        return sourceContext;
    }

    public Syntax getSyntax() {
        int n3 = this.syntax_;
        Syntax syntax = Syntax.forNumber(n3);
        if (syntax == null) {
            syntax = Syntax.UNRECOGNIZED;
        }
        return syntax;
    }

    public int getSyntaxValue() {
        return this.syntax_;
    }

    public boolean hasSourceContext() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }
}

