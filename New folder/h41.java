/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 */
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$anim;
import kotlin.jvm.internal.Intrinsics;

public final class h41
implements Runnable {
    public final /* synthetic */ k41_0 a;

    public /* synthetic */ h41(k41_0 k41_02) {
        this.a = k41_02;
    }

    public final void run() {
        k41_0 k41_02 = this.a;
        Intrinsics.checkNotNullParameter(k41_02, "this$0");
        Context context = k41_02.a.getContext();
        int n3 = R$anim.zoom_in;
        context = AnimationUtils.loadAnimation((Context)context, (int)n3);
        ConstraintLayout constraintLayout = k41_02.i;
        if (constraintLayout != null) {
            constraintLayout.startAnimation((Animation)context);
        }
        context = k41_02.a.getContext();
        n3 = R$anim.fade_out;
        context = AnimationUtils.loadAnimation((Context)context, (int)n3);
        k41_02.e.startAnimation((Animation)context);
        constraintLayout = k41_02.j;
        if (constraintLayout != null) {
            constraintLayout.startAnimation((Animation)context);
        }
        if ((k41_02 = k41_02.f) != null) {
            k41_02.startAnimation((Animation)context);
        }
    }
}

