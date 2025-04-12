/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.myaccount.order.imps.b;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Rd
 */
public final class rd_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rd_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                b b2 = (b)this.b;
                Intrinsics.checkNotNullParameter(b2, "this$0");
                b2.dismiss();
                return;
            }
            case 0: 
        }
        Kd$c kd$c = (Kd$c)this.b;
        Intrinsics.checkNotNullParameter(kd$c, "this$0");
        kd$c.a.X7();
    }
}

