/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcb;
import com.google.android.gms.internal.clearcut.zzee;
import com.google.android.gms.internal.clearcut.zzeh;
import java.lang.reflect.Field;
import java.util.Arrays;

final class zzed {
    private final int flags;
    private final Object[] zzmj;
    private final int zzmk;
    private final int zzml;
    private final int zzmm;
    private final int[] zzms;
    private final zzee zznh;
    private Class zzni;
    private final int zznj;
    private final int zznk;
    private final int zznl;
    private final int zznm;
    private final int zznn;
    private final int zzno;
    private int zznp;
    private int zznq;
    private int zznr = -1 >>> 1;
    private int zzns = -1 << -1;
    private int zznt;
    private int zznu;
    private int zznv;
    private int zznw;
    private int zznx;
    private int zzny;
    private int zznz;
    private int zzoa;
    private int zzob;
    private int zzoc;
    private Field zzod;
    private Object zzoe;
    private Object zzof;
    private Object zzog;

    public zzed(Class object, String string2, Object[] objectArray) {
        int n3;
        int n4;
        int n7 = 0;
        this.zznt = 0;
        this.zznu = 0;
        this.zznv = 0;
        this.zznw = 0;
        this.zznx = 0;
        this.zzni = object;
        this.zznh = object = new zzee(string2);
        this.zzmj = objectArray;
        this.flags = n4 = ((zzee)object).next();
        this.zznj = n4 = ((zzee)object).next();
        objectArray = null;
        if (n4 == 0) {
            this.zznk = 0;
            this.zznl = 0;
            this.zzmk = 0;
            this.zzml = 0;
            this.zznm = 0;
            this.zznn = 0;
            this.zzmm = 0;
            this.zzno = 0;
            this.zzms = null;
            return;
        }
        this.zznk = n4 = ((zzee)object).next();
        this.zznl = n7 = ((zzee)object).next();
        this.zzmk = n3 = ((zzee)object).next();
        this.zzml = n3 = ((zzee)object).next();
        this.zznn = n3 = ((zzee)object).next();
        this.zzmm = n3 = ((zzee)object).next();
        this.zznm = n3 = ((zzee)object).next();
        this.zzno = n3 = ((zzee)object).next();
        int n8 = ((zzee)object).next();
        if (n8 != 0) {
            objectArray = new int[n8];
        }
        this.zzms = (int[])objectArray;
        this.zznp = n8 = (n4 << 1) + n7;
    }

    public static /* synthetic */ int zza(zzed zzed2) {
        return zzed2.flags;
    }

    private static Field zza(Class object, String string2) {
        try {
            return ((Class)object).getDeclaredField(string2);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            int n3;
            Object[] object2 = ((Class)object).getDeclaredFields();
            int n4 = object2.length;
            for (n3 = 0; n3 < n4; ++n3) {
                Field field = object2[n3];
                String string3 = field.getName();
                boolean bl2 = string2.equals(string3);
                if (!bl2) continue;
                return field;
            }
            object = ((Class)object).getName();
            String string4 = Arrays.toString(object2);
            n3 = lE2.a(40, string2);
            n3 = lE2.a(((String)object).length() + n3, string4);
            StringBuilder stringBuilder = new StringBuilder(n3);
            stringBuilder.append("Field ");
            stringBuilder.append(string2);
            stringBuilder.append(" for ");
            stringBuilder.append((String)object);
            object = h30_0.a(stringBuilder, " not found. Known fields are ", string4);
            RuntimeException runtimeException = new RuntimeException((String)object);
            throw runtimeException;
        }
    }

    public static /* synthetic */ int zzb(zzed zzed2) {
        return zzed2.zzmk;
    }

    public static /* synthetic */ int zzc(zzed zzed2) {
        return zzed2.zzml;
    }

    private final Object zzcw() {
        int n3;
        Object[] objectArray = this.zzmj;
        int n4 = this.zznp;
        this.zznp = n3 = n4 + 1;
        return objectArray[n4];
    }

    private final boolean zzcz() {
        int bl2 = this.flags;
        int n3 = 1;
        int n4 = bl2 & n3;
        if (n4 == n3) {
            return n3 != 0;
        }
        return false;
    }

