/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;

/*
 * Renamed from dD2
 */
public final class dd2_2 {
    public static View a(int n3, View view) {
        int n4 = view instanceof ViewGroup;
        if (n4 == 0) {
            return null;
        }
        view = (ViewGroup)view;
        n4 = view.getChildCount();
        for (int i3 = 0; i3 < n4; ++i3) {
            View view2 = view.getChildAt(i3).findViewById(n3);
            if (view2 == null) continue;
            return view2;
        }
        return null;
    }

    public static final int b(cd2_2 object, IntRange object2) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        CharSequence charSequence = "range";
        Intrinsics.checkNotNullParameter(object2, (String)charSequence);
        boolean n3 = ((IntRange)object2).isEmpty();
        if (!n3) {
            int n4;
            int n7 = -1 >>> 1;
            int n8 = ((c)object2).a;
            int n10 = ((c)object2).b;
            int n14 = n10 < n7 ? ((cd2_2)object).d(n8, ++n10) : (n8 > (n4 = -1 << -1) ? ((cd2_2)object).d(n8 += -1, n10) + 1 : ((cd2_2)object).b());
            return n14;
        }
        charSequence = new StringBuilder("Cannot get random in empty range: ");
        ((StringBuilder)charSequence).append(object2);
        object2 = ((StringBuilder)charSequence).toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

