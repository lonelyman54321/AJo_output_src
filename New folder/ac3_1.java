/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aC3
 */
public final class ac3_1
implements Function2 {
    public final /* synthetic */ ft1_2 a;
    public final /* synthetic */ LP1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ ac3_1(ft1_2 ft1_22, LP1 lP1, String string2, int n3, boolean bl2, int n4, int n7) {
        this.a = ft1_22;
        this.b = lP1;
        this.c = string2;
        this.d = n3;
        this.e = bl2;
        this.f = n4;
        this.g = n7;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        ft1_2 ft1_22 = this.a;
        Intrinsics.checkNotNullParameter(ft1_22, "$listState");
        LP1 lP1 = this.b;
        Intrinsics.checkNotNullParameter(lP1, "$modifier");
        String string2 = this.c;
        Intrinsics.checkNotNullParameter(string2, "$videoUrl");
        int n3 = Me3.b(this.f | 1);
        int n4 = this.d;
        boolean bl2 = this.e;
        int n7 = this.g;
        cc3_1.b(ft1_22, lP1, string2, n4, bl2, (b30_0)object3, n3, n7);
        return Unit.a;
    }
}

