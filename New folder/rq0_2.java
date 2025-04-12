/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;
import okhttp3.internal.concurrent.c;

/*
 * Renamed from Rq0
 */
public final class rq0_2
implements Closeable,
Flushable {
    public static final Regex t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public final gm0_2 a;
    public final File b;
    public final long c;
    public final File d;
    public final File e;
    public final File f;
    public long g;
    public re_2 h;
    public final LinkedHashMap i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public long q;
    public final okhttp3.internal.concurrent.b r;
    public final uq0_2 s;

    static {
        Regex regex;
        t = regex = new Regex("[a-z0-9_-]{1,120}");
        u = "CLEAN";
        v = "DIRTY";
        w = "REMOVE";
        x = "READ";
    }

    public rq0_2(File serializable, long l2, c object) {
        Object object2 = gm0_2.a;
        Intrinsics.checkNotNullParameter(object2, "fileSystem");
        Intrinsics.checkNotNullParameter(serializable, "directory");
        Intrinsics.checkNotNullParameter(object, "taskRunner");
        this.a = object2;
        this.b = serializable;
        this.c = l2;
        boolean bl2 = true;
        float f5 = 0.75f;
        object2 = new LinkedHashMap(0, f5, bl2);
        this.i = object2;
        this.r = object = ((c)object).f();
        object = new StringBuilder();
        object2 = ez3.g;
        String string2 = " Cache";
        object = h30_0.a((StringBuilder)object, (String)object2, string2);
        this.s = object2 = new uq0_2(this, (String)object);
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 > 0) {
            File file;
            this.d = file = new File((File)serializable, "journal");
            this.e = file = new File((File)serializable, "journal.tmp");
            this.f = file = new File((File)serializable, "journal.bkp");
            return;
        }
        String string3 = "maxSize <= 0".toString();
        super(string3);
        throw serializable;
    }

    public static void C(String string2) {
        Serializable serializable = t;
        boolean bl2 = serializable.c(string2);
        if (bl2) {
            return;
        }
        string2 = oj_0.b('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", string2);
        string2 = string2.toString();
        serializable = new IllegalArgumentException(string2);
        throw serializable;
    }

    public final void A() {
        long l2;
        long l3;
        long l4;
        long l7;
        block0: while ((l7 = (l4 = (l3 = this.g) - (l2 = this.c)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
            boolean bl2;
            Object object = this.i.values().iterator();
            while (bl2 = object.hasNext()) {
                rq0$b_0 rq0$b_0 = (rq0$b_0)object.next();
                boolean bl3 = rq0$b_0.f;
                if (bl3) continue;
                object = "toEvict";
                Intrinsics.checkNotNullExpressionValue(rq0$b_0, (String)object);
                this.z(rq0$b_0);
                continue block0;
            }
            return;
        }
        this.o = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        synchronized (this) {
            boolean bl2 = this.n ^ true;
            if (bl2) {
                return;
            }
            String string2 = "cache is closed";
            string2 = string2.toString();
            IllegalStateException illegalStateException = new IllegalStateException(string2);
            throw illegalStateException;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(rq0$a_0 object, boolean bl2) {
        synchronized (this) {
            Object object2;
            Object object3;
            long l2;
            int n3;
            Object object4;
            int n4;
            Object object5;
            Object object6;
            int n7;
            int n8;
            int n10;
            Object object7;
            Object object8 = "editor";
            try {
                block15: {
                    block16: {
                        block14: {
                            Intrinsics.checkNotNullParameter(object, (String)object8);
                            object8 = ((rq0$a_0)object).a;
                            object7 = ((rq0$b_0)object8).g;
                            n10 = Intrinsics.areEqual(object7, object);
                            if (n10 == 0) break block14;
                            n10 = 2;
                            n8 = 0;
                            if (!bl2 || (n7 = ((rq0$b_0)object8).e) != 0) break block15;
                            object6 = null;
                            break block16;
                        }
                        object = "Check failed.";
                        object = object.toString();
                        IllegalStateException illegalStateException = new IllegalStateException((String)object);
                        throw illegalStateException;
                    }
                    for (n7 = 0; n7 < n10; ++n7) {
                        object5 = ((rq0$a_0)object).b;
                        Intrinsics.checkNotNull(object5);
                        n4 = object5[n7];
                        if (n4 == 0) {
                            ((rq0$a_0)object).a();
                            CharSequence charSequence = new StringBuilder();
                            object8 = "Newly created entry didn't create value for index ";
                            charSequence.append((String)object8);
                            charSequence.append(n7);
                            charSequence = charSequence.toString();
                            object = new IllegalStateException((String)charSequence);
                            throw object;
                        }
                        object5 = this.a;
                        object4 = ((rq0$b_0)object8).d;
                        object4 = ((ArrayList)object4).get(n7);
                        n4 = object5.d((File)(object4 = (File)object4));
                        if (n4 != 0) continue;
                        ((rq0$a_0)object).a();
                        return;
                    }
                }
                object = null;
            }
            catch (Throwable throwable) {}
            throw throwable;
            for (n3 = 0; n3 < n10; ++n3) {
                object6 = ((rq0$b_0)object8).d;
                object6 = ((ArrayList)object6).get(n3);
                object6 = (File)object6;
                if (bl2 && (n4 = ((rq0$b_0)object8).f) == 0) {
                    object5 = this.a;
                    n4 = object5.d((File)object6);
                    if (n4 == 0) continue;
                    object5 = ((rq0$b_0)object8).c;
                    object5 = object5.get(n3);
                    object5 = (File)object5;
                    object4 = this.a;
                    ((gm0_2)object4).e((File)object6, (File)object5);
                    object6 = ((rq0$b_0)object8).b;
                    Object object9 = object6[n3];
                    object6 = this.a;
                    l2 = ((gm0_2)object6).g((File)object5);
                    long[] lArray = ((rq0$b_0)object8).b;
                    lArray[n3] = l2;
                    object3 = this.g - object9 + l2;
                    this.g = object3;
                    continue;
                }
                object5 = this.a;
                object5.b((File)object6);
            }
            n3 = 0;
            object = null;
            ((rq0$b_0)object8).g = null;
            n3 = (int)(((rq0$b_0)object8).f ? 1 : 0);
            if (n3 != 0) {
                this.z((rq0$b_0)object8);
                return;
            }
            n3 = this.j;
            n10 = 1;
            this.j = n3 += n10;
            object = this.h;
            Intrinsics.checkNotNull(object);
            n7 = (int)(((rq0$b_0)object8).e ? 1 : 0);
            n4 = 32;
            int n14 = 10;
            if (n7 == 0 && !bl2) {
                object2 = this.i;
                object7 = ((rq0$b_0)object8).a;
                ((AbstractMap)object2).remove(object7);
                object2 = w;
                object2 = object.D((String)object2);
                object2.writeByte(n4);
                object2 = ((rq0$b_0)object8).a;
                object.D((String)object2);
                object.writeByte(n14);
            } else {
                ((rq0$b_0)object8).e = n10;
                object7 = u;
                object7 = object.D((String)object7);
                object7.writeByte(n4);
                object7 = ((rq0$b_0)object8).a;
                object.D((String)object7);
                object7 = object;
                object7 = (he2_2)object;
                object6 = "writer";
                Intrinsics.checkNotNullParameter(object7, (String)object6);
                object6 = ((rq0$b_0)object8).b;
                int n15 = ((Object)object6).length;
                while (n8 < n15) {
                    object3 = object6[n8];
                    ((he2_2)object7).writeByte(n4);
                    ((he2_2)object7).Y((long)object3);
                    ++n8;
                }
                object.writeByte(n14);
                if (bl2) {
                    long l3 = this.q;
                    this.q = l2 = 1L + l3;
                    ((rq0$b_0)object8).i = l3;
                }
            }
            object.flush();
            long l4 = this.g;
            long l7 = this.c;
            n8 = (int)(l4 == l7 ? 0 : (l4 < l7 ? -1 : 1));
            if (n8 > 0 || (n3 = (int)(this.k() ? 1 : 0)) != 0) {
                object = this.r;
                object2 = this.s;
                okhttp3.internal.concurrent.b.d((okhttp3.internal.concurrent.b)object, (ri3_1)object2);
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final rq0$a_0 c(long var1_1, String var3_2) {
        synchronized (this) {
            block13: {
                block16: {
                    block14: {
                        block12: {
                            block15: {
                                block11: {
                                    var4_3 = "key";
                                    try {
                                        Intrinsics.checkNotNullParameter(var3_2, (String)var4_3);
                                        this.h();
                                        this.a();
                                        rq0_2.C(var3_2);
                                        var4_3 = this.i;
                                        var4_3 = var4_3.get(var3_2);
                                        var4_3 = (rq0$b_0)var4_3;
                                        var5_4 = -1;
                                        var7_5 /* !! */  = var1_1 == var5_4 ? 0 : (var1_1 < var5_4 ? -1 : 1);
                                        if (var7_5 /* !! */  == false) break block11;
                                        if (var4_3 == null) return null;
                                        var5_4 = var4_3.i;
                                        cfr_temp_0 = var5_4 - var1_1;
                                        var7_5 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                        if (var7_5 /* !! */  == false) break block11;
                                    }
                                    catch (Throwable var8_7) {}
                                    return null;
                                }
                                if (var4_3 != null) {
                                    var8_6 = var4_3.g;
                                    return var8_6;
                                }
                                var9_8 = 0;
                                var8_6 = null;
                                break block15;
                                ** finally { 
                            }
                            if (var8_6 != null) {
                                return null;
                            }
                            if (var4_3 != null) {
                                var9_8 = var4_3.h;
                                if (var9_8 == 0) break block12;
                                return null;
                            }
                        }
                        var9_8 = (int)this.o;
                        if (var9_8 != 0 || (var9_8 = (int)this.p) != 0) break block13;
                        var8_6 = this.h;
                        Intrinsics.checkNotNull(var8_6);
                        var10_9 = rq0_2.v;
                        var10_9 = var8_6.D((String)var10_9);
                        var11_11 = 32;
                        var10_9 = var10_9.writeByte(var11_11);
                        var10_9 = var10_9.D(var3_2);
                        var11_11 = 10;
                        var10_9.writeByte(var11_11);
                        var8_6.flush();
                        var9_8 = (int)this.k;
                        if (var9_8 == 0) break block14;
                        return null;
                    }
                    if (var4_3 != null) break block16;
                    var4_3 = new rq0$b_0(this, var3_2);
                    var8_6 = this.i;
                    var8_6.put(var3_2, var4_3);
                }
                var4_3.g = var8_6 = new rq0$a_0(this, (rq0$b_0)var4_3);
                return var8_6;
            }
            var8_6 = this.r;
            var10_10 = this.s;
            okhttp3.internal.concurrent.b.d((okhttp3.internal.concurrent.b)var8_6, var10_10);
            return null;
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
            int n3;
            int n4;
            Object object;
            boolean bl2;
            boolean bl3;
            block7: {
                block6: {
                    try {
                        bl3 = this.m;
                        bl2 = true;
                        if (!bl3 || (bl3 = this.n)) break block6;
                        object = this.i;
                        object = ((LinkedHashMap)object).values();
                        String string2 = "lruEntries.values";
                        Intrinsics.checkNotNullExpressionValue(object, string2);
                        n4 = 0;
                        string2 = null;
                        rq0$b_0[] rq0$b_0Array = new rq0$b_0[]{};
                        object = object.toArray(rq0$b_0Array);
                        n3 = ((rq0$b_0[])object).length;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                this.n = bl2;
                return;
            }
            throw throwable2;
            while (true) {
                if (n4 >= n3) {
                    this.A();
                    object = this.h;
                    Intrinsics.checkNotNull(object);
                    object.close();
                    bl3 = false;
                    object = null;
                    this.h = null;
                    this.n = bl2;
                    return;
                }
                Object object2 = object[n4];
                object2 = ((rq0$b_0)object2).g;
                if (object2 != null && object2 != null) {
                    ((rq0$a_0)object2).c();
                }
                ++n4;
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Rq0$c d(String object) {
        synchronized (this) {
            Throwable throwable2;
            Object object2;
            block8: {
                Object object3;
                int n3;
                block7: {
                    block6: {
                        object2 = "key";
                        try {
                            Intrinsics.checkNotNullParameter(object, (String)object2);
                            this.h();
                            this.a();
                            rq0_2.C((String)object);
                            object2 = this.i;
                            object2 = ((LinkedHashMap)object2).get(object);
                            object2 = (rq0$b_0)object2;
                            n3 = 0;
                            object3 = null;
                            if (object2 != null) break block6;
                        }
                        catch (Throwable throwable2) {}
                        return null;
                    }
                    object2 = ((rq0$b_0)object2).a();
                    if (object2 != null) break block7;
                    return null;
                }
                this.j = n3 = this.j + 1;
                object3 = this.h;
                Intrinsics.checkNotNull(object3);
                String string2 = x;
                object3 = object3.D(string2);
                int n4 = 32;
                object3 = object3.writeByte(n4);
                object = object3.D((String)object);
                n3 = 10;
                object.writeByte(n3);
                boolean bl2 = this.k();
                if (!bl2) break block8;
                object = this.r;
                object3 = this.s;
                okhttp3.internal.concurrent.b.d((okhttp3.internal.concurrent.b)object, (ri3_1)object3);
            }
            return object2;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void flush() {
        synchronized (this) {
            boolean bl2 = this.m;
            if (!bl2) {
                return;
            }
            this.a();
            this.A();
            re_2 re_22 = this.h;
            Intrinsics.checkNotNull(re_22);
            re_22.flush();
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void h() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [11 : 90->94)] java.lang.Throwable
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

    public final boolean k() {
        LinkedHashMap linkedHashMap;
        int n3 = this.j;
        int n4 = 2000;
        n3 = n3 >= n4 && n3 >= (n4 = ((AbstractMap)(linkedHashMap = this.i)).size()) ? 1 : 0;
        return n3 != 0;
    }

    public final void n() {
        boolean bl2;
        Object object = this.e;
        gm0_2 gm0_22 = this.a;
        gm0_22.b((File)object);
        object = this.i.values().iterator();
        while (bl2 = object.hasNext()) {
            int n3;
            Object object2 = object.next();
            Intrinsics.checkNotNullExpressionValue(object2, "i.next()");
            object2 = (rq0$b_0)object2;
            Object object3 = ((rq0$b_0)object2).g;
            int n4 = 2;
            if (object3 == null) {
                for (n3 = 0; n3 < n4; ++n3) {
                    long l2 = this.g;
                    object3 = ((rq0$b_0)object2).b;
                    Object object4 = object3[n3];
                    this.g = l2 += object4;
                }
                continue;
            }
            object3 = null;
            ((rq0$b_0)object2).g = null;
            while (n3 < n4) {
                object3 = (File)((rq0$b_0)object2).c.get(n3);
                gm0_22.b((File)object3);
                object3 = (File)((rq0$b_0)object2).d.get(n3);
                gm0_22.b((File)object3);
                ++n3;
            }
            object.remove();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void p() {
        block12: {
            var1_1 = ", ";
            var2_3 = "unexpected journal header: [";
            var3_5 /* !! */  = this.d;
            var4_6 = this.a;
            var5_7 = o72_0.b(var4_6.h(var3_5 /* !! */ ));
            var6_8 = 0x7FFFFFFFFFFFFFFFL;
            var8_9 = var5_7.x(var6_8);
            var9_10 = var5_7.x(var6_8);
            var10_11 = var5_7.x(var6_8);
            var11_12 = var5_7.x(var6_8);
            var12_13 = var5_7.x(var6_8);
            var13_14 = "libcore.io.DiskLruCache";
            var14_15 = Intrinsics.areEqual(var13_14, var8_9);
            if (var14_15 == 0 || (var14_15 = Intrinsics.areEqual(var13_14 = "1", var9_10)) == 0 || (var15_16 = Intrinsics.areEqual(var13_14 = String.valueOf(var14_15 = 201105), var10_11)) == 0) ** GOTO lbl-1000
            var15_16 = 2;
            var10_11 = String.valueOf(var15_16);
            if ((var15_16 = (int)Intrinsics.areEqual(var10_11, var11_12)) == 0 || (var15_16 = var12_13.length()) > 0) ** GOTO lbl-1000
            var16_17 = 0;
            var1_1 = null;
            while (true) {
                var2_3 = var5_7.x(var6_8);
                this.u((String)var2_3);
                ++var16_17;
            }
            {
                catch (Throwable var1_2) {
                    break block12;
                }
                catch (EOFException v0) {}
                {
                    var2_3 = this.i;
                    var17_19 = var2_3.size();
                }
                {
                    this.j = var16_17 -= var17_19;
                    var16_17 = (int)var5_7.g();
                    if (var16_17 == 0) {
                        this.w();
                    } else {
                        var1_1 = var4_6.a(var3_5 /* !! */ );
                        var3_5 /* !! */  = new wq0_2(this);
                        var2_3 = new zi0_2((y63_0)var1_1, (Function1)var3_5 /* !! */ );
                        this.h = var1_1 = o72_0.a((y63_0)var2_3);
                    }
                    var1_1 = Unit.a;
                }
                xj3_1.b(var5_7, null);
                return;
            }
lbl-1000:
            // 2 sources

            {
                var4_6 = new StringBuilder((String)var2_3);
                var4_6.append(var8_9);
                var4_6.append((String)var1_1);
                var4_6.append(var9_10);
                var4_6.append((String)var1_1);
                var4_6.append(var11_12);
                var4_6.append((String)var1_1);
                var4_6.append(var12_13);
                var16_18 = ']';
                var4_6.append(var16_18);
                var1_1 = var4_6.toString();
                var3_5 /* !! */  = new IOException((String)var1_1);
                throw var3_5 /* !! */ ;
            }
        }
        try {
            throw var1_2;
        }
        catch (Throwable var2_4) {
            xj3_1.b(var5_7, var1_2);
            throw var2_4;
        }
    }

    public final void u(String object) {
        String string2;
        block16: {
            Object object2;
            block21: {
                block19: {
                    int n3;
                    int n4;
                    int n7;
                    int n8;
                    int n10;
                    block20: {
                        Object object3;
                        block17: {
                            CharSequence charSequence;
                            block18: {
                                int n14;
                                String string3;
                                n10 = 1;
                                n8 = 32;
                                int n15 = 0;
                                n7 = StringsKt.N((CharSequence)object, (char)n8, 0, false, 6);
                                string2 = "unexpected journal line: ";
                                n4 = -1;
                                if (n7 == n4) break block16;
                                int n16 = n7 + 1;
                                n3 = StringsKt.N((CharSequence)object, (char)n8, n16, false, 4);
                                LinkedHashMap linkedHashMap = this.i;
                                String string4 = "this as java.lang.String).substring(startIndex)";
                                if (n3 == n4) {
                                    boolean bl2;
                                    string3 = ((String)object).substring(n16);
                                    Intrinsics.checkNotNullExpressionValue(string3, string4);
                                    object3 = w;
                                    int n17 = ((String)object3).length();
                                    if (n7 == n17 && (bl2 = kotlin.text.b.s((String)object, (String)object3, false))) {
                                        ((AbstractMap)linkedHashMap).remove(string3);
                                        return;
                                    }
                                } else {
                                    string3 = ((String)object).substring(n16, n3);
                                    object3 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
                                    Intrinsics.checkNotNullExpressionValue(string3, (String)object3);
                                }
                                if ((object3 = (rq0$b_0)linkedHashMap.get(string3)) == null) {
                                    object3 = new rq0$b_0(this, string3);
                                    linkedHashMap.put(string3, object3);
                                }
                                if (n3 == n4 || n7 != (n14 = (string3 = u).length()) || (n16 = (int)(kotlin.text.b.s((String)object, string3, false) ? 1 : 0)) == 0) break block17;
                                object = ((String)object).substring(n3 += n10);
                                Intrinsics.checkNotNullExpressionValue(object, string4);
                                Object object4 = new char[n10];
                                object4[0] = n8;
                                object = StringsKt.Z((CharSequence)object, object4);
                                ((rq0$b_0)object3).e = n10;
                                ((rq0$b_0)object3).g = null;
                                charSequence = "strings";
                                Intrinsics.checkNotNullParameter(object, (String)charSequence);
                                n8 = object.size();
                                object4 = ((rq0$b_0)object3).j;
                                object4.getClass();
                                n7 = 2;
                                if (n8 != n7) break block18;
                                n8 = object.size();
                                while (n15 < n8) {
                                    try {
                                        object4 = ((rq0$b_0)object3).b;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        charSequence = new StringBuilder(string2);
                                        ((StringBuilder)charSequence).append(object);
                                        object = ((StringBuilder)charSequence).toString();
                                        IOException iOException = new IOException((String)object);
                                        throw iOException;
                                    }
                                    Object object5 = object.get(n15);
                                    object5 = (String)object5;
                                    long l2 = Long.parseLong(object5);
                                    object4[n15] = (char)l2;
                                    n15 += n10;
                                }
                                break block19;
                            }
                            charSequence = new StringBuilder(string2);
                            ((StringBuilder)charSequence).append(object);
                            object = ((StringBuilder)charSequence).toString();
                            IOException iOException = new IOException((String)object);
                            throw iOException;
                        }
                        if (n3 != n4 || n7 != (n8 = ((String)(object2 = v)).length()) || (n10 = kotlin.text.b.s((String)object, (String)object2, false)) == 0) break block20;
                        ((rq0$b_0)object3).g = object = new rq0$a_0(this, (rq0$b_0)object3);
                        break block19;
                    }
                    if (n3 != n4 || n7 != (n8 = ((String)(object2 = x)).length()) || (n10 = (int)(kotlin.text.b.s((String)object, (String)object2, false) ? 1 : 0)) == 0) break block21;
                }
                return;
            }
            object = string2.concat((String)object);
            object2 = new IOException((String)object);
            throw object2;
        }
        object = string2.concat((String)object);
        IOException iOException = new IOException((String)object);
        throw iOException;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void w() {
        synchronized (this) {
            Object object;
            int n3;
            Object object2;
            Object object3;
            block14: {
                Throwable throwable2;
                object3 = this.h;
                if (object3 != null) {
                    object3.close();
                }
                object3 = this.a;
                object2 = this.e;
                object3 = ((gm0_2)object3).f((File)object2);
                object3 = o72_0.a((y63_0)object3);
                object2 = "libcore.io.DiskLruCache";
                {
                    catch (Throwable throwable2) {}
                }
                try {
                    ((he2_2)object3).D((String)object2);
                    n3 = 10;
                    ((he2_2)object3).writeByte(n3);
                    object = "1";
                    ((he2_2)object3).D((String)object);
                    ((he2_2)object3).writeByte(n3);
                    int n4 = 201105;
                    long l2 = n4;
                    ((he2_2)object3).Y(l2);
                    ((he2_2)object3).writeByte(n3);
                    n4 = 2;
                    l2 = n4;
                    ((he2_2)object3).Y(l2);
                    ((he2_2)object3).writeByte(n3);
                    ((he2_2)object3).writeByte(n3);
                    object = this.i;
                    object = ((LinkedHashMap)object).values();
                    object = object.iterator();
                    break block14;
                }
                catch (Throwable throwable3) {}
                try {
                    throw throwable3;
                }
                catch (Throwable throwable4) {
                    xj3_1.b((Closeable)object3, throwable3);
                    throw throwable4;
                }
                throw throwable2;
            }
            while (true) {
                boolean bl2 = object.hasNext();
                String string2 = null;
                if (!bl2) break;
                Object object4 = object.next();
                object4 = (rq0$b_0)object4;
                Object object5 = ((rq0$b_0)object4).g;
                int n7 = 32;
                if (object5 != null) {
                    string2 = v;
                    ((he2_2)object3).D(string2);
                    ((he2_2)object3).writeByte(n7);
                    object4 = ((rq0$b_0)object4).a;
                    ((he2_2)object3).D((String)object4);
                    ((he2_2)object3).writeByte(n3);
                    continue;
                }
                object5 = u;
                ((he2_2)object3).D((String)object5);
                ((he2_2)object3).writeByte(n7);
                object5 = ((rq0$b_0)object4).a;
                ((he2_2)object3).D((String)object5);
                object5 = "writer";
                Intrinsics.checkNotNullParameter(object3, (String)object5);
                for (Object e2 : (Object)((rq0$b_0)object4).b) {
                    ((he2_2)object3).writeByte(n7);
                    ((he2_2)object3).Y((long)e2);
                }
                ((he2_2)object3).writeByte(n3);
            }
            object2 = Unit.a;
            n3 = 0;
            object2 = null;
            {
                xj3_1.b((Closeable)object3, null);
                object3 = this.a;
                object2 = this.d;
                boolean bl3 = ((gm0_2)object3).d((File)object2);
                if (bl3) {
                    object3 = this.a;
                    object2 = this.d;
                    object = this.f;
                    ((gm0_2)object3).e((File)object2, (File)object);
                }
                object3 = this.a;
                object2 = this.e;
                object = this.d;
                ((gm0_2)object3).e((File)object2, (File)object);
                object3 = this.a;
                object2 = this.f;
                ((gm0_2)object3).b((File)object2);
                object3 = this.d;
                object2 = this.a;
                object3 = ((gm0_2)object2).a((File)object3);
                object = new wq0_2(this);
                object2 = new zi0_2((y63_0)object3, (Function1)object);
                this.h = object3 = o72_0.a((y63_0)object2);
                this.k = false;
                this.p = false;
                return;
            }
        }
    }

    public final void z(rq0$b_0 object) {
        int n3;
        Object object2;
        Object object3 = "entry";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n4 = this.l;
        int n7 = 10;
        int n8 = 32;
        int n10 = 1;
        if (n4 == 0) {
            n4 = ((rq0$b_0)object).h;
            if (n4 > 0 && (object3 = this.h) != null) {
                object2 = v;
                object3.D((String)object2);
                object3.writeByte(n8);
                object2 = ((rq0$b_0)object).a;
                object3.D((String)object2);
                object3.writeByte(n7);
                object3.flush();
            }
            if ((n4 = ((rq0$b_0)object).h) > 0 || (object3 = ((rq0$b_0)object).g) != null) {
                ((rq0$b_0)object).f = n10;
                return;
            }
        }
        if ((object3 = ((rq0$b_0)object).g) != null) {
            ((rq0$a_0)object3).c();
        }
        object3 = null;
        for (n4 = 0; n4 < (n3 = 2); ++n4) {
            object2 = (File)((rq0$b_0)object).c.get(n4);
            gm0_2 gm0_22 = this.a;
            gm0_22.b((File)object2);
            long l2 = this.g;
            long[] lArray = ((rq0$b_0)object).b;
            long l3 = lArray[n4];
            this.g = l2 -= l3;
            lArray[n4] = l2 = 0L;
        }
        this.j = n4 = this.j + n10;
        object3 = this.h;
        object = ((rq0$b_0)object).a;
        if (object3 != null) {
            String string2 = w;
            object3.D(string2);
            object3.writeByte(n8);
            object3.D((String)object);
            object3.writeByte(n7);
        }
        object3 = this.i;
        ((AbstractMap)object3).remove(object);
        boolean bl2 = this.k();
        if (bl2) {
            object = this.r;
            object3 = this.s;
            okhttp3.internal.concurrent.b.d((okhttp3.internal.concurrent.b)object, (ri3_1)object3);
        }
    }
}

