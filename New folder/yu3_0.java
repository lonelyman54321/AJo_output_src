/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yu3
 */
public final class yu3_0
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;

    public /* synthetic */ yu3_0(LP1 lP1, float f5, long l2, long l3, Function0 function0, int n3) {
        this.a = lP1;
        this.b = f5;
        this.c = l2;
        this.d = l3;
        this.e = function0;
        this.f = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        LP1 lP1 = this.a;
        Intrinsics.checkNotNullParameter(lP1, "$modifier");
        Function0 function0 = this.e;
        Intrinsics.checkNotNullParameter(function0, "$onShareClicked");
        int n3 = Me3.b(this.f | 1);
        long l2 = this.c;
        long l3 = this.d;
        float f5 = this.b;
        ov3.h(lP1, f5, l2, l3, function0, (b30_0)object3, n3);
        return Unit.a;
    }
}

