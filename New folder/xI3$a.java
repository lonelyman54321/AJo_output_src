/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.b;
import androidx.work.b$b;

public final class xI3$a
extends BA0 {
    public final void bind(bg3_0 bg3_02, Object object) {
        object = (vi3_0)object;
        Object object2 = ((vi3_0)object).a;
        bg3_02.c0(1, (String)object2);
        object2 = b.b;
        object = b$b.b(((vi3_0)object).b);
        bg3_02.q0(2, (byte[])object);
    }

    public final String createQuery() {
        return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
    }
}

