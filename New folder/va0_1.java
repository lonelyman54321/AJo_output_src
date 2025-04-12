/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Va0
 */
public final class va0_1
implements hx0_2 {
    public final /* synthetic */ ob0_1 a;

    public va0_1(ob0_1 ob0_12) {
        this.a = ob0_12;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (ek_1)object;
        object2 = (d)object2;
        object3 = (b30_0)object3;
        object4 = (Number)object4;
        Object object5 = "backStackEntry";
        ro.c((Number)object4, (ek_1)object, "$this$composable", (d)object2, (String)object5);
        object = AndroidCompositionLocals_androidKt.b;
        object = object3.j((H30)object);
        boolean bl2 = object instanceof Activity;
        object = bl2 ? (Activity)object : null;
        if (object != null) {
            object.finish();
        }
        object = Boolean.TRUE;
        object5 = this.a;
        object4 = new ua0_2((d)object2, (ob0_1)object5, null);
        ly0_0.d((b30_0)object3, object, (Function2)object4);
        return Unit.a;
    }
}

