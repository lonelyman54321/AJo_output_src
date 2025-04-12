/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 */
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;

/*
 * Renamed from Ja
 */
public final class ja_0
implements e62_0 {
    public final /* synthetic */ Ref$LongRef a;
    public final /* synthetic */ ia_0 b;

    public ja_0(Ref$LongRef ref$LongRef, ia_0 ia_02) {
        this.a = ref$LongRef;
        this.b = ia_02;
    }

    public final void a(yr0_2 yr0_22) {
        Intrinsics.checkNotNullParameter(yr0_22, "s");
        this.b.n1 = yr0_22;
    }

    public final void b(Object object) {
        long l2;
        long l3;
        long l4;
        ((Number)object).longValue();
        object = this.a;
        long l7 = ((Ref$LongRef)object).element;
        int n3 = 1000;
        long l8 = n3;
        ((Ref$LongRef)object).element = l7 -= l8;
        String string2 = k7.l(l7);
        ia_0 ia_02 = this.b;
        TextView textView = ia_02.M;
        if (textView != null) {
            String string3 = "Offer Ends in: ";
            string2 = string3.concat(string2);
            textView.setText((CharSequence)string2);
        }
        if ((l4 = (l3 = (l8 = ((Ref$LongRef)object).element) - (l2 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) <= 0) {
            object = ia_02.M;
            if (object != null) {
                int n4 = 8;
                object.setVisibility(n4);
            }
            if ((object = ia_02.n1) != null) {
                object.dispose();
            }
        } else {
            object = ia_02.M;
            if (object != null) {
                boolean bl2 = false;
                string2 = null;
                object.setVisibility(0);
            }
        }
    }

    public final void onComplete() {
    }

    public final void onError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "e");
    }
}

