/*
 * Decompiled with CFR 0.152.
 */
import kotlinx.coroutines.b;

/*
 * Renamed from Mr0
 */
public final class mr0_2
implements b {
    public final fr0_1 a;

    public mr0_2(fr0_1 fr0_12) {
        this.a = fr0_12;
    }

    public final void b(Throwable throwable) {
        this.a.dispose();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DisposeOnCancel[");
        fr0_1 fr0_12 = this.a;
        stringBuilder.append(fr0_12);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

