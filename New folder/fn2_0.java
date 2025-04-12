/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.TranslateAnimation
 */
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.ril.ajio.payment.view.PaymentActivity$e;

/*
 * Renamed from Fn2
 */
public final class fn2_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ fn2_0(int n3, View view) {
        this.a = n3;
        this.b = view;
    }

    public final void run() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -100.0f);
        long l2 = this.a;
        translateAnimation.setDuration(l2);
        View view = this.b;
        PaymentActivity$e paymentActivity$e = new PaymentActivity$e(view);
        translateAnimation.setAnimationListener((Animation.AnimationListener)paymentActivity$e);
        view.startAnimation((Animation)translateAnimation);
    }
}

