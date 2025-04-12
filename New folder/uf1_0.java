/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Uf1
 */
public final class uf1_0
implements Runnable {
    public final void run() {
        Context context = FacebookSdk.a();
        Object object = wf1_0.h;
        object = jg1_1.f(context, object);
        Object object2 = wf1_0.a;
        Object object3 = null;
        wf1_0.a((wf1_0)object2, context, (ArrayList)object, false);
        object = wf1_0.h;
        object2 = jg1_1.class;
        boolean bl2 = td0.b(object2);
        ArrayList arrayList = null;
        if (!bl2) {
            object3 = "context";
            Intrinsics.checkNotNullParameter(context, (String)object3);
            object3 = jg1_1.a;
            String string2 = "subs";
            object = ((jg1_1)object3).e(context, object, string2);
            try {
                arrayList = ((jg1_1)object3).a((ArrayList)object);
            }
            catch (Throwable throwable) {
                td0.a(object2, throwable);
            }
        }
        wf1_0.a(wf1_0.a, context, arrayList, true);
    }
}

