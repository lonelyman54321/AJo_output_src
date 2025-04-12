/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$y;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class c9
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ c9(ViewGroup viewGroup, int n3) {
        this.a = n3;
        this.b = viewGroup;
    }

    public final void run() {
        int n3 = 1;
        Object object = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                Object object2 = na3_2.Companion;
                object = (ConstraintLayout)((Object)object);
                Intrinsics.checkNotNullParameter(object, "$parentLyt");
                object2 = StringCompanionObject.INSTANCE;
                object2 = hv3_0.K(R$string.acc_info_popup);
                String string2 = hv3_0.K(R$string.total_spent);
                Object[] objectArray = new Object[n3];
                objectArray[0] = string2;
                an_1.a(objectArray, n3, (String)object2, "format(...)", (ConstraintLayout)((Object)object));
                ai0_2.a((View)object);
                return;
            }
            case 1: {
                object = (NestedScrollView)object;
                Intrinsics.checkNotNullParameter(object, "$scrollView");
                ((NestedScrollView)object).f(130);
                return;
            }
            case 0: 
        }
        Object object3 = q9_0.Companion;
        object = (RecyclerView)object;
        Intrinsics.checkNotNullParameter(object, "$this_apply");
        object3 = ((RecyclerView)object).getLayoutManager();
        if (object3 != null) {
            RecyclerView$y recyclerView$y = new RecyclerView$y();
            ((RecyclerView$o)object3).smoothScrollToPosition((RecyclerView)object, recyclerView$y, 0);
        }
    }
}

