/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.Window
 */
import android.content.Context;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.R$color;
import com.ril.ajio.myaccount.order.fragment.b;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uf2
 */
public final class uf2_0
implements Runnable {
    public final /* synthetic */ b a;

    public /* synthetic */ uf2_0(b b2) {
        this.a = b2;
    }

    public final void run() {
        Object object = b.Companion;
        object = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((Fragment)object).getActivity();
        if (object != null) {
            string2 = "<this>";
            Intrinsics.checkNotNullParameter(object, string2);
            int n3 = R$color.ajioColorPrimary;
            n3 = t70.getColor((Context)object, n3);
            Window window = object.getWindow();
            if (window != null) {
                window.setStatusBarColor(n3);
            }
            boolean bl3 = tm3_0.c(n3);
            tm3_0.f((FragmentActivity)object, bl3);
        }
    }
}

