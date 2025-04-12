/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bJ$a
 */
public final class bj$a_0 {
    public static final cl2_2 a(cl2_2 object) {
        il2_2 il2_22 = object != null ? ((cl2_2)object).g : null;
        if (il2_22 != null) {
            object = ((cl2_2)object).h();
            ((cl2$a_0)object).g = null;
            object = ((cl2$a_0)object).a();
        }
        return object;
    }

    public static boolean b(String string2) {
        boolean bl2;
        String string3 = "Connection";
        boolean bl3 = string3.equalsIgnoreCase(string2);
        if (!(bl3 || (bl3 = (string3 = "Keep-Alive").equalsIgnoreCase(string2)) || (bl3 = (string3 = "Proxy-Authenticate").equalsIgnoreCase(string2)) || (bl3 = (string3 = "Proxy-Authorization").equalsIgnoreCase(string2)) || (bl3 = (string3 = "TE").equalsIgnoreCase(string2)) || (bl3 = (string3 = "Trailers").equalsIgnoreCase(string2)) || (bl3 = (string3 = "Transfer-Encoding").equalsIgnoreCase(string2)) || (bl2 = (string3 = "Upgrade").equalsIgnoreCase(string2)))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }
}

