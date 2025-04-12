/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dA1$a
 */
public final class da1$a_0 {
    public static da1_1 a(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "inputArgs");
        da1_1 da1_12 = new da1_1();
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("param1", bundle);
        da1_12.setArguments(bundle2);
        return da1_12;
    }
}

