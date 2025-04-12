/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 */
import android.widget.TextView;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class He1 {
    public static void a(Object[] object, int n3, String string2, String string3, TextView textView) {
        object = Arrays.copyOf(object, n3);
        object = String.format(string2, object);
        Intrinsics.checkNotNullExpressionValue(object, string3);
        textView.setContentDescription((CharSequence)object);
    }
}

