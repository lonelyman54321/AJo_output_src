/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

public final class LB1
implements Callable {
    public final /* synthetic */ LottieAnimationView a;
    public final /* synthetic */ String b;

    public /* synthetic */ LB1(LottieAnimationView lottieAnimationView, String string2) {
        this.a = lottieAnimationView;
        this.b = string2;
    }

    public final Object call() {
        Object object = this.a;
        boolean bl2 = object.j;
        String string2 = this.b;
        if (bl2) {
            object = object.getContext();
            Object object2 = cc1_0.a;
            String string3 = "asset_";
            object2 = new StringBuilder(string3);
            ((StringBuilder)object2).append(string2);
            object2 = ((StringBuilder)object2).toString();
            object = cc1_0.c((Context)object, string2, (String)object2);
        } else {
            object = object.getContext();
            bl2 = false;
            Object var4_5 = null;
            object = cc1_0.c((Context)object, string2, null);
        }
        return object;
    }
}

