/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from N61
 */
public final class n61_0
implements Function2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ f23_0 b;
    public final /* synthetic */ FragmentManager c;
    public final /* synthetic */ yT1 d;
    public final /* synthetic */ yT1 e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ int g;

    public /* synthetic */ n61_0(dr0_0 dr0_02, f23_0 f23_02, FragmentManager fragmentManager, yT1 yT12, yT1 yT13, Function2 function2, int n3) {
        this.a = dr0_02;
        this.b = f23_02;
        this.c = fragmentManager;
        this.d = yT12;
        this.e = yT13;
        this.f = function2;
        this.g = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        dr0_0 dr0_02 = this.a;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        f23_0 f23_02 = this.b;
        Intrinsics.checkNotNullParameter(f23_02, "$sharedFleekVM");
        yT1 yT12 = this.d;
        Intrinsics.checkNotNullParameter(yT12, "$bottomNavigationController");
        yT1 yT13 = this.e;
        Intrinsics.checkNotNullParameter(yT13, "$fleekAppNavigationController");
        Function2 function2 = this.f;
        Intrinsics.checkNotNullParameter(function2, "$getCommitFunction");
        int n3 = Me3.b(this.g | 1);
        FragmentManager fragmentManager = this.c;
        T61.d(dr0_02, f23_02, fragmentManager, yT12, yT13, function2, (b30_0)object3, n3);
        return Unit.a;
    }
}

