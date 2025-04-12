/*
 * Decompiled with CFR 0.152.
 */
public final class uh3$a
extends BA0 {
    public final void bind(bg3_0 bg3_02, Object object) {
        object = (sh3_0)object;
        String string2 = ((sh3_0)object).a;
        bg3_02.c0(1, string2);
        long l2 = ((sh3_0)object).b;
        bg3_02.m0(2, l2);
        l2 = ((sh3_0)object).c;
        bg3_02.m0(3, l2);
    }

    public final String createQuery() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }
}

