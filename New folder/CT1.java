/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.e;
import androidx.navigation.l;
import androidx.navigation.p;
import androidx.navigation.q;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class CT1 {
    public static final yT1 a(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        yT1 yT12 = new e((Context)object);
        object = yT12.v;
        p p2 = new l((q)object);
        ((q)object).a(p2);
        object = yT12.v;
        p2 = new A20();
        ((q)object).a(p2);
        object = yT12.v;
        p2 = new fq0_0();
        ((q)object).a(p2);
        return yT12;
    }

    public static final yT1 b(p[] pArray, b30_0 object) {
        vc3_1 vc3_12 = AndroidCompositionLocals_androidKt.b;
        vc3_12 = (Context)object.j(vc3_12);
        int n3 = pArray.length;
        Object object2 = Arrays.copyOf(pArray, n3);
        Object object3 = new at1_1((Context)vc3_12);
        Object object4 = CS2.a;
        Object object5 = zt1_1.c;
        object4 = new ds2_0((Function2)object5, (Function1)object3);
        n3 = object.x(vc3_12) ? 1 : 0;
        object5 = object.v();
        if (n3 != 0 || object5 == (object3 = b30$a.a)) {
            object5 = new bt1_1((Context)vc3_12);
            object.o(object5);
        }
        object5 = (Function0)object5;
        int n4 = 4;
        object = (yT1)wi2_0.b(object2, (ds2_0)object4, (Function0)object5, (b30_0)object, 0, n4);
        int n7 = pArray.length;
        object3 = null;
        for (n3 = 0; n3 < n7; ++n3) {
            object2 = pArray[n3];
            object4 = ((e)object).v;
            ((q)object4).a((p)object2);
        }
        return object;
    }
}

