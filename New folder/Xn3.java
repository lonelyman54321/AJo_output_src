/*
 * Decompiled with CFR 0.152.
 */
import com.cardreader.card_reader_lib.xutils.TlvException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

public final class Xn3 {
    public static boolean a(Object[] objectArray, Object object) {
        int n3;
        int n4;
        boolean bl2;
        block7: {
            bl2 = false;
            n4 = -1;
            if (object == null) {
                int n7;
                object = null;
                for (n3 = 0; n3 < (n7 = objectArray.length); ++n3) {
                    Object object2 = objectArray[n3];
                    if (object2 != null) {
                        continue;
                    }
                    break block7;
                }
            } else {
                Class<?> clazz = objectArray.getClass().getComponentType();
                int n8 = clazz.isInstance(object);
                if (n8 != 0) {
                    int n10;
                    clazz = null;
                    for (n8 = 0; n8 < (n10 = objectArray.length); ++n8) {
                        Object object3 = objectArray[n8];
                        n10 = (int)(object.equals(object3) ? 1 : 0);
                        if (n10 == 0) continue;
                        n3 = n8;
                        break block7;
                    }
                }
            }
            n3 = -1;
        }
        if (n3 != n4) {
            bl2 = true;
        }
        return bl2;
    }

    public static kh3_0 b(ByteArrayInputStream object) {
        int n3 = ((ByteArrayInputStream)object).available();
        Object object2 = "Error parsing data. Available bytes < 2 . Length=";
        int n4 = 2;
        if (n3 >= n4) {
            int n7;
            int n8;
            n3 = 0;
            Object object3 = null;
            ((ByteArrayInputStream)object).mark(0);
            int n10 = ((ByteArrayInputStream)object).read();
            while (true) {
                n8 = n10;
                n7 = -1;
                if (n10 == n7 || n8 != n7 && n8 != 0) break;
                ((ByteArrayInputStream)object).mark(0);
                n10 = ((ByteArrayInputStream)object).read();
            }
            ((ByteArrayInputStream)object).reset();
            n10 = ((ByteArrayInputStream)object).available();
            if (n10 >= n4) {
                int n14;
                object2 = Xn3.e((ByteArrayInputStream)object);
                ((ByteArrayInputStream)object).mark(0);
                n4 = ((ByteArrayInputStream)object).available();
                n10 = Xn3.f((ByteArrayInputStream)object);
                n8 = ((ByteArrayInputStream)object).available();
                ((ByteArrayInputStream)object).reset();
                Object object4 = new byte[n4 -= n8];
                int n15 = 1;
                if (n4 >= n15 && n4 <= (n14 = 4)) {
                    ((ByteArrayInputStream)object).read((byte[])object4, 0, n4);
                    if (n4 > 0 && n4 <= n14) {
                        Object object5;
                        block13: {
                            int n16;
                            String string2 = null;
                            int n17 = 0;
                            for (n14 = 0; n14 < n4; ++n14) {
                                int n18 = object4[n14] & 0xFF;
                                int n19 = (n4 - n14 - n15) * 8;
                                n17 += (n18 <<= n19);
                            }
                            object5 = zz0_1.a;
                            object2.getClass();
                            object4 = new ZE;
                            object4((byte[])object2);
                            object5 = (jc1_0)((LinkedHashMap)object5).get(object4);
                            if (object5 == null) {
                                object4 = (Object)yi3.BINARY;
                                string2 = "[UNKNOWN TAG]";
                                object5 = new wi3_1((byte[])object2, (yi3)((Object)object4), string2);
                            }
                            if (n17 == (n16 = 128)) {
                                ((ByteArrayInputStream)object).mark(0);
                                n16 = 0;
                                object2 = null;
                                while (true) {
                                    n10 = n16 + 1;
                                    n8 = ((ByteArrayInputStream)object).read();
                                    if (n8 < 0) break;
                                    if (n15 == 0 && n8 == 0) {
                                        n10 = n16 + -1;
                                        object2 = new byte[n10];
                                        ((ByteArrayInputStream)object).reset();
                                        ((ByteArrayInputStream)object).read((byte[])object2, 0, n10);
                                        break block13;
                                    }
                                    n16 = n10;
                                    n15 = n8;
                                }
                                object2 = new StringBuilder("Error parsing data. TLV length byte indicated indefinite length, but EOS was reached before 0x0000 was found");
                                int n20 = ((ByteArrayInputStream)object).available();
                                ((StringBuilder)object2).append(n20);
                                object = ((StringBuilder)object2).toString();
                                object3 = new RuntimeException((String)object);
                                throw object3;
                            }
                            n16 = ((ByteArrayInputStream)object).available();
                            if (n16 < n10) {
                                object2 = wk0_0.a(n10, "Length byte(s) indicated ", " value bytes, but only ");
                                n4 = ((ByteArrayInputStream)object).available();
                                ((StringBuilder)object2).append(n4);
                                object5 = " ";
                                ((StringBuilder)object2).append((String)object5);
                                int n21 = ((ByteArrayInputStream)object).available();
                                object = n21 > n15 ? "are" : "is";
                                object = h30_0.a((StringBuilder)object2, (String)object, " available");
                                object3 = new RuntimeException((String)object);
                                throw object3;
                            }
                            object2 = new byte[n10];
                            ((ByteArrayInputStream)object).read((byte[])object2, 0, n10);
                        }
                        ((ByteArrayInputStream)object).mark(0);
                        n8 = ((ByteArrayInputStream)object).read();
                        while (true) {
                            n15 = (byte)n8;
                            if (n8 == n7 || n15 != n7 && n15 != 0) break;
                            ((ByteArrayInputStream)object).mark(0);
                            n8 = ((ByteArrayInputStream)object).read();
                        }
                        ((ByteArrayInputStream)object).reset();
                        object = new Object();
                        n3 = ((Object)object2).length;
                        if (n10 == n3) {
                            ((kh3_0)object).a = object5;
                            ((kh3_0)object).b = (byte[])object2;
                            return object;
                        }
                        object = new IllegalArgumentException("length != bytes.length");
                        throw object;
                    }
                    object3 = hj0_0.a(n4, "Length must be between 1 and 4. Length = ");
                    object = new IllegalArgumentException((String)object3);
                    throw object;
                }
                object3 = hj0_0.a(n4, "Number of length bytes must be from 1 to 4. Found ");
                object = new RuntimeException((String)object3);
                throw object;
            }
            StringBuilder stringBuilder = new StringBuilder((String)object2);
            int n22 = ((ByteArrayInputStream)object).available();
            stringBuilder.append(n22);
            object = stringBuilder.toString();
            object3 = new RuntimeException((String)object);
            throw object3;
        }
        StringBuilder stringBuilder = new StringBuilder((String)object2);
        int n24 = ((ByteArrayInputStream)object).available();
        stringBuilder.append(n24);
        object = stringBuilder.toString();
        TlvException tlvException = new RuntimeException((String)object);
        throw tlvException;
    }

