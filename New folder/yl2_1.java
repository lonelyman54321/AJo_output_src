/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$layout;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Yl2
 */
public final class yl2_1
extends pv1_1 {
    public final ua0_0 b;

    public yl2_1(ua0_0 ua0_02) {
        Ov1$c ov1$c;
        Intrinsics.checkNotNullParameter(ua0_02, "errorListener");
        super(false);
        this.a = ov1$c;
        this.b = ua0_02;
    }

    public final void h(RecyclerView$B object, Ov1 ov1) {
        object = (zl2_1)object;
        Intrinsics.checkNotNullParameter(object, "holder");
        String string2 = "loadState";
        Intrinsics.checkNotNullParameter(ov1, string2);
        object.getClass();
        Intrinsics.checkNotNullParameter(ov1, string2);
        boolean bl2 = ov1 instanceof Ov1$b;
        if (bl2) {
            object = ((RecyclerView$B)object).itemView;
            boolean bl3 = false;
            ov1 = null;
            object.setVisibility(0);
        } else {
            string2 = ((RecyclerView$B)object).itemView;
            int n3 = 8;
            string2.setVisibility(n3);
            boolean bl4 = ov1 instanceof Ov1$a;
            if (bl4) {
                object = ((zl2_1)object).a;
                object.x0();
            }
        }
    }

    public final zl2_1 i(ViewGroup viewGroup, Ov1 object) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(object, "loadState");
        Object object2 = LayoutInflater.from((Context)viewGroup.getContext());
        int n3 = R$layout.shimmer_ac_progress;
        viewGroup = object2.inflate(n3, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object2 = this.b;
        object = new zl2_1((View)viewGroup, (ua0_0)object2);
        return object;
    }
}

