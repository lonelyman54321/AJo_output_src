/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QZ0
 */
public final class qz0_1
implements Function2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ qz0_1(String string2, int n3, List list) {
        this.a = list;
        this.b = string2;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$titleMsg");
        int n3 = Me3.b(this.c | 1);
        rz0_2.a(this.a, string2, (b30_0)object, n3);
        return Unit.a;
    }
}

