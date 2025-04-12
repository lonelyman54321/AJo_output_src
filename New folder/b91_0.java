/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.FeedbackRatingSnackbar;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Home.NavigationParent;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from b91
 */
public final class b91_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b91_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        var2_2 = null;
        var3_3 = "this$0";
        var4_4 = this.b;
        var5_5 = 1;
        var6_6 = this.a;
        switch (var6_6) {
            default: {
                var1_1 = (DataCallback)var1_1;
                var4_4 = (ed3_2)var4_4;
                Intrinsics.checkNotNullParameter(var4_4, (String)var3_3);
                var4_4.getClass();
                if (var1_1 == null || (var7_7 = nn_2.b((cp$a)(var3_3 = cp_1.Companion), (DataCallback)var1_1)) == 0) ** GOTO lbl69
                var7_7 = var1_1.getStatus();
                if (var7_7 != 0) ** GOTO lbl63
                var4_4.n = var1_1 = (NavigationParent)var1_1.getData();
                var2_2 = "homeListener";
                var7_7 = 0;
                var3_3 = null;
                if (var1_1 == null) ** GOTO lbl-1000
                Intrinsics.checkNotNull(var1_1);
                var1_1 = var1_1.getChildDetails();
                if (var1_1 == null) ** GOTO lbl31
                var1_1 = var4_4.n;
                Intrinsics.checkNotNull(var1_1);
                var1_1 = var1_1.getChildDetails();
                Intrinsics.checkNotNull(var1_1);
                var1_1 = (Collection)var1_1;
                var8_9 = var1_1.isEmpty() ^ var5_5;
                if (var8_9 != 0) ** GOTO lbl-1000
lbl31:
                // 2 sources

                var1_1 = var4_4.n;
                Intrinsics.checkNotNull(var1_1);
                var1_1 = var1_1.getLinkDetails();
                if (var1_1 != null) {
                    var1_1 = var4_4.n;
                    Intrinsics.checkNotNull(var1_1);
                    var1_1 = var1_1.getLinkDetails();
                    Intrinsics.checkNotNull(var1_1);
                    var1_1 = (Collection)var1_1;
                    var8_9 = var1_1.isEmpty() ^ var5_5;
                    ** if (var8_9 == 0) goto lbl-1000
                }
                ** GOTO lbl-1000
lbl-1000:
                // 2 sources

                {
                    if ((var1_1 = var4_4.g) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
                        var8_9 = 0;
                        var1_1 = null;
                    }
                    var2_2 = var4_4.n;
                    var4_4 = var4_4.j;
                    if (var4_4 == null) {
                        var4_4 = "mStoreLPViewModel";
                        Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                    } else {
                        var3_3 = var4_4;
                    }
                    var3_3 = var3_3.c;
                    var1_1.w((NavigationParent)var2_2, (String)var3_3);
                    ** GOTO lbl69
                }
lbl-1000:
                // 3 sources

                {
                    if ((var1_1 = var4_4.g) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
                        var8_9 = 0;
                        var1_1 = null;
                    }
                    var1_1.w(null, null);
                }
                ** GOTO lbl69
lbl63:
                // 1 sources

                var8_10 = var1_1.getStatus();
                if (var8_10 == var5_5) {
                    var1_1 = yn3_0.a;
                    var2_2 = new Object[]{};
                    var3_3 = "storeCategories Failure";
                    var1_1.a((String)var3_3, var2_2);
                }
lbl69:
                // 6 sources

                return Unit.a;
            }
            case 1: {
                var1_1 = (Boolean)var1_1;
                var8_11 = var1_1.booleanValue();
                var4_4 = (bg2_1)var4_4;
                Intrinsics.checkNotNullParameter(var4_4, (String)var3_3);
                if (!var8_11) {
                    var1_1 = FeedbackRatingSnackbar.Companion;
                    var3_3 = var4_4.getView();
                    Intrinsics.checkNotNull(var3_3, "null cannot be cast to non-null type android.view.ViewGroup");
                    var3_3 = (ViewGroup)var3_3;
                    var1_1 = var1_1.make((View)var3_3);
                    var1_1.setDuration(-2);
                    var1_1.show();
                    var3_3 = StringCompanionObject.INSTANCE;
                    var3_3 = hv3_0.K(R$string.acc_error_message);
                    var9_12 = R$string.feedback_submission_failed;
                    var4_4 = hv3_0.K(var9_12);
                    var10_13 = new Object[var5_5];
                    var10_13[0] = var4_4;
                    var2_2 = xh2_0.a(var10_13, var5_5, (String)var3_3, "format(...)");
                    var4_4 = Looper.getMainLooper();
                    var3_3 = new Handler((Looper)var4_4);
                    var4_4 = new BF0(var5_5, var1_1, var2_2);
                    var11_14 = 100;
                    var3_3.postDelayed((Runnable)var4_4, var11_14);
                    var2_2 = var1_1.getView();
                    var7_8 = R$id.img_close;
                    var2_2 = (ImageView)var2_2.findViewById(var7_8);
                    var3_3 = new Pc0(var1_1, var5_5);
                    var2_2.setOnClickListener((View.OnClickListener)var3_3);
                }
                return Unit.a;
            }
            case 0: 
        }
        var1_1 = (Throwable)var1_1;
        var4_4 = (h91)var4_4;
        Intrinsics.checkNotNullParameter(var4_4, (String)var3_3);
        var13_15 = var4_4.q;
        var2_2 = ApiErrorRepo.INSTANCE;
        Intrinsics.checkNotNull(var1_1);
        var3_3 = var1_1;
        var1_1 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)var2_2, (Throwable)var1_1, "BackGround_UserProfile", false, null, null, 28, null);
        var13_15.k(var1_1);
        return Unit.a;
    }
}

