/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.net.ConnectivityManager;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RA0
 */
public final class ra0_0
implements View.OnClickListener {
    public final /* synthetic */ sa0_2 a;

    public /* synthetic */ ra0_0(sa0_2 sa0_22) {
        this.a = sa0_22;
    }

    public final void onClick(View object) {
        boolean bl2;
        boolean bl3;
        sa0_2 sa0_22 = this.a;
        Intrinsics.checkNotNullParameter(sa0_22, "this$0");
        object = oo2_0.a;
        Context context = sa0_22.getContext();
        object.getClass();
        if (context != null) {
            object = context.getSystemService("connectivity");
        } else {
            bl3 = false;
            object = null;
        }
        object = (ConnectivityManager)object;
        if (object != null && (object = object.getActiveNetworkInfo()) != null && (bl3 = object.isConnected()) == (bl2 = true)) {
            sa0_22.dismissAllowingStateLoss();
        }
    }
}

