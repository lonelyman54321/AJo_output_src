/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Struct$1;
import com.google.protobuf.Struct$Builder;
import com.google.protobuf.Struct$FieldsDefaultEntryHolder;
import com.google.protobuf.StructOrBuilder;
import com.google.protobuf.Value;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;

public final class Struct
extends GeneratedMessageLite
implements StructOrBuilder {
    private static final Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private MapFieldLite fields_;

    static {
        Struct struct;
        DEFAULT_INSTANCE = struct = new Struct();
        GeneratedMessageLite.registerDefaultInstance(Struct.class, struct);
    }

    private Struct() {
        MapFieldLite mapFieldLite;
        this.fields_ = mapFieldLite = MapFieldLite.emptyMapField();
    }

    public static /* synthetic */ Struct access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ Map access$100(Struct struct) {
        return struct.getMutableFieldsMap();
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map getMutableFieldsMap() {
        return this.internalGetMutableFields();
    }

    private MapFieldLite internalGetFields() {
        return this.fields_;
    }

    private MapFieldLite internalGetMutableFields() {
        MapFieldLite mapFieldLite = this.fields_;
        boolean bl2 = mapFieldLite.isMutable();
        if (!bl2) {
            this.fields_ = mapFieldLite = this.fields_.mutableCopy();
        }
        return this.fields_;
    }

    public static Struct$Builder newBuilder() {
        return (Struct$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Struct$Builder newBuilder(Struct struct) {
        return (Struct$Builder)DEFAULT_INSTANCE.createBuilder(struct);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) {
        return (Struct)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Struct)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Struct parseFrom(ByteString byteString) {
        return (Struct)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Struct parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Struct)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Struct parseFrom(CodedInputStream codedInputStream) {
        return (Struct)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Struct parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Struct)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Struct parseFrom(InputStream inputStream) {
        return (Struct)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Struct)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) {
        return (Struct)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Struct)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Struct parseFrom(byte[] byArray) {
        return (Struct)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Struct parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Struct)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean containsFields(String string2) {
        string2.getClass();
        return ((AbstractMap)this.internalGetFields()).containsKey(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Struct$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Struct.class;
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
                objectArray = new Object[2];
                objectArray[0] = "fields_";
                objectArray[by2] = object = Struct$FieldsDefaultEntryHolder.defaultEntry;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", objectArray);
            }
            case 2: {
                return new Struct$Builder(null);
            }
            case 1: 
        }
        return new Struct();
    }

    public Map getFields() {
        return this.getFieldsMap();
    }

    public int getFieldsCount() {
        return ((AbstractMap)this.internalGetFields()).size();
    }

    public Map getFieldsMap() {
        return Collections.unmodifiableMap(this.internalGetFields());
    }

    public Value getFieldsOrDefault(String string2, Value object) {
        string2.getClass();
        MapFieldLite mapFieldLite = this.internalGetFields();
        boolean bl2 = mapFieldLite.containsKey(string2);
        if (bl2) {
            string2 = mapFieldLite.get(string2);
            object = string2;
            object = (Value)((Object)string2);
        }
        return object;
    }

    public Value getFieldsOrThrow(String object) {
        object.getClass();
        MapFieldLite mapFieldLite = this.internalGetFields();
        boolean bl2 = mapFieldLite.containsKey(object);
        if (bl2) {
            return (Value)mapFieldLite.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }
}

