/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.FieldDescriptor$Builder;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.proto.LengthCountingOutputStream;
import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.encoders.proto.Protobuf$IntEncoding;
import com.google.firebase.encoders.proto.ProtobufDataEncoderContext$1;
import com.google.firebase.encoders.proto.ProtobufValueEncoderContext;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

final class ProtobufDataEncoderContext
implements ObjectEncoderContext {
    private static final ObjectEncoder DEFAULT_MAP_ENCODER;
    private static final FieldDescriptor MAP_KEY_DESC;
    private static final FieldDescriptor MAP_VALUE_DESC;
    private static final Charset UTF_8;
    private final ObjectEncoder fallbackEncoder;
    private final Map objectEncoders;
    private OutputStream output;
    private final ProtobufValueEncoderContext valueEncoderContext;
    private final Map valueEncoders;

    static {
        UTF_8 = Charset.forName("UTF-8");
        Object object = FieldDescriptor.builder("key");
        MAP_KEY_DESC = E1.b(1, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("value");
        MAP_VALUE_DESC = E1.b(2, (FieldDescriptor$Builder)object);
        DEFAULT_MAP_ENCODER = object = new Object();
    }

    public ProtobufDataEncoderContext(OutputStream outputStream, Map map2, Map map3, ObjectEncoder objectEncoder) {
        ProtobufValueEncoderContext protobufValueEncoderContext;
        this.valueEncoderContext = protobufValueEncoderContext = new ProtobufValueEncoderContext(this);
        this.output = outputStream;
        this.objectEncoders = map2;
        this.valueEncoders = map3;
        this.fallbackEncoder = objectEncoder;
    }

    public static /* synthetic */ void a(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        ProtobufDataEncoderContext.lambda$static$0(entry, objectEncoderContext);
    }

    private static ByteBuffer allocateBuffer(int n3) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(n3);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        return byteBuffer.order(byteOrder);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private long determineSize(ObjectEncoder objectEncoder, Object object) {
        Throwable throwable2222222;
        LengthCountingOutputStream lengthCountingOutputStream;
        block8: {
            lengthCountingOutputStream = new LengthCountingOutputStream();
            OutputStream outputStream = this.output;
            this.output = lengthCountingOutputStream;
            {
                long l2;
                catch (Throwable throwable2222222) {
                    break block8;
                }
                try {
                    objectEncoder.encode(object, this);
                    {
                        this.output = outputStream;
                        l2 = lengthCountingOutputStream.getLength();
                    }
                }
                catch (Throwable throwable3) {}
                lengthCountingOutputStream.close();
                return l2;
                {
                    this.output = outputStream;
                    throw throwable3;
                }
            }
        }
        try {
            lengthCountingOutputStream.close();
            throw throwable2222222;
        }
        catch (Throwable throwable4) {
            throwable2222222.addSuppressed(throwable4);
        }
        throw throwable2222222;
    }

    private ProtobufDataEncoderContext doEncode(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object object, boolean bl2) {
        long l2;
        long l3;
        long l4 = this.determineSize(objectEncoder, object);
        if (bl2 && !(bl2 = (l3 = l4 - (l2 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1))) {
            return this;
        }
        int n3 = ProtobufDataEncoderContext.getTag(fieldDescriptor) << 3 | 2;
        this.writeVarInt32(n3);
        this.writeVarInt64(l4);
        objectEncoder.encode(object, this);
        return this;
    }

    private ProtobufDataEncoderContext doEncode(ValueEncoder valueEncoder, FieldDescriptor object, Object object2, boolean bl2) {
        this.valueEncoderContext.resetContext((FieldDescriptor)object, bl2);
        object = this.valueEncoderContext;
        valueEncoder.encode(object2, object);
        return this;
    }

    private static Protobuf getProtobuf(FieldDescriptor object) {
        Class<Protobuf> clazz = Protobuf.class;
        if ((object = (Protobuf)((FieldDescriptor)object).getProperty(clazz)) != null) {
            return object;
        }
        object = new EncodingException("Field has no @Protobuf config");
        throw object;
    }

    private static int getTag(FieldDescriptor object) {
        Class<Protobuf> clazz = Protobuf.class;
        if ((object = (Protobuf)((FieldDescriptor)object).getProperty(clazz)) != null) {
            return object.tag();
        }
        object = new EncodingException("Field has no @Protobuf config");
        throw object;
    }

    private static /* synthetic */ void lambda$static$0(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = MAP_KEY_DESC;
        Object k2 = entry.getKey();
        objectEncoderContext.add(fieldDescriptor, k2);
        fieldDescriptor = MAP_VALUE_DESC;
        entry = entry.getValue();
        objectEncoderContext.add(fieldDescriptor, (Object)entry);
    }

    private void writeVarInt32(int n3) {
        OutputStream outputStream;
        long l2;
        int n4;
        long l3;
        long l4;
        long l7;
        while ((l7 = (l4 = (l3 = (long)(n4 = n3 & 0xFFFFFF80)) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            outputStream = this.output;
            int n7 = n3 & 0x7F | 0x80;
            outputStream.write(n7);
            n3 >>>= 7;
        }
        outputStream = this.output;
        outputStream.write(n3 &= 0x7F);
    }

    private void writeVarInt64(long l2) {
        OutputStream outputStream;
        long l3;
        long l4;
        long l7;
        long l8;
        while ((l8 = (l7 = (l4 = (long)-128 & l2) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false) {
            outputStream = this.output;
            int n3 = (int)l2 & 0x7F | 0x80;
            outputStream.write(n3);
            int n4 = 7;
            l2 >>>= n4;
        }
        outputStream = this.output;
        int n7 = (int)l2 & 0x7F;
        outputStream.write(n7);
    }

    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d2) {
        return this.add(fieldDescriptor, d2, true);
    }

    public ObjectEncoderContext add(FieldDescriptor object, double d2, boolean bl2) {
        double d5;
        double d7;
        if (bl2 && !(bl2 = (d7 = d2 - (d5 = 0.0)) == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1))) {
            return this;
        }
        int n3 = ProtobufDataEncoderContext.getTag((FieldDescriptor)object) << 3 | 1;
        this.writeVarInt32(n3);
        object = this.output;
        byte[] byArray = ProtobufDataEncoderContext.allocateBuffer(8).putDouble(d2).array();
        ((OutputStream)object).write(byArray);
        return this;
    }

    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f5) {
        return this.add(fieldDescriptor, f5, true);
    }

    public ObjectEncoderContext add(FieldDescriptor object, float f5, boolean bl2) {
        float f6;
        if (bl2 && !(bl2 = (f6 = f5 - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) {
            return this;
        }
        int n3 = ProtobufDataEncoderContext.getTag((FieldDescriptor)object) << 3 | 5;
        this.writeVarInt32(n3);
        object = this.output;
        byte[] byArray = ProtobufDataEncoderContext.allocateBuffer(4).putFloat(f5).array();
        ((OutputStream)object).write(byArray);
        return this;
    }

    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object object) {
        return this.add(fieldDescriptor, object, true);
    }

    public ObjectEncoderContext add(FieldDescriptor object, Object object2, boolean bl2) {
        if (object2 == null) {
            return this;
        }
        boolean bl3 = object2 instanceof CharSequence;
        if (bl3) {
            object2 = (CharSequence)object2;
            if (bl2 && !(bl2 = object2.length())) {
                return this;
            }
            int n3 = ProtobufDataEncoderContext.getTag((FieldDescriptor)object) << 3 | 2;
            this.writeVarInt32(n3);
            object = object2.toString();
            object2 = UTF_8;
            object = ((String)object).getBytes((Charset)object2);
            int n4 = ((Object)object).length;
            this.writeVarInt32(n4);
            this.output.write((byte[])object);
            return this;
        }
        bl3 = object2 instanceof Collection;
        Class<?> clazz = null;
        if (bl3) {
            object2 = ((Collection)object2).iterator();
            while (bl2 = object2.hasNext()) {
                Object e2 = object2.next();
                this.add((FieldDescriptor)object, e2, false);
            }
            return this;
        }
        bl3 = object2 instanceof Map;
        if (bl3) {
            object2 = ((Map)object2).entrySet().iterator();
            while (bl2 = object2.hasNext()) {
                Map.Entry entry = (Map.Entry)object2.next();
                ObjectEncoder objectEncoder = DEFAULT_MAP_ENCODER;
                this.doEncode(objectEncoder, (FieldDescriptor)object, (Object)entry, false);
            }
            return this;
        }
        bl3 = object2 instanceof Double;
        if (bl3) {
            double d2 = (Double)object2;
            return this.add((FieldDescriptor)object, d2, bl2);
        }
        bl3 = object2 instanceof Float;
        if (bl3) {
            float f5 = ((Float)object2).floatValue();
            return this.add((FieldDescriptor)object, f5, bl2);
        }
        bl3 = object2 instanceof Number;
        if (bl3) {
            long l2 = ((Number)object2).longValue();
            return this.add((FieldDescriptor)object, l2, bl2);
        }
        bl3 = object2 instanceof Boolean;
        if (bl3) {
            boolean bl4 = (Boolean)object2;
            return this.add((FieldDescriptor)object, bl4, bl2);
        }
        bl3 = object2 instanceof byte[];
        if (bl3) {
            object2 = (byte[])object2;
            if (bl2 && !(bl2 = ((Object)object2).length)) {
                return this;
            }
            int n7 = ProtobufDataEncoderContext.getTag((FieldDescriptor)object) << 3 | 2;
            this.writeVarInt32(n7);
            n7 = ((Object)object2).length;
            this.writeVarInt32(n7);
            this.output.write((byte[])object2);
            return this;
        }
        Object object3 = this.objectEncoders;
        clazz = object2.getClass();
        if ((object3 = (ObjectEncoder)object3.get(clazz)) != null) {
            return this.doEncode((ObjectEncoder)object3, (FieldDescriptor)object, object2, bl2);
        }
        object3 = this.valueEncoders;
        clazz = object2.getClass();
        if ((object3 = (ValueEncoder)object3.get(clazz)) != null) {
            return this.doEncode((ValueEncoder)object3, (FieldDescriptor)object, object2, bl2);
        }
        bl3 = object2 instanceof ProtoEnum;
        if (bl3) {
            int n8 = ((ProtoEnum)object2).getNumber();
            return this.add((FieldDescriptor)object, n8);
        }
        bl3 = object2 instanceof Enum;
        if (bl3) {
            int n10 = ((Enum)object2).ordinal();
            return this.add((FieldDescriptor)object, n10);
        }
        object3 = this.fallbackEncoder;
        return this.doEncode((ObjectEncoder)object3, (FieldDescriptor)object, object2, bl2);
    }

    public ObjectEncoderContext add(String object, double d2) {
        object = FieldDescriptor.of((String)object);
        return this.add((FieldDescriptor)object, d2);
    }

    public ObjectEncoderContext add(String object, int n3) {
        object = FieldDescriptor.of((String)object);
        return this.add((FieldDescriptor)object, n3);
    }

    public ObjectEncoderContext add(String object, long l2) {
        object = FieldDescriptor.of((String)object);
        return this.add((FieldDescriptor)object, l2);
    }

    public ObjectEncoderContext add(String object, Object object2) {
        object = FieldDescriptor.of((String)object);
        return this.add((FieldDescriptor)object, object2);
    }

    public ObjectEncoderContext add(String object, boolean bl2) {
        object = FieldDescriptor.of((String)object);
        return this.add((FieldDescriptor)object, bl2);
    }

    public ProtobufDataEncoderContext add(FieldDescriptor fieldDescriptor, int n3) {
        return this.add(fieldDescriptor, n3, true);
    }

    public ProtobufDataEncoderContext add(FieldDescriptor object, int n3, boolean n4) {
        if (n4 != 0 && n3 == 0) {
            return this;
        }
        object = ProtobufDataEncoderContext.getProtobuf((FieldDescriptor)object);
        Object object2 = ProtobufDataEncoderContext$1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding;
        Protobuf$IntEncoding protobuf$IntEncoding = object.intEncoding();
        int n7 = protobuf$IntEncoding.ordinal();
        n4 = object2[n7];
        n7 = 1;
        int n8 = 3;
        if (n4 != n7) {
            n7 = 2;
            if (n4 != n7) {
                if (n4 == n8) {
                    int n10 = object.tag() << n8 | 5;
                    this.writeVarInt32(n10);
                    object = this.output;
                    n4 = 4;
                    object2 = ProtobufDataEncoderContext.allocateBuffer(n4);
                    byte[] byArray = ((ByteBuffer)object2).putInt(n3).array();
                    ((OutputStream)object).write(byArray);
                }
            } else {
                int n14 = object.tag() << n8;
                this.writeVarInt32(n14);
                n14 = n3 << 1;
                this.writeVarInt32(n14 ^= (n3 >>= 31));
            }
        } else {
            int n15 = object.tag() << n8;
            this.writeVarInt32(n15);
            this.writeVarInt32(n3);
        }
        return this;
    }

    public ProtobufDataEncoderContext add(FieldDescriptor fieldDescriptor, long l2) {
        return this.add(fieldDescriptor, l2, true);
    }

    public ProtobufDataEncoderContext add(FieldDescriptor object, long l2, boolean n3) {
        long l3;
        long l4;
        if (n3 != 0 && (n3 = (l4 = l2 - (l3 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == 0) {
            return this;
        }
        object = ProtobufDataEncoderContext.getProtobuf((FieldDescriptor)object);
        Object object2 = ProtobufDataEncoderContext$1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding;
        Protobuf$IntEncoding protobuf$IntEncoding = object.intEncoding();
        int n4 = protobuf$IntEncoding.ordinal();
        n3 = object2[n4];
        n4 = 1;
        int n7 = 3;
        if (n3 != n4) {
            int n8 = 2;
            if (n3 != n8) {
                if (n3 == n7) {
                    int n10 = object.tag() << n7 | n4;
                    this.writeVarInt32(n10);
                    object = this.output;
                    n3 = 8;
                    object2 = ProtobufDataEncoderContext.allocateBuffer(n3);
                    byte[] byArray = ((ByteBuffer)object2).putLong(l2).array();
                    ((OutputStream)object).write(byArray);
                }
            } else {
                int n14 = object.tag() << n7;
                this.writeVarInt32(n14);
                l3 = l2 << n4;
                n14 = 63;
                long l7 = l2 >> n14 ^ l3;
                this.writeVarInt64(l7);
            }
        } else {
            int n15 = object.tag() << n7;
            this.writeVarInt32(n15);
            this.writeVarInt64(l2);
        }
        return this;
    }

    public ProtobufDataEncoderContext add(FieldDescriptor fieldDescriptor, boolean bl2) {
        return this.add(fieldDescriptor, bl2, true);
    }

    public ProtobufDataEncoderContext add(FieldDescriptor fieldDescriptor, boolean bl2, boolean bl3) {
        return this.add(fieldDescriptor, (int)(bl2 ? 1 : 0), bl3);
    }

    public ProtobufDataEncoderContext encode(Object object) {
        if (object == null) {
            return this;
        }
        Object object2 = this.objectEncoders;
        Serializable serializable = object.getClass();
        if ((object2 = (ObjectEncoder)object2.get(serializable)) != null) {
            object2.encode(object, this);
            return this;
        }
        serializable = new StringBuilder("No encoder for ");
        object = object.getClass();
        ((StringBuilder)serializable).append(object);
        object = ((StringBuilder)serializable).toString();
        object2 = new EncodingException((String)object);
        throw object2;
    }

    public ObjectEncoderContext inline(Object object) {
        return this.encode(object);
    }

    public ObjectEncoderContext nested(FieldDescriptor object) {
        object = new EncodingException("nested() is not implemented for protobuf encoding.");
        throw object;
    }

    public ObjectEncoderContext nested(String object) {
        object = FieldDescriptor.of((String)object);
        return this.nested((FieldDescriptor)object);
    }
}

