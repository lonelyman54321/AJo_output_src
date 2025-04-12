/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.ril.ajio.R$anim;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from i41
 */
public final class i41_0
implements Runnable {
    public final /* synthetic */ k41_0 a;

    public /* synthetic */ i41_0(k41_0 k41_02) {
        this.a = k41_02;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Context context = object.a.getContext();
        int n3 = R$anim.zoom_out;
        context = AnimationUtils.loadAnimation((Context)context, (int)n3);
        Context context2 = object.a.getContext();
        int n4 = R$anim.fade_in;
        context2 = AnimationUtils.loadAnimation((Context)context2, (int)n4);
        object.e.startAnimation((Animation)context2);
        TextView textView = object.j;
        if (textView != null) {
            textView.startAnimation((Animation)context2);
        }
        if ((textView = object.f) != null) {
            textView.startAnimation((Animation)context2);
        }
        if ((object = object.i) != null) {
            object.startAnimation((Animation)context);
        }
    }
}

