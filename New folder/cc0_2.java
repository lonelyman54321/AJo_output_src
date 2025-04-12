/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.services.data.Offers.AllOffersItem;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cc0
 */
public final class cc0_2
implements e62_0 {
    public final /* synthetic */ dc0_2 a;

    public cc0_2(dc0_2 dc0_22) {
        this.a = dc0_22;
    }

    public final void a(yr0_2 yr0_22) {
        Intrinsics.checkNotNullParameter(yr0_22, "d");
    }

    public final void b(Object object) {
        object = (Number)object;
        int n3 = ((Number)object).intValue();
        Object object2 = this.a;
        Object object3 = ((dc0_2)object2).g;
        object3 = object3 != null ? (AllOffersItem)((ArrayList)object3).get(n3) : null;
        if (object3 != null) {
            boolean bl2 = true;
            ((AllOffersItem)object3).setClicked(bl2);
            Object object4 = ((dc0_2)object2).g;
            if (object4 != null) {
                object4 = (AllOffersItem)((ArrayList)object4).remove(n3);
            }
            if ((object4 = ((dc0_2)object2).g) != null) {
                ((ArrayList)object4).add(n3, object3);
            }
            if ((object3 = ((dc0_2)object2).h) != null) {
                ((RecyclerView$f)object3).notifyItemChanged(n3);
            }
        }
        object = yn3_0.a;
        object2 = ((dc0_2)object2).f;
        object2 = kp1_0.c("onNext: ", (String)object2);
        object3 = new Object[]{};
        ((yn3$a)object).a((String)object2, (Object[])object3);
    }

    public final void onComplete() {
    }

    public final void onError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "e");
        yn3_0.a.b(throwable);
    }
}

