/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
import android.util.SparseArray;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class oJ$b
implements oJ$c {
    public final boolean a;
    public final Cipher b = null;
    public final SecretKeySpec c = null;
    public final SecureRandom d = null;
    public final Tq e;
    public boolean f;
    public sO2 g;

    public oJ$b(File file) {
        Tq tq;
        this.a = false;
        this.e = tq = new Tq(file);
    }

    public static int h(nJ object, int n3) {
        int n4 = ((nJ)object).a * 31;
        String string2 = ((nJ)object).b;
        int n7 = string2.hashCode() + n4;
        n4 = 2;
        if (n3 < n4) {
            object = ((nJ)object).e;
            long l2 = u60_0.a((W60)object);
            n7 *= 31;
            n4 = 32;
            long l3 = l2 >>> n4;
            n3 = (int)(l2 ^= l3);
            n7 += n3;
        } else {
            n7 *= 31;
            object = ((nJ)object).e;
            int n8 = ((zl0_0)object).hashCode();
            n7 += n8;
        }
        return n7;
    }

    public static nJ i(int n3, DataInputStream object) {
        Object object2;
        int n4 = ((DataInputStream)object).readInt();
        String string2 = ((DataInputStream)object).readUTF();
        int n7 = 2;
        if (n3 < n7) {
            long l2 = ((DataInputStream)object).readLong();
            X60 x60 = new X60();
            object2 = l2;
            object = "exo_len";
            x60.a(object2, (String)object);
            object2 = zl0_0.c.a(x60);
        } else {
            object2 = oJ.a((DataInputStream)object);
        }
        object = new nJ(n4, string2, (zl0_0)object2);
        return object;
    }

    public final void a(nJ nJ3) {
        this.f = true;
    }

    public final boolean b() {
        boolean bl2;
        Object object = this.e;
        File file = ((Tq)object).a;
        boolean bl3 = file.exists();
        if (!bl3 && !(bl2 = ((File)(object = ((Tq)object).b)).exists())) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final void c(HashMap hashMap) {
        boolean bl2 = this.f;
        if (!bl2) {
            return;
        }
        this.e(hashMap);
    }

    public final void d(long l2) {
    }

    public final void delete() {
        Tq tq = this.e;
        tq.a.delete();
        tq.b.delete();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(HashMap object) {
        void var1_7;
        FilterOutputStream filterOutputStream;
        block12: {
            Object object4;
            OutputStream outputStream;
            Object object5 = this.b;
            Tq tq = this.e;
            int n4 = 0;
            filterOutputStream = null;
            try {
                outputStream = tq.a();
                object4 = this.g;
                if (object4 == null) {
                    object4 = new BufferedOutputStream(outputStream);
                    this.g = object4;
                } else {
                    ((sO2)object4).a(outputStream);
                }
                outputStream = this.g;
                object4 = new DataOutputStream(outputStream);
                n4 = 2;
            }
            catch (Throwable throwable) {
                break block12;
            }
            try {
                Object object2;
                Object object3;
                int n3;
                block13: {
                    ((DataOutputStream)object4).writeInt(n4);
                    n3 = this.a;
                    ((DataOutputStream)object4).writeInt(n3);
                    if (n3 != 0) {
                        void var1_6;
                        n3 = 16;
                        object3 = new byte[n3];
                        object2 = this.d;
                        int n7 = gz3.a;
                        ((SecureRandom)object2).nextBytes((byte[])object3);
                        ((OutputStream)object4).write((byte[])object3);
                        object2 = new IvParameterSpec((byte[])object3);
                        try {
                            object3 = this.c;
                            n7 = 1;
                            ((Cipher)object5).init(n7, (Key)object3, (AlgorithmParameterSpec)object2);
                            ((DataOutputStream)object4).flush();
                        }
                        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
                        }
                        catch (InvalidKeyException invalidKeyException) {
                            // empty catch block
                        }
                        object3 = new DataOutputStream;
                        object2 = new CipherOutputStream(outputStream, (Cipher)object5);
                        object3((OutputStream)object2);
                        object4 = object3;
                        break block13;
                        object5 = new IllegalStateException((Throwable)var1_6);
                        throw object5;
                    }
                }
                int n8 = ((HashMap)object).size();
                ((DataOutputStream)object4).writeInt(n8);
                object = ((HashMap)object).values();
                object = object.iterator();
                n8 = 0;
                object5 = null;
                int n10 = 0;
                outputStream = null;
                while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    object3 = object.next();
                    object3 = (nJ)object3;
                    int n14 = object3.a;
                    ((DataOutputStream)object4).writeInt(n14);
                    object2 = object3.b;
                    ((DataOutputStream)object4).writeUTF((String)object2);
                    object2 = object3.e;
                    oJ.b((zl0_0)object2, (DataOutputStream)object4);
                    n3 = oJ$b.h((nJ)object3, n4);
                    n10 += n3;
                }
                ((DataOutputStream)object4).writeInt(n10);
                ((OutputStream)object4).close();
                object = tq.b;
                ((File)object).delete();
            }
            catch (Throwable throwable) {
                filterOutputStream = object4;
                break block12;
            }
            this.f = false;
            return;
        }
        gz3.f(filterOutputStream);
        throw var1_7;
    }

    public final void f(nJ nJ3, boolean bl2) {
        this.f = true;
    }

    /*
     * Exception decompiling
     */
    public final void g(HashMap var1_1, SparseArray var2_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 19[TRYBLOCK] [51, 50 : 298->301)] java.lang.Throwable
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
}

