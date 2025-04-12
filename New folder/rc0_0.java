/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Rc0
 */
public final class rc0_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rc0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                ss2_2 ss2_22 = (ss2_2)this.b;
                Intrinsics.checkNotNullParameter(ss2_22, "this$0");
                object = ss2_22.b;
                if (object != null) {
                    object.L2();
                }
                return;
            }
            case 0: 
        }
        sc0_2 sc0_22 = (sc0_2)this.b;
        Intrinsics.checkNotNullParameter(sc0_22, "this$0");
        sc0_22.Pa().dismiss();
    }
}

