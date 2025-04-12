/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.os.StrictMode$ThreadPolicy$Builder
 */
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class Xq0
implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final int e;
    public final long f;
    public final int g;
    public long h;
    public BufferedWriter i;
    public final LinkedHashMap j;
    public int k;
    public long l;
    public final ThreadPoolExecutor m;
    public final Xq0$a n;

    public Xq0(File file, long l2) {
        Xq0$b xq0$b;
        LinkedHashMap linkedHashMap;
        long l3;
        this.h = l3 = 0L;
        int n3 = 1;
        this.j = linkedHashMap = new LinkedHashMap(0, 0.75f, n3 != 0);
        this.l = l3;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
        Object object = new ThreadPoolExecutor(0, 1, (long)60, timeUnit, linkedBlockingQueue, xq0$b);
        this.m = object;
        this.n = object = new Xq0$a(this);
        this.a = file;
        this.e = n3;
        this.b = object = new File(file, "journal");
        this.c = object = new File(file, "journal.tmp");
        this.d = object = new File(file, "journal.bkp");
        this.g = n3;
        this.f = l2;
    }

    public static void C(File serializable, File file, boolean bl2) {
        boolean bl3;
        if (bl2) {
            Xq0.c(file);
        }
        if (bl3 = serializable.renameTo(file)) {
            return;
        }
        serializable = new IOException();
        throw serializable;
    }

    /*
     * Exception decompiling
     */
    public static void a(Xq0 var0, Xq0$c var1_1, boolean var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 10[TRYBLOCK] [10 : 124->131)] java.lang.Throwable
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

    public static void b(Writer writer) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 < n4) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.ThreadPolicy.Builder builder = new StrictMode.ThreadPolicy.Builder(threadPolicy);
        builder = Pq0.a(builder).build();
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)builder);
        try {
            writer.close();
            return;
        }
        finally {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        }
    }

    public static void c(File serializable) {
        boolean bl2;
        boolean bl3 = serializable.exists();
        if (bl3 && !(bl2 = serializable.delete())) {
            serializable = new IOException();
            throw serializable;
        }
    }

    public static void h(Writer writer) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 < n4) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.ThreadPolicy.Builder builder = new StrictMode.ThreadPolicy.Builder(threadPolicy);
        builder = Pq0.a(builder).build();
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)builder);
        try {
            writer.flush();
            return;
        }
        finally {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        }
    }

    public static Xq0 p(File serializable, long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            Object object2;
            Object object3 = "journal.bkp";
            Object object4 = new File((File)serializable, (String)object3);
            boolean bl2 = ((File)object4).exists();
            if (bl2) {
                object2 = "journal";
                object3 = new File((File)serializable, (String)object2);
                object = ((File)object3).exists();
                if (object != false) {
                    ((File)object4).delete();
                } else {
                    object = 0;
                    object2 = null;
                    Xq0.C((File)object4, (File)object3, false);
                }
            }
            object4 = new Xq0((File)serializable, l2);
            object3 = ((Xq0)object4).b;
            bl2 = ((File)object3).exists();
            if (bl2) {
                try {
                    ((Xq0)object4).w();
                    ((Xq0)object4).u();
                    return object4;
                }
                catch (IOException iOException) {
                    object2 = System.out;
                    StringBuilder stringBuilder = new StringBuilder("DiskLruCache ");
                    stringBuilder.append(serializable);
                    String string2 = " is corrupt: ";
                    stringBuilder.append(string2);
                    String string3 = iOException.getMessage();
                    stringBuilder.append(string3);
                    stringBuilder.append(", removing");
                    string3 = stringBuilder.toString();
                    ((PrintStream)object2).println(string3);
                    ((Xq0)object4).close();
                    object4 = ((Xq0)object4).a;
                    cz3.a((File)object4);
                }
            }
            ((File)serializable).mkdirs();
            object4 = new Xq0((File)serializable, l2);
            ((Xq0)object4).A();
            return object4;
        }
        serializable = new IllegalArgumentException("maxSize <= 0");
        throw serializable;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void A() {
        synchronized (this) {
            Throwable throwable322;
            Object object;
            block10: {
                boolean bl2;
                Throwable throwable2222;
                object = this.i;
                if (object != null) {
                    Xq0.b((Writer)object);
                }
                Object object2 = this.c;
                Object object3 = new FileOutputStream((File)object2);
                object2 = cz3.a;
                Object object4 = new OutputStreamWriter((OutputStream)object3, (Charset)object2);
                object = new BufferedWriter((Writer)object4);
                object4 = "libcore.io.DiskLruCache";
                {
                    catch (Throwable throwable2222) {}
                }
                try {
                    boolean bl3;
                    block11: {
                        ((Writer)object).write((String)object4);
                        object4 = "\n";
                        ((Writer)object).write((String)object4);
                        object4 = "1";
                        ((Writer)object).write((String)object4);
                        object4 = "\n";
                        ((Writer)object).write((String)object4);
                        bl2 = this.e;
                        object4 = Integer.toString((int)(bl2 ? 1 : 0));
                        ((Writer)object).write((String)object4);
                        object4 = "\n";
                        ((Writer)object).write((String)object4);
                        bl2 = this.g;
                        object4 = Integer.toString((int)(bl2 ? 1 : 0));
                        ((Writer)object).write((String)object4);
                        object4 = "\n";
                        ((Writer)object).write((String)object4);
                        object4 = "\n";
                        ((Writer)object).write((String)object4);
                        object4 = this.j;
                        object4 = ((LinkedHashMap)object4).values();
                        object4 = object4.iterator();
                        break block11;
                        throw throwable2222;
                    }
                    while (bl3 = object4.hasNext()) {
                        String string2;
                        object3 = object4.next();
                        object3 = (Xq0$d)object3;
                        object2 = ((Xq0$d)object3).f;
                        char c2 = '\n';
                        if (object2 != null) {
                            object2 = new StringBuilder();
                            string2 = "DIRTY ";
                            ((StringBuilder)object2).append(string2);
                            object3 = ((Xq0$d)object3).a;
                            ((StringBuilder)object2).append((String)object3);
                            ((StringBuilder)object2).append(c2);
                            object3 = ((StringBuilder)object2).toString();
                            ((Writer)object).write((String)object3);
                            continue;
                        }
                        object2 = new StringBuilder();
                        string2 = "CLEAN ";
                        ((StringBuilder)object2).append(string2);
                        string2 = ((Xq0$d)object3).a;
                        ((StringBuilder)object2).append(string2);
                        object3 = ((Xq0$d)object3).a();
                        ((StringBuilder)object2).append((String)object3);
                        ((StringBuilder)object2).append(c2);
                        object3 = ((StringBuilder)object2).toString();
                        ((Writer)object).write((String)object3);
                    }
                }
                catch (Throwable throwable322) {
                    break block10;
                }
                Xq0.b((Writer)object);
                object = this.b;
                boolean bl4 = ((File)object).exists();
                bl2 = true;
                if (bl4) {
                    object = this.b;
                    object3 = this.d;
                    Xq0.C((File)object, (File)object3, bl2);
                }
                object = this.c;
                object3 = this.b;
                object2 = null;
                Xq0.C((File)object, (File)object3, false);
                object = this.d;
                ((File)object).delete();
                File file = this.b;
                object2 = new FileOutputStream(file, bl2);
                object4 = cz3.a;
                object3 = new OutputStreamWriter((OutputStream)object2, (Charset)object4);
                this.i = object = new BufferedWriter((Writer)object3);
                return;
            }
            Xq0.b((Writer)object);
            throw throwable322;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void G() {
        Throwable throwable2;
        while (true) {
            long l2;
            long l3;
            long l4;
            long l7;
            if ((l7 = (l4 = (l3 = this.h) - (l2 = this.f)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0) {
                return;
            }
            Object object = (String)this.j.entrySet().iterator().next().getKey();
            synchronized (this) {
                int n3;
                char c2;
                Object object2;
                Object object3;
                try {
                    char c3;
                    block12: {
                        object3 = this.i;
                        if (object3 != null) {
                            object3 = this.j;
                            object3 = ((LinkedHashMap)object3).get(object);
                            if ((object3 = (Xq0$d)object3) != null && (object2 = ((Xq0$d)object3).f) == null) {
                                object2 = null;
                                break block12;
                            } else {
                                continue;
                            }
                        }
                        object3 = "cache is closed";
                        object = new IllegalStateException((String)object3);
                        throw object;
                    }
                    for (c2 = '\u0000'; c2 < (c3 = this.g); ++c2) {
                        Object object4 = ((Xq0$d)object3).c;
                        l7 = (long)((File)(object4 = object4[c2])).exists();
                        if (l7 != false && (l7 = (long)((File)object4).delete()) == false) {
                            object3 = new StringBuilder();
                            object2 = "failed to delete ";
                            ((StringBuilder)object3).append((String)object2);
                            ((StringBuilder)object3).append(object4);
                            object3 = ((StringBuilder)object3).toString();
                            object = new IOException((String)object3);
                            throw object;
                        }
                        long l8 = this.h;
                        long[] lArray = ((Xq0$d)object3).b;
                        long l12 = lArray[c2];
                        this.h = l8 -= l12;
                        lArray[c2] = l8 = 0L;
                    }
                }
                catch (Throwable throwable2) {
                    break;
                }
                this.k = n3 = this.k + 1;
                object3 = this.i;
                object2 = "REMOVE";
                ((Writer)object3).append((CharSequence)object2);
                object3 = this.i;
                c2 = ' ';
                ((Writer)object3).append(c2);
                object3 = this.i;
                ((Writer)object3).append((CharSequence)object);
                object3 = this.i;
                c2 = '\n';
                ((Writer)object3).append(c2);
                object3 = this.j;
                ((AbstractMap)object3).remove(object);
                boolean bl2 = this.n();
                if (bl2) {
                    object = this.m;
                    object3 = this.n;
                    ((AbstractExecutorService)object).submit(object3);
                }
            }
        }
        {
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void close() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Object object;
                block6: {
                    try {
                        object = this.i;
                        if (object != null) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    return;
                }
                Object object2 = this.j;
                object2 = ((LinkedHashMap)object2).values();
                object = new ArrayList(object2);
                object = ((ArrayList)object).iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object.hasNext())) {
                        this.G();
                        object = this.i;
                        Xq0.b((Writer)object);
                        object = null;
                        this.i = null;
                        return;
                    }
                    object2 = object.next();
                    object2 = (Xq0$d)object2;
                    object2 = ((Xq0$d)object2).f;
                    if (object2 == null) continue;
                    ((Xq0$c)object2).a();
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Xq0$c d(String object) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Object object2;
                block5: {
                    Object object3;
                    block6: {
                        try {
                            object2 = this.i;
                            if (object2 == null) break block5;
                            object2 = this.j;
                            object2 = ((LinkedHashMap)object2).get(object);
                            if ((object2 = (Xq0$d)object2) == null) {
                                object2 = new Xq0$d(this, (String)object);
                                object3 = this.j;
                                ((AbstractMap)object3).put(object, object2);
                                break block6;
                            }
                            object3 = ((Xq0$d)object2).f;
                            if (object3 == null) break block6;
                        }
                        catch (Throwable throwable2) {}
                        return null;
                    }
                    ((Xq0$d)object2).f = object3 = new Xq0$c(this, (Xq0$d)object2);
                    object2 = this.i;
                    String string2 = "DIRTY";
                    ((Writer)object2).append(string2);
                    object2 = this.i;
                    char c2 = ' ';
                    ((Writer)object2).append(c2);
                    object2 = this.i;
                    ((Writer)object2).append((CharSequence)object);
                    object = this.i;
                    char c3 = '\n';
                    ((Writer)object).append(c3);
                    object = this.i;
                    Xq0.h((Writer)object);
                    return object3;
                    break block7;
                }
                object2 = "cache is closed";
                object = new IllegalStateException((String)object2);
                throw object;
            }
            throw throwable2;
        }
    }

    /*
     * Exception decompiling
     */
    public final Xq0$e k(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [9 : 112->116)] java.lang.Throwable
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

    public final boolean n() {
        LinkedHashMap linkedHashMap;
        int n3 = this.k;
        int n4 = 2000;
        n3 = n3 >= n4 && n3 >= (n4 = ((AbstractMap)(linkedHashMap = this.j)).size()) ? 1 : 0;
        return n3 != 0;
    }

    public final void u() {
        boolean bl2;
        Xq0.c(this.c);
        Iterator iterator = this.j.values().iterator();
        while (bl2 = iterator.hasNext()) {
            int n3;
            Xq0$d xq0$d = (Xq0$d)iterator.next();
            Object object = xq0$d.f;
            int n4 = this.g;
            if (object == null) {
                for (n3 = 0; n3 < n4; ++n3) {
                    long l2 = this.h;
                    object = xq0$d.b;
                    Object object2 = object[n3];
                    this.h = l2 += object2;
                }
                continue;
            }
            object = null;
            xq0$d.f = null;
            while (n3 < n4) {
                Xq0.c(xq0$d.c[n3]);
                object = xq0$d.d[n3];
                Xq0.c((File)object);
                ++n3;
            }
            iterator.remove();
        }
    }

    /*
     * Exception decompiling
     */
    public final void w() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 16[TRYBLOCK] [18 : 222->226)] java.lang.Throwable
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void z(String object) {
        Object object5;
        IOException iOException;
        boolean bl2;
        Object object3;
        String string3;
        int n7 = 32;
        int n4 = ((String)object).indexOf(n7);
        String string2 = "unexpected journal line: ";
        int n3 = -1;
        if (n4 == n3) {
            object = string2.concat((String)object);
            IOException iOException2 = new IOException((String)object);
            throw iOException2;
        }
        int n8 = n4 + 1;
        n7 = ((String)object).indexOf(n7, n8);
        Object object4 = this.j;
        if (n7 == n3) {
            string3 = ((String)object).substring(n8);
            int n10 = 6;
            if (n4 == n10 && (n10 = (int)(((String)object).startsWith((String)(object3 = "REMOVE")) ? 1 : 0)) != 0) {
                ((AbstractMap)object4).remove(string3);
                return;
            }
        } else {
            string3 = ((String)object).substring(n8, n7);
        }
        if ((object3 = (Xq0$d)((LinkedHashMap)object4).get(string3)) == null) {
            object3 = new Xq0$d(this, string3);
            ((AbstractMap)object4).put(string3, object3);
        }
        n8 = 5;
        if (n7 != n3 && n4 == n8 && (bl2 = ((String)object).startsWith((String)(object4 = "CLEAN")))) {
            n4 = 1;
            object = ((String)object).substring(n7 += n4).split(" ");
            ((Xq0$d)object3).e = n4;
            iOException = null;
            ((Xq0$d)object3).f = null;
            n7 = ((Object)object).length;
            object5 = ((Xq0$d)object3).g;
            n4 = ((Xq0)object5).g;
            if (n7 != n4) {
                object5 = new StringBuilder(string2);
                object = Arrays.toString((Object[])object);
                ((StringBuilder)object5).append((String)object);
                object = ((StringBuilder)object5).toString();
                iOException = new IOException((String)object);
                throw iOException;
            }
        } else {
            Object object2;
            if (n7 == n3 && n4 == n8 && (n8 = (int)(((String)object).startsWith(string3 = "DIRTY") ? 1 : 0)) != 0) {
                ((Xq0$d)object3).f = object = new Xq0$c(this, (Xq0$d)object3);
                return;
            }
            if (n7 == n3 && n4 == (n7 = 4) && (n7 = (int)(((String)object).startsWith((String)(object2 = "READ")) ? 1 : 0)) != 0) {
                return;
            }
            object = string2.concat((String)object);
            object2 = new IOException((String)object);
            throw object2;
        }
        n7 = 0;
        iOException = null;
        try {
            while (true) {
                n4 = ((Object)object).length;
                if (n7 >= n4) return;
                object5 = ((Xq0$d)object3).b;
                Object object6 = object[n7];
                long l2 = Long.parseLong((String)object6);
                object5[n7] = l2;
                ++n7;
            }
        }
        catch (NumberFormatException numberFormatException) {
            object5 = new StringBuilder(string2);
            object = Arrays.toString((Object[])object);
            ((StringBuilder)object5).append((String)object);
            object = ((StringBuilder)object5).toString();
            iOException = new IOException((String)object);
            throw iOException;
        }
    }
}

