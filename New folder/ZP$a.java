/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

public final class ZP$a {
    public static zp_0 a(int n3, boolean bl2) {
        int n4 = 100;
        zp_0 zp_02 = n3 != n4 ? (n3 != (n4 = 101) ? new zp_0() : new vd1_0()) : new zp_0();
        Bundle bundle = new Bundle();
        bundle.putInt("PLP_TYPE", n3);
        bundle.putBoolean("OPEN_THROUGH_CATEGORY", bl2);
        zp_02.setArguments(bundle);
        return zp_02;
    }
}