    public static /* synthetic */ int zzd(zzed zzed2) {
        return zzed2.zznj;
    }

    public static /* synthetic */ int zze(zzed zzed2) {
        return zzed2.zznm;
    }

    public static /* synthetic */ int zzf(zzed zzed2) {
        return zzed2.zzno;
    }

    public static /* synthetic */ int[] zzg(zzed zzed2) {
        return zzed2.zzms;
    }

    public static /* synthetic */ int zzh(zzed zzed2) {
        return zzed2.zznn;
    }

    public static /* synthetic */ int zzi(zzed zzed2) {
        return zzed2.zzmm;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean next() {
        block15: {
            block18: {
                block19: {
                    block16: {
                        block17: {
                            var1_1 = this.zznh;
                            var2_2 = var1_1.hasNext();
                            if (var2_2 == 0) {
                                return false;
                            }
                            this.zzny = var2_2 = this.zznh.next();
                            var1_1 = this.zznh;
                            this.zznz = var2_2 = var1_1.next();
                            this.zzoa = var2_2 &= 255;
                            var3_3 = this.zzny;
                            var4_4 = this.zznr;
                            if (var3_3 < var4_4) {
                                this.zznr = var3_3;
                            }
                            if (var3_3 > (var4_4 = this.zzns)) {
                                this.zzns = var3_3;
                            }
                            var5_5 = zzcb.zziw;
                            var4_4 = var5_5.id();
                            var6_6 = 1;
                            if (var2_2 == var4_4) {
                                this.zznt = var2_2 = this.zznt + var6_6;
                            } else {
                                var2_2 = this.zzoa;
                                var7_7 /* !! */  = zzcb.zzhq;
                                var4_4 = var7_7 /* !! */ .id();
                                if (var2_2 >= var4_4 && (var2_2 = this.zzoa) <= (var4_4 = (var7_7 /* !! */  = zzcb.zziv).id())) {
                                    this.zznu = var2_2 = this.zznu + var6_6;
                                }
                            }
                            this.zznx = var2_2 = this.zznx + var6_6;
                            var4_4 = this.zznr;
                            var8_8 = this.zzny;
                            var2_2 = (int)zzeh.zzc(var4_4, var8_8, var2_2);
                            if (var2_2 != 0) {
                                this.zznw = var2_2 = this.zzny + var6_6;
                                var4_4 = this.zznr;
                                var2_2 -= var4_4;
lbl34:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var2_2 = this.zznv + var6_6;
                            ** while (true)
                            this.zznv = var2_2;
                            var2_2 = this.zznz & 1024;
                            if (var2_2 != 0) {
                                var1_1 = this.zzms;
                                var4_4 = this.zznq;
                                this.zznq = var8_8 = var4_4 + 1;
                                var8_8 = this.zzny;
                                var1_1[var4_4] = var8_8;
                            }
                            var1_1 = null;
                            this.zzoe = null;
                            this.zzof = null;
                            this.zzog = null;
                            var2_2 = (int)this.zzda();
                            if (var2_2 == 0) break block16;
                            var1_1 = this.zznh;
                            this.zzob = var2_2 = var1_1.next();
                            var2_2 = this.zzoa;
                            var5_5 = zzcb.zzhh;
                            var3_3 = var5_5.id() + 51;
                            if (var2_2 == var3_3 || (var2_2 = this.zzoa) == (var3_3 = (var5_5 = zzcb.zzhp).id() + 51)) break block17;
                            var2_2 = this.zzoa;
                            var5_5 = zzcb.zzhk;
                            var3_3 = var5_5.id() + 51;
                            if (var2_2 == var3_3 && (var2_2 = (int)this.zzcz()) != 0) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    this.zzof = var1_1 = this.zzcw();
                                    ** GOTO lbl101
                                    break;
                                }
                            }
                            break block15;
                        }
lbl67:
                        // 2 sources

                        while (true) {
                            var1_1 = this.zzcw();
lbl69:
                            // 2 sources

                            while (true) {
                                this.zzoe = var1_1;
                                break block15;
                                break;
                            }
                            break;
                        }
                    }
                    var1_1 = this.zzni;
                    var7_7 /* !! */  = (String)this.zzcw();
                    this.zzod = var1_1 = zzed.zza((Class)var1_1, (String)var7_7 /* !! */ );
                    var2_2 = (int)this.zzde();
                    if (var2_2 != 0) {
                        var1_1 = this.zznh;
                        this.zzoc = var2_2 = var1_1.next();
                    }
                    if ((var2_2 = this.zzoa) == (var4_4 = (var7_7 /* !! */  = zzcb.zzhh).id()) || (var2_2 = this.zzoa) == (var4_4 = (var7_7 /* !! */  = zzcb.zzhp).id())) break block18;
                    ** while ((var2_2 = this.zzoa) == (var4_4 = (var7_7 /* !! */  = zzcb.zzhz).id()) || (var2_2 = this.zzoa) == (var4_4 = (var7_7 /* !! */  = zzcb.zziv).id()))
lbl82:
                    // 1 sources

                    var2_2 = this.zzoa;
                    var7_7 /* !! */  = zzcb.zzhk;
                    var4_4 = var7_7 /* !! */ .id();
                    if (var2_2 == var4_4 || (var2_2 = this.zzoa) == (var4_4 = (var7_7 /* !! */  = zzcb.zzic).id()) || (var2_2 = this.zzoa) == (var4_4 = (var7_7 /* !! */  = zzcb.zziq).id())) break block19;
                    var2_2 = this.zzoa;
                    var3_3 = var5_5.id();
                    if (var2_2 != var3_3) break block15;
                    this.zzog = var1_1 = this.zzcw();
                    var2_2 = this.zznz & 2048;
                    if (var2_2 == 0) break block15;
                    ** GOTO lbl-1000
                }
                var2_2 = (int)this.zzcz();
                if (var2_2 != 0) {
                    ** continue;
                }
                break block15;
            }
            var1_1 = this.zzod.getType();
            ** while (true)
        }
        return (boolean)var6_6;
    }

