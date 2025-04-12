/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.content.res.Resources$Theme
 */
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class WK2$b {
    public final ColorStateList a;
    public final Configuration b;
    public final int c;

    public WK2$b(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int n3;
        this.a = colorStateList;
        this.b = configuration;
        if (theme == null) {
            n3 = 0;
            colorStateList = null;
        } else {
            n3 = theme.hashCode();
        }
        this.c = n3;
    }
}

