/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;

public final class g32
implements e62_0 {
    public final /* synthetic */ Ref$LongRef a;
    public final /* synthetic */ f32 b;
    public final /* synthetic */ h32 c;

    public g32(Ref$LongRef ref$LongRef, f32 f322, h32 h322) {
        this.a = ref$LongRef;
        this.b = f322;
        this.c = h322;
    }

    public final void a(yr0_2 yr0_22) {
        Intrinsics.checkNotNullParameter(yr0_22, "s");
        this.c.g.b(yr0_22);
    }

    public final void b(Object object) {
        ((Number)object).longValue();
        object = this.a;
        long l2 = ((Ref$LongRef)object).element;
        int n3 = 1000;
        long l3 = n3;
        ((Ref$LongRef)object).element = l2 -= l3;
        String string2 = k7.l(l2);
        Object object2 = this.b;
        object2.getClass();
        String string3 = "timerValue";
        Intrinsics.checkNotNullParameter(string2, string3);
        object2 = ((f32)object2).q;
        object2.setText((CharSequence)string2);
        l3 = ((Ref$LongRef)object).element;
        long l4 = 0L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 <= 0) {
            l7 = 8;
            object2.setVisibility((int)l7);
        } else {
            l7 = 0;
            object = null;
            object2.setVisibility(0);
        }
    }

    public final void onComplete() {
    }

    public final void onError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "e");
    }
}

