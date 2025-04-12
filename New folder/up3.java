/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.animation.Animator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.myaccount.order.orderhistory.tracking.TrackOrderLayout;

public final class up3
implements Animator.AnimatorListener {
    public final /* synthetic */ TrackOrderLayout a;

    public up3(TrackOrderLayout trackOrderLayout) {
        this.a = trackOrderLayout;
    }

    public final void onAnimationCancel(Animator animator2) {
    }

    public final void onAnimationEnd(Animator object) {
        object = this.a;
        LinearLayout linearLayout = ((TrackOrderLayout)((Object)object)).d;
        int n3 = ((TrackOrderLayout)((Object)object)).j + -1;
        linearLayout = (TextView)linearLayout.getChildAt(n3);
        ((TrackOrderLayout)((Object)object)).a((TextView)linearLayout);
        linearLayout = ((TrackOrderLayout)((Object)object)).c;
        n3 = ((TrackOrderLayout)((Object)object)).j + -1;
        linearLayout = (TextView)linearLayout.getChildAt(n3);
        ((TrackOrderLayout)((Object)object)).a((TextView)linearLayout);
    }

    public final void onAnimationRepeat(Animator animator2) {
    }

    public final void onAnimationStart(Animator animator2) {
    }
}

