/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

public final class kB2 {
    public static final byte[] a;
    public static final byte[] b;

    static {
        byte[] byArray;
        byte[] byArray2;
        int n3 = 4;
        byte[] byArray3 = byArray2 = new byte[n3];
        byte[] byArray4 = byArray2;
        byArray3[0] = 112;
        byArray4[1] = 114;
        byArray3[2] = 111;
        byArray4[3] = 0;
        a = byArray2;
        byte[] byArray5 = byArray = new byte[n3];
        byte[] byArray6 = byArray;
        byArray5[0] = 112;
        byArray6[1] = 114;
        byArray5[2] = 109;
        byArray6[3] = 0;
        b = byArray;
    }

    public static byte[] a(Rp0[] object, byte[] object2) {
        int n3;
        int n4;
        int n7;
        Object object3;
        Object object4;
        Rp0 rp0;
        int n8;
        int n10 = ((Rp0[])object).length;
        int n14 = 0;
        Object object5 = null;
        int n15 = 0;
        for (n8 = 0; n8 < n10; ++n8) {
            rp0 = object[n8];
            object4 = rp0.a;
            object3 = rp0.b;
            object4 = kB2.b((String)object4, (String)object3, object2);
            object3 = StandardCharsets.UTF_8;
            object4 = ((String)object4).getBytes((Charset)object3);
            int n16 = ((Object)object4).length + 16;
            int n17 = rp0.e * 2 + n16;
            n16 = rp0.f;
            n7 = (rp0.g * 2 + 7 & 0xFFFFFFF8) / 8 + (n17 += n16);
            n15 += n7;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n15);
        object5 = mb2_0.c;
        n8 = (int)(Arrays.equals(object2, object5) ? 1 : 0);
        if (n8 != 0) {
            n8 = ((Rp0[])object).length;
            while (n14 < n8) {
                rp0 = object[n14];
                object4 = rp0.a;
                object3 = rp0.b;
                object4 = kB2.b((String)object4, (String)object3, object2);
                kB2.k(byteArrayOutputStream, rp0, (String)object4);
                kB2.j(byteArrayOutputStream, rp0);
                ++n14;
            }
        } else {
            n8 = ((Rp0[])object).length;
            rp0 = null;
            for (n7 = 0; n7 < n8; ++n7) {
                object4 = object[n7];
                object3 = ((Rp0)object4).a;
                String string2 = ((Rp0)object4).b;
                object3 = kB2.b((String)object3, string2, object2);
                kB2.k(byteArrayOutputStream, (Rp0)object4, (String)object3);
            }
            n4 = ((Rp0[])object).length;
            while (n14 < n4) {
                object5 = object[n14];
                kB2.j(byteArrayOutputStream, (Rp0)object5);
                ++n14;
            }
        }
        if ((n3 = byteArrayOutputStream.size()) == n15) {
            return byteArrayOutputStream.toByteArray();
        }
        object = new StringBuilder("The bytes saved do not match expectation. actual=");
        n4 = byteArrayOutputStream.size();
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append(" expected=");
        ((StringBuilder)object).append(n15);
        object = ((StringBuilder)object).toString();
        object2 = new IllegalStateException;
        object2((String)object);
        throw object2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static String b(String charSequence, String string2, byte[] byArray) {
        String string3;
        void var2_3;
        byte[] byArray2 = mb2_0.e;
        boolean bl2 = Arrays.equals((byte[])var2_3, byArray2);
        byte[] byArray3 = mb2_0.d;
        String string4 = "!";
        String string5 = ":";
        String string6 = bl2 || (bl2 = Arrays.equals((byte[])var2_3, byArray3)) ? string5 : string4;
        int n3 = ((String)charSequence).length();
        if (n3 <= 0) {
            boolean bl3 = string4.equals(string6);
            if (bl3) {
                return string3.replace(string5, string4);
            }
            bl3 = string5.equals(string6);
            if (!bl3) return string3;
            return string3.replace(string4, string5);
        }
        String string7 = "classes.dex";
        n3 = (int)(string3.equals(string7) ? 1 : 0);
        if (n3 != 0) {
            return charSequence;
        }
        n3 = (int)(string3.contains(string4) ? 1 : 0);
        if (n3 == 0 && (n3 = (int)(string3.contains(string5) ? 1 : 0)) == 0) {
            string6 = ".apk";
            bl2 = string3.endsWith(string6);
            if (bl2) {
                return string3;
            }
            StringBuilder stringBuilder = Ex0.a((String)charSequence);
            boolean bl4 = Arrays.equals((byte[])var2_3, byArray2);
            if (!bl4) {
                boolean bl5 = Arrays.equals((byte[])var2_3, byArray3);
                if (!bl5) return h30_0.a(stringBuilder, string4, string3);
            }
            string4 = string5;
            return h30_0.a(stringBuilder, string4, string3);
        }
        boolean bl6 = string4.equals(string6);
        if (bl6) {
            return string3.replace(string5, string4);
        }
        bl6 = string5.equals(string6);
        if (!bl6) return string3;
        return string3.replace(string4, string5);
    }

    public static int[] c(ByteArrayInputStream byteArrayInputStream, int n3) {
        int[] nArray = new int[n3];
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7 = 2;
            long l2 = gz0_0.e(byteArrayInputStream, n7);
            int n8 = (int)l2;
            nArray[i3] = n4 += n8;
        }
        return nArray;
    }

