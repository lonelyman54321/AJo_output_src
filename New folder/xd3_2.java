/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xd3
 */
public final class xd3_2
implements Function2 {
    public final /* synthetic */ f23_0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ p83_0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ LP1 g;
    public final /* synthetic */ LP1 h;
    public final /* synthetic */ dr0_0 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ xd3_2(f23_0 f23_02, String string2, p83_0 p83_02, boolean bl2, int n3, Function2 function2, LP1 lP1, LP1 lP12, dr0_0 dr0_02, int n4, int n7) {
        this.a = f23_02;
        this.b = string2;
        this.c = p83_02;
        this.d = bl2;
        this.e = n3;
        this.f = function2;
        this.g = lP1;
        this.h = lP12;
        this.i = dr0_02;
        this.j = n4;
        this.k = n7;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        f23_0 f23_02 = this.a;
        Intrinsics.checkNotNullParameter(f23_02, "$sharedFleekViewModel");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$key");
        Function2 function2 = this.f;
        Intrinsics.checkNotNullParameter(function2, "$sendImpression");
        dr0_0 dr0_02 = this.i;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        int n3 = Me3.b(this.j | 1);
        p83_0 p83_02 = this.c;
        boolean bl2 = this.d;
        int n4 = this.e;
        LP1 lP1 = this.g;
        LP1 lP12 = this.h;
        int n7 = this.k;
        yd3_2.b(f23_02, string2, p83_02, bl2, n4, function2, lP1, lP12, dr0_02, (b30_0)object3, n3, n7);
        return Unit.a;
    }
}

