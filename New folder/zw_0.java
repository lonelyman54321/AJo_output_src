/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.LinearLayout
 */
import android.widget.LinearLayout;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zW
 */
public final class zw_0 {
    public static void a(Object[] object, int n3, String string2, String string3, LinearLayout linearLayout) {
        object = Arrays.copyOf(object, n3);
        object = String.format(string2, object);
        Intrinsics.checkNotNullExpressionValue(object, string3);
        linearLayout.setContentDescription((CharSequence)object);
    }
}

