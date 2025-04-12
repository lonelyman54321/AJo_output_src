/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.closet.activity.ClosetAddToBagActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fW
 */
public final class fw_1
extends RecyclerView$s {
    public final /* synthetic */ ClosetAddToBagActivity a;

    public fw_1(ClosetAddToBagActivity closetAddToBagActivity) {
        this.a = closetAddToBagActivity;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int n3) {
        Object object;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, n3);
        n3 = (int)(recyclerView.canScrollHorizontally(-1) ? 1 : 0);
        int n4 = 1;
        String string2 = "sizeDecrementTv";
        RecyclerView recyclerView2 = null;
        ClosetAddToBagActivity closetAddToBagActivity = this.a;
        if (n3 == 0) {
            object = closetAddToBagActivity.q0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            int n7 = R$drawable.quantity_disable_dec;
            object.setBackgroundResource(n7);
            object = closetAddToBagActivity.q0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            n7 = R$string.acc_quantity_decrease_icon;
            String string3 = hv3_0.K(n7);
            object.setContentDescription((CharSequence)string3);
            object = closetAddToBagActivity.q0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            object.setClickable(false);
        } else {
            object = closetAddToBagActivity.q0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            int n8 = R$drawable.prevlevel_filters_arrow;
            object.setBackgroundResource(n8);
            object = closetAddToBagActivity.q0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            object.setClickable(n4 != 0);
        }
        int n10 = recyclerView.canScrollHorizontally(n4);
        object = "sizeIncrementTv";
        if (n10 == 0) {
            recyclerView = closetAddToBagActivity.p0;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                n10 = 0;
                recyclerView = null;
            }
            n4 = R$drawable.quantity_disable_inc;
            recyclerView.setBackgroundResource(n4);
            recyclerView = closetAddToBagActivity.p0;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                n10 = 0;
                recyclerView = null;
            }
            n4 = R$string.acc_quantity_increase_icon;
            String string4 = hv3_0.K(n4);
            recyclerView.setContentDescription(string4);
            recyclerView = closetAddToBagActivity.p0;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                recyclerView2 = recyclerView;
            }
            recyclerView2.setClickable(false);
        } else {
            recyclerView = closetAddToBagActivity.p0;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                n10 = 0;
                recyclerView = null;
            }
            recyclerView.setClickable(n4 != 0);
            recyclerView = closetAddToBagActivity.p0;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                recyclerView2 = recyclerView;
            }
            n10 = R$drawable.nextlevel_arrow;
            recyclerView2.setBackgroundResource(n10);
        }
    }
}

