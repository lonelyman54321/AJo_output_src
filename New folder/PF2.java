/*
 * Decompiled with CFR 0.152.
 */
public final class PF2
extends BA0 {
    public final void bind(bg3_0 bg3_02, Object object) {
        long l2;
        object = (NF2)object;
        Object object2 = ((NF2)object).a;
        int n3 = 1;
        if (object2 == null) {
            bg3_02.w0(n3);
        } else {
            l2 = (Long)object2;
            bg3_02.m0(n3, l2);
        }
        object2 = ((NF2)object).b;
        n3 = 2;
        if (object2 == null) {
            bg3_02.w0(n3);
        } else {
            bg3_02.c0(n3, (String)object2);
        }
        object2 = ((NF2)object).c;
        n3 = 3;
        if (object2 == null) {
            bg3_02.w0(n3);
        } else {
            l2 = (Long)object2;
            bg3_02.m0(n3, l2);
        }
        object2 = ((NF2)object).d;
        n3 = 4;
        if (object2 == null) {
            bg3_02.w0(n3);
        } else {
            bg3_02.c0(n3, (String)object2);
        }
        object2 = ((NF2)object).e;
        n3 = 5;
        if (object2 == null) {
            bg3_02.w0(n3);
        } else {
            bg3_02.c0(n3, (String)object2);
        }
        object = ((NF2)object).f;
        int n4 = 6;
        if (object == null) {
            bg3_02.w0(n4);
        } else {
            bg3_02.c0(n4, (String)object);
        }
    }

    public final String createQuery() {
        return "INSERT OR ABORT INTO `throwables` (`id`,`tag`,`date`,`clazz`,`message`,`content`) VALUES (?,?,?,?,?,?)";
    }
}