    public static byte[] c(byte[] object, jc1_0 ... jc1_0Array) {
        byte[] byArray = null;
        if (object != null) {
            int n3;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
            while ((n3 = byteArrayInputStream.available()) > 0) {
                object = Xn3.b(byteArrayInputStream);
                jc1_0 jc1_02 = object.a;
                boolean bl2 = Xn3.a(jc1_0Array, jc1_02);
                object = object.b;
                if (bl2) {
                    return object;
                }
                boolean bl3 = jc1_02.b();
                if (!bl3 || (byArray = Xn3.c(object, jc1_0Array)) == null) continue;
            }
        }
        return byArray;
    }

    public static ArrayList d(byte[] object, jc1_0 ... jc1_0Array) {
        int n3;
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
        while ((n3 = byteArrayInputStream.available()) > 0) {
            object = Xn3.b(byteArrayInputStream);
            jc1_0 jc1_02 = object.a;
            boolean bl2 = Xn3.a(jc1_0Array, jc1_02);
            if (bl2) {
                arrayList.add((byte[])object);
                continue;
            }
            boolean bl3 = jc1_02.b();
            if (!bl3) continue;
            object = Xn3.d(object.b, jc1_0Array);
            arrayList.addAll((Collection<byte[]>)object);
        }
        return arrayList;
    }

    public static byte[] e(ByteArrayInputStream byteArrayInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n3 = byteArrayInputStream.read();
        byteArrayOutputStream.write(n3);
        int n4 = 31;
        if ((n3 &= n4) == n4) {
            while ((n3 = byteArrayInputStream.read()) >= 0) {
                n3 = (byte)n3;
                byteArrayOutputStream.write(n3);
                n4 = 7;
                boolean bl2 = Em3.h(n3, n4);
                if (bl2 && ((n4 = (int)(Em3.h(n3, n4) ? 1 : 0)) == 0 || (n3 &= 0x7F) != 0)) continue;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static int f(ByteArrayInputStream object) {
        int n3 = ((ByteArrayInputStream)object).read();
        if (n3 >= 0) {
            int n4 = 127;
            if (n3 > n4 && n3 != (n4 = 128)) {
                n3 &= 0x7F;
                n4 = 0;
                for (int i3 = 0; i3 < n3; ++i3) {
                    int n7 = ((ByteArrayInputStream)object).read();
                    if (n7 >= 0) {
                        n4 = n4 << 8 | n7;
                        continue;
                    }
                    object = new RuntimeException("EOS when reading length bytes");
                    throw object;
                }
                n3 = n4;
            }
            return n3;
        }
        String string2 = hj0_0.a(n3, "Negative length: ");
        object = new RuntimeException(string2);
        throw object;
    }
}

