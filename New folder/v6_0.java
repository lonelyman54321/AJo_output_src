/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from V6
 */
public final class v6_0
implements Function0 {
    public final /* synthetic */ j7_0 a;

    public /* synthetic */ v6_0(j7_0 j7_02) {
        this.a = j7_02;
    }

    public final Object invoke() {
        Object object = this.a;
        String string2 = "$viewModel";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((j7_0)object).g;
        if (object != null) {
            boolean bl2 = true;
            ((AjioHomeActivity)object).c(bl2);
        }
        return Unit.a;
    }
}

