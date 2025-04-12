/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.pdprefresh.fragments.d;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ch0
 */
public final class ch0_0
implements View.OnClickListener {
    public final /* synthetic */ d a;

    public /* synthetic */ ch0_0(d d2) {
        this.a = d2;
    }

    public final void onClick(View view) {
        d d2 = this.a;
        Intrinsics.checkNotNullParameter(d2, "this$0");
        d2.dismiss();
    }
}

