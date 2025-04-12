/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzjp;
import com.google.android.gms.internal.gtm.zzjq;
import com.google.android.gms.internal.gtm.zzjr;
import com.google.android.gms.internal.gtm.zzjs;
import com.google.android.gms.internal.gtm.zzjt;
import com.google.android.gms.internal.gtm.zzju;
import com.google.android.gms.internal.gtm.zzjv;
import com.google.android.gms.internal.gtm.zzjw;
import com.google.android.gms.internal.gtm.zzjx;
import com.google.android.gms.internal.gtm.zzjy;
import com.google.android.gms.internal.gtm.zzjz;
import com.google.android.gms.internal.gtm.zzka;
import com.google.android.gms.internal.gtm.zzkb;
import com.google.android.gms.internal.gtm.zzkc;
import com.google.android.gms.internal.gtm.zzkd;
import com.google.android.gms.internal.gtm.zzke;
import com.google.android.gms.internal.gtm.zzki;
import com.google.android.gms.internal.gtm.zzkj;
import com.google.android.gms.internal.gtm.zzkk;
import com.google.android.gms.internal.gtm.zzln;
import com.google.android.gms.internal.gtm.zzmp;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqt;
import com.google.android.gms.internal.gtm.zzqu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzqv
extends zzqo {
    private static final Map zzb;
    private final ArrayList zzc;

    static {
        HashMap<String, zzjo> hashMap = new HashMap<String, zzjo>();
        zzjo zzjo2 = new zzjp();
        hashMap.put("concat", zzjo2);
        zzjo2 = new zzjq();
        hashMap.put("every", zzjo2);
        zzjo2 = new zzjr();
        hashMap.put("filter", zzjo2);
        zzjo2 = new zzjs();
        hashMap.put("forEach", zzjo2);
        zzjo2 = new zzjt();
        hashMap.put("indexOf", zzjo2);
        zzln zzln2 = zzln.zza;
        hashMap.put("hasOwnProperty", zzln2);
        zzjo2 = new zzju();
        hashMap.put("join", zzjo2);
        zzjo2 = new zzjv();
        hashMap.put("lastIndexOf", zzjo2);
        zzjo2 = new zzjw();
        hashMap.put("map", zzjo2);
        zzjo2 = new zzjx();
        hashMap.put("pop", zzjo2);
        zzjo2 = new zzjy();
        hashMap.put("push", zzjo2);
        zzjo2 = new zzjz();
        hashMap.put("reduce", zzjo2);
        zzjo2 = new zzka();
        hashMap.put("reduceRight", zzjo2);
        zzjo2 = new zzkb();
        hashMap.put("reverse", zzjo2);
        zzjo2 = new zzkc();
        hashMap.put("shift", zzjo2);
        zzjo2 = new zzkd();
        hashMap.put("slice", zzjo2);
        zzjo2 = new zzke();
        hashMap.put("some", zzjo2);
        zzjo2 = new zzki();
        hashMap.put("sort", zzjo2);
        zzjo2 = new zzkj();
        hashMap.put("splice", zzjo2);
        zzjo2 = new zzmp();
        hashMap.put("toString", zzjo2);
        zzjo2 = new zzkk();
        hashMap.put("unshift", zzjo2);
        zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzqv(List list) {
        ArrayList arrayList;
        Preconditions.checkNotNull(list);
        this.zzc = arrayList = new ArrayList(list);
    }

    public static /* bridge */ /* synthetic */ ArrayList zzj(zzqv zzqv2) {
        return zzqv2.zzc;
    }

    public final boolean equals(Object object) {
        int n3;
        block8: {
            int n4;
            ArrayList arrayList;
            int n7;
            block10: {
                block9: {
                    n3 = 1;
                    if (this == object) break block8;
                    n7 = object instanceof zzqv;
                    if (n7 == 0) break block9;
                    object = ((zzqv)object).zzc;
                    arrayList = this.zzc;
                    n7 = arrayList.size();
                    if (n7 == (n4 = object.size())) break block10;
                }
                n3 = 0;
                break block8;
            }
            n7 = 0;
            arrayList = null;
            n4 = 1;
            while (true) {
                block12: {
                    block11: {
                        ArrayList arrayList2;
                        int n8;
                        if (n7 >= (n8 = (arrayList2 = this.zzc).size())) break block11;
                        Object object2 = this.zzc.get(n7);
                        if (object2 == null) {
                            object2 = object.get(n7);
                            if (object2 == null) {
                                n4 = 1;
                            } else {
                                n4 = 0;
                                object2 = null;
                            }
                        } else {
                            object2 = (zzqo)this.zzc.get(n7);
                            arrayList2 = object.get(n7);
                            n4 = (int)(object2.equals(arrayList2) ? 1 : 0);
                        }
                        if (n4 != 0) break block12;
                    }
                    n3 = n4;
                    break;
                }
                ++n7;
            }
        }
        return n3 != 0;
    }

    public final String toString() {
        return ((Object)this.zzc).toString();
    }

    public final zzjm zza(String string2) {
        boolean bl2 = this.zzg(string2);
        if (bl2) {
            return (zzjm)zzb.get(string2);
        }
        string2 = cP.a("Native Method ", string2, " is not defined for type ListWrapper.");
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final /* synthetic */ Object zzc() {
        return this.zzc;
    }

    public final Iterator zze() {
        zzqt zzqt2 = new zzqt(this);
        Iterator iterator = this.zzd();
        zzqu zzqu2 = new zzqu(this, zzqt2, iterator);
        return zzqu2;
    }

    public final boolean zzg(String string2) {
        return zzb.containsKey(string2);
    }

    public final zzqo zzi(int n3) {
        zzqo zzqo2;
        ArrayList arrayList;
        int n4;
        if (n3 >= 0 && n3 < (n4 = (arrayList = this.zzc).size()) && (zzqo2 = (zzqo)(arrayList = this.zzc).get(n3)) != null) {
            return zzqo2;
        }
        return zzqs.zze;
    }

    public final List zzk() {
        return this.zzc;
    }

    public final void zzl(int n3, zzqo zzqo2) {
        if (n3 >= 0) {
            ArrayList arrayList = this.zzc;
            int n4 = arrayList.size();
            if (n3 >= n4) {
                n4 = n3 + 1;
                this.zzm(n4);
            }
            this.zzc.set(n3, zzqo2);
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
        throw indexOutOfBoundsException;
    }

    public final void zzm(int n3) {
        ArrayList arrayList;
        int n4;
        if (n3 >= 0) {
            n4 = 1;
        } else {
            n4 = 0;
            arrayList = null;
        }
        Object object = "Invalid array length";
        Preconditions.checkArgument(n4 != 0, object);
        arrayList = this.zzc;
        n4 = arrayList.size();
        if (n4 != n3) {
            arrayList = this.zzc;
            n4 = arrayList.size();
            if (n4 < n3) {
                this.zzc.ensureCapacity(n3);
                arrayList = this.zzc;
                for (n4 = arrayList.size(); n4 < n3; ++n4) {
                    object = this.zzc;
                    ((ArrayList)object).add(null);
                }
            }
        } else {
            return;
        }
        arrayList = this.zzc;
        int n7 = arrayList.size();
        arrayList.subList(n3, n7).clear();
    }

    public final boolean zzn(int n3) {
        Object e2;
        ArrayList arrayList;
        int n4;
        return n3 >= 0 && n3 < (n4 = (arrayList = this.zzc).size()) && (e2 = (arrayList = this.zzc).get(n3)) != null;
    }
}

