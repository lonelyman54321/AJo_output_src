/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzahc;
import com.google.android.gms.internal.ads.zzahk;
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzaht;
import com.google.android.gms.internal.ads.zzahz;
import com.google.android.gms.internal.ads.zzajo;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.List;

final class zzakf {
    static final String[] zza = new String[]{"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzcc zza(zzfu var0) {
        block27: {
            block45: {
                block26: {
                    block47: {
                        block48: {
                            block53: {
                                block52: {
                                    block51: {
                                        block50: {
                                            block49: {
                                                block46: {
                                                    block28: {
                                                        block44: {
                                                            block43: {
                                                                block42: {
                                                                    block41: {
                                                                        block40: {
                                                                            block39: {
                                                                                block38: {
                                                                                    block37: {
                                                                                        block36: {
                                                                                            block35: {
                                                                                                block34: {
                                                                                                    block33: {
                                                                                                        block32: {
                                                                                                            block31: {
                                                                                                                block30: {
                                                                                                                    block29: {
                                                                                                                        block25: {
                                                                                                                            block24: {
                                                                                                                                var1_1 = "Skipped unknown metadata entry: ";
                                                                                                                                var2_3 /* !! */  = "Unrecognized cover art flags: ";
                                                                                                                                var3_4 = var0.zzd();
                                                                                                                                var4_5 = var0.zzg() + var3_4;
                                                                                                                                var3_4 = var0.zzg();
                                                                                                                                var5_6 = var3_4 >> 24 & 255;
                                                                                                                                var6_7 = 169;
                                                                                                                                var7_8 = 0xFFFFFF;
                                                                                                                                var8_9 = "TCON";
                                                                                                                                var9_10 = 1684108385;
                                                                                                                                var10_11 = "MetadataUtil";
                                                                                                                                var11_12 /* !! */  = null;
                                                                                                                                if (var5_6 == var6_7 || var5_6 == (var6_7 = 253)) break block28;
                                                                                                                                var5_6 = 1735291493;
                                                                                                                                var6_7 = -1;
                                                                                                                                if (var3_4 != var5_6) break block29;
                                                                                                                                try {
                                                                                                                                    var12_13 = zzakf.zzb(var0);
                                                                                                                                    if (var12_13 <= 0 || var12_13 > (var13_17 = 192)) break block24;
                                                                                                                                    var2_3 /* !! */  = zzakf.zza;
                                                                                                                                    var1_1 = var2_3 /* !! */ [var12_13 += var6_7];
                                                                                                                                    break block25;
                                                                                                                                }
                                                                                                                                catch (Throwable var1_2) {
                                                                                                                                    break block26;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var12_13 = 0;
                                                                                                                            var1_1 = null;
                                                                                                                        }
                                                                                                                        if (var1_1 != null) {
                                                                                                                            var1_1 = zzgbc.zzn(var1_1);
                                                                                                                            var11_12 /* !! */  = var2_3 /* !! */  = new zzahz(var8_9, null, (List)var1_1);
                                                                                                                            break block27;
                                                                                                                        } else {
                                                                                                                            var1_1 = "Failed to parse standard genre code";
                                                                                                                            zzfk.zzf(var10_11, (String)var1_1);
                                                                                                                        }
                                                                                                                        break block27;
                                                                                                                    }
                                                                                                                    var5_6 = 1684632427;
                                                                                                                    if (var3_4 != var5_6) break block30;
                                                                                                                    var1_1 = "TPOS";
                                                                                                                    var11_12 /* !! */  = zzakf.zzd(var5_6, (String)var1_1, var0);
                                                                                                                    break block27;
                                                                                                                }
                                                                                                                var5_6 = 1953655662;
                                                                                                                if (var3_4 != var5_6) break block31;
                                                                                                                var1_1 = "TRCK";
                                                                                                                var11_12 /* !! */  = zzakf.zzd(var5_6, (String)var1_1, var0);
                                                                                                                break block27;
                                                                                                            }
                                                                                                            var5_6 = 1953329263;
                                                                                                            var14_20 = 1;
                                                                                                            var15_21 = 0;
                                                                                                            if (var3_4 != var5_6) break block32;
                                                                                                            var1_1 = "TBPM";
                                                                                                            var11_12 /* !! */  = zzakf.zzc(var5_6, (String)var1_1, var0, (boolean)var14_20, false);
                                                                                                            break block27;
                                                                                                        }
                                                                                                        var5_6 = 1668311404;
                                                                                                        if (var3_4 != var5_6) break block33;
                                                                                                        var1_1 = "TCMP";
                                                                                                        var11_12 /* !! */  = zzakf.zzc(var5_6, (String)var1_1, var0, (boolean)var14_20, (boolean)var14_20);
                                                                                                        break block27;
                                                                                                    }
                                                                                                    var5_6 = 1668249202;
                                                                                                    var16_22 = 4;
                                                                                                    if (var3_4 != var5_6) break block34;
                                                                                                    var12_14 = var0.zzg();
                                                                                                    var3_4 = var0.zzg();
                                                                                                    if (var3_4 == var9_10) {
                                                                                                        var3_4 = var0.zzg() & var7_8;
                                                                                                        if (var3_4 == (var5_6 = 13)) {
                                                                                                            var17_23 = "image/jpeg";
                                                                                                        } else {
                                                                                                            var5_6 = 14;
                                                                                                            if (var3_4 == var5_6) {
                                                                                                                var17_23 = var18_24 = "image/png";
                                                                                                                var3_4 = 14;
                                                                                                            } else {
                                                                                                                var5_6 = 0;
                                                                                                                var17_23 = null;
                                                                                                            }
                                                                                                        }
                                                                                                        if (var17_23 == null) {
                                                                                                            var1_1 = new StringBuilder((String)var2_3 /* !! */ );
                                                                                                            var1_1.append(var3_4);
                                                                                                            var1_1 = var1_1.toString();
                                                                                                            zzfk.zzf(var10_11, (String)var1_1);
                                                                                                            break block27;
                                                                                                        } else {
                                                                                                            var0.zzL(var16_22);
                                                                                                            var2_3 /* !! */  = (String[])new byte[var12_14 += -16];
                                                                                                            var0.zzG((byte[])var2_3 /* !! */ , 0, var12_14);
                                                                                                            var3_4 = 3;
                                                                                                            var1_1 = new zzahc(var17_23, null, var3_4, (byte[])var2_3 /* !! */ );
                                                                                                            var11_12 /* !! */  = var1_1;
                                                                                                        }
                                                                                                        break block27;
                                                                                                    } else {
                                                                                                        var1_1 = "Failed to parse cover art attribute";
                                                                                                        zzfk.zzf(var10_11, (String)var1_1);
                                                                                                    }
                                                                                                    break block27;
                                                                                                }
                                                                                                var13_18 = 1631670868;
                                                                                                if (var3_4 != var13_18) break block35;
                                                                                                var1_1 = "TPE2";
                                                                                                var11_12 /* !! */  = zzakf.zze(var13_18, (String)var1_1, var0);
                                                                                                break block27;
                                                                                            }
                                                                                            var13_18 = 1936682605;
                                                                                            if (var3_4 != var13_18) break block36;
                                                                                            var1_1 = "TSOT";
                                                                                            var11_12 /* !! */  = zzakf.zze(var13_18, (String)var1_1, var0);
                                                                                            break block27;
                                                                                        }
                                                                                        var13_18 = 1936679276;
                                                                                        if (var3_4 != var13_18) break block37;
                                                                                        var1_1 = "TSOA";
                                                                                        var11_12 /* !! */  = zzakf.zze(var13_18, (String)var1_1, var0);
                                                                                        break block27;
                                                                                    }
                                                                                    var13_18 = 1936679282;
                                                                                    if (var3_4 != var13_18) break block38;
                                                                                    var1_1 = "TSOP";
                                                                                    var11_12 /* !! */  = zzakf.zze(var13_18, (String)var1_1, var0);
                                                                                    break block27;
                                                                                }
                                                                                var13_18 = 1936679265;
                                                                                if (var3_4 != var13_18) break block39;
                                                                                var1_1 = "TSO2";
                                                                                var11_12 /* !! */  = zzakf.zze(var13_18, (String)var1_1, var0);
                                                                                break block27;
                                                                            }
                                                                            var13_18 = 1936679791;
                                                                            if (var3_4 != var13_18) break block40;
                                                                            var1_1 = "TSOC";
                                                                            var11_12 /* !! */  = zzakf.zze(var13_18, (String)var1_1, var0);
                                                                            break block27;
                                                                        }
                                                                        var13_18 = 1920233063;
                                                                        if (var3_4 != var13_18) break block41;
                                                                        var1_1 = "ITUNESADVISORY";
                                                                        var11_12 /* !! */  = zzakf.zzc(var13_18, (String)var1_1, var0, false, false);
                                                                        break block27;
                                                                    }
                                                                    var13_18 = 1885823344;
                                                                    if (var3_4 != var13_18) break block42;
                                                                    var1_1 = "ITUNESGAPLESS";
                                                                    var13_18 = 1885823344;
                                                                    var11_12 /* !! */  = zzakf.zzc(var13_18, (String)var1_1, var0, false, (boolean)var14_20);
                                                                    break block27;
                                                                }
                                                                var13_18 = 1936683886;
                                                                if (var3_4 != var13_18) break block43;
                                                                var1_1 = "TVSHOWSORT";
                                                                var13_18 = 1936683886;
                                                                var11_12 /* !! */  = zzakf.zze(var13_18, (String)var1_1, var0);
                                                                break block27;
                                                            }
                                                            var13_18 = 1953919848;
                                                            if (var3_4 != var13_18) break block44;
                                                            var1_1 = "TVSHOW";
                                                            var13_18 = 1953919848;
                                                            var11_12 /* !! */  = zzakf.zze(var13_18, (String)var1_1, var0);
                                                            break block27;
                                                        }
                                                        var13_18 = 0x2D2D2D2D;
                                                        if (var3_4 != var13_18) ** GOTO lbl-1000
                                                        var12_15 = false;
                                                        var1_1 = null;
                                                        var13_18 = 0;
                                                        var2_3 /* !! */  = null;
                                                        var3_4 = -1;
                                                        var5_6 = -1;
                                                        break block45;
                                                    }
                                                    var13_19 = var3_4 & var7_8;
                                                    var5_6 = 6516084;
                                                    if (var13_19 != var5_6) break block46;
                                                    var12_16 = var0.zzg();
                                                    var13_19 = var0.zzg();
                                                    if (var13_19 == var9_10) {
                                                        var13_19 = 8;
                                                        var0.zzL(var13_19);
                                                        var1_1 = var0.zzz(var12_16 += -16);
                                                        var2_3 /* !! */  = "und";
                                                        var11_12 /* !! */  = new zzahk((String)var2_3 /* !! */ , (String)var1_1, (String)var1_1);
                                                        break block27;
                                                    } else {
                                                        var1_1 = zzajo.zzf(var3_4);
                                                        var2_3 /* !! */  = "Failed to parse comment attribute: ";
                                                        var1_1 = var2_3 /* !! */ .concat((String)var1_1);
                                                        zzfk.zzf(var10_11, (String)var1_1);
                                                    }
                                                    break block27;
                                                }
                                                var5_6 = 7233901;
                                                if (var13_19 == var5_6 || var13_19 == (var5_6 = 7631467)) break block47;
                                                var5_6 = 6516589;
                                                if (var13_19 == var5_6 || var13_19 == (var5_6 = 0x777274)) break block48;
                                                var5_6 = 6578553;
                                                if (var13_19 != var5_6) break block49;
                                                var1_1 = "TDRC";
                                                var11_12 /* !! */  = zzakf.zze(var3_4, (String)var1_1, var0);
                                                break block27;
                                            }
                                            var5_6 = 4280916;
                                            if (var13_19 != var5_6) break block50;
                                            var1_1 = "TPE1";
                                            var11_12 /* !! */  = zzakf.zze(var3_4, (String)var1_1, var0);
                                            break block27;
                                        }
                                        var5_6 = 7630703;
                                        if (var13_19 != var5_6) break block51;
                                        var1_1 = "TSSE";
                                        var11_12 /* !! */  = zzakf.zze(var3_4, (String)var1_1, var0);
                                        break block27;
                                    }
                                    var5_6 = 6384738;
                                    if (var13_19 != var5_6) break block52;
                                    var1_1 = "TALB";
                                    var11_12 /* !! */  = zzakf.zze(var3_4, (String)var1_1, var0);
                                    break block27;
                                }
                                var5_6 = 7108978;
                                if (var13_19 != var5_6) break block53;
                                var1_1 = "USLT";
                                var11_12 /* !! */  = zzakf.zze(var3_4, (String)var1_1, var0);
                                break block27;
                            }
                            var5_6 = 6776174;
                            if (var13_19 == var5_6) {
                                var11_12 /* !! */  = zzakf.zze(var3_4, var8_9, var0);
                                break block27;
                            } else {
                                var5_6 = 6779504;
                                if (var13_19 == var5_6) {
                                    var1_1 = "TIT1";
                                    var11_12 /* !! */  = zzakf.zze(var3_4, (String)var1_1, var0);
                                    break block27;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var2_3 /* !! */  = zzajo.zzf(var3_4);
                                    var18_26 = new StringBuilder((String)var1_1);
                                    var18_26.append((String)var2_3 /* !! */ );
                                    var1_1 = var18_26.toString();
                                    zzfk.zzb(var10_11, (String)var1_1);
                                }
                            }
                            break block27;
                        }
                        var1_1 = "TCOM";
                        var11_12 /* !! */  = zzakf.zze(var3_4, (String)var1_1, var0);
                        break block27;
                    }
                    var1_1 = "TIT2";
                    var11_12 /* !! */  = zzakf.zze(var3_4, (String)var1_1, var0);
                    break block27;
                }
                var0.zzK(var4_5);
                throw var1_2;
            }
            while ((var7_8 = var0.zzd()) < var4_5) {
                var7_8 = var0.zzd();
                var14_20 = var0.zzg();
                var19_27 = var0.zzg();
                var0.zzL(var16_22);
                var15_21 = 1835360622;
                if (var19_27 == var15_21) {
                    var1_1 = var0.zzz(var14_20 += -12);
                    continue;
                }
                var15_21 = var14_20 + -12;
                var20_28 = 1851878757;
                if (var19_27 == var20_28) {
                    var2_3 /* !! */  = var0.zzz(var15_21);
                    continue;
                }
                if (var19_27 == var9_10) {
                    var5_6 = var14_20;
                }
                if (var19_27 == var9_10) {
                    var3_4 = var7_8;
                }
                var0.zzL(var15_21);
            }
            if (var1_1 != null && var2_3 /* !! */  != null && var3_4 != var6_7) {
                var0.zzK(var3_4);
                var3_4 = 16;
                var0.zzL(var3_4);
                var18_25 = var0.zzz(var5_6 += -16);
                var11_12 /* !! */  = new zzaht((String)var1_1, (String)var2_3 /* !! */ , var18_25);
            }
        }
        var0.zzK(var4_5);
        return var11_12 /* !! */ ;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int zzb(zzfu zzfu2) {
        int n3;
        int n4 = zzfu2.zzg();
        int n7 = zzfu2.zzg();
        if (n7 == (n3 = 1684108385)) {
            zzfu2.zzL(8);
            n7 = 1;
            if ((n4 += -16) == n7) return zzfu2.zzm();
            n7 = 2;
            if (n4 == n7) return zzfu2.zzq();
            n7 = 3;
            if (n4 == n7) return zzfu2.zzo();
            n7 = 4;
            if (n4 == n7 && (n4 = zzfu2.zzf() & 0x80) == 0) {
                return zzfu2.zzp();
            }
        }
        zzfk.zzf("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzahr zzc(int n3, String string2, zzfu object, boolean bl2, boolean bl3) {
        int n4 = zzakf.zzb((zzfu)object);
        if (bl3) {
            bl3 = true;
            n4 = Math.min((int)(bl3 ? 1 : 0), n4);
        }
        bl3 = false;
        if (n4 >= 0) {
            zzahr zzahr2;
            if (bl2) {
                object = zzgbc.zzn(Integer.toString(n4));
                zzahr2 = new zzahz(string2, null, (List)object);
            } else {
                object = Integer.toString(n4);
                String string3 = "und";
                zzahr2 = new zzahk(string3, string2, (String)object);
            }
            return zzahr2;
        }
        String string4 = zzajo.zzf(n3);
        string4 = "Failed to parse uint8 attribute: ".concat(string4);
        zzfk.zzf("MetadataUtil", string4);
        return null;
    }

    private static zzahz zzd(int n3, String string2, zzfu object) {
        int n4;
        int n7 = ((zzfu)object).zzg();
        int n8 = ((zzfu)object).zzg();
        if (n8 == (n4 = 1684108385) && n7 >= (n8 = 22)) {
            ((zzfu)object).zzL(10);
            n7 = ((zzfu)object).zzq();
            if (n7 > 0) {
                Object object2 = new StringBuilder();
                ((StringBuilder)object2).append(n7);
                object2 = ((StringBuilder)object2).toString();
                int n10 = ((zzfu)object).zzq();
                if (n10 > 0) {
                    String string3 = "/";
                    object2 = LO1.a(n10, (String)object2, string3);
                }
                object2 = zzgbc.zzn(object2);
                object = new zzahz(string2, null, (List)object2);
                return object;
            }
        }
        String string4 = zzajo.zzf(n3);
        string4 = "Failed to parse index/count attribute: ".concat(string4);
        zzfk.zzf("MetadataUtil", string4);
        return null;
    }

    private static zzahz zze(int n3, String string2, zzfu object) {
        int n4;
        int n7 = ((zzfu)object).zzg();
        int n8 = ((zzfu)object).zzg();
        if (n8 == (n4 = 1684108385)) {
            ((zzfu)object).zzL(8);
            Object object2 = ((zzfu)object).zzz(n7 += -16);
            object2 = zzgbc.zzn(object2);
            object = new zzahz(string2, null, (List)object2);
            return object;
        }
        String string3 = zzajo.zzf(n3);
        string3 = "Failed to parse text attribute: ".concat(string3);
        zzfk.zzf("MetadataUtil", string3);
        return null;
    }
}

