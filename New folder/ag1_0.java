/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.facebook.FacebookSdk;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from ag1
 */
public final class ag1_0 {
    public static final ag1_0 a;
    public static final AtomicBoolean b;

    static {
        Object object = new ag1_0();
        a = object;
        b = object = new AtomicBoolean(false);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b(ng1$a var0, Context var1_2) {
        var2_3 = ag1_0.class;
        synchronized (var2_3) {
            block15: {
                block16: {
                    var3_4 /* !! */  = ag1_0.class;
                    var4_5 = td0.b(var3_4 /* !! */ );
                    if (var4_5) {
                        return;
                    }
                    var3_4 /* !! */  = "context";
                    try {
                        Intrinsics.checkNotNullParameter(var1_2 /* !! */ , (String)var3_4 /* !! */ );
                        var3_4 /* !! */  = "billingClientVersion";
                        Intrinsics.checkNotNullParameter((Object)var0, (String)var3_4 /* !! */ );
                        var3_4 /* !! */  = ag1_0.b;
                        var5_6 = var3_4 /* !! */ .get();
                        if (var5_6) {
                        }
                        ** GOTO lbl-1000
                    }
                    catch (Throwable var0_1) {
                        break block15;
                    }
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var6_7 /* !! */  = new Ref$ObjectRef();
                        var7_8 /* !! */  = ng1$a.V2_V4;
                        if (var0 != var7_8 /* !! */ ) break block16;
                    }
                    var7_8 /* !! */  = eg1_2.l;
                    var7_8 /* !! */  = var7_8 /* !! */ .c(var1_2 /* !! */ );
                    var6_7 /* !! */ .element = var7_8 /* !! */ ;
                    ** GOTO lbl33
                }
                var7_8 /* !! */  = ng1$a.V5_V7;
                if (var0 != var7_8 /* !! */ ) ** GOTO lbl33
                {
                    var7_8 /* !! */  = hg1_2.G;
                    var7_8 /* !! */  = var7_8 /* !! */ .b(var1_2 /* !! */ );
                    var6_7 /* !! */ .element = var7_8 /* !! */ ;
lbl33:
                    // 3 sources

                    var7_8 /* !! */  = var6_7 /* !! */ .element;
                    if (var7_8 /* !! */  == null) {
                        var8_10 = true;
                        var3_4 /* !! */ .set(var8_10);
                        return;
                    }
                    var3_4 /* !! */  = kJ0$b.AndroidIAPSubscriptionAutoLogging;
                    var4_5 = kj0_0.b((kJ0$b)var3_4 /* !! */ );
                    if (!var4_5) ** GOTO lbl59
                    var3_4 /* !! */  = EB2.a;
                    var3_4 /* !! */  = EB2.class;
                    var9_11 = td0.b(var3_4 /* !! */ );
                    var10_12 = false;
                    var11_13 = null;
                    if (!var9_11) {
                        try {
                            var10_12 = EB2.b;
                        }
                        catch (Throwable var7_9) {
                            td0.a(var3_4 /* !! */ , var7_9);
                        }
                    }
                    if (var10_12 && var0 != (var3_4 /* !! */  = ng1$a.V2_V4)) ** GOTO lbl59
                }
                {
                    block17: {
                        var3_4 /* !! */  = var6_7 /* !! */ .element;
                        var3_4 /* !! */  = (bg1_0)var3_4 /* !! */ ;
                        var7_8 /* !! */  = ng1$b.INAPP;
                        var11_13 = new xf1_0(var6_7 /* !! */ , var0, var1_2 /* !! */ );
                        var3_4 /* !! */ .a((ng1$b)var7_8 /* !! */ , var11_13);
                        break block17;
lbl59:
                        // 2 sources

                        var3_4 /* !! */  = var6_7 /* !! */ .element;
                        var3_4 /* !! */  = (bg1_0)var3_4 /* !! */ ;
                        var6_7 /* !! */  = ng1$b.INAPP;
                        var7_8 /* !! */  = new yf1_1(var0, var1_2 /* !! */ );
                        var3_4 /* !! */ .a((ng1$b)var6_7 /* !! */ , (Runnable)var7_8 /* !! */ );
                    }
                    return;
                }
            }
            var1_2 /* !! */  = ag1_0.class;
            td0.a(var1_2 /* !! */ , var0_1);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(ng1$a var1_1, String var2_5) {
        block31: {
            block33: {
                var3_6 = hg1_2.class;
                var4_7 = td0.b(this);
                if (var4_7) {
                    return;
                }
                var5_8 /* !! */  = kg1_1.a;
                var5_8 /* !! */  = kg1_1.class;
                var6_13 = td0.b(var5_8 /* !! */ );
                var7_14 = false;
                if (!var6_13) ** GOTO lbl14
                ** GOTO lbl24
                {
                    block32: {
                        catch (Throwable var1_2) {
                            break block31;
                        }
lbl14:
                        // 1 sources

                        try {
                            var8_15 /* !! */  = FacebookSdk.a();
                            var9_17 = "com.facebook.internal.iap.IAP_CACHE_GPBLV2V7";
                            var8_15 /* !! */  = var8_15 /* !! */ .getSharedPreferences((String)var9_17, 0);
                            var9_17 = "APP_HAS_BEEN_LAUNCHED_KEY";
                            var4_7 = var8_15 /* !! */ .contains((String)var9_17);
                            var7_14 = var4_7 ^ true;
                            break block32;
                        }
                        catch (Throwable var8_16) {}
                        td0.a(var5_8 /* !! */ , var8_16);
                    }
                    if (!var7_14) break block33;
                    kg1_1.e();
                }
            }
            if (var1_1 != (var5_8 /* !! */  = ng1$a.V2_V4)) ** GOTO lbl43
            {
                block39: {
                    block38: {
                        block37: {
                            block36: {
                                block35: {
                                    block34: {
                                        var3_6 = eg1_2.l;
                                        var9_17 = eg1$b.b();
                                        var10_18 = eg1$b.d();
                                        var11_20 = false;
                                        kg1_1.d((ConcurrentHashMap)var9_17, var10_18, false, var2_5, (ng1$a)var1_1, var7_14);
                                        var9_17 = eg1$b.e();
                                        var10_18 = eg1$b.d();
                                        var11_20 = true;
                                        kg1_1.d((ConcurrentHashMap)var9_17, var10_18, var11_20, var2_5, (ng1$a)var1_1, var7_14);
                                        var1_1 = eg1$b.b();
                                        var1_1.clear();
                                        var1_1 = eg1$b.e();
                                        var1_1.clear();
                                        break block39;
lbl43:
                                        // 1 sources

                                        var5_8 /* !! */  = hg1_2.G;
                                        var4_7 = td0.b(var3_6);
                                        var6_13 = false;
                                        var8_15 /* !! */  = null;
                                        if (var4_7) lbl-1000:
                                        // 2 sources

                                        {
                                            while (true) {
                                                var9_17 = null;
                                                break block34;
                                                break;
                                            }
                                        }
                                        try {
                                            var9_17 = var5_8 /* !! */  = hg1_2.J;
                                        }
                                        catch (Throwable var5_9) {
                                            td0.a(var3_6, var5_9);
                                            ** continue;
                                        }
                                    }
                                    var4_7 = td0.b(var3_6);
                                    if (var4_7) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            var10_19 /* !! */  = null;
                                            break block35;
                                            break;
                                        }
                                    }
                                    try {
                                        var10_19 /* !! */  = var5_8 /* !! */  = hg1_2.L;
                                    }
                                    catch (Throwable var5_10) {
                                        td0.a(var3_6, var5_10);
                                        ** continue;
                                    }
                                }
                                var11_21 = false;
                                kg1_1.d((ConcurrentHashMap)var9_17, (ConcurrentHashMap)var10_19 /* !! */ , false, var2_5, (ng1$a)var1_1, var7_14);
                                var4_7 = td0.b(var3_6);
                                if (var4_7) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        var9_17 = null;
                                        break block36;
                                        break;
                                    }
                                }
                                try {
                                    var9_17 = var5_8 /* !! */  = hg1_2.K;
                                }
                                catch (Throwable var5_11) {
                                    td0.a(var3_6, var5_11);
                                    ** continue;
                                }
                            }
                            var4_7 = td0.b(var3_6);
                            if (var4_7) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    var10_19 /* !! */  = null;
                                    break block37;
                                    break;
                                }
                            }
                            try {
                                var10_19 /* !! */  = var5_8 /* !! */  = hg1_2.L;
                            }
                            catch (Throwable var5_12) {
                                td0.a(var3_6, var5_12);
                                ** continue;
                            }
                        }
                        var11_21 = true;
                        kg1_1.d((ConcurrentHashMap)var9_17, (ConcurrentHashMap)var10_19 /* !! */ , var11_21, var2_5, (ng1$a)var1_1, var7_14);
                        var12_22 = td0.b(var3_6);
                        if (var12_22) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var12_22 = false;
                                var1_1 = null;
                                break block38;
                                break;
                            }
                        }
                        try {
                            var1_1 = hg1_2.J;
                        }
                        catch (Throwable var1_3) {
                            td0.a(var3_6, var1_3);
                            ** continue;
                        }
                    }
                    var1_1.clear();
                    var12_22 = td0.b(var3_6);
                    if (!var12_22) {
                        try {
                            var8_15 /* !! */  = hg1_2.K;
                        }
                        catch (Throwable var1_4) {
                            td0.a(var3_6, var1_4);
                        }
                    }
                    var8_15 /* !! */ .clear();
                }
                if (var7_14) {
                    kg1_1.f();
                }
                return;
            }
        }
        td0.a(this, var1_2);
    }
}

