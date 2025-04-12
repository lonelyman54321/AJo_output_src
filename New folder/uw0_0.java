/*
 * Decompiled with CFR 0.152.
 */
import java.util.UUID;

/*
 * Renamed from UW0
 */
public final class uw0_0
implements be0_0 {
    public static final boolean c;
    public final UUID a;
    public final byte[] b;

    static {
        boolean bl2;
        String string2 = "Amazon";
        String string3 = gz3.c;
        boolean bl3 = string2.equals(string3);
        if (bl3 && ((bl2 = (string3 = "AFTM").equals(string2 = gz3.d)) || (bl3 = (string3 = "AFTB").equals(string2)))) {
            bl3 = true;
        } else {
            bl3 = false;
            string2 = null;
        }
        c = bl3;
    }

    public uw0_0(UUID uUID, byte[] byArray) {
        this.a = uUID;
        this.b = byArray;
    }
}

