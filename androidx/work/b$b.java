/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import androidx.work.b;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public final class b$b {
    public static final Serializable a(DataInputStream object, byte n3) {
        block25: {
            Object[] objectArray;
            block11: {
                int n4;
                float f5;
                int n7;
                block24: {
                    block23: {
                        block22: {
                            block21: {
                                block20: {
                                    block19: {
                                        block18: {
                                            block17: {
                                                block16: {
                                                    block15: {
                                                        block14: {
                                                            block13: {
                                                                block12: {
                                                                    objectArray = null;
                                                                    if (n3 == 0) break block11;
                                                                    n7 = 1;
                                                                    f5 = Float.MIN_VALUE;
                                                                    if (n3 != n7) break block12;
                                                                    boolean bl2 = ((DataInputStream)object).readBoolean();
                                                                    objectArray = bl2;
                                                                    break block11;
                                                                }
                                                                n7 = 2;
                                                                f5 = 2.8E-45f;
                                                                if (n3 != n7) break block13;
                                                                byte by2 = ((DataInputStream)object).readByte();
                                                                objectArray = by2;
                                                                break block11;
                                                            }
                                                            n7 = 3;
                                                            f5 = 4.2E-45f;
                                                            if (n3 != n7) break block14;
                                                            int n8 = ((DataInputStream)object).readInt();
                                                            objectArray = n8;
                                                            break block11;
                                                        }
                                                        n7 = 4;
                                                        f5 = 5.6E-45f;
                                                        if (n3 != n7) break block15;
                                                        long l2 = ((DataInputStream)object).readLong();
                                                        objectArray = l2;
                                                        break block11;
                                                    }
                                                    n7 = 5;
                                                    f5 = 7.0E-45f;
                                                    if (n3 != n7) break block16;
                                                    float f6 = ((DataInputStream)object).readFloat();
                                                    objectArray = Float.valueOf(f6);
                                                    break block11;
                                                }
                                                n7 = 6;
                                                f5 = 8.4E-45f;
                                                if (n3 != n7) break block17;
                                                double d2 = ((DataInputStream)object).readDouble();
                                                objectArray = d2;
                                                break block11;
                                            }
                                            n7 = 7;
                                            f5 = 9.8E-45f;
                                            if (n3 != n7) break block18;
                                            objectArray = ((DataInputStream)object).readUTF();
                                            break block11;
                                        }
                                        n7 = 8;
                                        f5 = 1.1E-44f;
                                        if (n3 != n7) break block19;
                                        n3 = ((DataInputStream)object).readInt();
                                        objectArray = new Boolean[n3];
                                        for (n4 = 0; n4 < n3; ++n4) {
                                            Boolean bl3;
                                            n7 = (int)(((DataInputStream)object).readBoolean() ? 1 : 0);
                                            objectArray[n4] = bl3 = Boolean.valueOf(n7 != 0);
                                        }
                                        break block11;
                                    }
                                    n7 = 9;
                                    f5 = 1.3E-44f;
                                    if (n3 != n7) break block20;
                                    n3 = ((DataInputStream)object).readInt();
                                    objectArray = new Byte[n3];
                                    while (n4 < n3) {
                                        Byte by4;
                                        n7 = ((DataInputStream)object).readByte();
                                        objectArray[n4] = by4 = Byte.valueOf((byte)n7);
                                        ++n4;
                                    }
                                    break block11;
                                }
                                n7 = 10;
                                f5 = 1.4E-44f;
                                if (n3 != n7) break block21;
                                n3 = ((DataInputStream)object).readInt();
                                objectArray = new Integer[n3];
                                while (n4 < n3) {
                                    Integer n10;
                                    n7 = ((DataInputStream)object).readInt();
                                    objectArray[n4] = n10 = Integer.valueOf(n7);
                                    ++n4;
                                }
                                break block11;
                            }
                            n7 = 11;
                            f5 = 1.5E-44f;
                            if (n3 != n7) break block22;
                            n3 = ((DataInputStream)object).readInt();
                            objectArray = new Long[n3];
                            while (n4 < n3) {
                                Long l3;
                                long l4 = ((DataInputStream)object).readLong();
                                objectArray[n4] = l3 = Long.valueOf(l4);
                                ++n4;
                            }
                            break block11;
                        }
                        n7 = 12;
                        f5 = 1.7E-44f;
                        if (n3 != n7) break block23;
                        n3 = ((DataInputStream)object).readInt();
                        objectArray = new Float[n3];
                        while (n4 < n3) {
                            Float f7;
                            f5 = ((DataInputStream)object).readFloat();
                            objectArray[n4] = f7 = Float.valueOf(f5);
                            ++n4;
                        }
                        break block11;
                    }
                    n7 = 13;
                    f5 = 1.8E-44f;
                    if (n3 != n7) break block24;
                    n3 = ((DataInputStream)object).readInt();
                    objectArray = new Double[n3];
                    while (n4 < n3) {
                        Double d5;
                        double d7 = ((DataInputStream)object).readDouble();
                        objectArray[n4] = d5 = Double.valueOf(d7);
                        ++n4;
                    }
                    break block11;
                }
                n7 = 14;
                f5 = 2.0E-44f;
                if (n3 != n7) break block25;
                n3 = ((DataInputStream)object).readInt();
                String[] stringArray = new String[n3];
                while (n4 < n3) {
                    String string2;
                    String string3 = ((DataInputStream)object).readUTF();
                    boolean bl4 = Intrinsics.areEqual(string3, string2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d");
                    if (bl4) {
                        string3 = null;
                    }
                    stringArray[n4] = string3;
                    ++n4;
                }
                objectArray = stringArray;
            }
            return (Serializable)objectArray;
        }
        String string4 = hj0_0.a(n3, "Unsupported type ");
        object = new IllegalStateException(string4);
        throw object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] b(b object) {
        int n3;
        block11: {
            Object object2 = "data";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream((OutputStream)object2);
            int n4 = -21521;
            {
                Throwable throwable2;
                block12: {
                    catch (IOException iOException) {
                        break block11;
                    }
                    try {
                        dataOutputStream.writeShort(n4);
                        n4 = 1;
                        dataOutputStream.writeShort(n4);
                        Object object3 = ((b)object).a;
                        n4 = ((HashMap)object3).size();
                        dataOutputStream.writeInt(n4);
                        object = ((b)object).a;
                        object = ((HashMap)object).entrySet();
                        object = object.iterator();
                        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                            object3 = object.next();
                            object3 = (Map.Entry)object3;
                            Object object4 = object3.getKey();
                            object4 = (String)object4;
                            object3 = object3.getValue();
                            b$b.c(dataOutputStream, object4, object3);
                        }
                    }
                    catch (Throwable throwable2) {
                        break block12;
                    }
                    dataOutputStream.flush();
                    n3 = dataOutputStream.size();
                    n4 = 10240;
                    if (n3 <= n4) {
                        object = ((ByteArrayOutputStream)object2).toByteArray();
                        object2 = null;
                        {
                            xj3_1.b(dataOutputStream, null);
                            object2 = "{\n                ByteAr\u2026          }\n            }";
                            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                            return object;
                        }
                    }
                    object = "Data cannot occupy more than 10240 bytes when serialized";
                    {
                        object = object.toString();
                        object2 = new IllegalStateException((String)object);
                        throw object2;
                    }
                }
                try {
                    throw throwable2;
                }
                catch (Throwable throwable3) {}
                {
                    xj3_1.b(dataOutputStream, throwable2);
                    throw throwable3;
                }
            }
        }
        n3 = xi0.a;
        qx1.a().getClass();
        n3 = 0;
        return new byte[0];
    }

    public static final void c(DataOutputStream dataOutputStream, String string2, Object objectArray) {
        String string3;
        StringBuilder stringBuilder;
        Object object;
        Object object2;
        block38: {
            block46: {
                block30: {
                    int n3;
                    int n4;
                    int n7;
                    int n8;
                    int n10;
                    int n14;
                    int n15;
                    int n16;
                    yn1_2 yn1_22;
                    int n17;
                    block40: {
                        yn1_2 yn1_23;
                        block45: {
                            block44: {
                                block43: {
                                    block42: {
                                        block41: {
                                            block39: {
                                                block37: {
                                                    int n18;
                                                    block36: {
                                                        block35: {
                                                            block34: {
                                                                block33: {
                                                                    block32: {
                                                                        block31: {
                                                                            block29: {
                                                                                object2 = dataOutputStream;
                                                                                object = objectArray;
                                                                                n18 = 0;
                                                                                stringBuilder = null;
                                                                                if (objectArray != null) break block29;
                                                                                dataOutputStream.writeByte(0);
                                                                                break block30;
                                                                            }
                                                                            n17 = objectArray instanceof Boolean;
                                                                            if (n17 == 0) break block31;
                                                                            n18 = 1;
                                                                            dataOutputStream.writeByte(n18);
                                                                            object = (Boolean)objectArray;
                                                                            boolean bl2 = (Boolean)object;
                                                                            dataOutputStream.writeBoolean(bl2);
                                                                            break block30;
                                                                        }
                                                                        n17 = objectArray instanceof Byte;
                                                                        if (n17 == 0) break block32;
                                                                        n18 = 2;
                                                                        dataOutputStream.writeByte(n18);
                                                                        object = (Number)objectArray;
                                                                        byte by2 = ((Number)object).byteValue();
                                                                        dataOutputStream.writeByte(by2);
                                                                        break block30;
                                                                    }
                                                                    n17 = objectArray instanceof Integer;
                                                                    if (n17 == 0) break block33;
                                                                    n18 = 3;
                                                                    dataOutputStream.writeByte(n18);
                                                                    object = (Number)objectArray;
                                                                    int n19 = ((Number)object).intValue();
                                                                    dataOutputStream.writeInt(n19);
                                                                    break block30;
                                                                }
                                                                n17 = objectArray instanceof Long;
                                                                if (n17 == 0) break block34;
                                                                n18 = 4;
                                                                dataOutputStream.writeByte(n18);
                                                                object = (Number)objectArray;
                                                                long l2 = ((Number)object).longValue();
                                                                dataOutputStream.writeLong(l2);
                                                                break block30;
                                                            }
                                                            n17 = objectArray instanceof Float;
                                                            if (n17 == 0) break block35;
                                                            n18 = 5;
                                                            dataOutputStream.writeByte(n18);
                                                            object = (Number)objectArray;
                                                            float f5 = ((Number)object).floatValue();
                                                            dataOutputStream.writeFloat(f5);
                                                            break block30;
                                                        }
                                                        n17 = objectArray instanceof Double;
                                                        if (n17 == 0) break block36;
                                                        n18 = 6;
                                                        dataOutputStream.writeByte(n18);
                                                        object = (Number)objectArray;
                                                        double d2 = ((Number)object).doubleValue();
                                                        dataOutputStream.writeDouble(d2);
                                                        break block30;
                                                    }
                                                    n17 = objectArray instanceof String;
                                                    if (n17 == 0) break block37;
                                                    n18 = 7;
                                                    dataOutputStream.writeByte(n18);
                                                    object = (String)objectArray;
                                                    dataOutputStream.writeUTF((String)object);
                                                    break block30;
                                                }
                                                n17 = objectArray instanceof Object[];
                                                string3 = "Unsupported value type ";
                                                if (n17 == 0) break block38;
                                                object = objectArray;
                                                yn1_23 = Reflection.getOrCreateKotlinClass(object.getClass());
                                                yn1_22 = Reflection.getOrCreateKotlinClass(Boolean[].class);
                                                n16 = Intrinsics.areEqual(yn1_23, yn1_22);
                                                n15 = 14;
                                                n14 = 13;
                                                n10 = 12;
                                                n8 = 11;
                                                n7 = 10;
                                                n4 = 9;
                                                n3 = 8;
                                                if (n16 == 0) break block39;
                                                n17 = 8;
                                                break block40;
                                            }
                                            yn1_22 = Reflection.getOrCreateKotlinClass(Byte[].class);
                                            n16 = Intrinsics.areEqual(yn1_23, yn1_22);
                                            if (n16 == 0) break block41;
                                            n17 = 9;
                                            break block40;
                                        }
                                        yn1_22 = Reflection.getOrCreateKotlinClass(Integer[].class);
                                        n16 = Intrinsics.areEqual(yn1_23, yn1_22);
                                        if (n16 == 0) break block42;
                                        n17 = 10;
                                        break block40;
                                    }
                                    yn1_22 = Reflection.getOrCreateKotlinClass(Long[].class);
                                    n16 = (int)(Intrinsics.areEqual(yn1_23, yn1_22) ? 1 : 0);
                                    if (n16 == 0) break block43;
                                    n17 = 11;
                                    break block40;
                                }
                                yn1_22 = Reflection.getOrCreateKotlinClass(Float[].class);
                                n16 = (int)(Intrinsics.areEqual(yn1_23, yn1_22) ? 1 : 0);
                                if (n16 == 0) break block44;
                                n17 = 12;
                                break block40;
                            }
                            yn1_22 = Reflection.getOrCreateKotlinClass(Double[].class);
                            n16 = (int)(Intrinsics.areEqual(yn1_23, yn1_22) ? 1 : 0);
                            if (n16 == 0) break block45;
                            n17 = 13;
                            break block40;
                        }
                        yn1_22 = Reflection.getOrCreateKotlinClass(String[].class);
                        n17 = (int)(Intrinsics.areEqual(yn1_23, yn1_22) ? 1 : 0);
                        if (n17 == 0) break block46;
                        n17 = 14;
                    }
                    ((DataOutputStream)object2).writeByte(n17);
                    int n20 = ((Object)object).length;
                    ((DataOutputStream)object2).writeInt(n20);
                    n20 = ((Object)object).length;
                    yn1_22 = null;
                    for (n16 = 0; n16 < n20; ++n16) {
                        double d5;
                        long l3;
                        float f6;
                        int n21;
                        boolean bl3;
                        Object object3 = object[n16];
                        Object object4 = null;
                        if (n17 == n3) {
                            bl3 = object3 instanceof Boolean;
                            if (bl3) {
                                object4 = object3;
                                object4 = (Boolean)object3;
                            }
                            if (object4 != null) {
                                n21 = ((Boolean)object4).booleanValue();
                            } else {
                                n21 = 0;
                                f6 = 0.0f;
                                object3 = null;
                            }
                            ((DataOutputStream)object2).writeBoolean(n21 != 0);
                            continue;
                        }
                        if (n17 == n4) {
                            bl3 = object3 instanceof Byte;
                            if (bl3) {
                                object4 = object3;
                                object4 = (Byte)object3;
                            }
                            if (object4 != null) {
                                n21 = ((Byte)object4).byteValue();
                            } else {
                                n21 = 0;
                                f6 = 0.0f;
                                object3 = null;
                            }
                            ((DataOutputStream)object2).writeByte(n21);
                            continue;
                        }
                        if (n17 == n7) {
                            bl3 = object3 instanceof Integer;
                            if (bl3) {
                                object4 = object3;
                                object4 = (Integer)object3;
                            }
                            if (object4 != null) {
                                n21 = (Integer)object4;
                            } else {
                                n21 = 0;
                                f6 = 0.0f;
                                object3 = null;
                            }
                            ((DataOutputStream)object2).writeInt(n21);
                            continue;
                        }
                        if (n17 == n8) {
                            bl3 = object3 instanceof Long;
                            if (bl3) {
                                object4 = object3;
                                object4 = (Long)object3;
                            }
                            if (object4 != null) {
                                l3 = (Long)object4;
                            } else {
                                l3 = 0L;
                                d5 = 0.0;
                            }
                            ((DataOutputStream)object2).writeLong(l3);
                            continue;
                        }
                        if (n17 == n10) {
                            bl3 = object3 instanceof Float;
                            if (bl3) {
                                object4 = object3;
                                object4 = (Float)object3;
                            }
                            if (object4 != null) {
                                f6 = ((Float)object4).floatValue();
                            } else {
                                n21 = 0;
                                f6 = 0.0f;
                                object3 = null;
                            }
                            ((DataOutputStream)object2).writeFloat(f6);
                            continue;
                        }
                        if (n17 == n14) {
                            bl3 = object3 instanceof Double;
                            if (bl3) {
                                object4 = object3;
                                object4 = (Double)object3;
                            }
                            if (object4 != null) {
                                d5 = (Double)object4;
                            } else {
                                l3 = 0L;
                                d5 = 0.0;
                            }
                            ((DataOutputStream)object2).writeDouble(d5);
                            continue;
                        }
                        if (n17 != n15) continue;
                        bl3 = object3 instanceof String;
                        if (bl3) {
                            object4 = object3;
                            object4 = (String)object3;
                        }
                        if (object4 == null) {
                            object4 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                        }
                        ((DataOutputStream)object2).writeUTF((String)object4);
                    }
                }
                dataOutputStream.writeUTF(string2);
                return;
            }
            stringBuilder = new StringBuilder(string3);
            object = Reflection.getOrCreateKotlinClass(object.getClass()).getQualifiedName();
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        stringBuilder = new StringBuilder(string3);
        object = Reflection.getOrCreateKotlinClass(objectArray.getClass()).getSimpleName();
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

