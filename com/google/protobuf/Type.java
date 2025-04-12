/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Field;
import com.google.protobuf.FieldOrBuilder;
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
import com.google.protobuf.Type$1;
import com.google.protobuf.Type$Builder;
import com.google.protobuf.TypeOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Type
extends GeneratedMessageLite
implements TypeOrBuilder {
    private static final Type DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 7;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile Parser PARSER;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private int bitField0_;
    private String edition_;
    private Internal$ProtobufList fields_;
    private String name_;
    private Internal$ProtobufList oneofs_;
    private Internal$ProtobufList options_;
    private SourceContext sourceContext_;
    private int syntax_;

    static {
        Type type2;
        DEFAULT_INSTANCE = type2 = new Type();
        GeneratedMessageLite.registerDefaultInstance(Type.class, type2);
    }

    private Type() {
        Internal$ProtobufList internal$ProtobufList;
        String string2;
        this.name_ = string2 = "";
        this.fields_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.oneofs_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.options_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.edition_ = string2;
    }

    public static /* synthetic */ Type access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Type type2, String string2) {
        type2.setName(string2);
    }

    public static /* synthetic */ void access$1000(Type type2, int n3, String string2) {
        type2.setOneofs(n3, string2);
    }

    public static /* synthetic */ void access$1100(Type type2, String string2) {
        type2.addOneofs(string2);
    }

    public static /* synthetic */ void access$1200(Type type2, Iterable iterable) {
        type2.addAllOneofs(iterable);
    }

    public static /* synthetic */ void access$1300(Type type2) {
        type2.clearOneofs();
    }

    public static /* synthetic */ void access$1400(Type type2, ByteString byteString) {
        type2.addOneofsBytes(byteString);
    }

    public static /* synthetic */ void access$1500(Type type2, int n3, Option option) {
        type2.setOptions(n3, option);
    }

    public static /* synthetic */ void access$1600(Type type2, Option option) {
        type2.addOptions(option);
    }

    public static /* synthetic */ void access$1700(Type type2, int n3, Option option) {
        type2.addOptions(n3, option);
    }

    public static /* synthetic */ void access$1800(Type type2, Iterable iterable) {
        type2.addAllOptions(iterable);
    }

    public static /* synthetic */ void access$1900(Type type2) {
        type2.clearOptions();
    }

    public static /* synthetic */ void access$200(Type type2) {
        type2.clearName();
    }

    public static /* synthetic */ void access$2000(Type type2, int n3) {
        type2.removeOptions(n3);
    }

    public static /* synthetic */ void access$2100(Type type2, SourceContext sourceContext) {
        type2.setSourceContext(sourceContext);
    }

    public static /* synthetic */ void access$2200(Type type2, SourceContext sourceContext) {
        type2.mergeSourceContext(sourceContext);
    }

    public static /* synthetic */ void access$2300(Type type2) {
        type2.clearSourceContext();
    }

    public static /* synthetic */ void access$2400(Type type2, int n3) {
        type2.setSyntaxValue(n3);
    }

    public static /* synthetic */ void access$2500(Type type2, Syntax syntax) {
        type2.setSyntax(syntax);
    }

    public static /* synthetic */ void access$2600(Type type2) {
        type2.clearSyntax();
    }

    public static /* synthetic */ void access$2700(Type type2, String string2) {
        type2.setEdition(string2);
    }

    public static /* synthetic */ void access$2800(Type type2) {
        type2.clearEdition();
    }

    public static /* synthetic */ void access$2900(Type type2, ByteString byteString) {
        type2.setEditionBytes(byteString);
    }

    public static /* synthetic */ void access$300(Type type2, ByteString byteString) {
        type2.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(Type type2, int n3, Field field) {
        type2.setFields(n3, field);
    }

    public static /* synthetic */ void access$500(Type type2, Field field) {
        type2.addFields(field);
    }

    public static /* synthetic */ void access$600(Type type2, int n3, Field field) {
        type2.addFields(n3, field);
    }

    public static /* synthetic */ void access$700(Type type2, Iterable iterable) {
        type2.addAllFields(iterable);
    }

    public static /* synthetic */ void access$800(Type type2) {
        type2.clearFields();
    }

    public static /* synthetic */ void access$900(Type type2, int n3) {
        type2.removeFields(n3);
    }

    private void addAllFields(Iterable iterable) {
        this.ensureFieldsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.fields_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllOneofs(Iterable iterable) {
        this.ensureOneofsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.oneofs_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllOptions(Iterable iterable) {
        this.ensureOptionsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.options_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addFields(int n3, Field field) {
        field.getClass();
        this.ensureFieldsIsMutable();
        this.fields_.add(n3, field);
    }

    private void addFields(Field field) {
        field.getClass();
        this.ensureFieldsIsMutable();
        this.fields_.add(field);
    }

    private void addOneofs(String string2) {
        string2.getClass();
        this.ensureOneofsIsMutable();
        this.oneofs_.add(string2);
    }

    private void addOneofsBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.ensureOneofsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.oneofs_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
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
        this.edition_ = string2 = Type.getDefaultInstance().getEdition();
    }

    private void clearFields() {
        Internal$ProtobufList internal$ProtobufList;
        this.fields_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = Type.getDefaultInstance().getName();
    }

    private void clearOneofs() {
        Internal$ProtobufList internal$ProtobufList;
        this.oneofs_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
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

    private void ensureFieldsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.fields_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.fields_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureOneofsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.oneofs_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.oneofs_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureOptionsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.options_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.options_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Type getDefaultInstance() {
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

    public static Type$Builder newBuilder() {
        return (Type$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Type$Builder newBuilder(Type type2) {
        return (Type$Builder)DEFAULT_INSTANCE.createBuilder(type2);
    }

    public static Type parseDelimitedFrom(InputStream inputStream) {
        return (Type)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Type)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Type parseFrom(ByteString byteString) {
        return (Type)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Type parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Type)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Type parseFrom(CodedInputStream codedInputStream) {
        return (Type)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Type parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Type)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Type parseFrom(InputStream inputStream) {
        return (Type)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Type)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Type parseFrom(ByteBuffer byteBuffer) {
        return (Type)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Type parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Type)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Type parseFrom(byte[] byArray) {
        return (Type)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Type parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Type)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeFields(int n3) {
        this.ensureFieldsIsMutable();
        this.fields_.remove(n3);
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

    private void setFields(int n3, Field field) {
        field.getClass();
        this.ensureFieldsIsMutable();
        this.fields_.set(n3, field);
    }

    private void setName(String string2) {
        string2.getClass();
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.name_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setOneofs(int n3, String string2) {
        string2.getClass();
        this.ensureOneofsIsMutable();
        this.oneofs_.set(n3, string2);
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
        object = Type$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Type.class;
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
                objectArray = new Object[10];
                objectArray[0] = "bitField0_";
                objectArray[by2] = "name_";
                objectArray[2] = "fields_";
                objectArray[3] = Field.class;
                objectArray[4] = "oneofs_";
                objectArray[5] = "options_";
                objectArray[6] = Option.class;
                objectArray[7] = "sourceContext_";
                objectArray[8] = "syntax_";
                objectArray[9] = "edition_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001\u0208\u0002\u001b\u0003\u021a\u0004\u001b\u0005\u1009\u0000\u0006\f\u0007\u0208", objectArray);
            }
            case 2: {
                return new Type$Builder(null);
            }
            case 1: 
        }
        return new Type();
    }

    public String getEdition() {
        return this.edition_;
    }

    public ByteString getEditionBytes() {
        return ByteString.copyFromUtf8(this.edition_);
    }

    public Field getFields(int n3) {
        return (Field)this.fields_.get(n3);
    }

    public int getFieldsCount() {
        return this.fields_.size();
    }

    public List getFieldsList() {
        return this.fields_;
    }

    public FieldOrBuilder getFieldsOrBuilder(int n3) {
        return (FieldOrBuilder)this.fields_.get(n3);
    }

    public List getFieldsOrBuilderList() {
        return this.fields_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public String getOneofs(int n3) {
        return (String)this.oneofs_.get(n3);
    }

    public ByteString getOneofsBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.oneofs_.get(n3));
    }

    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    public List getOneofsList() {
        return this.oneofs_;
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

