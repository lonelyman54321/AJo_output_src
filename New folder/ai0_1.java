/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$c;
import com.facebook.appevents.AppEventsLogger$a;
import com.facebook.appevents.g;
import com.facebook.appevents.g$a;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from AI0
 */
public final class ai0_1
implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;

    public /* synthetic */ ai0_1(Context context, String string2) {
        this.a = context;
        this.b = string2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block10: {
            block9: {
                block11: {
                    var1_1 = 1;
                    var2_2 = false;
                    var3_3 = null;
                    var4_4 = FacebookSdk.a;
                    var4_4 = this.a;
                    Intrinsics.checkNotNullParameter(var4_4, "$applicationContext");
                    var5_5 = this.b;
                    Intrinsics.checkNotNullParameter(var5_5, "$applicationId");
                    var6_6 = FacebookSdk.a;
                    var6_6.getClass();
                    var7_7 = td0.b(var6_6);
                    if (var7_7) break block10;
                    var8_8 = Zq$a.a((Context)var4_4);
                    var9_9 = "com.facebook.sdk.attributionTracking";
                    var9_9 = var4_4.getSharedPreferences(var9_9, 0);
                    var10_10 /* !! */  = new StringBuilder();
                    var10_10 /* !! */ .append(var5_5);
                    var11_11 = "ping";
                    var10_10 /* !! */ .append(var11_11);
                    var10_10 /* !! */  = var10_10 /* !! */ .toString();
                    var12_12 = 0L;
                    var14_13 = var9_9.getLong((String)var10_10 /* !! */ , var12_12);
                    try {
                        var16_14 = eo$a.MOBILE_INSTALL_EVENT;
                        var17_15 = AppEventsLogger$a.a((Context)var4_4);
                        var18_16 = FacebookSdk.g((Context)var4_4);
                        var4_4 = eo.a((eo$a)var16_14, (zq_0)var8_8, var17_15, var18_16, (Context)var4_4);
                        var8_8 = g.c;
                    }
                    catch (JSONException var19_19) {
                        var4_4 = "An error occurred while publishing install.";
                        var3_3 = new RuntimeException((String)var4_4, var19_19);
                        throw var3_3;
                    }
                    var8_8 = g$a.e();
                    if (var8_8 == null) break block11;
                    var16_14 = "install_referrer";
                    var4_4.put((String)var16_14, var8_8);
                    break block11;
                    catch (Throwable var19_17) {
                        break block9;
                    }
                }
                var8_8 = StringCompanionObject.INSTANCE;
                var8_8 = "%s/activities";
                var16_14 = new Object[var1_1];
                var16_14[0] = var5_5;
                var19_18 /* !! */  = Arrays.copyOf(var16_14, var1_1);
                var19_18 /* !! */  = String.format((String)var8_8, var19_18 /* !! */ );
                var3_3 = "format(format, *args)";
                Intrinsics.checkNotNullExpressionValue(var19_18 /* !! */ , (String)var3_3);
                var3_3 = FacebookSdk.u;
                var3_3.getClass();
                var3_3 = GraphRequest.j;
                var2_2 = false;
                var3_3 = null;
                var19_18 /* !! */  = GraphRequest$c.i(null, (String)var19_18 /* !! */ , (JSONObject)var4_4, null);
                var2_2 = var14_13 == var12_12 ? 0 : (var14_13 < var12_12 ? -1 : 1);
                if (!var2_2) {
                    var19_18 /* !! */  = var19_18 /* !! */ .c();
                    var19_18 /* !! */  = var19_18 /* !! */ .c;
                    if (var19_18 /* !! */  == null) {
                        var19_18 /* !! */  = var9_9.edit();
                        var20_21 = System.currentTimeMillis();
                        var19_18 /* !! */ .putLong((String)var10_10 /* !! */ , var20_21);
                        var19_18 /* !! */ .apply();
                        var19_18 /* !! */  = sx1.d;
                        var19_18 /* !! */  = Ax1.APP_EVENTS;
                        var3_3 = FacebookSdk.b;
                        var4_4 = "TAG";
                        Intrinsics.checkNotNullExpressionValue(var3_3, (String)var4_4);
                        var4_4 = "MOBILE_APP_INSTALL has been logged";
                        sx1$a.a((Ax1)var19_18 /* !! */ , (String)var3_3, (String)var4_4);
                    }
                }
                break block10;
lbl80:
                // 1 sources

                while (true) {
                    var19_20 = lz3_0.a;
                    break block10;
                    break;
                }
            }
            td0.a(var6_6, var19_17);
        }
        return;
        {
            catch (Exception v0) {
                ** continue;
            }
        }
    }
}

