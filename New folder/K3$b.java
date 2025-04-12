/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class K3$b {
    public final i a;
    public final ArrayList b;

    public K3$b(i arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "lifecycle");
        this.a = arrayList;
        this.b = arrayList = new ArrayList();
    }
}

