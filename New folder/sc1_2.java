/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.myaccount.order.imps.c;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sc1
 */
public final class sc1_2
implements View.OnClickListener {
    public final /* synthetic */ c a;

    public /* synthetic */ sc1_2(c c2) {
        this.a = c2;
    }

    public final void onClick(View view) {
        c c2 = this.a;
        Intrinsics.checkNotNullParameter(c2, "this$0");
        c2.dismiss();
    }
}

