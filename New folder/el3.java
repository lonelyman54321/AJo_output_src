/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Point
 *  android.view.WindowManager
 */
import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;

public final class el3 {
    public static int a(Context context) {
        String string2 = "window";
        if ((context = (WindowManager)context.getSystemService(string2)) == null) {
            return 0;
        }
        context = context.getDefaultDisplay();
        string2 = new Point();
        context.getSize((Point)string2);
        return ((Point)string2).y;
    }

    public static int b(Context context) {
        String string2 = "window";
        if ((context = (WindowManager)context.getSystemService(string2)) == null) {
            return 0;
        }
        context = context.getDefaultDisplay();
        string2 = new Point();
        context.getSize((Point)string2);
        return ((Point)string2).x;
    }
}

