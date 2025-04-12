/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ExtensionSchema;
import com.google.protobuf.ExtensionSchemaLite$1;
import com.google.protobuf.FieldSet;
import com.google.protobuf.FieldSet$FieldDescriptorLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor;
import com.google.protobuf.GeneratedMessageLite$GeneratedExtension;
import com.google.protobuf.Internal;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.Protobuf;
import com.google.protobuf.Reader;
import com.google.protobuf.Schema;
import com.google.protobuf.SchemaUtil;
import com.google.protobuf.UnknownFieldSchema;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class ExtensionSchemaLite
extends ExtensionSchema {
    public int extensionNumber(Map.Entry entry) {
        return ((GeneratedMessageLite$ExtensionDescriptor)entry.getKey()).getNumber();
    }

    public Object findExtensionByNumber(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int n3) {
        return extensionRegistryLite.findLiteExtensionByNumber(messageLite, n3);
    }

    public FieldSet getExtensions(Object object) {
        return ((GeneratedMessageLite$ExtendableMessage)object).extensions;
    }

    public FieldSet getMutableExtensions(Object object) {
        return ((GeneratedMessageLite$ExtendableMessage)object).ensureExtensionsAreMutable();
    }

    public boolean hasExtensions(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite$ExtendableMessage;
    }

    public void makeImmutable(Object object) {
        this.getExtensions(object).makeImmutable();
    }

    public Object parseExtension(Object object, Reader object2, Object object3, ExtensionRegistryLite object4, FieldSet fieldSet, Object object5, UnknownFieldSchema object6) {
        object3 = (GeneratedMessageLite$GeneratedExtension)object3;
        int n3 = ((GeneratedMessageLite$GeneratedExtension)object3).getNumber();
        Object object7 = ((GeneratedMessageLite$GeneratedExtension)object3).descriptor;
        int n4 = object7.isRepeated();
        if (n4 != 0 && (n4 = (object7 = ((GeneratedMessageLite$GeneratedExtension)object3).descriptor).isPacked()) != 0) {
            object4 = ExtensionSchemaLite$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType;
            object7 = ((GeneratedMessageLite$GeneratedExtension)object3).getLiteType();
            n4 = ((Enum)object7).ordinal();
            Object object8 = object4[n4];
            switch (object8) {
                default: {
                    object2 = new StringBuilder("Type cannot be packed: ");
                    object3 = ((GeneratedMessageLite$GeneratedExtension)object3).descriptor.getLiteType();
                    ((StringBuilder)object2).append(object3);
                    object2 = ((StringBuilder)object2).toString();
                    object = new IllegalStateException((String)object2);
                    throw object;
                }
                case 14: {
                    object4 = new ArrayList();
                    object2.readEnumList((List)object4);
                    object2 = ((GeneratedMessageLite$GeneratedExtension)object3).descriptor;
                    Internal$EnumLiteMap internal$EnumLiteMap = ((GeneratedMessageLite$ExtensionDescriptor)object2).getEnumType();
                    object7 = object;
                    Object object9 = object4;
                    object5 = SchemaUtil.filterUnknownEnumList(object, n3, (List)object4, internal$EnumLiteMap, object5, (UnknownFieldSchema)object6);
                    break;
                }
                case 13: {
                    object4 = new ArrayList();
                    object2.readSInt64List((List)object4);
                    break;
                }
                case 12: {
                    object4 = new ArrayList();
                    object2.readSInt32List((List)object4);
                    break;
                }
                case 11: {
                    object4 = new ArrayList();
                    object2.readSFixed64List((List)object4);
                    break;
                }
                case 10: {
                    object4 = new ArrayList();
                    object2.readSFixed32List((List)object4);
                    break;
                }
                case 9: {
                    object4 = new ArrayList();
                    object2.readUInt32List((List)object4);
                    break;
                }
                case 8: {
                    object4 = new ArrayList();
                    object2.readBoolList((List)object4);
                    break;
                }
                case 7: {
                    object4 = new ArrayList();
                    object2.readFixed32List((List)object4);
                    break;
                }
                case 6: {
                    object4 = new ArrayList();
                    object2.readFixed64List((List)object4);
                    break;
                }
                case 5: {
                    object4 = new ArrayList();
                    object2.readInt32List((List)object4);
                    break;
                }
                case 4: {
                    object4 = new ArrayList();
                    object2.readUInt64List((List)object4);
                    break;
                }
                case 3: {
                    object4 = new ArrayList();
                    object2.readInt64List((List)object4);
                    break;
                }
                case 2: {
                    object4 = new ArrayList();
                    object2.readFloatList((List)object4);
                    break;
                }
                case 1: {
                    object4 = new ArrayList();
                    object2.readDoubleList((List)object4);
                }
            }
            object = ((GeneratedMessageLite$GeneratedExtension)object3).descriptor;
            fieldSet.setField((FieldSet$FieldDescriptorLite)object, object4);
        } else {
            Object object10;
            WireFormat$FieldType wireFormat$FieldType;
            object7 = ((GeneratedMessageLite$GeneratedExtension)object3).getLiteType();
            if (object7 == (wireFormat$FieldType = WireFormat$FieldType.ENUM)) {
                object10 = object2.readInt32();
                object4 = ((GeneratedMessageLite$GeneratedExtension)object3).descriptor.getEnumType().findValueByNumber((int)object10);
                if (object4 == null) {
                    return SchemaUtil.storeUnknownEnum(object, n3, object10, object5, (UnknownFieldSchema)object6);
                }
                object = object10;
            } else {
                object = ExtensionSchemaLite$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType;
                object6 = ((GeneratedMessageLite$GeneratedExtension)object3).getLiteType();
                int n7 = ((Enum)object6).ordinal();
                Object object11 = object[n7];
                switch (object11) {
                    default: {
                        object11 = false;
                        float f5 = 0.0f;
                        object = null;
                        break;
                    }
                    case 18: {
                        object11 = ((GeneratedMessageLite$GeneratedExtension)object3).isRepeated();
                        if (object11 == false) {
                            object = ((GeneratedMessageLite$GeneratedExtension)object3).descriptor;
                            n7 = (object = fieldSet.getField((FieldSet$FieldDescriptorLite)object)) instanceof GeneratedMessageLite;
                            if (n7 != 0) {
                                object6 = Protobuf.getInstance().schemaFor(object);
                                object7 = object;
                                object7 = (GeneratedMessageLite)object;
                                n4 = (int)(((GeneratedMessageLite)object7).isMutable() ? 1 : 0);
                                if (n4 == 0) {
                                    object7 = object6.newInstance();
                                    object6.mergeFrom(object7, object);
                                    object = ((GeneratedMessageLite$GeneratedExtension)object3).descriptor;
                                    fieldSet.setField((FieldSet$FieldDescriptorLite)object, object7);
                                    object = object7;
                                }
                                object2.mergeMessageField(object, (Schema)object6, (ExtensionRegistryLite)object4);
                                return object5;
                            }
                        }
                        object = ((GeneratedMessageLite$GeneratedExtension)object3).getMessageDefaultInstance().getClass();
                        object = object2.readMessage((Class)object, (ExtensionRegistryLite)object4);
                        break;
                    }
                    case 17: {
                        object11 = ((GeneratedMessageLite$GeneratedExtension)object3).isRepeated();
                        if (object11 == false) {
                            object = ((GeneratedMessageLite$GeneratedExtension)object3).descriptor;
                            n7 = (object = fieldSet.getField((FieldSet$FieldDescriptorLite)object)) instanceof GeneratedMessageLite;
                            if (n7 != 0) {
                                object6 = Protobuf.getInstance().schemaFor(object);
                                object7 = object;
                                object7 = (GeneratedMessageLite)object;
                                n4 = (int)(((GeneratedMessageLite)object7).isMutable() ? 1 : 0);
                                if (n4 == 0) {
                                    object7 = object6.newInstance();
                                    object6.mergeFrom(object7, object);
                                    object = ((GeneratedMessageLite$GeneratedExtension)object3).descriptor;
                                    fieldSet.setField((FieldSet$FieldDescriptorLite)object, object7);
                                    object = object7;
                                }
                                object2.mergeGroupField(object, (Schema)object6, (ExtensionRegistryLite)object4);
                                return object5;
                            }
                        }
                        object = ((GeneratedMessageLite$GeneratedExtension)object3).getMessageDefaultInstance().getClass();
                        object = object2.readGroup((Class)object, (ExtensionRegistryLite)object4);
                        break;
                    }
                    case 16: {
                        object = object2.readString();
                        break;
                    }
                    case 15: {
                        object = object2.readBytes();
                        break;
                    }
                    case 14: {
                        object = new IllegalStateException("Shouldn't reach here.");
                        throw object;
                    }
                    case 13: {
                        long l2 = object2.readSInt64();
                        object = l2;
                        break;
                    }
                    case 12: {
                        object11 = object2.readSInt32();
                        object = (int)object11;
                        break;
                    }
                    case 11: {
                        long l3 = object2.readSFixed64();
                        object = l3;
                        break;
                    }
                    case 10: {
                        object11 = object2.readSFixed32();
                        object = (int)object11;
                        break;
                    }
                    case 9: {
                        object11 = object2.readUInt32();
                        object = (int)object11;
                        break;
                    }
                    case 8: {
                        object11 = object2.readBool();
                        object = (boolean)object11;
                        break;
                    }
                    case 7: {
                        object11 = object2.readFixed32();
                        object = (int)object11;
                        break;
                    }
                    case 6: {
                        long l4 = object2.readFixed64();
                        object = l4;
                        break;
                    }
                    case 5: {
                        object11 = object2.readInt32();
                        object = (int)object11;
                        break;
                    }
                    case 4: {
                        long l7 = object2.readUInt64();
                        object = l7;
                        break;
                    }
                    case 3: {
                        long l8 = object2.readInt64();
                        object = l8;
                        break;
                    }
                    case 2: {
                        float f6 = object2.readFloat();
                        object = Float.valueOf(f6);
                        break;
                    }
                    case 1: {
                        double d2 = object2.readDouble();
                        object = d2;
                    }
                }
            }
            object10 = ((GeneratedMessageLite$GeneratedExtension)object3).isRepeated();
            if (object10 != 0) {
                object2 = ((GeneratedMessageLite$GeneratedExtension)object3).descriptor;
                fieldSet.addRepeatedField((FieldSet$FieldDescriptorLite)object2, object);
            } else {
                object2 = ExtensionSchemaLite$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType;
                object4 = ((GeneratedMessageLite$GeneratedExtension)object3).getLiteType();
                int n8 = ((Enum)object4).ordinal();
                object10 = object2[n8];
                if (object10 == (n8 = 17) || object10 == (n8 = 18)) {
                    object2 = ((GeneratedMessageLite$GeneratedExtension)object3).descriptor;
                    if ((object2 = fieldSet.getField((FieldSet$FieldDescriptorLite)object2)) != null) {
                        object = Internal.mergeMessage(object2, object);
                    }
                }
                object2 = ((GeneratedMessageLite$GeneratedExtension)object3).descriptor;
                fieldSet.setField((FieldSet$FieldDescriptorLite)object2, object);
            }
        }
        return object5;
    }

    public void parseLengthPrefixedMessageSetItem(Reader object, Object object2, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        object2 = (GeneratedMessageLite$GeneratedExtension)object2;
        Class<?> clazz = ((GeneratedMessageLite$GeneratedExtension)object2).getMessageDefaultInstance().getClass();
        object = object.readMessage(clazz, extensionRegistryLite);
        object2 = ((GeneratedMessageLite$GeneratedExtension)object2).descriptor;
        fieldSet.setField((FieldSet$FieldDescriptorLite)object2, object);
    }

    public void parseMessageSetItem(ByteString object, Object object2, ExtensionRegistryLite object3, FieldSet fieldSet) {
        object2 = (GeneratedMessageLite$GeneratedExtension)object2;
        MessageLite$Builder messageLite$Builder = ((GeneratedMessageLite$GeneratedExtension)object2).getMessageDefaultInstance().newBuilderForType();
        object = ((ByteString)object).newCodedInput();
        messageLite$Builder.mergeFrom((CodedInputStream)object, (ExtensionRegistryLite)object3);
        object2 = ((GeneratedMessageLite$GeneratedExtension)object2).descriptor;
        object3 = messageLite$Builder.buildPartial();
        fieldSet.setField((FieldSet$FieldDescriptorLite)object2, object3);
        ((CodedInputStream)object).checkLastTagWas(0);
    }

    public void serializeExtension(Writer writer, Map.Entry object) {
        block43: {
            int n3;
            GeneratedMessageLite$ExtensionDescriptor generatedMessageLite$ExtensionDescriptor;
            block42: {
                generatedMessageLite$ExtensionDescriptor = (GeneratedMessageLite$ExtensionDescriptor)object.getKey();
                n3 = generatedMessageLite$ExtensionDescriptor.isRepeated();
                if (n3 == 0) break block42;
                Object object2 = ExtensionSchemaLite$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType;
                int n4 = generatedMessageLite$ExtensionDescriptor.getLiteType().ordinal();
                n3 = object2[n4];
                n4 = 0;
                Object var7_9 = null;
                switch (n3) {
                    default: {
                        break;
                    }
                    case 18: {
                        boolean bl2;
                        object2 = (List)object.getValue();
                        if (object2 != null && !(bl2 = object2.isEmpty())) {
                            int n7 = generatedMessageLite$ExtensionDescriptor.getNumber();
                            object = (List)object.getValue();
                            Protobuf protobuf = Protobuf.getInstance();
                            object2 = object2.get(0).getClass();
                            object2 = protobuf.schemaFor((Class)object2);
                            SchemaUtil.writeMessageList(n7, (List)object, writer, (Schema)object2);
                            break;
                        }
                        break block43;
                    }
                    case 17: {
                        boolean bl3;
                        object2 = (List)object.getValue();
                        if (object2 != null && !(bl3 = object2.isEmpty())) {
                            int n8 = generatedMessageLite$ExtensionDescriptor.getNumber();
                            object = (List)object.getValue();
                            Protobuf protobuf = Protobuf.getInstance();
                            object2 = object2.get(0).getClass();
                            object2 = protobuf.schemaFor((Class)object2);
                            SchemaUtil.writeGroupList(n8, (List)object, writer, (Schema)object2);
                            break;
                        }
                        break block43;
                    }
                    case 16: {
                        int n10 = generatedMessageLite$ExtensionDescriptor.getNumber();
                        object = (List)object.getValue();
                        SchemaUtil.writeStringList(n10, object, writer);
                        break;
                    }
                    case 15: {
                        int n14 = generatedMessageLite$ExtensionDescriptor.getNumber();
                        object = (List)object.getValue();
                        SchemaUtil.writeBytesList(n14, object, writer);
                        break;
                    }
                    case 14: {
                        n3 = generatedMessageLite$ExtensionDescriptor.getNumber();
                        object = (List)object.getValue();
                        boolean bl4 = generatedMessageLite$ExtensionDescriptor.isPacked();
                        SchemaUtil.writeInt32List(n3, object, writer, bl4);
                        break;
                    }
                    case 13: {
                        n3 = generatedMessageLite$ExtensionDescriptor.getNumber();
                        object = (List)object.getValue();
                        boolean bl5 = generatedMessageLite$ExtensionDescriptor.isPacked();
                        SchemaUtil.writeSInt64List(n3, object, writer, bl5);
                        break;
                    }
                    case 12: {
                        n3 = generatedMessageLite$ExtensionDescriptor.getNumber();
                        object = (List)object.getValue();
                        boolean bl6 = generatedMessageLite$ExtensionDescriptor.isPacked();
                        SchemaUtil.writeSInt32List(n3, object, writer, bl6);
                        break;
                    }
                    case 11: {
                        n3 = generatedMessageLite$ExtensionDescriptor.getNumber();
                        object = (List)object.getValue();
                        boolean bl7 = generatedMessageLite$ExtensionDescriptor.isPacked();
                        SchemaUtil.writeSFixed64List(n3, object, writer, bl7);
                        break;
                    }
                    case 10: {
                        n3 = generatedMessageLite$ExtensionDescriptor.getNumber();
                        object = (List)object.getValue();
                        boolean bl8 = generatedMessageLite$ExtensionDescriptor.isPacked();
                        SchemaUtil.writeSFixed32List(n3, object, writer, bl8);
                        break;
                    }
                    case 9: {
                        n3 = generatedMessageLite$ExtensionDescriptor.getNumber();
                        object = (List)object.getValue();
                        boolean bl9 = generatedMessageLite$ExtensionDescriptor.isPacked();
                        SchemaUtil.writeUInt32List(n3, object, writer, bl9);
                        break;
                    }
                    case 8: {
                        n3 = generatedMessageLite$ExtensionDescriptor.getNumber();
                        object = (List)object.getValue();
                        boolean bl10 = generatedMessageLite$ExtensionDescriptor.isPacked();
                        SchemaUtil.writeBoolList(n3, object, writer, bl10);
                        break;
                    }
                    case 7: {
                        n3 = generatedMessageLite$ExtensionDescriptor.getNumber();
                        object = (List)object.getValue();
                        boolean bl11 = generatedMessageLite$ExtensionDescriptor.isPacked();
                        SchemaUtil.writeFixed32List(n3, object, writer, bl11);
                        break;
                    }
                    case 6: {
                        n3 = generatedMessageLite$ExtensionDescriptor.getNumber();
                        object = (List)object.getValue();
                        boolean bl12 = generatedMessageLite$ExtensionDescriptor.isPacked();
                        SchemaUtil.writeFixed64List(n3, object, writer, bl12);
                        break;
                    }
                    case 5: {
                        n3 = generatedMessageLite$ExtensionDescriptor.getNumber();
                        object = (List)object.getValue();
                        boolean bl13 = generatedMessageLite$ExtensionDescriptor.isPacked();
                        SchemaUtil.writeInt32List(n3, object, writer, bl13);
                        break;
                    }
                    case 4: {
                        n3 = generatedMessageLite$ExtensionDescriptor.getNumber();
                        object = (List)object.getValue();
                        boolean bl14 = generatedMessageLite$ExtensionDescriptor.isPacked();
                        SchemaUtil.writeUInt64List(n3, object, writer, bl14);
                        break;
                    }
                    case 3: {
                        n3 = generatedMessageLite$ExtensionDescriptor.getNumber();
                        object = (List)object.getValue();
                        boolean bl15 = generatedMessageLite$ExtensionDescriptor.isPacked();
                        SchemaUtil.writeInt64List(n3, object, writer, bl15);
                        break;
                    }
                    case 2: {
                        n3 = generatedMessageLite$ExtensionDescriptor.getNumber();
                        object = (List)object.getValue();
                        boolean bl16 = generatedMessageLite$ExtensionDescriptor.isPacked();
                        SchemaUtil.writeFloatList(n3, object, writer, bl16);
                        break;
                    }
                    case 1: {
                        n3 = generatedMessageLite$ExtensionDescriptor.getNumber();
                        object = (List)object.getValue();
                        boolean bl17 = generatedMessageLite$ExtensionDescriptor.isPacked();
                        SchemaUtil.writeDoubleList(n3, object, writer, bl17);
                        break;
                    }
                }
                break block43;
            }
            Object object3 = ExtensionSchemaLite$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType;
            Object object4 = generatedMessageLite$ExtensionDescriptor.getLiteType();
            int n15 = ((Enum)object4).ordinal();
            n3 = object3[n15];
            switch (n3) {
                default: {
                    break;
                }
                case 18: {
                    int n16 = generatedMessageLite$ExtensionDescriptor.getNumber();
                    object3 = object.getValue();
                    object4 = Protobuf.getInstance();
                    object = object.getValue().getClass();
                    object = ((Protobuf)object4).schemaFor((Class)object);
                    writer.writeMessage(n16, object3, (Schema)object);
                    break;
                }
                case 17: {
                    int n17 = generatedMessageLite$ExtensionDescriptor.getNumber();
                    object3 = object.getValue();
                    object4 = Protobuf.getInstance();
                    object = object.getValue().getClass();
                    object = ((Protobuf)object4).schemaFor((Class)object);
                    writer.writeGroup(n17, object3, (Schema)object);
                    break;
                }
                case 16: {
                    int n18 = generatedMessageLite$ExtensionDescriptor.getNumber();
                    object = (String)object.getValue();
                    writer.writeString(n18, (String)object);
                    break;
                }
                case 15: {
                    int n19 = generatedMessageLite$ExtensionDescriptor.getNumber();
                    object = (ByteString)object.getValue();
                    writer.writeBytes(n19, (ByteString)object);
                    break;
                }
                case 14: {
                    int n20 = generatedMessageLite$ExtensionDescriptor.getNumber();
                    object = (Integer)object.getValue();
                    int n21 = (Integer)object;
                    writer.writeInt32(n20, n21);
                    break;
                }
                case 13: {
                    int n22 = generatedMessageLite$ExtensionDescriptor.getNumber();
                    object = (Long)object.getValue();
                    long l2 = (Long)object;
                    writer.writeSInt64(n22, l2);
                    break;
                }
                case 12: {
                    int n24 = generatedMessageLite$ExtensionDescriptor.getNumber();
                    object = (Integer)object.getValue();
                    int n25 = (Integer)object;
                    writer.writeSInt32(n24, n25);
                    break;
                }
                case 11: {
                    int n26 = generatedMessageLite$ExtensionDescriptor.getNumber();
                    object = (Long)object.getValue();
                    long l3 = (Long)object;
                    writer.writeSFixed64(n26, l3);
                    break;
                }
                case 10: {
                    int n27 = generatedMessageLite$ExtensionDescriptor.getNumber();
                    object = (Integer)object.getValue();
                    int n28 = (Integer)object;
                    writer.writeSFixed32(n27, n28);
                    break;
                }
                case 9: {
                    int n29 = generatedMessageLite$ExtensionDescriptor.getNumber();
                    object = (Integer)object.getValue();
                    int n30 = (Integer)object;
                    writer.writeUInt32(n29, n30);
                    break;
                }
                case 8: {
                    int n32 = generatedMessageLite$ExtensionDescriptor.getNumber();
                    object = (Boolean)object.getValue();
                    boolean bl18 = (Boolean)object;
                    writer.writeBool(n32, bl18);
                    break;
                }
                case 7: {
                    int n34 = generatedMessageLite$ExtensionDescriptor.getNumber();
                    object = (Integer)object.getValue();
                    int n35 = (Integer)object;
                    writer.writeFixed32(n34, n35);
                    break;
                }
                case 6: {
                    int n36 = generatedMessageLite$ExtensionDescriptor.getNumber();
                    object = (Long)object.getValue();
                    long l4 = (Long)object;
                    writer.writeFixed64(n36, l4);
                    break;
                }
                case 5: {
                    int n37 = generatedMessageLite$ExtensionDescriptor.getNumber();
                    object = (Integer)object.getValue();
                    int n38 = (Integer)object;
                    writer.writeInt32(n37, n38);
                    break;
                }
                case 4: {
                    int n39 = generatedMessageLite$ExtensionDescriptor.getNumber();
                    object = (Long)object.getValue();
                    long l7 = (Long)object;
                    writer.writeUInt64(n39, l7);
                    break;
                }
                case 3: {
                    int n41 = generatedMessageLite$ExtensionDescriptor.getNumber();
                    object = (Long)object.getValue();
                    long l8 = (Long)object;
                    writer.writeInt64(n41, l8);
                    break;
                }
                case 2: {
                    int n42 = generatedMessageLite$ExtensionDescriptor.getNumber();
                    object = (Float)object.getValue();
                    float f5 = ((Float)object).floatValue();
                    writer.writeFloat(n42, f5);
                    break;
                }
                case 1: {
                    int n43 = generatedMessageLite$ExtensionDescriptor.getNumber();
                    object = (Double)object.getValue();
                    double d2 = (Double)object;
                    writer.writeDouble(n43, d2);
                }
            }
        }
    }

    public void setExtensions(Object object, FieldSet fieldSet) {
        ((GeneratedMessageLite$ExtendableMessage)object).extensions = fieldSet;
    }
}

