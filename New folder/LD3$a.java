/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.ViewStructure
 */
import android.os.Bundle;
import android.view.ViewStructure;

public final class LD3$a {
    public static Bundle a(ViewStructure viewStructure) {
        return viewStructure.getExtras();
    }

    public static void b(ViewStructure viewStructure, String string2) {
        viewStructure.setClassName(string2);
    }

    public static void c(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setContentDescription(charSequence);
    }

    public static void d(ViewStructure viewStructure, int n3, int n4, int n7, int n8, int n10, int n14) {
        viewStructure.setDimens(n3, n4, n7, n8, n10, n14);
    }

    public static void e(ViewStructure viewStructure, int n3, String string2) {
        viewStructure.setId(n3, null, null, string2);
    }

    public static void f(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }

    public static void g(ViewStructure viewStructure, float f5, int n3, int n4, int n7) {
        viewStructure.setTextStyle(f5, n3, n4, n7);
    }
}

