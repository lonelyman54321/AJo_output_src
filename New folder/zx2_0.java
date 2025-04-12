/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Zx2
 */
public final class zx2_0
extends BA0 {
    public final void bind(bg3_0 bg3_02, Object object) {
        object = (Wx2)object;
        String string2 = ((Wx2)object).a;
        int n3 = 1;
        bg3_02.c0(n3, string2);
        int n4 = 2;
        object = ((Wx2)object).b;
        if (object == null) {
            bg3_02.w0(n4);
        } else {
            long l2 = (Long)object;
            bg3_02.m0(n4, l2);
        }
    }

    public final String createQuery() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }
}

