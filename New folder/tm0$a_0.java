/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TM0$a
 */
public final class tm0$a_0
implements Function0 {
    public final /* synthetic */ yh0_0 a;
    public final /* synthetic */ OO2 b;

    public tm0$a_0(yh0_0 yh0_02, OO2 oO2) {
        this.a = yh0_02;
        this.b = oO2;
    }

    public final Object invoke() {
        Object object = this.a;
        object.getClass();
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "data");
        object = ((yh0_0)object).j;
        p83_0 p83_02 = (p83_0)((h83_0)object).getValue();
        int n3 = p83_02.indexOf(object2);
        int n4 = -1;
        if (n3 != n4) {
            ((p83_0)((h83_0)object).getValue()).remove(n3);
            object = (p83_0)((h83_0)object).getValue();
            Boolean bl2 = ((OO2)object2).b;
            Intrinsics.checkNotNull(bl2);
            n4 = bl2 ^ 1;
            bl2 = n4 != 0;
            object2 = ((OO2)object2).a;
            Intrinsics.checkNotNullParameter(object2, "ratingValue");
            OO2 oO2 = new OO2((String)object2, bl2);
            ((p83_0)object).add(n3, oO2);
        }
        return Unit.a;
    }
}

