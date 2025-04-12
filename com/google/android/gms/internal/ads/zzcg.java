/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzce;
import com.google.android.gms.internal.ads.zzcf;
import com.google.android.gms.internal.ads.zzfxm;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzcg {
    public static final /* synthetic */ int zza;
    private static final ArrayList zzb;
    private static final Pattern zzc;

    static {
        ArrayList arrayList;
        zzb = arrayList = new ArrayList();
        zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
    }

    public static int zza(String object, String string2) {
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        block29: {
            int n15 = ((String)object).hashCode();
            n14 = 6;
            n10 = 5;
            n8 = 9;
            n7 = 7;
            n4 = 8;
            switch (n15) {
                default: {
                    break;
                }
                case 1556697186: {
                    String string3 = "audio/true-hd";
                    n3 = (int)(((String)object).equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 10;
                    break block29;
                }
                case 1505942594: {
                    String string4 = "audio/vnd.dts.hd";
                    n3 = (int)(((String)object).equals(string4) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 7;
                    break block29;
                }
                case 1504891608: {
                    String string5 = "audio/opus";
                    n3 = (int)(((String)object).equals(string5) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 11;
                    break block29;
                }
                case 1504831518: {
                    String string6 = "audio/mpeg";
                    n3 = (int)(((String)object).equals(string6) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 0;
                    object = null;
                    break block29;
                }
                case 1504578661: {
                    String string7 = "audio/eac3";
                    n3 = (int)(((String)object).equals(string7) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 3;
                    break block29;
                }
                case 550520934: {
                    String string8 = "audio/vnd.dts.uhd;profile=p2";
                    n3 = (int)(((String)object).equals(string8) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 9;
                    break block29;
                }
                case 187078297: {
                    String string9 = "audio/ac4";
                    n3 = (int)(((String)object).equals(string9) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 5;
                    break block29;
                }
                case 187078296: {
                    String string10 = "audio/ac3";
                    n3 = (int)(((String)object).equals(string10) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 2;
                    break block29;
                }
                case -53558318: {
                    String string11 = "audio/mp4a-latm";
                    n3 = (int)(((String)object).equals(string11) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 1;
                    break block29;
                }
                case -1095064472: {
                    String string12 = "audio/vnd.dts";
                    n3 = (int)(((String)object).equals(string12) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 6;
                    break block29;
                }
                case -1365340241: {
                    String string13 = "audio/vnd.dts.hd;profile=lbr";
                    n3 = (int)(((String)object).equals(string13) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 8;
                    break block29;
                }
                case -2123537834: {
                    String string14 = "audio/eac3-joc";
                    n3 = (int)(((String)object).equals(string14) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 4;
                    break block29;
                }
            }
            n3 = -1;
        }
        switch (n3) {
            default: {
                return 0;
            }
            case 11: {
                return 20;
            }
            case 10: {
                return 14;
            }
            case 9: {
                return 30;
            }
            case 7: 
            case 8: {
                return n4;
            }
            case 6: {
                return n7;
            }
            case 5: {
                return 17;
            }
            case 4: {
                return 18;
            }
            case 3: {
                return n14;
            }
            case 2: {
                return n10;
            }
            case 1: {
                if (string2 == null) {
                    return 0;
                }
                object = zzcg.zzc(string2);
                if (object == null) {
                    return 0;
                }
                return ((zzcf)object).zza();
            }
            case 0: 
        }
        return n8;
    }

    public static int zzb(String string2) {
        boolean n3 = TextUtils.isEmpty((CharSequence)string2);
        int n4 = -1;
        if (n3) {
            return n4;
        }
        boolean bl2 = zzcg.zzg(string2);
        if (bl2) {
            return 1;
        }
        boolean bl3 = zzcg.zzh(string2);
        if (!bl3) {
            boolean bl4;
            boolean bl5;
            boolean bl6;
            boolean bl7;
            boolean bl8;
            boolean bl9;
            boolean bl10;
            boolean bl11;
            boolean bl12;
            boolean bl13;
            boolean bl14;
            boolean bl15;
            String string3 = "text";
            Object object = zzcg.zzi(string2);
            boolean bl16 = string3.equals(object);
            if (!(bl16 || (bl15 = ((String)(object = "application/x-media3-cues")).equals(string2)) || (bl14 = ((String)(object = "application/cea-608")).equals(string2)) || (bl13 = ((String)(object = "application/cea-708")).equals(string2)) || (bl12 = ((String)(object = "application/x-mp4-cea-608")).equals(string2)) || (bl11 = ((String)(object = "application/x-subrip")).equals(string2)) || (bl10 = ((String)(object = "application/ttml+xml")).equals(string2)) || (bl9 = ((String)(object = "application/x-quicktime-tx3g")).equals(string2)) || (bl8 = ((String)(object = "application/x-mp4-vtt")).equals(string2)) || (bl7 = ((String)(object = "application/x-rawcc")).equals(string2)) || (bl6 = ((String)(object = "application/vobsub")).equals(string2)) || (bl5 = ((String)(object = "application/pgs")).equals(string2)) || (bl4 = ((String)(object = "application/dvbsubs")).equals(string2)))) {
                boolean bl17;
                string3 = "image";
                object = zzcg.zzi(string2);
                boolean bl18 = string3.equals(object);
                if (!bl18 && !(bl17 = ((String)(object = "application/x-image-uri")).equals(string2))) {
                    boolean bl19;
                    boolean bl20;
                    object = "application/id3";
                    boolean bl21 = ((String)object).equals(string2);
                    if (!(bl21 || (bl20 = ((String)(object = "application/x-emsg")).equals(string2)) || (bl19 = ((String)(object = "application/x-scte35")).equals(string2)))) {
                        object = "application/x-camera-motion";
                        boolean bl22 = ((String)object).equals(string2);
                        if (!bl22) {
                            object = zzb;
                            int n7 = ((ArrayList)object).size();
                            string3 = null;
                            for (int i3 = 0; i3 < n7; ++i3) {
                                String cfr_ignored_0 = ((zzce)zzcg.zzb.get((int)i3)).zza;
                                boolean bl23 = string2.equals(null);
                                if (!bl23) continue;
                                n4 = 0;
                                break;
                            }
                            return n4;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 3;
        }
        return 2;
    }

    public static zzcf zzc(String object) {
        Object object2 = zzc;
        int n3 = (int)(((Matcher)(object = ((Pattern)object2).matcher((CharSequence)object))).matches() ? 1 : 0);
        if (n3 != 0) {
            int n4;
            block5: {
                block4: {
                    n3 = 1;
                    object2 = ((Matcher)object).group(n3);
                    object2.getClass();
                    object = ((Matcher)object).group(2);
                    int n7 = 16;
                    try {
                        n3 = Integer.parseInt((String)object2, n7);
                        if (object == null) break block4;
                    }
                    catch (NumberFormatException numberFormatException) {}
                    n4 = Integer.parseInt((String)object);
                    break block5;
                }
                n4 = 0;
                object = null;
            }
            zzcf zzcf2 = new zzcf(n3, n4);
            return zzcf2;
        }
        return null;
    }

    public static String zzd(int n3) {
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

    public static String zze(String string2) {
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        block15: {
            if (string2 == null) {
                return null;
            }
            string2 = zzfxm.zza(string2);
            n14 = string2.hashCode();
            n10 = 3;
            n8 = 2;
            n7 = 4;
            n4 = 5;
            n3 = 1;
            switch (n14) {
                default: {
                    break;
                }
                case 187090231: {
                    String string3 = "audio/mp3";
                    n14 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n14 == 0) break;
                    n14 = 1;
                    break block15;
                }
                case -432836267: {
                    String string4 = "audio/mpeg-l2";
                    n14 = (int)(string2.equals(string4) ? 1 : 0);
                    if (n14 == 0) break;
                    n14 = 5;
                    break block15;
                }
                case -432836268: {
                    String string5 = "audio/mpeg-l1";
                    n14 = (int)(string2.equals(string5) ? 1 : 0);
                    if (n14 == 0) break;
                    n14 = 4;
                    break block15;
                }
                case -586683234: {
                    String string6 = "audio/x-wav";
                    n14 = (int)(string2.equals(string6) ? 1 : 0);
                    if (n14 == 0) break;
                    n14 = 2;
                    break block15;
                }
                case -979095690: {
                    String string7 = "application/x-mpegurl";
                    n14 = (int)(string2.equals(string7) ? 1 : 0);
                    if (n14 == 0) break;
                    n14 = 3;
                    break block15;
                }
                case -1007807498: {
                    String string8 = "audio/x-flac";
                    n14 = (int)(string2.equals(string8) ? 1 : 0);
                    if (n14 == 0) break;
                    n14 = 0;
                    string8 = null;
                    break block15;
                }
            }
            n14 = -1;
        }
        if (n14 != 0) {
            if (n14 != n3) {
                if (n14 != n8) {
                    if (n14 != n10) {
                        if (n14 != n7) {
                            if (n14 != n4) {
                                return string2;
                            }
                            return "audio/mpeg-L2";
                        }
                        return "audio/mpeg-L1";
                    }
                    return "application/x-mpegURL";
                }
                return "audio/wav";
            }
            return "audio/mpeg";
        }
        return "audio/flac";
    }

    public static boolean zzf(String object, String string2) {
        int n3;
        boolean bl2;
        block21: {
            if (object == null) {
                return false;
            }
            int n4 = ((String)object).hashCode();
            bl2 = true;
            switch (n4) {
                default: {
                    break;
                }
                case 1903589369: {
                    String string3 = "audio/g711-mlaw";
                    n3 = (int)(((String)object).equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 5;
                    break block21;
                }
                case 1903231877: {
                    String string4 = "audio/g711-alaw";
                    n3 = (int)(((String)object).equals(string4) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 4;
                    break block21;
                }
                case 1504831518: {
                    String string5 = "audio/mpeg";
                    n3 = (int)(((String)object).equals(string5) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 0;
                    object = null;
                    break block21;
                }
                case 1504619009: {
                    String string6 = "audio/flac";
                    n3 = (int)(((String)object).equals(string6) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 6;
                    break block21;
                }
                case 1504578661: {
                    String string7 = "audio/eac3";
                    n3 = (int)(((String)object).equals(string7) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 8;
                    break block21;
                }
                case 187094639: {
                    String string8 = "audio/raw";
                    n3 = (int)(((String)object).equals(string8) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 3;
                    break block21;
                }
                case 187078296: {
                    String string9 = "audio/ac3";
                    n3 = (int)(((String)object).equals(string9) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 7;
                    break block21;
                }
                case -53558318: {
                    String string10 = "audio/mp4a-latm";
                    n3 = (int)(((String)object).equals(string10) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 10;
                    break block21;
                }
                case -432837259: {
                    String string11 = "audio/mpeg-L2";
                    n3 = (int)(((String)object).equals(string11) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 2;
                    break block21;
                }
                case -432837260: {
                    String string12 = "audio/mpeg-L1";
                    n3 = (int)(((String)object).equals(string12) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 1;
                    break block21;
                }
                case -2123537834: {
                    String string13 = "audio/eac3-joc";
                    n3 = (int)(((String)object).equals(string13) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 9;
                    break block21;
                }
            }
            n3 = -1;
        }
        switch (n3) {
            default: {
                return false;
            }
            case 10: {
                int n7;
                if (string2 == null) {
                    return false;
                }
                object = zzcg.zzc(string2);
                if (object == null) {
                    return false;
                }
                n3 = ((zzcf)object).zza();
                if (n3 != 0 && n3 != (n7 = 16)) {
                    return bl2;
                }
                return false;
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
        }
        return bl2;
    }

    public static boolean zzg(String string2) {
        string2 = zzcg.zzi(string2);
        return "audio".equals(string2);
    }

    public static boolean zzh(String string2) {
        string2 = zzcg.zzi(string2);
        return "video".equals(string2);
    }

    private static String zzi(String string2) {
        int n3;
        int n4;
        if (string2 != null && (n4 = string2.indexOf(47)) != (n3 = -1)) {
            return string2.substring(0, n4);
        }
        return null;
    }
}

