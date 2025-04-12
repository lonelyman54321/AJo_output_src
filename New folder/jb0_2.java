/*
 * Decompiled with CFR 0.152.
 */
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.c;

/*
 * Renamed from JB0
 */
public abstract class jb0_2
extends c {
    public static final /* synthetic */ int e;
    public long b;
    public boolean c;
    public fp_2 d;

    public final c M0(int n3, String string2) {
        tu1_2.a(n3);
        c c2 = string2 != null ? new fs1_2(this, string2) : this;
        return c2;
    }

    public final void N0(boolean object) {
        long l2 = this.b;
        long l3 = object != 0 ? 0x100000000L : 1L;
        this.b = l2 -= l3;
        l3 = 0L;
        long l4 = l2 - l3;
        object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            return;
        }
        object = this.c;
        if (object != 0) {
            this.shutdown();
        }
    }

    public final void O0(DispatchedTask dispatchedTask) {
        fp_2 fp_22 = this.d;
        if (fp_22 == null) {
            this.d = fp_22 = new fp_2();
        }
        fp_22.addLast(dispatchedTask);
    }

    public final void P0(boolean bl2) {
        long l2 = this.b;
        long l3 = bl2 ? 0x100000000L : 1L;
        this.b = l3 += l2;
        if (!bl2) {
            this.c = bl2 = true;
        }
    }

    public final boolean Q0() {
        long l2 = this.b;
        long l3 = 0x100000000L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        return bl2;
    }

    public long R0() {
        boolean bl2 = this.S0();
        if (!bl2) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final boolean S0() {
        Object object = this.d;
        if (object == null) {
            return false;
        }
        boolean bl2 = ((fp_2)object).isEmpty();
        object = bl2 ? null : ((fp_2)object).removeFirst();
        if ((object = (DispatchedTask)object) == null) {
            return false;
        }
        ((DispatchedTask)object).run();
        return true;
    }

    public void shutdown() {
    }
}

