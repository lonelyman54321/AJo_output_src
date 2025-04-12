/*
 * Decompiled with CFR 0.152.
 */
public final class qo
implements kJ0$a {
    public final void b(boolean bl2) {
        if (bl2) {
            Class<DB0> clazz = DB0.a;
            clazz = DB0.class;
            boolean bl3 = td0.b(clazz);
            if (!bl3) {
                bl3 = true;
                DB0.b = bl3;
                DB0 dB0 = DB0.a;
                try {
                    dB0.a();
                }
                catch (Throwable throwable) {
                    td0.a(clazz, throwable);
                }
            }
        }
    }
}

