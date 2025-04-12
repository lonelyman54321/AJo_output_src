/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lK2
 */
public final class lk2_0
extends XO1 {
    public final Context a;

    public lk2_0(Context context, int n3, int n4) {
        Intrinsics.checkNotNullParameter(context, "mContext");
        super(n3, n4);
        this.a = context;
    }

    public final void migrate(xg3_1 xg3_12) {
        Object object = "db";
        Intrinsics.checkNotNullParameter(xg3_12, (String)object);
        int n3 = this.endVersion;
        int n4 = 10;
        int n7 = 1;
        String string2 = "reschedule_needed";
        if (n3 >= n4) {
            object = n7;
            n4 = 2;
            Object[] objectArray = new Object[n4];
            objectArray[0] = string2;
            objectArray[n7] = object;
            xg3_12.n0(objectArray);
        } else {
            xg3_12 = this.a;
            object = "androidx.work.util.preferences";
            xg3_12 = xg3_12.getSharedPreferences((String)object, 0).edit().putBoolean(string2, n7 != 0);
            xg3_12.apply();
        }
    }
}

