/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import java.lang.reflect.Method;
import java.util.Map;

public class AFi1hSDK {
    private static final byte[] $$a;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static Object AFLogger;
    private static long afInfoLog;
    private static byte[] afRDLog;
    private static byte[] d;
    private static byte[] e;
    private static long force;
    private static int i;
    public static final Map registerClient;
    private static Object unregisterClient;
    private static long v;
    public static final Map valueOf;
    private static int w;

    /*
     * Unable to fully structure code
     */
    private static String $$c(short var0, int var1_1, int var2_2) {
        block7: {
            var3_3 = AFi1hSDK.$10;
            var4_4 = var3_3 + 39;
            AFi1hSDK.$11 = var4_4 % 128;
            var5_5 = 2;
            if ((var4_4 %= var5_5) == 0) {
                var4_4 = var1_1 + 37;
                var6_6 = (var2_2 += 156) ^ -50;
                var2_2 = (var2_2 & -50) << 1;
                var6_6 += var2_2;
                var7_7 = AFi1hSDK.$$a;
                var8_8 = new byte[var4_4];
                if (var7_7 != null) {
                    while (true) {
                        break block7;
                        break;
                    }
                }
            } else {
                var4_4 = (var1_1 | 1) << 1;
                var6_6 = var1_1 ^ 1;
                var4_4 -= var6_6;
                var6_6 = var2_2 ^ 35;
                var2_2 = (var2_2 & 35) << 1;
                var6_6 = var6_6 + var2_2 - var5_5;
                var0 = (short)(var0 + 4);
                var7_7 = AFi1hSDK.$$a;
                var8_8 = new byte[var4_4];
                if (var7_7 != null) ** continue;
            }
            var9_9 = var3_3 ^ 3;
            var3_3 = (var3_3 & 3) << 1;
            AFi1hSDK.$11 = var9_9 = (var9_9 + var3_3) % 128;
            var10_10 = var8_8;
            var3_3 = 0;
            var11_11 = var6_6;
            var6_6 = var4_4;
            ** GOTO lbl65
        }
        var3_3 = 0;
        while (true) {
            var9_9 = (var3_3 | 1) << 1;
            var12_12 = var3_3 ^ 1;
            var9_9 -= var12_12;
            var8_8[var3_3] = var12_12 = (int)((byte)var6_6);
            var3_3 = var0 ^ 1;
            var0 = (short)((var0 & 1) << 1);
            var3_3 += var0;
            if (var9_9 == var4_4) {
                var13_18 = new String(var8_8, 0);
                var1_1 = AFi1hSDK.$11;
                var2_2 = var1_1 ^ 111;
                var1_1 = (var1_1 & 111) << 1;
                var2_2 += var1_1;
                AFi1hSDK.$10 = var1_1 = var2_2 % 128;
                if ((var2_2 %= var5_5) == 0) {
                    return var13_18;
                }
                throw null;
            }
            var0 = var7_7[var3_3];
            var12_12 = AFi1hSDK.$10;
            var14_13 = (var12_12 | 35) << 1;
            AFi1hSDK.$11 = var14_13 = (var14_13 - (var12_12 ^= 35)) % 128;
            var11_11 = var0;
            var0 = (short)var3_3;
            var3_3 = var9_9;
            var10_10 = var8_8;
            var15_14 = var6_6;
            var6_6 = var4_4;
            var4_4 = var15_14;
lbl65:
            // 2 sources

            var4_4 += var11_11;
            var11_11 = var4_4 * -864;
            var12_12 = -2598;
            var14_13 = var12_12 ^ var11_11;
            var11_11 = (var11_11 & var12_12) << 1;
            var14_13 += var11_11;
            var11_11 = ~var4_4;
            var12_12 = ~var1_1;
            var16_15 = var5_5 ^ var12_12;
            var17_16 = var5_5 & var12_12;
            var16_15 = ~(var16_15 | var17_16);
            var11_11 = (var11_11 | var16_15) * -865 + var14_13;
            var14_13 = ~(var1_1 | -3) * 865;
            var16_15 = (var11_11 | var14_13) << 1;
            var11_11 = (var4_4 ^= -1) ^ var12_12;
            var4_4 = ~(var4_4 & var12_12 | var11_11);
            var11_11 = var12_12 ^ -3;
            var11_11 = ~(var11_11 | (var12_12 &= -3));
            var4_4 = (var4_4 | var11_11) * 865 + (var16_15 -= (var11_11 ^= var14_13));
            AFi1hSDK.$11 = var11_11 = (AFi1hSDK.$10 + 83) % 128;
            var8_8 = var10_10;
            var18_17 = var6_6;
            var6_6 = var4_4;
            var4_4 = var18_17;
        }
    }

