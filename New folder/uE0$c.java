/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class uE0$c {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public uE0$c(int n3, byte[] byArray, int n4) {
        this(-1, byArray, n3, n4);
    }

    public uE0$c(long l2, byte[] byArray, int n3, int n4) {
        this.a = n3;
        this.b = n4;
        this.c = l2;
        this.d = byArray;
    }

    public static uE0$c a(long l2, ByteOrder object) {
        int n3 = 1;
        long[] lArray = new long[n3];
        lArray[0] = l2;
        Object object2 = ue0_0.E;
        int n4 = 4;
        object2 = ByteBuffer.wrap(new byte[object2[n4]]);
        object2.order((ByteOrder)object);
        int n7 = (int)lArray[0];
        object2.putInt(n7);
        object2 = object2.array();
        object = new uE0$c(n4, (byte[])object2, n3);
        return object;
    }

    public static uE0$c b(uE0$e object, ByteOrder object2) {
        int n3 = 1;
        uE0$e[] uE0$eArray = new uE0$e[n3];
        uE0$eArray[0] = object;
        object = ue0_0.E;
        int n4 = 5;
        object = ByteBuffer.wrap(new byte[object[n4]]);
        ((ByteBuffer)object).order((ByteOrder)object2);
        object2 = uE0$eArray[0];
        int n7 = (int)((uE0$e)object2).a;
        ((ByteBuffer)object).putInt(n7);
        int n8 = (int)((uE0$e)object2).b;
        ((ByteBuffer)object).putInt(n8);
        object = ((ByteBuffer)object).array();
        object2 = new uE0$c(n4, (byte[])object, n3);
        return object2;
    }

    public static uE0$c c(int n3, ByteOrder object) {
        Object object2 = new int[]{n3};
        Object object3 = ue0_0.E;
        int n4 = 3;
        object3 = ByteBuffer.wrap(new byte[object3[n4]]);
        ((ByteBuffer)object3).order((ByteOrder)object);
        n3 = (short)object2[0];
        ((ByteBuffer)object3).putShort((short)n3);
        object2 = new uE0$c;
        object = ((ByteBuffer)object3).array();
        object2(n4, (byte[])object, 1);
        return object2;
    }

    public final double d(ByteOrder object) {
        if ((object = this.g((ByteOrder)object)) != null) {
            int n3 = object instanceof String;
            if (n3 != 0) {
                return Double.parseDouble((String)object);
            }
            n3 = object instanceof long[];
            String string2 = "There are more than one component";
            int n4 = 1;
            if (n3 != 0) {
                n3 = ((Object)(object = (Object)((long[])object))).length;
                if (n3 == n4) {
                    return (double)object[0];
                }
                object = new NumberFormatException(string2);
                throw object;
            }
            n3 = object instanceof int[];
            if (n3 != 0) {
                n3 = ((Object)(object = (Object)((int[])object))).length;
                if (n3 == n4) {
                    return (double)object[0];
                }
                object = new NumberFormatException(string2);
                throw object;
            }
            n3 = object instanceof double[];
            if (n3 != 0) {
                n3 = ((Object)(object = (Object)((double[])object))).length;
                if (n3 == n4) {
                    return (double)object[0];
                }
                object = new NumberFormatException(string2);
                throw object;
            }
            n3 = object instanceof uE0$e[];
            if (n3 != 0) {
                n3 = ((uE0$e[])(object = (uE0$e[])object)).length;
                if (n3 == n4) {
                    object = object[0];
                    double d2 = object.a;
                    double d5 = object.b;
                    return d2 / d5;
                }
                object = new NumberFormatException(string2);
                throw object;
            }
            object = new NumberFormatException("Couldn't find a double value");
            throw object;
        }
        object = new NumberFormatException("NULL can't be converted to a double value");
        throw object;
    }

    public final int e(ByteOrder object) {
        if ((object = this.g((ByteOrder)object)) != null) {
            int n3 = object instanceof String;
            if (n3 != 0) {
                return Integer.parseInt((String)object);
            }
            n3 = object instanceof long[];
            String string2 = "There are more than one component";
            int n4 = 1;
            if (n3 != 0) {
                n3 = ((Object)(object = (Object)((long[])object))).length;
                if (n3 == n4) {
                    return (int)object[0];
                }
                object = new NumberFormatException(string2);
                throw object;
            }
            n3 = object instanceof int[];
            if (n3 != 0) {
                n3 = ((Object)(object = (Object)((int[])object))).length;
                if (n3 == n4) {
                    return (int)object[0];
                }
                object = new NumberFormatException(string2);
                throw object;
            }
            object = new NumberFormatException("Couldn't find a integer value");
            throw object;
        }
        object = new NumberFormatException("NULL can't be converted to a integer value");
        throw object;
    }

    public final String f(ByteOrder uE0$eArray) {
        uE0$eArray = this.g((ByteOrder)uE0$eArray);
        Object object = 0;
        uE0$e uE0$e = null;
        if (uE0$eArray == null) {
            return null;
        }
        boolean bl2 = uE0$eArray instanceof String;
        if (bl2) {
            return (String)uE0$eArray;
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl3 = uE0$eArray instanceof long[];
        String string2 = ",";
        int n3 = 0;
        if (bl3) {
            uE0$eArray = (uE0$e[])((long[])uE0$eArray);
            while (n3 < (object = uE0$eArray.length)) {
                Object object2 = uE0$eArray[n3];
                stringBuilder.append((long)object2);
                object = uE0$eArray.length;
                if (++n3 == object) continue;
                stringBuilder.append(string2);
            }
            return stringBuilder.toString();
        }
        bl3 = uE0$eArray instanceof int[];
        if (bl3) {
            uE0$eArray = (uE0$e[])((int[])uE0$eArray);
            while (n3 < (object = uE0$eArray.length)) {
                object = uE0$eArray[n3];
                stringBuilder.append((int)object);
                object = uE0$eArray.length;
                if (++n3 == object) continue;
                stringBuilder.append(string2);
            }
            return stringBuilder.toString();
        }
        bl3 = uE0$eArray instanceof double[];
        if (bl3) {
            uE0$eArray = (uE0$e[])((double[])uE0$eArray);
            while (n3 < (object = uE0$eArray.length)) {
                uE0$e uE0$e2 = uE0$eArray[n3];
                stringBuilder.append((double)uE0$e2);
                object = uE0$eArray.length;
                if (++n3 == object) continue;
                stringBuilder.append(string2);
            }
            return stringBuilder.toString();
        }
        bl3 = uE0$eArray instanceof uE0$e[];
        if (bl3) {
            uE0$eArray = uE0$eArray;
            while (n3 < (object = uE0$eArray.length)) {
                long l2 = uE0$eArray[n3].a;
                stringBuilder.append(l2);
                stringBuilder.append('/');
                uE0$e = uE0$eArray[n3];
                l2 = uE0$e.b;
                stringBuilder.append(l2);
                object = uE0$eArray.length;
                if (++n3 == object) continue;
                stringBuilder.append(string2);
            }
            return stringBuilder.toString();
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public final Serializable g(ByteOrder var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 8[TRYBLOCK] [17, 16 : 177->181)] java.lang.Throwable
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

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        Object object = ue0_0.D;
        int n3 = this.a;
        object = object[n3];
        stringBuilder.append((String)object);
        stringBuilder.append(", data length:");
        return g30.a(this.d.length, ")", stringBuilder);
    }
}

