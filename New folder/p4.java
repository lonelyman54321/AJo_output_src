/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.TranslateAnimation
 */
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.ril.ajio.R$integer;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment$e;
import kotlin.jvm.internal.Intrinsics;

public final class p4
implements Runnable {
    public final /* synthetic */ AddAddressFragment a;

    public /* synthetic */ p4(AddAddressFragment addAddressFragment) {
        this.a = addAddressFragment;
    }

    public final void run() {
        AddAddressFragment addAddressFragment = this.a;
        Intrinsics.checkNotNullParameter(addAddressFragment, "this$0");
        float f5 = -100.0f;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, f5);
        int n3 = hv3_0.w(R$integer.notification_anim_delay);
        long l2 = n3;
        translateAnimation.setDuration(l2);
        AddAddressFragment$e addAddressFragment$e = new AddAddressFragment$e(addAddressFragment);
        translateAnimation.setAnimationListener((Animation.AnimationListener)addAddressFragment$e);
        addAddressFragment = addAddressFragment.j;
        if (addAddressFragment != null) {
            addAddressFragment.startAnimation((Animation)translateAnimation);
        }
    }
}

