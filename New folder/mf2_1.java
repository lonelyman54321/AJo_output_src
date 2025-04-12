/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mF2
 */
public final class mf2_1
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ i70_0 c;
    public final /* synthetic */ i13 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ mf2_1(LP1 lP1, Object object, i70_0 i70_02, rp2_0 rp2_02, boolean bl2, int n3, int n4) {
        this.a = lP1;
        this.b = object;
        this.c = i70_02;
        this.d = rp2_02;
        this.e = bl2;
        this.f = n3;
        this.g = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        LP1 lP1 = this.a;
        Intrinsics.checkNotNullParameter(lP1, "$modifier");
        Object object4 = this.b;
        Intrinsics.checkNotNullParameter(object4, "$imageModel");
        i70_0 i70_02 = this.c;
        Intrinsics.checkNotNullParameter(i70_02, "$contentScale");
        object = this.d;
        Intrinsics.checkNotNullParameter(object, "$shape");
        int n3 = Me3.b(this.f | 1);
        int n4 = this.g;
        Object object5 = object;
        object5 = (rp2_0)object;
        boolean bl2 = this.e;
        AF2.a(lP1, object4, i70_02, (rp2_0)object5, bl2, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

