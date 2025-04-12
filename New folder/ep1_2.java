/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import com.facebook.FacebookSdk;
import com.ril.ajio.payment.activity.PeWebViewActivity;
import org.json.JSONObject;

/*
 * Renamed from EP1
 */
public final class ep1_2
implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ ep1_2(int n3) {
        this.a = n3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block16: {
            var1_1 = this.a;
            switch (var1_1) {
                default: {
                    var2_2 = PeWebViewActivity.Companion;
                    return;
                }
                case 0: 
            }
            var2_3 = "model_request_timestamp";
            var3_5 = "models";
            var4_6 = hp1_1.class;
            var5_7 = td0.b(var4_6);
            if (var5_7) {
                return;
            }
            var6_8 = FacebookSdk.a();
            var7_9 /* !! */  = "com.facebook.internal.MODEL_STORE";
            var8_11 = 0;
            var9_12 = null;
            var6_8 = var6_8.getSharedPreferences(var7_9 /* !! */ , 0);
            var10_13 = 0;
            var7_9 /* !! */  = null;
            var7_9 /* !! */  = var6_8.getString(var3_5, null);
            if (var7_9 /* !! */  == null || (var8_11 = var7_9 /* !! */ .length()) == 0) ** GOTO lbl26
            var9_12 = new JSONObject(var7_9 /* !! */ );
            ** GOTO lbl27
            {
                catch (Throwable var2_4) {}
lbl26:
                // 1 sources

                var9_12 = new JSONObject();
lbl27:
                // 2 sources

                var11_14 = 0L;
                var13_15 = var6_8.getLong(var2_3, var11_14);
                var7_9 /* !! */  = kJ0$b.ModelRequest;
                var10_13 = kj0_0.b((kJ0$b)var7_9 /* !! */ );
                var15_16 = hp1_1.a;
                if (var10_13 != 0 && (var10_13 = var9_12.length()) != 0) {
                    var15_16.getClass();
                    var10_13 = (int)td0.b(var15_16);
                    if (var10_13 == 0 && (var10_13 = (int)(var13_15 == var11_14 ? 0 : (var13_15 < var11_14 ? -1 : 1))) != 0) {
                        try {
                            var11_14 = System.currentTimeMillis() - var13_15;
                            var13_15 = 259200000L;
                        }
                        catch (Throwable var7_10) {}
                        ** try [egrp 2[TRYBLOCK] [30, 29 : 262->345)] { 
lbl43:
                        // 1 sources

                        td0.a(var15_16, var7_10);
                    }
                }
lbl44:
                // 6 sources

                while (true) {
                    var9_12 = var15_16.c();
                    if (var9_12 == null) {
                        return;
                    }
                    var6_8 = var6_8.edit();
                    var7_9 /* !! */  = var9_12.toString();
                    var3_5 = var6_8.putString(var3_5, var7_9 /* !! */ );
                    var16_17 = System.currentTimeMillis();
                    var2_3 = var3_5.putLong(var2_3, var16_17);
                    var2_3.apply();
lbl54:
                    // 2 sources

                    while (true) {
                        var15_16.a(var9_12);
                        var15_16.b();
                        return;
                    }
                    break;
                }
lbl58:
                // 2 sources

                catch (Exception v0) {}
lbl59:
                // 1 sources

                finally {
                    break block16;
                }
            }
            ** while ((var10_13 = (int)(var11_14 == var13_15 ? 0 : (var11_14 < var13_15 ? -1 : 1))) >= 0)
lbl62:
            // 1 sources

            ** while (true)
        }
        td0.a(var4_6, var2_4);
    }
}