    /*
     * Exception decompiling
     */
    static {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 68[TRYBLOCK] [70 : 2161->2164)] java.lang.Exception
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

    private AFi1hSDK() {
    }

    public static int getMediationNetwork(int n3) {
        Object object;
        Throwable throwable = null;
        int n4 = 1;
        int n7 = $10;
        int n8 = n7 & 0x47;
        $11 = n8 = (n8 + (n7 |= 0x47)) % 128;
        Object object2 = AFLogger;
        $10 = (n8 + 105) % 128;
        int n10 = n8 ^ 0x49;
        n8 = (n8 & 0x49) << n4;
        $10 = n10 = (n10 + n8) % 128;
        try {
            object = n3;
        }
        catch (Throwable throwable2) {
            throwable = throwable2.getCause();
            if (throwable != null) {
                throw throwable;
            }
            throw throwable2;
        }
        Object[] objectArray = new Object[n4];
        objectArray[0] = object;
        n3 = (short)569;
        Object object3 = $$a;
        short s7 = 495;
        s7 = object3[s7];
        int n14 = object3[0];
        object = AFi1hSDK.$$c((short)n3, s7, n14);
        Class<Integer> clazz = unregisterClient;
        clazz = (ClassLoader)((Object)clazz);
        object = Class.forName((String)object, n4 != 0, (ClassLoader)((Object)clazz));
        s7 = (short)1113;
        n14 = 14;
        n10 = object3[n14];
        n14 = (byte)70;
        object3 = AFi1hSDK.$$c(s7, n10, n14);
        Class[] classArray = new Class[n4];
        clazz = Integer.TYPE;
        classArray[0] = clazz;
        object = ((Class)object).getMethod((String)object3, classArray);
        object = ((Method)object).invoke(object2, objectArray);
        object = (Integer)object;
        n3 = (Integer)object;
        $11 = ($10 + 41) % 128;
        return n3;
    }

    public static Object getMonetizationNetwork(int n3, int n4, char c2) {
        Class<Character> clazz = null;
        int n7 = 3;
        int n8 = 1;
        int n10 = 2;
        int n14 = $10;
        int n15 = n14 & 0x29;
        int n16 = n14 | 0x29;
        $11 = (n15 += n16) % 128;
        n16 = 0;
        if ((n15 %= n10) != 0) {
            Object object;
            Object[] objectArray;
            Object object2 = AFLogger;
            int n17 = n14 ^ 0x35;
            n14 = (n14 & 0x35) << n8;
            $11 = n17 = (n17 + n14) % 128;
            try {
                objectArray = new Object[n7];
            }
            catch (Throwable throwable) {
                object = throwable.getCause();
                if (object != null) {
                    throw object;
                }
                throw throwable;
            }
            Class[] classArray = Character.valueOf(c2);
            objectArray[n10] = classArray;
            object = n4;
            objectArray[n8] = object;
            Object object3 = n3;
            objectArray[0] = object3;
            n3 = (short)569;
            object = $$a;
            c2 = (char)495;
            c2 = (char)((byte)object[c2]);
            n17 = (byte)object[0];
            object3 = AFi1hSDK.$$c((short)n3, c2, n17);
            classArray = unregisterClient;
            classArray = (ClassLoader)classArray;
            object3 = Class.forName((String)object3, n8 != 0, (ClassLoader)classArray);
            c2 = (char)1113;
            n17 = 14;
            n4 = (byte)object[n17];
            n17 = (byte)70;
            object = AFi1hSDK.$$c((short)c2, n4, n17);
            classArray = new Class[n7];
            Class<Integer> clazz2 = Integer.TYPE;
            classArray[0] = clazz2;
            classArray[n8] = clazz2;
            clazz = Character.TYPE;
            classArray[n10] = clazz;
            object3 = ((Class)object3).getMethod((String)object, classArray);
            object3 = ((Method)object3).invoke(object2, objectArray);
            n4 = $10;
            c2 = (char)(n4 & 0x13);
            c2 = (char)(c2 + (n4 |= 0x13));
            $11 = n4 = c2 % 128;
            c2 = (char)(c2 % n10);
            if (c2 != '\u0000') {
                return object3;
            }
            throw null;
        }
        throw null;
    }

