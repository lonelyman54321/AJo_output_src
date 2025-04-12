/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.os.SystemClock
 *  android.util.Log
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.b$c;
import com.bumptech.glide.c;
import com.bumptech.glide.load.engine.EngineJob;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.engine.f$d;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class j63
implements LJ2,
K63,
zk2_0 {
    public static final boolean B = Log.isLoggable((String)"GlideRequest", (int)2);
    public final RuntimeException A;
    public final Tb3$a a;
    public final Object b;
    public final ck2_0 c;
    public final TJ2 d;
    public final Context e;
    public final c f;
    public final Object g;
    public final Class h;
    public final uw_0 i;
    public final int j;
    public final int k;
    public final Az2 l;
    public final ki3_1 m;
    public final List n;
    public final wr3 o;
    public final Executor p;
    public wk2_0 q;
    public f$d r;
    public volatile f s;
    public j63$a t;
    public Drawable u;
    public Drawable v;
    public Drawable w;
    public int x;
    public int y;
    public boolean z;

    public j63(Context context, c c2, Object object, Object object2, Class clazz, uw_0 uw_02, int n3, int n4, Az2 az2, ki3_1 ki3_12, bk2_1 bk2_12, List list, TJ2 tJ2, f f5, wr3 wr32, Executor executor) {
        boolean bl2;
        Object object3;
        j63 j632 = this;
        Object object4 = c2;
        int n7 = B;
        if (n7 != 0) {
            n7 = this.hashCode();
            String.valueOf(n7);
        }
        j632.a = object3;
        object3 = object;
        j632.b = object;
        object3 = context;
        j632.e = context;
        j632.f = object4;
        object3 = object2;
        j632.g = object2;
        object3 = clazz;
        j632.h = clazz;
        object3 = uw_02;
        j632.i = uw_02;
        n7 = n3;
        j632.j = n3;
        n7 = n4;
        j632.k = n4;
        object3 = az2;
        j632.l = az2;
        object3 = ki3_12;
        j632.m = ki3_12;
        object3 = bk2_12;
        j632.c = bk2_12;
        object3 = list;
        j632.n = list;
        object3 = tJ2;
        j632.d = tJ2;
        object3 = f5;
        j632.s = f5;
        object3 = wr32;
        j632.o = wr32;
        object3 = executor;
        j632.p = executor;
        object3 = j63$a.PENDING;
        j632.t = object3;
        object3 = j632.A;
        if (object3 == null && (bl2 = (object4 = ((c)((Object)object4)).h.a).containsKey(object3 = b$c.class))) {
            object3 = "Glide request origin trace";
            j632.A = object4 = new RuntimeException((String)object3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a() {
        Object object = this.b;
        synchronized (object) {
            j63$a j63$a = this.t;
            j63$a j63$a2 = j63$a.COMPLETE;
            if (j63$a != j63$a2) return false;
            return true;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(int var1_1, int var2_2) {
        var3_3 = this;
        var4_4 = var1_1;
        var5_5 = var2_2;
        var6_6 /* !! */  = this.a;
        var6_6 /* !! */ .a();
        var7_7 /* !! */  = this.b;
        synchronized (var7_7 /* !! */ ) {
            block18: {
                block17: {
                    try {
                        var8_8 = j63.B;
                        if (var8_8) {
                        }
                        ** GOTO lbl21
                    }
                    catch (Throwable var12_9) {
                        ** GOTO lbl18
                    }
                    {
                        block21: {
                            SystemClock.elapsedRealtimeNanos();
                            break block21;
lbl18:
                            // 1 sources

                            var9_15 = var7_7 /* !! */ ;
                            var10_16 = var3_3;
                            ** GOTO lbl106
                        }
                        if ((var6_6 /* !! */  = var3_3.t) == (var11_18 /* !! */  = j63$a.WAITING_FOR_SIZE)) break block17;
                    }
                    return;
                }
                var3_3.t = var13_19 /* !! */  = j63$a.RUNNING;
                var6_6 /* !! */  = var3_3.i;
                var14_20 = var6_6 /* !! */ .b;
                var15_21 = -1 << -1;
                if (var4_4 == var15_21) ** GOTO lbl32
                var16_22 = (float)var4_4 * var14_20;
                {
                    var4_4 = Math.round(var16_22);
lbl32:
                    // 2 sources

                    var3_3.x = var4_4;
                    if (var5_5 != var15_21) break block18;
                    var4_4 = var5_5;
                    ** GOTO lbl39
                }
            }
            var16_22 = var5_5;
            {
                var4_4 = Math.round(var14_20 *= var16_22);
lbl39:
                // 2 sources

                var3_3.y = var4_4;
                if (var8_8) {
                    var4_4 = kx1.a;
                    SystemClock.elapsedRealtimeNanos();
                }
                var10_17 = var3_3.s;
                var6_6 /* !! */  = var3_3.f;
                var11_18 /* !! */  = var3_3.g;
                var12_10 /* !! */  = var3_3.i;
                var17_23 = var12_10 /* !! */ .l;
                var18_24 = var3_3.x;
                var19_25 = var3_3.y;
                var20_26 = var12_10 /* !! */ .s;
                var21_27 = var3_3.h;
                var22_28 = var3_3.l;
                var23_29 = var12_10 /* !! */ .c;
                var24_30 = var12_10 /* !! */ .r;
                var25_31 = var12_10 /* !! */ .m;
                var26_32 = var13_19 /* !! */ ;
                var28_34 = var27_33 = var12_10 /* !! */ .y;
                var13_19 /* !! */  = var12_10 /* !! */ .q;
                var29_35 = var7_7 /* !! */ ;
            }
            var31_37 = var30_36 = var12_10 /* !! */ .i;
            var32_38 = var30_36 = var12_10 /* !! */ .w;
            var30_36 = var12_10 /* !! */ .z;
            var1_1 = var4_4 = (int)var12_10 /* !! */ .x;
            var12_10 /* !! */  = var3_3.p;
            var33_39 = var26_32;
            var26_32 = var13_19 /* !! */ ;
            var9_15 = var7_7 /* !! */ ;
            var28_34 = var31_37;
            var31_37 = var30_36;
            var7_7 /* !! */  = var13_19 /* !! */ ;
            var34_40 = var28_34;
            var28_34 = var30_36;
            {
                block19: {
                    block20: {
                        catch (Throwable var12_13) {
                            var10_17 = var3_3;
                            var9_15 = var29_35;
                            break block19;
                        }
                        try {
                            var12_10 /* !! */  = var10_17.b((c)var6_6 /* !! */ , (Object)var11_18 /* !! */ , var17_23, var18_24, var19_25, var20_26, var21_27, var22_28, var23_29, var24_30, var25_31, var27_33, (Z92)var13_19 /* !! */ , var34_40, var32_38, var30_36, (boolean)var4_4, this, (Executor)var12_10 /* !! */ );
                            var10_17 = this;
                        }
                        catch (Throwable var12_12) {
                            var10_17 = this;
                            break block19;
                        }
                        try {
                            this.r = var12_10 /* !! */ ;
                            var12_10 /* !! */  = this.t;
                            var6_6 /* !! */  = var33_39;
                            if (var12_10 /* !! */  == var33_39) break block20;
                            var4_4 = 0;
                            var16_22 = 0.0f;
                            var12_10 /* !! */  = null;
                        }
                        catch (Throwable var12_11) {
                            break block19;
                        }
                        this.r = null;
                    }
                    if (var8_8) {
                        var4_4 = kx1.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    // ** MonitorExit[var9_15] (shouldn't be in output)
                    return;
                }
                // ** MonitorExit[var9_15] (shouldn't be in output)
            }
            throw var12_14;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean c() {
        Object object = this.b;
        synchronized (object) {
            j63$a j63$a = this.t;
            j63$a j63$a2 = j63$a.CLEARED;
            if (j63$a != j63$a2) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void clear() {
        block9: {
            Object object = this.b;
            // MONITORENTER : object
            boolean bl2 = this.z;
            if (bl2) break block9;
            Object object2 = this.a;
            object2.a();
            object2 = this.t;
            j63$a j63$a = j63$a.CLEARED;
            if (object2 == j63$a) {
                // MONITOREXIT : object
                return;
            }
            this.f();
            object2 = this.q;
            boolean bl3 = false;
            Object object3 = null;
            if (object2 != null) {
                this.q = null;
            } else {
                bl2 = false;
                object2 = null;
            }
            object3 = this.d;
            if (object3 == null || (bl3 = object3.b(this))) {
                object3 = this.m;
                Drawable drawable2 = this.g();
                object3.e(drawable2);
            }
            this.t = j63$a;
            // MONITOREXIT : object
            if (object2 == null) return;
            object = this.s;
            object.getClass();
            com.bumptech.glide.load.engine.f.e((wk2_0)object2);
            return;
        }
        String string2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.";
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean d() {
        Object object = this.b;
        synchronized (object) {
            j63$a j63$a = this.t;
            j63$a j63$a2 = j63$a.COMPLETE;
            if (j63$a != j63$a2) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean e(LJ2 lJ2) {
        int n3;
        uw_0 uw_02;
        Class clazz;
        Object object;
        int n4;
        int n7;
        Az2 az2;
        uw_0 uw_03;
        Class clazz2;
        Object object2;
        int n8;
        int n10;
        Object object3;
        Az2 az22;
        int n14;
        block18: {
            Object object4;
            block17: {
                block16: {
                    List list;
                    block15: {
                        object4 = lJ2;
                        n14 = lJ2 instanceof j63;
                        boolean bl2 = false;
                        az22 = null;
                        if (n14 == 0) {
                            return false;
                        }
                        object3 = this.b;
                        // MONITORENTER : object3
                        n10 = this.j;
                        n8 = this.k;
                        object2 = this.g;
                        clazz2 = this.h;
                        uw_03 = this.i;
                        az2 = this.l;
                        list = this.n;
                        if (list == null) break block15;
                        n7 = list.size();
                        break block16;
                    }
                    n7 = 0;
                    list = null;
                }
                // MONITOREXIT : object3
                object4 = (j63)object4;
                Object object5 = ((j63)object4).b;
                // MONITORENTER : object5
                n14 = ((j63)object4).j;
                n4 = ((j63)object4).k;
                object = ((j63)object4).g;
                clazz = ((j63)object4).h;
                uw_02 = ((j63)object4).i;
                az22 = ((j63)object4).l;
                object4 = ((j63)object4).n;
                if (object4 == null) break block17;
                n3 = object4.size();
                break block18;
            }
            n3 = 0;
            object4 = null;
        }
        // MONITOREXIT : object5
        if (n10 != n14) return false;
        if (n8 != n4) return false;
        object3 = dz3.a;
        n14 = 1;
        if (object2 == null) {
            if (object != null) return false;
            n10 = 1;
        } else {
            n10 = object2 instanceof yP1;
            if (n10 != 0) {
                object2 = (yP1)object2;
                n10 = (int)(object2.a() ? 1 : 0);
            } else {
                n10 = (int)(object2.equals(object) ? 1 : 0);
            }
        }
        if (n10 == 0) return false;
        n10 = (int)(clazz2.equals(clazz) ? 1 : 0);
        if (n10 == 0) return false;
        if (uw_03 == null) {
            if (uw_02 != null) return false;
            n10 = 1;
        } else {
            n10 = (int)(uw_03.p(uw_02) ? 1 : 0);
        }
        if (n10 == 0) return false;
        if (az2 != az22) return false;
        if (n7 != n3) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        boolean bl2 = this.z;
        if (bl2) {
            IllegalStateException illegalStateException = new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            throw illegalStateException;
        }
        this.a.a();
        this.m.h(this);
        Object object = this.r;
        if (object != null) {
            f f5 = ((f$d)object).c;
            synchronized (f5) {
                EngineJob engineJob = ((f$d)object).a;
                object = ((f$d)object).b;
                engineJob.j((zk2_0)object);
            }
            bl2 = false;
            object = null;
            this.r = null;
        }
    }

    public final Drawable g() {
        Object object = this.v;
        if (object == null) {
            int n3;
            Drawable drawable2;
            object = this.i;
            this.v = drawable2 = object.g;
            if (drawable2 == null && (n3 = object.h) > 0) {
                object = object.u;
                Context context = this.e;
                if (object == null) {
                    object = context.getTheme();
                }
                this.v = object = xt0_0.a(context, context, n3, (Resources.Theme)object);
            }
        }
        return this.v;
    }

    public final boolean h() {
        boolean bl2;
        TJ2 tJ2 = this.d;
        if (tJ2 != null && (bl2 = (tJ2 = tJ2.getRoot()).a())) {
            bl2 = false;
            tJ2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(GlideException object, int n3) {
        this.a.a();
        Object object2 = this.b;
        synchronized (object2) {
            Throwable throwable3;
            block25: {
                Throwable throwable22;
                block24: {
                    boolean bl2;
                    Object object3;
                    Object object4;
                    Drawable drawable2;
                    int n4;
                    Object object5;
                    block23: {
                        int n7;
                        object.getClass();
                        object5 = this.f;
                        n4 = ((c)((Object)object5)).i;
                        if (n4 <= n3) {
                            drawable2 = this.g;
                            Objects.toString(drawable2);
                            n3 = 4;
                            if (n4 <= n3) {
                                drawable2 = new ArrayList();
                                GlideException.a((Throwable)object, drawable2);
                                n4 = drawable2.size();
                                int n8 = 0;
                                object4 = null;
                                while (n8 < n4) {
                                    n7 = n8 + 1;
                                    object4 = drawable2.get(n8);
                                    object4 = (Throwable)object4;
                                    n8 = n7;
                                }
                            }
                        }
                        n3 = 0;
                        drawable2 = null;
                        this.r = null;
                        object5 = j63$a.FAILED;
                        this.t = object5;
                        object5 = this.d;
                        if (object5 != null) {
                            object5.f(this);
                        }
                        n4 = 1;
                        this.z = n4;
                        try {
                            object4 = this.n;
                            if (object4 == null) break block23;
                            object4 = object4.iterator();
                            while ((n7 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                                object3 = object4.next();
                                object3 = (ck2_0)object3;
                                ki3_1 ki3_12 = this.m;
                                this.h();
                                object3.b((GlideException)object, ki3_12);
                            }
                        }
                        catch (Throwable throwable22) {
                            break block24;
                        }
                    }
                    if ((object4 = this.c) != null) {
                        object3 = this.m;
                        this.h();
                        object4.b((GlideException)object, (ki3_1)object3);
                    }
                    if ((object = this.d) != null && !(bl2 = object.h(this))) {
                        n4 = 0;
                        object5 = null;
                    }
                    if (n4 != 0) {
                        object = this.g;
                        if (object == null) {
                            object = this.w;
                            if (object == null) {
                                object = this.i;
                                this.w = drawable2 = ((uw_0)object).o;
                                if (drawable2 == null && (n3 = ((uw_0)object).p) > 0) {
                                    object = ((uw_0)object).u;
                                    object5 = this.e;
                                    if (object == null) {
                                        object = object5.getTheme();
                                    }
                                    object = xt0_0.a((Context)object5, (Context)object5, n3, (Resources.Theme)object);
                                    this.w = object;
                                }
                            }
                            drawable2 = this.w;
                        }
                        if (drawable2 == null) {
                            object = this.u;
                            if (object == null) {
                                object = this.i;
                                this.u = drawable2 = ((uw_0)object).e;
                                if (drawable2 == null && (n3 = ((uw_0)object).f) > 0) {
                                    object = ((uw_0)object).u;
                                    object5 = this.e;
                                    if (object == null) {
                                        object = object5.getTheme();
                                    }
                                    object = xt0_0.a((Context)object5, (Context)object5, n3, (Resources.Theme)object);
                                    this.u = object;
                                }
                            }
                            drawable2 = this.u;
                        }
                        if (drawable2 == null) {
                            drawable2 = this.g();
                        }
                        object = this.m;
                        object.i(drawable2);
                    }
                    try {
                        this.z = false;
                        return;
                    }
                    catch (Throwable throwable3) {}
                    break block25;
                }
                this.z = false;
                throw throwable22;
            }
            throw throwable3;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean isRunning() {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                j63$a j63$a;
                j63$a j63$a2;
                try {
                    j63$a2 = this.t;
                    j63$a = j63$a.RUNNING;
                    if (j63$a2 == j63$a) return true;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                {
                    j63$a = j63$a.WAITING_FOR_SIZE;
                    if (j63$a2 != j63$a) return false;
                }
                return true;
            }
            throw throwable2;
        }
    }

    /*
     * Exception decompiling
     */
    public final void j() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 10[TRYBLOCK] [13 : 91->95)] java.lang.Throwable
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
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void k(wk2_0 object, pi0_0 object2, boolean bl2) {
        Object object3;
        block14: {
            CharSequence charSequence;
            int n3;
            Object object4;
            Object object5;
            block12: {
                block13: {
                    object5 = "Expected to receive an object of ";
                    object4 = "Expected to receive a Resource<R> with an object of ";
                    this.a.a();
                    object3 = null;
                    Object object6 = this.b;
                    // MONITORENTER : object6
                    try {
                        boolean bl3;
                        Class<?> clazz;
                        Class clazz2;
                        boolean bl4;
                        this.r = null;
                        n3 = 5;
                        if (object == null) {
                            object2 = new StringBuilder((String)object4);
                            Object object7 = this.h;
                            ((StringBuilder)object2).append(object7);
                            object7 = " inside, but instead got null.";
                            ((StringBuilder)object2).append((String)object7);
                            object2 = ((StringBuilder)object2).toString();
                            object = new GlideException((String)object2);
                            this.i((GlideException)object, n3);
                            // MONITOREXIT : object6
                            return;
                        }
                        object4 = object.get();
                        if (object4 == null || !(bl4 = (clazz2 = this.h).isAssignableFrom(clazz = object4.getClass()))) break block12;
                        object5 = this.d;
                        if (object5 == null || (bl3 = object5.i(this))) break block13;
                    }
                    catch (Throwable throwable) {}
                    this.q = null;
                    object2 = j63$a.COMPLETE;
                    this.t = object2;
                    // MONITOREXIT : object6
                    this.s.getClass();
                    com.bumptech.glide.load.engine.f.e((wk2_0)object);
                    return;
                }
                this.l((wk2_0)object, object4, (pi0_0)((Object)object2), bl2);
                // MONITOREXIT : object6
                return;
                break block14;
            }
            try {
                this.q = null;
                charSequence = new StringBuilder((String)object5);
                object5 = this.h;
                charSequence.append(object5);
                object5 = " but instead got ";
                charSequence.append((String)object5);
                object5 = object4 != null ? object4.getClass() : "";
            }
            catch (Throwable throwable) {
                object3 = object;
                object = throwable;
            }
            break block14;
            charSequence.append(object5);
            object5 = "{";
            charSequence.append((String)object5);
            charSequence.append(object4);
            object5 = "} inside Resource{";
            charSequence.append((String)object5);
            charSequence.append(object);
            object5 = "}.";
            charSequence.append((String)object5);
            object5 = object4 != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
            charSequence.append((String)object5);
            charSequence = charSequence.toString();
            object2 = new GlideException((String)charSequence);
            this.i((GlideException)object2, n3);
            // MONITOREXIT : object6
            this.s.getClass();
            com.bumptech.glide.load.engine.f.e((wk2_0)object);
            return;
        }
        try {
            throw object;
        }
        catch (Throwable throwable) {
            if (object3 == null) throw throwable;
            object2 = this.s;
            ((Object)object2).getClass();
            com.bumptech.glide.load.engine.f.e(object3);
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(wk2_0 object, Object object2, pi0_0 object3, boolean bl2) {
        Throwable throwable2;
        block10: {
            boolean bl3;
            ki3_1 ki3_12;
            Object object4;
            Object object5;
            block11: {
                block9: {
                    Object object6;
                    boolean bl4;
                    bl2 = this.h();
                    object5 = j63$a.COMPLETE;
                    this.t = object5;
                    this.q = object;
                    object = this.f;
                    int n3 = ((c)((Object)object)).i;
                    int n4 = 3;
                    object4 = this.g;
                    if (n3 <= n4) {
                        Objects.toString(object3);
                        Objects.toString(object4);
                        n3 = kx1.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if ((object = this.d) != null) {
                        object.g(this);
                    }
                    this.z = true;
                    n3 = 0;
                    object = null;
                    try {
                        object5 = this.n;
                        ki3_12 = this.m;
                        if (object5 == null) break block9;
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                    {
                        object5 = object5.iterator();
                        bl3 = false;
                        while (bl4 = object5.hasNext()) {
                            object6 = object5.next();
                            object6 = (ck2_0)object6;
                            object6.f(object2, object4, ki3_12, (pi0_0)((Object)object3));
                        }
                        break block11;
                    }
                    {
                        boolean bl5 = object6 instanceof lf0_0;
                        if (!bl5) continue;
                        object6 = (lf0_0)object6;
                        bl4 = ((lf0_0)object6).a();
                        bl3 |= bl4;
                        continue;
                        break;
                    }
                }
                bl3 = false;
            }
            if ((object5 = this.c) != null) {
                object5.f(object2, object4, ki3_12, (pi0_0)((Object)object3));
            }
            if (!bl3) {
                object5 = this.o;
                object3 = object5.a((pi0_0)((Object)object3), bl2);
                ki3_12.d(object2, (qr3)object3);
            }
            this.z = false;
            return;
        }
        this.z = false;
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void pause() {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        boolean bl2 = this.isRunning();
                        if (!bl2) break block3;
                        this.clear();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        Class clazz;
        Object object;
        Object object2 = this.b;
        synchronized (object2) {
            object = this.g;
            clazz = this.h;
        }
        object2 = new StringBuilder();
        String string2 = super.toString();
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append("[model=");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(", transcodeClass=");
        ((StringBuilder)object2).append(clazz);
        ((StringBuilder)object2).append("]");
        return ((StringBuilder)object2).toString();
    }
}

