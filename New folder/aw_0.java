/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.Toast
 */
import android.content.Context;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aw
 */
public final class aw_0
implements OnCompleteListener {
    public final /* synthetic */ cw a;
    public final /* synthetic */ E40 b;

    public /* synthetic */ aw_0(ao0_0 ao0_02, E40 e40) {
        this.a = ao0_02;
        this.b = e40;
    }

    /*
     * Unable to fully structure code
     */
    public final void onComplete(Task var1_1) {
        block6: {
            block4: {
                block8: {
                    block7: {
                        block5: {
                            var2_2 = this.a;
                            Intrinsics.checkNotNullParameter(var2_2, "this$0");
                            var3_3 = this.b;
                            Intrinsics.checkNotNullParameter(var3_3, "$configResultListener");
                            var4_4 = "task";
                            Intrinsics.checkNotNullParameter(var1_1, (String)var4_4);
                            var5_5 = var1_1.isSuccessful();
                            if (!var5_5) break block5;
                            var1_1 = var2_2.c().activate();
                            var2_2 = new bw(var3_3);
                            var1_1.addOnCompleteListener((OnCompleteListener)var2_2);
                            break block6;
                        }
                        var1_1 = var1_1.getException();
                        var2_2.getClass();
                        var4_4 = "Unknown exception";
                        var6_6 = "create(...)";
                        if (var1_1 != null) break block7;
                        var7_7 = "exception null";
                        var1_1 = new lm2(var4_4, var7_7);
                        Intrinsics.checkNotNullExpressionValue(var1_1, (String)var6_6);
                        break block4;
                    }
                    var8_8 = var1_1 instanceof FirebaseRemoteConfigFetchThrottledException;
                    if (var8_8 != 0) {
                        var1_1 = ((FirebaseRemoteConfigFetchThrottledException)var1_1).getMessage();
                        var7_7 = "FirebaseRemoteConfigFetchThrottledException";
                        var4_4 = new lm2(var7_7, var1_1);
                        Intrinsics.checkNotNullExpressionValue(var4_4, (String)var6_6);
lbl32:
                        // 3 sources

                        while (true) {
                            var1_1 = var4_4;
                            break block4;
                            break;
                        }
                    }
                    var8_8 = var1_1 instanceof FirebaseRemoteConfigException;
                    if (var8_8 == 0) break block8;
                    var1_1 = ((FirebaseRemoteConfigException)var1_1).getMessage();
                    var7_7 = "FirebaseRemoteConfigException";
                    var4_4 = new lm2(var7_7, var1_1);
                    Intrinsics.checkNotNullExpressionValue(var4_4, (String)var6_6);
                    ** GOTO lbl32
                }
                var8_8 = var1_1 instanceof FirebaseTooManyRequestsException;
                if (var8_8 != 0) {
                    var1_1 = ((FirebaseTooManyRequestsException)var1_1).getMessage();
                    var6_6 = "FirebaseTooManyRequestsException";
                    var4_4 = new lm2(var6_6, var1_1);
                    Intrinsics.checkNotNull(var4_4);
                    ** continue;
                }
                var1_1 = var1_1.getMessage();
                var7_7 = new lm2(var4_4, var1_1);
                Intrinsics.checkNotNullExpressionValue(var7_7, (String)var6_6);
                var1_1 = var7_7;
            }
            var4_4 = var1_1.a;
            Intrinsics.checkNotNull(var4_4);
            var1_1 = var1_1.b;
            Intrinsics.checkNotNull(var1_1);
            var6_6 = new StringBuilder("Remote Config fetched failureException Type ");
            var6_6.append(var4_4);
            var6_6.append(" Message: ");
            var6_6.append(var1_1);
            var6_6 = var6_6.toString();
            var7_7 = yn3_0.a;
            var7_7.l("FirebaseRemoteConfig");
            var9_9 = new Exception((String)var6_6);
            var7_7.e((Throwable)var9_9);
            var7_7 = "prod";
            var9_9 = "qa";
            if (var7_7 == var9_9) {
                var2_2 = var2_2.a;
                var8_8 = 1;
                var2_2 = Toast.makeText((Context)var2_2, (CharSequence)var6_6, (int)var8_8);
                var2_2.show();
            }
            Intrinsics.checkNotNull(var4_4);
            var4_4 = (String)var4_4;
            Intrinsics.checkNotNull(var1_1);
            var1_1 = (String)var1_1;
            var3_3.c((String)var4_4, (String)var1_1);
        }
    }
}

