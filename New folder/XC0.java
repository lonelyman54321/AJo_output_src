/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import kotlin.jvm.internal.Intrinsics;

public final class XC0
implements View.OnClickListener {
    public final /* synthetic */ gd0_0 a;
    public final /* synthetic */ gD0$a b;
    public final /* synthetic */ NestedScrollView c;

    public /* synthetic */ XC0(gd0_0 gd0_02, gD0$a gD0$a, NestedScrollView nestedScrollView) {
        this.a = gd0_02;
        this.b = gD0$a;
        this.c = nestedScrollView;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        gD0$a gD0$a = this.b;
        Intrinsics.checkNotNullParameter(gD0$a, "$this_apply");
        NestedScrollView nestedScrollView = this.c;
        String string2 = "$scrollView";
        Intrinsics.checkNotNullParameter(nestedScrollView, string2);
        int n3 = 8;
        gd0_0.d((gd0_0)object, n3, 0);
        object = gD0$a.h;
        if (object != null) {
            ai0_2.B(object);
        }
        if ((object = gD0$a.q) != null) {
            ai0_2.B(object);
        }
        object = new c9((ViewGroup)nestedScrollView, 1);
        nestedScrollView.postDelayed((Runnable)object, 100);
    }
}

