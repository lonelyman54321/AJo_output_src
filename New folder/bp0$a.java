/*
 * Decompiled with CFR 0.152.
 */
public final class bp0$a
extends BA0 {
    public final void bind(bg3_0 bg3_02, Object object) {
        object = (Yo0)object;
        String string2 = ((Yo0)object).a;
        bg3_02.c0(1, string2);
        object = ((Yo0)object).b;
        bg3_02.c0(2, (String)object);
    }

    public final String createQuery() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }
}

