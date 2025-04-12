/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from iP1
 */
public final class ip1_0 {
    public static final ArrayList a;
    public static final Pattern b;

    static {
        ArrayList arrayList;
        a = arrayList = new ArrayList();
        b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
    }

    public static boolean a(String stringArray, String string2) {
        boolean bl2 = false;
        String string3 = null;
        if (stringArray != null) {
            stringArray = gz3.S((String)stringArray);
            StringBuilder stringBuilder = new StringBuilder();
            for (String string4 : stringArray) {
                String string5 = ip1_0.c(string4);
                int n3 = string2.equals(string5);
                if (n3 == 0) continue;
                n3 = stringBuilder.length();
                if (n3 > 0) {
                    string5 = ",";
                    stringBuilder.append(string5);
                }
                stringBuilder.append(string4);
            }
            int n4 = stringBuilder.length();
            if (n4 > 0) {
                string3 = stringBuilder.toString();
            }
        }
        if (string3 != null) {
            bl2 = true;
        }
        return bl2;
    }

    public static int b(String object, String string2) {
        int n3 = 9;
        int n4 = 7;
        int n7 = 6;
        int n8 = 5;
        object.getClass();
        int n10 = 8;
        int n14 = -1;
        int n15 = ((String)object).hashCode();
        switch (n15) {
            default: {
                break;
            }
            case 1556697186: {
                String string3 = "audio/true-hd";
                boolean bl2 = ((String)object).equals(string3);
                if (!bl2) break;
                n14 = 11;
                break;
            }
            case 1505942594: {
                String string4 = "audio/vnd.dts.hd";
                boolean bl3 = ((String)object).equals(string4);
                if (!bl3) break;
                n14 = 10;
                break;
            }
            case 1504891608: {
                String string5 = "audio/opus";
                boolean bl4 = ((String)object).equals(string5);
                if (!bl4) break;
                n14 = 9;
                break;
            }
            case 1504831518: {
                String string6 = "audio/mpeg";
                boolean bl5 = ((String)object).equals(string6);
                if (!bl5) break;
                n14 = 8;
                break;
            }
            case 1504578661: {
                String string7 = "audio/eac3";
                boolean bl6 = ((String)object).equals(string7);
                if (!bl6) break;
                n14 = 7;
                break;
            }
            case 550520934: {
                String string8 = "audio/vnd.dts.uhd;profile=p2";
                boolean bl7 = ((String)object).equals(string8);
                if (!bl7) break;
                n14 = 6;
                break;
            }
            case 187078297: {
                String string9 = "audio/ac4";
                boolean bl8 = ((String)object).equals(string9);
                if (!bl8) break;
                n14 = 5;
                break;
            }
            case 187078296: {
                String string10 = "audio/ac3";
                boolean bl9 = ((String)object).equals(string10);
                if (!bl9) break;
                n14 = 4;
                break;
            }
            case -53558318: {
                String string11 = "audio/mp4a-latm";
                boolean bl10 = ((String)object).equals(string11);
                if (!bl10) break;
                n14 = 3;
                break;
            }
            case -1095064472: {
                String string12 = "audio/vnd.dts";
                boolean bl11 = ((String)object).equals(string12);
                if (!bl11) break;
                n14 = 2;
                break;
            }
            case -1365340241: {
                String string13 = "audio/vnd.dts.hd;profile=lbr";
                boolean bl12 = ((String)object).equals(string13);
                if (!bl12) break;
                n14 = 1;
                break;
            }
            case -2123537834: {
                String string14 = "audio/eac3-joc";
                boolean bl13 = ((String)object).equals(string14);
                if (!bl13) break;
                n14 = 0;
            }
        }
        switch (n14) {
            default: {
                return 0;
            }
            case 11: {
                return 14;
            }
            case 10: {
                return n10;
            }
            case 9: {
                return 20;
            }
            case 8: {
                return n3;
            }
            case 7: {
                return n7;
            }
            case 6: {
                return 30;
            }
            case 5: {
                return 17;
            }
            case 4: {
                return n8;
            }
            case 3: {
                if (string2 == null) {
                    return 0;
                }
                object = ip1_0.e(string2);
                if (object == null) {
                    return 0;
                }
                return ((iP1$b)object).a();
            }
            case 2: {
                return n4;
            }
            case 1: {
                return n10;
            }
            case 0: 
        }
        return 18;
    }

