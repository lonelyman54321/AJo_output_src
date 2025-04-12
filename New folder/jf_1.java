/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.compose.foundation.layout.j;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.referral.transform.ReferralImageDataTransform;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from JF
 */
public final class jf_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jf_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        float f5 = 0.0f;
        ShimmerFrameLayout shimmerFrameLayout = null;
        int n3 = 1;
        Object object2 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (LP1)object;
                object2 = (tr1_0)object2;
                Intrinsics.checkNotNullParameter(object2, "$buttonHeightDp$delegate");
                Intrinsics.checkNotNullParameter(object, "$this$conditional");
                f5 = ((xs0_0)object2.getValue()).a;
                return j.d((LP1)object, f5);
            }
            case 1: {
                object = (DataCallback)object;
                object2 = (gg2_1)object2;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                Object object3 = cp_1.Companion;
                n4 = (int)(nn_2.b(object3, (DataCallback)object) ? 1 : 0);
                if (n4 != 0) {
                    n4 = ((DataCallback)object).getStatus();
                    View view = null;
                    if (n4 == 0) {
                        Object object4;
                        shimmerFrameLayout = ((gg2_1)object2).i;
                        if (shimmerFrameLayout == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("referralShimmerView");
                            shimmerFrameLayout = null;
                            f5 = 0.0f;
                        }
                        if ((object4 = ((gg2_1)object2).j) == null) {
                            object4 = "referralShimmerParentView";
                            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        } else {
                            view = object4;
                        }
                        hv3_0.t0(shimmerFrameLayout, view);
                        object = (ReferralImageDataTransform)((DataCallback)object).getData();
                        ((gg2_1)object2).Ra((ReferralImageDataTransform)object);
                    } else {
                        object = ((gg2_1)object2).l;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("parentLayout");
                            object = null;
                        }
                        object = Snackbar.make((View)object, "", -2);
                        Intrinsics.checkNotNullExpressionValue(object, "make(...)");
                        object3 = ((BaseTransientBottomBar)object).getView();
                        Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type com.google.android.material.snackbar.Snackbar.SnackbarLayout");
                        object3 = (Snackbar$SnackbarLayout)((Object)object3);
                        int n7 = com.google.android.material.R$id.snackbar_text;
                        View view2 = object3.findViewById(n7);
                        int n8 = 4;
                        view2.setVisibility(n8);
                        n7 = hv3_0.m(R$color.accent_color_11);
                        object3.setBackgroundColor(n7);
                        view2 = ((gg2_1)object2).m;
                        if (view2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("layoutInflaterReferral");
                            n7 = 0;
                            view2 = null;
                        }
                        n8 = R$layout.referral_snackbar;
                        view = view2.inflate(n8, null);
                        Intrinsics.checkNotNullExpressionValue(view, "inflate(...)");
                        n7 = R$id.rs_cancel;
                        view2 = view.findViewById(n7);
                        Object object5 = "findViewById(...)";
                        Intrinsics.checkNotNullExpressionValue(view2, (String)object5);
                        int n10 = R$id.rs_reload;
                        View view3 = view.findViewById(n10);
                        Intrinsics.checkNotNullExpressionValue(view3, (String)object5);
                        object5 = StringCompanionObject.INSTANCE;
                        n8 = R$string.acc_error_message;
                        object5 = hv3_0.K(n8);
                        int n14 = R$string.something_wrong_reload;
                        Object object6 = hv3_0.K(n14);
                        Object[] objectArray = new Object[n3];
                        objectArray[0] = object6;
                        Object object7 = xh2_0.a(objectArray, n3, (String)object5, "format(...)");
                        object6 = Looper.getMainLooper();
                        object5 = new Handler((Looper)object6);
                        object6 = new DG2(view, (String)object7);
                        long l2 = 100;
                        object5.postDelayed((Runnable)object6, l2);
                        object7 = new EG2((Snackbar)object);
                        view2.setOnClickListener((View.OnClickListener)object7);
                        object7 = new FG2((Snackbar)object, (gg2_1)object2);
                        view3.setOnClickListener((View.OnClickListener)object7);
                        object3.addView(view, 0);
                        ((Snackbar)object).show();
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (Throwable)object;
        ((Function0)object2).invoke();
        return Unit.a;
    }
}

