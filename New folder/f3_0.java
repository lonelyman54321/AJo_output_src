/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.Context;
import android.content.Intent;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from F3
 */
public final class f3_0
extends x3 {
    public final Intent a(Context object, Object stringArray) {
        stringArray = (String)stringArray;
        Intrinsics.checkNotNullParameter(object, "context");
        object = "input";
        Intrinsics.checkNotNullParameter(stringArray, (String)object);
        stringArray = new String[]{stringArray};
        Intrinsics.checkNotNullParameter(stringArray, (String)object);
        object = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS");
        object = object.putExtra("androidx.activity.result.contract.extra.PERMISSIONS", stringArray);
        Intrinsics.checkNotNullExpressionValue(object, "Intent(ACTION_REQUEST_PE\u2026EXTRA_PERMISSIONS, input)");
        return object;
    }

    public final x3$a b(Context object, Object object2) {
        object2 = (String)object2;
        Intrinsics.checkNotNullParameter(object, "context");
        String string2 = "input";
        Intrinsics.checkNotNullParameter(object2, string2);
        int n3 = t70.checkSelfPermission(object, (String)object2);
        if (n3 == 0) {
            object2 = Boolean.TRUE;
            object = new x3$a((Serializable)object2);
        } else {
            n3 = 0;
            object = null;
        }
        return object;
    }

    public final Object c(int n3, Intent intent) {
        Object object;
        int n4;
        if (intent != null && n3 == (n4 = -1)) {
            object = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            boolean bl2 = false;
            intent = null;
            if (object != null) {
                for (Object object2 : object) {
                    if (object2 != false) continue;
                    bl2 = true;
                    break;
                }
            }
            object = bl2;
        } else {
            object = Boolean.FALSE;
        }
        return object;
    }
}

