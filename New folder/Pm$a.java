/*
 * Decompiled with CFR 0.152.
 */
public final class Pm$a {
    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean a(pm_0 pm_02) {
        pm_0 pm_03;
        block11: {
            // MONITORENTER : this
            Class<pm_0> clazz = pm_0.class;
            boolean bl2 = td0.b(clazz);
            pm_03 = null;
            if (!bl2) {
                try {
                    pm_03 = pm_0.e;
                }
                catch (Throwable throwable) {
                    td0.a(clazz, throwable);
                }
            }
            clazz = pm_0.class;
            bl2 = td0.b(clazz);
            if (bl2) break block11;
            {
                catch (Throwable throwable) {
                    throw throwable;
                }
            }
            try {
                pm_0.e = pm_02;
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
            }
        }
        if (pm_03 != null) {
            return true;
        }
        boolean bl3 = false;
        pm_02 = null;
        // MONITOREXIT : this
        return bl3;
    }
}

