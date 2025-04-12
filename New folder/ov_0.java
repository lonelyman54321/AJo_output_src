/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.TranslateAnimation
 */
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$integer;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from ov
 */
public final class ov_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetDialogFragment b;

    public /* synthetic */ ov_0(BottomSheetDialogFragment bottomSheetDialogFragment, int n3) {
        this.a = n3;
        this.b = bottomSheetDialogFragment;
    }

    public final void run() {
        ConstraintLayout constraintLayout;
        int n3 = 1;
        BottomSheetDialogFragment bottomSheetDialogFragment = this.b;
        Object object = "this$0";
        int n4 = this.a;
        switch (n4) {
            default: {
                bottomSheetDialogFragment = (lm_2)bottomSheetDialogFragment;
                Intrinsics.checkNotNullParameter(bottomSheetDialogFragment, object);
                n4 = -1027080192;
                float f5 = -100.0f;
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, f5);
                int n7 = hv3_0.w(R$integer.notification_anim_delay);
                long l2 = n7;
                translateAnimation.setDuration(l2);
                object = new lM$e((lm_2)bottomSheetDialogFragment);
                translateAnimation.setAnimationListener((Animation.AnimationListener)object);
                bottomSheetDialogFragment = ((lm_2)bottomSheetDialogFragment).j;
                if (bottomSheetDialogFragment != null) {
                    bottomSheetDialogFragment.startAnimation((Animation)translateAnimation);
                }
                return;
            }
            case 0: 
        }
        bottomSheetDialogFragment = (qv_1)bottomSheetDialogFragment;
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragment, object);
        object = ((qv_1)bottomSheetDialogFragment).b;
        if (object != null) {
            Object object2 = StringCompanionObject.INSTANCE;
            n4 = R$string.acc_info_popup;
            object2 = hv3_0.K(n4);
            int n8 = R$string.acc_bank_offers;
            String string2 = hv3_0.K(n8);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string2;
            string2 = "format(...)";
            an_1.a(objectArray, n3, (String)object2, string2, (ConstraintLayout)((Object)object));
        }
        if ((constraintLayout = ((qv_1)bottomSheetDialogFragment).b) != null) {
            ai0_2.a((View)constraintLayout);
        }
    }
}

