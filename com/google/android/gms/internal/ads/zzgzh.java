/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzg;
import com.google.android.gms.internal.ads.zzgzi;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhcd;
import com.google.android.gms.internal.ads.zzhcm;
import com.google.android.gms.internal.ads.zzhdd;
import com.google.android.gms.internal.ads.zzhde;
import com.google.android.gms.internal.ads.zzhdn;
import com.google.android.gms.internal.ads.zzhep;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzgzh
implements zzhdd {
    private String zza(String string2) {
        String string3 = this.getClass().getName();
        return uc0_0.a("Reading ", string3, " from a ", string2, " threw an IOException (should never happen).");
    }

    private static void zzb(Iterable object, List object2) {
        Object object3;
        int n3;
        int n4 = object2 instanceof ArrayList;
        if (n4 != 0 && (n4 = object instanceof Collection) != 0) {
            List list = object2;
            list = (ArrayList)object2;
            n3 = object2.size();
            object3 = object;
            object3 = (Collection)object;
            int n7 = object3.size() + n3;
            ((ArrayList)list).ensureCapacity(n7);
        }
        n4 = object2.size();
        object = object.iterator();
        while ((n3 = object.hasNext()) != 0) {
            Object object4 = object.next();
            if (object4 == null) {
                int n8 = object2.size() - n4;
                object4 = "Element at index ";
                object3 = " is null.";
                object = Gj0.b(n8, object4, (String)object3);
                n3 = object2.size();
                while ((n3 += -1) >= n4) {
                    object2.remove(n3);
                }
                object2 = new NullPointerException((String)object);
                throw object2;
            }
            object2.add(object4);
        }
    }

    public static zzhep zzbb(zzhde zzhde2) {
        zzhep zzhep2 = new zzhep(zzhde2);
        return zzhep2;
    }

    public static void zzbc(Iterable iterable, Collection collection) {
        collection = (List)collection;
        zzgzh.zzbd(iterable, (List)collection);
    }

    public static void zzbd(Iterable object, List object2) {
        Object object3 = zzhcb.zzd;
        object.getClass();
        boolean bl2 = object instanceof zzhcm;
        if (bl2) {
            int n3;
            object = ((zzhcm)object).zzh();
            object3 = object2;
            object3 = (zzhcm)object2;
            int n4 = object2.size();
            object = object.iterator();
            while ((n3 = object.hasNext()) != 0) {
                Object object4 = object.next();
                if (object4 == null) {
                    int n7 = object3.size() - n4;
                    object4 = "Element at index ";
                    String string2 = " is null.";
                    object = Gj0.b(n7, object4, string2);
                    n3 = object3.size();
                    while ((n3 += -1) >= n4) {
                        object3.remove(n3);
                    }
                    object2 = new NullPointerException((String)object);
                    throw object2;
                }
                boolean bl3 = object4 instanceof zzhac;
                if (bl3) {
                    object4 = (zzhac)object4;
                    object3.zzi((zzhac)object4);
                    continue;
                }
                object4 = (String)object4;
                object3.add(object4);
            }
            return;
        }
        bl2 = object instanceof zzhdn;
        if (bl2) {
            object = (Collection)object;
            object2.addAll(object);
            return;
        }
        zzgzh.zzb((Iterable)object, (List)object2);
    }

    public abstract zzgzh zzaC();

    public abstract zzgzh zzaD(zzgzi var1);

    public zzgzh zzaE(zzhac object) {
        zzhcd zzhcd22;
        block6: {
            object = ((zzhac)object).zzl();
            this.zzaF((zzham)object);
            RuntimeException runtimeException = null;
            try {
                ((zzham)object).zzz(0);
                return this;
            }
            catch (IOException iOException) {
            }
            catch (zzhcd zzhcd22) {
                break block6;
            }
            String string2 = this.zza("ByteString");
            runtimeException = new RuntimeException(string2, iOException);
            throw runtimeException;
        }
        throw zzhcd22;
    }

    public zzgzh zzaF(zzham zzham2) {
        zzhay zzhay2 = zzhay.zza;
        return this.zzaK(zzham2, zzhay2);
    }

    public zzgzh zzaG(zzhde object) {
        Class<?> clazz = this.zzbt().getClass();
        boolean bl2 = clazz.isInstance(object);
        if (bl2) {
            object = (zzgzi)object;
            return this.zzaD((zzgzi)object);
        }
        object = new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        throw object;
    }

    public zzgzh zzaH(InputStream object) {
        object = zzham.zzI((InputStream)object, 4096);
        this.zzaF((zzham)object);
        ((zzham)object).zzz(0);
        return this;
    }

    public zzgzh zzaI(byte[] byArray) {
        int n3 = byArray.length;
        return this.zzaN(byArray, 0, n3);
    }

    public zzgzh zzaJ(zzhac object, zzhay object2) {
        zzhcd zzhcd22;
        block6: {
            object = ((zzhac)object).zzl();
            this.zzaK((zzham)object, (zzhay)object2);
            object2 = null;
            try {
                ((zzham)object).zzz(0);
                return this;
            }
            catch (IOException iOException) {
            }
            catch (zzhcd zzhcd22) {
                break block6;
            }
            String string2 = this.zza("ByteString");
            object2 = new RuntimeException(string2, iOException);
            throw object2;
        }
        throw zzhcd22;
    }

    public abstract zzgzh zzaK(zzham var1, zzhay var2);

    public zzgzh zzaL(InputStream object, zzhay zzhay2) {
        object = zzham.zzI((InputStream)object, 4096);
        this.zzaK((zzham)object, zzhay2);
        ((zzham)object).zzz(0);
        return this;
    }

    public zzgzh zzaM(byte[] byArray, zzhay zzhay2) {
        int n3 = byArray.length;
        return this.zzaO(byArray, 0, n3, zzhay2);
    }

    public zzgzh zzaN(byte[] object, int n3, int n4) {
        zzhcd zzhcd22;
        block6: {
            object = zzham.zzJ((byte[])object, n3, n4, false);
            this.zzaF((zzham)object);
            try {
                ((zzham)object).zzz(0);
                return this;
            }
            catch (IOException iOException) {
            }
            catch (zzhcd zzhcd22) {
                break block6;
            }
            String string2 = this.zza("byte array");
            RuntimeException runtimeException = new RuntimeException(string2, iOException);
            throw runtimeException;
        }
        throw zzhcd22;
    }

    public zzgzh zzaO(byte[] object, int n3, int n4, zzhay zzhay2) {
        zzhcd zzhcd22;
        block6: {
            object = zzham.zzJ((byte[])object, n3, n4, false);
            this.zzaK((zzham)object, zzhay2);
            try {
                ((zzham)object).zzz(0);
                return this;
            }
            catch (IOException iOException) {
            }
            catch (zzhcd zzhcd22) {
                break block6;
            }
            String string2 = this.zza("byte array");
            RuntimeException runtimeException = new RuntimeException(string2, iOException);
            throw runtimeException;
        }
        throw zzhcd22;
    }

    public boolean zzbe(InputStream inputStream) {
        zzhay zzhay2 = zzhay.zza;
        return this.zzbf(inputStream, zzhay2);
    }

    public boolean zzbf(InputStream inputStream, zzhay zzhay2) {
        int n3;
        int n4 = inputStream.read();
        if (n4 == (n3 = -1)) {
            return false;
        }
        n4 = zzham.zzG(n4, inputStream);
        zzgzg zzgzg2 = new zzgzg(inputStream, n4);
        this.zzaL(zzgzg2, zzhay2);
        return true;
    }
}

