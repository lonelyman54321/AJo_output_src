/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;

/*
 * Renamed from Ec0
 */
public final class ec0_2
implements e62_0 {
    public final /* synthetic */ Ref$LongRef a;
    public final /* synthetic */ AjioTextView b;
    public final /* synthetic */ Fc0$a c;

    public ec0_2(Ref$LongRef ref$LongRef, AjioTextView ajioTextView, Fc0$a fc0$a) {
        this.a = ref$LongRef;
        this.b = ajioTextView;
        this.c = fc0$a;
    }

    public final void a(yr0_2 yr0_22) {
        Intrinsics.checkNotNullParameter(yr0_22, "s");
        this.c.c.b(yr0_22);
    }

    public final void b(Object object) {
        ((Number)object).longValue();
        object = this.a;
        long l2 = ((Ref$LongRef)object).element;
        int n3 = 1000;
        long l3 = n3;
        ((Ref$LongRef)object).element = l2 -= l3;
        String string2 = k7.l(l2);
        AjioTextView ajioTextView = this.b;
        ajioTextView.setText(string2);
        l3 = ((Ref$LongRef)object).element;
        long l4 = 0L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 <= 0) {
            l7 = 8;
            ajioTextView.setVisibility((int)l7);
        } else {
            l7 = 0;
            object = null;
            ajioTextView.setVisibility(0);
        }
    }

    public final void onComplete() {
    }

    public final void onError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "e");
    }
}

