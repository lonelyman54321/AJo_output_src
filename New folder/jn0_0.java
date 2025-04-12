/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import java.util.List;
import java.util.Objects;

/*
 * Renamed from jn0
 */
public final class jn0_0
implements vf3$a_0 {
    public final boolean a(d object) {
        boolean bl2;
        object = ((d)object).o;
        String string2 = "text/x-ssa";
        boolean bl3 = Objects.equals(object, string2);
        if (!(bl3 || (bl3 = Objects.equals(object, string2 = "text/vtt")) || (bl3 = Objects.equals(object, string2 = "application/x-mp4-vtt")) || (bl3 = Objects.equals(object, string2 = "application/x-subrip")) || (bl3 = Objects.equals(object, string2 = "application/x-quicktime-tx3g")) || (bl3 = Objects.equals(object, string2 = "application/pgs")) || (bl3 = Objects.equals(object, string2 = "application/dvbsubs")) || (bl2 = Objects.equals(object, string2 = "application/ttml+xml")))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final int b(d object) {
        int n3 = 1;
        int n4 = 2;
        object = ((d)object).o;
        if (object != null) {
            int n7 = -1;
            int n8 = ((String)object).hashCode();
            switch (n8) {
                default: {
                    break;
                }
                case 1693976202: {
                    String string2 = "application/ttml+xml";
                    n8 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n8 == 0) break;
                    n7 = 7;
                    break;
                }
                case 1668750253: {
                    String string3 = "application/x-subrip";
                    n8 = (int)(((String)object).equals(string3) ? 1 : 0);
                    if (n8 == 0) break;
                    n7 = 6;
                    break;
                }
                case 822864842: {
                    String string4 = "text/x-ssa";
                    n8 = (int)(((String)object).equals(string4) ? 1 : 0);
                    if (n8 == 0) break;
                    n7 = 5;
                    break;
                }
                case 691401887: {
                    String string5 = "application/x-quicktime-tx3g";
                    n8 = (int)(((String)object).equals(string5) ? 1 : 0);
                    if (n8 == 0) break;
                    n7 = 4;
                    break;
                }
                case -1004728940: {
                    String string6 = "text/vtt";
                    n8 = (int)(((String)object).equals(string6) ? 1 : 0);
                    if (n8 == 0) break;
                    n7 = 3;
                    break;
                }
                case -1026075066: {
                    String string7 = "application/x-mp4-vtt";
                    n8 = (int)(((String)object).equals(string7) ? 1 : 0);
                    if (n8 == 0) break;
                    n7 = 2;
                    break;
                }
                case -1248334819: {
                    String string8 = "application/pgs";
                    n8 = (int)(((String)object).equals(string8) ? 1 : 0);
                    if (n8 == 0) break;
                    n7 = 1;
                    break;
                }
                case -1351681404: {
                    String string9 = "application/dvbsubs";
                    n8 = (int)(((String)object).equals(string9) ? 1 : 0);
                    if (n8 == 0) break;
                    n7 = 0;
                }
            }
            switch (n7) {
                default: {
                    break;
                }
                case 5: 
                case 6: 
                case 7: {
                    return n3;
                }
                case 4: {
                    return n4;
                }
                case 3: {
                    return n3;
                }
                case 0: 
                case 1: 
                case 2: {
                    return n4;
                }
            }
        }
        object = kp1_0.c("Unsupported MIME type: ", (String)object);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final vf3_0 c(d object) {
        Object object2 = ((d)object).o;
        if (object2 != null) {
            object = ((d)object).r;
            int n3 = -1;
            int n4 = ((String)object2).hashCode();
            switch (n4) {
                default: {
                    break;
                }
                case 1693976202: {
                    String string2 = "application/ttml+xml";
                    n4 = (int)(((String)object2).equals(string2) ? 1 : 0);
                    if (n4 == 0) break;
                    n3 = 7;
                    break;
                }
                case 1668750253: {
                    String string3 = "application/x-subrip";
                    n4 = (int)(((String)object2).equals(string3) ? 1 : 0);
                    if (n4 == 0) break;
                    n3 = 6;
                    break;
                }
                case 822864842: {
                    String string4 = "text/x-ssa";
                    n4 = (int)(((String)object2).equals(string4) ? 1 : 0);
                    if (n4 == 0) break;
                    n3 = 5;
                    break;
                }
                case 691401887: {
                    String string5 = "application/x-quicktime-tx3g";
                    n4 = (int)(((String)object2).equals(string5) ? 1 : 0);
                    if (n4 == 0) break;
                    n3 = 4;
                    break;
                }
                case -1004728940: {
                    String string6 = "text/vtt";
                    n4 = (int)(((String)object2).equals(string6) ? 1 : 0);
                    if (n4 == 0) break;
                    n3 = 3;
                    break;
                }
                case -1026075066: {
                    String string7 = "application/x-mp4-vtt";
                    n4 = (int)(((String)object2).equals(string7) ? 1 : 0);
                    if (n4 == 0) break;
                    n3 = 2;
                    break;
                }
                case -1248334819: {
                    String string8 = "application/pgs";
                    n4 = (int)(((String)object2).equals(string8) ? 1 : 0);
                    if (n4 == 0) break;
                    n3 = 1;
                    break;
                }
                case -1351681404: {
                    String string9 = "application/dvbsubs";
                    n4 = (int)(((String)object2).equals(string9) ? 1 : 0);
                    if (n4 == 0) break;
                    n3 = 0;
                }
            }
            switch (n3) {
                default: {
                    break;
                }
                case 7: {
                    object = new Js3();
                    return object;
                }
                case 6: {
                    object = new af3_0();
                    return object;
                }
                case 5: {
                    object2 = new db3_1((List)object);
                    return object2;
                }
                case 4: {
                    object2 = new Xs3((List)object);
                    return object2;
                }
                case 3: {
                    object = new MF3();
                    return object;
                }
                case 2: {
                    object = new cq1_0();
                    return object;
                }
                case 1: {
                    object = new ts2_0();
                    return object;
                }
                case 0: {
                    object2 = new cw0_2((List)object);
                    return object2;
                }
            }
        }
        object2 = kp1_0.c("Unsupported MIME type: ", (String)object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

