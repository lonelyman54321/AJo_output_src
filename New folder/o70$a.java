/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public final class o70$a
implements eL0$a {
    public final el0_0 a(Object object, ba2 ba22) {
        String string2;
        Object object2 = (object = (Uri)object).getScheme();
        boolean bl2 = Intrinsics.areEqual(object2, string2 = "content");
        object = !bl2 ? null : (object2 = new o70_0((Uri)object, ba22));
        return object;
    }
}

