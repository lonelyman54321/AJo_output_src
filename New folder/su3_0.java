/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Su3
 */
public final class su3_0
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ tv0_0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ su3_0(LP1 lP1, tv0_0 tv0_02, Function0 function0, int n3) {
        this.a = lP1;
        this.b = tv0_02;
        this.c = "Following";
        this.d = function0;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        Intrinsics.checkNotNullParameter(this.c, "$buttonText");
        object2 = this.d;
        Intrinsics.checkNotNullParameter(object2, "$onButtonClicked");
        int n3 = Me3.b(this.e | 1);
        LP1 lP1 = this.a;
        tv0_0 tv0_02 = this.b;
        ov3.d(lP1, tv0_02, (Function0)object2, (b30_0)object, n3);
        return Unit.a;
    }
}

