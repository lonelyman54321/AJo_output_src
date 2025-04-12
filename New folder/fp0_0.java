/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.animation.a;
import androidx.navigation.d;
import com.google.accompanist.systemuicontroller.SystemUiController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fP0
 */
public final class fp0_0
implements hx0_2 {
    public final /* synthetic */ SystemUiController a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ yT1 c;
    public final /* synthetic */ f23_0 d;

    public fp0_0(dr0_0 dr0_02, yT1 yT12, f23_0 f23_02, SystemUiController systemUiController) {
        this.a = systemUiController;
        this.b = dr0_02;
        this.c = yT12;
        this.d = f23_02;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        fp0_0 fp0_02 = this;
        Object object5 = object;
        object5 = (ek_1)object;
        Object object6 = object2;
        object6 = (d)object2;
        Object object7 = object3;
        object7 = (b30_0)object3;
        Object object8 = object4;
        ((Number)object4).intValue();
        object8 = "$this$composable";
        Intrinsics.checkNotNullParameter(object5, (String)object8);
        Intrinsics.checkNotNullParameter(object6, "backStackEntry");
        object5 = ((d)object6).a();
        object6 = null;
        if (object5 != null) {
            object8 = "brandId";
            object5 = object5.getString((String)object8);
        } else {
            object5 = null;
        }
        long l2 = nz_1.a;
        jh3_2.h(fp0_02.a, l2, false, false, null, 10, null);
        Unit unit = Unit.a;
        dr0_0 dr0_02 = fp0_02.b;
        object8 = new dp0_2(null, dr0_02);
        ly0_0.d((b30_0)object7, unit, (Function2)object8);
        object8 = fp0_02.c;
        f23_0 f23_02 = fp0_02.d;
        object6 = new ep0_0(dr0_02, (String)object5, (yT1)object8, f23_02);
        u10 u102 = v10.c(-484767278, (fx0_2)object6, (b30_0)object7);
        androidx.compose.animation.a.c(true, null, null, null, null, u102, (b30_0)object7, 196614, 30);
        return unit;
    }
}

