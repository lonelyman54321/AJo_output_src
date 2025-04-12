/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Pair
 */
import android.content.Context;
import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

public final class SB1
implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ SB1(Context context, String string2, String string3) {
        this.a = context;
        this.b = string2;
        this.c = string3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        block41: {
            block43: {
                block44: {
                    block42: {
                        block48: {
                            block39: {
                                block47: {
                                    block46: {
                                        block38: {
                                            block45: {
                                                var1_1 /* !! */  = this.a;
                                                var2_4 = this.b;
                                                var3_5 = this.c;
                                                var4_6 = Yo1.b;
                                                if (var4_6 == null) {
                                                    var5_14 = QU1.class;
                                                    synchronized (var5_14) {
                                                        block37: {
                                                            block36: {
                                                                try {
                                                                    var4_6 = Yo1.b;
                                                                    if (var4_6 != null) break block36;
                                                                    var6_15 = Yo1.a(var1_1 /* !! */ );
                                                                    var7_16 = new Object();
                                                                    Yo1.b = var4_6 = new QU1((NU1)var6_15, (mm0)var7_16);
                                                                }
                                                                catch (Throwable var4_7) {
                                                                    break block37;
                                                                }
                                                            }
                                                            break block45;
                                                        }
                                                        throw var4_7;
                                                    }
                                                }
                                            }
                                            var8_17 = 2;
                                            var9_18 = 1;
                                            var7_16 = null;
                                            if (var3_5 == null || (var10_19 = var4_6.a) == null) break block46;
                                            try {
                                                var10_19 = var10_19.b((String)var2_4);
                                                if (var10_19 == null) lbl-1000:
                                                // 2 sources

                                                {
                                                    while (true) {
                                                        var10_19 = null;
                                                        break block38;
                                                        break;
                                                    }
                                                }
                                                var11_21 = new FileInputStream((File)var10_19);
                                                var12_22 /* !! */  = var10_19.getAbsolutePath();
                                                var14_24 = var12_22 /* !! */ .endsWith(var13_23 = ".zip");
                                                var12_22 /* !! */  = var14_24 != 0 ? pL0.ZIP : ((var14_24 = (var12_22 /* !! */  = var10_19.getAbsolutePath()).endsWith(var13_23 = ".gz")) != 0 ? pL0.GZIP : pL0.JSON);
                                                var10_19.getAbsolutePath();
                                            }
                                            catch (FileNotFoundException v0) {
                                                ** continue;
                                            }
                                            rx1.a();
                                            var10_19 = new Pair(var12_22 /* !! */ , var11_21);
                                        }
                                        if (var10_19 != null) break block47;
                                    }
lbl45:
                                    // 2 sources

                                    while (true) {
                                        var10_19 = null;
                                        break block39;
                                        break;
                                    }
                                }
                                var11_21 = (pL0)var10_19.first;
                                var10_19 = (InputStream)var10_19.second;
                                var12_22 /* !! */  = QU1$a.a;
                                var15_25 /* !! */  = var11_21.ordinal();
                                if ((var15_25 /* !! */  = (int)var12_22 /* !! */ [var15_25 /* !! */ ]) != var9_18) {
                                    if (var15_25 /* !! */  != var8_17) {
                                        var10_19 = cc1_0.e((InputStream)var10_19, var3_5);
                                    } else {
                                        try {
                                            var11_21 = new GZIPInputStream((InputStream)var10_19);
                                            var10_19 = cc1_0.e((InputStream)var11_21, var3_5);
                                        }
                                        catch (IOException var10_20) {
                                            var10_19 = var11_21 = new HC1(var10_20);
                                        }
                                    }
                                } else {
                                    var11_21 = new ZipInputStream((InputStream)var10_19);
                                    var10_19 = cc1_0.i(var1_1 /* !! */ , (ZipInputStream)var11_21, var3_5);
                                }
                                ** while ((var10_19 = var10_19.a) == null)
lbl68:
                                // 1 sources

                                var10_19 = (QB1)var10_19;
                            }
                            if (var10_19 == null) break block48;
                            var4_6 = new HC1((QB1)var10_19);
                            break block43;
                        }
                        rx1.a();
                        var10_19 = "LottieFetchResult close failed ";
                        rx1.a();
                        try {
                            var11_21 = var4_6.b;
                            var11_21.getClass();
                            var11_21 = mm0.d((String)var2_4);
                            var7_16 = var11_21.a;
                            var14_24 = 0;
                            var12_22 /* !! */  = null;
                        }
                        catch (Throwable var4_10) {
                            break block41;
                        }
                        catch (Exception var4_11) {
                            // empty catch block
                            ** GOTO lbl-1000
                        }
                        try {
                            var16_26 = var7_16.getResponseCode();
                            if ((var16_26 /= 100) != var8_17) {
                                var9_18 = 0;
                                var6_15 = null;
                            }
                            var14_24 = var9_18;
                            break block42;
                        }
                        catch (IOException v1) {
                            break block42;
                        }
lbl100:
                        // 1 sources

                        while (true) {
                            var7_16 = var11_21;
                            ** GOTO lbl-1000
                            break;
                        }
                        catch (Throwable var4_8) {
                        }
                        catch (Exception var4_9) {
                            ** continue;
                        }
                        var7_16 = var11_21;
                        break block41;
                    }
                    if (var14_24 == 0) ** GOTO lbl-1000
                    {
                        var5_14 = var7_16.getInputStream();
                        var6_15 = var7_16.getContentType();
                        var7_16 = var3_5;
                        var4_6 = var4_6.a(var1_1 /* !! */ , (String)var2_4, (InputStream)var5_14, (String)var6_15, var3_5);
                        var1_1 /* !! */  = var4_6.a;
                        rx1.a();
                    }
                    {
                        var11_21.close();
                    }
lbl-1000:
                    // 1 sources

                    {
                        var2_4 = var11_21.a();
                        var1_1 /* !! */  = new IllegalArgumentException((String)var2_4);
                        var4_6 = new HC1((Throwable)var1_1 /* !! */ );
                    }
                    {
                        var11_21.close();
                        break block43;
                    }
lbl-1000:
                    // 2 sources

                    {
                        var1_1 /* !! */  = new HC1((Throwable)var4_6);
                        if (var7_16 == null) break block44;
                    }
                    try {
                        var7_16.close();
                    }
                    catch (IOException var4_12) {
                        rx1.c((String)var10_19, var4_12);
                    }
                }
                var4_6 = var1_1 /* !! */ ;
            }
            if (var3_5 == null) return var4_6;
            var1_1 /* !! */  = var4_6.a;
            if (var1_1 /* !! */  == null) return var4_6;
            var2_4 = RB1.b;
            var1_1 /* !! */  = (QB1)var1_1 /* !! */ ;
            var2_4 = var2_4.a;
            var2_4.put(var3_5, var1_1 /* !! */ );
            return var4_6;
        }
        if (var7_16 == null) throw var4_13;
        try {
            var7_16.close();
            throw var4_13;
        }
        catch (IOException var1_3) {
            rx1.c((String)var10_19, var1_3);
        }
        throw var4_13;
    }
}

