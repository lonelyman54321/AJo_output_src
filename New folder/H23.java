/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class H23
implements View.OnClickListener {
    public final /* synthetic */ J23 a;

    public /* synthetic */ H23(J23 j23) {
        this.a = j23;
    }

    public final void onClick(View object) {
        Object object2 = J23.Companion;
        object2 = "this$0";
        J23 j23 = this.a;
        Intrinsics.checkNotNullParameter(j23, (String)object2);
        int n3 = object.getId();
        int n4 = R$id.fswmdTvRestoreItems;
        if (n3 == n4) {
            object = j23.e;
            if (object != null) {
                object.D0();
            }
        } else {
            n4 = R$id.fswmdTvContinueShopping;
            if (n3 == n4 && (object = j23.e) != null) {
                object.H();
            }
        }
    }
}

