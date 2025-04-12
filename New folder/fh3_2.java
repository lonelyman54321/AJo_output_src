/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fh3
 */
public final class fh3_2 {
    public static final void a(dr0_0 dr0_02, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        int n4 = -1726089756;
        object = object.g(n4);
        Object object2 = AndroidCompositionLocals_androidKt.b;
        object2 = zv0_2.b((Context)((j30_0)object).j((H30)object2));
        boolean bl2 = object2 instanceof Activity;
        if (bl2) {
            object2 = (Activity)object2;
        } else {
            n4 = 0;
            object2 = null;
        }
        LP1 lP1 = j.c;
        long l2 = nz_1.a;
        Object object3 = fg2_1.a;
        lP1 = a.b(lP1, l2, (i13)object3);
        fh3$a fh3$a = new fh3$a(dr0_02, (Activity)object2);
        n4 = -1997059398;
        object3 = v10.c(n4, fh3$a, (b30_0)object);
        fh3$a = null;
        int n7 = 3078;
        int n8 = 6;
        OA.a(lP1, null, false, (u10)object3, (b30_0)object, n7, n8);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new dh3_2(dr0_02, n3);
        }
    }
}

