/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.view.View
 *  android.widget.LinearLayout
 */
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ij2
 */
public final class ij2_2
extends RecyclerView$B {
    public final View a;
    public final yi2_1 b;
    public final c92 c;
    public final sj2_0 d;
    public final zi2_1 e;
    public final View f;
    public final LinearLayout g;
    public final View h;

    public ij2_2(View object, yi2_1 yi2_12, c92 c922, sj2_0 object2, zi2_1 zi2_12) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(c922, "onSizeClickListener");
        Intrinsics.checkNotNullParameter(object2, "pdpuiDelegateListener");
        String string2 = "pdpInfoSetter";
        Intrinsics.checkNotNullParameter(zi2_12, string2);
        super((View)object);
        this.a = object;
        this.b = yi2_12;
        this.c = c922;
        this.d = object2;
        this.e = zi2_12;
        Intrinsics.checkNotNullParameter(object, "itemView");
        this.f = object;
        int n3 = R$id.new_pdp_size_row_layout;
        yi2_12 = (LinearLayout)object.findViewById(n3);
        this.g = yi2_12;
        n3 = (int)(og1_1.c() ? 1 : 0);
        c922 = null;
        if (n3 != 0) {
            object2 = Looper.getMainLooper();
            super((Looper)object2);
            int n4 = 1;
            object2 = new ex1_1(this, n4);
            long l2 = 100;
            yi2_12.postDelayed((Runnable)object2, l2);
        } else {
            yi2_12 = this.g;
            if (yi2_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parentLayout");
                n3 = 0;
                yi2_12 = null;
            }
            ai0_2.m((View)yi2_12);
        }
        n3 = R$id.shadow_layout;
        this.h = object = object.findViewById(n3);
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shadowLayout");
            object = null;
        }
        n3 = 8;
        object.setVisibility(n3);
        object = this.f;
        if (object == null) {
            object = "parentView";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            c922 = object;
        }
        c922.setVisibility(0);
    }
}