    public static int getRevenue(Object object) {
        block19: {
            Object[] objectArray;
            int n3 = 0;
            Throwable throwable = null;
            int n4 = 1;
            int n7 = $11;
            Object object2 = AFLogger;
            int n8 = (n7 | 0x79) << n4;
            $10 = n8 = (n8 - (n7 ^= 0x79)) % 128;
            n7 = n8 ^ 0x6F;
            n8 = (n8 & 0x6F) << n4;
            $11 = n7 = (n7 + n8) % 128;
            try {
                objectArray = new Object[n4];
            }
            catch (Throwable throwable2) {
                throwable = throwable2.getCause();
                if (throwable != null) {
                    throw throwable;
                }
                throw throwable2;
            }
            objectArray[0] = object;
            int n10 = 569;
            Object object3 = $$a;
            short s7 = 495;
            s7 = object3[s7];
            int n14 = object3[0];
            object = AFi1hSDK.$$c((short)n10, s7, n14);
            Class[] classArray = unregisterClient;
            classArray = (ClassLoader)classArray;
            object = Class.forName((String)object, n4 != 0, (ClassLoader)classArray);
            s7 = (short)1113;
            n14 = 14;
            n8 = object3[n14];
            n14 = (byte)70;
            object3 = AFi1hSDK.$$c(s7, n8, n14);
            classArray = new Class[n4];
            Class<Object> clazz = Object.class;
            classArray[0] = clazz;
            object = ((Class)object).getMethod((String)object3, classArray);
            object = ((Method)object).invoke(object2, objectArray);
            object = (Integer)object;
            n10 = (Integer)object;
            n3 = $11;
            n7 = n3 ^ 0x23;
            n3 = (n3 & 0x23) << n4;
            n7 += n3;
            $10 = n3 = n7 % 128;
            if ((n7 %= 2) != 0) break block19;
            return n10;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void init$0() {
        int n3 = $10;
        int n4 = n3 & 0x31;
        $11 = n3 = (n4 += (n3 |= 0x31)) % 128;
        Object object = "ISO-8859-1";
        String string2 = "B\u00c9|h\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd<\u000e\u00f2\u0012\u00fb\u0004\u00fd\u0013\u00be9\u0011\u00f2\u0019\u00ed\u0004\r\u00fc\u00cc\u00191\u00f2\u0019\u00ed\u0004\r\u00fc\u00f6\u0011\u00ff\u0000\r\u00f2\u00ed$\u00f4\u0005\t\u000e\b\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u0015\b&\u00cb3\u00f5\u00f4\n\u000b\u0003\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd6\u0012\u0003\u00c1\u0016%\u0014\u00f8\u0010\u00f6\u000e\b\u00de\u0017\r\u00f6\u00ff\u0006\u0015\u0000\u0003\u00f6\f\t\u00d02\u0003\u00ff\u0000\u00fd\u0001\u0016\u00f8\t\u0002\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd6\u0012\u0003\u00c1\u00162\u0003\u00da(\u0006\u00f6\u0002\u000e\n\u0001\u0012\u00d8(\u00fe\u000e\u00f8\u00fb\u000e\u00d82\u0003\u00ff\u0000\u00fd\u0001\u0016\u00f8\t\u0002\u0001\u0012\u00d5&\u0006\u00fc\u0011\u00d4(\f\u0001\u0012\u00d2/\u00f8\u0004\u00e1!\u0005\b\u0000\u00e2(\f\u0001\u0012\u00d2!\u0005\b\u0000\u00e2(\f8\u0000\u0016\u00f0\u00d18\u0000\u0016\u00f0\u00d1\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00fa\u0018\u00ee\u00d0>\t\u00c2I\u00fc\u0006\u00f7\b\f\u00fa\u0018\u00ee\u00d0A\u00f8\u0010\u00fc\u00ca()\u00fd\u0004\u00f4\u000b\u0001\u0012\u00df%\u0000\u0004\u00f8\u0010\u0005\b\u000f\u00f8\u0004\u00fd\u0007\u0001\u0005\b\u0000\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007\u00be\u00176\u00f7\u0006\u00fb\u00c35\u00f2\u0010\u0004\u00f9\t\u0002\u00f4\n\u0017\u00ed\b\t\u0001\u0010\u00ec\u001e\u00fa\u000e\u00f4\u00ee\t\u00ed\u000b\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001e\t\u00f96\u00ee\u0005\u000e\u0007\u00f8\t\u0002\u0015\u0000\u0003\u00f6\f\t\u00e3\u0018\u0007\u00fb\u00eb\u001f\u0006\u0003\u0000\r\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00ed)\u0002\u00ff\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\f\u0006\u0007\u00f5\u00ee\u0006\u00f0\u000b5\u0015\u0003\u00f5\u0012\u0002\u00bf7\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c67\u00cd\u0001\u0012\u00e1\u0016\u0011\u00ff\t\u0000\u00f4\u0005\u00fa\u0018\u00ee\u00d0C\u00fa\u0012\u00bd*\u0000\u00fd\u0001\u0012\u00df\u0014\u0016\u00f7\u00fa\u0018\u00ee\u00d0>\t\u00c2\u00176\u00f4\u0003\u0002\u0010\u00f6\u0002\u00e8(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001e(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0019 \u0016\u00f0\u00eb(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u00f6\u00ff\u0006\u00e52\u00fa\u0003\u0010\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0017:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00d3(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00bf>\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c5\u0016\b(\u00c9H\u00e0\u00f4\n\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00bf>\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c5\u0016\b&\u00cb3\u00f5\u00f4\n\u000b\u0003\u0001\u0012\u00e1\u0016\u0014\u00f2\f\n\u00f3\u00fb\u0001\n\u00f6\u00ff\u0006\u00f5\u0012\u00e1\u0016\u00ff\u0006\u00ee\"\u0001\u0010\u00ee\u0007\u00ef\u000b\u00fe\u00fa\u000e\u00f4\u0001\u0012\u00d5\u0001\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00e2$\u0011\u00f3\u0012\u00fa\n\u0007\u00fe\u0006\t\u00f8\u00f8\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u0019$\u0016\u00d1&\u0006\u00fc\u0006\u00f5\u0006\u00e3$\u0016\u0001\u0012\u00d0$\u0014\u00ff\u0000\f\u0002\u00f4\u00ee\u0014\u0016\u00f7\u0004\n\u00fc\u0012\u00f4\u0001\u0012\u00d2,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00fa\u0018\u00ee\u00d0J\u0002\u00f8\u0006\u00c5O\u00f2\n\u00c1/\u0012\n\u00dc(\u0005\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0001\u0012\u00dd\u001a\u0016\u00ff\u00d4,\t\u0001\n\u00fa\u0018\u00ee\u00d0J\u0002\u00f8\u0006\u00c5O\u00f2\n\u00c1/\u0012\n\u00d8,\t\u0001\n\u0001\u0012\u00e2\u0019\u0014\u00ee\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0017:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00d9)\u0002\u00ff\b\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u00fe\u00d6:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0018,\u0006\u0007\u00f5\u00ff\u0004\r\u00fc\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u001e(\u00e2\u001b\u000b\u0005\u0006\n\u00ce$\u0016\u00ce,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00fa\u0018\u00ee\u00d0C\u00fe\t\u00c2\u0017:\u00fe\u00f4\u00e06\u00f4\u0003\u0002\u0010\u00fa\u0018\u00ee\u00d0A\u00f8\u0010\u00fc\u00ca\u0018,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00fe\u00f2\u0012\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u0017\"\u0015\u00f5\u00e2$\u0016\u00ce,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00f4\u0016\u00f7\u00e7 \r\u0004\u00f6\u0016\u00f8\u0010\u00f2\u00ea \u00fc\u0013\u00f2\u0014\n\u00ce(\f\u00f6\u0001\u0014\u00fe\u0006\u00fa\u00ff\u0011\u00f6\u0016\u00f8\u0010\u00f2\u00ea \u00fc\u0013\u00f2\u0014\n\u00da\u0014\u0016\u00f7\u00e0*\u00fc\u000b\u00fb\f\t\u0002\u0001\u0012\u00d2/\u0001\u0006\u0002\u0002\u00fa\f\t\u00e3(\u00fa\u00f8\u00ee\u000b\u00eb\u000b\u0006\u00f5\u0006\u00e2,\u00f8\u0015\u0003\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u0015\b&\u00cb:\u00ee\u00f4\n\u00dc@5\u0015\u0003\u00f5\u0012\u0002\u00bf7\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\b\t\u00f4\u0010\u00ff\u00f6\u000e\u00c68\u00cc\u00ee\n\u00ec\u000bI\u0004\u00b4I\u00fe\u000e\u0003\u00f9\u0002\u0005\u000b\u000b\u00b0O\u00fc\u0004\u0011\u00b8\u0001\u0012\u00dc\u001b\u0002\b\u00fb\u0016\u00f8\t\u0002\u00e3\u001a\u0012\u0006\u00fb\u0006\u00fc";
        int n7 = 1136;
        if ((n4 %= 2) == 0) {
            byte[] byArray = new byte[n7];
            object = string2.getBytes((String)object);
            System.arraycopy(object, 0, byArray, 0, n7);
            $$a = byArray;
            n3 = 52;
        } else {
            byte[] byArray = new byte[n7];
            object = string2.getBytes((String)object);
            System.arraycopy(object, 0, byArray, 0, n7);
            $$a = byArray;
            n3 = 90;
        }
        $$b = n3;
        $11 = ($10 + 39) % 128;
    }
}

