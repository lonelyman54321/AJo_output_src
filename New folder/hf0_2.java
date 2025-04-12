/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Hf0
 */
public final class hf0_2
implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ hf0_2(boolean bl2, p93_0 p93_02, LP1 lP1, int n3) {
        this.a = bl2;
        this.b = p93_02;
        this.c = lP1;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$onClick");
        int n3 = Me3.b(this.d | 1);
        LP1 lP1 = this.c;
        object2 = (p93_0)object2;
        if0_1.a(this.a, (p93_0)object2, lP1, (b30_0)object, n3);
        return Unit.a;
    }
}

