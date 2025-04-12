/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class XA
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ XA(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                int n4;
                uq2_0 uq2_02 = (uq2_0)this.b;
                Intrinsics.checkNotNullParameter(uq2_02, "this$0");
                object = WX0.CLOSE_DIALOG;
                ArrayList arrayList = uq2_02.v;
                if (arrayList != null) {
                    n4 = arrayList.size();
                } else {
                    n4 = 0;
                    arrayList = null;
                }
                uq2_02.Sa((WX0)((Object)object), n4);
                uq2_02.dismiss();
                return;
            }
            case 2: {
                mc2_0 mc2_02 = (mc2_0)this.b;
                Intrinsics.checkNotNullParameter(mc2_02, "this$0");
                object = mc2_02.i;
                if (object != null) {
                    int n7 = mc2_02.h;
                    List list = mc2_02.c;
                    object.J2(n7, list);
                }
                mc2_02.dismissAllowingStateLoss();
                return;
            }
            case 1: {
                iq_0 iq_02 = (iq_0)this.b;
                Intrinsics.checkNotNullParameter(iq_02, "this$0");
                object = iq_02.h;
                if (object != null) {
                    object.z2();
                }
                if ((object = iq_02.getParentFragment()) != null && (object = ((Fragment)object).getChildFragmentManager()) != null) {
                    ((FragmentManager)object).W();
                }
                return;
            }
            case 0: 
        }
        YA yA = (YA)this.b;
        Intrinsics.checkNotNullParameter(yA, "this$0");
        yA.a.a1();
    }
}

