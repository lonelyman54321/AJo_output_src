/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.Intrinsics;

public final class RF1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RF1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                String string2 = "this$0";
                object = (mr2_0)object;
                Intrinsics.checkNotNullParameter(object, string2);
                object = ((mr2_0)object).b;
                if (object != null) {
                    object.t();
                }
                return;
            }
            case 0: 
        }
        object = (BottomSheetDialog)object;
        Intrinsics.checkNotNullParameter(object, "$bottomSheetDialog");
        ((on)object).dismiss();
    }
}

