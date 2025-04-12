/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class C02
implements F62 {
    public final /* synthetic */ D02 a;

    public /* synthetic */ C02(D02 d02) {
        this.a = d02;
    }

    public final void onChanged(Object object) {
        object = (Long)object;
        D02 d02 = this.a;
        Object object2 = "this$0";
        Intrinsics.checkNotNullParameter(d02, (String)object2);
        d02 = d02.j;
        if (d02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeTextView");
            d02 = null;
        }
        object2 = eb_2.a;
        Intrinsics.checkNotNull(object);
        object = eb_2.a((Long)object);
        d02.setText((CharSequence)object);
    }
}

