/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzfon;
import com.google.android.gms.internal.ads.zzfpe;
import com.google.android.gms.internal.ads.zzfph;
import com.google.android.gms.internal.ads.zzfqe;
import com.google.android.gms.internal.ads.zzfqg;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class zzfqh {
    private final HashMap zza;
    private final HashMap zzb;
    private final HashMap zzc;
    private final HashSet zzd;
    private final HashSet zze;
    private final HashSet zzf;
    private final HashMap zzg;
    private final Map zzh;
    private boolean zzi;

    public zzfqh() {
        AbstractMap abstractMap = new AbstractMap();
        this.zza = abstractMap;
        abstractMap = new AbstractMap();
        this.zzb = abstractMap;
        abstractMap = new AbstractMap();
        this.zzc = abstractMap;
        this.zzd = abstractMap;
        super();
        this.zze = abstractMap;
        super();
        this.zzf = abstractMap;
        this.zzg = abstractMap = new AbstractMap();
        super();
        this.zzh = abstractMap;
    }

    public final View zza(String string2) {
        return (View)this.zzc.get(string2);
    }

    public final zzfqg zzb(View view) {
        zzfqg zzfqg2 = (zzfqg)this.zzb.get(view);
        if (zzfqg2 != null) {
            HashMap hashMap = this.zzb;
            hashMap.remove(view);
        }
        return zzfqg2;
    }

    public final String zzc(String string2) {
        return (String)this.zzg.get(string2);
    }

    public final String zzd(View view) {
        Object object = this.zza;
        int n3 = ((HashMap)object).size();
        if (n3 == 0) {
            return null;
        }
        object = (String)this.zza.get(view);
        if (object != null) {
            HashMap hashMap = this.zza;
            hashMap.remove(view);
        }
        return object;
    }

    public final HashSet zze() {
        return this.zzf;
    }

    public final HashSet zzf() {
        return this.zze;
    }

    public final void zzg() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzi = false;
    }

    public final void zzh() {
        this.zzi = true;
    }

    public final void zzi() {
        Object object = zzfpe.zza();
        if (object != null) {
            boolean bl2;
            object = ((zzfpe)object).zzb().iterator();
            while (bl2 = object.hasNext()) {
                Object object2 = (zzfon)object.next();
                Object object3 = ((zzfon)object2).zzf();
                boolean bl3 = ((zzfon)object2).zzj();
                if (!bl3) continue;
                Object object4 = ((zzfon)object2).zzh();
                if (object3 != null) {
                    String string2;
                    Object object5;
                    Object object6;
                    Object object7;
                    block17: {
                        boolean bl4 = object3.isAttachedToWindow();
                        object7 = "noWindowFocus";
                        if (!bl4) {
                            object6 = "notAttached";
                        } else {
                            bl4 = object3.hasWindowFocus();
                            if (bl4) {
                                this.zzh.remove(object3);
                                object6 = Boolean.FALSE;
                            } else {
                                object6 = this.zzh;
                                bl4 = object6.containsKey(object3);
                                if (bl4) {
                                    object6 = (Boolean)this.zzh.get(object3);
                                } else {
                                    object6 = this.zzh;
                                    object5 = Boolean.FALSE;
                                    object6.put(object3, object5);
                                    object6 = object5;
                                }
                            }
                            bl4 = (Boolean)object6;
                            if (bl4) {
                                object6 = object7;
                            } else {
                                object6 = new HashSet();
                                object5 = object3;
                                while (true) {
                                    string2 = null;
                                    if (object5 == null) break;
                                    String string3 = zzfqe.zza((View)object5);
                                    if (string3 != null) {
                                        object6 = string3;
                                        break block17;
                                    }
                                    ((HashSet)object6).add(object5);
                                    object5 = object5.getParent();
                                    boolean bl5 = object5 instanceof View;
                                    if (bl5) {
                                        object5 = (View)object5;
                                        continue;
                                    }
                                    object5 = null;
                                }
                                object5 = this.zzd;
                                ((AbstractCollection)object5).addAll(object6);
                                bl4 = false;
                                object6 = null;
                            }
                        }
                    }
                    if (object6 == null) {
                        this.zze.add(object4);
                        object6 = this.zza;
                        ((HashMap)object6).put(object3, object4);
                        object3 = ((zzfon)object2).zzi().iterator();
                        while (bl3 = object3.hasNext()) {
                            object4 = (zzfph)object3.next();
                            object6 = (View)((zzfph)object4).zzb().get();
                            if (object6 == null) continue;
                            object7 = (zzfqg)this.zzb.get(object6);
                            if (object7 != null) {
                                object4 = ((zzfon)object2).zzh();
                                ((zzfqg)object7).zzc((String)object4);
                                continue;
                            }
                            object7 = this.zzb;
                            string2 = ((zzfon)object2).zzh();
                            object5 = new zzfqg((zzfph)object4, string2);
                            ((HashMap)object7).put(object6, object5);
                        }
                        continue;
                    }
                    if (object6 == object7) continue;
                    this.zzf.add(object4);
                    this.zzc.put(object4, object3);
                    object2 = this.zzg;
                    ((HashMap)object2).put(object4, object6);
                    continue;
                }
                this.zzf.add(object4);
                object2 = this.zzg;
                object3 = "noAdView";
                ((HashMap)object2).put(object4, object3);
            }
        }
    }

    public final boolean zzj(View view) {
        Map map2 = this.zzh;
        boolean bl2 = map2.containsKey(view);
        if (bl2) {
            map2 = this.zzh;
            Boolean bl3 = Boolean.TRUE;
            map2.put(view, bl3);
            return false;
        }
        return true;
    }

    public final int zzk(View view) {
        HashSet hashSet = this.zzd;
        boolean bl2 = hashSet.contains(view);
        if (bl2) {
            return 1;
        }
        bl2 = this.zzi;
        if (bl2) {
            return 2;
        }
        return 3;
    }
}