    public static String c(String object) {
        Object object2;
        String string2 = null;
        if (object == null) {
            return null;
        }
        boolean bl2 = ((String)(object = Ascii.toLowerCase(((String)object).trim()))).startsWith((String)(object2 = "avc1"));
        if (!bl2 && !(bl2 = ((String)object).startsWith((String)(object2 = "avc3")))) {
            object2 = "hev1";
            bl2 = ((String)object).startsWith((String)object2);
            if (!bl2 && !(bl2 = ((String)object).startsWith((String)(object2 = "hvc1")))) {
                object2 = "dvav";
                bl2 = ((String)object).startsWith((String)object2);
                if (!(bl2 || (bl2 = ((String)object).startsWith((String)(object2 = "dva1"))) || (bl2 = ((String)object).startsWith((String)(object2 = "dvhe"))) || (bl2 = ((String)object).startsWith((String)(object2 = "dvh1"))))) {
                    object2 = "av01";
                    bl2 = ((String)object).startsWith((String)object2);
                    if (bl2) {
                        return "video/av01";
                    }
                    object2 = "vp9";
                    bl2 = ((String)object).startsWith((String)object2);
                    if (!bl2 && !(bl2 = ((String)object).startsWith((String)(object2 = "vp09")))) {
                        object2 = "vp8";
                        bl2 = ((String)object).startsWith((String)object2);
                        if (!bl2 && !(bl2 = ((String)object).startsWith((String)(object2 = "vp08")))) {
                            object2 = "mp4a";
                            bl2 = ((String)object).startsWith((String)object2);
                            if (bl2) {
                                object2 = "mp4a.";
                                bl2 = ((String)object).startsWith((String)object2);
                                if (bl2 && (object = ip1_0.e((String)object)) != null) {
                                    int n3 = ((iP1$b)object).a;
                                    string2 = ip1_0.d(n3);
                                }
                                if (string2 == null) {
                                    string2 = "audio/mp4a-latm";
                                }
                                return string2;
                            }
                            object2 = "mha1";
                            bl2 = ((String)object).startsWith((String)object2);
                            if (bl2) {
                                return "audio/mha1";
                            }
                            object2 = "mhm1";
                            bl2 = ((String)object).startsWith((String)object2);
                            if (bl2) {
                                return "audio/mhm1";
                            }
                            object2 = "ac-3";
                            bl2 = ((String)object).startsWith((String)object2);
                            if (!bl2 && !(bl2 = ((String)object).startsWith((String)(object2 = "dac3")))) {
                                object2 = "ec-3";
                                bl2 = ((String)object).startsWith((String)object2);
                                if (!bl2 && !(bl2 = ((String)object).startsWith((String)(object2 = "dec3")))) {
                                    object2 = "ec+3";
                                    bl2 = ((String)object).startsWith((String)object2);
                                    if (bl2) {
                                        return "audio/eac3-joc";
                                    }
                                    object2 = "ac-4";
                                    bl2 = ((String)object).startsWith((String)object2);
                                    if (!bl2 && !(bl2 = ((String)object).startsWith((String)(object2 = "dac4")))) {
                                        object2 = "dtsc";
                                        bl2 = ((String)object).startsWith((String)object2);
                                        if (bl2) {
                                            return "audio/vnd.dts";
                                        }
                                        object2 = "dtse";
                                        bl2 = ((String)object).startsWith((String)object2);
                                        if (bl2) {
                                            return "audio/vnd.dts.hd;profile=lbr";
                                        }
                                        object2 = "dtsh";
                                        bl2 = ((String)object).startsWith((String)object2);
                                        if (!bl2 && !(bl2 = ((String)object).startsWith((String)(object2 = "dtsl")))) {
                                            object2 = "dtsx";
                                            bl2 = ((String)object).startsWith((String)object2);
                                            if (bl2) {
                                                return "audio/vnd.dts.uhd;profile=p2";
                                            }
                                            object2 = "opus";
                                            bl2 = ((String)object).startsWith((String)object2);
                                            if (bl2) {
                                                return "audio/opus";
                                            }
                                            object2 = "vorbis";
                                            bl2 = ((String)object).startsWith((String)object2);
                                            if (bl2) {
                                                return "audio/vorbis";
                                            }
                                            object2 = "flac";
                                            bl2 = ((String)object).startsWith((String)object2);
                                            if (bl2) {
                                                return "audio/flac";
                                            }
                                            object2 = "stpp";
                                            bl2 = ((String)object).startsWith((String)object2);
                                            if (bl2) {
                                                return "application/ttml+xml";
                                            }
                                            object2 = "wvtt";
                                            bl2 = ((String)object).startsWith((String)object2);
                                            if (bl2) {
                                                return "text/vtt";
                                            }
                                            object2 = "cea708";
                                            bl2 = ((String)object).contains((CharSequence)object2);
                                            if (bl2) {
                                                return "application/cea-708";
                                            }
                                            object2 = "eia608";
                                            bl2 = ((String)object).contains((CharSequence)object2);
                                            if (!bl2 && !(bl2 = ((String)object).contains((CharSequence)(object2 = "cea608")))) {
                                                object2 = a;
                                                int n4 = ((ArrayList)object2).size();
                                                for (int i3 = 0; i3 < n4; ++i3) {
                                                    iP1$a iP1$a = (iP1$a)((ArrayList)object2).get(i3);
                                                    iP1$a.getClass();
                                                    boolean bl3 = ((String)object).startsWith(null);
                                                    if (bl3) break;
                                                }
                                                return null;
                                            }
                                            return "application/cea-608";
                                        }
                                        return "audio/vnd.dts.hd";
                                    }
                                    return "audio/ac4";
                                }
                                return "audio/eac3";
                            }
                            return "audio/ac3";
                        }
                        return "video/x-vnd.on2.vp8";
                    }
                    return "video/x-vnd.on2.vp9";
                }
                return "video/dolby-vision";
            }
            return "video/hevc";
        }
        return "video/avc";
    }

