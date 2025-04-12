/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.animation.Animation
 *  android.view.animation.TranslateAnimation
 */
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.ril.ajio.payment.activity.OrderConfirmationActivity;
import com.ril.ajio.payment.activity.OrderConfirmationActivity$a;

public final class wa2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ wa2(int n3, View view) {
        this.a = n3;
        this.b = view;
    }

    public final void run() {
        OrderConfirmationActivity$a orderConfirmationActivity$a = OrderConfirmationActivity.Companion;
        orderConfirmationActivity$a = new TranslateAnimation(0.0f, 0.0f, 0.0f, -100.0f);
        long l2 = this.a;
        orderConfirmationActivity$a.setDuration(l2);
        View view = this.b;
        xa2_0 xa2_02 = new xa2_0(view);
        orderConfirmationActivity$a.setAnimationListener(xa2_02);
        view.startAnimation((Animation)orderConfirmationActivity$a);
    }
}

