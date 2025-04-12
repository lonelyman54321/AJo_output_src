/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.app.Dialog;
import android.view.View;
import com.ril.ajio.pdprefresh.holders.PDPVideoKYPHolder;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Sx1
 */
public final class sx1_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sx1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (PDPVideoKYPHolder)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                ((PDPVideoKYPHolder)object).z(false);
                return;
            }
            case 0: 
        }
        object = (Dialog)object;
        Intrinsics.checkNotNullParameter(object, "$dialog");
        object.dismiss();
    }
}

