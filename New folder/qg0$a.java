/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  android.util.Log
 *  android.view.View
 *  android.view.WindowManager
 */
import android.graphics.Point;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;

public final class qg0$a {
    public static Integer d;
    public final View a;
    public final ArrayList b;
    public qg0$a$a c;

    public qg0$a(View view) {
        ArrayList arrayList;
        this.b = arrayList = new ArrayList();
        this.a = view;
    }

    public final int a(int n3, int n4, int n7) {
        int n8 = n4 - n7;
        if (n8 > 0) {
            return n8;
        }
        if ((n3 -= n7) > 0) {
            return n3;
        }
        Object object = this.a;
        n7 = (int)(object.isLayoutRequested() ? 1 : 0);
        if (n7 == 0 && n4 == (n7 = -2)) {
            n7 = 4;
            Log.isLoggable((String)"CustomViewTarget", (int)n7);
            object = object.getContext();
            Integer n10 = d;
            if (n10 == null) {
                object = (WindowManager)object.getSystemService("window");
                dV0.c(object, "Argument must not be null");
                object = object.getDefaultDisplay();
                n10 = new Point();
                object.getSize((Point)n10);
                n3 = ((Point)n10).x;
                n4 = ((Point)n10).y;
                n3 = Math.max(n3, n4);
                object = n3;
                d = object;
            }
            return d;
        }
        return 0;
    }
}

