/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap$Config
 *  android.graphics.ColorSpace
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import coil.request.NullRequestDataException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class hK2 {
    public final ce1_0 a;
    public final oh3_0 b;
    public final L31 c;

    public hK2(ce1_0 object, oh3_0 oh3_02) {
        block4: {
            block3: {
                block2: {
                    int n3;
                    this.a = object;
                    this.b = oh3_02;
                    int bl3 = Build.VERSION.SDK_INT;
                    int n4 = 26;
                    if (bl3 < n4) break block2;
                    boolean bl2 = g.a;
                    if (bl2) break block3;
                    if (bl3 != n4 && bl3 != (n3 = 27)) {
                        boolean bl4 = true;
                        object = new We1(bl4);
                    } else {
                        object = new Object();
                    }
                    break block4;
                }
                boolean bl5 = g.a;
            }
            boolean bl6 = false;
            oh3_02 = null;
            object = new We1(false);
        }
        this.c = object;
    }

    public static hb0_0 a(pe1_0 pe1_02, Throwable throwable) {
        Drawable drawable2;
        boolean bl2 = throwable instanceof NullRequestDataException;
        if (bl2) {
            drawable2 = pe1_02.M.l;
            Drawable drawable3 = pe1_02.K;
            Integer n3 = pe1_02.J;
            if ((drawable2 = j.b(pe1_02, drawable3, n3, drawable2)) == null) {
                drawable2 = pe1_02.M.k;
                drawable3 = pe1_02.I;
                n3 = pe1_02.H;
                drawable2 = j.b(pe1_02, drawable3, n3, drawable2);
            }
        } else {
            drawable2 = pe1_02.M.k;
            Drawable drawable4 = pe1_02.I;
            Integer n4 = pe1_02.H;
            drawable2 = j.b(pe1_02, drawable4, n4, drawable2);
        }
        hb0_0 hb0_02 = new hb0_0(drawable2, pe1_02, throwable);
        return hb0_02;
    }

    public static boolean b(pe1_0 object, Bitmap.Config config) {
        boolean bl2;
        boolean bl3 = b.b(config);
        boolean bl4 = true;
        if (!bl3) {
            return bl4;
        }
        bl3 = ((pe1_0)object).q;
        if (!bl3) {
            return false;
        }
        object = ((pe1_0)object).c;
        bl3 = object instanceof nd3_0;
        if (bl3 && (bl3 = (object = ((nd3_0)object).getView()).isAttachedToWindow()) && !(bl2 = object.isHardwareAccelerated())) {
            return false;
        }
        return bl4;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final ba2 c(pe1_0 pe1_02, B63 b63) {
        ba2 ba22;
        boolean bl2;
        boolean bl3;
        void var7_11;
        wq0 wq02;
        Object object;
        Object object2 = pe1_02;
        B63 b632 = b63;
        List list = pe1_02.l;
        boolean bl4 = list.isEmpty();
        Bitmap.Config config = pe1_02.g;
        object = (bl4 || (bl4 = tp_2.w((Object[])(object = m.a), config))) && (!(bl4 = b.b(config)) || (bl4 = hK2.b((pe1_0)object2, config)) && (bl4 = (object = this.c).a(b632))) ? config : Bitmap.Config.ARGB_8888;
        wq0 wq03 = b632.a;
        wq0$b wq0$b = wq0$b.a;
        boolean bl5 = Intrinsics.areEqual(wq03, wq0$b);
        if (!bl5 && !(bl5 = Intrinsics.areEqual(wq02 = b632.b, wq0$b))) {
            WS2 wS2 = ((pe1_0)object2).C;
        } else {
            WS2 wS2 = WS2.FIT;
        }
        wq0$b = var7_11;
        bl5 = ((pe1_0)object2).r;
        if (bl5 && (bl3 = list.isEmpty()) && object != (list = Bitmap.Config.ALPHA_8)) {
            bl3 = true;
            bl2 = true;
        } else {
            bl3 = false;
            list = null;
            bl2 = false;
        }
        ColorSpace colorSpace = ((pe1_0)object2).h;
        boolean bl6 = j.a(pe1_02);
        fj_1 fj_12 = ((pe1_0)object2).u;
        fj_1 fj_13 = ((pe1_0)object2).v;
        list = ((pe1_0)object2).a;
        boolean bl7 = ((pe1_0)object2).s;
        String string2 = ((pe1_0)object2).f;
        m41_0 m41_02 = ((pe1_0)object2).n;
        zi3 zi32 = ((pe1_0)object2).o;
        hm2_0 hm2_02 = ((pe1_0)object2).D;
        fj_1 fj_14 = ((pe1_0)object2).t;
        object2 = ba22;
        b632 = b63;
        fj_1 fj_15 = fj_13;
        fj_13 = fj_14;
        return new ba2((Context)list, (Bitmap.Config)object, colorSpace, b63, (WS2)((Object)wq0$b), bl6, bl2, bl7, string2, m41_02, zi32, hm2_02, fj_14, fj_12, fj_15);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ba2 d(ba2 var1_1) {
        var2_2 = this;
        var3_3 /* !! */  = var1_1;
        var4_4 = var1_1.b;
        var5_5 /* !! */  = var1_1.o;
        var6_6 = b.b((Bitmap.Config)var4_4);
        var7_7 = true;
        if (var6_6 && !(var6_6 = (var8_8 = this.c).b())) {
            var4_4 = Bitmap.Config.ARGB_8888;
            var9_9 /* !! */  = var4_4;
            var6_6 = true;
        } else {
            var6_6 = false;
            var8_8 = null;
            var9_9 /* !! */  = var4_4;
        }
        var4_4 = var3_3 /* !! */ .o;
        var10_10 = var4_4.getReadEnabled();
        if (!var10_10) ** GOTO lbl-1000
        var4_4 = var2_2.b;
        synchronized (var4_4) {
            var4_4.b();
            var11_11 = var4_4.e;
            ** if (var11_11) goto lbl-1000
        }
lbl-1000:
        // 1 sources

        {
            var12_12 = var5_5 /* !! */  = fj_1.DISABLED;
            ** GOTO lbl27
        }
lbl-1000:
        // 2 sources

        {
            var12_12 = var5_5 /* !! */ ;
            var7_7 = var6_6;
        }
lbl27:
        // 2 sources

        if (var7_7 == false) return var3_3 /* !! */ ;
        var13_13 = var3_3 /* !! */ .a;
        var14_14 = var3_3 /* !! */ .c;
        var15_15 = var3_3 /* !! */ .d;
        var16_16 = var3_3 /* !! */ .e;
        var17_17 = var3_3 /* !! */ .f;
        var18_18 = var3_3 /* !! */ .g;
        var19_19 = var3_3 /* !! */ .h;
        var20_20 = var3_3 /* !! */ .i;
        var4_4 = var3_3 /* !! */ .j;
        var5_5 /* !! */  = var3_3 /* !! */ .k;
        var8_8 = var3_3 /* !! */ .l;
        var21_21 = var3_3 /* !! */ .m;
        var3_3 /* !! */  = var3_3 /* !! */ .n;
        return new ba2(var13_13, var9_9 /* !! */ , var14_14, var15_15, var16_16, var17_17, var18_18, var19_19, var20_20, (m41_0)var4_4, (zi3)var5_5 /* !! */ , (hm2_0)var8_8, var21_21, (fj_1)var3_3 /* !! */ , var12_12);
    }
}

