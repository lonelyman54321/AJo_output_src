/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.Spatializer
 */
import android.media.Spatializer;
import androidx.media3.common.d;
import com.google.common.base.Predicate;

/*
 * Renamed from yn0
 */
public final class yn0_0
implements Predicate {
    public final /* synthetic */ zn0 a;

    public /* synthetic */ yn0_0(zn0 zn02) {
        this.a = zn02;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean apply(Object var1_1) {
        var2_3 = false;
        var3_4 = 2;
        var4_5 = -1;
        var5_6 = this.a;
        var1_1 = (d)var1_1;
        var6_7 = var5_6.c;
        synchronized (var6_7) {
            block17: {
                block18: {
                    block16: {
                        try {
                            var7_8 = var5_6.g;
                            var8_9 = var7_8.N;
                            if (var8_9 == 0) return true;
                            var8_9 = var5_6.f;
                            if (var8_9 != 0) return true;
                            var8_9 = var1_1.D;
                            if (var8_9 == var4_5) return true;
                            if (var8_9 <= var3_4) return true;
                            var7_8 = var1_1.o;
                            if (var7_8 != null) break block16;
                        }
                        catch (Throwable var1_2) {
                            break block17;
                        }
lbl22:
                        // 2 sources

                        while (true) {
                            var3_4 = 0;
                            var9_10 = null;
                            break block18;
                            break;
                        }
                    }
                    var10_11 = var7_8.hashCode();
                    switch (var10_11) lbl-1000:
                    // 5 sources

                    {
                        default: {
                            var3_4 = -1;
                            break;
                        }
                        case 1504578661: {
                            var9_10 = "audio/eac3";
                            var3_4 = (int)var7_8.equals(var9_10);
                            if (var3_4 == 0) ** GOTO lbl-1000
                            var3_4 = 3;
                            break;
                        }
                        case 187078297: {
                            var11_12 = "audio/ac4";
                            var8_9 = (int)var7_8.equals(var11_12);
                            if (var8_9 != 0) break;
                            ** GOTO lbl-1000
                        }
                        case 187078296: {
                            var9_10 = "audio/ac3";
                            var3_4 = (int)var7_8.equals(var9_10);
                            if (var3_4 == 0) ** GOTO lbl-1000
                            var3_4 = 1;
                            break;
                        }
                        case -2123537834: {
                            var9_10 = "audio/eac3-joc";
                            var3_4 = (int)var7_8.equals(var9_10);
                            if (var3_4 == 0) ** GOTO lbl-1000
                            var3_4 = 0;
                            var9_10 = null;
                        }
                    }
                    switch (var3_4) {
                        default: {
                            ** continue;
                        }
                        case 0: 
                        case 1: 
                        case 2: 
                        case 3: 
                    }
                    var3_4 = 1;
                }
                var4_5 = 32;
                if (var3_4 != 0) {
                    var3_4 = gz3.a;
                    if (var3_4 < var4_5) return true;
                    var9_10 = var5_6.h;
                    if (var9_10 == null) return true;
                    var3_4 = (int)var9_10.b;
                    if (var3_4 == 0) return true;
                }
                if ((var3_4 = gz3.a) < var4_5) return var2_3;
                var9_10 = var5_6.h;
                if (var9_10 == null) return var2_3;
                var4_5 = (int)var9_10.b;
                if (var4_5 == 0) return var2_3;
                var9_10 = var9_10.a;
                var3_4 = (int)En0.a((Spatializer)var9_10);
                if (var3_4 == 0) return var2_3;
                var9_10 = var5_6.h;
                var9_10 = var9_10.a;
                var3_4 = (int)Fn0.a((Spatializer)var9_10);
                if (var3_4 == 0) return var2_3;
                var9_10 = var5_6.h;
                var12_13 = var5_6.i;
                var13_14 = var9_10.a(var12_13, (d)var1_1);
                if (var13_14 == false) return var2_3;
                return true;
            }
            throw var1_2;
        }
    }
}

