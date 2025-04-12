/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzkj;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzkx;
import com.google.android.gms.internal.measurement.zzlp;
import com.google.android.gms.internal.measurement.zzly;
import com.google.android.gms.internal.measurement.zzmd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class zzin
implements zzlp {
    private final String zza(String string2) {
        String string3 = this.getClass().getName();
        return uc0_0.a("Reading ", string3, " from a ", string2, " threw an IOException (should never happen).");
    }

    public static void zza(Iterable object, List object2) {
        int n3;
        List list;
        int n4;
        zzkj.zza(object);
        int n7 = object instanceof zzkx;
        if (n7 != 0) {
            int n8;
            object = ((zzkx)object).zza();
            List list2 = object2;
            list2 = (zzkx)object2;
            int n10 = object2.size();
            object = object.iterator();
            while ((n8 = object.hasNext()) != 0) {
                Object object3 = object.next();
                if (object3 == null) {
                    int n14 = list2.size() - n10;
                    object3 = "Element at index ";
                    String string2 = " is null.";
                    object = Gj0.b(n14, object3, string2);
                    for (n8 = list2.size() + -1; n8 >= n10; n8 += -1) {
                        list2.remove(n8);
                    }
                    object2 = new NullPointerException((String)object);
                    throw object2;
                }
                boolean bl2 = object3 instanceof zziy;
                if (bl2) {
                    object3 = (zziy)object3;
                    list2.zza((zziy)object3);
                    continue;
                }
                bl2 = object3 instanceof byte[];
                if (bl2) {
                    object3 = zziy.zza((byte[])object3);
                    list2.zza((zziy)object3);
                    continue;
                }
                object3 = (String)object3;
                list2.add(object3);
            }
            return;
        }
        n7 = object instanceof zzly;
        if (n7 != 0) {
            object = (Collection)object;
            object2.addAll(object);
            return;
        }
        n7 = object instanceof Collection;
        if (n7 != 0) {
            Iterable iterable = object;
            iterable = (Collection)object;
            n7 = iterable.size();
            n4 = object2 instanceof ArrayList;
            if (n4 != 0) {
                list = object2;
                list = (ArrayList)object2;
                n3 = object2.size() + n7;
                ((ArrayList)list).ensureCapacity(n3);
            } else {
                n4 = object2 instanceof zzmd;
                if (n4 != 0) {
                    list = object2;
                    list = (zzmd)object2;
                    n3 = object2.size() + n7;
                    ((zzmd)list).zzb(n3);
                }
            }
        }
        n7 = object2.size();
        n4 = object instanceof List;
        if (n4 != 0 && (n4 = object instanceof RandomAccess) != 0) {
            object = (List)object;
            n4 = object.size();
            Object var8_14 = null;
            for (n3 = 0; n3 < n4; ++n3) {
                Object e2 = object.get(n3);
                if (e2 == null) {
                    zzin.zza((List)object2, n7);
                }
                object2.add(e2);
            }
            return;
        }
        object = ((Iterable)object).iterator();
        while ((n4 = object.hasNext()) != 0) {
            list = object.next();
            if (list == null) {
                zzin.zza((List)object2, n7);
            }
            object2.add(list);
        }
    }

    private static void zza(List object, int n3) {
        int n4 = object.size() - n3;
        String string2 = "Element at index ";
        String string3 = " is null.";
        String string4 = Gj0.b(n4, string2, string3);
        for (int i3 = object.size() + -1; i3 >= n3; i3 += -1) {
            object.remove(i3);
        }
        object = new NullPointerException(string4);
        throw object;
    }

    public /* synthetic */ Object clone() {
        return this.zzag();
    }

    public abstract zzin zza(zzjk var1, zzjt var2);

    public zzin zza(byte[] object, int n3, int n4) {
        zzkp zzkp22;
        block7: {
            RuntimeException runtimeException = null;
            object = zzjk.zza((byte[])object, 0, n4, false);
            Object object2 = zzjt.zza;
            this.zzb((zzjk)object, (zzjt)object2);
            try {
                ((zzjk)object).zzb(0);
                return this;
            }
            catch (IOException iOException) {
            }
            catch (zzkp zzkp22) {
                break block7;
            }
            object2 = this.zza("byte array");
            runtimeException = new RuntimeException((String)object2, iOException);
            throw runtimeException;
        }
        throw zzkp22;
    }

    public zzin zza(byte[] object, int n3, int n4, zzjt zzjt2) {
        zzkp zzkp22;
        block6: {
            RuntimeException runtimeException = null;
            object = zzjk.zza((byte[])object, 0, n4, false);
            this.zzb((zzjk)object, zzjt2);
            try {
                ((zzjk)object).zzb(0);
                return this;
            }
            catch (IOException iOException) {
            }
            catch (zzkp zzkp22) {
                break block6;
            }
            String string2 = this.zza("byte array");
            runtimeException = new RuntimeException(string2, iOException);
            throw runtimeException;
        }
        throw zzkp22;
    }

    public final /* synthetic */ zzlp zza(byte[] byArray) {
        int n3 = byArray.length;
        return this.zza(byArray, 0, n3);
    }

    public final /* synthetic */ zzlp zza(byte[] byArray, zzjt zzjt2) {
        int n3 = byArray.length;
        return this.zza(byArray, 0, n3, zzjt2);
    }

    public abstract zzin zzag();

    public /* synthetic */ zzlp zzb(zzjk zzjk2, zzjt zzjt2) {
        return this.zza(zzjk2, zzjt2);
    }
}

