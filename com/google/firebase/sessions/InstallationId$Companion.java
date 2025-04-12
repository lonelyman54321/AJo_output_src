/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.sessions.InstallationId;
import com.google.firebase.sessions.InstallationId$Companion$create$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class InstallationId$Companion {
    private InstallationId$Companion() {
    }

    public /* synthetic */ InstallationId$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /*
     * Unable to fully structure code
     */
    public final Object create(FirebaseInstallationsApi var1_1, f80_0 var2_2) {
        block24: {
            block25: {
                var3_3 = var2_2 instanceof InstallationId$Companion$create$1;
                if (!var3_3) ** GOTO lbl-1000
                var4_4 = var2_2;
                var4_4 = (InstallationId$Companion$create$1)var2_2;
                var5_5 = var4_4.label;
                var6_6 = -1 << -1;
                var7_7 = var5_5 & var6_6;
                if (var7_7 != 0) {
                    var4_4.label = var5_5 -= var6_6;
                } else lbl-1000:
                // 2 sources

                {
                    var4_4 = new InstallationId$Companion$create$1(this, (f80_0)var2_2);
                }
                var2_2 = var4_4.result;
                var8_8 = j90_0.COROUTINE_SUSPENDED;
                var6_6 = var4_4.label;
                var9_9 = "";
                var10_10 = 2;
                var11_11 = 1;
                if (var6_6 != 0) {
                    if (var6_6 != var11_11) {
                        if (var6_6 == var10_10) {
                            var1_1 = (String)var4_4.L$0;
                            vl2_2.b(var2_2);
                            break block24;
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var1_1 = (FirebaseInstallationsApi)var4_4.L$0;
                    vl2_2.b(var2_2);
                    break block25;
                }
                vl2_2.b(var2_2);
                var2_2 = null;
                var2_2 = var1_1.getToken(false);
                var12_12 = "firebaseInstallations.getToken(false)";
                Intrinsics.checkNotNullExpressionValue(var2_2, var12_12);
                var4_4.L$0 = var1_1;
                var4_4.label = var11_11;
                var2_2 = wi3_2.b((Task)var2_2, (f80_0)var4_4);
                if (var2_2 != var8_8) break block25;
                return var8_8;
            }
            var2_2 = (InstallationTokenResult)var2_2;
            var2_2 = var2_2.getToken();
            var12_12 = "{\n          firebaseInst\u2026).await().token\n        }";
            try {
                Intrinsics.checkNotNullExpressionValue(var2_2, var12_12);
                var13_13 = var2_2;
                var2_2 = var1_1;
                var1_1 = var13_13;
            }
            catch (Exception v0) {
                var2_2 = var1_1;
                var1_1 = var9_9;
            }
            try {
                var2_2 = var2_2.getId();
                var12_12 = "firebaseInstallations.id";
            }
            catch (Exception v1) {
                ** continue;
            }
            Intrinsics.checkNotNullExpressionValue(var2_2, var12_12);
            var4_4.L$0 = var1_1;
            var4_4.label = var10_10;
            var2_2 = wi3_2.b((Task)var2_2, (f80_0)var4_4);
            if (var2_2 != var8_8) break block24;
            return var8_8;
        }
        var4_4 = "{\n          firebaseInst\u2026ions.id.await()\n        }";
        Intrinsics.checkNotNullExpressionValue(var2_2, (String)var4_4);
        var9_9 = var2_2 = (String)var2_2;
lbl81:
        // 2 sources

        while (true) {
            var2_2 = new InstallationId((String)var9_9, (String)var1_1, null);
            return var2_2;
        }
    }
}

