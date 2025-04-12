/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from V61
 */
public final class v61_0
implements gx0_2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ f23_0 b;
    public final /* synthetic */ FragmentManager c;
    public final /* synthetic */ yT1 d;
    public final /* synthetic */ yT1 e;
    public final /* synthetic */ Function2 f;

    public v61_0(dr0_0 dr0_02, f23_0 f23_02, FragmentManager fragmentManager, yT1 yT12, yT1 yT13, Function2 function2) {
        this.a = dr0_02;
        this.b = f23_02;
        this.c = fragmentManager;
        this.d = yT12;
        this.e = yT13;
        this.f = function2;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (PA)object;
        Object object4 = object2;
        object4 = (b30_0)object2;
        int n3 = ((Number)object3).intValue();
        object3 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object4.h() ? 1 : 0)) != 0) {
            object4.D();
        } else {
            yT1 yT12 = this.d;
            yT1 yT13 = this.e;
            dr0_0 dr0_02 = this.a;
            f23_0 f23_02 = this.b;
            FragmentManager fragmentManager = this.c;
            Function2 function2 = this.f;
            int n7 = 37448;
            pp0_1.a(dr0_02, f23_02, fragmentManager, yT12, yT13, function2, (b30_0)object4, n7);
        }
        return Unit.a;
    }
}

