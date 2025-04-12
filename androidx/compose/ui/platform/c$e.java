/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import java.util.Comparator;

public final class c$e
implements Comparator {
    public static final c$e a;

    static {
        c$e c$e;
        a = c$e = new Object();
    }

    public final int compare(Object object, Object object2) {
        object = (GY2)object;
        object2 = (GY2)object2;
        object = ((GY2)object).f();
        object2 = ((GY2)object2).f();
        float f5 = ((aG2)object).a;
        float f6 = ((aG2)object2).a;
        int n3 = Float.compare(f5, f6);
        if (n3 == 0 && (n3 = Float.compare(f5 = ((aG2)object).b, f6 = ((aG2)object2).b)) == 0 && (n3 = Float.compare(f5 = ((aG2)object).d, f6 = ((aG2)object2).d)) == 0) {
            float f7 = ((aG2)object).c;
            float f8 = ((aG2)object2).c;
            n3 = Float.compare(f7, f8);
        }
        return n3;
    }
}

