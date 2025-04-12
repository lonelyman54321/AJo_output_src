/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseBooleanArray
 */
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.List;

public final class om2 {
    public static final om2$a f;
    public final List a;
    public final List b;
    public final Jp c;
    public final SparseBooleanArray d;
    public final om2$c e;

    static {
        om2$a om2$a;
        f = om2$a = new Object();
    }

    public om2(ArrayList arrayList, ArrayList object) {
        this.a = arrayList;
        this.d = object;
        this.c = object = new Jp();
        int n3 = arrayList.size();
        int n4 = -1 << -1;
        om2$c om2$c = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            om2$c om2$c2 = (om2$c)arrayList.get(i3);
            int n7 = om2$c2.e;
            if (n7 <= n4) continue;
            om2$c = om2$c2;
            n4 = n7;
        }
        this.e = om2$c;
    }
}

