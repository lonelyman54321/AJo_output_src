/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class T61$d
implements gx0_2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ f23_0 b;
    public final /* synthetic */ FragmentManager c;
    public final /* synthetic */ yT1 d;
    public final /* synthetic */ yT1 e;
    public final /* synthetic */ Function2 f;

    public T61$d(dr0_0 dr0_02, f23_0 f23_02, FragmentManager fragmentManager, yT1 yT12, yT1 yT13, Function2 function2) {
        this.a = dr0_02;
        this.b = f23_02;
        this.c = fragmentManager;
        this.d = yT12;
        this.e = yT13;
        this.f = function2;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (mk2_0)object;
        Object object4 = object2;
        object4 = (b30_0)object2;
        int n3 = ((Number)object3).intValue();
        object3 = "innerPadding";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n4 = n3 & 0xE;
        if (n4 == 0) {
            n4 = (int)(object4.J(object) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n3 |= n4;
        }
        if ((n3 &= 0x5B) == (n4 = 18) && (n3 = (int)(object4.h() ? 1 : 0)) != 0) {
            object4.D();
        } else {
            object2 = LP1$a.b;
            LP1 lP1 = h.d((LP1)object2, (mk2_0)object);
            yT1 yT12 = this.e;
            Function2 function2 = this.f;
            dr0_0 dr0_02 = this.a;
            f23_0 f23_02 = this.b;
            FragmentManager fragmentManager = this.c;
            yT1 yT13 = this.d;
            object = new v61_0(dr0_02, f23_02, fragmentManager, yT13, yT12, function2);
            n3 = 1087564250;
            u10 u102 = v10.c(n3, (fx0_2)object, (b30_0)object4);
            int n7 = 3072;
            int n8 = 6;
            OA.a(lP1, null, false, u102, (b30_0)object4, n7, n8);
        }
        return Unit.a;
    }
}

