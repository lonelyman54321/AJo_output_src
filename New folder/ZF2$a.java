/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

public final class ZF2$a
implements xS2$b {
    public final LinkedHashSet a;

    public ZF2$a(xs2_1 xs2_12) {
        LinkedHashSet linkedHashSet;
        Intrinsics.checkNotNullParameter(xs2_12, "registry");
        this.a = linkedHashSet = new LinkedHashSet();
        xs2_12.c("androidx.savedstate.Restarter", this);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        LinkedHashSet linkedHashSet = this.a;
        ArrayList arrayList = new ArrayList(linkedHashSet);
        bundle.putStringArrayList("classes_to_restore", arrayList);
        return bundle;
    }
}

