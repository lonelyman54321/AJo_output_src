/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AllocatedBuffer;
import com.google.protobuf.BinaryWriter$1;
import com.google.protobuf.BinaryWriter$SafeDirectWriter;
import com.google.protobuf.BinaryWriter$SafeHeapWriter;
import com.google.protobuf.BinaryWriter$UnsafeDirectWriter;
import com.google.protobuf.BinaryWriter$UnsafeHeapWriter;
import com.google.protobuf.BooleanArrayList;
import com.google.protobuf.BufferAllocator;
import com.google.protobuf.ByteOutput;
import com.google.protobuf.ByteString;
import com.google.protobuf.DoubleArrayList;
import com.google.protobuf.FloatArrayList;
import com.google.protobuf.IntArrayList;
import com.google.protobuf.Internal;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.LongArrayList;
import com.google.protobuf.MapEntryLite$Metadata;
import com.google.protobuf.Schema;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.Writer;
import com.google.protobuf.Writer$FieldOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;

abstract class BinaryWriter
extends ByteOutput
implements Writer {
    public static final int DEFAULT_CHUNK_SIZE = 4096;
    private static final int MAP_KEY_NUMBER = 1;
    private static final int MAP_VALUE_NUMBER = 2;
    private final BufferAllocator alloc;
    final ArrayDeque buffers;
    private final int chunkSize;
    int totalDoneBytes;

    private BinaryWriter(BufferAllocator object, int n3) {
        ArrayDeque arrayDeque;
        int n4 = 4;
        this.buffers = arrayDeque = new ArrayDeque(n4);
        if (n3 > 0) {
            this.alloc = object = (BufferAllocator)Internal.checkNotNull(object, "alloc");
            this.chunkSize = n3;
            return;
        }
        object = new IllegalArgumentException("chunkSize must be > 0");
        throw object;
    }

    public /* synthetic */ BinaryWriter(BufferAllocator bufferAllocator, int n3, BinaryWriter$1 binaryWriter$1) {
        this(bufferAllocator, n3);
    }

    public static /* synthetic */ byte access$200(long l2) {
        return BinaryWriter.computeUInt64SizeNoTag(l2);
    }

    private static byte computeUInt64SizeNoTag(long l2) {
        long l3;
        int n3;
        long l4 = (long)-128 & l2;
        long l7 = 0L;
        long l8 = l4 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object == false) {
            return 1;
        }
        Object object2 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
        if (object2 < 0) {
            return 10;
        }
        l4 = 0xFFFFFFF800000000L & l2;
        long l12 = l4 - l7;
        object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object != false) {
            object2 = (byte)6;
            n3 = 28;
            l2 >>>= n3;
        } else {
            object2 = 2;
        }
        long l14 = 0xFFE00000L & l2;
        n3 = (int)(l14 == l7 ? 0 : (l14 < l7 ? -1 : 1));
        if (n3 != 0) {
            object2 = (byte)(object2 + 2);
            n3 = 14;
            l2 >>>= n3;
        }
        if ((n3 = (int)((l3 = (l2 &= (l14 = -16384L)) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1))) != 0) {
            object2 = (byte)(object2 + true);
        }
        return (byte)object2;
    }

    public static boolean isUnsafeDirectSupported() {
        return BinaryWriter$UnsafeDirectWriter.access$000();
    }

    public static boolean isUnsafeHeapSupported() {
        return BinaryWriter$UnsafeHeapWriter.isSupported();
    }

    public static BinaryWriter newDirectInstance(BufferAllocator bufferAllocator) {
        return BinaryWriter.newDirectInstance(bufferAllocator, 4096);
    }

    public static BinaryWriter newDirectInstance(BufferAllocator object, int n3) {
        boolean bl2 = BinaryWriter.isUnsafeDirectSupported();
        object = bl2 ? BinaryWriter.newUnsafeDirectInstance((BufferAllocator)object, n3) : BinaryWriter.newSafeDirectInstance((BufferAllocator)object, n3);
        return object;
    }

    public static BinaryWriter newHeapInstance(BufferAllocator bufferAllocator) {
        return BinaryWriter.newHeapInstance(bufferAllocator, 4096);
    }

    public static BinaryWriter newHeapInstance(BufferAllocator object, int n3) {
        boolean bl2 = BinaryWriter.isUnsafeHeapSupported();
        object = bl2 ? BinaryWriter.newUnsafeHeapInstance((BufferAllocator)object, n3) : BinaryWriter.newSafeHeapInstance((BufferAllocator)object, n3);
        return object;
    }

    public static BinaryWriter newSafeDirectInstance(BufferAllocator bufferAllocator, int n3) {
        BinaryWriter$SafeDirectWriter binaryWriter$SafeDirectWriter = new BinaryWriter$SafeDirectWriter(bufferAllocator, n3);
        return binaryWriter$SafeDirectWriter;
    }

    public static BinaryWriter newSafeHeapInstance(BufferAllocator bufferAllocator, int n3) {
        BinaryWriter$SafeHeapWriter binaryWriter$SafeHeapWriter = new BinaryWriter$SafeHeapWriter(bufferAllocator, n3);
        return binaryWriter$SafeHeapWriter;
    }

    public static BinaryWriter newUnsafeDirectInstance(BufferAllocator object, int n3) {
        boolean bl2 = BinaryWriter.isUnsafeDirectSupported();
        if (bl2) {
            BinaryWriter$UnsafeDirectWriter binaryWriter$UnsafeDirectWriter = new BinaryWriter$UnsafeDirectWriter((BufferAllocator)object, n3);
            return binaryWriter$UnsafeDirectWriter;
        }
        object = new UnsupportedOperationException("Unsafe operations not supported");
        throw object;
    }

    public static BinaryWriter newUnsafeHeapInstance(BufferAllocator object, int n3) {
        boolean bl2 = BinaryWriter.isUnsafeHeapSupported();
        if (bl2) {
            BinaryWriter$UnsafeHeapWriter binaryWriter$UnsafeHeapWriter = new BinaryWriter$UnsafeHeapWriter((BufferAllocator)object, n3);
            return binaryWriter$UnsafeHeapWriter;
        }
        object = new UnsupportedOperationException("Unsafe operations not supported");
        throw object;
    }

    private void writeBoolList_Internal(int n3, BooleanArrayList booleanArrayList, boolean n4) {
        if (n4 != 0) {
            n4 = booleanArrayList.size() + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = booleanArrayList.size() + -1; i3 >= 0; i3 += -1) {
                boolean bl2 = booleanArrayList.getBoolean(i3);
                this.writeBool(bl2);
            }
            int n7 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n7);
            n7 = 2;
            this.writeTag(n3, n7);
        } else {
            for (n4 = booleanArrayList.size() + -1; n4 >= 0; n4 += -1) {
                boolean bl3 = booleanArrayList.getBoolean(n4);
                this.writeBool(n3, bl3);
            }
        }
    }

    private void writeBoolList_Internal(int n3, List list, boolean n4) {
        if (n4 != 0) {
            n4 = list.size() + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
                Boolean bl2 = (Boolean)list.get(i3);
                boolean bl3 = bl2;
                this.writeBool(bl3);
            }
            int n7 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n7);
            n7 = 2;
            this.writeTag(n3, n7);
        } else {
            for (n4 = list.size() + -1; n4 >= 0; n4 += -1) {
                Boolean bl4 = (Boolean)list.get(n4);
                boolean bl5 = bl4;
                this.writeBool(n3, bl5);
            }
        }
    }

    private void writeDoubleList_Internal(int n3, DoubleArrayList doubleArrayList, boolean n4) {
        if (n4 != 0) {
            n4 = doubleArrayList.size() * 8 + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = doubleArrayList.size() + -1; i3 >= 0; i3 += -1) {
                double d2 = doubleArrayList.getDouble(i3);
                long l2 = Double.doubleToRawLongBits(d2);
                this.writeFixed64(l2);
            }
            int n7 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n7);
            n7 = 2;
            this.writeTag(n3, n7);
        } else {
            for (n4 = doubleArrayList.size() + -1; n4 >= 0; n4 += -1) {
                double d5 = doubleArrayList.getDouble(n4);
                this.writeDouble(n3, d5);
            }
        }
    }

    private void writeDoubleList_Internal(int n3, List list, boolean n4) {
        if (n4 != 0) {
            n4 = list.size() * 8 + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
                Double d2 = (Double)list.get(i3);
                double d5 = d2;
                long l2 = Double.doubleToRawLongBits(d5);
                this.writeFixed64(l2);
            }
            int n7 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n7);
            n7 = 2;
            this.writeTag(n3, n7);
        } else {
            for (n4 = list.size() + -1; n4 >= 0; n4 += -1) {
                Double d7 = (Double)list.get(n4);
                double d9 = d7;
                this.writeDouble(n3, d9);
            }
        }
    }

    private void writeFixed32List_Internal(int n3, IntArrayList intArrayList, boolean n4) {
        if (n4 != 0) {
            n4 = intArrayList.size() * 4 + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = intArrayList.size() + -1; i3 >= 0; i3 += -1) {
                int n7 = intArrayList.getInt(i3);
                this.writeFixed32(n7);
            }
            int n8 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n8);
            n8 = 2;
            this.writeTag(n3, n8);
        } else {
            for (n4 = intArrayList.size() + -1; n4 >= 0; n4 += -1) {
                int n10 = intArrayList.getInt(n4);
                this.writeFixed32(n3, n10);
            }
        }
    }

    private void writeFixed32List_Internal(int n3, List list, boolean n4) {
        if (n4 != 0) {
            n4 = list.size() * 4 + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
                Integer n7 = (Integer)list.get(i3);
                int n8 = n7;
                this.writeFixed32(n8);
            }
            int n10 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n10);
            n10 = 2;
            this.writeTag(n3, n10);
        } else {
            for (n4 = list.size() + -1; n4 >= 0; n4 += -1) {
                Integer n14 = (Integer)list.get(n4);
                int n15 = n14;
                this.writeFixed32(n3, n15);
            }
        }
    }

    private void writeFixed64List_Internal(int n3, LongArrayList longArrayList, boolean n4) {
        if (n4 != 0) {
            n4 = longArrayList.size() * 8 + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = longArrayList.size() + -1; i3 >= 0; i3 += -1) {
                long l2 = longArrayList.getLong(i3);
                this.writeFixed64(l2);
            }
            int n7 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n7);
            n7 = 2;
            this.writeTag(n3, n7);
        } else {
            for (n4 = longArrayList.size() + -1; n4 >= 0; n4 += -1) {
                long l3 = longArrayList.getLong(n4);
                this.writeFixed64(n3, l3);
            }
        }
    }

    private void writeFixed64List_Internal(int n3, List list, boolean n4) {
        if (n4 != 0) {
            n4 = list.size() * 8 + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
                Long l2 = (Long)list.get(i3);
                long l3 = l2;
                this.writeFixed64(l3);
            }
            int n7 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n7);
            n7 = 2;
            this.writeTag(n3, n7);
        } else {
            for (n4 = list.size() + -1; n4 >= 0; n4 += -1) {
                Long l4 = (Long)list.get(n4);
                long l7 = l4;
                this.writeFixed64(n3, l7);
            }
        }
    }

    private void writeFloatList_Internal(int n3, FloatArrayList floatArrayList, boolean n4) {
        if (n4 != 0) {
            n4 = floatArrayList.size() * 4 + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = floatArrayList.size() + -1; i3 >= 0; i3 += -1) {
                float f5 = floatArrayList.getFloat(i3);
                int n7 = Float.floatToRawIntBits(f5);
                this.writeFixed32(n7);
            }
            int n8 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n8);
            n8 = 2;
            this.writeTag(n3, n8);
        } else {
            for (n4 = floatArrayList.size() + -1; n4 >= 0; n4 += -1) {
                float f6 = floatArrayList.getFloat(n4);
                this.writeFloat(n3, f6);
            }
        }
    }

    private void writeFloatList_Internal(int n3, List list, boolean n4) {
        if (n4 != 0) {
            n4 = list.size() * 4 + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
                Float f5 = (Float)list.get(i3);
                float f6 = f5.floatValue();
                int n7 = Float.floatToRawIntBits(f6);
                this.writeFixed32(n7);
            }
            int n8 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n8);
            n8 = 2;
            this.writeTag(n3, n8);
        } else {
            for (n4 = list.size() + -1; n4 >= 0; n4 += -1) {
                Float f7 = (Float)list.get(n4);
                float f8 = f7.floatValue();
                this.writeFloat(n3, f8);
            }
        }
    }

    private void writeInt32List_Internal(int n3, IntArrayList intArrayList, boolean n4) {
        if (n4 != 0) {
            n4 = intArrayList.size() * 10 + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = intArrayList.size() + -1; i3 >= 0; i3 += -1) {
                int n7 = intArrayList.getInt(i3);
                this.writeInt32(n7);
            }
            int n8 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n8);
            n8 = 2;
            this.writeTag(n3, n8);
        } else {
            for (n4 = intArrayList.size() + -1; n4 >= 0; n4 += -1) {
                int n10 = intArrayList.getInt(n4);
                this.writeInt32(n3, n10);
            }
        }
    }

    private void writeInt32List_Internal(int n3, List list, boolean n4) {
        if (n4 != 0) {
            n4 = list.size() * 10 + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
                Integer n7 = (Integer)list.get(i3);
                int n8 = n7;
                this.writeInt32(n8);
            }
            int n10 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n10);
            n10 = 2;
            this.writeTag(n3, n10);
        } else {
            for (n4 = list.size() + -1; n4 >= 0; n4 += -1) {
                Integer n14 = (Integer)list.get(n4);
                int n15 = n14;
                this.writeInt32(n3, n15);
            }
        }
    }

    private void writeLazyString(int n3, Object object) {
        boolean bl2 = object instanceof String;
        if (bl2) {
            object = (String)object;
            this.writeString(n3, (String)object);
        } else {
            object = (ByteString)object;
            this.writeBytes(n3, (ByteString)object);
        }
    }

    public static final void writeMapEntryField(Writer object, int n3, WireFormat$FieldType wireFormat$FieldType, Object object2) {
        int[] nArray = BinaryWriter$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType;
        int n4 = wireFormat$FieldType.ordinal();
        int n7 = nArray[n4];
        switch (n7) {
            default: {
                CharSequence charSequence = new StringBuilder("Unsupported map value type for: ");
                charSequence.append((Object)wireFormat$FieldType);
                charSequence = charSequence.toString();
                object = new IllegalArgumentException((String)charSequence);
                throw object;
            }
            case 17: {
                int n8 = object2 instanceof Internal$EnumLite;
                if (n8 != 0) {
                    object2 = (Internal$EnumLite)object2;
                    n8 = object2.getNumber();
                    object.writeEnum(n3, n8);
                    break;
                }
                n8 = object2 instanceof Integer;
                if (n8 != 0) {
                    object2 = (Integer)object2;
                    n8 = (Integer)object2;
                    object.writeEnum(n3, n8);
                    break;
                }
                object = new IllegalArgumentException("Unexpected type for enum in map.");
                throw object;
            }
            case 16: {
                object2 = (ByteString)object2;
                object.writeBytes(n3, (ByteString)object2);
                break;
            }
            case 15: {
                object.writeMessage(n3, object2);
                break;
            }
            case 14: {
                object2 = (Double)object2;
                double d2 = (Double)object2;
                object.writeDouble(n3, d2);
                break;
            }
            case 13: {
                object2 = (Float)object2;
                float f5 = ((Float)object2).floatValue();
                object.writeFloat(n3, f5);
                break;
            }
            case 12: {
                object2 = (Long)object2;
                long l2 = (Long)object2;
                object.writeUInt64(n3, l2);
                break;
            }
            case 11: {
                object2 = (Integer)object2;
                int n10 = (Integer)object2;
                object.writeUInt32(n3, n10);
                break;
            }
            case 10: {
                object2 = (String)object2;
                object.writeString(n3, (String)object2);
                break;
            }
            case 9: {
                object2 = (Long)object2;
                long l3 = (Long)object2;
                object.writeSInt64(n3, l3);
                break;
            }
            case 8: {
                object2 = (Integer)object2;
                int n14 = (Integer)object2;
                object.writeSInt32(n3, n14);
                break;
            }
            case 7: {
                object2 = (Long)object2;
                long l4 = (Long)object2;
                object.writeSFixed64(n3, l4);
                break;
            }
            case 6: {
                object2 = (Integer)object2;
                int n15 = (Integer)object2;
                object.writeSFixed32(n3, n15);
                break;
            }
            case 5: {
                object2 = (Long)object2;
                long l7 = (Long)object2;
                object.writeInt64(n3, l7);
                break;
            }
            case 4: {
                object2 = (Integer)object2;
                int n16 = (Integer)object2;
                object.writeInt32(n3, n16);
                break;
            }
            case 3: {
                object2 = (Long)object2;
                long l8 = (Long)object2;
                object.writeFixed64(n3, l8);
                break;
            }
            case 2: {
                object2 = (Integer)object2;
                int n17 = (Integer)object2;
                object.writeFixed32(n3, n17);
                break;
            }
            case 1: {
                object2 = (Boolean)object2;
                boolean bl2 = (Boolean)object2;
                object.writeBool(n3, bl2);
            }
        }
    }

    private void writeSInt32List_Internal(int n3, IntArrayList intArrayList, boolean n4) {
        if (n4 != 0) {
            n4 = intArrayList.size() * 5 + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = intArrayList.size() + -1; i3 >= 0; i3 += -1) {
                int n7 = intArrayList.getInt(i3);
                this.writeSInt32(n7);
            }
            int n8 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n8);
            n8 = 2;
            this.writeTag(n3, n8);
        } else {
            for (n4 = intArrayList.size() + -1; n4 >= 0; n4 += -1) {
                int n10 = intArrayList.getInt(n4);
                this.writeSInt32(n3, n10);
            }
        }
    }

    private void writeSInt32List_Internal(int n3, List list, boolean n4) {
        if (n4 != 0) {
            n4 = list.size() * 5 + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
                Integer n7 = (Integer)list.get(i3);
                int n8 = n7;
                this.writeSInt32(n8);
            }
            int n10 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n10);
            n10 = 2;
            this.writeTag(n3, n10);
        } else {
            for (n4 = list.size() + -1; n4 >= 0; n4 += -1) {
                Integer n14 = (Integer)list.get(n4);
                int n15 = n14;
                this.writeSInt32(n3, n15);
            }
        }
    }

    private void writeSInt64List_Internal(int n3, LongArrayList longArrayList, boolean n4) {
        if (n4 != 0) {
            n4 = longArrayList.size() * 10 + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = longArrayList.size() + -1; i3 >= 0; i3 += -1) {
                long l2 = longArrayList.getLong(i3);
                this.writeSInt64(l2);
            }
            int n7 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n7);
            n7 = 2;
            this.writeTag(n3, n7);
        } else {
            for (n4 = longArrayList.size() + -1; n4 >= 0; n4 += -1) {
                long l3 = longArrayList.getLong(n4);
                this.writeSInt64(n3, l3);
            }
        }
    }

    private void writeSInt64List_Internal(int n3, List list, boolean n4) {
        if (n4 != 0) {
            n4 = list.size() * 10 + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
                Long l2 = (Long)list.get(i3);
                long l3 = l2;
                this.writeSInt64(l3);
            }
            int n7 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n7);
            n7 = 2;
            this.writeTag(n3, n7);
        } else {
            for (n4 = list.size() + -1; n4 >= 0; n4 += -1) {
                Long l4 = (Long)list.get(n4);
                long l7 = l4;
                this.writeSInt64(n3, l7);
            }
        }
    }

    private void writeUInt32List_Internal(int n3, IntArrayList intArrayList, boolean n4) {
        if (n4 != 0) {
            n4 = intArrayList.size() * 5 + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = intArrayList.size() + -1; i3 >= 0; i3 += -1) {
                int n7 = intArrayList.getInt(i3);
                this.writeVarint32(n7);
            }
            int n8 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n8);
            n8 = 2;
            this.writeTag(n3, n8);
        } else {
            for (n4 = intArrayList.size() + -1; n4 >= 0; n4 += -1) {
                int n10 = intArrayList.getInt(n4);
                this.writeUInt32(n3, n10);
            }
        }
    }

    private void writeUInt32List_Internal(int n3, List list, boolean n4) {
        if (n4 != 0) {
            n4 = list.size() * 5 + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
                Integer n7 = (Integer)list.get(i3);
                int n8 = n7;
                this.writeVarint32(n8);
            }
            int n10 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n10);
            n10 = 2;
            this.writeTag(n3, n10);
        } else {
            for (n4 = list.size() + -1; n4 >= 0; n4 += -1) {
                Integer n14 = (Integer)list.get(n4);
                int n15 = n14;
                this.writeUInt32(n3, n15);
            }
        }
    }

    private void writeUInt64List_Internal(int n3, LongArrayList longArrayList, boolean n4) {
        if (n4 != 0) {
            n4 = longArrayList.size() * 10 + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = longArrayList.size() + -1; i3 >= 0; i3 += -1) {
                long l2 = longArrayList.getLong(i3);
                this.writeVarint64(l2);
            }
            int n7 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n7);
            n7 = 2;
            this.writeTag(n3, n7);
        } else {
            for (n4 = longArrayList.size() + -1; n4 >= 0; n4 += -1) {
                long l3 = longArrayList.getLong(n4);
                this.writeUInt64(n3, l3);
            }
        }
    }

    private void writeUInt64List_Internal(int n3, List list, boolean n4) {
        if (n4 != 0) {
            n4 = list.size() * 10 + 10;
            this.requireSpace(n4);
            n4 = this.getTotalBytesWritten();
            for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
                Long l2 = (Long)list.get(i3);
                long l3 = l2;
                this.writeVarint64(l3);
            }
            int n7 = this.getTotalBytesWritten() - n4;
            this.writeVarint32(n7);
            n7 = 2;
            this.writeTag(n3, n7);
        } else {
            for (n4 = list.size() + -1; n4 >= 0; n4 += -1) {
                Long l4 = (Long)list.get(n4);
                long l7 = l4;
                this.writeUInt64(n3, l7);
            }
        }
    }

    public final Queue complete() {
        this.finishCurrentBuffer();
        return this.buffers;
    }

    public final Writer$FieldOrder fieldOrder() {
        return Writer$FieldOrder.DESCENDING;
    }

    public abstract void finishCurrentBuffer();

    public abstract int getTotalBytesWritten();

    public final AllocatedBuffer newDirectBuffer() {
        BufferAllocator bufferAllocator = this.alloc;
        int n3 = this.chunkSize;
        return bufferAllocator.allocateDirectBuffer(n3);
    }

    public final AllocatedBuffer newDirectBuffer(int n3) {
        BufferAllocator bufferAllocator = this.alloc;
        int n4 = this.chunkSize;
        n3 = Math.max(n3, n4);
        return bufferAllocator.allocateDirectBuffer(n3);
    }

    public final AllocatedBuffer newHeapBuffer() {
        BufferAllocator bufferAllocator = this.alloc;
        int n3 = this.chunkSize;
        return bufferAllocator.allocateHeapBuffer(n3);
    }

    public final AllocatedBuffer newHeapBuffer(int n3) {
        BufferAllocator bufferAllocator = this.alloc;
        int n4 = this.chunkSize;
        n3 = Math.max(n3, n4);
        return bufferAllocator.allocateHeapBuffer(n3);
    }

    public abstract void requireSpace(int var1);

    public abstract void writeBool(boolean var1);

    public final void writeBoolList(int n3, List list, boolean bl2) {
        boolean bl3 = list instanceof BooleanArrayList;
        if (bl3) {
            list = (BooleanArrayList)list;
            this.writeBoolList_Internal(n3, (BooleanArrayList)list, bl2);
        } else {
            this.writeBoolList_Internal(n3, list, bl2);
        }
    }

    public final void writeBytesList(int n3, List list) {
        for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
            ByteString byteString = (ByteString)list.get(i3);
            this.writeBytes(n3, byteString);
        }
    }

    public final void writeDouble(int n3, double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        this.writeFixed64(n3, l2);
    }

    public final void writeDoubleList(int n3, List list, boolean bl2) {
        boolean bl3 = list instanceof DoubleArrayList;
        if (bl3) {
            list = (DoubleArrayList)list;
            this.writeDoubleList_Internal(n3, (DoubleArrayList)list, bl2);
        } else {
            this.writeDoubleList_Internal(n3, list, bl2);
        }
    }

    public final void writeEnum(int n3, int n4) {
        this.writeInt32(n3, n4);
    }

    public final void writeEnumList(int n3, List list, boolean bl2) {
        this.writeInt32List(n3, list, bl2);
    }

    public abstract void writeFixed32(int var1);

    public final void writeFixed32List(int n3, List list, boolean bl2) {
        boolean bl3 = list instanceof IntArrayList;
        if (bl3) {
            list = (IntArrayList)list;
            this.writeFixed32List_Internal(n3, (IntArrayList)list, bl2);
        } else {
            this.writeFixed32List_Internal(n3, list, bl2);
        }
    }

    public abstract void writeFixed64(long var1);

    public final void writeFixed64List(int n3, List list, boolean bl2) {
        boolean bl3 = list instanceof LongArrayList;
        if (bl3) {
            list = (LongArrayList)list;
            this.writeFixed64List_Internal(n3, (LongArrayList)list, bl2);
        } else {
            this.writeFixed64List_Internal(n3, list, bl2);
        }
    }

    public final void writeFloat(int n3, float f5) {
        int n4 = Float.floatToRawIntBits(f5);
        this.writeFixed32(n3, n4);
    }

    public final void writeFloatList(int n3, List list, boolean bl2) {
        boolean bl3 = list instanceof FloatArrayList;
        if (bl3) {
            list = (FloatArrayList)list;
            this.writeFloatList_Internal(n3, (FloatArrayList)list, bl2);
        } else {
            this.writeFloatList_Internal(n3, list, bl2);
        }
    }

    public final void writeGroupList(int n3, List list) {
        for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
            Object e2 = list.get(i3);
            this.writeGroup(n3, e2);
        }
    }

    public final void writeGroupList(int n3, List list, Schema schema) {
        for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
            Object e2 = list.get(i3);
            this.writeGroup(n3, e2, schema);
        }
    }

    public abstract void writeInt32(int var1);

    public final void writeInt32List(int n3, List list, boolean bl2) {
        boolean bl3 = list instanceof IntArrayList;
        if (bl3) {
            list = (IntArrayList)list;
            this.writeInt32List_Internal(n3, (IntArrayList)list, bl2);
        } else {
            this.writeInt32List_Internal(n3, list, bl2);
        }
    }

    public final void writeInt64(int n3, long l2) {
        this.writeUInt64(n3, l2);
    }

    public final void writeInt64List(int n3, List list, boolean bl2) {
        this.writeUInt64List(n3, list, bl2);
    }

    public void writeMap(int n3, MapEntryLite$Metadata mapEntryLite$Metadata, Map object) {
        int n4;
        object = object.entrySet().iterator();
        while ((n4 = object.hasNext()) != 0) {
            Map.Entry entry = (Map.Entry)object.next();
            int n7 = this.getTotalBytesWritten();
            WireFormat$FieldType wireFormat$FieldType = mapEntryLite$Metadata.valueType;
            Object v4 = entry.getValue();
            int n8 = 2;
            BinaryWriter.writeMapEntryField(this, n8, wireFormat$FieldType, v4);
            wireFormat$FieldType = mapEntryLite$Metadata.keyType;
            entry = entry.getKey();
            int n10 = 1;
            BinaryWriter.writeMapEntryField(this, n10, wireFormat$FieldType, entry);
            n4 = this.getTotalBytesWritten() - n7;
            this.writeVarint32(n4);
            this.writeTag(n3, n8);
        }
    }

    public final void writeMessageList(int n3, List list) {
        for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
            Object e2 = list.get(i3);
            this.writeMessage(n3, e2);
        }
    }

    public final void writeMessageList(int n3, List list, Schema schema) {
        for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
            Object e2 = list.get(i3);
            this.writeMessage(n3, e2, schema);
        }
    }

    public final void writeMessageSetItem(int n3, Object object) {
        int n4 = 1;
        this.writeTag(n4, 4);
        boolean bl2 = object instanceof ByteString;
        int n7 = 3;
        if (bl2) {
            object = (ByteString)object;
            this.writeBytes(n7, (ByteString)object);
        } else {
            this.writeMessage(n7, object);
        }
        this.writeUInt32(2, n3);
        this.writeTag(n4, n7);
    }

    public final void writeSFixed32(int n3, int n4) {
        this.writeFixed32(n3, n4);
    }

    public final void writeSFixed32List(int n3, List list, boolean bl2) {
        this.writeFixed32List(n3, list, bl2);
    }

    public final void writeSFixed64(int n3, long l2) {
        this.writeFixed64(n3, l2);
    }

    public final void writeSFixed64List(int n3, List list, boolean bl2) {
        this.writeFixed64List(n3, list, bl2);
    }

    public abstract void writeSInt32(int var1);

    public final void writeSInt32List(int n3, List list, boolean bl2) {
        boolean bl3 = list instanceof IntArrayList;
        if (bl3) {
            list = (IntArrayList)list;
            this.writeSInt32List_Internal(n3, (IntArrayList)list, bl2);
        } else {
            this.writeSInt32List_Internal(n3, list, bl2);
        }
    }

    public abstract void writeSInt64(long var1);

    public final void writeSInt64List(int n3, List list, boolean bl2) {
        boolean bl3 = list instanceof LongArrayList;
        if (bl3) {
            list = (LongArrayList)list;
            this.writeSInt64List_Internal(n3, (LongArrayList)list, bl2);
        } else {
            this.writeSInt64List_Internal(n3, list, bl2);
        }
    }

    public abstract void writeString(String var1);

    public final void writeStringList(int n3, List list) {
        int n4 = list instanceof LazyStringList;
        if (n4 != 0) {
            List list2 = list;
            list2 = (LazyStringList)list;
            for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
                Object object = list2.getRaw(i3);
                this.writeLazyString(n3, object);
            }
        } else {
            for (n4 = list.size() + -1; n4 >= 0; n4 += -1) {
                String string2 = (String)list.get(n4);
                this.writeString(n3, string2);
            }
        }
    }

    public abstract void writeTag(int var1, int var2);

    public final void writeUInt32List(int n3, List list, boolean bl2) {
        boolean bl3 = list instanceof IntArrayList;
        if (bl3) {
            list = (IntArrayList)list;
            this.writeUInt32List_Internal(n3, (IntArrayList)list, bl2);
        } else {
            this.writeUInt32List_Internal(n3, list, bl2);
        }
    }

    public final void writeUInt64List(int n3, List list, boolean bl2) {
        boolean bl3 = list instanceof LongArrayList;
        if (bl3) {
            list = (LongArrayList)list;
            this.writeUInt64List_Internal(n3, (LongArrayList)list, bl2);
        } else {
            this.writeUInt64List_Internal(n3, list, bl2);
        }
    }

    public abstract void writeVarint32(int var1);

    public abstract void writeVarint64(long var1);
}

