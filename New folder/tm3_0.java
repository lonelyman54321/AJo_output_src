/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.util.TypedValue
 *  android.view.Window
 */
import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.R$color;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Tm3
 */
public final class tm3_0 {
    public static int a(int n3, Context context) {
        TypedValue typedValue = new TypedValue();
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        context.getTheme().resolveAttribute(n3, typedValue, true);
        n3 = typedValue.resourceId;
        return t70.getColor(context, n3);
    }

    public static int b(int n3, Context context) {
        TypedValue typedValue = new TypedValue();
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        context.getTheme().resolveAttribute(n3, typedValue, true);
        return typedValue.resourceId;
    }

    public static final boolean c(int n3) {
        double d2;
        double d5 = hZ.e(n3);
        double d7 = d5 - (d2 = 0.5);
        n3 = (n3 = (int)(d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1))) > 0 ? 1 : 0;
        return n3 != 0;
    }

    public static final void d(FragmentActivity fragmentActivity) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(fragmentActivity, string2);
        int n3 = R$color.ajioColorPrimary;
        n3 = t70.getColor((Context)fragmentActivity, n3);
        Window window = fragmentActivity.getWindow();
        if (window != null) {
            window.setStatusBarColor(n3);
        }
        boolean bl3 = tm3_0.c(n3);
        tm3_0.f(fragmentActivity, bl3);
    }

    public static final void e(FragmentActivity fragmentActivity, String string2) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(string2, "storeId");
        String string3 = ld3_2.STORE_AJIOGRAM.getStoreId();
        int n3 = Intrinsics.areEqual(string2, string3);
        n3 = n3 != 0 ? R$color.fleekColorPrimary : R$color.ajioColorPrimary;
        n3 = t70.getColor((Context)fragmentActivity, n3);
        string3 = fragmentActivity.getWindow();
        if (string3 != null) {
            string3.setStatusBarColor(n3);
        }
        n3 = (int)(tm3_0.c(n3) ? 1 : 0);
        tm3_0.f(fragmentActivity, n3 != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static final void f(FragmentActivity fragmentActivity, boolean bl2) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(fragmentActivity, string2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            void var1_4;
            fragmentActivity = fragmentActivity.getWindow().getDecorView();
            string2 = "getDecorView(...)";
            Intrinsics.checkNotNullExpressionValue(fragmentActivity, string2);
            n3 = fragmentActivity.getSystemUiVisibility();
            if (bl2) {
                int n7 = n3 | 0x2000;
            } else {
                int n8 = n3 & 0xFFFFDFFF;
            }
            fragmentActivity.setSystemUiVisibility((int)var1_4);
        }
    }
}

