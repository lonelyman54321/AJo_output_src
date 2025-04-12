/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nE1
 */
public final class ne1_2
implements Function0 {
    public final /* synthetic */ bf1_2 a;

    public /* synthetic */ ne1_2(bf1_2 bf1_22) {
        this.a = bf1_22;
    }

    public final Object invoke() {
        Object object = this.a;
        String string2 = "$viewModel";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((bf1_2)object).g;
        if (object != null) {
            boolean bl2 = true;
            ((AjioHomeActivity)object).f(bl2);
        }
        return Unit.a;
    }
}

