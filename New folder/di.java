/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class di {
    public static final void a(RQ1 rQ1, iL iL2, ZD zD, float f5, b13_0 b13_02, Jj3 jj3, Qt0 qt0, int n3) {
        Object object = rQ1;
        object = rQ1.h;
        int n4 = ((ArrayList)object).size();
        for (int i3 = 0; i3 < n4; ++i3) {
            Object object2 = (tm2)((ArrayList)object).get(i3);
            ((tm2)object2).a.m(iL2, zD, f5, b13_02, jj3, qt0, n3);
            object2 = ((tm2)object2).a;
            float f6 = object2.getHeight();
            iL2.g(0.0f, f6);
        }
    }
}

