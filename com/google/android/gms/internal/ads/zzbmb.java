/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzbly;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzbud;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcin;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzcqd;
import com.google.android.gms.internal.ads.zzdvb;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzefz;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzegl;
import com.google.android.gms.internal.ads.zzegm;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzgbf;
import com.google.android.gms.internal.ads.zzgge;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class zzbmb
implements zzblp {
    private final zzb zza;
    private final zzdvc zzb;
    private final zzr zzc;
    private final zzbud zzd;
    private final zzefz zze;
    private final zzcqd zzf;
    private zzy zzg = null;
    private final zzgge zzh;

    public zzbmb(zzb object, zzbud zzbud2, zzefz zzefz2, zzdvc zzdvc2, zzcqd zzcqd2) {
        zzgge zzgge2;
        this.zzh = zzgge2 = zzcci.zzf;
        this.zza = object;
        this.zzd = zzbud2;
        this.zze = zzefz2;
        this.zzb = zzdvc2;
        this.zzc = object = new zzr(null);
        this.zzf = zzcqd2;
    }

    public static int zzb(Map object) {
        String string2 = "o";
        if ((object = (String)object.get(string2)) != null) {
            string2 = "p";
            boolean bl2 = string2.equalsIgnoreCase((String)object);
            if (bl2) {
                return 7;
            }
            string2 = "l";
            bl2 = string2.equalsIgnoreCase((String)object);
            if (bl2) {
                return 6;
            }
            string2 = "c";
            boolean bl3 = string2.equalsIgnoreCase((String)object);
            if (bl3) {
                return 14;
            }
        }
        return -1;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Uri zzc(Context context, zzaxd object, Uri uri, View object2, Activity activity, zzfhs zzfhs2) {
        if (object == null) {
            return uri;
        }
        try {
            Object object3 = zzbep.zzlW;
            zzben zzben2 = zzba.zzc();
            object3 = zzben2.zza((zzbeg)object3);
            object3 = (Boolean)object3;
            boolean bl2 = (Boolean)object3;
            if (bl2 && zzfhs2 != null) {
                boolean bl3 = ((zzaxd)object).zze(uri);
                if (!bl3) return uri;
                return zzfhs2.zza(uri, context, (View)object2, activity);
            }
        }
        catch (Exception exception222) {
        }
        boolean bl4 = ((zzaxd)object).zze(uri);
        if (!bl4) return uri;
        return ((zzaxd)object).zza(uri, context, (View)object2, activity);
        catch (zzaxe zzaxe2) {
            return uri;
        }
        object = "OpenGmsgHandler.maybeAddClickSignalsToUri";
        object2 = zzu.zzo();
        ((zzcby)object2).zzw(exception222, (String)object);
        return uri;
    }

    public static Uri zzd(Uri uri) {
        block7: {
            String string2 = "aclk_ms";
            string2 = uri.getQueryParameter(string2);
            if (string2 == null) break block7;
            long l2 = SystemClock.uptimeMillis();
            string2 = String.valueOf(l2);
            String string3 = uri.buildUpon();
            String string4 = "aclk_upms";
            string2 = string3.appendQueryParameter(string4, string2);
            try {
                return string2.build();
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                string3 = String.valueOf(uri.toString());
                string4 = "Error adding click uptime parameter to url: ";
                string3 = string4.concat(string3);
                com.google.android.gms.ads.internal.util.client.zzm.zzh(string3, unsupportedOperationException);
            }
        }
        return uri;
    }

    public static /* bridge */ /* synthetic */ void zze(zzbmb zzbmb2, String string2, zza zza2, Map map2, String string3) {
        zzbmb2.zzh(string2, zza2, map2, string3);
    }

    public static boolean zzf(Map map2) {
        map2 = map2.get("custom_close");
        return "1".equals(map2);
    }

    public static /* bridge */ /* synthetic */ void zzg(zzbmb zzbmb2, int n3) {
        zzbmb2.zzm(n3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void zzh(String var1_1, zza var2_2, Map var3_3, String var4_4) {
        block50: {
            block45: {
                block48: {
                    block49: {
                        block47: {
                            block46: {
                                block42: {
                                    block43: {
                                        block44: {
                                            var5_5 = this;
                                            var6_6 = var2_2;
                                            var7_7 = var3_3;
                                            var8_8 = var4_4;
                                            var9_9 = var2_2;
                                            var9_9 = (zzchd)var2_2;
                                            var10_10 = var9_9.zzD();
                                            var11_11 /* !! */  = var9_9.zzR();
                                            var12_12 = false;
                                            var13_13 = "";
                                            if (var10_10 != null && var11_11 /* !! */  != null) {
                                                var11_11 /* !! */  = var11_11 /* !! */ .zzb;
                                                var14_14 = var10_10.zzaj;
                                                var15_15 = var14_14;
                                                var16_16 = var11_11 /* !! */ ;
                                            } else {
                                                var16_16 = var13_13;
                                                var15_15 = 0;
                                            }
                                            var10_10 = zzbep.zzkK;
                                            var11_11 /* !! */  = zzba.zzc();
                                            var10_10 = (Boolean)var11_11 /* !! */ .zza((zzbeg)var10_10);
                                            var14_14 = var10_10.booleanValue();
                                            var17_17 = true;
                                            if (var14_14 != 0 && (var18_18 = var7_7.containsKey(var10_10 = "sc")) && (var14_14 = (var10_10 = (String)var7_7.get(var10_10)).equals(var13_13 = "0")) != 0) {
                                                var19_19 = false;
                                                var20_20 = 0.0f;
                                                var21_22 = null;
                                            } else {
                                                var19_19 = true;
                                                var20_21 = 1.4E-45f;
                                            }
                                            var10_10 = zzbep.zzmH;
                                            var10_10 = (Boolean)zzba.zzc().zza((zzbeg)var10_10);
                                            var14_14 = var10_10.booleanValue();
                                            var13_13 = "true";
                                            if (var14_14 != 0 && (var22_23 = var7_7.containsKey(var10_10 = "ig_cl")) != 0 && (var14_14 = (var10_10 = (String)var7_7.get(var10_10)).equals(var13_13)) != 0) {
                                                var23_24 = true;
                                                var24_25 = 1.4E-45f;
                                            } else {
                                                var23_24 = false;
                                                var24_26 = 0.0f;
                                                var25_27 = null;
                                            }
                                            var10_10 = "expand";
                                            var14_14 = var10_10.equalsIgnoreCase((String)var8_8);
                                            if (var14_14 != 0) {
                                                var14_14 = var9_9.zzaF();
                                                if (var14_14 != 0) {
                                                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot expand WebView that is already expanded.");
                                                    return;
                                                }
                                                var5_5.zzk(false);
                                                var10_10 = var6_6;
                                                var10_10 = (zzcin)var6_6;
                                                var26_28 = zzbmb.zzf(var3_3);
                                                var17_17 = zzbmb.zzb(var3_3);
                                                var10_10.zzaL(var26_28, (int)var17_17, var19_19);
                                                return;
                                            }
                                            var10_10 = "webapp";
                                            var14_14 = var10_10.equalsIgnoreCase((String)var8_8);
                                            if (var14_14 != 0) {
                                                var5_5.zzk(false);
                                                var10_10 = zzbep.zzlR;
                                                var8_8 = zzba.zzc();
                                                var10_10 = (Boolean)var8_8.zza((zzbeg)var10_10);
                                                var14_14 = var10_10.booleanValue();
                                                if (var14_14 != 0 && (var14_14 = Objects.equals(var10_10 = var7_7.get("is_allowed_for_lock_screen"), var8_8 = "1")) != 0) {
                                                    var27_32 = true;
                                                } else {
                                                    var27_32 = false;
                                                    var28_34 = null;
                                                }
                                                if (var1_1 != null) {
                                                    var25_27 = var6_6;
                                                    var25_27 = (zzcin)var6_6;
                                                    var29_37 = zzbmb.zzf(var3_3);
                                                    var30_39 = zzbmb.zzb(var3_3);
                                                    var31_42 = var1_1;
                                                    var25_27.zzaN(var29_37, var30_39, var1_1, var19_19, var27_32);
                                                    return;
                                                }
                                                var25_27 = var6_6;
                                                var25_27 = (zzcin)var6_6;
                                                var29_38 = zzbmb.zzf(var3_3);
                                                var30_40 = zzbmb.zzb(var3_3);
                                                var31_43 = var10_10 = var7_7.get("html");
                                                var31_43 = (String)var10_10;
                                                var32_46 = var10_10 = var7_7.get("baseurl");
                                                var32_46 = (String)var10_10;
                                                var27_32 = var19_19;
                                                var25_27.zzaM(var29_38, var30_40, (String)var31_43, (String)var32_46, var19_19);
                                                return;
                                            }
                                            var10_10 = "chrome_custom_tab";
                                            var14_14 = var10_10.equalsIgnoreCase((String)var8_8);
                                            if (var14_14 == 0) break block42;
                                            var9_9.getContext();
                                            var10_10 = zzbep.zzeB;
                                            var8_8 = zzba.zzc();
                                            var10_10 = (Boolean)var8_8.zza((zzbeg)var10_10);
                                            var14_14 = var10_10.booleanValue();
                                            if (var14_14 != 0) {
                                                var10_10 = zzbep.zzeF;
                                                var8_8 = zzba.zzc();
                                                var10_10 = (Boolean)var8_8.zza((zzbeg)var10_10);
                                                var14_14 = var10_10.booleanValue();
                                                if (var14_14 != 0) {
                                                    var10_10 = "User opt out chrome custom tab.";
                                                    com.google.android.gms.ads.internal.util.zze.zza((String)var10_10);
                                                } else {
                                                    var12_12 = true;
                                                }
                                            }
                                            var10_10 = var9_9.getContext();
                                            var14_14 = zzbfm.zzg((Context)var10_10);
                                            if (!var12_12) break block43;
                                            if (var14_14 == 0) break block44;
                                            var5_5.zzk(var17_17);
                                            var14_14 = (int)TextUtils.isEmpty((CharSequence)var1_1);
                                            if (var14_14 != 0) {
                                                com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot open browser with null or empty url");
                                                var5_5.zzm(7);
                                                return;
                                            }
                                            var31_44 /* !! */  = Uri.parse((String)var1_1);
                                            var33_49 /* !! */  = var9_9.getContext();
                                            var34_51 = var9_9.zzI();
                                            var32_47 = var9_9.zzF();
                                            var28_35 = var9_9.zzi();
                                            var35_53 = var9_9.zzS();
                                            var10_10 = zzbmb.zzd(zzbmb.zzc(var33_49 /* !! */ , var34_51, var31_44 /* !! */ , var32_47, var28_35, var35_53));
                                            if (var15_15 == 0 || (var8_8 = var5_5.zze) == null || !(var26_29 = var5_5.zzl(var6_6, (Context)(var8_8 = var9_9.getContext()), (String)(var11_11 /* !! */  = var10_10.toString()), (String)var16_16))) {
                                                var8_8 = new zzbly(var5_5);
                                                var5_5.zzg = var8_8;
                                                var8_8 = var6_6;
                                                var8_8 = (zzcin)var6_6;
                                                var31_44 /* !! */  = var10_10.toString();
                                                var36_55 = ObjectWrapper.wrap(var5_5.zzg).asBinder();
                                                var33_49 /* !! */  = var11_11 /* !! */ ;
                                                var11_11 /* !! */  = new zzc(null, (String)var31_44 /* !! */ , null, null, null, null, null, null, var36_55, true);
                                                var8_8.zzaJ((zzc)var11_11 /* !! */ , var19_19, var23_24);
                                                return;
                                            }
                                            break block45;
                                        }
                                        var14_14 = 4;
                                        var5_5.zzm(var14_14);
                                    }
                                    var7_7.put("use_first_package", var13_13);
                                    var7_7.put("use_running_process", var13_13);
                                    var8_8 = this;
                                    var11_11 /* !! */  = var2_2;
                                    var13_13 = var3_3;
                                    var22_23 = var15_15;
                                    var37_57 = var16_16;
                                    this.zzj(var2_2, var3_3, (boolean)var15_15, (String)var16_16, var19_19, var23_24);
                                    return;
                                }
                                var10_10 = "app";
                                var14_14 = var10_10.equalsIgnoreCase((String)var8_8);
                                if (var14_14 != 0 && (var14_14 = var13_13.equalsIgnoreCase((String)(var10_10 = (String)var7_7.get("system_browser")))) != 0) {
                                    var8_8 = this;
                                    var11_11 /* !! */  = var2_2;
                                    var13_13 = var3_3;
                                    var22_23 = var15_15;
                                    var37_58 = var16_16;
                                    this.zzj(var2_2, var3_3, (boolean)var15_15, (String)var16_16, var19_19, var23_24);
                                    return;
                                }
                                var10_10 = "open_app";
                                var14_14 = var10_10.equalsIgnoreCase((String)var8_8);
                                var33_50 = "p";
                                if (var14_14 == 0) break block46;
                                var10_10 = zzbep.zzio;
                                var8_8 = zzba.zzc();
                                var10_10 = (Boolean)var8_8.zza((zzbeg)var10_10);
                                var14_14 = (int)var10_10.booleanValue();
                                if (var14_14 != 0) {
                                    var5_5.zzk(var17_17);
                                    var10_10 = (String)var7_7.get(var33_50);
                                    if (var10_10 == null) {
                                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Package name missing from open app action.");
                                        return;
                                    }
                                    if (var15_15 == 0 || (var8_8 = var5_5.zze) == null || !(var26_30 = var5_5.zzl(var6_6, (Context)(var8_8 = var9_9.getContext()), (String)var10_10, (String)var16_16))) {
                                        var8_8 = var9_9.getContext().getPackageManager();
                                        if (var8_8 == null) {
                                            com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot get package manager from open app action.");
                                            return;
                                        }
                                        if ((var10_10 = var8_8.getLaunchIntentForPackage((String)var10_10)) != null) {
                                            var8_8 = var6_6;
                                            var8_8 = (zzcin)var6_6;
                                            var13_13 = var5_5.zzg;
                                            var11_11 /* !! */  = new zzc((Intent)var10_10, (zzy)var13_13);
                                            var8_8.zzaJ((zzc)var11_11 /* !! */ , var19_19, var23_24);
                                            return;
                                        }
                                    }
                                }
                                break block45;
                            }
                            var5_5.zzk(var17_17);
                            var13_13 = var10_10 = var7_7.get("intent_url");
                            var13_13 = (String)var10_10;
                            var14_14 = (int)TextUtils.isEmpty((CharSequence)var13_13);
                            var22_23 = 0;
                            var38_61 /* !! */  = null;
                            if (var14_14 == 0) {
                                var38_61 /* !! */  = Intent.parseUri((String)var13_13, (int)0);
                            }
lbl199:
                            // 4 sources

                            while (true) {
                                continue;
                                break;
                            }
                            catch (URISyntaxException var37_59) {
                                var10_10 = String.valueOf(var13_13);
                                var13_13 = "Error parsing the url: ";
                                var10_10 = var13_13.concat((String)var10_10);
                                com.google.android.gms.ads.internal.util.client.zzm.zzh((String)var10_10, var37_59);
                                ** continue;
                            }
                            var10_10 = var38_61 /* !! */ ;
                            if (var38_61 /* !! */  == null || (var13_13 = var38_61 /* !! */ .getData()) == null || (var22_23 = (var38_61 /* !! */  = Uri.EMPTY).equals(var13_13 = var38_61 /* !! */ .getData())) != 0) break block47;
                            var34_52 = var9_9.getContext();
                            var31_45 = var9_9.zzI();
                            var28_36 /* !! */  = var9_9.zzF();
                            var35_54 /* !! */  = var9_9.zzi();
                            var39_62 = var9_9.zzS();
                            var32_48 = var13_13;
                            var13_13 = zzbmb.zzd(zzbmb.zzc(var34_52, var31_45, (Uri)var13_13, var28_36 /* !! */ , var35_54 /* !! */ , (zzfhs)var39_62));
                            var38_61 /* !! */  = var10_10.getType();
                            var22_23 = TextUtils.isEmpty((CharSequence)var38_61 /* !! */ );
                            if (var22_23 != 0) ** GOTO lbl-1000
                            var38_61 /* !! */  = zzbep.zzip;
                            var37_60 = zzba.zzc();
                            var38_61 /* !! */  = (Boolean)var37_60.zza((zzbeg)var38_61 /* !! */ );
                            var22_23 = var38_61 /* !! */ .booleanValue();
                            if (var22_23 != 0) {
                                var38_61 /* !! */  = var10_10.getType();
                                var10_10.setDataAndType((Uri)var13_13, (String)var38_61 /* !! */ );
                            } else lbl-1000:
                            // 2 sources

                            {
                                var10_10.setData((Uri)var13_13);
                            }
                        }
                        var13_13 = zzbep.zziG;
                        var38_61 /* !! */  = zzba.zzc();
                        var13_13 = (Boolean)var38_61 /* !! */ .zza((zzbeg)var13_13);
                        var18_18 = var13_13.booleanValue();
                        var37_60 = "event_id";
                        if (var18_18 && (var26_31 = (var13_13 = "intent_async").equalsIgnoreCase((String)var8_8)) && (var26_31 = var7_7.containsKey(var37_60))) {
                            var30_41 = true;
                        } else {
                            var30_41 = false;
                            var34_52 = null;
                        }
                        var38_61 /* !! */  = new HashMap();
                        if (var30_41) {
                            var8_8 = var13_13;
                            var11_11 /* !! */  = this;
                            var18_18 = var19_19;
                            var21_22 = var38_61 /* !! */ ;
                            var38_61 /* !! */  = var2_2;
                            var32_48 = var33_50;
                            var33_50 = var37_60;
                            var37_60 = var21_22;
                            var27_33 = var23_24;
                            var25_27 = var21_22;
                            var21_22 = var3_3;
                            var5_5.zzg = var13_13 = new zzblz(this, var19_19, var2_2, (Map)var37_60, var3_3);
                            var12_12 = false;
                        } else {
                            var27_33 = var23_24;
                            var32_48 = var33_50;
                            var25_27 = var38_61 /* !! */ ;
                            var33_50 = var37_60;
                            var12_12 = var19_19;
                        }
                        var8_8 = "openIntentAsync";
                        if (var10_10 == null) break block48;
                        if (var15_15 == 0 || (var11_11 /* !! */  = var5_5.zze) == null || !(var17_17 = var5_5.zzl(var6_6, (Context)(var11_11 /* !! */  = var9_9.getContext()), (String)(var13_13 = var10_10.getData().toString()), (String)var16_16))) break block49;
                        if (var30_41) {
                            var10_10 = (String)var7_7.get(var33_50);
                            var11_11 /* !! */  = Boolean.TRUE;
                            var25_27.put(var10_10, var11_11 /* !! */ );
                            var10_10 = var6_6;
                            ((zzbok)var6_6).zzd((String)var8_8, (Map)var25_27);
                            return;
                        }
                        break block45;
                    }
                    var8_8 = var6_6;
                    var8_8 = (zzcin)var6_6;
                    var13_13 = var5_5.zzg;
                    var11_11 /* !! */  = new zzc((Intent)var10_10, (zzy)var13_13);
                    var18_18 = var27_33;
                    var8_8.zzaJ((zzc)var11_11 /* !! */ , var12_12, var27_33);
                    return;
                }
                var18_18 = var27_33;
                var14_14 = (int)TextUtils.isEmpty((CharSequence)var1_1);
                if (var14_14 == 0) {
                    var39_62 = Uri.parse((String)var1_1);
                    var28_36 /* !! */  = var9_9.getContext();
                    var35_54 /* !! */  = var9_9.zzI();
                    var40_63 /* !! */  = var9_9.zzF();
                    var41_64 /* !! */  = var9_9.zzi();
                    var36_56 = var9_9.zzS();
                    var10_10 = zzbmb.zzd(zzbmb.zzc((Context)var28_36 /* !! */ , (zzaxd)var35_54 /* !! */ , (Uri)var39_62, var40_63 /* !! */ , var41_64 /* !! */ , (zzfhs)var36_56)).toString();
                } else {
                    var10_10 = var1_1;
                }
                if (var15_15 == 0 || (var11_11 /* !! */  = var5_5.zze) == null || !(var17_17 = var5_5.zzl(var6_6, (Context)(var11_11 /* !! */  = var9_9.getContext()), (String)var10_10, (String)var16_16))) break block50;
                if (var30_41) {
                    var10_10 = (String)var7_7.get(var33_50);
                    var11_11 /* !! */  = Boolean.TRUE;
                    var25_27.put(var10_10, var11_11 /* !! */ );
                    var10_10 = var6_6;
                    var10_10 = (zzbok)var6_6;
                    var10_10.zzd((String)var8_8, (Map)var25_27);
                }
            }
            return;
        }
        var8_8 = var6_6;
        var8_8 = (zzcin)var6_6;
        var38_61 /* !! */  = var7_7.get("i");
        var35_54 /* !! */  = var38_61 /* !! */ ;
        var35_54 /* !! */  = (String)var38_61 /* !! */ ;
        var38_61 /* !! */  = var7_7.get("m");
        var40_63 /* !! */  = var38_61 /* !! */ ;
        var40_63 /* !! */  = (String)var38_61 /* !! */ ;
        var38_61 /* !! */  = var32_48;
        var38_61 /* !! */  = var7_7.get(var32_48);
        var41_64 /* !! */  = var38_61 /* !! */ ;
        var41_64 /* !! */  = (String)var38_61 /* !! */ ;
        var38_61 /* !! */  = var7_7.get("c");
        var36_56 = var38_61 /* !! */ ;
        var36_56 = (String)var38_61 /* !! */ ;
        var42_65 /* !! */  = var38_61 /* !! */  = var7_7.get("f");
        var42_65 /* !! */  = (String)var38_61 /* !! */ ;
        var43_66 /* !! */  = var38_61 /* !! */  = var7_7.get("e");
        var43_66 /* !! */  = (String)var38_61 /* !! */ ;
        var38_61 /* !! */  = var5_5.zzg;
        var28_36 /* !! */  = var11_11 /* !! */ ;
        var39_62 = var10_10;
        var11_11 /* !! */  = new zzc((String)var35_54 /* !! */ , (String)var10_10, (String)var40_63 /* !! */ , (String)var41_64 /* !! */ , (String)var36_56, (String)var42_65 /* !! */ , (String)var43_66 /* !! */ , (zzy)var38_61 /* !! */ );
        var8_8.zzaJ((zzc)var11_11 /* !! */ , var12_12, var18_18);
    }

    private final void zzi(Context context, String string2, String string3) {
        Object object = this.zze;
        object.zzc(string2);
        zzdvc zzdvc2 = this.zzb;
        if (zzdvc2 != null) {
            zzefz zzefz2 = this.zze;
            object = "dialog_not_shown_reason";
            zzgbf zzgbf2 = zzgbf.zze(object, string3);
            String string4 = "dialog_not_shown";
            zzegk.zzc(context, zzdvc2, zzefz2, string2, string4, zzgbf2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void zzj(zza var1_1, Map var2_2, boolean var3_3, String var4_4, boolean var5_5, boolean var6_6) {
        block19: {
            block22: {
                block23: {
                    block21: {
                        var7_7 = this;
                        var8_8 /* !! */  = var1_1;
                        var9_9 = var2_2;
                        var10_10 = true;
                        this.zzk(var10_10);
                        var11_11 = var1_1;
                        var11_11 = (zzchd)var1_1;
                        var12_12 = var11_11.getContext();
                        var13_13 = var11_11.zzI();
                        var14_14 = var11_11.zzF();
                        var15_15 = var11_11.zzS();
                        var17_17 = var16_16 = var12_12.getSystemService("activity");
                        var17_17 = (ActivityManager)var16_16;
                        var16_16 = (String)var2_2.get("u");
                        var18_18 = TextUtils.isEmpty((CharSequence)var16_16);
                        var19_19 = null;
                        if (var18_18) lbl-1000:
                        // 4 sources

                        {
                            while (true) {
                                var9_9 = var19_19;
                                break block19;
                                break;
                            }
                        }
                        var20_23 = Uri.parse((String)var16_16);
                        var21_24 = false;
                        var22_25 = null;
                        var16_16 = var12_12;
                        var23_26 /* !! */  = var13_13;
                        var24_27 = var14_14;
                        var16_16 = zzbmb.zzd(zzbmb.zzc(var12_12, var13_13, (Uri)var20_23, var14_14, null, var15_15));
                        var25_28 = Boolean.parseBoolean((String)var2_2.get("use_first_package"));
                        var26_29 = Boolean.parseBoolean((String)var2_2.get("use_running_process"));
                        var23_26 /* !! */  = "use_custom_tabs";
                        var9_9 = (String)var2_2.get(var23_26 /* !! */ );
                        var27_20 = Boolean.parseBoolean((String)var9_9);
                        var28_30 = 0;
                        if (!var27_20) {
                            var9_9 = zzbep.zzez;
                            var23_26 /* !! */  = zzba.zzc();
                            var9_9 = (Boolean)var23_26 /* !! */ .zza((zzbeg)var9_9);
                            var27_20 = var9_9.booleanValue();
                            if (!var27_20) {
                                var10_10 = false;
                                var29_21 = null;
                            }
                        }
                        var9_9 = var16_16.getScheme();
                        var23_26 /* !! */  = "http";
                        var27_20 = var23_26 /* !! */ .equalsIgnoreCase((String)var9_9);
                        var20_23 = "https";
                        if (var27_20) {
                            var9_9 = var16_16.buildUpon().scheme((String)var20_23);
                            var19_19 = var9_9.build();
lbl49:
                            // 3 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var9_9 = var16_16.getScheme();
                        var27_20 = var20_23.equalsIgnoreCase((String)var9_9);
                        if (!var27_20) ** GOTO lbl49
                        var9_9 = var16_16.buildUpon().scheme((String)var23_26 /* !! */ );
                        var19_19 = var9_9.build();
                        ** while (true)
                        var9_9 = var19_19;
                        var22_25 = new ArrayList();
                        var24_27 = zzbma.zza((Uri)var16_16, var12_12, var13_13, var14_14, var15_15);
                        var9_9 = zzbma.zza(var19_19, var12_12, var13_13, var14_14, var15_15);
                        if (var10_10) {
                            zzu.zzp();
                            zzt.zzo(var12_12, (Intent)var24_27);
                            zzu.zzp();
                            zzt.zzo(var12_12, (Intent)var9_9);
                        }
                        var16_16 = var24_27;
                        var23_26 /* !! */  = var22_25;
                        var20_23 = var12_12;
                        var29_21 = var24_27;
                        var24_27 = var13_13;
                        var2_2 = var22_25;
                        var22_25 = var14_14;
                        var30_22 = false;
                        var8_8 /* !! */  = null;
                        if ((var23_26 /* !! */  = zzbma.zzd((Intent)var16_16, (ArrayList)var23_26 /* !! */ , var12_12, var13_13, var14_14, var15_15)) == null) break block21;
                        var19_19 = zzbma.zzb((Intent)var16_16, (ResolveInfo)var23_26 /* !! */ , var12_12, var13_13, var14_14, var15_15);
                        ** GOTO lbl-1000
                    }
                    if (var9_9 != null && (var23_26 /* !! */  = zzbma.zzc((Intent)var9_9, var12_12, var13_13, var14_14, var15_15)) != null && (var16_16 = zzbma.zzc((Intent)(var9_9 = zzbma.zzb((Intent)var16_16, (ResolveInfo)var23_26 /* !! */ , var12_12, var13_13, var14_14, var15_15)), var12_12, var13_13, var14_14, var15_15)) != null) break block19;
                    var27_20 = var2_2.isEmpty();
                    if (var27_20) break block22;
                    if (!var26_29 || var17_17 == null || (var9_9 = var17_17.getRunningAppProcesses()) == null) break block23;
                    var31_31 = var2_2.size();
                    var28_30 = 0;
                    while (var28_30 < var31_31) {
                        block20: {
                            var23_26 /* !! */  = var2_2;
                            var20_23 = (ResolveInfo)var2_2.get(var28_30);
                            var24_27 = var9_9.iterator();
                            do {
                                var21_24 = var24_27.hasNext();
                                var32_32 = var28_30 + 1;
                                if (!var21_24) break block20;
                            } while (!(var21_24 = (var22_25 = ((ActivityManager.RunningAppProcessInfo)var24_27.next()).processName).equals(var17_17 = var20_23.activityInfo.packageName)));
                            var16_16 = var29_21;
                            var23_26 /* !! */  = var20_23;
                            var20_23 = var12_12;
                            var24_27 = var13_13;
                            var22_25 = var14_14;
                            var19_19 = zzbma.zzb((Intent)var29_21, (ResolveInfo)var23_26 /* !! */ , var12_12, var13_13, var14_14, var15_15);
                            ** GOTO lbl-1000
                        }
                        var2_2 = var23_26 /* !! */ ;
                        var28_30 = var32_32;
                    }
                }
                var23_26 /* !! */  = var2_2;
                if (var25_28) {
                    var8_8 /* !! */  = var2_2.get(0);
                    var23_26 /* !! */  = var8_8 /* !! */ ;
                    var23_26 /* !! */  = (ResolveInfo)var8_8 /* !! */ ;
                    var16_16 = var29_21;
                    var20_23 = var12_12;
                    var24_27 = var13_13;
                    var22_25 = var14_14;
                    var19_19 = zzbma.zzb((Intent)var29_21, (ResolveInfo)var23_26 /* !! */ , var12_12, var13_13, var14_14, var15_15);
                    ** continue;
                }
            }
            var9_9 = var29_21;
        }
        if (var3_3 && (var8_8 /* !! */  = var7_7.zze) != null && var9_9 != null) {
            var8_8 /* !! */  = var11_11.getContext();
            var29_21 = var9_9.getData().toString();
            var11_11 = var1_1;
            var16_16 = var4_4;
            var30_22 = var7_7.zzl(var1_1, (Context)var8_8 /* !! */ , (String)var29_21, var4_4);
            if (var30_22) {
                return;
            }
        } else {
            var11_11 = var1_1;
        }
        var8_8 /* !! */  = var11_11;
        try {
            var8_8 /* !! */  = (zzcin)var11_11;
        }
        catch (ActivityNotFoundException v0) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj(v0.getMessage());
            return;
        }
        var11_11 = var7_7.zzg;
        var29_21 = new zzc((Intent)var9_9, (zzy)var11_11);
        var27_20 = var5_5;
        var8_8 /* !! */ .zzaJ((zzc)var29_21, var5_5, var6_6);
    }

    private final void zzk(boolean bl2) {
        zzbud zzbud2 = this.zzd;
        if (zzbud2 != null) {
            zzbud2.zza(bl2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private final boolean zzl(zza object, Context object2, String object3, String string2) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        Object object4;
        Object object5;
        Object object6;
        block18: {
            block19: {
                void var12_19;
                String string3;
                Object object7;
                zzdvc zzdvc2 = this.zzb;
                if (zzdvc2 != null) {
                    object6 = this.zze;
                    object7 = new HashMap();
                    object5 = "offline_open";
                    object4 = object2;
                    string3 = string2;
                    zzegk.zzc((Context)object2, zzdvc2, (zzefz)((Object)object6), string2, (String)object5, object7);
                }
                object4 = zzu.zzo();
                boolean n4 = ((zzcby)object4).zzA((Context)object2);
                zzdvc2 = null;
                if (n4) {
                    object = this.zze;
                    object2 = this.zzc;
                    ((zzefz)((Object)object)).zzh((zzr)object2, string2);
                    return false;
                }
                zzu.zzp();
                object4 = zzt.zzz((Context)object2);
                zzu.zzp();
                object6 = new s52((Context)object2);
                boolean bl5 = ((s52)object6).a();
                string3 = "offline_notification_channel";
                bl4 = zzu.zzq().zzi((Context)object2, string3);
                object5 = object;
                object5 = (zzchd)object;
                object7 = object5.zzO();
                bl3 = ((zzcix)object7).zzi();
                bl2 = true;
                if (bl3 && (object7 = object5.zzi()) == null) {
                    bl3 = true;
                } else {
                    bl3 = false;
                    object7 = null;
                }
                if (bl5) break block18;
                zzu.zzp();
                object6 = new s52((Context)object2);
                boolean bl6 = ((s52)object6).a();
                if (bl6) break block19;
                int n3 = Build.VERSION.SDK_INT;
                int n7 = 33;
                if (n3 < n7) {
                    object6 = zzbep.zziz;
                    zzben zzben2 = zzba.zzc();
                    object6 = (Boolean)zzben2.zza((zzbeg)object6);
                    boolean bl7 = (Boolean)object6;
                } else {
                    object6 = zzbep.zziy;
                    zzben zzben3 = zzba.zzc();
                    object6 = (Boolean)zzben3.zza((zzbeg)object6);
                    boolean bl8 = (Boolean)object6;
                }
                if (var12_19 != false) break block18;
            }
            this.zzi((Context)object2, string2, "notifications_disabled");
            return false;
        }
        if (bl4) {
            this.zzi((Context)object2, string2, "notification_channel_disabled");
            return false;
        }
        if (object4 == null) {
            this.zzi((Context)object2, string2, "work_manager_unavailable");
            return false;
        }
        if (bl3) {
            this.zzi((Context)object2, string2, "ad_no_activity");
            return false;
        }
        object4 = zzbep.zziw;
        object6 = zzba.zzc();
        object4 = (Boolean)((zzben)object6).zza((zzbeg)object4);
        boolean bl9 = (Boolean)object4;
        if (!bl9) {
            this.zzi((Context)object2, string2, "notification_flow_disabled");
            return false;
        }
        object4 = object5.zzL();
        if (object4 != null && (object4 = object5.zzi()) != null) {
            object4 = zzegm.zze();
            object6 = object5.zzi();
            ((zzegl)object4).zza((Activity)object6);
            boolean bl10 = false;
            object6 = null;
            ((zzegl)object4).zzb(null);
            ((zzegl)object4).zzc(string2);
            ((zzegl)object4).zzd((String)object3);
            object3 = ((zzegl)object4).zze();
            try {
                object4 = object5.zzL();
            }
            catch (Exception exception) {
                object = exception.getMessage();
                this.zzi((Context)object2, string2, (String)object);
                return false;
            }
            ((zzm)object4).zzf((zzegm)object3);
        } else {
            object2 = object;
            object2 = (zzcin)object;
            int n8 = 14;
            object2.zzaK(string2, (String)object3, n8);
        }
        object.onAdClicked();
        return bl2;
    }

    private final void zzm(int n3) {
        String string2;
        Object object = this.zzb;
        if (object == null) {
            return;
        }
        object = ((zzdvc)object).zza();
        String string3 = "action";
        String string4 = "cct_action";
        ((zzdvb)object).zzb(string3, string4);
        switch (n3) {
            default: {
                string2 = "WRONG_EXP_SETUP";
                break;
            }
            case 8: {
                string2 = "UNKNOWN";
                break;
            }
            case 7: {
                string2 = "EMPTY_URL";
                break;
            }
            case 6: {
                string2 = "ACTIVITY_NOT_FOUND";
                break;
            }
            case 5: {
                string2 = "CCT_READY_TO_OPEN";
                break;
            }
            case 4: {
                string2 = "CCT_NOT_SUPPORTED";
                break;
            }
            case 3: {
                string2 = "CONTEXT_NULL";
                break;
            }
            case 2: {
                string2 = "CONTEXT_NOT_AN_ACTIVITY";
            }
        }
        ((zzdvb)object).zzb("cct_open_status", string2);
        ((zzdvb)object).zzf();
    }
}

