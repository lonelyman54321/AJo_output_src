/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class GG1$a
implements NX0 {
    public final Object apply(Object object) {
        object = (String)object;
        Object object2 = bf0_0.a;
        if (object2 != null) {
            boolean bl2;
            if (object != null && !(bl2 = b.k((CharSequence)object))) {
                bl2 = TextUtils.isDigitsOnly((CharSequence)object);
                String string2 = "";
                String string3 = "searchQuery";
                if (bl2) {
                    Intrinsics.checkNotNullExpressionValue(object, string3);
                    object = ((lb1_0)object2).a((String)object, string2);
                } else {
                    Intrinsics.checkNotNullExpressionValue(object, string3);
                    object = ((lb1_0)object2).a(string2, (String)object);
                }
            } else {
                object = ((lb1_0)object2).a.b().f();
            }
            return object;
        }
        object2 = "You can't access the transaction repository if you don't initialize it!".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

