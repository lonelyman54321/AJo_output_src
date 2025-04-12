/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.a;

public final class S91$a
implements y63_0 {
    public final boolean a;
    public final ce_2 b;
    public boolean c;
    public final /* synthetic */ S91 d;

    public S91$a(S91 object, boolean bl2) {
        this.d = object;
        this.a = bl2;
        this.b = object = new ce_2();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(boolean var1_1) {
        var2_2 = this.d;
        synchronized (var2_2) {
            var3_3 /* !! */  = var2_2.l;
            var3_3 /* !! */ .h();
            try {
                while ((var8_6 = (cfr_temp_0 = (var4_4 = var2_2.e) - (var6_5 = var2_2.f)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) >= 0 && !(var9_7 = this.a) && !(var9_7 = this.c) && (var3_3 /* !! */  = var2_2.f()) == null) {
                    var2_2.l();
                }
            }
            catch (Throwable var10_8) {
                ** break block14
            }
            var3_3 /* !! */  = var2_2.l;
            var3_3 /* !! */ .l();
            var2_2.b();
            var4_4 = var2_2.f;
            var6_5 = var2_2.e;
            var4_4 -= var6_5;
            var11_12 = this.b;
            var6_5 = var11_12.b;
            var12_13 = Math.min(var4_4, var6_5);
            var2_2.e = var4_4 = var2_2.e + var12_13;
            if (!var1_1 /* !! */ ) ** GOTO lbl-1000
            var10_9 = this.b;
            var4_4 = var10_9.b;
            cfr_temp_1 = var12_13 - var4_4;
            var1_1 /* !! */  = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
            if (!var1_1 /* !! */ ) {
                var1_1 /* !! */  = true;
                var14_14 = true;
            } else lbl-1000:
            // 2 sources

            {
                var1_1 /* !! */  = false;
                var10_9 = null;
                var14_14 = false;
            }
            var10_9 = Unit.a;
        }
        var10_9 = this.d.l;
        var10_9.h();
        try {
            var10_9 = this.d;
            var15_15 = var10_9.b;
            var16_16 = var10_9.a;
            var17_17 = this.b;
            var15_15.p(var16_16, var14_14, var17_17, var12_13);
            return;
        }
        finally {
            this.d.l.l();
        }
lbl-1000:
        // 1 sources

        {
            try {
                var3_3 /* !! */  = var2_2.l;
                var3_3 /* !! */ .l();
                throw var10_8;
            }
            catch (Throwable var10_10) {}
            throw var10_10;
        }
    }

    public final void close() {
        Object object = this.d;
        Object object2 = ez3.a;
        synchronized (object) {
            boolean bl2;
            block16: {
                boolean bl3;
                block17: {
                    long l2;
                    Object object3;
                    block15: {
                        block14: {
                            bl3 = this.c;
                            if (!bl3) break block14;
                            return;
                        }
                        object2 = (Object)((S91)object).f();
                        bl2 = true;
                        if (object2 == null) {
                            bl3 = true;
                            break block15;
                        }
                        bl3 = false;
                        object2 = null;
                    }
                    try {
                        Object object4 = Unit.a;
                        object = this.d;
                        object4 = ((S91)object).j;
                        object3 = ((S91$a)object4).a;
                        if (object3 != 0) break block16;
                        object4 = this.b;
                        long l3 = ((ce_2)object4).b;
                        l2 = 0L;
                        long l4 = l3 - l2;
                        Object object5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                        if (object5 <= 0) break block17;
                    }
                    catch (Throwable throwable) {
                        throw throwable;
                    }
                    finally {
                    }
                    while (true) {
                        object = this.b;
                        long l7 = ((ce_2)object).b;
                        long l8 = l7 - l2;
                        object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                        if (object3 > 0) {
                            this.a(bl2);
                            continue;
                        }
                        break block16;
                        break;
                    }
                }
                if (bl3) {
                    g91_0 g91_02 = ((S91)object).b;
                    int n3 = ((S91)object).a;
                    long l12 = 0L;
                    boolean bl4 = true;
                    g91_02.p(n3, bl4, null, l12);
                }
            }
            object = this.d;
            synchronized (object) {
                this.c = bl2;
                object2 = Unit.a;
                this.d.b.flush();
                this.d.a();
                return;
            }
        }
    }

    public final void flush() {
        Object object = this.d;
        Object object2 = ez3.a;
        synchronized (object) {
            ((S91)object).b();
            object2 = Unit.a;
            while (true) {
                object = this.b;
                long l2 = ((ce_2)object).b;
                long l3 = 0L;
                long l4 = l2 - l3;
                Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object3 <= 0) break;
                this.a(false);
                object = this.d.b;
                ((g91_0)object).flush();
            }
            return;
            finally {
            }
        }
    }

    public final void s0(ce_2 ce_22, long l2) {
        long l3;
        long l4;
        long l7;
        long l8;
        Intrinsics.checkNotNullParameter(ce_22, "source");
        Object object = ez3.a;
        object = this.b;
        ((ce_2)object).s0(ce_22, l2);
        while ((l8 = (l7 = (l4 = ((ce_2)object).b) - (l3 = 16384L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) >= 0) {
            ce_22 = null;
            this.a(false);
        }
    }

    public final a timeout() {
        return this.d.l;
    }
}

