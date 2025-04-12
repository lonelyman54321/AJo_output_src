/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources$Theme
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Drawable
 *  android.util.Log
 *  android.view.View
 *  android.widget.ImageView
 */
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.a;
import com.bumptech.glide.c;
import com.bumptech.glide.load.engine.f;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/*
 * Renamed from RJ2
 */
public class rj2_0
extends uw_0 {
    public final Context A;
    public final RequestManager B;
    public final Class C;
    public final c D;
    public Jr3 E;
    public Object F;
    public ArrayList G;
    public rj2_0 H;
    public rj2_0 I;
    public boolean J;
    public boolean K;
    public boolean L;

    static {
        fk2_0 fk2_02 = new fk2_0();
        Object object = Nq0.b;
        fk2_02 = (fk2_0)fk2_02.j((Nq0)object);
        object = Az2.LOW;
        fk2_02 = (fk2_0)((fk2_0)fk2_02.y((Az2)((Object)object))).E(true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public rj2_0(a object, RequestManager requestManager, Class object2, Context object3) {
        boolean bl2;
        this.J = bl2 = true;
        this.B = requestManager;
        this.C = object2;
        this.A = object3;
        object3 = requestManager.a.d.f;
        Jr3 jr3 = (Jr3)object3.get(object2);
        if (jr3 == null) {
            boolean bl3;
            object3 = object3.entrySet().iterator();
            while (bl3 = object3.hasNext()) {
                Map.Entry entry = (Map.Entry)object3.next();
                Class clazz = (Class)entry.getKey();
                boolean bl4 = clazz.isAssignableFrom((Class<?>)object2);
                if (!bl4) continue;
                jr3 = (Jr3)entry.getValue();
            }
        }
        if (jr3 == null) {
            jr3 = com.bumptech.glide.c.k;
        }
        this.E = jr3;
        object = ((a)object).d;
        this.D = object;
        object = requestManager.i.iterator();
        while (true) {
            boolean bl5;
            if (!(bl5 = object.hasNext())) {
                synchronized (requestManager) {
                    object = requestManager.j;
                }
                this.M((uw_0)object);
                return;
            }
            object2 = (ck2_0)object.next();
            this.L((ck2_0)object2);
        }
    }

    public rj2_0 L(ck2_0 ck2_02) {
        boolean bl2 = this.v;
        if (bl2) {
            return this.O().L(ck2_02);
        }
        if (ck2_02 != null) {
            ArrayList<ck2_0> arrayList = this.G;
            if (arrayList == null) {
                this.G = arrayList = new ArrayList<ck2_0>();
            }
            arrayList = this.G;
            arrayList.add(ck2_02);
        }
        this.B();
        return this;
    }

    public rj2_0 M(uw_0 uw_02) {
        dV0.b(uw_02);
        return (rj2_0)super.b(uw_02);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final LJ2 N(Object var1_1, ki3_1 var2_2, bk2_1 var3_3, TJ2 var4_4, Jr3 var5_5, Az2 var6_6, int var7_7, int var8_8, uw_0 var9_9, Executor var10_10) {
        block11: {
            block12: {
                block13: {
                    block14: {
                        var11_11 = this;
                        var12_12 = var1_1;
                        var13_13 = var5_5;
                        var14_14 = var9_9;
                        var15_15 = this.I;
                        if (var15_15 != null) {
                            var16_16 /* !! */  = var4_4 /* !! */ ;
                            var17_17 = var15_15 = new gb0_0(var1_1, var4_4 /* !! */ );
                            var18_18 = var15_15;
                        } else {
                            var16_16 /* !! */  = var4_4 /* !! */ ;
                            var19_19 /* !! */  = 0;
                            var15_15 = null;
                            var18_18 = null;
                            var17_17 = var4_4 /* !! */ ;
                        }
                        var15_15 = var11_11.H;
                        if (var15_15 == null) break block11;
                        var20_20 = var11_11.L;
                        if (var20_20 != 0) break block12;
                        var16_16 /* !! */  = var15_15.E;
                        var21_21 = var15_15.J;
                        var22_22 = var21_21 != 0 ? var13_13 : var16_16 /* !! */ ;
                        var19_19 /* !! */  = var15_15.a;
                        var20_20 = 8;
                        var19_19 /* !! */  = (int)uw_0.q(var19_19 /* !! */ , var20_20);
                        var23_24 = 1;
                        if (var19_19 /* !! */  != 0) {
                            var15_15 = var11_11.H.d;
lbl29:
                            // 4 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var15_15 = RJ2$a.b;
                        var20_20 = var6_6.ordinal();
                        var19_19 /* !! */  = (int)var15_15[var20_20];
                        if (var19_19 /* !! */  == var23_24) break block13;
                        var20_20 = 2;
                        if (var19_19 /* !! */  == var20_20) break block14;
                        var20_20 = 3;
                        if (var19_19 /* !! */  != var20_20 && var19_19 /* !! */  != (var20_20 = 4)) {
                            var15_15 = new StringBuilder("unknown priority: ");
                            var16_16 /* !! */  = var11_11.d;
                            var15_15.append(var16_16 /* !! */ );
                            var15_15 = var15_15.toString();
                            var13_13 = new IllegalArgumentException((String)var15_15);
                            throw var13_13;
                        }
                        var15_15 = Az2.IMMEDIATE;
                        ** GOTO lbl29
                    }
                    var15_15 = Az2.HIGH;
                    ** GOTO lbl29
                }
                var15_15 = Az2.NORMAL;
                ** while (true)
                var24_25 = var15_15;
                var15_15 = var11_11.H;
                var20_20 = var15_15.k;
                var19_19 /* !! */  = var15_15.j;
                var21_21 = dz3.i(var7_7, var8_8);
                if (var21_21 == 0) ** GOTO lbl-1000
                var25_26 = var11_11.H;
                var26_27 = var25_26.k;
                var21_21 = var25_26.j;
                if ((var21_21 = (int)dz3.i(var26_27, var21_21)) == 0) {
                    var19_19 /* !! */  = var14_14.k;
                    var20_20 = var14_14.j;
                    var27_28 = var19_19 /* !! */ ;
                    var28_29 /* !! */  = var20_20;
                } else lbl-1000:
                // 2 sources

                {
                    var28_29 /* !! */  = var19_19 /* !! */ ;
                    var27_28 = var20_20;
                }
                var29_30 = new tn3_0(var12_12, (TJ2)var17_17);
                var30_31 = var11_11.F;
                var17_17 = var11_11.G;
                var16_16 /* !! */  = var11_11.D;
                var31_32 = var16_16 /* !! */ .g;
                var32_33 = var13_13.a;
                var13_13 = var33_34 /* !! */ ;
                var15_15 = var11_11.A;
                var34_35 = var11_11.C;
                var25_26 = var1_1;
                var35_36 = var33_34 /* !! */ ;
                var33_34 /* !! */  = var9_9;
                var36_37 = var32_33;
                var37_39 = var7_7;
                var38_40 = var31_32;
                var39_42 = var8_8;
                var4_4 /* !! */  = var29_30;
                var29_30 = var6_6;
                var40_43 = var17_17;
                var17_17 = var3_3;
                var41_44 = var18_18;
                var18_18 = var40_43;
                var14_14 = var4_4 /* !! */ ;
                var12_12 = var31_32;
                var38_40 = var10_10;
                var13_13 = new j63((Context)var15_15, (c)var16_16 /* !! */ , var1_1, var30_31, (Class)var34_35, var9_9, var7_7, var8_8, var6_6, var2_2, var3_3, (List)var40_43, var4_4 /* !! */ , var31_32, var32_33, var10_10);
                var42_45 = 1;
                var11_11.L = var42_45;
                var13_13 = var29_30 = var11_11.H;
                var15_15 = var1_1;
                var16_16 /* !! */  = var2_2;
                var25_26 = var3_3;
                var30_31 = var4_4 /* !! */ ;
                var34_35 = var22_22;
                var33_34 /* !! */  = var24_25;
                var37_39 = var27_28;
                var39_42 = var28_29 /* !! */ ;
                var13_13 = var29_30.N(var1_1, var2_2, var3_3, var4_4 /* !! */ , (Jr3)var22_22, (Az2)var24_25, var27_28, var28_29 /* !! */ , (uw_0)var29_30, var10_10);
                var19_19 /* !! */  = 0;
                var11_11.L = false;
                var15_15 = var4_4 /* !! */ ;
                var16_16 /* !! */  = var35_36;
                var4_4 /* !! */ .c = var35_36;
                var4_4 /* !! */ .d = var13_13;
                var17_17 = var4_4 /* !! */ ;
lbl116:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var13_13 = new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            throw var13_13;
        }
        var41_44 = var18_18;
        var30_31 = var11_11.F;
        var18_18 = var11_11.G;
        var16_16 /* !! */  = var11_11.D;
        var12_12 = var16_16 /* !! */ .g;
        var14_14 = var13_13.a;
        var13_13 = var22_23;
        var15_15 = var11_11.A;
        var34_35 = var11_11.C;
        var25_26 = var1_1;
        var33_34 /* !! */  = var9_9;
        var37_39 = var7_7;
        var39_42 = var8_8;
        var29_30 = var6_6;
        var36_38 = var17_17;
        var17_17 = var3_3;
        var38_41 = var14_14;
        var14_14 = var36_38;
        var36_38 = var38_41;
        var38_41 = var10_10;
        var22_23 = new j63((Context)var15_15, (c)var16_16 /* !! */ , var1_1, var30_31, (Class)var34_35, var9_9, var7_7, var8_8, var6_6, var2_2, var3_3, (List)var18_18, (TJ2)var14_14, (f)var12_12, (wr3)var36_38, var10_10);
        var17_17 = var22_23;
        ** while (true)
        var18_18 = var41_44;
        if (var41_44 == null) {
            return var17_17;
        }
        var13_13 = var11_11.I;
        var19_19 /* !! */  = var13_13.k;
        var42_45 = var13_13.j;
        var20_20 = (int)dz3.i(var7_7, var8_8);
        if (var20_20 == 0) ** GOTO lbl-1000
        var16_16 /* !! */  = var11_11.I;
        var21_21 = var16_16 /* !! */ .k;
        var20_20 = var16_16 /* !! */ .j;
        if ((var20_20 = (int)dz3.i(var21_21, var20_20)) == 0) {
            var16_16 /* !! */  = var9_9;
            var42_45 = var9_9.k;
            var19_19 /* !! */  = var9_9.j;
            var37_39 = var42_45;
            var39_42 = var19_19 /* !! */ ;
        } else lbl-1000:
        // 2 sources

        {
            var39_42 = var42_45;
            var37_39 = var19_19 /* !! */ ;
        }
        var29_30 = var11_11.I;
        var34_35 = var29_30.E;
        var33_34 /* !! */  = var29_30.d;
        var13_13 = var29_30;
        var15_15 = var1_1;
        var16_16 /* !! */  = var2_2;
        var25_26 = var3_3;
        var30_31 = var18_18;
        var13_13 = var29_30.N(var1_1, var2_2, var3_3, (TJ2)var18_18, (Jr3)var34_35, (Az2)var33_34 /* !! */ , var37_39, var39_42, (uw_0)var29_30, var10_10);
        var18_18.c = var17_17;
        var18_18.d = var13_13;
        return var18_18;
    }

    public rj2_0 O() {
        rj2_0 rj2_02 = (rj2_0)super.g();
        Cloneable cloneable = rj2_02.E.b();
        rj2_02.E = cloneable;
        cloneable = rj2_02.G;
        if (cloneable != null) {
            ArrayList arrayList = rj2_02.G;
            cloneable = new ArrayList(arrayList);
            rj2_02.G = cloneable;
        }
        if ((cloneable = rj2_02.H) != null) {
            cloneable = ((rj2_0)cloneable).O();
            rj2_02.H = cloneable;
        }
        if ((cloneable = rj2_02.I) != null) {
            cloneable = ((rj2_0)cloneable).O();
            rj2_02.I = cloneable;
        }
        return rj2_02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void P(ki3_1 ki3_12, bk2_1 bk2_12, uw_0 uw_02, Executor executor) {
        rj2_0 rj2_02 = this;
        Object object = ki3_12;
        dV0.b(ki3_12);
        boolean bl2 = this.K;
        if (!bl2) {
            object = new IllegalArgumentException("You must call #load() before calling #into()");
            throw object;
        }
        Object object2 = new Object();
        Jr3 jr3 = this.E;
        Az2 az2 = uw_02.d;
        int n3 = uw_02.k;
        int n4 = uw_02.j;
        Object object3 = this;
        Object object4 = ki3_12;
        object3 = this.N(object2, ki3_12, bk2_12, null, jr3, az2, n3, n4, uw_02, executor);
        boolean bl3 = object3.e((LJ2)(object2 = ki3_12.getRequest()));
        if (bl3 && ((bl3 = uw_02.i) || !(bl3 = object2.d()))) {
            object = "Argument must not be null";
            dV0.c(object2, (String)object);
            boolean bl4 = object2.isRunning();
            if (!bl4) {
                object2.j();
            }
            return;
        }
        rj2_02.B.l(ki3_12);
        ki3_12.g((LJ2)object3);
        object2 = rj2_02.B;
        synchronized (object2) {
            object4 = ((RequestManager)object2).f;
            object4 = ((oi3_0)object4).a;
            object4.add(ki3_12);
            object = ((RequestManager)object2).d;
            object4 = ((iK2)object).a;
            object4.add(object3);
            bl3 = ((iK2)object).c;
            if (!bl3) {
                object3.j();
            } else {
                object3.clear();
                object4 = "RequestTracker";
                int n7 = 2;
                Log.isLoggable((String)object4, (int)n7);
                object = ((iK2)object).b;
                ((HashSet)object).add(object3);
            }
            return;
        }
    }

    public final void Q(ImageView object) {
        Class clazz;
        Object object2;
        block14: {
            Object object3;
            block13: {
                int n3;
                block12: {
                    block11: {
                        block10: {
                            dz3.a();
                            dV0.b(object);
                            Object object4 = this.a;
                            n3 = 2048;
                            object4 = uw_0.q(object4, n3);
                            if (object4 != 0 || (object4 = (Object)this.n) == 0 || (object2 = object.getScaleType()) == null) break block10;
                            object2 = RJ2$a.a;
                            object3 = object.getScaleType();
                            n3 = ((Enum)object3).ordinal();
                            object4 = object2[n3];
                            switch (object4) {
                                default: {
                                    break;
                                }
                                case 6: {
                                    object2 = this.g().t();
                                    break block11;
                                }
                                case 3: 
                                case 4: 
                                case 5: {
                                    object2 = this.g().u();
                                    break block11;
                                }
                                case 2: {
                                    object2 = this.g().t();
                                    break block11;
                                }
                                case 1: {
                                    object2 = this.g().s();
                                    break block11;
                                }
                            }
                        }
                        object2 = this;
                    }
                    this.D.c.getClass();
                    object3 = Bitmap.class;
                    clazz = this.C;
                    n3 = (int)(object3.equals(clazz) ? 1 : 0);
                    if (n3 == 0) break block12;
                    object3 = new md3_1((View)object);
                    break block13;
                }
                object3 = Drawable.class;
                n3 = (int)(((Class)object3).isAssignableFrom(clazz) ? 1 : 0);
                if (n3 == 0) break block14;
                object3 = new md3_1((View)object);
            }
            object = iE0.a;
            this.P((ki3_1)object3, null, (uw_0)object2, (Executor)object);
            return;
        }
        object2 = new StringBuilder("Unhandled class: ");
        ((StringBuilder)object2).append(clazz);
        ((StringBuilder)object2).append(", try .as*(Class).transcode(ResourceTranscoder)");
        object2 = ((StringBuilder)object2).toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public rj2_0 R(ck2_0 ck2_02) {
        boolean bl2 = this.v;
        if (bl2) {
            return this.O().R(ck2_02);
        }
        this.G = null;
        return this.L(ck2_02);
    }

    public rj2_0 S(File file) {
        return this.W(file);
    }

    public rj2_0 T(Integer object) {
        object = this.W(object);
        Context context = this.A;
        Object object2 = context.getTheme();
        object = (rj2_0)((uw_0)object).F((Resources.Theme)object2);
        object2 = lp.a;
        ConcurrentHashMap concurrentHashMap = lp.a;
        object2 = context.getPackageName();
        Object object3 = (qn1_0)concurrentHashMap.get(object2);
        if (object3 == null) {
            int n3;
            object3 = context.getPackageManager();
            Object object4 = context.getPackageName();
            try {
                object3 = object3.getPackageInfo((String)object4, 0);
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                context.getPackageName();
                n3 = 0;
                object3 = null;
            }
            if (object3 != null) {
                n3 = ((PackageInfo)object3).versionCode;
                object3 = String.valueOf(n3);
            } else {
                object3 = UUID.randomUUID().toString();
            }
            object4 = new k62(object3);
            object2 = concurrentHashMap.putIfAbsent(object2, object4);
            object3 = object2;
            object3 = (qn1_0)object2;
            if (object3 == null) {
                object3 = object4;
            }
        }
        int n4 = context.getResources().getConfiguration().uiMode & 0x30;
        object2 = new Oi(n4, (qn1_0)object3);
        return (rj2_0)((uw_0)object).D((qn1_0)object2);
    }

    public rj2_0 U(Object object) {
        return this.W(object);
    }

    public rj2_0 V(String string2) {
        return this.W(string2);
    }

    public final rj2_0 W(Object object) {
        boolean bl2 = this.v;
        if (bl2) {
            return this.O().W(object);
        }
        this.F = object;
        this.K = true;
        this.B();
        return this;
    }

    public rj2_0 X(Jr3 jr3) {
        boolean bl2 = this.v;
        if (bl2) {
            return this.O().X(jr3);
        }
        this.E = jr3;
        this.J = false;
        this.B();
        return this;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3;
        Object object2;
        Object object3;
        boolean bl4 = object instanceof rj2_0;
        boolean bl5 = false;
        if (bl4 && (bl4 = super.equals(object = (rj2_0)object)) && (bl4 = Objects.equals(object3 = this.C, object2 = ((rj2_0)object).C)) && (bl4 = ((Jr3)(object2 = this.E)).equals(object3 = ((rj2_0)object).E)) && (bl4 = Objects.equals(object2 = this.F, object3 = ((rj2_0)object).F)) && (bl4 = Objects.equals(object2 = this.G, object3 = ((rj2_0)object).G)) && (bl4 = Objects.equals(object2 = this.H, object3 = ((rj2_0)object).H)) && (bl4 = Objects.equals(object2 = this.I, object3 = ((rj2_0)object).I)) && (bl4 = this.J) == (bl3 = ((rj2_0)object).J) && (bl4 = this.K) == (bl2 = ((rj2_0)object).K)) {
            bl5 = true;
        }
        return bl5;
    }

    public final int hashCode() {
        int n3 = super.hashCode();
        Object object = this.C;
        n3 = dz3.h(n3, object);
        object = this.E;
        n3 = dz3.h(n3, object);
        object = this.F;
        n3 = dz3.h(n3, object);
        object = this.G;
        n3 = dz3.h(n3, object);
        object = this.H;
        n3 = dz3.h(n3, object);
        object = this.I;
        n3 = dz3.h(dz3.h(n3, object), null);
        n3 = dz3.g((int)(this.J ? 1 : 0), n3);
        return dz3.g((int)(this.K ? 1 : 0), n3);
    }
}

