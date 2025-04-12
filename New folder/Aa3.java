/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.res.Resources$Theme
 *  android.util.TypedValue
 */
import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.core.splashscreen.R$attr;
import kotlin.jvm.internal.Intrinsics;

public class Aa3 {
    public final Activity a;

    public Aa3(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a = activity;
    }

    public void a() {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = this.a.getTheme();
        int n3 = R$attr.windowSplashScreenBackground;
        boolean bl2 = true;
        theme.resolveAttribute(n3, typedValue, bl2);
        n3 = R$attr.windowSplashScreenAnimatedIcon;
        n3 = theme.resolveAttribute(n3, typedValue, bl2) ? 1 : 0;
        if (n3 != 0) {
            n3 = typedValue.resourceId;
            theme.getDrawable(n3);
        }
        n3 = R$attr.splashScreenIconSize;
        theme.resolveAttribute(n3, typedValue, bl2);
        Intrinsics.checkNotNullExpressionValue(theme, "currentTheme");
        this.b(theme, typedValue);
    }

    public final void b(Resources.Theme theme, TypedValue typedValue) {
        Intrinsics.checkNotNullParameter(theme, "currentTheme");
        String string2 = "typedValue";
        Intrinsics.checkNotNullParameter(typedValue, string2);
        int n3 = R$attr.postSplashScreenTheme;
        boolean bl2 = true;
        int n4 = theme.resolveAttribute(n3, typedValue, bl2);
        if (n4 != 0 && (n4 = typedValue.resourceId) != 0) {
            typedValue = this.a;
            typedValue.setTheme(n4);
        }
    }
}

