/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;

/*
 * Renamed from VX2
 */
public final class vx2_0
implements Sj3 {
    public long a;
    public long b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ ry2_0 d;
    public final /* synthetic */ long e;

    public vx2_0(tx2_0 tx2_02, ry2_0 ry2_02, long l2) {
        long l3;
        this.c = tx2_02;
        this.d = ry2_02;
        this.e = l2;
        this.a = l3 = 0L;
        this.b = l3;
    }

    public final void a() {
    }

    public final void b(long l2) {
        boolean bl2;
        zp1 zp12 = (zp1)this.c.invoke();
        ry2_0 ry2_02 = this.d;
        if (zp12 != null) {
            boolean bl3 = zp12.e();
            if (!bl3) {
                return;
            }
            ry2_02.b();
            this.a = l2;
        }
        if (!(bl2 = sy2_0.a(ry2_02, l2 = this.e))) {
            return;
        }
        this.b = 0L;
    }

    public final void c() {
    }

    public final void d(long l2) {
        zp1 zp12 = (zp1)this.c.invoke();
        if (zp12 != null) {
            boolean bl2 = zp12.e();
            if (!bl2) {
                return;
            }
            ry2_0 ry2_02 = this.d;
            long l3 = this.e;
            bl2 = sy2_0.a(ry2_02, l3);
            if (!bl2) {
                return;
            }
            this.b = l2 = e72.i(this.b, l2);
            l3 = this.a;
            l2 = e72.i(l3, l2);
            bl2 = ry2_02.h();
            if (bl2) {
                this.a = l2;
                this.b = l2 = 0L;
            }
        }
    }

    public final void onCancel() {
        ry2_0 ry2_02 = this.d;
        long l2 = this.e;
        boolean bl2 = sy2_0.a(ry2_02, l2);
        if (bl2) {
            ry2_02.i();
        }
    }

    public final void onStop() {
        ry2_0 ry2_02 = this.d;
        long l2 = this.e;
        boolean bl2 = sy2_0.a(ry2_02, l2);
        if (bl2) {
            ry2_02.i();
        }
    }
}

