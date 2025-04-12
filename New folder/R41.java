/*
 * Decompiled with CFR 0.152.
 */
import com.getkeepsafe.taptargetview.TapTargetView;
import com.getkeepsafe.taptargetview.TapTargetView$Listener;

public final class R41
extends TapTargetView$Listener {
    public final /* synthetic */ M41 a;

    public R41(M41 m41) {
        this.a = m41;
    }

    public final void onOuterCircleClick(TapTargetView tapTargetView) {
        super.onOuterCircleClick(tapTargetView);
        this.onTargetClick(tapTargetView);
    }

    public final void onTargetCancel(TapTargetView tapTargetView) {
        super.onTargetCancel(tapTargetView);
        this.a.c.x2();
    }

    public final void onTargetClick(TapTargetView tapTargetView) {
        super.onTargetClick(tapTargetView);
        this.a.c.x2();
    }

    public final void onTargetDismissed(TapTargetView tapTargetView, boolean bl2) {
        super.onTargetDismissed(tapTargetView, bl2);
        this.a.c.x2();
    }

    public final void onTargetLongClick(TapTargetView tapTargetView) {
        super.onTargetLongClick(tapTargetView);
        this.onTargetClick(tapTargetView);
    }
}

