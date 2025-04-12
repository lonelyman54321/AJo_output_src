/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;

public final class AO1$a
implements AO1 {
    public final boolean a(d object) {
        boolean bl2;
        String string2 = "application/id3";
        object = ((d)object).o;
        boolean bl3 = string2.equals(object);
        if (!(bl3 || (bl3 = (string2 = "application/x-emsg").equals(object)) || (bl3 = (string2 = "application/x-scte35").equals(object)) || (bl3 = (string2 = "application/x-icy").equals(object)) || (bl2 = (string2 = "application/vnd.dvb.ait").equals(object)))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final k0_0 b(d object) {
        IllegalArgumentException illegalArgumentException;
        object = ((d)object).o;
        if (object != null) {
            int n3 = -1;
            int n4 = ((String)object).hashCode();
            switch (n4) {
                default: {
                    break;
                }
                case 1652648887: {
                    String string2 = "application/x-scte35";
                    n4 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n4 == 0) break;
                    n3 = 4;
                    break;
                }
                case 1154383568: {
                    String string3 = "application/x-emsg";
                    n4 = (int)(((String)object).equals(string3) ? 1 : 0);
                    if (n4 == 0) break;
                    n3 = 3;
                    break;
                }
                case -1248341703: {
                    String string4 = "application/id3";
                    n4 = (int)(((String)object).equals(string4) ? 1 : 0);
                    if (n4 == 0) break;
                    n3 = 2;
                    break;
                }
                case -1348231605: {
                    String string5 = "application/x-icy";
                    n4 = (int)(((String)object).equals(string5) ? 1 : 0);
                    if (n4 == 0) break;
                    n3 = 1;
                    break;
                }
                case -1354451219: {
                    String string6 = "application/vnd.dvb.ait";
                    n4 = (int)(((String)object).equals(string6) ? 1 : 0);
                    if (n4 == 0) break;
                    n3 = 0;
                    illegalArgumentException = null;
                }
            }
            switch (n3) {
                default: {
                    break;
                }
                case 4: {
                    object = new ra3_0();
                    return object;
                }
                case 3: {
                    object = new Object();
                    return object;
                }
                case 2: {
                    object = new uc1_1(null);
                    return object;
                }
                case 1: {
                    object = new sc1_1();
                    return object;
                }
                case 0: {
                    object = new Object();
                    return object;
                }
            }
        }
        object = kp1_0.c("Attempted to create decoder for unsupported MIME type: ", (String)object);
        illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }
}

