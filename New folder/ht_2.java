/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ht
 */
public final class ht_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ ht_2(long l2, String string2, String string3, int n3) {
        this.a = string2;
        this.b = string3;
        this.c = l2;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.a;
        Intrinsics.checkNotNullParameter(string2, "$title");
        String string3 = this.b;
        Intrinsics.checkNotNullParameter(string3, "$desc");
        int n3 = Me3.b(this.d | 1);
        long l2 = this.c;
        qt_0.d(string2, string3, l2, (b30_0)object3, n3);
        return Unit.a;
    }
}

