/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources$Theme
 *  android.widget.ThemedSpinnerAdapter
 */
package androidx.appcompat.widget;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;

public final class AppCompatSpinner$a {
    public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        Resources.Theme theme2 = themedSpinnerAdapter.getDropDownViewTheme();
        boolean bl2 = Objects.equals(theme2, theme);
        if (!bl2) {
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }
}

