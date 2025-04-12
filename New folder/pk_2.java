/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pK
 */
public final class pk_2
implements View.OnClickListener {
    public final /* synthetic */ a a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ pk_2(a a2, boolean bl2, boolean bl3) {
        this.a = a2;
        this.b = bl2;
        this.c = bl3;
    }

    public final void onClick(View object) {
        a a2 = this.a;
        Intrinsics.checkNotNullParameter(a2, "this$0");
        object = a2.f;
        if (object != null) {
            boolean bl2 = this.b;
            object.k(bl2);
        } else {
            boolean bl3 = this.c;
            if (bl3) {
                object = a2.g;
                if (object != null) {
                    object.p6();
                }
                a2.dismiss();
            } else {
                object = a2.g;
                if (object != null) {
                    object.reset();
                }
                a2.dismiss();
            }
        }
    }
}

