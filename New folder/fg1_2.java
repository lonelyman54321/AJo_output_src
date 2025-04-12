/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fg1
 */
public final class fg1_2
implements Runnable {
    public final /* synthetic */ hg1_2 a;
    public final /* synthetic */ ng1$b b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ fg1_2(hg1_2 hg1_22, ng1$b ng1$b, Runnable runnable2) {
        this.a = hg1_22;
        this.b = ng1$b;
        this.c = runnable2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        var1_1 = 2;
        var2_2 = 1;
        var3_3 = this.a;
        var4_4 /* !! */  = this.b;
        var5_6 = this.c;
        var6_7 = hg1_2.class;
        var7_8 = td0.b(var6_7);
        if (var7_8) {
            return;
        }
        var8_9 = "this$0";
        Intrinsics.checkNotNullParameter(var3_3, (String)var8_9);
        var8_9 = "$productType";
        Intrinsics.checkNotNullParameter((Object)var4_4 /* !! */ , (String)var8_9);
        var8_9 = "$completionHandler";
        Intrinsics.checkNotNullParameter(var5_6, (String)var8_9);
        var8_9 = var3_3.o;
        var8_9 = var8_9.getClassLoader();
        var9_10 = var3_3.o;
        var10_11 /* !! */  = new Class[var2_2];
        var10_11 /* !! */ [0] = var9_10;
        var11_13 /* !! */  = new Object[var1_1];
        var11_13 /* !! */ [0] = var4_4 /* !! */ ;
        var11_13 /* !! */ [var2_2] = var5_6;
        var9_10 = new hg1$b(var3_3, var11_13 /* !! */ );
        var5_6 = Proxy.newProxyInstance((ClassLoader)var8_9, var10_11 /* !! */ , (InvocationHandler)var9_10);
        var8_9 = var3_3.b;
        var9_10 = var3_3.q;
        var12_14 = td0.b(var3_3);
        var11_13 /* !! */  = null;
        if (var12_14) ** GOTO lbl38
        try {
            var10_11 /* !! */  = var3_3.a;
            ** GOTO lbl40
        }
        catch (Throwable var10_12) {
            td0.a(var3_3, var10_12);
lbl38:
            // 2 sources

            var12_14 = false;
            var10_11 /* !! */  = null;
lbl40:
            // 2 sources

            var13_15 = var3_3.k;
            var14_16 = td0.b(var3_3);
            if (var14_16) ** GOTO lbl60
            try {
                var15_17 = var3_3.i;
                var16_18 = var3_3.r;
                var17_19 = new Object[]{};
                var15_17 = ng1_1.d((Class)var15_17, null, (Method)var16_18, var17_19);
                var16_18 = var3_3.t;
                var4_4 /* !! */  = var4_4 /* !! */ .getType();
                var17_19 = new Object[var2_2];
                var17_19[0] = var4_4 /* !! */ ;
                var4_4 /* !! */  = ng1_1.d(var13_15, var15_17, (Method)var16_18, var17_19);
                var15_17 = var3_3.s;
                var16_18 = new Object[]{};
                var11_13 /* !! */  = ng1_1.d(var13_15, (Object)var4_4 /* !! */ , (Method)var15_17, var16_18);
                ** GOTO lbl60
            }
            catch (Throwable var4_5) {
                try {
                    td0.a(var3_3, var4_5);
lbl60:
                    // 3 sources

                    var18_20 = new Object[var1_1];
                    var18_20[0] = var11_13 /* !! */ ;
                    var18_20[var2_2] = var5_6;
                    ng1_1.d((Class)var8_9, var10_11 /* !! */ , (Method)var9_10, var18_20);
                    return;
                }
                catch (Throwable var18_21) {
                    td0.a(var6_7, var18_21);
                }
            }
        }
    }
}

