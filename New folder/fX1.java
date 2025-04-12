/*
 * Decompiled with CFR 0.152.
 */
import com.getkeepsafe.taptargetview.TapTargetView;
import com.getkeepsafe.taptargetview.TapTargetView$Listener;
import kotlin.jvm.internal.Intrinsics;

public final class fX1
extends TapTargetView$Listener {
    public final /* synthetic */ ex1_0 a;

    public fX1(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final void onOuterCircleClick(TapTargetView tapTargetView) {
        super.onOuterCircleClick(tapTargetView);
        this.onTargetClick(tapTargetView);
    }

    public final void onTargetCancel(TapTargetView object) {
        super.onTargetCancel((TapTargetView)((Object)object));
        object = this.a.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            object = null;
        }
        ((wx1_1)object).q1.putPreference("cart_footer_coachmark_in_revamp", true);
    }

    public final void onTargetClick(TapTargetView object) {
        super.onTargetClick((TapTargetView)((Object)object));
        object = this.a.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            object = null;
        }
        ((wx1_1)object).q1.putPreference("cart_footer_coachmark_in_revamp", true);
    }

    public final void onTargetDismissed(TapTargetView object, boolean bl2) {
        super.onTargetDismissed((TapTargetView)((Object)object), bl2);
        object = this.a.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            object = null;
        }
        ((wx1_1)object).q1.putPreference("cart_footer_coachmark_in_revamp", true);
    }

    public final void onTargetLongClick(TapTargetView tapTargetView) {
        super.onTargetLongClick(tapTargetView);
        this.onTargetClick(tapTargetView);
    }
}

