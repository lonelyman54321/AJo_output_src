/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.ListValue;
import com.google.protobuf.ListValue$Builder;
import com.google.protobuf.NullValue;
import com.google.protobuf.Parser;
import com.google.protobuf.Struct;
import com.google.protobuf.Struct$Builder;
import com.google.protobuf.Value$1;
import com.google.protobuf.Value$Builder;
import com.google.protobuf.Value$KindCase;
import com.google.protobuf.ValueOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Value
extends GeneratedMessageLite
implements ValueOrBuilder {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    static {
        Value value;
        DEFAULT_INSTANCE = value = new Value();
        GeneratedMessageLite.registerDefaultInstance(Value.class, value);
    }

    private Value() {
    }

    public static /* synthetic */ Value access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Value value) {
        value.clearKind();
    }

    public static /* synthetic */ void access$1000(Value value, boolean bl2) {
        value.setBoolValue(bl2);
    }

    public static /* synthetic */ void access$1100(Value value) {
        value.clearBoolValue();
    }

    public static /* synthetic */ void access$1200(Value value, Struct struct) {
        value.setStructValue(struct);
    }

    public static /* synthetic */ void access$1300(Value value, Struct struct) {
        value.mergeStructValue(struct);
    }

    public static /* synthetic */ void access$1400(Value value) {
        value.clearStructValue();
    }

    public static /* synthetic */ void access$1500(Value value, ListValue listValue) {
        value.setListValue(listValue);
    }

    public static /* synthetic */ void access$1600(Value value, ListValue listValue) {
        value.mergeListValue(listValue);
    }

    public static /* synthetic */ void access$1700(Value value) {
        value.clearListValue();
    }

    public static /* synthetic */ void access$200(Value value, int n3) {
        value.setNullValueValue(n3);
    }

    public static /* synthetic */ void access$300(Value value, NullValue nullValue) {
        value.setNullValue(nullValue);
    }

    public static /* synthetic */ void access$400(Value value) {
        value.clearNullValue();
    }

    public static /* synthetic */ void access$500(Value value, double d2) {
        value.setNumberValue(d2);
    }

    public static /* synthetic */ void access$600(Value value) {
        value.clearNumberValue();
    }

    public static /* synthetic */ void access$700(Value value, String string2) {
        value.setStringValue(string2);
    }

    public static /* synthetic */ void access$800(Value value) {
        value.clearStringValue();
    }

    public static /* synthetic */ void access$900(Value value, ByteString byteString) {
        value.setStringValueBytes(byteString);
    }

    private void clearBoolValue() {
        int n3 = this.kindCase_;
        int n4 = 4;
        if (n3 == n4) {
            this.kindCase_ = 0;
            n3 = 0;
            this.kind_ = null;
        }
    }

    private void clearKind() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    private void clearListValue() {
        int n3 = this.kindCase_;
        int n4 = 6;
        if (n3 == n4) {
            this.kindCase_ = 0;
            n3 = 0;
            this.kind_ = null;
        }
    }

    private void clearNullValue() {
        int n3 = this.kindCase_;
        int n4 = 1;
        if (n3 == n4) {
            this.kindCase_ = 0;
            n3 = 0;
            this.kind_ = null;
        }
    }

    private void clearNumberValue() {
        int n3 = this.kindCase_;
        int n4 = 2;
        if (n3 == n4) {
            this.kindCase_ = 0;
            n3 = 0;
            this.kind_ = null;
        }
    }

    private void clearStringValue() {
        int n3 = this.kindCase_;
        int n4 = 3;
        if (n3 == n4) {
            this.kindCase_ = 0;
            n3 = 0;
            this.kind_ = null;
        }
    }

    private void clearStructValue() {
        int n3 = this.kindCase_;
        int n4 = 5;
        if (n3 == n4) {
            this.kindCase_ = 0;
            n3 = 0;
            this.kind_ = null;
        }
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeListValue(ListValue generatedMessageLite) {
        ListValue listValue;
        Object object;
        generatedMessageLite.getClass();
        int n3 = this.kindCase_;
        int n4 = 6;
        if (n3 == n4 && (object = this.kind_) != (listValue = ListValue.getDefaultInstance())) {
            object = ListValue.newBuilder((ListValue)this.kind_);
            generatedMessageLite = ((ListValue$Builder)((GeneratedMessageLite$Builder)object).mergeFrom(generatedMessageLite)).buildPartial();
            this.kind_ = generatedMessageLite;
        } else {
            this.kind_ = generatedMessageLite;
        }
        this.kindCase_ = n4;
    }

    private void mergeStructValue(Struct generatedMessageLite) {
        Struct struct;
        Object object;
        generatedMessageLite.getClass();
        int n3 = this.kindCase_;
        int n4 = 5;
        if (n3 == n4 && (object = this.kind_) != (struct = Struct.getDefaultInstance())) {
            object = Struct.newBuilder((Struct)this.kind_);
            generatedMessageLite = ((Struct$Builder)((GeneratedMessageLite$Builder)object).mergeFrom(generatedMessageLite)).buildPartial();
            this.kind_ = generatedMessageLite;
        } else {
            this.kind_ = generatedMessageLite;
        }
        this.kindCase_ = n4;
    }

    public static Value$Builder newBuilder() {
        return (Value$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Value$Builder newBuilder(Value value) {
        return (Value$Builder)DEFAULT_INSTANCE.createBuilder(value);
    }

    public static Value parseDelimitedFrom(InputStream inputStream) {
        return (Value)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Value)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Value parseFrom(ByteString byteString) {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Value parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Value parseFrom(CodedInputStream codedInputStream) {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Value parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Value parseFrom(InputStream inputStream) {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Value parseFrom(ByteBuffer byteBuffer) {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Value parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Value parseFrom(byte[] byArray) {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Value parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBoolValue(boolean bl2) {
        this.kindCase_ = 4;
        Boolean bl3 = bl2;
        this.kind_ = bl3;
    }

    private void setListValue(ListValue listValue) {
        listValue.getClass();
        this.kind_ = listValue;
        this.kindCase_ = 6;
    }

    private void setNullValue(NullValue object) {
        this.kind_ = object = Integer.valueOf(((NullValue)object).getNumber());
        this.kindCase_ = 1;
    }

    private void setNullValueValue(int n3) {
        this.kindCase_ = 1;
        Integer n4 = n3;
        this.kind_ = n4;
    }

    private void setNumberValue(double d2) {
        this.kindCase_ = 2;
        Double d5 = d2;
        this.kind_ = d5;
    }

    private void setStringValue(String string2) {
        string2.getClass();
        this.kindCase_ = 3;
        this.kind_ = string2;
    }

    private void setStringValueBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.kind_ = object = ((ByteString)object).toStringUtf8();
        this.kindCase_ = 3;
    }

    private void setStructValue(Struct struct) {
        struct.getClass();
        this.kind_ = struct;
        this.kindCase_ = 5;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Value$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Value.class;
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
                objectArray = new Object[4];
                objectArray[0] = "kind_";
                objectArray[by2] = "kindCase_";
                objectArray[2] = Struct.class;
                objectArray[3] = ListValue.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003\u023b\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", objectArray);
            }
            case 2: {
                return new Value$Builder(null);
            }
            case 1: 
        }
        return new Value();
    }

    public boolean getBoolValue() {
        int n3 = this.kindCase_;
        int n4 = 4;
        if (n3 == n4) {
            return (Boolean)this.kind_;
        }
        return false;
    }

    public Value$KindCase getKindCase() {
        return Value$KindCase.forNumber(this.kindCase_);
    }

    public ListValue getListValue() {
        int n3 = this.kindCase_;
        int n4 = 6;
        if (n3 == n4) {
            return (ListValue)this.kind_;
        }
        return ListValue.getDefaultInstance();
    }

    public NullValue getNullValue() {
        int n3 = this.kindCase_;
        int n4 = 1;
        if (n3 == n4) {
            n3 = (Integer)this.kind_;
            NullValue nullValue = NullValue.forNumber(n3);
            if (nullValue == null) {
                nullValue = NullValue.UNRECOGNIZED;
            }
            return nullValue;
        }
        return NullValue.NULL_VALUE;
    }

    public int getNullValueValue() {
        int n3 = this.kindCase_;
        int n4 = 1;
        if (n3 == n4) {
            return (Integer)this.kind_;
        }
        return 0;
    }

    public double getNumberValue() {
        int n3 = this.kindCase_;
        int n4 = 2;
        if (n3 == n4) {
            return (Double)this.kind_;
        }
        return 0.0;
    }

    public String getStringValue() {
        int n3 = this.kindCase_;
        int n4 = 3;
        String string2 = n3 == n4 ? (String)this.kind_ : "";
        return string2;
    }

    public ByteString getStringValueBytes() {
        int n3 = this.kindCase_;
        int n4 = 3;
        String string2 = n3 == n4 ? (String)this.kind_ : "";
        return ByteString.copyFromUtf8(string2);
    }

    public Struct getStructValue() {
        int n3 = this.kindCase_;
        int n4 = 5;
        if (n3 == n4) {
            return (Struct)this.kind_;
        }
        return Struct.getDefaultInstance();
    }

    public boolean hasBoolValue() {
        int n3 = this.kindCase_;
        int n4 = 4;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasListValue() {
        int n3 = this.kindCase_;
        int n4 = 6;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasNullValue() {
        int n3 = this.kindCase_;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean hasNumberValue() {
        int n3 = this.kindCase_;
        int n4 = 2;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasStringValue() {
        int n3 = this.kindCase_;
        int n4 = 3;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasStructValue() {
        int n3 = this.kindCase_;
        int n4 = 5;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }
}