    public final int zzcx() {
        return this.zzny;
    }

    public final int zzcy() {
        return this.zzoa;
    }

    public final boolean zzda() {
        int n3 = this.zzoa;
        zzcb zzcb2 = zzcb.zziw;
        int n4 = zzcb2.id();
        return n3 > n4;
    }

    public final Field zzdb() {
        int n3 = this.zzob << 1;
        Object object = this.zzmj[n3];
        boolean bl2 = object instanceof Field;
        if (bl2) {
            return (Field)object;
        }
        Class clazz = this.zzni;
        object = (String)object;
        this.zzmj[n3] = object = zzed.zza(clazz, (String)object);
        return object;
    }

    public final Field zzdc() {
        int n3 = (this.zzob << 1) + 1;
        Object object = this.zzmj[n3];
        boolean bl2 = object instanceof Field;
        if (bl2) {
            return (Field)object;
        }
        Class clazz = this.zzni;
        object = (String)object;
        this.zzmj[n3] = object = zzed.zza(clazz, (String)object);
        return object;
    }

    public final Field zzdd() {
        return this.zzod;
    }

    public final boolean zzde() {
        zzcb zzcb2;
        int n3;
        int n4 = this.zzcz();
        return n4 != 0 && (n4 = this.zzoa) <= (n3 = (zzcb2 = zzcb.zzhp).id());
    }

    public final Field zzdf() {
        int n3 = this.zznk << 1;
        int n4 = this.zzoc / 32 + n3;
        Object object = this.zzmj[n4];
        boolean bl2 = object instanceof Field;
        if (bl2) {
            return (Field)object;
        }
        Class clazz = this.zzni;
        object = (String)object;
        this.zzmj[n4] = object = zzed.zza(clazz, (String)object);
        return object;
    }

    public final int zzdg() {
        return this.zzoc % 32;
    }

    public final boolean zzdh() {
        int n3 = this.zznz & 0x100;
        return n3 != 0;
    }

    public final boolean zzdi() {
        int n3 = this.zznz & 0x200;
        return n3 != 0;
    }

    public final Object zzdj() {
        return this.zzoe;
    }

    public final Object zzdk() {
        return this.zzof;
    }

    public final Object zzdl() {
        return this.zzog;
    }
}

