/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.media3.ui.DefaultTimeBar;
import kotlin.jvm.internal.Intrinsics;

public final class X90
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ X90(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                n3 = DefaultTimeBar.P;
                ((DefaultTimeBar)object).e(false);
                return;
            }
            case 0: 
        }
        object = (Y90)object;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((Y90)object).b;
        if (object != null) {
            ai0_2.a((View)object);
        }
    }
}

