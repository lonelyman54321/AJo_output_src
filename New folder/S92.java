/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class S92 {
    static {
        new S92();
    }

    public static final void a(wg1_1 object, wg1_1 object2) {
        Throwable throwable22;
        Class<S92> clazz = S92.class;
        int n3 = (int)(td0.b(clazz) ? 1 : 0);
        if (n3 != false) {
            return;
        }
        Object object3 = "x";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object3 = "b";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = ((wg1_1)object).a;
        Object object4 = object3[0];
        Object object5 = 1;
        object5 = object3[object5];
        int n4 = 2;
        n3 = object3[n4];
        object = ((wg1_1)object).c;
        object2 = ((wg1_1)object2).c;
        for (n4 = 0; n4 < object4; ++n4) {
            for (Object object6 = 0; object6 < object5; ++object6) {
                for (int i3 = 0; i3 < n3; ++i3) {
                    int n7 = n4 * object5 * n3;
                    try {
                        n7 = a60.a(object6, n3, n7, i3);
                    }
                    catch (Throwable throwable22) {
                    }
                    reference var11_12 = object[n7];
                    Object object7 = object2[i3];
                    var11_12 += object7;
                    object[n7] = var11_12;
                    continue;
                }
            }
        }
        return;
        td0.a(clazz, throwable22);
    }

    /*
     * Exception decompiling
     */
    public static final wg1_1 b(wg1_1[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 8[TRYBLOCK] [8 : 107->110)] java.lang.Throwable
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final wg1_1 c(wg1_1 wg1_12, wg1_1 wg1_13) {
        Throwable throwable2;
        Class<S92> clazz;
        block13: {
            int n3;
            wg1_1 wg1_14;
            int n4;
            Object[] objectArray;
            int n7;
            Object object;
            int n8;
            Object object2;
            int n10;
            Object object3 = wg1_12;
            Object object4 = wg1_13;
            clazz = S92.class;
            int n14 = td0.b(clazz);
            int n15 = 0;
            if (n14 != false) {
                return null;
            }
            Object object5 = "x";
            try {
                Intrinsics.checkNotNullParameter(wg1_12, (String)object5);
                object5 = "w";
                Intrinsics.checkNotNullParameter(wg1_13, (String)object5);
                object5 = wg1_12.a;
                n10 = 0;
                object2 = object5[0];
                n8 = 1;
                object = object5[n8];
                n7 = 2;
                n14 = object5[n7];
                objectArray = wg1_13.a;
                n4 = objectArray[0];
            }
            catch (Throwable throwable2) {
                break block13;
            }
            Object object6 = object - n4 + n8;
            {
                n8 = objectArray[n7];
                objectArray = new int[]{(int)object2, (int)object6, n8};
                wg1_14 = new wg1_1((int[])objectArray);
                object3 = wg1_12.c;
                objectArray = wg1_14.c;
                object4 = wg1_13.c;
                n3 = 0;
            }
            while (true) {
                if (n3 >= object2) {
                    return wg1_14;
                }
                for (int i3 = 0; i3 < n8; ++i3) {
                    for (int i8 = 0; i8 < object6; ++i8) {
                        Object object7 = 0.0f;
                        while (n10 < n4) {
                            for (n15 = 0; n15 < n14; ++n15) {
                                Object object8;
                                reference var21_22 = object * n14 * n3;
                                int n16 = (n10 + i8) * n14 + var21_22 + n15;
                                {
                                    reference var23_24 = object3[n16];
                                    n16 = (n10 * n14 + n15) * n8 + i3;
                                }
                                {
                                    object8 = object4[n16];
                                }
                                object7 = (var23_24 *= object8) + object7;
                            }
                            ++n10;
                            n15 = 0;
                        }
                        n15 = object6 * n8 * n3;
                        {
                            n15 = a60.a(i8, n8, n15, i3);
                        }
                        objectArray[n15] = (int)object7;
                        n15 = 0;
                        n10 = 0;
                    }
                    n15 = 0;
                    n10 = 0;
                }
                ++n3;
                n15 = 0;
                n10 = 0;
            }
        }
        td0.a(clazz, throwable2);
        return null;
    }

    public static final wg1_1 d(wg1_1 wg1_12, wg1_1 object, wg1_1 object2) {
        Throwable throwable22;
        Class<S92> clazz = S92.class;
        int n3 = (int)(td0.b(clazz) ? 1 : 0);
        if (n3 != false) {
            return null;
        }
        Object object3 = "x";
        Intrinsics.checkNotNullParameter(wg1_12, (String)object3);
        object3 = "w";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object3 = "b";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = wg1_12.a;
        n3 = object3[0];
        int[] nArray = ((wg1_1)object2).a;
        int n4 = nArray[0];
        wg1_12 = S92.h(wg1_12, (wg1_1)object);
        object = ((wg1_1)object2).c;
        object2 = wg1_12.c;
        for (int i3 = 0; i3 < n3; ++i3) {
            for (int i8 = 0; i8 < n4; ++i8) {
                reference var11_12;
                int n7 = i3 * n4 + i8;
                try {
                    var11_12 = object2[n7];
                }
                catch (Throwable throwable22) {
                }
                Object object4 = object[i8];
                var11_12 += object4;
                object2[n7] = var11_12;
                continue;
            }
        }
        return wg1_12;
        td0.a(clazz, throwable22);
        return null;
    }

    public static final wg1_1 e(String[] stringArray, wg1_1 object) {
        Throwable throwable22;
        Class<S92> clazz = S92.class;
        int n3 = td0.b(clazz);
        if (n3 != 0) {
            return null;
        }
        String string2 = "texts";
        Intrinsics.checkNotNullParameter(stringArray, string2);
        string2 = "w";
        Intrinsics.checkNotNullParameter(object, string2);
        n3 = stringArray.length;
        int[] nArray = ((wg1_1)object).a;
        int n4 = 1;
        int n7 = nArray[n4];
        int n8 = 128;
        Object[] objectArray = new int[]{n3, n8, n7};
        wg1_1 wg1_12 = new wg1_1((int[])objectArray);
        objectArray = wg1_12.c;
        object = ((wg1_1)object).c;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = zz3_0.a;
            String string3 = stringArray[i3];
            object2 = ((zz3_0)object2).c(string3);
            string3 = null;
            for (int i8 = 0; i8 < n8; ++i8) {
                int n10;
                reference var15_16;
                try {
                    var15_16 = object2[i8] * n7;
                    int n14 = n7 * 128 * i3;
                    n10 = n7 * i8 + n14;
                }
                catch (Throwable throwable22) {
                }
                System.arraycopy(object, (int)var15_16, objectArray, n10, n7);
                continue;
            }
        }
        return wg1_12;
        td0.a(clazz, throwable22);
        return null;
    }

    public static final void f(wg1_1 wg1_12) {
        int n3;
        int[] nArray;
        int n4;
        Object object;
        int n7;
        Class<S92> clazz;
        block22: {
            clazz = S92.class;
            n7 = td0.b(clazz);
            if (n7 != 0) {
                return;
            }
            object = "x";
            Intrinsics.checkNotNullParameter(wg1_12, (String)object);
            object = wg1_12.a;
            n4 = ((Object)object).length;
            int n8 = 1;
            if (n8 < n4) break block22;
            return;
        }
        n7 = ((Object)object).length;
        int n10 = 1;
        for (n4 = 1; n4 < n7; ++n4) {
            nArray = wg1_12.a;
            n3 = nArray[n4];
            n10 *= n3;
            continue;
        }
        n7 = 2;
        try {
            object = new int[n7];
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return;
        }
        Object object2 = wg1_12.a;
        n3 = 0;
        nArray = null;
        n4 = object2[0];
        object[0] = n4;
        object[n8] = n10;
        object2 = "shape";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        wg1_12.a = (int[])object;
        n7 = wG1$a.a((int[])object);
        object2 = new float[n7];
        float[] fArray = wg1_12.c;
        n10 = wg1_12.b;
        n10 = Math.min(n10, n7);
        System.arraycopy(fArray, 0, object2, 0, n10);
        wg1_12.c = object2;
        wg1_12.b = n7;
    }

    public static final wg1_1 g(wg1_1 wg1_12, int n3) {
        Throwable throwable22;
        Object object = wg1_12;
        int n4 = n3;
        Class<S92> clazz = S92.class;
        boolean n7 = td0.b(clazz);
        float f5 = 0.0f;
        if (n7) {
            return null;
        }
        Object object2 = "x";
        Intrinsics.checkNotNullParameter(wg1_12, (String)object2);
        object2 = wg1_12.a;
        float f6 = 0.0f;
        Object object3 = object2[0];
        int n8 = 1;
        Object object4 = object2[n8];
        Object object5 = 2;
        Object object6 = object2[object5];
        object5 = object4 - n3 + n8;
        Object[] objectArray = new int[]{(int)object3, object5, (int)object6};
        wg1_1 wg1_13 = new wg1_1((int[])objectArray);
        object = wg1_12.c;
        objectArray = wg1_13.c;
        for (int i3 = 0; i3 < object3; ++i3) {
            for (int i8 = 0; i8 < object6; ++i8) {
                for (Object object7 = 0; object7 < object5; ++object7) {
                    int n10 = i3 * object5 * object6;
                    int n14 = object7 * object6;
                    n10 = n10 + n14 + i8;
                    int n15 = i3 * object4 * object6 + n14 + i8;
                    n14 = 1;
                    float f7 = Float.MIN_VALUE;
                    objectArray[n10] = (int)f7;
                    f7 = 0.0f;
                    for (n14 = 0; n14 < n4; ++n14) {
                        int n16;
                        try {
                            f6 = objectArray[n10];
                            n16 = n14 * object6 + n15;
                        }
                        catch (Throwable throwable22) {
                        }
                        f5 = (float)object[n16];
                        f5 = Math.max(f6, f5);
                        objectArray[n10] = (int)f5;
                        f5 = 0.0f;
                        f6 = 0.0f;
                        continue;
                    }
                    f5 = 0.0f;
                    f6 = 0.0f;
                }
                f5 = 0.0f;
                f6 = 0.0f;
            }
            f5 = 0.0f;
            f6 = 0.0f;
        }
        return wg1_13;
        td0.a(clazz, throwable22);
        return null;
    }

    public static final wg1_1 h(wg1_1 wg1_12, wg1_1 wg1_13) {
        Throwable throwable22;
        Object object = wg1_12;
        Object object2 = wg1_13;
        Class<S92> clazz = S92.class;
        int n3 = (int)(td0.b(clazz) ? 1 : 0);
        if (n3 != false) {
            return null;
        }
        Object object3 = "x";
        Intrinsics.checkNotNullParameter(wg1_12, (String)object3);
        object3 = "w";
        Intrinsics.checkNotNullParameter(wg1_13, (String)object3);
        object3 = wg1_12.a;
        n3 = object3[0];
        int[] nArray = wg1_13.a;
        int n4 = nArray[0];
        int n7 = 1;
        int n8 = nArray[n7];
        Object[] objectArray = new int[]{n3, n8};
        wg1_1 wg1_14 = new wg1_1((int[])objectArray);
        object = wg1_12.c;
        object2 = wg1_13.c;
        objectArray = wg1_14.c;
        for (int i3 = 0; i3 < n3; ++i3) {
            for (int i8 = 0; i8 < n8; ++i8) {
                int n10 = i3 * n8 + i8;
                int n14 = 0;
                objectArray[n10] = (int)0.0f;
                for (n14 = 0; n14 < n4; ++n14) {
                    int n15;
                    int n16;
                    try {
                        n16 = objectArray[n10];
                        n15 = i3 * n4 + n14;
                    }
                    catch (Throwable throwable22) {
                    }
                    reference var19_20 = object[n15];
                    int n17 = n14 * n8 + i8;
                    Object object4 = object2[n17];
                    var19_20 = var19_20 * object4 + n16;
                    objectArray[n10] = (int)var19_20;
                    continue;
                }
            }
        }
        return wg1_14;
        td0.a(clazz, throwable22);
        return null;
    }

    public static final void i(wg1_1 object) {
        Throwable throwable22;
        Class<S92> clazz;
        block7: {
            clazz = S92.class;
            int n3 = td0.b(clazz);
            if (n3 != 0) {
                return;
            }
            String string2 = "x";
            Intrinsics.checkNotNullParameter(object, string2);
            object = ((wg1_1)object).c;
            n3 = ((Object)object).length;
            for (int i3 = 0; i3 < n3; ++i3) {
                reference var5_6;
                try {
                    var5_6 = object[i3];
                }
                catch (Throwable throwable22) {}
                reference cfr_temp_0 = var5_6 - 0.0f;
                reference var6_7 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                if (var6_7 >= 0) continue;
                object[i3] = 0.0f;
                continue;
                break block7;
            }
            return;
        }
        td0.a(clazz, throwable22);
    }

    /*
     * Exception decompiling
     */
    public static final void j(wg1_1 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [6 : 134->137)] java.lang.Throwable
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

    public static final wg1_1 k(wg1_1 object) {
        Throwable throwable2;
        Class<S92> clazz = S92.class;
        int n3 = (int)(td0.b(clazz) ? 1 : 0);
        if (n3 != false) {
            return null;
        }
        Object object2 = "x";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = ((wg1_1)object).a;
        Object object3 = object2[0];
        int n4 = 1;
        n3 = object2[n4];
        Object[] objectArray = new int[]{n3, (int)object3};
        wg1_1 wg1_12 = new wg1_1((int[])objectArray);
        object = ((wg1_1)object).c;
        objectArray = wg1_12.c;
        for (int i3 = 0; i3 < object3; ++i3) {
            for (int i8 = 0; i8 < n3; ++i8) {
                Object object4;
                int n7 = i8 * object3 + i3;
                int n8 = i3 * n3 + i8;
                try {
                    object4 = object[n8];
                }
                catch (Throwable throwable2) {
                }
                objectArray[n7] = (int)object4;
                continue;
            }
        }
        return wg1_12;
        td0.a(clazz, throwable2);
        return null;
    }

    public static final wg1_1 l(wg1_1 object) {
        Throwable throwable2;
        Class<S92> clazz = S92.class;
        int n3 = (int)(td0.b(clazz) ? 1 : 0);
        if (n3 != false) {
            return null;
        }
        Object object2 = "x";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = ((wg1_1)object).a;
        Object object3 = object2[0];
        Object object4 = 1;
        object4 = object2[object4];
        int n4 = 2;
        n3 = object2[n4];
        Object[] objectArray = new int[]{n3, object4, (int)object3};
        wg1_1 wg1_12 = new wg1_1((int[])objectArray);
        object = ((wg1_1)object).c;
        objectArray = wg1_12.c;
        for (int i3 = 0; i3 < object3; ++i3) {
            for (Object object5 = 0; object5 < object4; ++object5) {
                for (int i8 = 0; i8 < n3; ++i8) {
                    int n7;
                    int n8 = i8 * object3 * object4;
                    try {
                        n8 = a60.a(object5, (int)object3, n8, i3);
                        n7 = i3 * object4 * n3;
                    }
                    catch (Throwable throwable2) {
                    }
                    n7 = a60.a(object5, n3, n7, i8);
                    Object object6 = object[n7];
                    objectArray[n8] = (int)object6;
                    continue;
                }
            }
        }
        return wg1_12;
        td0.a(clazz, throwable2);
        return null;
    }
}

