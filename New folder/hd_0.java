/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.pdprefresh.view.PDPInviteView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Hd
 */
public final class hd_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hd_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = this.b;
        String string2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                n3 = PDPInviteView.l;
                object = (PDPInviteView)((Object)object);
                Intrinsics.checkNotNullParameter(object, string2);
                object = ((PDPInviteView)((Object)object)).i;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("referralWidgetInfo");
                    object = null;
                }
                if ((object = ((uh2_0)object).c) != null) {
                    object.R3();
                }
                return;
            }
            case 0: 
        }
        object = (Kd$a)object;
        Intrinsics.checkNotNullParameter(object, string2);
        ((Kd$a)object).a.X7();
    }
}

