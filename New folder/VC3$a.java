/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
import android.view.ViewGroup;

public final class VC3$a {
    public static int a(ViewGroup viewGroup, int n3) {
        return viewGroup.getChildDrawingOrder(n3);
    }

    public static void b(ViewGroup viewGroup, boolean bl2) {
        viewGroup.suppressLayout(bl2);
    }
}

