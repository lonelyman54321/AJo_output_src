/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ra0
 */
public final class ra0_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ ra0_2(String string2, long l2, int n3) {
        this.a = string2;
        this.b = l2;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.a;
        Intrinsics.checkNotNullParameter(string2, "$value");
        int n3 = Me3.b(this.c | 1);
        long l2 = this.b;
        ta0_0.b(string2, l2, (b30_0)object, n3);
        return Unit.a;
    }
}

