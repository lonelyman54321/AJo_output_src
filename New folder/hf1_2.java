/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.myaccount.order.imps.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hf1
 */
public final class hf1_2
implements Function1 {
    public final /* synthetic */ d a;

    public /* synthetic */ hf1_2(d d2) {
        this.a = d2;
    }

    public final Object invoke(Object object) {
        object = (Boolean)object;
        Object object2 = d.Companion;
        object2 = "this$0";
        d d2 = this.a;
        Intrinsics.checkNotNullParameter(d2, (String)object2);
        if (object == null) {
            object = Unit.a;
        } else {
            boolean bl2 = (Boolean)object;
            if (bl2) {
                d2.Ua();
            }
            object = Unit.a;
        }
        return object;
    }
}

