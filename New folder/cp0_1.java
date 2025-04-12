/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
import android.app.Activity;
import android.content.Context;
import androidx.compose.animation.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.d;
import com.google.accompanist.systemuicontroller.SystemUiController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from cP0
 */
public final class cp0_1
implements hx0_2 {
    public final /* synthetic */ SystemUiController a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ f23_0 c;
    public final /* synthetic */ FragmentManager d;
    public final /* synthetic */ yT1 e;
    public final /* synthetic */ yT1 f;
    public final /* synthetic */ Function2 g;

    public cp0_1(SystemUiController systemUiController, dr0_0 dr0_02, f23_0 f23_02, FragmentManager fragmentManager, yT1 yT12, yT1 yT13, hq0_2 hq0_22) {
        this.a = systemUiController;
        this.b = dr0_02;
        this.c = f23_02;
        this.d = fragmentManager;
        this.e = yT12;
        this.f = yT13;
        this.g = hq0_22;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        gx0_2 gx0_22;
        cp0_1 cp0_12 = this;
        Object object5 = object;
        object5 = (ek_1)object;
        Object object6 = object2;
        object6 = (d)object2;
        Object object7 = object3;
        object7 = (b30_0)object3;
        Object object8 = object4;
        ro.c((Number)object4, (ek_1)object5, "$this$composable", (d)object6, "it");
        long l2 = nz_1.a;
        int n3 = 10;
        SystemUiController systemUiController = this.a;
        jh3_2.h(systemUiController, l2, false, false, null, n3, null);
        yT1 yT12 = this.f;
        Function2 function2 = this.g;
        object6 = this.b;
        object8 = this.c;
        Object object9 = this.d;
        Object object10 = this.e;
        object5 = gx0_22;
        gx0_22 = new ap0_1((dr0_0)object6, (f23_0)object8, (FragmentManager)object9, (yT1)object10, yT12, function2);
        int n4 = -141883469;
        gx0_22 = v10.c(n4, gx0_22, (b30_0)object7);
        int n7 = 196614;
        int n8 = 30;
        object9 = null;
        object10 = null;
        yT12 = null;
        function2 = null;
        androidx.compose.animation.a.c(true, null, null, null, null, (u10)gx0_22, (b30_0)object7, n7, n8);
        object5 = AndroidCompositionLocals_androidKt.b;
        object5 = zv0_2.b((Context)object7.j((H30)object5));
        boolean bl2 = object5 instanceof Activity;
        object8 = null;
        if (bl2) {
            object5 = (Activity)object5;
        } else {
            n4 = 0;
            object5 = null;
        }
        object6 = Unit.a;
        object10 = cp0_12.b;
        object9 = new bp0_2((Activity)object5, (dr0_0)object10, null);
        ly0_0.d((b30_0)object7, object6, (Function2)object9);
        return object6;
    }
}

