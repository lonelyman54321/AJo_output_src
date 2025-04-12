/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jb2
 */
public final class jb2_2
implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ ol0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ LP1 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ jb2_2(boolean bl2, String string2, LP1 lP1, ol0 ol02, Function0 function0, long l2, LP1 lP12, int n3, int n4) {
        this.a = bl2;
        this.b = string2;
        this.c = lP1;
        this.d = ol02;
        this.e = function0;
        this.f = l2;
        this.g = lP12;
        this.h = n3;
        this.i = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$buttonText");
        LP1 lP1 = this.c;
        Intrinsics.checkNotNullParameter(lP1, "$modifier");
        Function0 function0 = this.e;
        Intrinsics.checkNotNullParameter(function0, "$onButtonClicked");
        int n3 = Me3.b(this.h | 1);
        boolean bl2 = this.a;
        ol0 ol02 = this.d;
        long l2 = this.f;
        LP1 lP12 = this.g;
        int n4 = this.i;
        vb2.a(bl2, string2, lP1, ol02, function0, l2, lP12, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

