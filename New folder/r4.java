/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$string;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import kotlin.jvm.internal.Intrinsics;

public final class r4
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ r4(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void run() {
        var1_1 = this.a;
        switch (var1_1) {
            default: {
                var2_2 /* !! */  = (ry1_1)this.b;
                Intrinsics.checkNotNullParameter(var2_2 /* !! */ , "this$0");
                var3_4 /* !! */  = var2_2 /* !! */ .r;
                if (var3_4 /* !! */  == null || (var3_4 /* !! */  = var3_4 /* !! */ .loginHeaderView) == null) ** GOTO lbl110
                var4_6 = var2_2 /* !! */ .getArguments();
                if (var4_6 != null) {
                    var5_7 = "SOURCE";
                    var4_6 = var4_6.getString(var5_7);
                } else {
                    var6_8 = 0;
                    var4_6 = null;
                }
                if (var4_6 == null || (var7_9 = var4_6.length()) == 0) ** GOTO lbl107
                var7_9 = var4_6.hashCode();
                switch (var7_9) {
                    default: {
                        break;
                    }
                    case 2144824545: {
                        var5_7 = "source - coupon promotion";
                        var6_8 = (int)var4_6.equals(var5_7);
                        if (var6_8 == 0) {
                            break;
                        }
                        ** GOTO lbl104
                    }
                    case 1245215075: {
                        var5_7 = "source - reviews";
                        var6_8 = (int)var4_6.equals(var5_7);
                        if (var6_8 == 0) {
                            break;
                        }
                        ** GOTO lbl104
                    }
                    case 837384862: {
                        var5_7 = "source - deeplink";
                        var6_8 = (int)var4_6.equals(var5_7);
                        if (var6_8 == 0) {
                            break;
                        }
                        ** GOTO lbl104
                    }
                    case 803812493: {
                        var5_7 = "source - fleek";
                        var6_8 = (int)var4_6.equals(var5_7);
                        if (var6_8 == 0) {
                            break;
                        }
                        ** GOTO lbl104
                    }
                    case 30965764: {
                        var5_7 = "source - reset password";
                        var6_8 = (int)var4_6.equals(var5_7);
                        if (var6_8 == 0) break;
                        ** GOTO lbl104
                    }
                    case 21070154: {
                        var5_7 = "source - add to closet";
                        var6_8 = (int)var4_6.equals(var5_7);
                        if (var6_8 == 0) {
                            break;
                        }
                        ** GOTO lbl104
                    }
                    case -514416811: {
                        var5_7 = "source - referral";
                        var6_8 = (int)var4_6.equals(var5_7);
                        if (var6_8 == 0) {
                            break;
                        }
                        ** GOTO lbl104
                    }
                    case -937192652: {
                        var5_7 = "source - closet";
                        var6_8 = (int)var4_6.equals(var5_7);
                        if (var6_8 == 0) {
                            break;
                        }
                        ** GOTO lbl104
                    }
                    case -1400970439: {
                        var5_7 = "source - share with me";
                        var6_8 = (int)var4_6.equals(var5_7);
                        if (var6_8 == 0) {
                            break;
                        }
                        ** GOTO lbl104
                    }
                    case -1426202349: {
                        var5_7 = "source - coupon bonanza";
                        var6_8 = (int)var4_6.equals(var5_7);
                        if (var6_8 == 0) {
                            break;
                        }
                        ** GOTO lbl104
                    }
                    case -1471007576: {
                        var5_7 = "source - price reveal widget";
                        var6_8 = (int)var4_6.equals(var5_7);
                        if (var6_8 == 0) {
                            break;
                        }
                        ** GOTO lbl104
                    }
                    case -1913713750: {
                        var5_7 = "source - game";
                        var6_8 = (int)var4_6.equals(var5_7);
                        if (var6_8 == 0) {
                            break;
                        }
                        ** GOTO lbl104
                    }
                    case -1913832744: {
                        var5_7 = "source - cart";
                        var6_8 = (int)var4_6.equals(var5_7);
                        if (var6_8 == 0) {
                            break;
                        }
                        ** GOTO lbl104
                    }
                    case -1928850710: {
                        var5_7 = "source - move to closet";
                        var6_8 = (int)var4_6.equals(var5_7);
                        if (var6_8 != 0) ** GOTO lbl104
                    }
                }
                var6_8 = R$string.login_or_signup;
                var4_6 = hv3_0.K(var6_8);
                ** GOTO lbl109
lbl104:
                // 14 sources

                var6_8 = R$string.acc_auto_redirection_login;
                var4_6 = hv3_0.K(var6_8);
                ** GOTO lbl109
lbl107:
                // 1 sources

                var6_8 = R$string.login_or_signup;
                var4_6 = hv3_0.K(var6_8);
lbl109:
                // 3 sources

                var3_4 /* !! */ .setContentDescription((CharSequence)var4_6);
lbl110:
                // 2 sources

                if ((var2_2 /* !! */  = var2_2 /* !! */ .r) != null && (var2_2 /* !! */  = var2_2 /* !! */ .loginHeaderView) != null) {
                    ai0_2.a((View)var2_2 /* !! */ );
                }
                return;
            }
            case 0: 
        }
        var2_3 = (AddAddressFragment)this.b;
        var3_5 = "this$0";
        Intrinsics.checkNotNullParameter(var2_3, var3_5);
        var2_3 = var2_3.U;
        if (var2_3 != null) {
            ai0_2.a((View)var2_3);
        }
    }
}

