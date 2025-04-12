/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class Pq2$a
implements Serializable {
    private static final long serialVersionUID = 20160629001L;
    public final HashMap a;

    public Pq2$a(HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "proxyEvents");
        this.a = hashMap;
    }

    private final Object readResolve() {
        HashMap hashMap = this.a;
        pq2_0 pq2_02 = new pq2_0(hashMap);
        return pq2_02;
    }
}

