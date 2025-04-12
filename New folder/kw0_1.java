/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kW0
 */
public final class kw0_1 {
    /*
     * WARNING - void declaration
     */
    public static boolean a(Context object) {
        void var3_6;
        Intrinsics.checkNotNullParameter(object, "context");
        String string2 = "entryPoint";
        Object[] objectArray = kW0$a.class;
        Intrinsics.checkNotNullParameter(objectArray, string2);
        object = Vx2.b(object.getApplicationContext());
        object = ((kW0$a)da0_2.a(objectArray, object)).a();
        boolean bl2 = object.size();
        objectArray = null;
        boolean bl3 = true;
        if (bl2 <= bl3) {
            boolean bl4 = true;
        } else {
            boolean bl5 = false;
            string2 = null;
        }
        String string3 = "Cannot bind the flag @DisableFragmentGetContextFix more than once.";
        objectArray = new Object[]{};
        mx2_2.a((boolean)var3_6, string3, objectArray);
        boolean bl6 = object.isEmpty();
        if (bl6) {
            return bl3;
        }
        return (Boolean)object.iterator().next();
    }
}

