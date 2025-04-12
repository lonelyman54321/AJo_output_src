/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.jio.jioads.videomodule.s;
import kotlin.jvm.internal.Intrinsics;

public final class kO2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kO2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = this.b;
        String string2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (s)object;
                Intrinsics.checkNotNullParameter(object, string2);
                int n4 = ((s)object).S;
                n3 = -1;
                if (n4 != n3 || (n4 = (int)(((s)object).W ? 1 : 0)) != 0) {
                    n4 = 0;
                    string2 = null;
                    ((s)object).M(false);
                }
                return;
            }
            case 0: 
        }
        object = (lo2_2)object;
        Intrinsics.checkNotNullParameter(object, string2);
        ((BottomSheetDialogFragment)object).dismiss();
    }
}

