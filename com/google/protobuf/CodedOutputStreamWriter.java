/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.CodedOutputStreamWriter$1;
import com.google.protobuf.Internal;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapEntryLite$Metadata;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Schema;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.Writer;
import com.google.protobuf.Writer$FieldOrder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

final class CodedOutputStreamWriter
implements Writer {
    private final CodedOutputStream output;

    private CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
        this.output = codedOutputStream = (CodedOutputStream)Internal.checkNotNull(codedOutputStream, "output");
        codedOutputStream.wrapper = this;
    }

    public static CodedOutputStreamWriter forCodedOutput(CodedOutputStream codedOutputStream) {
        CodedOutputStreamWriter codedOutputStreamWriter = codedOutputStream.wrapper;
        if (codedOutputStreamWriter != null) {
            return codedOutputStreamWriter;
        }
        codedOutputStreamWriter = new CodedOutputStreamWriter(codedOutputStream);
        return codedOutputStreamWriter;
    }

    private void writeDeterministicBooleanMapEntry(int n3, boolean bl2, Object object, MapEntryLite$Metadata mapEntryLite$Metadata) {
        this.output.writeTag(n3, 2);
        CodedOutputStream codedOutputStream = this.output;
        Boolean bl3 = bl2;
        int n4 = MapEntryLite.computeSerializedSize(mapEntryLite$Metadata, bl3, object);
        codedOutputStream.writeUInt32NoTag(n4);
        codedOutputStream = this.output;
        Boolean bl4 = bl2;
        MapEntryLite.writeTo(codedOutputStream, mapEntryLite$Metadata, bl4, object);
    }

    private void writeDeterministicIntegerMap(int n3, MapEntryLite$Metadata mapEntryLite$Metadata, Map map2) {
        int n4;
        Object object;
        int n7;
        int n8 = map2.size();
        int[] nArray = new int[n8];
        Object object2 = map2.keySet().iterator();
        int n10 = 0;
        int n14 = 0;
        Integer n15 = null;
        while ((n7 = object2.hasNext()) != 0) {
            object = (Integer)object2.next();
            n7 = (Integer)object;
            n4 = n14 + 1;
            nArray[n14] = n7;
            n14 = n4;
        }
        Arrays.sort(nArray);
        while (n10 < n8) {
            int n16 = nArray[n10];
            n15 = n16;
            n15 = map2.get(n15);
            this.output.writeTag(n3, 2);
            object = this.output;
            Integer n17 = n16;
            n4 = MapEntryLite.computeSerializedSize(mapEntryLite$Metadata, n17, n15);
            ((CodedOutputStream)object).writeUInt32NoTag(n4);
            object = this.output;
            object2 = n16;
            MapEntryLite.writeTo((CodedOutputStream)object, mapEntryLite$Metadata, object2, n15);
            ++n10;
        }
    }

    private void writeDeterministicLongMap(int n3, MapEntryLite$Metadata mapEntryLite$Metadata, Map map2) {
        int n4;
        boolean bl2;
        int n7 = map2.size();
        long[] lArray = new long[n7];
        Object object = map2.keySet().iterator();
        int n8 = 0;
        int n10 = 0;
        Long l2 = null;
        while (bl2 = object.hasNext()) {
            Long l3 = (Long)object.next();
            long l4 = l3;
            n4 = n10 + 1;
            lArray[n10] = l4;
            n10 = n4;
        }
        Arrays.sort(lArray);
        while (n8 < n7) {
            long l7 = lArray[n8];
            object = l7;
            object = map2.get(object);
            this.output.writeTag(n3, 2);
            CodedOutputStream codedOutputStream = this.output;
            Long l8 = l7;
            n4 = MapEntryLite.computeSerializedSize(mapEntryLite$Metadata, l8, object);
            codedOutputStream.writeUInt32NoTag(n4);
            codedOutputStream = this.output;
            l2 = l7;
            MapEntryLite.writeTo(codedOutputStream, mapEntryLite$Metadata, l2, object);
            ++n8;
        }
    }

    private void writeDeterministicMap(int n3, MapEntryLite$Metadata object, Map object2) {
        Object object3 = CodedOutputStreamWriter$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType;
        WireFormat$FieldType wireFormat$FieldType = object.keyType;
        int n4 = wireFormat$FieldType.ordinal();
        boolean bl2 = object3[n4];
        switch (bl2) {
            default: {
                object2 = new StringBuilder("does not support key type: ");
                object = object.keyType;
                ((StringBuilder)object2).append(object);
                object = ((StringBuilder)object2).toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                throw illegalArgumentException;
            }
            case 12: {
                this.writeDeterministicStringMap(n3, (MapEntryLite$Metadata)object, (Map)object2);
                break;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                this.writeDeterministicLongMap(n3, (MapEntryLite$Metadata)object, (Map)object2);
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                this.writeDeterministicIntegerMap(n3, (MapEntryLite$Metadata)object, (Map)object2);
                break;
            }
            case 1: {
                object3 = Boolean.FALSE;
                object3 = object2.get(object3);
                if (object3 != null) {
                    n4 = 0;
                    wireFormat$FieldType = null;
                    this.writeDeterministicBooleanMapEntry(n3, false, object3, (MapEntryLite$Metadata)object);
                }
                if ((object2 = object2.get(object3 = (Object)Boolean.TRUE)) == null) break;
                bl2 = true;
                this.writeDeterministicBooleanMapEntry(n3, bl2, object2, (MapEntryLite$Metadata)object);
            }
        }
    }

    private void writeDeterministicStringMap(int n3, MapEntryLite$Metadata mapEntryLite$Metadata, Map map2) {
        int n4;
        Object object;
        boolean bl2;
        int n7 = map2.size();
        Object[] objectArray = new String[n7];
        Object object2 = map2.keySet().iterator();
        int n8 = 0;
        int n10 = 0;
        Object var9_9 = null;
        while (bl2 = object2.hasNext()) {
            object = (String)object2.next();
            n4 = n10 + 1;
            objectArray[n10] = object;
            n10 = n4;
        }
        Arrays.sort(objectArray);
        while (n8 < n7) {
            object2 = objectArray[n8];
            var9_9 = map2.get(object2);
            this.output.writeTag(n3, 2);
            object = this.output;
            n4 = MapEntryLite.computeSerializedSize(mapEntryLite$Metadata, object2, var9_9);
            ((CodedOutputStream)object).writeUInt32NoTag(n4);
            object = this.output;
            MapEntryLite.writeTo((CodedOutputStream)object, mapEntryLite$Metadata, object2, var9_9);
            ++n8;
        }
    }

    private void writeLazyString(int n3, Object object) {
        boolean bl2 = object instanceof String;
        if (bl2) {
            CodedOutputStream codedOutputStream = this.output;
            object = (String)object;
            codedOutputStream.writeString(n3, (String)object);
        } else {
            CodedOutputStream codedOutputStream = this.output;
            object = (ByteString)object;
            codedOutputStream.writeBytes(n3, (ByteString)object);
        }
    }

    public Writer$FieldOrder fieldOrder() {
        return Writer$FieldOrder.ASCENDING;
    }

    public int getTotalBytesWritten() {
        return this.output.getTotalBytesWritten();
    }

    public void writeBool(int n3, boolean bl2) {
        this.output.writeBool(n3, bl2);
    }

    /*
     * WARNING - void declaration
     */
    public void writeBoolList(int n3, List list, boolean n4) {
        int n7;
        if (n4 != 0) {
            void var3_5;
            Object object = this.output;
            int n8 = 2;
            ((CodedOutputStream)object).writeTag(n3, n8);
            CodedOutputStream codedOutputStream = null;
            boolean bl2 = false;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Boolean bl3 = (Boolean)list.get(n3);
                n8 = CodedOutputStream.computeBoolSizeNoTag(bl3);
                var3_5 += n8;
            }
            codedOutputStream = this.output;
            codedOutputStream.writeUInt32NoTag((int)var3_5);
            while (n7 < (n3 = list.size())) {
                codedOutputStream = this.output;
                object = (Boolean)list.get(n7);
                boolean bl4 = (Boolean)object;
                codedOutputStream.writeBoolNoTag(bl4);
                ++n7;
            }
        } else {
            int n10;
            for (n7 = 0; n7 < (n10 = list.size()); ++n7) {
                CodedOutputStream codedOutputStream = this.output;
                Boolean bl5 = (Boolean)list.get(n7);
                boolean bl6 = bl5;
                codedOutputStream.writeBool(n3, bl6);
            }
        }
    }

    public void writeBytes(int n3, ByteString byteString) {
        this.output.writeBytes(n3, byteString);
    }

    public void writeBytesList(int n3, List list) {
        int n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            CodedOutputStream codedOutputStream = this.output;
            ByteString byteString = (ByteString)list.get(i3);
            codedOutputStream.writeBytes(n3, byteString);
        }
    }

    public void writeDouble(int n3, double d2) {
        this.output.writeDouble(n3, d2);
    }

    public void writeDoubleList(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            double d2;
            Object object = this.output;
            int n8 = 2;
            ((CodedOutputStream)object).writeTag(n3, n8);
            CodedOutputStream codedOutputStream = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Double d5 = (Double)list.get(n3);
                d2 = d5;
                n8 = CodedOutputStream.computeDoubleSizeNoTag(d2);
                n4 += n8;
            }
            codedOutputStream = this.output;
            codedOutputStream.writeUInt32NoTag(n4);
            while (n7 < (n3 = list.size())) {
                codedOutputStream = this.output;
                object = (Double)list.get(n7);
                d2 = (Double)object;
                codedOutputStream.writeDoubleNoTag(d2);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                CodedOutputStream codedOutputStream = this.output;
                Double d7 = (Double)list.get(n7);
                double d9 = d7;
                codedOutputStream.writeDouble(n3, d9);
            }
        }
    }

    public void writeEndGroup(int n3) {
        this.output.writeTag(n3, 4);
    }

    public void writeEnum(int n3, int n4) {
        this.output.writeEnum(n3, n4);
    }

    public void writeEnumList(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.output;
            int n8 = 2;
            ((CodedOutputStream)object).writeTag(n3, n8);
            CodedOutputStream codedOutputStream = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = CodedOutputStream.computeEnumSizeNoTag(n10);
                n4 += n8;
            }
            codedOutputStream = this.output;
            codedOutputStream.writeUInt32NoTag(n4);
            while (n7 < (n3 = list.size())) {
                codedOutputStream = this.output;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                codedOutputStream.writeEnumNoTag(n4);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                CodedOutputStream codedOutputStream = this.output;
                Integer n14 = (Integer)list.get(n7);
                int n15 = n14;
                codedOutputStream.writeEnum(n3, n15);
            }
        }
    }

    public void writeFixed32(int n3, int n4) {
        this.output.writeFixed32(n3, n4);
    }

    public void writeFixed32List(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.output;
            int n8 = 2;
            ((CodedOutputStream)object).writeTag(n3, n8);
            CodedOutputStream codedOutputStream = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = CodedOutputStream.computeFixed32SizeNoTag(n10);
                n4 += n8;
            }
            codedOutputStream = this.output;
            codedOutputStream.writeUInt32NoTag(n4);
            while (n7 < (n3 = list.size())) {
                codedOutputStream = this.output;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                codedOutputStream.writeFixed32NoTag(n4);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                CodedOutputStream codedOutputStream = this.output;
                Integer n14 = (Integer)list.get(n7);
                int n15 = n14;
                codedOutputStream.writeFixed32(n3, n15);
            }
        }
    }

    public void writeFixed64(int n3, long l2) {
        this.output.writeFixed64(n3, l2);
    }

    public void writeFixed64List(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            long l2;
            Object object = this.output;
            int n8 = 2;
            ((CodedOutputStream)object).writeTag(n3, n8);
            CodedOutputStream codedOutputStream = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l3 = (Long)list.get(n3);
                l2 = l3;
                n8 = CodedOutputStream.computeFixed64SizeNoTag(l2);
                n4 += n8;
            }
            codedOutputStream = this.output;
            codedOutputStream.writeUInt32NoTag(n4);
            while (n7 < (n3 = list.size())) {
                codedOutputStream = this.output;
                object = (Long)list.get(n7);
                l2 = (Long)object;
                codedOutputStream.writeFixed64NoTag(l2);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                CodedOutputStream codedOutputStream = this.output;
                Long l4 = (Long)list.get(n7);
                long l7 = l4;
                codedOutputStream.writeFixed64(n3, l7);
            }
        }
    }

    public void writeFloat(int n3, float f5) {
        this.output.writeFloat(n3, f5);
    }

    public void writeFloatList(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.output;
            int n8 = 2;
            float f5 = 2.8E-45f;
            ((CodedOutputStream)object).writeTag(n3, n8);
            CodedOutputStream codedOutputStream = null;
            n4 = 0;
            float f6 = 0.0f;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Float f7 = (Float)list.get(n3);
                f5 = f7.floatValue();
                n8 = CodedOutputStream.computeFloatSizeNoTag(f5);
                n4 += n8;
            }
            codedOutputStream = this.output;
            codedOutputStream.writeUInt32NoTag(n4);
            while (n7 < (n3 = list.size())) {
                codedOutputStream = this.output;
                object = (Float)list.get(n7);
                f6 = ((Float)object).floatValue();
                codedOutputStream.writeFloatNoTag(f6);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                CodedOutputStream codedOutputStream = this.output;
                Float f8 = (Float)list.get(n7);
                float f11 = f8.floatValue();
                codedOutputStream.writeFloat(n3, f11);
            }
        }
    }

    public void writeGroup(int n3, Object object) {
        CodedOutputStream codedOutputStream = this.output;
        object = (MessageLite)object;
        codedOutputStream.writeGroup(n3, (MessageLite)object);
    }

    public void writeGroup(int n3, Object object, Schema schema) {
        CodedOutputStream codedOutputStream = this.output;
        object = (MessageLite)object;
        codedOutputStream.writeGroup(n3, (MessageLite)object, schema);
    }

    public void writeGroupList(int n3, List list) {
        int n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            Object e2 = list.get(i3);
            this.writeGroup(n3, e2);
        }
    }

    public void writeGroupList(int n3, List list, Schema schema) {
        int n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            Object e2 = list.get(i3);
            this.writeGroup(n3, e2, schema);
        }
    }

    public void writeInt32(int n3, int n4) {
        this.output.writeInt32(n3, n4);
    }

    public void writeInt32List(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.output;
            int n8 = 2;
            ((CodedOutputStream)object).writeTag(n3, n8);
            CodedOutputStream codedOutputStream = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = CodedOutputStream.computeInt32SizeNoTag(n10);
                n4 += n8;
            }
            codedOutputStream = this.output;
            codedOutputStream.writeUInt32NoTag(n4);
            while (n7 < (n3 = list.size())) {
                codedOutputStream = this.output;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                codedOutputStream.writeInt32NoTag(n4);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                CodedOutputStream codedOutputStream = this.output;
                Integer n14 = (Integer)list.get(n7);
                int n15 = n14;
                codedOutputStream.writeInt32(n3, n15);
            }
        }
    }

    public void writeInt64(int n3, long l2) {
        this.output.writeInt64(n3, l2);
    }

    public void writeInt64List(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            long l2;
            Object object = this.output;
            int n8 = 2;
            ((CodedOutputStream)object).writeTag(n3, n8);
            CodedOutputStream codedOutputStream = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l3 = (Long)list.get(n3);
                l2 = l3;
                n8 = CodedOutputStream.computeInt64SizeNoTag(l2);
                n4 += n8;
            }
            codedOutputStream = this.output;
            codedOutputStream.writeUInt32NoTag(n4);
            while (n7 < (n3 = list.size())) {
                codedOutputStream = this.output;
                object = (Long)list.get(n7);
                l2 = (Long)object;
                codedOutputStream.writeInt64NoTag(l2);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                CodedOutputStream codedOutputStream = this.output;
                Long l4 = (Long)list.get(n7);
                long l7 = l4;
                codedOutputStream.writeInt64(n3, l7);
            }
        }
    }

    public void writeMap(int n3, MapEntryLite$Metadata mapEntryLite$Metadata, Map object) {
        Object object2 = this.output;
        boolean bl2 = ((CodedOutputStream)object2).isSerializationDeterministic();
        if (bl2) {
            this.writeDeterministicMap(n3, mapEntryLite$Metadata, (Map)object);
            return;
        }
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            this.output.writeTag(n3, 2);
            CodedOutputStream codedOutputStream = this.output;
            Object k2 = object2.getKey();
            Object v4 = object2.getValue();
            int n4 = MapEntryLite.computeSerializedSize(mapEntryLite$Metadata, k2, v4);
            codedOutputStream.writeUInt32NoTag(n4);
            codedOutputStream = this.output;
            k2 = object2.getKey();
            object2 = object2.getValue();
            MapEntryLite.writeTo(codedOutputStream, mapEntryLite$Metadata, k2, object2);
        }
    }

    public void writeMessage(int n3, Object object) {
        CodedOutputStream codedOutputStream = this.output;
        object = (MessageLite)object;
        codedOutputStream.writeMessage(n3, (MessageLite)object);
    }

    public void writeMessage(int n3, Object object, Schema schema) {
        CodedOutputStream codedOutputStream = this.output;
        object = (MessageLite)object;
        codedOutputStream.writeMessage(n3, (MessageLite)object, schema);
    }

    public void writeMessageList(int n3, List list) {
        int n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            Object e2 = list.get(i3);
            this.writeMessage(n3, e2);
        }
    }

    public void writeMessageList(int n3, List list, Schema schema) {
        int n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            Object e2 = list.get(i3);
            this.writeMessage(n3, e2, schema);
        }
    }

    public final void writeMessageSetItem(int n3, Object object) {
        boolean bl2 = object instanceof ByteString;
        if (bl2) {
            CodedOutputStream codedOutputStream = this.output;
            object = (ByteString)object;
            codedOutputStream.writeRawMessageSetExtension(n3, (ByteString)object);
        } else {
            CodedOutputStream codedOutputStream = this.output;
            object = (MessageLite)object;
            codedOutputStream.writeMessageSetExtension(n3, (MessageLite)object);
        }
    }

    public void writeSFixed32(int n3, int n4) {
        this.output.writeSFixed32(n3, n4);
    }

    public void writeSFixed32List(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.output;
            int n8 = 2;
            ((CodedOutputStream)object).writeTag(n3, n8);
            CodedOutputStream codedOutputStream = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = CodedOutputStream.computeSFixed32SizeNoTag(n10);
                n4 += n8;
            }
            codedOutputStream = this.output;
            codedOutputStream.writeUInt32NoTag(n4);
            while (n7 < (n3 = list.size())) {
                codedOutputStream = this.output;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                codedOutputStream.writeSFixed32NoTag(n4);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                CodedOutputStream codedOutputStream = this.output;
                Integer n14 = (Integer)list.get(n7);
                int n15 = n14;
                codedOutputStream.writeSFixed32(n3, n15);
            }
        }
    }

    public void writeSFixed64(int n3, long l2) {
        this.output.writeSFixed64(n3, l2);
    }

    public void writeSFixed64List(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            long l2;
            Object object = this.output;
            int n8 = 2;
            ((CodedOutputStream)object).writeTag(n3, n8);
            CodedOutputStream codedOutputStream = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l3 = (Long)list.get(n3);
                l2 = l3;
                n8 = CodedOutputStream.computeSFixed64SizeNoTag(l2);
                n4 += n8;
            }
            codedOutputStream = this.output;
            codedOutputStream.writeUInt32NoTag(n4);
            while (n7 < (n3 = list.size())) {
                codedOutputStream = this.output;
                object = (Long)list.get(n7);
                l2 = (Long)object;
                codedOutputStream.writeSFixed64NoTag(l2);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                CodedOutputStream codedOutputStream = this.output;
                Long l4 = (Long)list.get(n7);
                long l7 = l4;
                codedOutputStream.writeSFixed64(n3, l7);
            }
        }
    }

    public void writeSInt32(int n3, int n4) {
        this.output.writeSInt32(n3, n4);
    }

    public void writeSInt32List(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.output;
            int n8 = 2;
            ((CodedOutputStream)object).writeTag(n3, n8);
            CodedOutputStream codedOutputStream = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = CodedOutputStream.computeSInt32SizeNoTag(n10);
                n4 += n8;
            }
            codedOutputStream = this.output;
            codedOutputStream.writeUInt32NoTag(n4);
            while (n7 < (n3 = list.size())) {
                codedOutputStream = this.output;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                codedOutputStream.writeSInt32NoTag(n4);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                CodedOutputStream codedOutputStream = this.output;
                Integer n14 = (Integer)list.get(n7);
                int n15 = n14;
                codedOutputStream.writeSInt32(n3, n15);
            }
        }
    }

    public void writeSInt64(int n3, long l2) {
        this.output.writeSInt64(n3, l2);
    }

    public void writeSInt64List(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            long l2;
            Object object = this.output;
            int n8 = 2;
            ((CodedOutputStream)object).writeTag(n3, n8);
            CodedOutputStream codedOutputStream = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l3 = (Long)list.get(n3);
                l2 = l3;
                n8 = CodedOutputStream.computeSInt64SizeNoTag(l2);
                n4 += n8;
            }
            codedOutputStream = this.output;
            codedOutputStream.writeUInt32NoTag(n4);
            while (n7 < (n3 = list.size())) {
                codedOutputStream = this.output;
                object = (Long)list.get(n7);
                l2 = (Long)object;
                codedOutputStream.writeSInt64NoTag(l2);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                CodedOutputStream codedOutputStream = this.output;
                Long l4 = (Long)list.get(n7);
                long l7 = l4;
                codedOutputStream.writeSInt64(n3, l7);
            }
        }
    }

    public void writeStartGroup(int n3) {
        this.output.writeTag(n3, 3);
    }

    public void writeString(int n3, String string2) {
        this.output.writeString(n3, string2);
    }

    public void writeStringList(int n3, List list) {
        int n4;
        int n7 = list instanceof LazyStringList;
        if (n7 != 0) {
            int n8;
            List list2 = list;
            list2 = (LazyStringList)list;
            for (n4 = 0; n4 < (n8 = list.size()); ++n4) {
                Object object = list2.getRaw(n4);
                this.writeLazyString(n3, object);
            }
        } else {
            while (n4 < (n7 = list.size())) {
                CodedOutputStream codedOutputStream = this.output;
                String string2 = (String)list.get(n4);
                codedOutputStream.writeString(n3, string2);
                ++n4;
            }
        }
    }

    public void writeUInt32(int n3, int n4) {
        this.output.writeUInt32(n3, n4);
    }

    public void writeUInt32List(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.output;
            int n8 = 2;
            ((CodedOutputStream)object).writeTag(n3, n8);
            CodedOutputStream codedOutputStream = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = CodedOutputStream.computeUInt32SizeNoTag(n10);
                n4 += n8;
            }
            codedOutputStream = this.output;
            codedOutputStream.writeUInt32NoTag(n4);
            while (n7 < (n3 = list.size())) {
                codedOutputStream = this.output;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                codedOutputStream.writeUInt32NoTag(n4);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                CodedOutputStream codedOutputStream = this.output;
                Integer n14 = (Integer)list.get(n7);
                int n15 = n14;
                codedOutputStream.writeUInt32(n3, n15);
            }
        }
    }

    public void writeUInt64(int n3, long l2) {
        this.output.writeUInt64(n3, l2);
    }

    public void writeUInt64List(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            long l2;
            Object object = this.output;
            int n8 = 2;
            ((CodedOutputStream)object).writeTag(n3, n8);
            CodedOutputStream codedOutputStream = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l3 = (Long)list.get(n3);
                l2 = l3;
                n8 = CodedOutputStream.computeUInt64SizeNoTag(l2);
                n4 += n8;
            }
            codedOutputStream = this.output;
            codedOutputStream.writeUInt32NoTag(n4);
            while (n7 < (n3 = list.size())) {
                codedOutputStream = this.output;
                object = (Long)list.get(n7);
                l2 = (Long)object;
                codedOutputStream.writeUInt64NoTag(l2);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                CodedOutputStream codedOutputStream = this.output;
                Long l4 = (Long)list.get(n7);
                long l7 = l4;
                codedOutputStream.writeUInt64(n3, l7);
            }
        }
    }
}

