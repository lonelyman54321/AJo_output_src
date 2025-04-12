/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.icing.zzbp;
import com.google.firebase.appindexing.Indexable;
import com.google.firebase.appindexing.internal.zzab;
import com.google.firebase.appindexing.internal.zzac;
import com.google.firebase.appindexing.internal.zzad;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public final class Thing
extends AbstractSafeParcelable
implements Indexable,
ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    private final Bundle zzb;
    private final zzac zzc;
    private final String zzd;
    private final String zze;

    static {
        zzad zzad2 = new zzad();
        CREATOR = zzad2;
    }

    public Thing(int n3, Bundle bundle, zzac zzac2, String string2, String string3) {
        this.zza = n3;
        this.zzb = bundle;
        this.zzc = zzac2;
        this.zzd = string2;
        this.zze = string3;
        ClassLoader classLoader = Thing.class.getClassLoader();
        zzbp.zza(classLoader);
        bundle.setClassLoader(classLoader);
    }

    public Thing(Bundle bundle, zzac zzac2, String string2, String string3) {
        this.zza = 10;
        this.zzb = bundle;
        this.zzc = zzac2;
        this.zzd = string2;
        this.zze = string3;
    }

    public static /* synthetic */ void zza(Bundle bundle, StringBuilder stringBuilder) {
        Thing.zzd(bundle, stringBuilder);
    }

    public static /* synthetic */ boolean zzb(Bundle bundle, Bundle bundle2) {
        return Thing.zze(bundle, bundle2);
    }

    public static /* synthetic */ int zzc(Bundle bundle) {
        return Thing.zzf(bundle);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void zzd(Bundle bundle, StringBuilder stringBuilder) {
        try {
            String[] stringArray = bundle.keySet();
            int n3 = stringArray.size();
            String[] stringArray2 = new String[n3];
            stringArray = stringArray.toArray(stringArray2);
            Comparator comparator = zzab.zza;
            Arrays.sort(stringArray, comparator);
            n3 = stringArray.length;
            int n4 = 0;
            while (true) {
                if (n4 >= n3) {
                    return;
                }
                Object object = stringArray[n4];
                Class<?> clazz = "{ key: '";
                stringBuilder.append((String)((Object)clazz));
                stringBuilder.append((String)object);
                clazz = "' value: ";
                stringBuilder.append((String)((Object)clazz));
                object = bundle.get((String)object);
                if (object == null) {
                    object = "<null>";
                    stringBuilder.append((String)object);
                } else {
                    clazz = object.getClass();
                    int n7 = clazz.isArray();
                    if (n7 != 0) {
                        int n8;
                        clazz = "[ ";
                        stringBuilder.append((String)((Object)clazz));
                        clazz = null;
                        for (n7 = 0; n7 < (n8 = Array.getLength(object)); ++n7) {
                            Object object2 = "'";
                            stringBuilder.append((String)object2);
                            object2 = Array.get(object, n7);
                            stringBuilder.append(object2);
                            object2 = "' ";
                            stringBuilder.append((String)object2);
                        }
                        object = "]";
                        stringBuilder.append((String)object);
                    } else {
                        object = object.toString();
                        stringBuilder.append((String)object);
                    }
                }
                object = " } ";
                stringBuilder.append((String)object);
                ++n4;
            }
        }
        catch (RuntimeException runtimeException) {
            stringBuilder.append("<error>");
            return;
        }
    }

    private static boolean zze(Bundle bundle, Bundle bundle2) {
        int n3;
        int n4 = bundle.size();
        if (n4 != (n3 = bundle2.size())) {
            return false;
        }
        Iterator iterator = bundle.keySet().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            String string2 = (String)iterator.next();
            Object[] objectArray = bundle.get(string2);
            Object[] objectArray2 = bundle2.get(string2);
            boolean bl2 = objectArray instanceof Bundle;
            if (bl2 && (bl2 = objectArray2 instanceof Bundle)) {
                Object object = objectArray;
                object = (Bundle)objectArray;
                Object object2 = objectArray2;
                object2 = (Bundle)objectArray2;
                bl2 = Thing.zze((Bundle)object, (Bundle)object2);
                if (!bl2) {
                    return false;
                }
            }
            if (objectArray == null) {
                if (objectArray2 == null && (n3 = (int)(bundle2.containsKey(string2) ? 1 : 0)) != 0) {
                    objectArray2 = null;
                } else {
                    return false;
                }
            }
            if (!((n3 = objectArray instanceof boolean[]) != 0 ? (n3 = objectArray2 instanceof boolean[]) == 0 || (n3 = (int)(Arrays.equals((boolean[])(objectArray = (Object[])((boolean[])objectArray)), (boolean[])(objectArray2 = (Object[])((boolean[])objectArray2))) ? 1 : 0)) == 0 : ((n3 = objectArray instanceof long[]) != 0 ? (n3 = objectArray2 instanceof long[]) == 0 || (n3 = (int)(Arrays.equals((long[])(objectArray = (Object[])((long[])objectArray)), (long[])(objectArray2 = (Object[])((long[])objectArray2))) ? 1 : 0)) == 0 : ((n3 = objectArray instanceof double[]) != 0 ? (n3 = objectArray2 instanceof double[]) == 0 || (n3 = (int)(Arrays.equals((double[])(objectArray = (Object[])((double[])objectArray)), (double[])(objectArray2 = (Object[])((double[])objectArray2))) ? 1 : 0)) == 0 : ((n3 = objectArray instanceof byte[]) != 0 ? (n3 = objectArray2 instanceof byte[]) == 0 || (n3 = (int)(Arrays.equals((byte[])(objectArray = (Object[])((byte[])objectArray)), (byte[])(objectArray2 = (Object[])((byte[])objectArray2))) ? 1 : 0)) == 0 : (n3 = objectArray instanceof Object[]) != 0 && ((n3 = objectArray2 instanceof Object[]) == 0 || (n3 = (int)(Arrays.equals(objectArray = (Object[])objectArray, objectArray2 = (Object[])objectArray2) ? 1 : 0)) == 0)))))) continue;
            return false;
        }
        return true;
    }

    private static int zzf(Bundle bundle) {
        int n3 = 1;
        Collection<Object> collection = bundle.keySet();
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList);
        collection = new Collection<Object>();
        int n4 = arrayList.size();
        for (int i3 = 0; i3 < n4; i3 += n3) {
            int n7;
            Object object = (String)arrayList.get(i3);
            boolean bl2 = (object = bundle.get((String)object)) instanceof boolean[];
            if (bl2) {
                n7 = Arrays.hashCode((boolean[])object);
                object = n7;
                ((ArrayList)collection).add(object);
                continue;
            }
            bl2 = object instanceof long[];
            if (bl2) {
                n7 = Arrays.hashCode((long[])object);
                object = n7;
                ((ArrayList)collection).add(object);
                continue;
            }
            bl2 = object instanceof double[];
            if (bl2) {
                n7 = Arrays.hashCode((double[])object);
                object = n7;
                ((ArrayList)collection).add(object);
                continue;
            }
            bl2 = object instanceof byte[];
            if (bl2) {
                n7 = Arrays.hashCode((byte[])object);
                object = n7;
                ((ArrayList)collection).add(object);
                continue;
            }
            bl2 = object instanceof Object[];
            if (bl2) {
                n7 = Arrays.hashCode((Object[])object);
                object = n7;
                ((ArrayList)collection).add(object);
                continue;
            }
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            n7 = Objects.hashCode(objectArray);
            object = n7;
            ((ArrayList)collection).add(object);
        }
        return Objects.hashCode(((ArrayList)collection).toArray());
    }

    public final boolean equals(Object object) {
        boolean bl2;
        int n3;
        Object object2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof Thing;
        if (!bl4) {
            return false;
        }
        object = (Thing)object;
        Object object3 = this.zza;
        bl4 = Objects.equal(object3, object2 = Integer.valueOf(n3 = ((Thing)object).zza));
        if (bl4 && (bl4 = Objects.equal(object3 = this.zzd, object2 = ((Thing)object).zzd)) && (bl4 = Objects.equal(object3 = this.zze, object2 = ((Thing)object).zze)) && (bl4 = Objects.equal(object3 = this.zzc, object2 = ((Thing)object).zzc)) && (bl2 = Thing.zze((Bundle)(object3 = this.zzb), (Bundle)(object = ((Thing)object).zzb)))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        Integer n3 = this.zza;
        String string2 = this.zzd;
        String string3 = this.zze;
        Integer n4 = this.zzc.hashCode();
        Integer n7 = Thing.zzf(this.zzb);
        Object[] objectArray = new Object[]{n3, string2, string3, n4, n7};
        return Objects.hashCode(objectArray);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.zze;
        String string3 = "Thing";
        boolean bl2 = string2.equals(string3);
        string2 = bl2 ? "Indexable" : this.zze;
        stringBuilder.append(string2);
        stringBuilder.append(" { { id: ");
        string2 = this.zzd;
        if (string2 == null) {
            string2 = "<null>";
            stringBuilder.append(string2);
        } else {
            string2 = "'";
            stringBuilder.append(string2);
            string3 = this.zzd;
            stringBuilder.append(string3);
            stringBuilder.append(string2);
        }
        stringBuilder.append(" } Properties { ");
        Thing.zzd(this.zzb, stringBuilder);
        stringBuilder.append("} Metadata { ");
        string2 = this.zzc.toString();
        stringBuilder.append(string2);
        stringBuilder.append(" } }");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.zzb;
        SafeParcelWriter.writeBundle(parcel, 1, object, false);
        zzac zzac2 = this.zzc;
        SafeParcelWriter.writeParcelable(parcel, 2, zzac2, n3, false);
        object = this.zzd;
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        object = this.zze;
        SafeParcelWriter.writeString(parcel, 4, (String)object, false);
        int n7 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1000, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

