/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

public final class NB1
implements Callable {
    public final /* synthetic */ LottieAnimationView a;
    public final /* synthetic */ int b;

    public /* synthetic */ NB1(LottieAnimationView lottieAnimationView, int n3) {
        this.a = lottieAnimationView;
        this.b = n3;
    }

    public final Object call() {
        Object object = this.a;
        boolean bl2 = object.j;
        int n3 = this.b;
        if (bl2) {
            object = object.getContext();
            String string2 = cc1_0.m(n3, (Context)object);
            object = cc1_0.h((Context)object, n3, string2);
        } else {
            object = object.getContext();
            bl2 = false;
            Object var4_5 = null;
            object = cc1_0.h((Context)object, n3, null);
        }
        return object;
    }
}

