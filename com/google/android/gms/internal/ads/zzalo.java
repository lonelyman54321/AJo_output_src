/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzalt;
import com.google.android.gms.internal.ads.zzalv;
import com.google.android.gms.internal.ads.zzamh;
import com.google.android.gms.internal.ads.zzamj;
import com.google.android.gms.internal.ads.zzaml;
import com.google.android.gms.internal.ads.zzamp;
import com.google.android.gms.internal.ads.zzamv;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzana;
import com.google.android.gms.internal.ads.zzanb;
import com.google.android.gms.internal.ads.zzanm;
import java.util.List;
import java.util.Objects;

public final class zzalo
implements zzalt {
    public final int zza(zzan object) {
        Object object2;
        block17: {
            int n3;
            int n4;
            int n7;
            block18: {
                object = ((zzan)object).zzn;
                if (object == null) break block17;
                n7 = ((String)object).hashCode();
                n4 = 2;
                n3 = 1;
                switch (n7) {
                    default: {
                        break;
                    }
                    case 1693976202: {
                        object2 = "application/ttml+xml";
                        n7 = (int)(((String)object).equals(object2) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 7;
                        break block18;
                    }
                    case 1668750253: {
                        object2 = "application/x-subrip";
                        n7 = (int)(((String)object).equals(object2) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 3;
                        break block18;
                    }
                    case 822864842: {
                        object2 = "text/x-ssa";
                        n7 = (int)(((String)object).equals(object2) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 0;
                        object2 = null;
                        break block18;
                    }
                    case 691401887: {
                        object2 = "application/x-quicktime-tx3g";
                        n7 = (int)(((String)object).equals(object2) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 4;
                        break block18;
                    }
                    case -1004728940: {
                        object2 = "text/vtt";
                        n7 = (int)(((String)object).equals(object2) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 1;
                        break block18;
                    }
                    case -1026075066: {
                        object2 = "application/x-mp4-vtt";
                        n7 = (int)(((String)object).equals(object2) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 2;
                        break block18;
                    }
                    case -1248334819: {
                        object2 = "application/pgs";
                        n7 = (int)(((String)object).equals(object2) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 5;
                        break block18;
                    }
                    case -1351681404: {
                        object2 = "application/dvbsubs";
                        n7 = (int)(((String)object).equals(object2) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 6;
                        break block18;
                    }
                }
                n7 = -1;
            }
            switch (n7) {
                default: {
                    break;
                }
                case 7: {
                    return n3;
                }
                case 4: 
                case 5: 
                case 6: {
                    return n4;
                }
                case 3: {
                    return n3;
                }
                case 2: {
                    return n4;
                }
                case 0: 
                case 1: {
                    return n3;
                }
            }
        }
        object = String.valueOf(object);
        object = "Unsupported MIME type: ".concat((String)object);
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public final zzalv zzb(zzan object) {
        Object object2;
        block20: {
            int n3;
            block21: {
                object2 = ((zzan)object).zzn;
                if (object2 == null) break block20;
                n3 = ((String)object2).hashCode();
                switch (n3) {
                    default: {
                        break;
                    }
                    case 1693976202: {
                        String string2 = "application/ttml+xml";
                        n3 = (int)(((String)object2).equals(string2) ? 1 : 0);
                        if (n3 == 0) break;
                        n3 = 7;
                        break block21;
                    }
                    case 1668750253: {
                        String string3 = "application/x-subrip";
                        n3 = (int)(((String)object2).equals(string3) ? 1 : 0);
                        if (n3 == 0) break;
                        n3 = 3;
                        break block21;
                    }
                    case 822864842: {
                        String string4 = "text/x-ssa";
                        n3 = (int)(((String)object2).equals(string4) ? 1 : 0);
                        if (n3 == 0) break;
                        n3 = 0;
                        string4 = null;
                        break block21;
                    }
                    case 691401887: {
                        String string5 = "application/x-quicktime-tx3g";
                        n3 = (int)(((String)object2).equals(string5) ? 1 : 0);
                        if (n3 == 0) break;
                        n3 = 4;
                        break block21;
                    }
                    case -1004728940: {
                        String string6 = "text/vtt";
                        n3 = (int)(((String)object2).equals(string6) ? 1 : 0);
                        if (n3 == 0) break;
                        n3 = 1;
                        break block21;
                    }
                    case -1026075066: {
                        String string7 = "application/x-mp4-vtt";
                        n3 = (int)(((String)object2).equals(string7) ? 1 : 0);
                        if (n3 == 0) break;
                        n3 = 2;
                        break block21;
                    }
                    case -1248334819: {
                        String string8 = "application/pgs";
                        n3 = (int)(((String)object2).equals(string8) ? 1 : 0);
                        if (n3 == 0) break;
                        n3 = 5;
                        break block21;
                    }
                    case -1351681404: {
                        String string9 = "application/dvbsubs";
                        n3 = (int)(((String)object2).equals(string9) ? 1 : 0);
                        if (n3 == 0) break;
                        n3 = 6;
                        break block21;
                    }
                }
                n3 = -1;
            }
            switch (n3) {
                default: {
                    break;
                }
                case 7: {
                    object = new zzamv();
                    return object;
                }
                case 6: {
                    object = ((zzan)object).zzp;
                    object2 = new zzamh((List)object);
                    return object2;
                }
                case 5: {
                    object = new zzamj();
                    return object;
                }
                case 4: {
                    object = ((zzan)object).zzp;
                    object2 = new zzana((List)object);
                    return object2;
                }
                case 3: {
                    object = new zzamp();
                    return object;
                }
                case 2: {
                    object = new zzanb();
                    return object;
                }
                case 1: {
                    object = new zzanm();
                    return object;
                }
                case 0: {
                    object = ((zzan)object).zzp;
                    object2 = new zzaml((List)object);
                    return object2;
                }
            }
        }
        object = String.valueOf(object2);
        object = "Unsupported MIME type: ".concat((String)object);
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public final boolean zzc(zzan object) {
        boolean bl2;
        object = ((zzan)object).zzn;
        String string2 = "text/x-ssa";
        boolean bl3 = Objects.equals(object, string2);
        return bl3 || (bl3 = Objects.equals(object, string2 = "text/vtt")) || (bl3 = Objects.equals(object, string2 = "application/x-mp4-vtt")) || (bl3 = Objects.equals(object, string2 = "application/x-subrip")) || (bl3 = Objects.equals(object, string2 = "application/x-quicktime-tx3g")) || (bl3 = Objects.equals(object, string2 = "application/pgs")) || (bl3 = Objects.equals(object, string2 = "application/dvbsubs")) || (bl2 = Objects.equals(object, string2 = "application/ttml+xml"));
        {
        }
    }
}

