/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.ArrayDecoders$Registers;
import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ExtensionSchema;
import com.google.protobuf.FieldSet;
import com.google.protobuf.FieldSet$FieldDescriptorLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import com.google.protobuf.GeneratedMessageLite$GeneratedExtension;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyField$LazyEntry;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Protobuf;
import com.google.protobuf.Reader;
import com.google.protobuf.Schema;
import com.google.protobuf.SchemaUtil;
import com.google.protobuf.UnknownFieldSchema;
import com.google.protobuf.UnknownFieldSetLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.WireFormat$JavaType;
import com.google.protobuf.Writer;
import java.util.Map;

final class MessageSetSchema
implements Schema {
    private final MessageLite defaultInstance;
    private final ExtensionSchema extensionSchema;
    private final boolean hasExtensions;
    private final UnknownFieldSchema unknownFieldSchema;

    private MessageSetSchema(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MessageLite messageLite) {
        boolean bl2;
        this.unknownFieldSchema = unknownFieldSchema;
        this.hasExtensions = bl2 = extensionSchema.hasExtensions(messageLite);
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
    }

    private int getUnknownFieldsSerializedSize(UnknownFieldSchema unknownFieldSchema, Object object) {
        object = unknownFieldSchema.getFromMessage(object);
        return unknownFieldSchema.getSerializedSizeAsMessageSet(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void mergeFromHelper(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, Object object, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        Object object2 = unknownFieldSchema.getBuilderFromMessage(object);
        FieldSet fieldSet = extensionSchema.getMutableExtensions(object);
        try {
            int n3;
            do {
                int n4;
                if ((n3 = reader.getFieldNumber()) != (n4 = -1 >>> 1)) continue;
                unknownFieldSchema.setBuilderToMessage(object, object2);
                return;
            } while ((n3 = (int)(this.parseMessageSetItemOrUnknownField(reader, extensionRegistryLite, extensionSchema, fieldSet, unknownFieldSchema, object2) ? 1 : 0)) != 0);
            unknownFieldSchema.setBuilderToMessage(object, object2);
            return;
        }
        catch (Throwable throwable) {
            unknownFieldSchema.setBuilderToMessage(object, object2);
            throw throwable;
        }
    }

    public static MessageSetSchema newSchema(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MessageLite messageLite) {
        MessageSetSchema messageSetSchema = new MessageSetSchema(unknownFieldSchema, extensionSchema, messageLite);
        return messageSetSchema;
    }

    private boolean parseMessageSetItemOrUnknownField(Reader reader, ExtensionRegistryLite extensionRegistryLite, ExtensionSchema extensionSchema, FieldSet fieldSet, UnknownFieldSchema unknownFieldSchema, Object object) {
        int n3;
        int n4;
        int n7;
        int n8 = reader.getTag();
        int n10 = WireFormat.MESSAGE_SET_ITEM_TAG;
        int n14 = 0;
        boolean bl2 = true;
        if (n8 != n10) {
            int n15;
            n10 = WireFormat.getTagWireType(n8);
            if (n10 == (n15 = 2)) {
                MessageLite messageLite = this.defaultInstance;
                Object object2 = extensionSchema.findExtensionByNumber(extensionRegistryLite, messageLite, n8 = WireFormat.getTagFieldNumber(n8));
                if (object2 != null) {
                    extensionSchema.parseLengthPrefixedMessageSetItem(reader, object2, extensionRegistryLite, fieldSet);
                    return bl2;
                }
                return unknownFieldSchema.mergeOneFieldFrom(object, reader, 0);
            }
            return reader.skipField();
        }
        n8 = 0;
        Object object3 = null;
        n10 = 0;
        ByteString byteString = null;
        while ((n7 = reader.getFieldNumber()) != (n4 = -1 >>> 1)) {
            n7 = reader.getTag();
            if (n7 == (n4 = WireFormat.MESSAGE_SET_TYPE_ID_TAG)) {
                n14 = reader.readUInt32();
                object3 = this.defaultInstance;
                object3 = extensionSchema.findExtensionByNumber(extensionRegistryLite, (MessageLite)object3, n14);
                continue;
            }
            n4 = WireFormat.MESSAGE_SET_MESSAGE_TAG;
            if (n7 == n4) {
                if (object3 != null) {
                    extensionSchema.parseLengthPrefixedMessageSetItem(reader, object3, extensionRegistryLite, fieldSet);
                    continue;
                }
                byteString = reader.readBytes();
                continue;
            }
            n7 = (int)(reader.skipField() ? 1 : 0);
            if (n7 != 0) continue;
        }
        if ((n3 = reader.getTag()) == (n7 = WireFormat.MESSAGE_SET_ITEM_END_TAG)) {
            if (byteString != null) {
                if (object3 != null) {
                    extensionSchema.parseMessageSetItem(byteString, object3, extensionRegistryLite, fieldSet);
                } else {
                    unknownFieldSchema.addLengthDelimited(object, n14, byteString);
                }
            }
            return bl2;
        }
        throw InvalidProtocolBufferException.invalidEndTag();
    }

    private void writeUnknownFieldsHelper(UnknownFieldSchema unknownFieldSchema, Object object, Writer writer) {
        object = unknownFieldSchema.getFromMessage(object);
        unknownFieldSchema.writeAsMessageSetTo(object, writer);
    }

    public boolean equals(Object object, Object object2) {
        Object object3;
        Object object4 = this.unknownFieldSchema.getFromMessage(object);
        boolean bl2 = object4.equals(object3 = this.unknownFieldSchema.getFromMessage(object2));
        if (!bl2) {
            return false;
        }
        bl2 = this.hasExtensions;
        if (bl2) {
            object = this.extensionSchema.getExtensions(object);
            object2 = this.extensionSchema.getExtensions(object2);
            return ((FieldSet)object).equals(object2);
        }
        return true;
    }

    public int getSerializedSize(Object object) {
        UnknownFieldSchema unknownFieldSchema = this.unknownFieldSchema;
        int n3 = this.getUnknownFieldsSerializedSize(unknownFieldSchema, object);
        boolean bl2 = this.hasExtensions;
        if (bl2) {
            ExtensionSchema extensionSchema = this.extensionSchema;
            object = extensionSchema.getExtensions(object);
            int n4 = ((FieldSet)object).getMessageSetSerializedSize();
            n3 += n4;
        }
        return n3;
    }

    public int hashCode(Object object) {
        Object object2 = this.unknownFieldSchema.getFromMessage(object);
        int n3 = object2.hashCode();
        boolean bl2 = this.hasExtensions;
        if (bl2) {
            ExtensionSchema extensionSchema = this.extensionSchema;
            object = extensionSchema.getExtensions(object);
            n3 *= 53;
            int n4 = ((FieldSet)object).hashCode();
            n3 += n4;
        }
        return n3;
    }

    public final boolean isInitialized(Object object) {
        return this.extensionSchema.getExtensions(object).isInitialized();
    }

    public void makeImmutable(Object object) {
        this.unknownFieldSchema.makeImmutable(object);
        this.extensionSchema.makeImmutable(object);
    }

    public void mergeFrom(Object object, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        UnknownFieldSchema unknownFieldSchema = this.unknownFieldSchema;
        ExtensionSchema extensionSchema = this.extensionSchema;
        this.mergeFromHelper(unknownFieldSchema, extensionSchema, object, reader, extensionRegistryLite);
    }

    public void mergeFrom(Object object, Object object2) {
        Object object3 = this.unknownFieldSchema;
        SchemaUtil.mergeUnknownFields((UnknownFieldSchema)object3, object, object2);
        boolean bl2 = this.hasExtensions;
        if (bl2) {
            object3 = this.extensionSchema;
            SchemaUtil.mergeExtensions((ExtensionSchema)object3, object, object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void mergeFrom(Object object, byte[] byArray, int n3, int n4, ArrayDecoders$Registers arrayDecoders$Registers) {
        Object object2 = object;
        object2 = (GeneratedMessageLite)object;
        UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite)object2).unknownFields;
        Object object3 = UnknownFieldSetLite.getDefaultInstance();
        if (unknownFieldSetLite == object3) {
            ((GeneratedMessageLite)object2).unknownFields = unknownFieldSetLite = UnknownFieldSetLite.newInstance();
        }
        object = ((GeneratedMessageLite$ExtendableMessage)object).ensureExtensionsAreMutable();
        object2 = null;
        object3 = null;
        while (true) {
            Object object4;
            Object object5;
            int n7;
            Object object6;
            int n8;
            int n10;
            if (n3 < n4) {
                Object object7;
                n10 = ArrayDecoders.decodeVarint32(byArray, n3, arrayDecoders$Registers);
                n3 = arrayDecoders$Registers.int1;
                int n14 = WireFormat.MESSAGE_SET_ITEM_TAG;
                n8 = 2;
                if (n3 != n14) {
                    n14 = WireFormat.getTagWireType(n3);
                    if (n14 == n8) {
                        object3 = this.extensionSchema;
                        object6 = arrayDecoders$Registers.extensionRegistry;
                        MessageLite messageLite = this.defaultInstance;
                        n7 = WireFormat.getTagFieldNumber(n3);
                        object3 = ((ExtensionSchema)object3).findExtensionByNumber((ExtensionRegistryLite)object6, messageLite, n7);
                        Object object8 = object3;
                        object8 = (GeneratedMessageLite$GeneratedExtension)object3;
                        if (object8 != null) {
                            object7 = Protobuf.getInstance();
                            object3 = ((GeneratedMessageLite$GeneratedExtension)object8).getMessageDefaultInstance().getClass();
                            object7 = ((Protobuf)object7).schemaFor((Class)object3);
                            n3 = ArrayDecoders.decodeMessageField((Schema)object7, byArray, n10, n4, arrayDecoders$Registers);
                            object3 = ((GeneratedMessageLite$GeneratedExtension)object8).descriptor;
                            object6 = arrayDecoders$Registers.object1;
                            ((FieldSet)object).setField((FieldSet$FieldDescriptorLite)object3, object6);
                        } else {
                            object6 = byArray;
                            n8 = n4;
                            object5 = unknownFieldSetLite;
                            object4 = arrayDecoders$Registers;
                            n3 = ArrayDecoders.decodeUnknownField(n3, byArray, n10, n4, unknownFieldSetLite, arrayDecoders$Registers);
                        }
                        object3 = object8;
                        continue;
                    }
                    n3 = ArrayDecoders.skipField(n3, byArray, n10, n4, arrayDecoders$Registers);
                    continue;
                }
                n3 = 0;
                object7 = null;
                n14 = 0;
                object6 = null;
            } else {
                if (n3 == n4) {
                    return;
                }
                throw InvalidProtocolBufferException.parseFailure();
            }
            while (n10 < n4) {
                n10 = ArrayDecoders.decodeVarint32(byArray, n10, arrayDecoders$Registers);
                n7 = arrayDecoders$Registers.int1;
                int n15 = WireFormat.getTagFieldNumber(n7);
                int n16 = WireFormat.getTagWireType(n7);
                if (n15 != n8) {
                    int n17 = 3;
                    if (n15 == n17) {
                        if (object3 != null) {
                            object5 = Protobuf.getInstance();
                            object4 = ((GeneratedMessageLite$GeneratedExtension)object3).getMessageDefaultInstance().getClass();
                            n10 = ArrayDecoders.decodeMessageField(((Protobuf)object5).schemaFor((Class)object4), byArray, n10, n4, arrayDecoders$Registers);
                            object5 = ((GeneratedMessageLite$GeneratedExtension)object3).descriptor;
                            object4 = arrayDecoders$Registers.object1;
                            ((FieldSet)object).setField((FieldSet$FieldDescriptorLite)object5, object4);
                            continue;
                        }
                        if (n16 == n8) {
                            n10 = ArrayDecoders.decodeBytes(byArray, n10, arrayDecoders$Registers);
                            object6 = (ByteString)arrayDecoders$Registers.object1;
                            continue;
                        }
                    }
                } else if (n16 == 0) {
                    n10 = ArrayDecoders.decodeVarint32(byArray, n10, arrayDecoders$Registers);
                    n3 = arrayDecoders$Registers.int1;
                    object3 = this.extensionSchema;
                    object5 = arrayDecoders$Registers.extensionRegistry;
                    object4 = this.defaultInstance;
                    object3 = (GeneratedMessageLite$GeneratedExtension)((ExtensionSchema)object3).findExtensionByNumber((ExtensionRegistryLite)object5, (MessageLite)object4, n3);
                    continue;
                }
                if (n7 == (n15 = WireFormat.MESSAGE_SET_ITEM_END_TAG)) break;
                n10 = ArrayDecoders.skipField(n7, byArray, n10, n4, arrayDecoders$Registers);
            }
            if (object6 != null) {
                n3 = WireFormat.makeTag(n3, n8);
                unknownFieldSetLite.storeField(n3, object6);
            }
            n3 = n10;
        }
    }

    public Object newInstance() {
        MessageLite messageLite = this.defaultInstance;
        boolean bl2 = messageLite instanceof GeneratedMessageLite;
        if (bl2) {
            return ((GeneratedMessageLite)messageLite).newMutableInstance();
        }
        return messageLite.newBuilderForType().buildPartial();
    }

    public void writeTo(Object object, Writer writer) {
        boolean bl2;
        Object object2 = this.extensionSchema.getExtensions(object).iterator();
        while (bl2 = object2.hasNext()) {
            boolean bl3;
            WireFormat$JavaType wireFormat$JavaType;
            Object object3 = (Map.Entry)object2.next();
            FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite)object3.getKey();
            WireFormat$JavaType wireFormat$JavaType2 = fieldSet$FieldDescriptorLite.getLiteJavaType();
            if (wireFormat$JavaType2 == (wireFormat$JavaType = WireFormat$JavaType.MESSAGE) && !(bl3 = fieldSet$FieldDescriptorLite.isRepeated()) && !(bl3 = fieldSet$FieldDescriptorLite.isPacked())) {
                int n3;
                bl3 = object3 instanceof LazyField$LazyEntry;
                if (bl3) {
                    n3 = fieldSet$FieldDescriptorLite.getNumber();
                    object3 = ((LazyField$LazyEntry)object3).getField().toByteString();
                    writer.writeMessageSetItem(n3, object3);
                    continue;
                }
                n3 = fieldSet$FieldDescriptorLite.getNumber();
                object3 = object3.getValue();
                writer.writeMessageSetItem(n3, object3);
                continue;
            }
            object = new IllegalStateException("Found invalid MessageSet item.");
            throw object;
        }
        object2 = this.unknownFieldSchema;
        this.writeUnknownFieldsHelper((UnknownFieldSchema)object2, object, writer);
    }
}

