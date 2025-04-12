/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;

/*
 * Renamed from WX2
 */
public final class wx2_0
implements sQ1 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ ry2_0 b;
    public final /* synthetic */ long c;

    public wx2_0(tx2_0 tx2_02, ry2_0 ry2_02, long l2) {
        this.a = tx2_02;
        this.b = ry2_02;
        this.c = l2;
    }

    public final void a() {
        this.b.i();
    }

    public final boolean b(long l2, PX2 pX2) {
        Object object = (zp1)this.a.invoke();
        if (object != null) {
            boolean bl2 = object.e();
            if (!bl2) {
                return false;
            }
            object = this.b;
            long l3 = this.c;
            boolean bl3 = sy2_0.a((ry2_0)object, l3);
            if (!bl3) {
                return false;
            }
            object.h();
        }
        return true;
    }

    public final boolean c(long l2, PX2 pX2) {
        Object object = (zp1)this.a.invoke();
        if (object != null) {
            boolean bl2 = object.e();
            if (!bl2) {
                return false;
            }
            object = this.b;
            object.b();
            long l3 = this.c;
            return sy2_0.a((ry2_0)object, l3);
        }
        return false;
    }
}

