/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 */
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$bool;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$styleable;

public final class M2 {
    public Context a;

    public static M2 a(Context context) {
        M2 m2 = new Object();
        m2.a = context;
        return m2;
    }

    public final int b() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int n3 = configuration.screenWidthDp;
        int n4 = configuration.screenHeightDp;
        int n7 = configuration.smallestScreenWidthDp;
        int n8 = 600;
        if (n7 <= n8 && n3 <= n8) {
            n7 = 720;
            n8 = 960;
            if (!(n3 > n8 && n4 > n7 || n3 > n7 && n4 > n8)) {
                n7 = 500;
                if (n3 < n7) {
                    n7 = 480;
                    n8 = 640;
                    if (!(n3 > n8 && n4 > n7 || n3 > n7 && n4 > n8)) {
                        n7 = 360;
                        if (n3 >= n7) {
                            return 3;
                        }
                        return 2;
                    }
                }
                return 4;
            }
        }
        return 5;
    }

    public final int c() {
        int n3;
        Object object = R$styleable.ActionBar;
        int n4 = R$attr.actionBarStyle;
        Context context = this.a;
        object = context.obtainStyledAttributes(null, object, n4, 0);
        n4 = R$styleable.ActionBar_height;
        n4 = object.getLayoutDimension(n4, 0);
        context = context.getResources();
        Resources resources = this.a.getResources();
        int n7 = resources.getBoolean(n3 = R$bool.abc_action_bar_embed_tabs);
        if (n7 == 0) {
            n7 = R$dimen.abc_action_bar_stacked_max_height;
            int n8 = context.getDimensionPixelSize(n7);
            n4 = Math.min(n4, n8);
        }
        object.recycle();
        return n4;
    }
}

