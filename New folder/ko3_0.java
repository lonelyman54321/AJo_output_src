/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ko3
 */
public final class ko3_0
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;

    public /* synthetic */ ko3_0(String string2, int n3) {
        this.a = string2;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.a;
        Intrinsics.checkNotNullParameter(string2, "$title");
        int n3 = Me3.b(this.b | 1);
        ro3_0.d(string2, (b30_0)object, n3);
        return Unit.a;
    }
}

