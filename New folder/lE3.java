/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;

public class lE3
extends je3_0 {
    public static boolean i = true;

    public void b(View view, int n3, int n4, int n7, int n8) {
        boolean bl2 = i;
        if (bl2) {
            try {
                lE3$a.a(view, n3, n4, n7, n8);
            }
            catch (NoSuchMethodError noSuchMethodError) {
                view = null;
                i = false;
            }
        }
    }
}

