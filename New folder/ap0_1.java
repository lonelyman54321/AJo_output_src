/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aP0
 */
public final class ap0_1
implements gx0_2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ f23_0 b;
    public final /* synthetic */ FragmentManager c;
    public final /* synthetic */ yT1 d;
    public final /* synthetic */ yT1 e;
    public final /* synthetic */ Function2 f;

    public ap0_1(dr0_0 dr0_02, f23_0 f23_02, FragmentManager fragmentManager, yT1 yT12, yT1 yT13, Function2 function2) {
        this.a = dr0_02;
        this.b = f23_02;
        this.c = fragmentManager;
        this.d = yT12;
        this.e = yT13;
        this.f = function2;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (kl_0)object;
        Object object4 = object2;
        object4 = (b30_0)object2;
        ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(object, "$this$AnimatedVisibility");
        yT1 yT12 = this.d;
        yT1 yT13 = this.e;
        dr0_0 dr0_02 = this.a;
        f23_0 f23_02 = this.b;
        FragmentManager fragmentManager = this.c;
        Function2 function2 = this.f;
        T61.d(dr0_02, f23_02, fragmentManager, yT12, yT13, function2, (b30_0)object4, 37448);
        return Unit.a;
    }
}

