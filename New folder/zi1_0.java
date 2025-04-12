/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.facebook.FacebookSdk;
import com.facebook.appevents.g$a$a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from zi1
 */
public final class zi1_0
implements InstallReferrerStateListener {
    public final /* synthetic */ InstallReferrerClient a;
    public final /* synthetic */ yi1 b;

    public zi1_0(InstallReferrerClient installReferrerClient, g$a$a g$a$a) {
        this.a = installReferrerClient;
        this.b = g$a$a;
    }

    public final void onInstallReferrerServiceDisconnected() {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onInstallReferrerSetupFinished(int var1_1) {
        block9: {
            block7: {
                block8: {
                    var2_2 = td0.b(this);
                    if (var2_2) {
                        return;
                    }
                    var2_2 = true;
                    var3_3 = "is_referrer_updated";
                    var4_4 = "com.facebook.sdk.appEventPreferences";
                    var5_5 = this.a;
                    if (var1_1 == 0) ** GOTO lbl18
                    var6_6 = 2;
                    if (var1_1 != var6_6) break block7;
                    try {
                        var7_8 = FacebookSdk.a();
                        var7_8 = var7_8.getSharedPreferences(var4_4, 0);
                        var7_8 = var7_8.edit();
                        var7_8 = var7_8.putBoolean(var3_3, var2_2);
                        var7_8.apply();
                        break block7;
lbl18:
                        // 1 sources

                        try {
                            var7_9 = var5_5.getInstallReferrer();
                            var8_11 = "{\n                      \u2026rer\n                    }";
                            Intrinsics.checkNotNullExpressionValue(var7_9, (String)var8_11);
                            var7_9 = var7_9.getInstallReferrer();
                            if (var7_9 == null) break block8;
                        }
                        catch (RemoteException v0) {
                            return;
                        }
                        var8_11 = "fb";
                        var6_7 = StringsKt.F((CharSequence)var7_9, (CharSequence)var8_11, false);
                        if (!var6_7 && !(var6_7 = StringsKt.F((CharSequence)var7_9, (CharSequence)(var8_11 = "facebook"), false))) break block8;
                    }
                    catch (Throwable var7_10) {
                        break block9;
                    }
                    var8_11 = this.b;
                    var8_11.a((String)var7_9);
                }
                var7_9 = FacebookSdk.a();
                var7_9 = var7_9.getSharedPreferences(var4_4, 0);
                var7_9 = var7_9.edit();
                var7_9 = var7_9.putBoolean(var3_3, var2_2);
                var7_9.apply();
            }
            try {
                var5_5.endConnection();
                return;
            }
            catch (Exception v1) {
                return;
            }
        }
        td0.a(this, var7_10);
    }
}

