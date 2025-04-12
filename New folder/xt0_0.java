/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.Configuration
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 */
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/*
 * Renamed from Xt0
 */
public final class xt0_0 {
    public static volatile boolean a = true;

    public static Drawable a(Context object, Context object2, int n3, Resources.Theme theme) {
        block7: {
            boolean bl2 = a;
            if (!bl2) break block7;
            try {
                return xt0_0.b(object2, n3, theme);
            }
            catch (Resources.NotFoundException notFoundException) {
            }
            catch (IllegalStateException illegalStateException) {
                object = object.getPackageName();
                String string2 = object2.getPackageName();
                boolean bl3 = ((String)object).equals(string2);
                if (!bl3) {
                    return t70.getDrawable(object2, n3);
                }
                throw illegalStateException;
            }
            catch (NoClassDefFoundError noClassDefFoundError) {
                boolean bl4 = false;
                object = null;
                a = false;
            }
        }
        if (theme == null) {
            theme = object2.getTheme();
        }
        object = object2.getResources();
        object2 = WK2.a;
        return object.getDrawable(n3, theme);
    }

    public static Drawable b(Context object, int n3, Resources.Theme theme) {
        if (theme != null) {
            d80 d802 = new ContextWrapper(object);
            d802.b = theme;
            object = theme.getResources().getConfiguration();
            d802.a((Configuration)object);
            object = d802;
        }
        return xn.a(object, n3);
    }
}

