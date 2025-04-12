/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;

/*
 * Renamed from cr0
 */
public final class cr0_0 {
    public boolean a = true;
    public boolean b;
    public boolean c;
    public final ArrayDeque d;

    public cr0_0() {
        ArrayDeque arrayDeque;
        this.d = arrayDeque = new ArrayDeque();
    }

    public final void a() {
        Throwable throwable2;
        block13: {
            block10: {
                boolean bl2;
                Object object;
                boolean bl3 = this.c;
                if (bl3) {
                    return;
                }
                bl3 = true;
                try {
                    this.c = bl3;
                }
                catch (Throwable throwable2) {
                    break block13;
                }
                while (true) {
                    object = this.d;
                    bl2 = ((ArrayDeque)object).isEmpty() ^ bl3;
                    if (!bl2) break block10;
                    break;
                }
                {
                    block12: {
                        block11: {
                            bl2 = this.b;
                            if (bl2) break block11;
                            bl2 = this.a;
                            if (!bl2) break block11;
                            bl2 = false;
                            break block12;
                        }
                        bl2 = true;
                    }
                    if (!bl2) break block10;
                    object = ((ArrayDeque)object).poll();
                    if ((object = (Runnable)object) == null) continue;
                    object.run();
                    continue;
                }
            }
            this.c = false;
            return;
        }
        this.c = false;
        throw throwable2;
    }
}

