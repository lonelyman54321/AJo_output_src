/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cg1
 */
public final class cg1_1
implements Runnable {
    public final /* synthetic */ eg1_2 a;
    public final /* synthetic */ ng1$b b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ cg1_1(eg1_2 eg1_22, ng1$b ng1$b, Runnable runnable2) {
        this.a = eg1_22;
        this.b = ng1$b;
        this.c = runnable2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        var1_1 = null;
        var2_3 = 1;
        var3_4 = this.a;
        var4_5 = this.b;
        var5_6 = this.c;
        var6_7 = eg1_2.class;
        var7_8 = td0.b(var6_7);
        if (var7_8) {
            return;
        }
        var8_9 = "this$0";
        Intrinsics.checkNotNullParameter(var3_4, (String)var8_9);
        var8_9 = "$productType";
        Intrinsics.checkNotNullParameter(var4_5, (String)var8_9);
        var8_9 = "$completionHandler";
        Intrinsics.checkNotNullParameter(var5_6, (String)var8_9);
        var8_9 = var3_4.f;
        var8_9 = var8_9.getClassLoader();
        var9_10 = var3_4.f;
        var10_11 = new Class[var2_3];
        var10_11[0] = var9_10;
        var9_10 = new eg1$c((eg1_2)var3_4, (ng1$b)var4_5, (Runnable)var5_6);
        var5_6 = Proxy.newProxyInstance((ClassLoader)var8_9, var10_11, (InvocationHandler)var9_10);
        var8_9 = var3_4.b;
        var9_10 = var3_4.j;
        var11_13 = td0.b(var3_4);
        var12_14 = null;
        if (!var11_13) ** GOTO lbl33
        ** GOTO lbl38
        {
            catch (Throwable var1_2) {
                td0.a(var6_7, var1_2);
                return;
            }
lbl33:
            // 1 sources

            try {
                var12_14 = var3_4.a;
                ** GOTO lbl38
            }
            catch (Throwable var10_12) {}
            {
                td0.a(var3_4, var10_12);
lbl38:
                // 3 sources

                var3_4 = var4_5.getType();
                var13_15 = 2;
                var4_5 = new Object[var13_15];
                var4_5[0] = var3_4;
                var4_5[var2_3] = var5_6;
                ng1_1.d((Class)var8_9, var12_14, (Method)var9_10, var4_5);
                return;
            }
        }
    }
}

