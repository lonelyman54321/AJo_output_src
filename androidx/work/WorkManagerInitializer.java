/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.work;

import android.content.Context;
import androidx.work.a;
import androidx.work.a$a;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class WorkManagerInitializer
implements wh1_0 {
    static {
        qx1.b("WrkMgrInitializer");
    }

    public final Object a(Context object) {
        qx1.a().getClass();
        Object object2 = new Object();
        a a2 = new a((a$a)object2);
        object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(a2, "configuration");
        ni3_1.j(object, a2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ni3_1.i(object);
        Intrinsics.checkNotNullExpressionValue(object, "getInstance(context)");
        return object;
    }

    public final List dependencies() {
        return Collections.emptyList();
    }
}