    public static Rp0[] d(FileInputStream object, byte[] objectArray, byte[] byArray, Rp0[] rp0Array) {
        byte[] byArray2 = mb2_0.f;
        int n3 = Arrays.equals(objectArray, byArray2);
        String string2 = "Unsupported meta version";
        String string3 = "Content found after the end of file";
        int n4 = 4;
        if (n3 != 0) {
            byte[] byArray3 = mb2_0.a;
            int n7 = Arrays.equals(byArray3, byArray);
            if (n7 == 0) {
                int n8 = Arrays.equals(objectArray, byArray2);
                if (n8 != 0) {
                    long l2 = gz0_0.e((InputStream)object, 1);
                    n7 = (int)l2;
                    long l3 = gz0_0.e((InputStream)object, n4);
                    long l4 = gz0_0.e((InputStream)object, n4);
                    n8 = (int)l4;
                    n3 = (int)l3;
                    objectArray = gz0_0.d((FileInputStream)object, n8, n3);
                    int n10 = ((InputStream)object).read();
                    if (n10 <= 0) {
                        object = new ByteArrayInputStream((byte[])objectArray);
                        try {
                            objectArray = kB2.e((ByteArrayInputStream)object, n7, rp0Array);
                            return objectArray;
                        }
                        finally {
                            ((InputStream)object).close();
                        }
                    }
                    object = new IllegalStateException(string3);
                    throw object;
                }
                object = new IllegalStateException(string2);
                throw object;
            }
            object = new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            throw object;
        }
        byArray2 = mb2_0.g;
        int n14 = Arrays.equals(objectArray, byArray2);
        if (n14 != 0) {
            n14 = (int)gz0_0.e((InputStream)object, 2);
            long l7 = gz0_0.e((InputStream)object, n4);
            long l8 = gz0_0.e((InputStream)object, n4);
            int n15 = (int)l8;
            n3 = (int)l7;
            byArray2 = gz0_0.d((FileInputStream)object, n15, n3);
            int n16 = ((InputStream)object).read();
            if (n16 <= 0) {
                object = new ByteArrayInputStream(byArray2);
                try {
                    objectArray = kB2.f((ByteArrayInputStream)object, byArray, n14, rp0Array);
                    return objectArray;
                }
                finally {
                    ((InputStream)object).close();
                }
            }
            object = new IllegalStateException(string3);
            throw object;
        }
        object = new IllegalStateException(string2);
        throw object;
    }

