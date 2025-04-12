/*
 * Decompiled with CFR 0.152.
 */
import com.getkeepsafe.taptargetview.TapTargetView;
import com.getkeepsafe.taptargetview.TapTargetView$Listener;

public final class Ia$c
extends TapTargetView$Listener {
    public final /* synthetic */ ia_0 a;

    public Ia$c(ia_0 ia_02) {
        this.a = ia_02;
    }

    public final void onOuterCircleClick(TapTargetView tapTargetView) {
        super.onOuterCircleClick(tapTargetView);
        this.onTargetClick(tapTargetView);
    }

    public final void onTargetCancel(TapTargetView tapTargetView) {
        super.onTargetCancel(tapTargetView);
        this.a.cb().d.v.putPreference("plp_wishlist_coachmark_in_revamp", true);
    }

    public final void onTargetClick(TapTargetView tapTargetView) {
        super.onTargetClick(tapTargetView);
        this.a.cb().d.v.putPreference("plp_wishlist_coachmark_in_revamp", true);
    }

    public final void onTargetDismissed(TapTargetView tapTargetView, boolean bl2) {
        super.onTargetDismissed(tapTargetView, bl2);
        this.a.cb().d.v.putPreference("plp_wishlist_coachmark_in_revamp", true);
    }

    public final void onTargetLongClick(TapTargetView tapTargetView) {
        super.onTargetLongClick(tapTargetView);
        this.onTargetClick(tapTargetView);
    }
}

