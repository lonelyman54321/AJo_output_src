/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.TranslateAnimation
 *  android.widget.TextView
 */
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

/*
 * Renamed from Av3
 */
public final class av3_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;

    public /* synthetic */ av3_0(TextView textView, int n3) {
        this.a = n3;
        this.b = textView;
    }

    public final void run() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -100.0f);
        long l2 = this.a;
        translateAnimation.setDuration(l2);
        TextView textView = this.b;
        gv3_0 gv3_02 = new gv3_0(textView);
        translateAnimation.setAnimationListener((Animation.AnimationListener)gv3_02);
        textView.startAnimation((Animation)translateAnimation);
    }
}

