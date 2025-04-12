/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.widget.FrameLayout
 */
import android.view.View;
import android.widget.FrameLayout;
import com.ril.ajio.R$drawable;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gh2
 */
public final class gh2_1
implements View.OnFocusChangeListener {
    public final /* synthetic */ qh2_2 a;

    public /* synthetic */ gh2_1(qh2_2 qh2_22) {
        this.a = qh2_22;
    }

    public final void onFocusChange(View object, boolean bl2) {
        object = "this$0";
        qh2_2 qh2_22 = this.a;
        Intrinsics.checkNotNullParameter(qh2_22, (String)object);
        boolean bl3 = og1_1.b();
        if (bl3) {
            bl3 = false;
            object = null;
            if (bl2) {
                AjioTextView frameLayout = qh2_22.i;
                if (frameLayout != null) {
                    ai0_2.i((View)frameLayout);
                }
                if ((frameLayout = qh2_22.l) != null) {
                    frameLayout.setBackgroundResource(0);
                }
                if ((object = qh2_22.u) != null) {
                    int n3 = R$drawable.rect_stroke_pan_1dp;
                    object.setBackgroundResource(n3);
                }
            } else {
                qh2_22.Oa();
                FrameLayout frameLayout = qh2_22.u;
                if (frameLayout != null) {
                    frameLayout.setBackgroundResource(0);
                }
            }
        } else if (bl2) {
            object = qh2_22.i;
            if (object != null) {
                ai0_2.i((View)object);
            }
        } else {
            qh2_22.Oa();
        }
    }
}

