/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.facebook.internal.c$a;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/*
 * Renamed from Zz
 */
public final class zz_0
implements E2,
o60_0,
c$a,
js0_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ zz_0(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public double c(double d2) {
        gp2_0 gp2_02 = (gp2_0)this.a;
        double d5 = gp2_02.k.c(d2);
        double d7 = gp2_02.e;
        double d9 = gp2_02.f;
        return f.e(d5, d7, d9);
    }

    public boolean perform(View view, E2$a e2$a) {
        return BottomSheetDragHandleView.d((BottomSheetDragHandleView)((Object)this.a), view, e2$a);
    }
}

