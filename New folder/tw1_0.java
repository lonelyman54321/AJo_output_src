/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 */
import android.content.DialogInterface;
import com.google.android.material.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TW1
 */
public final class tw1_0
implements DialogInterface.OnShowListener {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ tw1_0(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final void onShow(DialogInterface object) {
        int n3;
        object = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((ex1_0)object).y0;
        if (object != null) {
            n3 = R$id.design_bottom_sheet;
            object = ((on)object).findViewById(n3);
        } else {
            object = null;
        }
        if (object != null) {
            n3 = 0;
            string2 = null;
            object.setBackgroundColor(0);
        }
    }
}

