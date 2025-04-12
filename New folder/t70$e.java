/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.hardware.display.DisplayManager
 *  android.view.Display
 */
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import java.util.Objects;

public final class t70$e {
    public static Context a(Context context, String string2) {
        return context.createAttributionContext(string2);
    }

    public static String b(Context context) {
        return context.getAttributionTag();
    }

    public static Display c(Context context) {
        try {
            return context.getDisplay();
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            Objects.toString(context);
            return ((DisplayManager)context.getSystemService(DisplayManager.class)).getDisplay(0);
        }
    }
}

