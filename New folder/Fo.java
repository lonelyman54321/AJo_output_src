/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.net.Uri
 *  org.json.JSONObject
 */
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class Fo {
    public static final Fo$a b;
    public static volatile Fo c;
    public final hh3_2 a;

    static {
        Fo$a fo$a;
        b = fo$a = new Object();
    }

    public Fo() {
        hh3_2 hh3_22;
        this.a = hh3_22 = yr1_2.b(Fo$b.c);
    }

    public final SharedPreferences a() {
        Object object;
        boolean bl2 = td0.b(this);
        if (bl2) {
            return null;
        }
        try {
            object = this.a;
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return null;
        }
        object = ((hh3_2)object).getValue();
        String string2 = "<get-preferences>(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        return (SharedPreferences)object;
    }

    public final void b(Activity activity) {
        String string2;
        block7: {
            boolean bl2 = td0.b(this);
            if (bl2) {
                return;
            }
            string2 = "activity";
            try {
                Intrinsics.checkNotNullParameter(activity, string2);
                string2 = activity.getIntent();
            }
            catch (Throwable throwable) {
                td0.a(this, throwable);
                return;
            }
            string2 = string2.getData();
            if (string2 != null) break block7;
            return;
        }
        activity = activity.getIntent();
        String string3 = "activity.intent";
        Intrinsics.checkNotNullExpressionValue(activity, string3);
        this.c((Uri)string2, (Intent)activity);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void c(Uri var1_1, Intent var2_5) {
        block28: {
            block27: {
                block25: {
                    var3_6 = "intent";
                    var4_7 = "uri";
                    var5_8 = td0.b(this);
                    if (var5_8) {
                        return;
                    }
                    Intrinsics.checkNotNullParameter(var1_1 /* !! */ , var4_7);
                    Intrinsics.checkNotNullParameter(var2_5, var3_6);
                    var5_8 = td0.b(this);
                    var6_9 = "al_applink_data";
                    var7_10 = null;
                    var8_11 = "campaign_ids";
                    if (!var5_8) break block25;
lbl15:
                    // 3 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                try {
                    Intrinsics.checkNotNullParameter(var1_1 /* !! */ , var4_7);
                }
                catch (Throwable var1_2) {}
                var1_1 /* !! */  = var1_1 /* !! */ .getQueryParameter(var6_9);
                if (var1_1 /* !! */  == null) ** GOTO lbl15
                try {
                    var4_7 = new JSONObject((String)var1_1 /* !! */ );
                    var1_1 /* !! */  = var4_7.getString(var8_11);
                }
                catch (Exception v0) {}
                ** finally { 
lbl30:
                // 2 sources

                td0.a(this, var1_2);
                ** continue;
                {
                    catch (Throwable var1_4) {}
                }
                var9_12 = false;
                var1_1 /* !! */  = null;
                if (var1_1 /* !! */  == null) {
                    block26: {
                        var9_12 = td0.b(this);
                        if (var9_12) break block26;
                        Intrinsics.checkNotNullParameter(var2_5, var3_6);
                        var1_1 /* !! */  = var2_5.getBundleExtra(var6_9);
                        if (var1_1 /* !! */  == null) break block26;
                        try {
                            var7_10 = var1_1 /* !! */ .getString(var8_11);
                        }
                        catch (Throwable var1_3) {
                            td0.a(this, var1_3);
                        }
                    }
                    var1_1 /* !! */  = var7_10;
                }
                if (var1_1 /* !! */  == null) break block27;
                var2_5 = this.a();
                var2_5 = var2_5.edit();
                var1_1 /* !! */  = var2_5.putString(var8_11, (String)var1_1 /* !! */ );
                var1_1 /* !! */ .apply();
                break block28;
            }
            return;
        }
        td0.a(this, var1_4);
    }
}

