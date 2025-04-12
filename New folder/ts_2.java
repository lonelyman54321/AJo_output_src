/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ts
 */
public final class ts_2
implements Function2 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ft1_2 c;
    public final /* synthetic */ ft1_2 d;
    public final /* synthetic */ LP1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ int i;

    public /* synthetic */ ts_2(p83_0 p83_02, String string2, ft1_2 ft1_22, ft1_2 ft1_23, LP1 lP1, int n3, String string3, String string4, int n4) {
        this.a = p83_02;
        this.b = string2;
        this.c = ft1_22;
        this.d = ft1_23;
        this.e = lP1;
        this.f = n3;
        this.g = string3;
        this.h = string4;
        this.i = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        ft1_2 ft1_22 = this.c;
        Intrinsics.checkNotNullParameter(ft1_22, "$listStateColumn");
        ft1_2 ft1_23 = this.d;
        Intrinsics.checkNotNullParameter(ft1_23, "$listStateRow");
        LP1 lP1 = this.e;
        Intrinsics.checkNotNullParameter(lP1, "$modifier");
        String string2 = this.g;
        Intrinsics.checkNotNullParameter(string2, "$uuidSubComponent");
        String string3 = this.h;
        Intrinsics.checkNotNullParameter(string3, "$thumbnailUrl");
        int n3 = Me3.b(this.i | 1);
        p83_0 p83_02 = this.a;
        String string4 = this.b;
        int n4 = this.f;
        vs_1.a(p83_02, string4, ft1_22, ft1_23, lP1, n4, string2, string3, (b30_0)object3, n3);
        return Unit.a;
    }
}

