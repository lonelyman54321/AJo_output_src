/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class dK$b {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(int n3, dk$a_0 dk$a_0) {
        synchronized (this) {
            Object object = "callback";
            Intrinsics.checkNotNullParameter(dk$a_0, (String)object);
            object = dk_1.c;
            Integer n4 = n3;
            boolean bl2 = ((HashMap)object).containsKey(n4);
            if (bl2) {
                return;
            }
            Integer n7 = n3;
            ((HashMap)object).put(n7, dk$a_0);
            return;
        }
    }
}

