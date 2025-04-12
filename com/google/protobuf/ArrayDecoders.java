/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ArrayDecoders$1;
import com.google.protobuf.ArrayDecoders$Registers;
import com.google.protobuf.BooleanArrayList;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DoubleArrayList;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FieldSet$FieldDescriptorLite;
import com.google.protobuf.FloatArrayList;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import com.google.protobuf.GeneratedMessageLite$GeneratedExtension;
import com.google.protobuf.IntArrayList;
import com.google.protobuf.Internal;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LongArrayList;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageSchema;
import com.google.protobuf.Protobuf;
import com.google.protobuf.Schema;
import com.google.protobuf.SchemaUtil;
import com.google.protobuf.UnknownFieldSchema;
import com.google.protobuf.UnknownFieldSetLite;
import com.google.protobuf.Utf8;
import com.google.protobuf.WireFormat;
import com.google.protobuf.WireFormat$FieldType;
import java.nio.charset.Charset;
import java.util.List;

final class ArrayDecoders {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    private ArrayDecoders() {
    }

    private static void checkRecursionLimit(int n3) {
        int n4 = recursionLimit;
        if (n3 < n4) {
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    /*
     * WARNING - void declaration
     */
    public static int decodeBoolList(int n3, byte[] byArray, int n4, int n7, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        void var11_11;
        internal$ProtobufList = (BooleanArrayList)internal$ProtobufList;
        n4 = ArrayDecoders.decodeVarint64(byArray, n4, arrayDecoders$Registers);
        long l2 = arrayDecoders$Registers.long1;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            boolean bl2 = true;
        } else {
            boolean bl2 = false;
        }
        ((BooleanArrayList)internal$ProtobufList).addBoolean((boolean)var11_11);
        while (n4 < n7) {
            boolean bl3 = ArrayDecoders.decodeVarint32(byArray, n4, arrayDecoders$Registers);
            int n8 = arrayDecoders$Registers.int1;
            if (n3 != n8) break;
            n4 = ArrayDecoders.decodeVarint64(byArray, (int)(bl3 ? 1 : 0), arrayDecoders$Registers);
            l2 = arrayDecoders$Registers.long1;
            long l7 = l2 - l3;
            object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            bl3 = object != false;
            ((BooleanArrayList)internal$ProtobufList).addBoolean(bl3);
        }
        return n4;
    }

    public static int decodeBytes(byte[] object, int n3, ArrayDecoders$Registers arrayDecoders$Registers) {
        n3 = ArrayDecoders.decodeVarint32(object, n3, arrayDecoders$Registers);
        int n4 = arrayDecoders$Registers.int1;
        if (n4 >= 0) {
            int n7 = ((byte[])object).length - n3;
            if (n4 <= n7) {
                if (n4 == 0) {
                    object = ByteString.EMPTY;
                    arrayDecoders$Registers.object1 = object;
                    return n3;
                }
                object = ByteString.copyFrom(object, n3, n4);
                arrayDecoders$Registers.object1 = object;
                return n3 + n4;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int decodeBytesList(int var0, byte[] var1_1, int var2_2, int var3_3, Internal$ProtobufList var4_4, ArrayDecoders$Registers var5_5) {
        block3: {
            var2_2 = ArrayDecoders.decodeVarint32(var1_1, var2_2, var5_5);
            var6_6 = var5_5.int1;
            if (var6_6 < 0) throw InvalidProtocolBufferException.negativeSize();
            var7_7 = var1_1.length - var2_2;
            if (var6_6 > var7_7) throw InvalidProtocolBufferException.truncatedMessage();
            if (var6_6 != 0) break block3;
            var8_8 = ByteString.EMPTY;
            var4_4.add(var8_8);
            ** GOTO lbl17
        }
        var9_9 = ByteString.copyFrom(var1_1, var2_2, var6_6);
        var4_4.add(var9_9);
        block0: while (true) {
            var2_2 += var6_6;
            while (var2_2 < var3_3) {
                var6_6 = ArrayDecoders.decodeVarint32(var1_1, var2_2, var5_5);
                var7_7 = var5_5.int1;
                if (var0 != var7_7) return var2_2;
                var2_2 = ArrayDecoders.decodeVarint32(var1_1, var6_6, var5_5);
                var6_6 = var5_5.int1;
                if (var6_6 < 0) throw InvalidProtocolBufferException.negativeSize();
                var7_7 = var1_1.length - var2_2;
                if (var6_6 > var7_7) throw InvalidProtocolBufferException.truncatedMessage();
                if (var6_6 == 0) {
                    var8_8 = ByteString.EMPTY;
                    var4_4.add(var8_8);
                    continue;
                }
                var9_9 = ByteString.copyFrom(var1_1, var2_2, var6_6);
                var4_4.add(var9_9);
                continue block0;
            }
            break;
        }
        return var2_2;
    }

    public static double decodeDouble(byte[] byArray, int n3) {
        return Double.longBitsToDouble(ArrayDecoders.decodeFixed64(byArray, n3));
    }

    public static int decodeDoubleList(int n3, byte[] byArray, int n4, int n7, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        internal$ProtobufList = (DoubleArrayList)internal$ProtobufList;
        double d2 = ArrayDecoders.decodeDouble(byArray, n4);
        ((DoubleArrayList)internal$ProtobufList).addDouble(d2);
        n4 += 8;
        while (n4 < n7) {
            int n8 = ArrayDecoders.decodeVarint32(byArray, n4, arrayDecoders$Registers);
            int n10 = arrayDecoders$Registers.int1;
            if (n3 != n10) break;
            double d5 = ArrayDecoders.decodeDouble(byArray, n8);
            ((DoubleArrayList)internal$ProtobufList).addDouble(d5);
            n4 = n8 + 8;
        }
        return n4;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int decodeExtension(int var0, byte[] var1_1, int var2_2, int var3_3, GeneratedMessageLite$ExtendableMessage var4_4, GeneratedMessageLite$GeneratedExtension var5_5, UnknownFieldSchema var6_6, ArrayDecoders$Registers var7_7) {
        var8_8 = var4_4.extensions;
        var9_9 = var0 >>> 3;
        var10_10 = var5_5.descriptor;
        var0 = var10_10.isRepeated();
        if (var0 && (var0 = (boolean)(var10_10 = var5_5.descriptor).isPacked())) {
            var10_10 = ArrayDecoders$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType;
            var11_11 = var5_5.getLiteType();
            var3_3 = var11_11.ordinal();
            var0 = (boolean)var10_10[var3_3];
            switch (var0) {
                default: {
                    var1_1 = new StringBuilder;
                    var1_1("Type cannot be packed: ");
                    var12_12 = var5_5.descriptor.getLiteType();
                    var1_1.append((Object)var12_12);
                    var1_1 = var1_1.toString();
                    var10_10 = new IllegalStateException((String)var1_1);
                    throw var10_10;
                }
                case 14: {
                    var10_10 = new IntArrayList();
                    var13_25 = ArrayDecoders.decodePackedVarint32List((byte[])var1_1, var2_2, (Internal$ProtobufList)var10_10, var7_7);
                    var14_26 = var5_5.descriptor.getEnumType();
                    var15_27 = var4_4;
                    var16_29 = var10_10;
                    SchemaUtil.filterUnknownEnumList(var4_4, var9_9, (List)var10_10, var14_26, null, var6_6);
                    var12_13 = var5_5.descriptor;
                    var8_8.setField(var12_13, var10_10);
                    break;
                }
                case 13: {
                    var10_10 = new LongArrayList();
                    var13_25 = ArrayDecoders.decodePackedSInt64List((byte[])var1_1, var2_2, (Internal$ProtobufList)var10_10, var7_7);
                    var12_14 = var5_5.descriptor;
                    var8_8.setField(var12_14, var10_10);
                    break;
                }
                case 12: {
                    var10_10 = new IntArrayList();
                    var13_25 = ArrayDecoders.decodePackedSInt32List((byte[])var1_1, var2_2, (Internal$ProtobufList)var10_10, var7_7);
                    var12_15 = var5_5.descriptor;
                    var8_8.setField(var12_15, var10_10);
                    break;
                }
                case 11: {
                    var10_10 = new BooleanArrayList();
                    var13_25 = ArrayDecoders.decodePackedBoolList((byte[])var1_1, var2_2, (Internal$ProtobufList)var10_10, var7_7);
                    var12_16 = var5_5.descriptor;
                    var8_8.setField(var12_16, var10_10);
                    break;
                }
                case 9: 
                case 10: {
                    var10_10 = new IntArrayList();
                    var13_25 = ArrayDecoders.decodePackedFixed32List((byte[])var1_1, var2_2, (Internal$ProtobufList)var10_10, var7_7);
                    var12_17 = var5_5.descriptor;
                    var8_8.setField(var12_17, var10_10);
                    break;
                }
                case 7: 
                case 8: {
                    var10_10 = new LongArrayList();
                    var13_25 = ArrayDecoders.decodePackedFixed64List((byte[])var1_1, var2_2, (Internal$ProtobufList)var10_10, var7_7);
                    var12_18 = var5_5.descriptor;
                    var8_8.setField(var12_18, var10_10);
                    break;
                }
                case 5: 
                case 6: {
                    var10_10 = new IntArrayList();
                    var13_25 = ArrayDecoders.decodePackedVarint32List((byte[])var1_1, var2_2, (Internal$ProtobufList)var10_10, var7_7);
                    var12_19 = var5_5.descriptor;
                    var8_8.setField(var12_19, var10_10);
                    break;
                }
                case 3: 
                case 4: {
                    var10_10 = new LongArrayList();
                    var13_25 = ArrayDecoders.decodePackedVarint64List((byte[])var1_1, var2_2, (Internal$ProtobufList)var10_10, var7_7);
                    var12_20 = var5_5.descriptor;
                    var8_8.setField(var12_20, var10_10);
                    break;
                }
                case 2: {
                    var10_10 = new FloatArrayList();
                    var13_25 = ArrayDecoders.decodePackedFloatList((byte[])var1_1, var2_2, (Internal$ProtobufList)var10_10, var7_7);
                    var12_21 = var5_5.descriptor;
                    var8_8.setField(var12_21, var10_10);
                    break;
                }
                case 1: {
                    var10_10 = new DoubleArrayList();
                    var13_25 = ArrayDecoders.decodePackedDoubleList((byte[])var1_1, var2_2, (Internal$ProtobufList)var10_10, var7_7);
                    var12_22 = var5_5.descriptor;
                    var8_8.setField(var12_22, var10_10);
                    break;
                }
            }
        } else {
            var10_10 = var5_5.getLiteType();
            var15_28 /* !! */  = WireFormat$FieldType.ENUM;
            var16_30 = null;
            if (var10_10 == var15_28 /* !! */ ) {
                var2_2 = ArrayDecoders.decodeVarint32((byte[])var1_1, var2_2, var7_7);
                var10_10 = var5_5.descriptor.getEnumType();
                var13_25 = var7_7.int1;
                if ((var10_10 = var10_10.findValueByNumber(var13_25)) == null) {
                    var0 = var7_7.int1;
                    SchemaUtil.storeUnknownEnum(var4_4, var9_9, (int)var0, null, var6_6);
                    return var2_2;
                }
                var0 = var7_7.int1;
                var16_30 = (int)var0;
            } else {
                var10_10 = ArrayDecoders$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType;
                var4_4 = var5_5.getLiteType();
                var17_31 = var4_4.ordinal();
                var0 = (boolean)var10_10[var17_31];
                block12 : switch (var0) {
                    default: {
                        break;
                    }
                    case 18: {
                        var10_10 = Protobuf.getInstance();
                        var4_4 = var5_5.getMessageDefaultInstance().getClass();
                        var18_32 = var10_10.schemaFor((Class)var4_4);
                        var0 = var5_5.isRepeated();
                        if (var0) {
                            var0 = ArrayDecoders.decodeMessageField(var18_32, (byte[])var1_1, var2_2, var3_3, var7_7);
                            var1_1 = var5_5.descriptor;
                            var12_23 = var7_7.object1;
                            var8_8.addRepeatedField((FieldSet$FieldDescriptorLite)var1_1, var12_23);
                        } else {
                            var10_10 = var5_5.descriptor;
                            if ((var10_10 = var8_8.getField((FieldSet$FieldDescriptorLite)var10_10)) == null) {
                                var10_10 = var18_32.newInstance();
                                var4_4 = var5_5.descriptor;
                                var8_8.setField((FieldSet$FieldDescriptorLite)var4_4, var10_10);
                            }
                            var15_28 /* !! */  = var10_10;
                            var16_30 = var1_1;
                            var0 = ArrayDecoders.mergeMessageField(var10_10, var18_32, (byte[])var1_1, var2_2, var3_3, var7_7);
                        }
                        return (int)var0;
                    }
                    case 17: {
                        var19_34 = var9_9 << 3 | 4;
                        var10_10 = Protobuf.getInstance();
                        var4_4 = var5_5.getMessageDefaultInstance().getClass();
                        var18_33 = var10_10.schemaFor((Class)var4_4);
                        var0 = var5_5.isRepeated();
                        if (var0) {
                            var15_28 /* !! */  = var18_33;
                            var18_33 = var1_1;
                            var0 = ArrayDecoders.decodeGroupField((Schema)var15_28 /* !! */ , (byte[])var1_1, var2_2, var3_3, var19_34, var7_7);
                            var1_1 = var5_5.descriptor;
                            var12_24 = var7_7.object1;
                            var8_8.addRepeatedField((FieldSet$FieldDescriptorLite)var1_1, var12_24);
                        } else {
                            var10_10 = var5_5.descriptor;
                            if ((var10_10 = var8_8.getField((FieldSet$FieldDescriptorLite)var10_10)) == null) {
                                var10_10 = var18_33.newInstance();
                                var4_4 = var5_5.descriptor;
                                var8_8.setField((FieldSet$FieldDescriptorLite)var4_4, var10_10);
                            }
                            var15_28 /* !! */  = var10_10;
                            var16_30 = var1_1;
                            var0 = ArrayDecoders.mergeGroupField(var10_10, (Schema)var18_33, (byte[])var1_1, var2_2, var3_3, var19_34, var7_7);
                        }
                        return (int)var0;
                    }
                    case 16: {
                        var2_2 = ArrayDecoders.decodeString((byte[])var1_1, var2_2, var7_7);
                        var16_30 = var7_7.object1;
                        break;
                    }
                    case 15: {
                        var2_2 = ArrayDecoders.decodeBytes((byte[])var1_1, var2_2, var7_7);
                        var16_30 = var7_7.object1;
                        break;
                    }
                    case 14: {
                        var10_10 = new IllegalStateException("Shouldn't reach here.");
                        throw var10_10;
                    }
                    case 13: {
                        var2_2 = ArrayDecoders.decodeVarint64((byte[])var1_1, var2_2, var7_7);
                        var20_35 = CodedInputStream.decodeZigZag64(var7_7.long1);
                        var16_30 = var20_35;
                        break;
                    }
                    case 12: {
                        var2_2 = ArrayDecoders.decodeVarint32((byte[])var1_1, var2_2, var7_7);
                        var0 = CodedInputStream.decodeZigZag32(var7_7.int1);
                        var16_30 = (int)var0;
                        break;
                    }
                    case 11: {
                        var2_2 = ArrayDecoders.decodeVarint64((byte[])var1_1, var2_2, var7_7);
                        var20_36 = var7_7.long1;
                        var22_39 = 0L;
                        var24_40 = var20_36 == var22_39 ? 0 : (var20_36 < var22_39 ? -1 : 1);
                        if (var24_40 != false) {
                            var0 = true;
                            var25_41 = 1.4E-45f;
                        } else {
                            var0 = false;
                            var25_42 = 0.0f;
                            var10_10 = null;
                        }
                        var16_30 = var0;
                        break;
                    }
                    case 9: 
                    case 10: {
                        var0 = ArrayDecoders.decodeFixed32((byte[])var1_1, var2_2);
                        var16_30 = (int)var0;
lbl189:
                        // 2 sources

                        while (true) {
                            var2_2 += 4;
                            break block12;
                            break;
                        }
                    }
                    case 7: 
                    case 8: {
                        var20_37 = ArrayDecoders.decodeFixed64((byte[])var1_1, var2_2);
                        var16_30 = var20_37;
lbl195:
                        // 2 sources

                        while (true) {
                            var2_2 += 8;
                            break block12;
                            break;
                        }
                    }
                    case 5: 
                    case 6: {
                        var2_2 = ArrayDecoders.decodeVarint32((byte[])var1_1, var2_2, var7_7);
                        var0 = var7_7.int1;
                        var16_30 = (int)var0;
                        break;
                    }
                    case 3: 
                    case 4: {
                        var2_2 = ArrayDecoders.decodeVarint64((byte[])var1_1, var2_2, var7_7);
                        var20_38 = var7_7.long1;
                        var16_30 = var20_38;
                        break;
                    }
                    case 2: {
                        var25_43 = ArrayDecoders.decodeFloat((byte[])var1_1, var2_2);
                        var16_30 = Float.valueOf(var25_43);
                        ** continue;
                    }
                    case 1: {
                        var26_44 = ArrayDecoders.decodeDouble((byte[])var1_1, var2_2);
                        var16_30 = var26_44;
                        ** continue;
                    }
                }
            }
            var0 = var5_5.isRepeated();
            if (var0) {
                var10_10 = var5_5.descriptor;
                var8_8.addRepeatedField((FieldSet$FieldDescriptorLite)var10_10, var16_30);
            } else {
                var10_10 = var5_5.descriptor;
                var8_8.setField((FieldSet$FieldDescriptorLite)var10_10, var16_30);
            }
            var13_25 = var2_2;
        }
        return var13_25;
    }

    public static int decodeExtensionOrUnknownField(int n3, byte[] byArray, int n4, int n7, Object object, MessageLite messageLite, UnknownFieldSchema unknownFieldSchema, ArrayDecoders$Registers arrayDecoders$Registers) {
        Object object2 = arrayDecoders$Registers.extensionRegistry;
        int n8 = n3 >>> 3;
        Object object3 = ((ExtensionRegistryLite)object2).findLiteExtensionByNumber(messageLite, n8);
        if (object3 == null) {
            UnknownFieldSetLite unknownFieldSetLite = MessageSchema.getMutableUnknownFields(object);
            n8 = n3;
            object2 = byArray;
            object3 = arrayDecoders$Registers;
            return ArrayDecoders.decodeUnknownField(n3, byArray, n4, n7, unknownFieldSetLite, arrayDecoders$Registers);
        }
        Object object4 = object;
        object4 = (GeneratedMessageLite$ExtendableMessage)object;
        ((GeneratedMessageLite$ExtendableMessage)object4).ensureExtensionsAreMutable();
        n8 = n3;
        object2 = byArray;
        return ArrayDecoders.decodeExtension(n3, byArray, n4, n7, (GeneratedMessageLite$ExtendableMessage)object4, (GeneratedMessageLite$GeneratedExtension)object3, unknownFieldSchema, arrayDecoders$Registers);
    }

    public static int decodeFixed32(byte[] byArray, int n3) {
        int n4 = byArray[n3] & 0xFF;
        int n7 = n3 + 1;
        n7 = (byArray[n7] & 0xFF) << 8;
        n4 |= n7;
        n7 = n3 + 2;
        n7 = (byArray[n7] & 0xFF) << 16;
        return (byArray[n3 += 3] & 0xFF) << 24 | (n4 |= n7);
    }

    public static int decodeFixed32List(int n3, byte[] byArray, int n4, int n7, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        internal$ProtobufList = (IntArrayList)internal$ProtobufList;
        int n8 = ArrayDecoders.decodeFixed32(byArray, n4);
        ((IntArrayList)internal$ProtobufList).addInt(n8);
        n4 += 4;
        while (n4 < n7) {
            n8 = ArrayDecoders.decodeVarint32(byArray, n4, arrayDecoders$Registers);
            int n10 = arrayDecoders$Registers.int1;
            if (n3 != n10) break;
            n4 = ArrayDecoders.decodeFixed32(byArray, n8);
            ((IntArrayList)internal$ProtobufList).addInt(n4);
            n4 = n8 + 4;
        }
        return n4;
    }

    public static long decodeFixed64(byte[] byArray, int n3) {
        long l2 = byArray[n3];
        long l3 = 255L;
        l2 &= l3;
        int n4 = n3 + 1;
        long l4 = ((long)byArray[n4] & l3) << 8;
        l2 |= l4;
        n4 = n3 + 2;
        l4 = ((long)byArray[n4] & l3) << 16;
        l2 |= l4;
        n4 = n3 + 3;
        l4 = ((long)byArray[n4] & l3) << 24;
        l2 |= l4;
        n4 = n3 + 4;
        l4 = ((long)byArray[n4] & l3) << 32;
        l2 |= l4;
        n4 = n3 + 5;
        l4 = ((long)byArray[n4] & l3) << 40;
        l2 |= l4;
        n4 = n3 + 6;
        l4 = ((long)byArray[n4] & l3) << 48;
        return ((long)byArray[n3 += 7] & l3) << 56 | (l2 |= l4);
    }

    public static int decodeFixed64List(int n3, byte[] byArray, int n4, int n7, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        internal$ProtobufList = (LongArrayList)internal$ProtobufList;
        long l2 = ArrayDecoders.decodeFixed64(byArray, n4);
        ((LongArrayList)internal$ProtobufList).addLong(l2);
        n4 += 8;
        while (n4 < n7) {
            int n8 = ArrayDecoders.decodeVarint32(byArray, n4, arrayDecoders$Registers);
            int n10 = arrayDecoders$Registers.int1;
            if (n3 != n10) break;
            long l3 = ArrayDecoders.decodeFixed64(byArray, n8);
            ((LongArrayList)internal$ProtobufList).addLong(l3);
            n4 = n8 + 8;
        }
        return n4;
    }

    public static float decodeFloat(byte[] byArray, int n3) {
        return Float.intBitsToFloat(ArrayDecoders.decodeFixed32(byArray, n3));
    }

    public static int decodeFloatList(int n3, byte[] byArray, int n4, int n7, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        internal$ProtobufList = (FloatArrayList)internal$ProtobufList;
        float f5 = ArrayDecoders.decodeFloat(byArray, n4);
        ((FloatArrayList)internal$ProtobufList).addFloat(f5);
        n4 += 4;
        while (n4 < n7) {
            int n8 = ArrayDecoders.decodeVarint32(byArray, n4, arrayDecoders$Registers);
            int n10 = arrayDecoders$Registers.int1;
            if (n3 != n10) break;
            float f6 = ArrayDecoders.decodeFloat(byArray, n8);
            ((FloatArrayList)internal$ProtobufList).addFloat(f6);
            n4 = n8 + 4;
        }
        return n4;
    }

    public static int decodeGroupField(Schema schema, byte[] byArray, int n3, int n4, int n7, ArrayDecoders$Registers arrayDecoders$Registers) {
        Object object = schema.newInstance();
        int n8 = ArrayDecoders.mergeGroupField(object, schema, byArray, n3, n4, n7, arrayDecoders$Registers);
        schema.makeImmutable(object);
        arrayDecoders$Registers.object1 = object;
        return n8;
    }

    public static int decodeGroupList(Schema schema, int n3, byte[] byArray, int n4, int n7, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        int n8 = n3 & 0xFFFFFFF8 | 4;
        Object object = schema;
        int n10 = n4;
        n4 = ArrayDecoders.decodeGroupField(schema, byArray, n4, n7, n8, arrayDecoders$Registers);
        object = arrayDecoders$Registers.object1;
        internal$ProtobufList.add(object);
        while (n4 < n7) {
            n10 = ArrayDecoders.decodeVarint32(byArray, n4, arrayDecoders$Registers);
            int n14 = arrayDecoders$Registers.int1;
            if (n3 != n14) break;
            object = schema;
            n4 = ArrayDecoders.decodeGroupField(schema, byArray, n10, n7, n8, arrayDecoders$Registers);
            object = arrayDecoders$Registers.object1;
            internal$ProtobufList.add(object);
        }
        return n4;
    }

    public static int decodeMessageField(Schema schema, byte[] byArray, int n3, int n4, ArrayDecoders$Registers arrayDecoders$Registers) {
        Object object = schema.newInstance();
        int n7 = ArrayDecoders.mergeMessageField(object, schema, byArray, n3, n4, arrayDecoders$Registers);
        schema.makeImmutable(object);
        arrayDecoders$Registers.object1 = object;
        return n7;
    }

    public static int decodeMessageList(Schema schema, int n3, byte[] byArray, int n4, int n7, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        n4 = ArrayDecoders.decodeMessageField(schema, byArray, n4, n7, arrayDecoders$Registers);
        Object object = arrayDecoders$Registers.object1;
        internal$ProtobufList.add(object);
        while (n4 < n7) {
            int n8 = ArrayDecoders.decodeVarint32(byArray, n4, arrayDecoders$Registers);
            int n10 = arrayDecoders$Registers.int1;
            if (n3 != n10) break;
            n4 = ArrayDecoders.decodeMessageField(schema, byArray, n8, n7, arrayDecoders$Registers);
            object = arrayDecoders$Registers.object1;
            internal$ProtobufList.add(object);
        }
        return n4;
    }

    public static int decodePackedBoolList(byte[] byArray, int n3, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        internal$ProtobufList = (BooleanArrayList)internal$ProtobufList;
        n3 = ArrayDecoders.decodeVarint32(byArray, n3, arrayDecoders$Registers);
        int n4 = arrayDecoders$Registers.int1 + n3;
        while (n3 < n4) {
            n3 = ArrayDecoders.decodeVarint64(byArray, n3, arrayDecoders$Registers);
            long l2 = arrayDecoders$Registers.long1;
            long l3 = 0L;
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            boolean bl2 = object != false;
            ((BooleanArrayList)internal$ProtobufList).addBoolean(bl2);
        }
        if (n3 == n4) {
            return n3;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedDoubleList(byte[] byArray, int n3, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        internal$ProtobufList = (DoubleArrayList)internal$ProtobufList;
        int n4 = arrayDecoders$Registers.int1 + n3;
        for (n3 = ArrayDecoders.decodeVarint32(byArray, n3, arrayDecoders$Registers); n3 < n4; n3 += 8) {
            double d2 = ArrayDecoders.decodeDouble(byArray, n3);
            ((DoubleArrayList)internal$ProtobufList).addDouble(d2);
        }
        if (n3 == n4) {
            return n3;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFixed32List(byte[] byArray, int n3, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        internal$ProtobufList = (IntArrayList)internal$ProtobufList;
        int n4 = arrayDecoders$Registers.int1 + n3;
        for (n3 = ArrayDecoders.decodeVarint32(byArray, n3, arrayDecoders$Registers); n3 < n4; n3 += 4) {
            int n7 = ArrayDecoders.decodeFixed32(byArray, n3);
            ((IntArrayList)internal$ProtobufList).addInt(n7);
        }
        if (n3 == n4) {
            return n3;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFixed64List(byte[] byArray, int n3, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        internal$ProtobufList = (LongArrayList)internal$ProtobufList;
        int n4 = arrayDecoders$Registers.int1 + n3;
        for (n3 = ArrayDecoders.decodeVarint32(byArray, n3, arrayDecoders$Registers); n3 < n4; n3 += 8) {
            long l2 = ArrayDecoders.decodeFixed64(byArray, n3);
            ((LongArrayList)internal$ProtobufList).addLong(l2);
        }
        if (n3 == n4) {
            return n3;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFloatList(byte[] byArray, int n3, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        internal$ProtobufList = (FloatArrayList)internal$ProtobufList;
        int n4 = arrayDecoders$Registers.int1 + n3;
        for (n3 = ArrayDecoders.decodeVarint32(byArray, n3, arrayDecoders$Registers); n3 < n4; n3 += 4) {
            float f5 = ArrayDecoders.decodeFloat(byArray, n3);
            ((FloatArrayList)internal$ProtobufList).addFloat(f5);
        }
        if (n3 == n4) {
            return n3;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedSInt32List(byte[] byArray, int n3, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        internal$ProtobufList = (IntArrayList)internal$ProtobufList;
        n3 = ArrayDecoders.decodeVarint32(byArray, n3, arrayDecoders$Registers);
        int n4 = arrayDecoders$Registers.int1 + n3;
        while (n3 < n4) {
            n3 = ArrayDecoders.decodeVarint32(byArray, n3, arrayDecoders$Registers);
            int n7 = CodedInputStream.decodeZigZag32(arrayDecoders$Registers.int1);
            ((IntArrayList)internal$ProtobufList).addInt(n7);
        }
        if (n3 == n4) {
            return n3;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedSInt64List(byte[] byArray, int n3, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        internal$ProtobufList = (LongArrayList)internal$ProtobufList;
        n3 = ArrayDecoders.decodeVarint32(byArray, n3, arrayDecoders$Registers);
        int n4 = arrayDecoders$Registers.int1 + n3;
        while (n3 < n4) {
            n3 = ArrayDecoders.decodeVarint64(byArray, n3, arrayDecoders$Registers);
            long l2 = CodedInputStream.decodeZigZag64(arrayDecoders$Registers.long1);
            ((LongArrayList)internal$ProtobufList).addLong(l2);
        }
        if (n3 == n4) {
            return n3;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedVarint32List(byte[] byArray, int n3, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        internal$ProtobufList = (IntArrayList)internal$ProtobufList;
        n3 = ArrayDecoders.decodeVarint32(byArray, n3, arrayDecoders$Registers);
        int n4 = arrayDecoders$Registers.int1 + n3;
        while (n3 < n4) {
            n3 = ArrayDecoders.decodeVarint32(byArray, n3, arrayDecoders$Registers);
            int n7 = arrayDecoders$Registers.int1;
            ((IntArrayList)internal$ProtobufList).addInt(n7);
        }
        if (n3 == n4) {
            return n3;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedVarint64List(byte[] byArray, int n3, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        internal$ProtobufList = (LongArrayList)internal$ProtobufList;
        n3 = ArrayDecoders.decodeVarint32(byArray, n3, arrayDecoders$Registers);
        int n4 = arrayDecoders$Registers.int1 + n3;
        while (n3 < n4) {
            n3 = ArrayDecoders.decodeVarint64(byArray, n3, arrayDecoders$Registers);
            long l2 = arrayDecoders$Registers.long1;
            ((LongArrayList)internal$ProtobufList).addLong(l2);
        }
        if (n3 == n4) {
            return n3;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodeSInt32List(int n3, byte[] byArray, int n4, int n7, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        internal$ProtobufList = (IntArrayList)internal$ProtobufList;
        n4 = ArrayDecoders.decodeVarint32(byArray, n4, arrayDecoders$Registers);
        int n8 = CodedInputStream.decodeZigZag32(arrayDecoders$Registers.int1);
        ((IntArrayList)internal$ProtobufList).addInt(n8);
        while (n4 < n7) {
            n8 = ArrayDecoders.decodeVarint32(byArray, n4, arrayDecoders$Registers);
            int n10 = arrayDecoders$Registers.int1;
            if (n3 != n10) break;
            n4 = ArrayDecoders.decodeVarint32(byArray, n8, arrayDecoders$Registers);
            n8 = CodedInputStream.decodeZigZag32(arrayDecoders$Registers.int1);
            ((IntArrayList)internal$ProtobufList).addInt(n8);
        }
        return n4;
    }

    public static int decodeSInt64List(int n3, byte[] byArray, int n4, int n7, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        internal$ProtobufList = (LongArrayList)internal$ProtobufList;
        n4 = ArrayDecoders.decodeVarint64(byArray, n4, arrayDecoders$Registers);
        long l2 = CodedInputStream.decodeZigZag64(arrayDecoders$Registers.long1);
        ((LongArrayList)internal$ProtobufList).addLong(l2);
        while (n4 < n7) {
            int n8 = ArrayDecoders.decodeVarint32(byArray, n4, arrayDecoders$Registers);
            int n10 = arrayDecoders$Registers.int1;
            if (n3 != n10) break;
            n4 = ArrayDecoders.decodeVarint64(byArray, n8, arrayDecoders$Registers);
            l2 = CodedInputStream.decodeZigZag64(arrayDecoders$Registers.long1);
            ((LongArrayList)internal$ProtobufList).addLong(l2);
        }
        return n4;
    }

    public static int decodeString(byte[] byArray, int n3, ArrayDecoders$Registers arrayDecoders$Registers) {
        n3 = ArrayDecoders.decodeVarint32(byArray, n3, arrayDecoders$Registers);
        int n4 = arrayDecoders$Registers.int1;
        if (n4 >= 0) {
            if (n4 == 0) {
                arrayDecoders$Registers.object1 = "";
                return n3;
            }
            Charset charset = Internal.UTF_8;
            String string2 = new String(byArray, n3, n4, charset);
            arrayDecoders$Registers.object1 = string2;
            return n3 + n4;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int decodeStringList(int var0, byte[] var1_1, int var2_2, int var3_3, Internal$ProtobufList var4_4, ArrayDecoders$Registers var5_5) {
        block3: {
            var2_2 = ArrayDecoders.decodeVarint32(var1_1, var2_2, var5_5);
            var6_6 = var5_5.int1;
            if (var6_6 < 0) throw InvalidProtocolBufferException.negativeSize();
            var7_7 = "";
            if (var6_6 != 0) break block3;
            var4_4.add(var7_7);
            ** GOTO lbl16
        }
        var9_9 = Internal.UTF_8;
        var8_8 = new String(var1_1, var2_2, var6_6, var9_9);
        var4_4.add(var8_8);
        block0: while (true) {
            var2_2 += var6_6;
            while (var2_2 < var3_3) {
                var6_6 = ArrayDecoders.decodeVarint32(var1_1, var2_2, var5_5);
                var10_10 = var5_5.int1;
                if (var0 != var10_10) return var2_2;
                var2_2 = ArrayDecoders.decodeVarint32(var1_1, var6_6, var5_5);
                var6_6 = var5_5.int1;
                if (var6_6 < 0) throw InvalidProtocolBufferException.negativeSize();
                if (var6_6 == 0) {
                    var4_4.add(var7_7);
                    continue;
                }
                var9_9 = Internal.UTF_8;
                var8_8 = new String(var1_1, var2_2, var6_6, var9_9);
                var4_4.add(var8_8);
                continue block0;
            }
            break;
        }
        return var2_2;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int decodeStringListRequireUtf8(int var0, byte[] var1_1, int var2_2, int var3_3, Internal$ProtobufList var4_4, ArrayDecoders$Registers var5_5) {
        block3: {
            var2_2 = ArrayDecoders.decodeVarint32(var1_1, var2_2, var5_5);
            var6_6 = var5_5.int1;
            if (var6_6 < 0) throw InvalidProtocolBufferException.negativeSize();
            var7_7 = "";
            if (var6_6 != 0) break block3;
            var4_4.add(var7_7);
            ** GOTO lbl19
        }
        var8_8 = var2_2 + var6_6;
        var9_9 = Utf8.isValidUtf8(var1_1, var2_2, var8_8);
        if (!var9_9) throw InvalidProtocolBufferException.invalidUtf8();
        var11_11 = Internal.UTF_8;
        var10_10 = new String(var1_1, var2_2, var6_6, var11_11);
        var4_4.add(var10_10);
        block0: while (true) {
            var2_2 = var8_8;
            while (var2_2 < var3_3) {
                var6_6 = ArrayDecoders.decodeVarint32(var1_1, var2_2, var5_5);
                var8_8 = var5_5.int1;
                if (var0 != var8_8) return var2_2;
                var2_2 = ArrayDecoders.decodeVarint32(var1_1, var6_6, var5_5);
                var6_6 = var5_5.int1;
                if (var6_6 < 0) throw InvalidProtocolBufferException.negativeSize();
                if (var6_6 == 0) {
                    var4_4.add(var7_7);
                    continue;
                }
                var8_8 = var2_2 + var6_6;
                var9_9 = Utf8.isValidUtf8(var1_1, var2_2, var8_8);
                if (!var9_9) throw InvalidProtocolBufferException.invalidUtf8();
                var11_11 = Internal.UTF_8;
                var10_10 = new String(var1_1, var2_2, var6_6, var11_11);
                var4_4.add(var10_10);
                continue block0;
            }
            break;
        }
        return var2_2;
    }

    public static int decodeStringRequireUtf8(byte[] object, int n3, ArrayDecoders$Registers arrayDecoders$Registers) {
        n3 = ArrayDecoders.decodeVarint32(object, n3, arrayDecoders$Registers);
        int n4 = arrayDecoders$Registers.int1;
        if (n4 >= 0) {
            if (n4 == 0) {
                arrayDecoders$Registers.object1 = "";
                return n3;
            }
            object = Utf8.decodeUtf8(object, n3, n4);
            arrayDecoders$Registers.object1 = object;
            return n3 + n4;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public static int decodeUnknownField(int n3, byte[] object, int n4, int n7, UnknownFieldSetLite unknownFieldSetLite, ArrayDecoders$Registers arrayDecoders$Registers) {
        int n8 = WireFormat.getTagFieldNumber(n3);
        if (n8 != 0) {
            n8 = WireFormat.getTagWireType(n3);
            if (n8 != 0) {
                int n10 = 1;
                if (n8 != n10) {
                    int n14 = 2;
                    if (n8 != n14) {
                        int n15;
                        n14 = 3;
                        if (n8 != n14) {
                            n7 = 5;
                            if (n8 == n7) {
                                object = ArrayDecoders.decodeFixed32(object, n4);
                                unknownFieldSetLite.storeField(n3, object);
                                return n4 + 4;
                            }
                            throw InvalidProtocolBufferException.invalidTag();
                        }
                        UnknownFieldSetLite unknownFieldSetLite2 = UnknownFieldSetLite.newInstance();
                        int n16 = n3 & 0xFFFFFFF8 | 4;
                        arrayDecoders$Registers.recursionDepth = n14 = arrayDecoders$Registers.recursionDepth + n10;
                        ArrayDecoders.checkRecursionLimit(n14);
                        n14 = 0;
                        while (n4 < n7) {
                            int n17 = ArrayDecoders.decodeVarint32(object, n4, arrayDecoders$Registers);
                            n4 = arrayDecoders$Registers.int1;
                            if (n4 == n16) {
                                n14 = n4;
                                n4 = n17;
                                break;
                            }
                            n14 = n4;
                            int n18 = ArrayDecoders.decodeUnknownField(n4, object, n17, n7, unknownFieldSetLite2, arrayDecoders$Registers);
                            n14 = n4;
                            n4 = n18;
                        }
                        arrayDecoders$Registers.recursionDepth = n15 = arrayDecoders$Registers.recursionDepth - n10;
                        if (n4 <= n7 && n14 == n16) {
                            unknownFieldSetLite.storeField(n3, unknownFieldSetLite2);
                            return n4;
                        }
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    n4 = ArrayDecoders.decodeVarint32(object, n4, arrayDecoders$Registers);
                    n7 = arrayDecoders$Registers.int1;
                    if (n7 >= 0) {
                        int n19 = ((byte[])object).length - n4;
                        if (n7 <= n19) {
                            if (n7 == 0) {
                                object = ByteString.EMPTY;
                                unknownFieldSetLite.storeField(n3, object);
                            } else {
                                object = ByteString.copyFrom(object, n4, n7);
                                unknownFieldSetLite.storeField(n3, object);
                            }
                            return n4 + n7;
                        }
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    throw InvalidProtocolBufferException.negativeSize();
                }
                object = ArrayDecoders.decodeFixed64(object, n4);
                unknownFieldSetLite.storeField(n3, object);
                return n4 + 8;
            }
            int n20 = ArrayDecoders.decodeVarint64(object, n4, arrayDecoders$Registers);
            Long l2 = arrayDecoders$Registers.long1;
            unknownFieldSetLite.storeField(n3, l2);
            return n20;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public static int decodeVarint32(int n3, byte[] byArray, int n4, ArrayDecoders$Registers arrayDecoders$Registers) {
        n3 &= 0x7F;
        int n7 = n4 + 1;
        int n8 = byArray[n4];
        if (n8 >= 0) {
            int n10 = n8 << 7;
            arrayDecoders$Registers.int1 = n3 |= n10;
            return n7;
        }
        n8 = (n8 & 0x7F) << 7;
        n3 |= n8;
        n8 = n4 + 2;
        if ((n7 = byArray[n7]) >= 0) {
            int n14 = n7 << 14;
            arrayDecoders$Registers.int1 = n3 |= n14;
            return n8;
        }
        n7 = (n7 & 0x7F) << 14;
        n3 |= n7;
        n7 = n4 + 3;
        if ((n8 = byArray[n8]) >= 0) {
            int n15 = n8 << 21;
            arrayDecoders$Registers.int1 = n3 |= n15;
            return n7;
        }
        n8 = (n8 & 0x7F) << 21;
        n3 |= n8;
        n4 += 4;
        if ((n7 = byArray[n7]) >= 0) {
            int n16 = n7 << 28;
            arrayDecoders$Registers.int1 = n3 |= n16;
            return n4;
        }
        n7 = (n7 & 0x7F) << 28;
        n3 |= n7;
        while (true) {
            n7 = n4 + 1;
            if ((n4 = byArray[n4]) >= 0) break;
            n4 = n7;
        }
        arrayDecoders$Registers.int1 = n3;
        return n7;
    }

    public static int decodeVarint32(byte[] byArray, int n3, ArrayDecoders$Registers arrayDecoders$Registers) {
        int n4 = n3 + 1;
        if ((n3 = byArray[n3]) >= 0) {
            arrayDecoders$Registers.int1 = n3;
            return n4;
        }
        return ArrayDecoders.decodeVarint32(n3, byArray, n4, arrayDecoders$Registers);
    }

    public static int decodeVarint32List(int n3, byte[] byArray, int n4, int n7, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        internal$ProtobufList = (IntArrayList)internal$ProtobufList;
        n4 = ArrayDecoders.decodeVarint32(byArray, n4, arrayDecoders$Registers);
        int n8 = arrayDecoders$Registers.int1;
        ((IntArrayList)internal$ProtobufList).addInt(n8);
        while (n4 < n7) {
            n8 = ArrayDecoders.decodeVarint32(byArray, n4, arrayDecoders$Registers);
            int n10 = arrayDecoders$Registers.int1;
            if (n3 != n10) break;
            n4 = ArrayDecoders.decodeVarint32(byArray, n8, arrayDecoders$Registers);
            n8 = arrayDecoders$Registers.int1;
            ((IntArrayList)internal$ProtobufList).addInt(n8);
        }
        return n4;
    }

    public static int decodeVarint64(long l2, byte[] byArray, int n3, ArrayDecoders$Registers arrayDecoders$Registers) {
        long l3 = 127;
        l2 &= l3;
        int n4 = n3 + 1;
        n3 = byArray[n3];
        long l4 = n3 & 0x7F;
        int n7 = 7;
        l2 |= (l4 <<= n7);
        int n8 = 7;
        while (n3 < 0) {
            n3 = n4 + 1;
            n4 = byArray[n4];
            int n10 = n4 & 0x7F;
            long l7 = (long)n10 << (n8 += n7);
            l2 |= l7;
            int n14 = n4;
            n4 = n3;
            n3 = n14;
        }
        arrayDecoders$Registers.long1 = l2;
        return n4;
    }

    public static int decodeVarint64(byte[] byArray, int n3, ArrayDecoders$Registers arrayDecoders$Registers) {
        int n4 = n3 + 1;
        long l2 = byArray[n3];
        long l3 = 0L;
        long l4 = l2 - l3;
        if ((n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1))) >= 0) {
            arrayDecoders$Registers.long1 = l2;
            return n4;
        }
        return ArrayDecoders.decodeVarint64(l2, byArray, n4, arrayDecoders$Registers);
    }

    public static int decodeVarint64List(int n3, byte[] byArray, int n4, int n7, Internal$ProtobufList internal$ProtobufList, ArrayDecoders$Registers arrayDecoders$Registers) {
        internal$ProtobufList = (LongArrayList)internal$ProtobufList;
        n4 = ArrayDecoders.decodeVarint64(byArray, n4, arrayDecoders$Registers);
        long l2 = arrayDecoders$Registers.long1;
        ((LongArrayList)internal$ProtobufList).addLong(l2);
        while (n4 < n7) {
            int n8 = ArrayDecoders.decodeVarint32(byArray, n4, arrayDecoders$Registers);
            int n10 = arrayDecoders$Registers.int1;
            if (n3 != n10) break;
            n4 = ArrayDecoders.decodeVarint64(byArray, n8, arrayDecoders$Registers);
            l2 = arrayDecoders$Registers.long1;
            ((LongArrayList)internal$ProtobufList).addLong(l2);
        }
        return n4;
    }

    public static int mergeGroupField(Object object, Schema schema, byte[] byArray, int n3, int n4, int n7, ArrayDecoders$Registers arrayDecoders$Registers) {
        int n8;
        int n10;
        Schema schema2 = schema;
        schema2 = (MessageSchema)schema;
        arrayDecoders$Registers.recursionDepth = n10 = arrayDecoders$Registers.recursionDepth + 1;
        ArrayDecoders.checkRecursionLimit(n10);
        n10 = ((MessageSchema)schema2).parseMessage(object, byArray, n3, n4, n7, arrayDecoders$Registers);
        arrayDecoders$Registers.recursionDepth = n8 = arrayDecoders$Registers.recursionDepth + -1;
        arrayDecoders$Registers.object1 = object;
        return n10;
    }

    public static int mergeMessageField(Object object, Schema schema, byte[] byArray, int n3, int n4, ArrayDecoders$Registers arrayDecoders$Registers) {
        int n7 = n3 + 1;
        if ((n3 = byArray[n3]) < 0) {
            n7 = ArrayDecoders.decodeVarint32(n3, byArray, n7, arrayDecoders$Registers);
            n3 = arrayDecoders$Registers.int1;
        }
        if (n3 >= 0 && n3 <= (n4 -= n7)) {
            int n8;
            arrayDecoders$Registers.recursionDepth = n4 = arrayDecoders$Registers.recursionDepth + 1;
            ArrayDecoders.checkRecursionLimit(n4);
            schema.mergeFrom(object, byArray, n7, n3 += n7, arrayDecoders$Registers);
            arrayDecoders$Registers.recursionDepth = n8 = arrayDecoders$Registers.recursionDepth + -1;
            arrayDecoders$Registers.object1 = object;
            return n3;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static void setRecursionLimit(int n3) {
        recursionLimit = n3;
    }

    public static int skipField(int n3, byte[] byArray, int n4, int n7, ArrayDecoders$Registers arrayDecoders$Registers) {
        int n8 = WireFormat.getTagFieldNumber(n3);
        if (n8 != 0) {
            n8 = WireFormat.getTagWireType(n3);
            if (n8 != 0) {
                int n10 = 1;
                if (n8 != n10) {
                    n10 = 2;
                    if (n8 != n10) {
                        n10 = 3;
                        if (n8 != n10) {
                            n3 = 5;
                            if (n8 == n3) {
                                return n4 + 4;
                            }
                            throw InvalidProtocolBufferException.invalidTag();
                        }
                        n3 = n3 & 0xFFFFFFF8 | 4;
                        n8 = 0;
                        while (n4 < n7) {
                            n4 = ArrayDecoders.decodeVarint32(byArray, n4, arrayDecoders$Registers);
                            n8 = arrayDecoders$Registers.int1;
                            if (n8 == n3) break;
                            n4 = ArrayDecoders.skipField(n8, byArray, n4, n7, arrayDecoders$Registers);
                        }
                        if (n4 <= n7 && n8 == n3) {
                            return n4;
                        }
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    n3 = ArrayDecoders.decodeVarint32(byArray, n4, arrayDecoders$Registers);
                    int n14 = arrayDecoders$Registers.int1;
                    return n3 + n14;
                }
                return n4 + 8;
            }
            return ArrayDecoders.decodeVarint64(byArray, n4, arrayDecoders$Registers);
        }
        throw InvalidProtocolBufferException.invalidTag();
    }
}

