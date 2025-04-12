/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class Sz1$a {
    public static sz1_2 a(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "inputArgs");
        sz1_2 sz1_22 = new sz1_2();
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("param1", bundle);
        sz1_22.setArguments(bundle2);
        return sz1_22;
    }
}

