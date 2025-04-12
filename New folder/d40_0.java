/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from d40
 */
public abstract class d40_0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Class<d40_0> clazz = d40_0.class;
        Class<Object> clazz2 = Object.class;
        a = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "_next$volatile");
        b = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "_prev$volatile");
    }

    public d40_0(d40_0 d40_02) {
        this._prev$volatile = d40_02;
    }

    public final void a() {
        b.set(this, null);
    }

    public final d40_0 c() {
        gh3_2 gh3_22;
        Object v4 = a.get(this);
        if (v4 == (gh3_22 = c40_0.a)) {
            return null;
        }
        return (d40_0)v4;
    }

    public abstract boolean d();

    public final void e() {
        Object object = this.c();
        if (object == null) {
            return;
        }
        block0: while (true) {
            d40_0 d40_02;
            boolean bl2;
            boolean bl3;
            object = b;
            d40_0 d40_03 = (d40_0)((AtomicReferenceFieldUpdater)object).get(this);
            while (d40_03 != null && (bl3 = d40_03.d())) {
                d40_03 = (d40_0)((AtomicReferenceFieldUpdater)object).get(d40_03);
            }
            d40_0 d40_04 = this.c();
            Intrinsics.checkNotNull(d40_04);
            while ((bl2 = d40_04.d()) && (d40_02 = d40_04.c()) != null) {
                d40_04 = d40_02;
            }
            while (true) {
                Object v4;
                d40_0 d40_05 = d40_02 = ((AtomicReferenceFieldUpdater)object).get(d40_04);
                d40_05 = d40_02;
                d40_05 = d40_05 == null ? null : d40_03;
                do {
                    boolean bl4;
                    boolean bl5;
                    if (!(bl5 = ((AtomicReferenceFieldUpdater)object).compareAndSet(d40_04, d40_02, d40_05))) continue;
                    if (d40_03 != null) {
                        object = a;
                        ((AtomicReferenceFieldUpdater)object).set(d40_03, d40_04);
                    }
                    if ((bl4 = d40_04.d()) && (object = d40_04.c()) != null || d40_03 != null && (bl4 = d40_03.d())) continue block0;
                    return;
                } while ((v4 = ((AtomicReferenceFieldUpdater)object).get(d40_04)) == d40_02);
            }
            break;
        }
    }
}

