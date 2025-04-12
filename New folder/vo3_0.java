/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.view.View
 */
import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/*
 * Renamed from vo3
 */
public final class vo3_0 {
    public static void a(View view, CharSequence object) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4) {
            vo3$a.a(view, (CharSequence)object);
        } else {
            xo3_0 xo3_02 = xo3_0.k;
            n4 = 0;
            if (xo3_02 != null && (xo3_02 = xo3_02.a) == view) {
                xo3_0.b(null);
            }
            if ((n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0)) != 0) {
                object = xo3_0.l;
                if (object != null && (xo3_02 = ((xo3_0)object).a) == view) {
                    ((xo3_0)object).a();
                }
                view.setOnLongClickListener(null);
                object = null;
                view.setLongClickable(false);
                view.setOnHoverListener(null);
            } else {
                xo3_02 = new xo3_0(view, (CharSequence)object);
            }
        }
    }
}

