/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/*
 * Renamed from ou
 */
public final class ou_2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public final vn0_2[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    static {
        b = AtomicIntegerFieldUpdater.newUpdater(ou_2.class, "notCompletedCount$volatile");
    }

    public ou_2(vn0_2[] vn0_2Array) {
        int n3;
        this.a = vn0_2Array;
        this.notCompletedCount$volatile = n3 = vn0_2Array.length;
    }
}

