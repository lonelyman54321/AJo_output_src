/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$y;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.web.game.MyRewardsWebActivity;
import com.ril.ajio.web.game.MyRewardsWebActivity$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from So
 */
public final class so_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ so_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (NewProductDetailsFragment)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object2.getClass();
                object = ((NewProductDetailsFragment)object2).L;
                if (object != null && (object = ((RecyclerView)object).getAdapter()) != null) {
                    n3 = ((RecyclerView$f)object).getItemCount();
                    for (int i3 = 0; i3 < n3; ++i3) {
                        int n4;
                        int n7 = ((RecyclerView$f)object).getItemViewType(i3);
                        if (n7 != (n4 = 313)) continue;
                        object = ((NewProductDetailsFragment)object2).L;
                        if (object == null || (object2 = ((RecyclerView)object).getLayoutManager()) == null) break;
                        RecyclerView$y recyclerView$y = new RecyclerView$y();
                        ((RecyclerView$o)object2).smoothScrollToPosition((RecyclerView)object, recyclerView$y, i3);
                        break;
                    }
                }
                return;
            }
            case 1: {
                MyRewardsWebActivity.a a2 = MyRewardsWebActivity.Companion;
                object2 = (MyRewardsWebActivity)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = ((MyRewardsWebActivity)object2).p2().toolbar;
                Intrinsics.checkNotNullExpressionValue(object, "toolbar");
                ai0_2.a((View)object);
                return;
            }
            case 0: 
        }
        AppStartTrace.f((AppStartTrace)object2);
    }
}

