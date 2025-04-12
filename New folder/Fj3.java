/*
 * Decompiled with CFR 0.152.
 */
public final class Fj3 {
    public static final boolean a(Sl object) {
        String string2 = ((Sl)object).a;
        int n3 = string2.length();
        boolean bl2 = false;
        object = ((Sl)object).d;
        if (object != null) {
            int n4 = object.size();
            for (int i3 = 0; i3 < n4; ++i3) {
                Sl$b sl$b = (Sl$b)object.get(i3);
                Object object2 = sl$b.a;
                int n7 = object2 instanceof Gu1;
                if (n7 == 0) continue;
                n7 = sl$b.b;
                int n8 = sl$b.c;
                if ((n8 = (int)(Tl.c(0, n3, n7, n8) ? 1 : 0)) == 0) continue;
                bl2 = true;
                break;
            }
        }
        return bl2;
    }
}

