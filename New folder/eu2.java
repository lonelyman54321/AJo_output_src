/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.PlayerControlView;
import java.util.ArrayList;

public final class eu2
implements Runnable {
    public final /* synthetic */ mu2 a;

    public /* synthetic */ eu2(mu2 mu22) {
        this.a = mu22;
    }

    public final void run() {
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.a;
        ViewGroup viewGroup2 = valueAnimator.f;
        if (viewGroup2 != null && (viewGroup = valueAnimator.g) != null) {
            int n3;
            int n4;
            int n7;
            PlayerControlView playerControlView = valueAnimator.a;
            int n8 = playerControlView.getWidth();
            int n10 = playerControlView.getPaddingLeft();
            n8 -= n10;
            int n14 = playerControlView.getPaddingRight();
            n8 -= n14;
            while (true) {
                n14 = viewGroup.getChildCount();
                n10 = 1;
                n7 = 0;
                if (n14 <= n10) break;
                n14 = viewGroup.getChildCount() + -2;
                View view = viewGroup.getChildAt(n14);
                viewGroup.removeViewAt(n14);
                viewGroup2.addView(view, 0);
            }
            playerControlView = valueAnimator.k;
            if (playerControlView != null) {
                n4 = 8;
                playerControlView.setVisibility(n4);
            }
            ViewGroup viewGroup3 = valueAnimator.i;
            n4 = mu2.c((View)viewGroup3);
            int n15 = viewGroup2.getChildCount() - n10;
            View view = null;
            for (int i3 = 0; i3 < n15; ++i3) {
                View view2 = viewGroup2.getChildAt(i3);
                n3 = mu2.c(view2);
                n4 += n3;
            }
            if (n4 > n8) {
                if (playerControlView != null) {
                    playerControlView.setVisibility(0);
                    int n16 = mu2.c((View)playerControlView);
                    n4 += n16;
                }
                valueAnimator = new ArrayList();
                playerControlView = null;
                for (n14 = 0; n14 < n15; ++n14) {
                    view = viewGroup2.getChildAt(n14);
                    n3 = mu2.c(view);
                    valueAnimator.add(view);
                    if ((n4 -= n3) <= n8) break;
                }
                if ((n14 = (int)(valueAnimator.isEmpty() ? 1 : 0)) == 0) {
                    int n17;
                    n14 = valueAnimator.size();
                    viewGroup2.removeViews(0, n14);
                    while (n7 < (n17 = valueAnimator.size())) {
                        n17 = viewGroup.getChildCount() - n10;
                        playerControlView = (View)valueAnimator.get(n7);
                        viewGroup.addView((View)playerControlView, n17);
                        ++n7;
                    }
                }
            } else {
                boolean bl2;
                int n18;
                viewGroup2 = valueAnimator.h;
                if (viewGroup2 != null && (n18 = viewGroup2.getVisibility()) == 0 && !(bl2 = (viewGroup2 = valueAnimator.r).isStarted())) {
                    valueAnimator = valueAnimator.q;
                    valueAnimator.cancel();
                    viewGroup2.start();
                }
            }
        }
    }
}

