/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;
import com.facebook.appevents.codeless.b;
import com.facebook.appevents.codeless.d$a;
import com.facebook.j;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RW
 */
public final class rw_0
implements d$a {
    public final /* synthetic */ al0_2 a;
    public final /* synthetic */ String b;

    public /* synthetic */ rw_0(al0_2 al0_22, String string2) {
        this.a = al0_22;
        this.b = string2;
    }

    /*
     * Unable to fully structure code
     */
    public final void a() {
        block25: {
            block24: {
                block23: {
                    block22: {
                        block21: {
                            var1_1 = null;
                            var2_4 = this.b;
                            var3_5 = b.class;
                            var4_6 = td0.b(var3_5);
                            if (var4_6) break block25;
                            var5_7 = "$appId";
                            Intrinsics.checkNotNullParameter(var2_4, (String)var5_7);
                            var5_7 = this.a;
                            var6_8 = true;
                            if (var5_7 == null) break block21;
                            var4_6 = var5_7.j;
                            if (!var4_6) break block21;
                            var4_6 = true;
                            break block22;
                        }
                        var4_6 = false;
                        var5_7 = null;
                    }
                    var7_9 = FacebookSdk.a;
                    var7_9 = j.a;
                    var7_9 = j.class;
                    var8_10 = td0.b(var7_9);
                    if (!var8_10) break block23;
lbl29:
                    // 2 sources

                    while (true) {
                        var9_11 = false;
                        var7_9 = null;
                        break block24;
                        break;
                    }
                }
                var10_12 = j.a;
                var10_12.e();
                var10_12 = j.g;
                try {
                    var9_11 = var10_12.a();
                }
                catch (Throwable var10_13) {
                    td0.a(var7_9, var10_13);
                    ** continue;
                }
            }
            if (!var4_6 || !var9_11) break block25;
            var5_7 = com.facebook.appevents.codeless.b.a;
            var5_7.getClass();
            var9_11 = td0.b(var5_7);
            if (var9_11) break block25;
            var9_11 = com.facebook.appevents.codeless.b.h;
            if (var9_11) break block25;
            com.facebook.appevents.codeless.b.h = var6_8;
            var11_14 = FacebookSdk.d();
            var7_9 = new sw_1(var2_4, 0);
            try {
                var11_14.execute((Runnable)var7_9);
            }
            catch (Throwable var1_2) {
                td0.a(var5_7, var1_2);
                {
                    catch (Throwable var1_3) {
                        td0.a(var3_5, var1_3);
                    }
                }
            }
        }
    }
}

