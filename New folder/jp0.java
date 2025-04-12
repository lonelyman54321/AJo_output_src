/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;

public final class jp0 {
    public final ip0_0 a;
    public final ip0_0 b;

    public jp0() {
        ip0_0 ip0_02;
        this.a = ip0_02 = new ip0_0();
        this.b = ip0_02 = new ip0_0();
    }

    public final void a(xp1_0 xp1_02, boolean bl2) {
        ip0_0 ip0_02 = this.b;
        ip0_0 ip0_03 = this.a;
        if (bl2) {
            ip0_03.a(xp1_02);
            ip0_02.a(xp1_02);
        } else {
            bl2 = ip0_03.b(xp1_02);
            if (!bl2) {
                ip0_02.a(xp1_02);
            }
        }
    }

    public final boolean b(xp1_0 xp1_02, boolean bl2) {
        ip0_0 ip0_02 = this.a;
        boolean bl3 = ip0_02.b(xp1_02);
        if (!bl2) {
            ip0_0 ip0_03;
            boolean bl4;
            if (!bl3 && !(bl4 = (ip0_03 = this.b).b(xp1_02))) {
                bl3 = false;
                ip0_02 = null;
            } else {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final boolean c() {
        es3_0 es3_02 = this.b.c;
        boolean bl2 = ((AbstractCollection)es3_02).isEmpty();
        boolean bl3 = true;
        if (bl2 && (bl2 = ((AbstractCollection)(es3_02 = this.a.c)).isEmpty())) {
            bl2 = true;
        } else {
            bl2 = false;
            es3_02 = null;
        }
        return bl2 ^ bl3;
    }
}

