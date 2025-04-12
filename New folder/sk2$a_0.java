/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SK2$a
 */
public final class sk2$a_0
implements eL0$a {
    public final el0_0 a(Object object, ba2 ba22) {
        String string2;
        Object object2 = (object = (Uri)object).getScheme();
        boolean bl2 = Intrinsics.areEqual(object2, string2 = "android.resource");
        object = !bl2 ? null : (object2 = new sk2_0((Uri)object, ba22));
        return object;
    }
}

