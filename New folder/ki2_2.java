/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  android.text.Spanned
 *  android.view.View
 */
import android.graphics.Point;
import android.text.Spanned;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kI2
 */
public final class ki2_2 {
    public static final /* synthetic */ Point a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int[] nArray = new int[]{0, 0};
        view.getLocationOnScreen(nArray);
        int n3 = nArray[0];
        int n4 = nArray[1];
        view = new Point(n3, n4);
        return view;
    }

    public static final boolean b(Spanned spanned, Class clazz) {
        int n3;
        int n4 = -1;
        int n7 = spanned.length();
        int n8 = spanned.nextSpanTransition(n4, n7, clazz);
        if (n8 != (n3 = spanned.length())) {
            n3 = 1;
        } else {
            n3 = 0;
            spanned = null;
        }
        return n3;
    }
}

