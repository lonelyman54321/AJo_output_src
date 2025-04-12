/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewAnimationUtils
 */
import android.view.View;
import android.view.ViewAnimationUtils;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RC3
 */
public final class rc3_1
implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ long b;

    public /* synthetic */ rc3_1(long l2, View view) {
        this.a = view;
        this.b = l2;
    }

    public final void run() {
        String string2 = "$this_circularRevealed";
        View view = this.a;
        Intrinsics.checkNotNullParameter(view, string2);
        int n3 = view.isAttachedToWindow();
        if (n3 != 0) {
            view.setVisibility(0);
            n3 = view.getLeft();
            int n4 = (view.getRight() + n3) / 2;
            n3 = view.getTop();
            int n7 = (view.getBottom() + n3) / 2;
            n3 = view.getWidth();
            int n8 = view.getHeight();
            n3 = Math.max(n3, n8);
            float f5 = n3;
            n8 = 0;
            string2 = ViewAnimationUtils.createCircularReveal((View)view, (int)n4, (int)n7, (float)0.0f, (float)f5);
            long l2 = this.b;
            string2.setDuration(l2);
            string2.start();
        }
    }
}

