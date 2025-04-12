/*
 * Decompiled with CFR 0.152.
 */
public final class CH$h
implements CH$g {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public CH$h(String string2, int n3, int n4, boolean bl2, boolean bl3) {
        this.a = n3;
        this.b = n4;
        this.c = bl2;
        this.d = bl3;
        this.e = string2;
    }

    public final boolean a(CH$q iterator, rR2$L rR2$L) {
        int n3;
        int n4;
        int n7 = this.d;
        String string2 = this.e;
        if (n7 != 0 && string2 == null) {
            string2 = rR2$L.n();
        }
        iterator = rR2$L.b;
        int n8 = 1;
        if (iterator != null) {
            boolean bl2;
            iterator = iterator.b().iterator();
            n4 = 0;
            n3 = 0;
            while (bl2 = iterator.hasNext()) {
                Object object = (rR2$L)((rR2$N)iterator.next());
                if (object == rR2$L) {
                    n4 = n3;
                }
                if (string2 != null && !(bl2 = ((String)(object = ((rR2$N)object).n())).equals(string2))) continue;
                ++n3;
            }
        } else {
            n4 = 0;
            n3 = 1;
        }
        n4 = (n7 = this.c) != 0 ? (n4 += n8) : n3 - n4;
        n7 = this.a;
        int n10 = this.b;
        if (n7 == 0) {
            if (n4 != n10) {
                n8 = 0;
            }
            return n8 != 0;
        }
        if ((n10 = (n4 -= n10) % n7) != 0 || (n10 = Integer.signum(n4)) != 0 && (n10 = Integer.signum(n4)) != (n7 = Integer.signum(n7))) {
            n8 = 0;
        }
        return n8 != 0;
    }

    public final String toString() {
        Object object;
        int n3 = 3;
        int n4 = 2;
        int n7 = 1;
        boolean bl2 = this.c;
        String string2 = bl2 ? "" : "last-";
        boolean bl3 = this.d;
        int n8 = this.b;
        int n10 = this.a;
        if (bl3) {
            Integer n14 = n10;
            Integer n15 = n8;
            String string3 = this.e;
            int n16 = 4;
            Object[] objectArray = new Object[n16];
            objectArray[0] = string2;
            objectArray[n7] = n14;
            objectArray[n4] = n15;
            objectArray[n3] = string3;
            object = String.format("nth-%schild(%dn%+d of type <%s>)", objectArray);
        } else {
            Integer n17 = n10;
            Integer n18 = n8;
            object = new Object[n3];
            object[0] = string2;
            object[n7] = n17;
            object[n4] = n18;
            String string4 = "nth-%schild(%dn%+d)";
            object = String.format(string4, object);
        }
        return object;
    }
}

