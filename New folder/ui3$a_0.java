/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from uI3$a
 */
public final class ui3$a_0
extends BA0 {
    public final void bind(bg3_0 bg3_02, Object object) {
        object = (si3_0)object;
        String string2 = ((si3_0)object).a;
        bg3_02.c0(1, string2);
        object = ((si3_0)object).b;
        bg3_02.c0(2, (String)object);
    }

    public final String createQuery() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }
}

