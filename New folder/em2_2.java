/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Array;

/*
 * Renamed from Em2
 */
public final class em2_2
extends fm2_2 {
    public final /* synthetic */ fm2_2 a;

    public em2_2(fm2_2 fm2_22) {
        this.a = fm2_22;
    }

    public final void a(sj2_1 sj2_12, Object object) {
        if (object == null) {
            return;
        }
        int n3 = Array.getLength(object);
        for (int i3 = 0; i3 < n3; ++i3) {
            fm2_2 fm2_22 = this.a;
            Object object2 = Array.get(object, i3);
            fm2_22.a(sj2_12, object2);
        }
    }
}

