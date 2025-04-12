/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.widget.FrameLayout
 *  android.widget.PopupWindow$OnDismissListener
 */
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.skydoves.balloon.Balloon;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Tu
 */
public final class tu_2
implements PopupWindow.OnDismissListener {
    public final /* synthetic */ Balloon a;

    public /* synthetic */ tu_2(Balloon balloon2) {
        this.a = balloon2;
    }

    public final void onDismiss() {
        Balloon balloon2 = this.a;
        Intrinsics.checkNotNullParameter(balloon2, "this$0");
        FrameLayout frameLayout = balloon2.c.b;
        Animation animation = frameLayout.getAnimation();
        if (animation != null) {
            String string2 = "animation";
            Intrinsics.checkNotNullExpressionValue(animation, string2);
            animation.cancel();
            animation.reset();
        }
        frameLayout.clearAnimation();
        balloon2.h();
    }
}

