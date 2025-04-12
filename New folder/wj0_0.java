/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WJ0
 */
public final class wj0_0
implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ wj0_0(int n3) {
        this.a = n3;
    }

    public final Object invoke() {
        Object object = pp0_0.a;
        object = new StringBuilder();
        int n3 = this.a;
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append("|0");
        object = ((StringBuilder)object).toString();
        Intrinsics.checkNotNullParameter(object, "label");
        c80 c802 = pp0_0.b;
        hp0_2 hp0_22 = new hp0_2((String)object, null);
        Ae3.d(c802, null, null, hp0_22, 3);
        return Unit.a;
    }
}

