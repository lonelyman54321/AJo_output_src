/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

public final class VY0$a {
    public static vy0_0 a(int n3, int n4) {
        int n7 = 100;
        vy0_0 vy0_02 = n4 != n7 ? (n4 != (n7 = 101) ? new vy0_0() : new qf1_0()) : new vy0_0();
        Bundle bundle = new Bundle();
        bundle.putInt("PLP_TYPE", n4);
        bundle.putInt("FACET_VIEW_TYPE", n3);
        vy0_02.setArguments(bundle);
        return vy0_02;
    }
}

