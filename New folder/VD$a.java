/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class VD$a
extends Lambda
implements Function1 {
    public static final VD$a c;

    static {
        VD$a vD$a;
        c = vD$a = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (I30)object;
        Object object2 = AndroidCompositionLocals_androidKt.b;
        boolean bl2 = (object = ((Context)object.c((vc3_1)object2)).getPackageManager()).hasSystemFeature((String)(object2 = "android.software.leanback"));
        if (!bl2) {
            UD.a.getClass();
            object = UD$a.c;
        } else {
            object = VD.b;
        }
        return object;
    }
}

