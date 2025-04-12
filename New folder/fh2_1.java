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
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fh2
 */
public final class fh2_1
implements View.OnFocusChangeListener {
    public final /* synthetic */ qh2_2 a;

    public /* synthetic */ fh2_1(qh2_2 qh2_22) {
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
                FrameLayout frameLayout = qh2_22.l;
                if (frameLayout != null) {
                    frameLayout.setBackgroundResource(0);
                }
                if ((object = qh2_22.t) != null) {
                    int n3 = R$drawable.rect_stroke_pan_1dp;
                    object.setBackgroundResource(n3);
                }
            } else {
                FrameLayout frameLayout = qh2_22.t;
                if (frameLayout != null) {
                    frameLayout.setBackgroundResource(0);
                }
            }
        }
    }
}

