/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FI
 */
public final class fi_1 {
    public final Context a;
    public final String[] b;

    public fi_1(Context context, int ... nArray) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nArray, "sRID");
        this.a = context;
        int n3 = nArray.length;
        String[] stringArray = new String[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = this.a;
            int n4 = nArray[i3];
            object = object.getString(n4);
            String string2 = "context.getString(sRID[it])";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            stringArray[i3] = object;
        }
        this.b = stringArray;
    }
}

