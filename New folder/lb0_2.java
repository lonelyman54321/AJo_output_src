/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lb0
 */
public final class lb0_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ lb0_2(String string2, int n3, int n4) {
        this.a = string2;
        this.b = n3;
        this.c = n4;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.a;
        Intrinsics.checkNotNullParameter(string2, "$title");
        int n3 = Me3.b(this.c | 1);
        int n4 = this.b;
        ob0_0.d(string2, n4, (b30_0)object, n3);
        return Unit.a;
    }
}

