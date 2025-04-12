/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.willy.ratingbar.BaseRatingBar;
import com.willy.ratingbar.ScaleRatingBar;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ha0
 */
public final class ha0_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ha0_1(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (ScaleRatingBar)((Object)object);
                qz1_2 qz1_22 = (qz1_2)this.b;
                Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
                Intrinsics.checkNotNullParameter(object, "it");
                SelectedOrderItem selectedOrderItem = (SelectedOrderItem)this.c;
                float f5 = qz1_22.r(selectedOrderItem);
                ((BaseRatingBar)((Object)object)).setRating(f5);
                return Unit.a;
            }
            case 0: 
        }
        object = (jr1_0)object;
        Object object2 = (List)this.b;
        Intrinsics.checkNotNullParameter(object2, "$data");
        LP1 lP1 = (LP1)this.c;
        Intrinsics.checkNotNullParameter(lP1, "$cardModifier");
        Intrinsics.checkNotNullParameter(object, "$this$LazyVerticalGrid");
        int n4 = object2.size();
        object2 = (ArrayList)object2;
        ka0$b ka0$b = new ka0$b(lP1, (ArrayList)object2);
        object2 = new u10(-224683191, ka0$b, true);
        Uo0.f((jr1_0)object, n4, (u10)object2);
        return Unit.a;
    }
}

