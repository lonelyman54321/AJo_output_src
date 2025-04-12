/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 */
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from x20
 */
public final class x20_0 {
    public static final LP1 a(LP1 lP1, boolean bl2, Function1 function1, Function1 function12) {
        Intrinsics.checkNotNullParameter(lP1, "<this>");
        Intrinsics.checkNotNullParameter(function1, "ifTrue");
        LP1$a lP1$a = LP1$a.b;
        if (bl2) {
            LP1 lP12 = (LP1)function1.invoke(lP1$a);
            lP1 = lP1.then(lP12);
        } else if (function12 != null) {
            LP1 lP13 = (LP1)function12.invoke(lP1$a);
            lP1 = lP1.then(lP13);
        }
        return lP1;
    }

    public static final float b(float f5, b30_0 b30_02) {
        b30_02.K(1280285864);
        vc3_1 vc3_12 = O30.f;
        f5 = ((Vo0)b30_02.j(vc3_12)).J0(f5);
        b30_02.E();
        return f5;
    }

    public static final float c(Integer n3) {
        Intrinsics.checkNotNullParameter(n3, "<this>");
        float f5 = ((Number)n3).floatValue();
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        return TypedValue.applyDimension((int)1, (float)f5, (DisplayMetrics)displayMetrics);
    }

    public static final LP1 d(LP1 lP1, Function0 fx0_22) {
        Intrinsics.checkNotNullParameter(lP1, "<this>");
        Intrinsics.checkNotNullParameter(fx0_22, "onClick");
        x20$a x20$a = new x20$a((Function0)fx0_22);
        fx0_22 = ji1.a;
        return a30_0.a(lP1, (Function1)fx0_22, x20$a);
    }

    public static final float e(b30_0 b30_02, int n3) {
        b30_02.K(-1089647817);
        vc3_1 vc3_12 = O30.f;
        float f5 = ((Vo0)b30_02.j(vc3_12)).D0(n3);
        b30_02.E();
        return f5;
    }

    public static final LP1 f(LP1 lP1) {
        Intrinsics.checkNotNullParameter(lP1, "<this>");
        x20$b x20$b = x20$b.a;
        ji1$a ji1$a = ji1.a;
        return a30_0.a(lP1, ji1$a, x20$b);
    }

    public static final ArrayList g(ft1_2 ft1_22, float f5) {
        boolean bl2;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(ft1_22, string2);
        Object object = ft1_22.j().i();
        ArrayList arrayList = new ArrayList();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            Object object2 = e2;
            object2 = (Js1)e2;
            Intrinsics.checkNotNullParameter(ft1_22, string2);
            Intrinsics.checkNotNullParameter(object2, "info");
            Ts1 ts1 = ft1_22.j();
            int n3 = ts1.f();
            int n4 = object2.getOffset();
            n3 -= n4;
            n3 = Math.max(0, n3);
            int n7 = object2.getOffset();
            int n8 = object2.getSize() + n7;
            Ts1 ts12 = ft1_22.j();
            n7 = ts12.d();
            float f6 = Math.max(0, n8 -= n7) + n3;
            n4 = 1120403456;
            float f7 = 100.0f;
            f6 *= f7;
            float f8 = object2.getSize();
            f7 -= (f6 /= f8);
            object2 = null;
            f8 = Math.max(0.0f, f7);
            float f11 = f8 - f5;
            Object object3 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
            if (object3 < 0) continue;
            arrayList.add(e2);
        }
        return arrayList;
    }
}

