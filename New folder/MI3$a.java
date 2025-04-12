/*
 * Decompiled with CFR 0.152.
 */
public final class MI3$a
extends BA0 {
    public final void bind(bg3_0 bg3_02, Object object) {
        object = (KI3)object;
        String string2 = ((KI3)object).a;
        bg3_02.c0(1, string2);
        object = ((KI3)object).b;
        bg3_02.c0(2, (String)object);
    }

    public final String createQuery() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }
}