    public static Rp0[] e(ByteArrayInputStream object, int n3, Rp0[] rp0Array) {
        int n4 = ((InputStream)object).available();
        int n7 = 0;
        if (n4 == 0) {
            return new Rp0[0];
        }
        n4 = rp0Array.length;
        if (n3 == n4) {
            Object object2;
            Object object3;
            int n8;
            String[] stringArray = new String[n3];
            int[] nArray = new int[n3];
            Rp0 rp0 = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                int n10;
                n8 = 2;
                long l2 = gz0_0.e((InputStream)object, n8);
                int n14 = (int)l2;
                long l3 = gz0_0.e((InputStream)object, n8);
                nArray[i3] = n10 = (int)l3;
                object3 = gz0_0.c((InputStream)object, n14);
                Charset charset = StandardCharsets.UTF_8;
                stringArray[i3] = object2 = new String((byte[])object3, charset);
            }
            while (n7 < n3) {
                rp0 = rp0Array[n7];
                object2 = rp0.b;
                object3 = stringArray[n7];
                n8 = (int)(((String)object2).equals(object3) ? 1 : 0);
                if (n8 != 0) {
                    rp0.e = n8 = nArray[n7];
                    object2 = kB2.c((ByteArrayInputStream)object, n8);
                    rp0.h = (int[])object2;
                    ++n7;
                    continue;
                }
                object = new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                throw object;
            }
            return rp0Array;
        }
        object = new IllegalStateException("Mismatched number of dex files found in metadata");
        throw object;
    }

    public static Rp0[] f(ByteArrayInputStream object, byte[] object2, int n3, Rp0[] rp0Array) {
        int n4 = ((InputStream)object).available();
        if (n4 == 0) {
            return new Rp0[0];
        }
        n4 = rp0Array.length;
        if (n3 == n4) {
            for (n4 = 0; n4 < n3; ++n4) {
                int n7 = 2;
                gz0_0.e((InputStream)object, n7);
                long l2 = gz0_0.e((InputStream)object, n7);
                int n8 = (int)l2;
                byte[] byArray = gz0_0.c((InputStream)object, n8);
                Charset charset = StandardCharsets.UTF_8;
                Object object3 = new String(byArray, charset);
                n8 = 4;
                long l3 = gz0_0.e((InputStream)object, n8);
                long l4 = gz0_0.e((InputStream)object, n7);
                n7 = (int)l4;
                int n10 = rp0Array.length;
                Rp0 rp0 = null;
                if (n10 > 0) {
                    int n14;
                    Object object4 = "!";
                    n10 = ((String)object3).indexOf((String)object4);
                    if (n10 < 0) {
                        object4 = ":";
                        n10 = ((String)object3).indexOf((String)object4);
                    }
                    object4 = n10 > 0 ? ((String)object3).substring(++n10) : object3;
                    for (int i3 = 0; i3 < (n14 = rp0Array.length); ++i3) {
                        String string2 = rp0Array[i3].b;
                        n14 = (int)(string2.equals(object4) ? 1 : 0);
                        if (n14 == 0) continue;
                        rp0 = rp0Array[i3];
                        break;
                    }
                }
                if (rp0 != null) {
                    rp0.d = l3;
                    object3 = kB2.c((ByteArrayInputStream)object, n7);
                    byArray = mb2_0.e;
                    n8 = (int)(Arrays.equals(object2, byArray) ? 1 : 0);
                    if (n8 == 0) continue;
                    rp0.e = n7;
                    rp0.h = (int[])object3;
                    continue;
                }
                object = "Missing profile key: ".concat((String)object3);
                object2 = new IllegalStateException;
                object2((String)object);
                throw object2;
            }
            return rp0Array;
        }
        object = new IllegalStateException("Mismatched number of dex files found in metadata");
        throw object;
    }

    public static Rp0[] g(FileInputStream object, byte[] objectArray, String string2) {
        byte[] byArray = mb2_0.b;
        int n3 = Arrays.equals(objectArray, byArray);
        if (n3 != 0) {
            long l2 = gz0_0.e((InputStream)object, 1);
            n3 = (int)l2;
            int n4 = 4;
            long l3 = gz0_0.e((InputStream)object, n4);
            long l4 = gz0_0.e((InputStream)object, n4);
            n4 = (int)l4;
            int n7 = (int)l3;
            byArray = gz0_0.d((FileInputStream)object, n4, n7);
            int n8 = ((InputStream)object).read();
            if (n8 <= 0) {
                object = new ByteArrayInputStream(byArray);
                try {
                    objectArray = kB2.h((ByteArrayInputStream)object, string2, n3);
                    return objectArray;
                }
                finally {
                    ((InputStream)object).close();
                }
            }
            object = new IllegalStateException("Content found after the end of file");
            throw object;
        }
        object = new IllegalStateException("Unsupported version");
        throw object;
    }

    public static Rp0[] h(ByteArrayInputStream byteArrayInputStream, String string2, int n3) {
        Object object;
        int n4;
        Object object2;
        Object object3;
        int n7;
        int n8;
        int n10;
        Object object4 = byteArrayInputStream;
        int n14 = n3;
        int n15 = ((InputStream)byteArrayInputStream).available();
        if (n15 == 0) {
            return new Rp0[0];
        }
        Rp0[] rp0Array = new Rp0[n3];
        int n16 = 0;
        while (true) {
            Rp0 rp0;
            n10 = 2;
            if (n16 >= n14) break;
            long l2 = gz0_0.e((InputStream)object4, n10);
            n8 = (int)l2;
            n7 = (int)gz0_0.e((InputStream)object4, n10);
            n10 = 4;
            long l3 = gz0_0.e((InputStream)object4, n10);
            long l4 = gz0_0.e((InputStream)object4, n10);
            long l7 = gz0_0.e((InputStream)object4, n10);
            object3 = gz0_0.c((InputStream)object4, n8);
            Charset charset = StandardCharsets.UTF_8;
            object2 = new String((byte[])object3, charset);
            n4 = (int)l3;
            int n17 = (int)l7;
            int[] nArray = new int[n7];
            TreeMap treeMap = new TreeMap();
            object = string2;
            rp0Array[n16] = rp0 = new Rp0(string2, (String)object2, l4, n7, n4, n17, nArray, treeMap);
            ++n16;
        }
        for (n16 = 0; n16 < n14; ++n16) {
            TreeMap treeMap;
            int n18;
            int n19;
            Rp0 rp0 = rp0Array[n16];
            n8 = ((InputStream)byteArrayInputStream).available();
            int n20 = rp0.f;
            n8 -= n20;
            n20 = 0;
            block2: while (true) {
                n19 = ((InputStream)byteArrayInputStream).available();
                n18 = 7;
                treeMap = rp0.i;
                if (n19 <= n8) break;
                long l8 = gz0_0.e((InputStream)object4, n10);
                n19 = (int)l8;
                object = n20 += n19;
                int n21 = 1;
                Integer n22 = n21;
                treeMap.put(object, n22);
                long l12 = gz0_0.e((InputStream)object4, n10);
                n19 = (int)l12;
                while (true) {
                    int n24;
                    if (n19 <= 0) continue block2;
                    gz0_0.e((InputStream)object4, n10);
                    l12 = gz0_0.e((InputStream)object4, n21);
                    n7 = 6;
                    if (n24 != n7 && n24 != n18) {
                        for (n24 = (int)l12; n24 > 0; n24 += -1) {
                            gz0_0.e((InputStream)object4, n21);
                            l12 = gz0_0.e((InputStream)object4, n21);
                            for (n4 = (int)l12; n4 > 0; n4 += -1) {
                                gz0_0.e((InputStream)object4, n10);
                            }
                        }
                    }
                    n19 += -1;
                }
                break;
            }
            n20 = ((InputStream)byteArrayInputStream).available();
            if (n20 == n8) {
                n8 = rp0.e;
                object3 = kB2.c((ByteArrayInputStream)object4, n8);
                rp0.h = (int[])object3;
                int n25 = rp0.g;
                n8 = (n25 * 2 + n18 & 0xFFFFFFF8) / 8;
                object3 = BitSet.valueOf(gz0_0.c((InputStream)object4, n8));
                for (n20 = 0; n20 < n25; ++n20) {
                    n19 = (int)(((BitSet)object3).get(n20) ? 1 : 0);
                    if (n19 != 0) {
                        n19 = 2;
                    } else {
                        n19 = 0;
                        object = null;
                    }
                    n18 = n20 + n25;
                    n18 = (int)(((BitSet)object3).get(n18) ? 1 : 0);
                    if (n18 != 0) {
                        n19 |= 4;
                    }
                    if (n19 == 0) continue;
                    object2 = n20;
                    if ((object2 = (Integer)treeMap.get(object2)) == null) {
                        object2 = 0;
                    }
                    Integer n26 = n20;
                    n18 = (Integer)object2;
                    object = n19 |= n18;
                    treeMap.put(n26, object);
                }
                continue;
            }
            object4 = new IllegalStateException("Read too much data during profile line parse");
            throw object4;
        }
        return rp0Array;
    }

    /*
     * Exception decompiling
     */
    public static boolean i(ByteArrayOutputStream var0, byte[] var1_1, Rp0[] var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 16[TRYBLOCK] [19 : 270->275)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, Rp0 object) {
        int n3;
        int n4;
        kB2.m(byteArrayOutputStream, (Rp0)object);
        int[] nArray = ((Rp0)object).h;
        int n7 = nArray.length;
        Object object2 = null;
        int n8 = 0;
        Integer n10 = null;
        for (n4 = 0; n4 < n7; ++n4) {
            n3 = nArray[n4];
            n8 = n3 - n8;
            gz0_0.g(byteArrayOutputStream, n8);
            n8 = n3;
        }
        int n14 = ((Rp0)object).g;
        n7 = (n14 * 2 + 7 & 0xFFFFFFF8) / 8;
        byte[] byArray = new byte[n7];
        object = ((Rp0)object).i.entrySet().iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (Map.Entry)object.next();
            n10 = (Integer)object2.getKey();
            n8 = n10;
            object2 = (Integer)object2.getValue();
            n4 = (Integer)object2;
            n3 = n4 & 2;
            int n15 = 1;
            if (n3 != 0) {
                n3 = n8 / 8;
                byte by2 = byArray[n3];
                int n16 = n8 % 8;
                n16 = n15 << n16;
                byArray[n3] = by2 = (byte)(by2 | n16);
            }
            if ((n4 &= 4) == 0) continue;
            n4 = (n8 += n14) / 8;
            n3 = byArray[n4];
            n8 %= 8;
            byArray[n4] = n8 = (int)((byte)(n15 << n8 | n3));
        }
        byteArrayOutputStream.write(byArray);
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, Rp0 object, String string2) {
        Charset charset = StandardCharsets.UTF_8;
        int n3 = string2.getBytes(charset).length;
        gz0_0.g(byteArrayOutputStream, n3);
        n3 = ((Rp0)object).e;
        gz0_0.g(byteArrayOutputStream, n3);
        long l2 = ((Rp0)object).f;
        int n4 = 4;
        gz0_0.f(byteArrayOutputStream, l2, n4);
        l2 = ((Rp0)object).c;
        gz0_0.f(byteArrayOutputStream, l2, n4);
        l2 = ((Rp0)object).g;
        gz0_0.f(byteArrayOutputStream, l2, n4);
        object = string2.getBytes(charset);
        byteArrayOutputStream.write((byte[])object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void l(ByteArrayOutputStream byteArrayOutputStream, int n3, Rp0 iterator) {
        int n4 = Integer.bitCount(n3 & 0xFFFFFFFE);
        int n7 = ((Rp0)((Object)iterator)).g;
        n4 = (n4 * n7 + 7 & 0xFFFFFFF8) / 8;
        byte[] byArray = new byte[n4];
        iterator = ((Rp0)((Object)iterator)).i.entrySet().iterator();
        block0: while (true) {
            int n8;
            if ((n8 = iterator.hasNext()) == 0) {
                byteArrayOutputStream.write(byArray);
                return;
            }
            Object object = iterator.next();
            Integer n10 = (Integer)object.getKey();
            int n14 = n10;
            object = (Integer)object.getValue();
            n8 = (Integer)object;
            int n15 = 1;
            int n16 = 0;
            int n17 = 1;
            while (true) {
                int n18;
                if (n17 > (n18 = 4)) continue block0;
                if (n17 != n15 && (n18 = n17 & n3) != 0) {
                    n18 = n17 & n8;
                    if (n18 == n17) {
                        n18 = n16 * n7 + n14;
                        int n19 = n18 / 8;
                        byte by2 = byArray[n19];
                        n18 %= 8;
                        byArray[n19] = n18 = (int)((byte)(n15 << n18 | by2));
                    }
                    ++n16;
                }
                n17 <<= 1;
            }
            break;
        }
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, Rp0 object) {
        int n3;
        object = ((Rp0)object).i.entrySet().iterator();
        int n4 = 0;
        while ((n3 = object.hasNext()) != 0) {
            Object object2 = (Map.Entry)object.next();
            Integer n7 = (Integer)object2.getKey();
            int n8 = n7;
            n3 = (Integer)(object2 = (Integer)object2.getValue()) & 1;
            if (n3 == 0) continue;
            n4 = n8 - n4;
            gz0_0.g(byteArrayOutputStream, n4);
            gz0_0.g(byteArrayOutputStream, 0);
            n4 = n8;
        }
    }
}

