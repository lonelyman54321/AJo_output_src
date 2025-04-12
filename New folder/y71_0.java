/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from y71
 */
public final class y71_0
extends RecyclerView$s {
    public final /* synthetic */ z71_0 a;

    public y71_0(z71_0 z71_02) {
        this.a = z71_02;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        Object object2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onScrollStateChanged((RecyclerView)object, n3);
        if (n3 == 0) {
            int n4;
            n3 = ig2_2.a((RecyclerView)object);
            object2 = this.a;
            if (n3 >= 0 && n3 != (n4 = ((z71_0)object2).g)) {
                object = ((RecyclerView)object).findViewHolderForAdapterPosition(n3);
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.home.landingpage.viewholder.cms.HomeListSubViewHolder");
                object = (x71_0)object;
                ma_2 ma_22 = ((z71_0)object2).f;
                if (ma_22 != null) {
                    n4 = ma_22.r;
                    ((x71_0)object).y(n4);
                    ma_22 = ((z71_0)object2).f;
                    ma_22.r = n3;
                }
                ((x71_0)object).z(n3);
            }
            ((z71_0)object2).g = n3;
        }
    }
}

