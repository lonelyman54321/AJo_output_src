/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ii2
 */
public final class ii2_2
implements Function1 {
    public final /* synthetic */ li2_2 a;

    public /* synthetic */ ii2_2(li2_2 li2_22) {
        this.a = li2_22;
    }

    public final Object invoke(Object object) {
        object = (Long)object;
        li2_2 li2_22 = this.a;
        Object object2 = "this$0";
        Intrinsics.checkNotNullParameter(li2_22, (String)object2);
        li2_22 = li2_22.t;
        if (li2_22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
            li2_22 = null;
        }
        object2 = eb_2.a;
        Intrinsics.checkNotNull(object);
        object = eb_2.a((Long)object);
        li2_22.setText((CharSequence)object);
        return Unit.a;
    }
}

