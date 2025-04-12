/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionLite;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FieldSet;
import com.google.protobuf.FieldSet$FieldDescriptorLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$1;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessage$ExtensionWriter;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder;
import com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor;
import com.google.protobuf.GeneratedMessageLite$GeneratedExtension;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.WireFormat;
import com.google.protobuf.WireFormat$FieldType;

public abstract class GeneratedMessageLite$ExtendableMessage
extends GeneratedMessageLite
implements GeneratedMessageLite$ExtendableMessageOrBuilder {
    protected FieldSet extensions;

    public GeneratedMessageLite$ExtendableMessage() {
        FieldSet fieldSet;
        this.extensions = fieldSet = FieldSet.emptySet();
    }

    private void eagerlyMergeMessageSetExtension(CodedInputStream codedInputStream, GeneratedMessageLite$GeneratedExtension generatedMessageLite$GeneratedExtension, ExtensionRegistryLite extensionRegistryLite, int n3) {
        int n4 = WireFormat.makeTag(n3, 2);
        this.parseExtension(codedInputStream, extensionRegistryLite, generatedMessageLite$GeneratedExtension, n4, n3);
    }

    private void mergeMessageSetExtensionFromBytes(ByteString object, ExtensionRegistryLite object2, GeneratedMessageLite$GeneratedExtension generatedMessageLite$GeneratedExtension) {
        Object object3 = this.extensions;
        GeneratedMessageLite$ExtensionDescriptor generatedMessageLite$ExtensionDescriptor = generatedMessageLite$GeneratedExtension.descriptor;
        if ((object3 = (object3 = (MessageLite)((FieldSet)object3).getField(generatedMessageLite$ExtensionDescriptor)) != null ? object3.toBuilder() : null) == null) {
            object3 = generatedMessageLite$GeneratedExtension.getMessageDefaultInstance().newBuilderForType();
        }
        object3.mergeFrom((ByteString)object, (ExtensionRegistryLite)object2);
        object = object3.build();
        object2 = this.ensureExtensionsAreMutable();
        object3 = generatedMessageLite$GeneratedExtension.descriptor;
        object = generatedMessageLite$GeneratedExtension.singularToFieldSetType(object);
        ((FieldSet)object2).setField((FieldSet$FieldDescriptorLite)object3, object);
    }

    private void mergeMessageSetExtensionFromCodedStream(MessageLite messageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        int n3;
        int n4 = 0;
        ByteString byteString = null;
        GeneratedMessageLite$GeneratedExtension generatedMessageLite$GeneratedExtension = null;
        while ((n3 = codedInputStream.readTag()) != 0) {
            int n7 = WireFormat.MESSAGE_SET_TYPE_ID_TAG;
            if (n3 == n7) {
                n4 = codedInputStream.readUInt32();
                if (n4 == 0) continue;
                generatedMessageLite$GeneratedExtension = extensionRegistryLite.findLiteExtensionByNumber(messageLite, n4);
                continue;
            }
            n7 = WireFormat.MESSAGE_SET_MESSAGE_TAG;
            if (n3 == n7) {
                if (n4 != 0 && generatedMessageLite$GeneratedExtension != null) {
                    this.eagerlyMergeMessageSetExtension(codedInputStream, generatedMessageLite$GeneratedExtension, extensionRegistryLite, n4);
                    byteString = null;
                    continue;
                }
                byteString = codedInputStream.readBytes();
                continue;
            }
            if ((n3 = (int)(codedInputStream.skipField(n3) ? 1 : 0)) != 0) continue;
        }
        int n8 = WireFormat.MESSAGE_SET_ITEM_END_TAG;
        codedInputStream.checkLastTagWas(n8);
        if (byteString != null && n4 != 0) {
            if (generatedMessageLite$GeneratedExtension != null) {
                this.mergeMessageSetExtensionFromBytes(byteString, extensionRegistryLite, generatedMessageLite$GeneratedExtension);
            } else {
                this.mergeLengthDelimitedField(n4, byteString);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean parseExtension(CodedInputStream var1_1, ExtensionRegistryLite var2_2, GeneratedMessageLite$GeneratedExtension var3_3, int var4_4, int var5_5) {
        block22: {
            block24: {
                block23: {
                    block21: {
                        var6_6 = WireFormat.getTagWireType(var4_4);
                        var7_7 = true;
                        if (var3_3 == null) {
                            while (true) {
                                var6_6 = 1;
lbl6:
                                // 2 sources

                                while (true) {
                                    var8_8 = 0;
                                    var9_9 /* !! */  = null;
                                    ** GOTO lbl21
                                    break;
                                }
                                break;
                            }
                        } else {
                            var9_9 /* !! */  = var3_3.descriptor.getLiteType();
                            var8_8 = FieldSet.getWireFormatForFieldType(var9_9 /* !! */ , false);
                            if (var6_6 == var8_8) {
                                var6_6 = 0;
                                var10_11 /* !! */  = null;
                                ** continue;
                            }
                            var9_9 /* !! */  = var3_3.descriptor;
                            if (!(var11_10 = var9_9 /* !! */ .isRepeated) || (var8_8 = (int)(var9_9 /* !! */  = var9_9 /* !! */ .type).isPackable()) == 0 || var6_6 != (var8_8 = FieldSet.getWireFormatForFieldType(var9_9 /* !! */  = var3_3.descriptor.getLiteType(), var7_7))) ** continue;
                            var6_6 = 0;
                            var10_11 /* !! */  = null;
                            var8_8 = 1;
                        }
lbl21:
                        // 2 sources

                        if (var6_6 != 0) {
                            return this.parseUnknownField(var4_4, (CodedInputStream)var1_1);
                        }
                        this.ensureExtensionsAreMutable();
                        if (var8_8 == 0) break block21;
                        var12_12 = var1_1.readRawVarint32();
                        var12_12 = var1_1.pushLimit(var12_12);
                        var13_14 /* !! */  = var3_3.descriptor.getLiteType();
                        if (var13_14 /* !! */  == (var14_16 = WireFormat$FieldType.ENUM)) {
                            while ((var4_4 = var1_1.getBytesUntilLimit()) > 0) {
                                var4_4 = var1_1.readEnum();
                                var14_16 = var3_3.descriptor.getEnumType();
                                var13_14 /* !! */  = var14_16.findValueByNumber(var4_4);
                                if (var13_14 /* !! */  == null) {
                                    return var7_7;
                                }
                                var14_16 = this.extensions;
                                var10_11 /* !! */  = var3_3.descriptor;
                                var13_14 /* !! */  = var3_3.singularToFieldSetType((Object)var13_14 /* !! */ );
                                var14_16.addRepeatedField((FieldSet$FieldDescriptorLite)var10_11 /* !! */ , (Object)var13_14 /* !! */ );
                            }
                        } else {
                            while ((var4_4 = var1_1.getBytesUntilLimit()) > 0) {
                                var13_14 /* !! */  = var3_3.descriptor.getLiteType();
                                var13_14 /* !! */  = FieldSet.readPrimitiveField((CodedInputStream)var1_1, var13_14 /* !! */ , false);
                                var14_16 = this.extensions;
                                var10_11 /* !! */  = var3_3.descriptor;
                                var14_16.addRepeatedField((FieldSet$FieldDescriptorLite)var10_11 /* !! */ , (Object)var13_14 /* !! */ );
                            }
                        }
                        var1_1.popLimit(var12_12);
                        break block22;
                    }
                    var13_15 /* !! */  = GeneratedMessageLite$1.$SwitchMap$com$google$protobuf$WireFormat$JavaType;
                    var10_11 /* !! */  = var3_3.descriptor.getLiteJavaType();
                    var6_6 = var10_11 /* !! */ .ordinal();
                    var4_4 = var13_15 /* !! */ [var6_6];
                    if (var4_4 == var7_7) break block23;
                    var12_13 = 2;
                    if (var4_4 != var12_13) {
                        var2_2 = var3_3.descriptor.getLiteType();
                        var1_1 = FieldSet.readPrimitiveField((CodedInputStream)var1_1, (WireFormat$FieldType)var2_2, false);
                    } else {
                        var15_18 = var1_1.readEnum();
                        var2_2 = var3_3.descriptor.getEnumType().findValueByNumber(var15_18);
                        if (var2_2 == null) {
                            this.mergeVarintField(var5_5, var15_18);
                            return var7_7;
                        }
                        var1_1 = var2_2;
                    }
                    break block24;
                }
                var13_15 /* !! */  = (int[])var3_3.descriptor;
                var4_4 = (int)var13_15 /* !! */ .isRepeated();
                if (var4_4 != 0) ** GOTO lbl-1000
                var13_15 /* !! */  = this.extensions;
                var14_17 /* !! */  = var3_3.descriptor;
                if ((var13_15 /* !! */  = (MessageLite)var13_15 /* !! */ .getField(var14_17 /* !! */ )) != null) {
                    var13_15 /* !! */  = var13_15 /* !! */ .toBuilder();
                } else lbl-1000:
                // 2 sources

                {
                    var4_4 = 0;
                    var13_15 /* !! */  = null;
                }
                if (var13_15 /* !! */  == null) {
                    var13_15 /* !! */  = var3_3.getMessageDefaultInstance().newBuilderForType();
                }
                if ((var14_17 /* !! */  = var3_3.descriptor.getLiteType()) == (var10_11 /* !! */  = WireFormat$FieldType.GROUP)) {
                    var5_5 = var3_3.getNumber();
                    var1_1.readGroup(var5_5, (MessageLite$Builder)var13_15 /* !! */ , (ExtensionRegistryLite)var2_2);
                } else {
                    var1_1.readMessage((MessageLite$Builder)var13_15 /* !! */ , (ExtensionRegistryLite)var2_2);
                }
                var1_1 = var13_15 /* !! */ .build();
            }
            var2_2 = var3_3.descriptor;
            var12_13 = (int)var2_2.isRepeated();
            if (var12_13 != 0) {
                var2_2 = this.extensions;
                var13_15 /* !! */  = var3_3.descriptor;
                var1_1 = var3_3.singularToFieldSetType(var1_1);
                var2_2.addRepeatedField((FieldSet$FieldDescriptorLite)var13_15 /* !! */ , var1_1);
            } else {
                var2_2 = this.extensions;
                var13_15 /* !! */  = var3_3.descriptor;
                var1_1 = var3_3.singularToFieldSetType(var1_1);
                var2_2.setField((FieldSet$FieldDescriptorLite)var13_15 /* !! */ , var1_1);
            }
        }
        return var7_7;
    }

    private void verifyExtensionContainingType(GeneratedMessageLite$GeneratedExtension object) {
        GeneratedMessageLite generatedMessageLite;
        if ((object = ((GeneratedMessageLite$GeneratedExtension)object).getContainingTypeDefaultInstance()) == (generatedMessageLite = ((GeneratedMessageLite)this).getDefaultInstanceForType())) {
            return;
        }
        object = new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        throw object;
    }

    public FieldSet ensureExtensionsAreMutable() {
        FieldSet fieldSet = this.extensions;
        boolean bl2 = fieldSet.isImmutable();
        if (bl2) {
            this.extensions = fieldSet = this.extensions.clone();
        }
        return this.extensions;
    }

    public boolean extensionsAreInitialized() {
        return this.extensions.isInitialized();
    }

    public int extensionsSerializedSize() {
        return this.extensions.getSerializedSize();
    }

    public int extensionsSerializedSizeAsMessageSet() {
        return this.extensions.getMessageSetSerializedSize();
    }

    public final Object getExtension(ExtensionLite extensionLite) {
        extensionLite = GeneratedMessageLite.access$000(extensionLite);
        this.verifyExtensionContainingType((GeneratedMessageLite$GeneratedExtension)extensionLite);
        Object object = this.extensions;
        GeneratedMessageLite$ExtensionDescriptor generatedMessageLite$ExtensionDescriptor = ((GeneratedMessageLite$GeneratedExtension)extensionLite).descriptor;
        object = ((FieldSet)object).getField(generatedMessageLite$ExtensionDescriptor);
        if (object == null) {
            return ((GeneratedMessageLite$GeneratedExtension)extensionLite).defaultValue;
        }
        return ((GeneratedMessageLite$GeneratedExtension)extensionLite).fromFieldSetType(object);
    }

    public final Object getExtension(ExtensionLite extensionLite, int n3) {
        extensionLite = GeneratedMessageLite.access$000(extensionLite);
        this.verifyExtensionContainingType((GeneratedMessageLite$GeneratedExtension)extensionLite);
        FieldSet fieldSet = this.extensions;
        GeneratedMessageLite$ExtensionDescriptor generatedMessageLite$ExtensionDescriptor = ((GeneratedMessageLite$GeneratedExtension)extensionLite).descriptor;
        Object object = fieldSet.getRepeatedField(generatedMessageLite$ExtensionDescriptor, n3);
        return ((GeneratedMessageLite$GeneratedExtension)extensionLite).singularFromFieldSetType(object);
    }

    public final int getExtensionCount(ExtensionLite object) {
        object = GeneratedMessageLite.access$000((ExtensionLite)object);
        this.verifyExtensionContainingType((GeneratedMessageLite$GeneratedExtension)object);
        FieldSet fieldSet = this.extensions;
        object = ((GeneratedMessageLite$GeneratedExtension)object).descriptor;
        return fieldSet.getRepeatedFieldCount((FieldSet$FieldDescriptorLite)object);
    }

    public final boolean hasExtension(ExtensionLite object) {
        object = GeneratedMessageLite.access$000((ExtensionLite)object);
        this.verifyExtensionContainingType((GeneratedMessageLite$GeneratedExtension)object);
        FieldSet fieldSet = this.extensions;
        object = ((GeneratedMessageLite$GeneratedExtension)object).descriptor;
        return fieldSet.hasField((FieldSet$FieldDescriptorLite)object);
    }

    public final void mergeExtensionFields(GeneratedMessageLite$ExtendableMessage object) {
        FieldSet fieldSet = this.extensions;
        boolean bl2 = fieldSet.isImmutable();
        if (bl2) {
            this.extensions = fieldSet = this.extensions.clone();
        }
        fieldSet = this.extensions;
        object = ((GeneratedMessageLite$ExtendableMessage)object).extensions;
        fieldSet.mergeFrom((FieldSet)object);
    }

    public GeneratedMessageLite$ExtendableMessage$ExtensionWriter newExtensionWriter() {
        GeneratedMessageLite$ExtendableMessage$ExtensionWriter generatedMessageLite$ExtendableMessage$ExtensionWriter = new GeneratedMessageLite$ExtendableMessage$ExtensionWriter(this, false, null);
        return generatedMessageLite$ExtendableMessage$ExtensionWriter;
    }

    public GeneratedMessageLite$ExtendableMessage$ExtensionWriter newMessageSetExtensionWriter() {
        GeneratedMessageLite$ExtendableMessage$ExtensionWriter generatedMessageLite$ExtendableMessage$ExtensionWriter = new GeneratedMessageLite$ExtendableMessage$ExtensionWriter(this, true, null);
        return generatedMessageLite$ExtendableMessage$ExtensionWriter;
    }

    public boolean parseUnknownField(MessageLite messageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int n3) {
        int n4 = WireFormat.getTagFieldNumber(n3);
        GeneratedMessageLite$GeneratedExtension generatedMessageLite$GeneratedExtension = extensionRegistryLite.findLiteExtensionByNumber(messageLite, n4);
        return this.parseExtension(codedInputStream, extensionRegistryLite, generatedMessageLite$GeneratedExtension, n3, n4);
    }

    public boolean parseUnknownFieldAsMessageSet(MessageLite messageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int n3) {
        int n4;
        int n7 = WireFormat.MESSAGE_SET_ITEM_TAG;
        if (n3 == n7) {
            this.mergeMessageSetExtensionFromCodedStream(messageLite, codedInputStream, extensionRegistryLite);
            return true;
        }
        n7 = WireFormat.getTagWireType(n3);
        if (n7 == (n4 = 2)) {
            return this.parseUnknownField(messageLite, codedInputStream, extensionRegistryLite, n3);
        }
        return codedInputStream.skipField(n3);
    }
}