    public static String d(int n3) {
        int n4 = 32;
        if (n3 != n4) {
            n4 = 33;
            if (n3 != n4) {
                n4 = 35;
                if (n3 != n4) {
                    n4 = 64;
                    if (n3 != n4) {
                        n4 = 163;
                        if (n3 != n4) {
                            n4 = 177;
                            if (n3 != n4) {
                                n4 = 221;
                                if (n3 != n4) {
                                    n4 = 165;
                                    if (n3 != n4) {
                                        n4 = 166;
                                        if (n3 != n4) {
                                            switch (n3) {
                                                default: {
                                                    switch (n3) {
                                                        default: {
                                                            return null;
                                                        }
                                                        case 174: {
                                                            return "audio/ac4";
                                                        }
                                                        case 173: {
                                                            return "audio/opus";
                                                        }
                                                        case 170: 
                                                        case 171: {
                                                            return "audio/vnd.dts.hd";
                                                        }
                                                        case 169: 
                                                        case 172: 
                                                    }
                                                    return "audio/vnd.dts";
                                                }
                                                case 108: {
                                                    return "image/jpeg";
                                                }
                                                case 106: {
                                                    return "video/mpeg";
                                                }
                                                case 105: 
                                                case 107: {
                                                    return "audio/mpeg";
                                                }
                                                case 96: 
                                                case 97: 
                                                case 98: 
                                                case 99: 
                                                case 100: 
                                                case 101: {
                                                    return "video/mpeg2";
                                                }
                                                case 102: 
                                                case 103: 
                                                case 104: {
                                                    return "audio/mp4a-latm";
                                                }
                                            }
                                        }
                                        return "audio/eac3";
                                    }
                                    return "audio/ac3";
                                }
                                return "audio/vorbis";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static iP1$b e(String object) {
        int n3;
        int n4;
        block5: {
            Object object2 = b;
            object = ((Pattern)object2).matcher((CharSequence)object);
            boolean bl2 = ((Matcher)object).matches();
            iP1$b iP1$b = null;
            if (!bl2) {
                return null;
            }
            int n7 = 1;
            object2 = ((Matcher)object).group(n7);
            object2.getClass();
            object = ((Matcher)object).group(2);
            int n8 = 16;
            try {
                n4 = Integer.parseInt((String)object2, n8);
                if (object == null) break block5;
            }
            catch (NumberFormatException numberFormatException) {
                return iP1$b;
            }
            n3 = Integer.parseInt((String)object);
            return new iP1$b(n4, n3);
        }
        n3 = 0;
        object = null;
        return new iP1$b(n4, n3);
    }

    public static String f(String string2) {
        int n3;
        if (string2 == null) {
            return null;
        }
        int n4 = string2.indexOf(47);
        if (n4 == (n3 = -1)) {
            return null;
        }
        return string2.substring(0, n4);
    }

    public static int g(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        int n3 = -1;
        if (bl2) {
            return n3;
        }
        bl2 = ip1_0.h(string2);
        if (bl2) {
            return 1;
        }
        bl2 = ip1_0.k(string2);
        if (bl2) {
            return 2;
        }
        bl2 = ip1_0.j(string2);
        if (bl2) {
            return 3;
        }
        bl2 = ip1_0.i(string2);
        if (bl2) {
            return 4;
        }
        Object object = "application/id3";
        bl2 = ((String)object).equals(string2);
        if (!(bl2 || (bl2 = ((String)(object = "application/x-emsg")).equals(string2)) || (bl2 = ((String)(object = "application/x-scte35")).equals(string2)) || (bl2 = ((String)(object = "application/x-icy")).equals(string2)) || (bl2 = ((String)(object = "application/vnd.dvb.ait")).equals(string2)))) {
            object = "application/x-camera-motion";
            bl2 = ((String)object).equals(string2);
            if (bl2) {
                return 6;
            }
            object = a;
            int n4 = ((ArrayList)object).size();
            for (int i3 = 0; i3 < n4; ++i3) {
                ((iP1$a)((ArrayList)object).get(i3)).getClass();
                boolean bl3 = string2.equals(null);
                if (!bl3) continue;
                n3 = 0;
                break;
            }
            return n3;
        }
        return 5;
    }

    public static boolean h(String string2) {
        string2 = ip1_0.f(string2);
        return "audio".equals(string2);
    }

    public static boolean i(String string2) {
        boolean bl2;
        String string3 = "image";
        String string4 = ip1_0.f(string2);
        boolean bl3 = string3.equals(string4);
        if (!bl3 && !(bl2 = (string3 = "application/x-image-uri").equals(string2))) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean j(String string2) {
        boolean bl2;
        String string3 = "text";
        String string4 = ip1_0.f(string2);
        boolean bl3 = string3.equals(string4);
        if (!(bl3 || (bl3 = (string3 = "application/x-media3-cues").equals(string2)) || (bl3 = (string3 = "application/cea-608").equals(string2)) || (bl3 = (string3 = "application/cea-708").equals(string2)) || (bl3 = (string3 = "application/x-mp4-cea-608").equals(string2)) || (bl3 = (string3 = "application/x-subrip").equals(string2)) || (bl3 = (string3 = "application/ttml+xml").equals(string2)) || (bl3 = (string3 = "application/x-quicktime-tx3g").equals(string2)) || (bl3 = (string3 = "application/x-mp4-vtt").equals(string2)) || (bl3 = (string3 = "application/x-rawcc").equals(string2)) || (bl3 = (string3 = "application/vobsub").equals(string2)) || (bl3 = (string3 = "application/pgs").equals(string2)) || (bl2 = (string3 = "application/dvbsubs").equals(string2)))) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean k(String string2) {
        string2 = ip1_0.f(string2);
        return "video".equals(string2);
    }

    public static String l(String string2) {
        if (string2 == null) {
            return null;
        }
        string2 = Ascii.toLowerCase(string2);
        string2.getClass();
        int n3 = -1;
        int n4 = string2.hashCode();
        switch (n4) {
            default: {
                break;
            }
            case 187090231: {
                String string3 = "audio/mp3";
                n4 = (int)(string2.equals(string3) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 6;
                break;
            }
            case -432836267: {
                String string4 = "audio/mpeg-l2";
                n4 = (int)(string2.equals(string4) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 5;
                break;
            }
            case -432836268: {
                String string5 = "audio/mpeg-l1";
                n4 = (int)(string2.equals(string5) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 4;
                break;
            }
            case -586683234: {
                String string6 = "audio/x-wav";
                n4 = (int)(string2.equals(string6) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 3;
                break;
            }
            case -979095690: {
                String string7 = "application/x-mpegurl";
                n4 = (int)(string2.equals(string7) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 2;
                break;
            }
            case -1007807498: {
                String string8 = "audio/x-flac";
                n4 = (int)(string2.equals(string8) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 1;
                break;
            }
            case -1833600100: {
                String string9 = "video/x-mvhevc";
                n4 = (int)(string2.equals(string9) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 0;
            }
        }
        switch (n3) {
            default: {
                return string2;
            }
            case 6: {
                return "audio/mpeg";
            }
            case 5: {
                return "audio/mpeg-L2";
            }
            case 4: {
                return "audio/mpeg-L1";
            }
            case 3: {
                return "audio/wav";
            }
            case 2: {
                return "application/x-mpegURL";
            }
            case 1: {
                return "audio/flac";
            }
            case 0: 
        }
        return "video/mv-hevc";
    }
}

