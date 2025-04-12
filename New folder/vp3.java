/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.widget.TextView
 */
import android.animation.ValueAnimator;
import android.widget.TextView;
import com.ril.ajio.myaccount.order.orderhistory.tracking.TrackOrderLayout;
import com.ril.ajio.myaccount.order.orderhistory.tracking.TrackStepDot;

public final class vp3
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ TrackOrderLayout a;

    public vp3(TrackOrderLayout trackOrderLayout) {
        this.a = trackOrderLayout;
    }

    public final void onAnimationUpdate(ValueAnimator object) {
        object = (Integer)object.getAnimatedValue("progress");
        int n3 = (Integer)object;
        TrackOrderLayout trackOrderLayout = this.a;
        int n4 = trackOrderLayout.j;
        int n7 = 1;
        int n8 = trackOrderLayout.h / (n4 -= n7);
        TrackStepDot trackStepDot = (TrackStepDot)trackOrderLayout.b.getChildAt(n3 /= n8);
        if (trackStepDot != null) {
            TextView textView = (TextView)trackOrderLayout.d.getChildAt(n3);
            TextView textView2 = (TextView)trackOrderLayout.c.getChildAt(n3);
            int n10 = trackOrderLayout.n;
            if (n10 != n3) {
                trackOrderLayout.n = n3;
                trackOrderLayout.a(textView);
                trackOrderLayout.a(textView2);
                int n14 = trackOrderLayout.o;
                if (n3 == n14) {
                    trackStepDot.setActivated(n7 != 0, n7 != 0);
                } else {
                    trackStepDot.setEnabled(n7 != 0, n7 != 0);
                }
            }
        }
    }
}

