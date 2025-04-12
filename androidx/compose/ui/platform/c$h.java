/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import java.util.Comparator;
import kotlin.Pair;

public final class c$h
implements Comparator {
    public static final c$h a;

    static {
        c$h c$h;
        a = c$h = new Object();
    }

    public final int compare(Object object, Object object2) {
        object = (Pair)object;
        object2 = (Pair)object2;
        aG2 aG22 = (aG2)((Pair)object).a;
        float f5 = aG22.b;
        aG2 aG23 = (aG2)((Pair)object2).a;
        float f6 = aG23.b;
        int n3 = Float.compare(f5, f6);
        if (n3 == 0) {
            object = (aG2)((Pair)object).a;
            float f7 = ((aG2)object).d;
            object2 = (aG2)((Pair)object2).a;
            float f8 = ((aG2)object2).d;
            n3 = Float.compare(f7, f8);
        }
        return n3;
    }
}

