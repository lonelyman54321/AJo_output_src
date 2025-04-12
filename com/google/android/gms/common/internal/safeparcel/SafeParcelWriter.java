/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.util.SparseArray
 *  android.util.SparseBooleanArray
 *  android.util.SparseIntArray
 *  android.util.SparseLongArray
 */
package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(Parcel parcel) {
        return SafeParcelWriter.zza(parcel, 20293);
    }

    public static void finishObjectHeader(Parcel parcel, int n3) {
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeBigDecimal(Parcel parcel, int n3, BigDecimal bigDecimal, boolean bl2) {
        if (bigDecimal == null) {
            if (bl2) {
                boolean bl3 = false;
                bigDecimal = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        byte[] byArray = bigDecimal.unscaledValue().toByteArray();
        parcel.writeByteArray(byArray);
        int n4 = bigDecimal.scale();
        parcel.writeInt(n4);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeBigDecimalArray(Parcel parcel, int n3, BigDecimal[] bigDecimalArray, boolean n4) {
        if (bigDecimalArray == null) {
            if (n4) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = bigDecimalArray.length;
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            Object object = bigDecimalArray[i3].unscaledValue().toByteArray();
            parcel.writeByteArray((byte[])object);
            object = bigDecimalArray[i3];
            int n7 = ((BigDecimal)object).scale();
            parcel.writeInt(n7);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeBigInteger(Parcel parcel, int n3, BigInteger object, boolean bl2) {
        if (object == null) {
            if (bl2) {
                object = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        object = ((BigInteger)object).toByteArray();
        parcel.writeByteArray((byte[])object);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeBigIntegerArray(Parcel parcel, int n3, BigInteger[] bigIntegerArray, boolean n4) {
        if (bigIntegerArray == null) {
            if (n4) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = bigIntegerArray.length;
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            byte[] byArray = bigIntegerArray[i3].toByteArray();
            parcel.writeByteArray(byArray);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeBoolean(Parcel parcel, int n3, boolean bl2) {
        SafeParcelWriter.zzc(parcel, n3, 4);
        parcel.writeInt((int)(bl2 ? 1 : 0));
    }

    public static void writeBooleanArray(Parcel parcel, int n3, boolean[] blArray, boolean bl2) {
        if (blArray == null) {
            if (bl2) {
                blArray = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        parcel.writeBooleanArray(blArray);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeBooleanList(Parcel parcel, int n3, List list, boolean n4) {
        if (list == null) {
            if (n4 != 0) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = list.size();
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            Boolean bl2 = (Boolean)list.get(i3);
            int n7 = bl2.booleanValue();
            parcel.writeInt(n7);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeBooleanObject(Parcel parcel, int n3, Boolean bl2, boolean bl3) {
        if (bl2 == null) {
            if (bl3) {
                bl2 = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        SafeParcelWriter.zzc(parcel, n3, 4);
        n3 = (int)(bl2.booleanValue() ? 1 : 0);
        parcel.writeInt(n3);
    }

    public static void writeBundle(Parcel parcel, int n3, Bundle bundle, boolean bl2) {
        if (bundle == null) {
            if (bl2) {
                bundle = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        parcel.writeBundle(bundle);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeByte(Parcel parcel, int n3, byte by2) {
        SafeParcelWriter.zzc(parcel, n3, 4);
        parcel.writeInt((int)by2);
    }

    public static void writeByteArray(Parcel parcel, int n3, byte[] byArray, boolean bl2) {
        if (byArray == null) {
            if (bl2) {
                byArray = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        parcel.writeByteArray(byArray);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeByteArrayArray(Parcel parcel, int n3, byte[][] byArray, boolean n4) {
        if (byArray == null) {
            if (n4) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = byArray.length;
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            byte[] byArray2 = byArray[i3];
            parcel.writeByteArray(byArray2);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeByteArraySparseArray(Parcel parcel, int n3, SparseArray sparseArray, boolean n4) {
        if (sparseArray == null) {
            if (n4) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = sparseArray.size();
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7 = sparseArray.keyAt(i3);
            parcel.writeInt(n7);
            byte[] byArray = (byte[])sparseArray.valueAt(i3);
            parcel.writeByteArray(byArray);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeChar(Parcel parcel, int n3, char c2) {
        SafeParcelWriter.zzc(parcel, n3, 4);
        parcel.writeInt((int)c2);
    }

    public static void writeCharArray(Parcel parcel, int n3, char[] cArray, boolean bl2) {
        if (cArray == null) {
            if (bl2) {
                cArray = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        parcel.writeCharArray(cArray);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeDouble(Parcel parcel, int n3, double d2) {
        SafeParcelWriter.zzc(parcel, n3, 8);
        parcel.writeDouble(d2);
    }

    public static void writeDoubleArray(Parcel parcel, int n3, double[] dArray, boolean bl2) {
        if (dArray == null) {
            if (bl2) {
                dArray = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        parcel.writeDoubleArray(dArray);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeDoubleList(Parcel parcel, int n3, List list, boolean n4) {
        if (list == null) {
            if (n4) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = list.size();
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            Double d2 = (Double)list.get(i3);
            double d5 = d2;
            parcel.writeDouble(d5);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeDoubleObject(Parcel parcel, int n3, Double d2, boolean bl2) {
        if (d2 == null) {
            if (bl2) {
                d2 = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        SafeParcelWriter.zzc(parcel, n3, 8);
        double d5 = d2;
        parcel.writeDouble(d5);
    }

    public static void writeDoubleSparseArray(Parcel parcel, int n3, SparseArray sparseArray, boolean n4) {
        if (sparseArray == null) {
            if (n4) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = sparseArray.size();
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7 = sparseArray.keyAt(i3);
            parcel.writeInt(n7);
            Double d2 = (Double)sparseArray.valueAt(i3);
            double d5 = d2;
            parcel.writeDouble(d5);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeFloat(Parcel parcel, int n3, float f5) {
        SafeParcelWriter.zzc(parcel, n3, 4);
        parcel.writeFloat(f5);
    }

    public static void writeFloatArray(Parcel parcel, int n3, float[] fArray, boolean bl2) {
        if (fArray == null) {
            if (bl2) {
                fArray = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        parcel.writeFloatArray(fArray);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeFloatList(Parcel parcel, int n3, List list, boolean n4) {
        if (list == null) {
            if (n4) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = list.size();
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            Float f5 = (Float)list.get(i3);
            float f6 = f5.floatValue();
            parcel.writeFloat(f6);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeFloatObject(Parcel parcel, int n3, Float f5, boolean bl2) {
        if (f5 == null) {
            if (bl2) {
                f5 = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        SafeParcelWriter.zzc(parcel, n3, 4);
        float f6 = f5.floatValue();
        parcel.writeFloat(f6);
    }

    public static void writeFloatSparseArray(Parcel parcel, int n3, SparseArray sparseArray, boolean n4) {
        if (sparseArray == null) {
            if (n4) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = sparseArray.size();
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7 = sparseArray.keyAt(i3);
            parcel.writeInt(n7);
            Float f5 = (Float)sparseArray.valueAt(i3);
            float f6 = f5.floatValue();
            parcel.writeFloat(f6);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeIBinder(Parcel parcel, int n3, IBinder iBinder, boolean bl2) {
        if (iBinder == null) {
            if (bl2) {
                iBinder = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        parcel.writeStrongBinder(iBinder);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeIBinderArray(Parcel parcel, int n3, IBinder[] iBinderArray, boolean bl2) {
        if (iBinderArray == null) {
            if (bl2) {
                iBinderArray = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        parcel.writeBinderArray(iBinderArray);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeIBinderList(Parcel parcel, int n3, List list, boolean bl2) {
        if (list == null) {
            if (bl2) {
                list = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        parcel.writeBinderList(list);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeIBinderSparseArray(Parcel parcel, int n3, SparseArray sparseArray, boolean n4) {
        if (sparseArray == null) {
            if (n4) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = sparseArray.size();
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7 = sparseArray.keyAt(i3);
            parcel.writeInt(n7);
            IBinder iBinder = (IBinder)sparseArray.valueAt(i3);
            parcel.writeStrongBinder(iBinder);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeInt(Parcel parcel, int n3, int n4) {
        SafeParcelWriter.zzc(parcel, n3, 4);
        parcel.writeInt(n4);
    }

    public static void writeIntArray(Parcel parcel, int n3, int[] nArray, boolean bl2) {
        if (nArray == null) {
            if (bl2) {
                nArray = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        parcel.writeIntArray(nArray);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeIntegerList(Parcel parcel, int n3, List list, boolean n4) {
        if (list == null) {
            if (n4) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = list.size();
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            Integer n7 = (Integer)list.get(i3);
            int n8 = n7;
            parcel.writeInt(n8);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeIntegerObject(Parcel parcel, int n3, Integer n4, boolean bl2) {
        if (n4 == null) {
            if (bl2) {
                n4 = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        SafeParcelWriter.zzc(parcel, n3, 4);
        n3 = n4;
        parcel.writeInt(n3);
    }

    public static void writeList(Parcel parcel, int n3, List list, boolean bl2) {
        if (list == null) {
            if (bl2) {
                list = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        parcel.writeList(list);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeLong(Parcel parcel, int n3, long l2) {
        SafeParcelWriter.zzc(parcel, n3, 8);
        parcel.writeLong(l2);
    }

    public static void writeLongArray(Parcel parcel, int n3, long[] lArray, boolean bl2) {
        if (lArray == null) {
            if (bl2) {
                lArray = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        parcel.writeLongArray(lArray);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeLongList(Parcel parcel, int n3, List list, boolean n4) {
        if (list == null) {
            if (n4) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = list.size();
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            Long l2 = (Long)list.get(i3);
            long l3 = l2;
            parcel.writeLong(l3);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeLongObject(Parcel parcel, int n3, Long l2, boolean bl2) {
        if (l2 == null) {
            if (bl2) {
                l2 = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        SafeParcelWriter.zzc(parcel, n3, 8);
        long l3 = l2;
        parcel.writeLong(l3);
    }

    public static void writeParcel(Parcel parcel, int n3, Parcel parcel2, boolean bl2) {
        if (parcel2 == null) {
            if (bl2) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        int n4 = parcel2.dataSize();
        parcel.appendFrom(parcel2, 0, n4);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeParcelArray(Parcel parcel, int n3, Parcel[] parcelArray, boolean n4) {
        if (parcelArray == null) {
            if (n4) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = parcelArray.length;
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            Parcel parcel2 = parcelArray[i3];
            if (parcel2 != null) {
                int n7 = parcel2.dataSize();
                parcel.writeInt(n7);
                n7 = parcel2.dataSize();
                parcel.appendFrom(parcel2, 0, n7);
                continue;
            }
            parcel.writeInt(0);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeParcelList(Parcel parcel, int n3, List list, boolean n4) {
        if (list == null) {
            if (n4) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = list.size();
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            Parcel parcel2 = (Parcel)list.get(i3);
            if (parcel2 != null) {
                int n7 = parcel2.dataSize();
                parcel.writeInt(n7);
                n7 = parcel2.dataSize();
                parcel.appendFrom(parcel2, 0, n7);
                continue;
            }
            parcel.writeInt(0);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeParcelSparseArray(Parcel parcel, int n3, SparseArray sparseArray, boolean n4) {
        if (sparseArray == null) {
            if (n4) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = sparseArray.size();
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7 = sparseArray.keyAt(i3);
            parcel.writeInt(n7);
            Parcel parcel2 = (Parcel)sparseArray.valueAt(i3);
            if (parcel2 != null) {
                int n8 = parcel2.dataSize();
                parcel.writeInt(n8);
                n8 = parcel2.dataSize();
                parcel.appendFrom(parcel2, 0, n8);
                continue;
            }
            parcel.writeInt(0);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeParcelable(Parcel parcel, int n3, Parcelable parcelable, int n4, boolean bl2) {
        if (parcelable == null) {
            if (bl2) {
                parcelable = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        parcelable.writeToParcel(parcel, n4);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writePendingIntent(Parcel parcel, int n3, PendingIntent pendingIntent, boolean bl2) {
        if (pendingIntent == null) {
            if (bl2) {
                pendingIntent = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        PendingIntent.writePendingIntentOrNullToParcel((PendingIntent)pendingIntent, (Parcel)parcel);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeShort(Parcel parcel, int n3, short s7) {
        SafeParcelWriter.zzc(parcel, n3, 4);
        parcel.writeInt((int)s7);
    }

    public static void writeSparseBooleanArray(Parcel parcel, int n3, SparseBooleanArray sparseBooleanArray, boolean bl2) {
        if (sparseBooleanArray == null) {
            if (bl2) {
                sparseBooleanArray = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        parcel.writeSparseBooleanArray(sparseBooleanArray);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeSparseIntArray(Parcel parcel, int n3, SparseIntArray sparseIntArray, boolean n4) {
        if (sparseIntArray == null) {
            if (n4) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = sparseIntArray.size();
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7 = sparseIntArray.keyAt(i3);
            parcel.writeInt(n7);
            n7 = sparseIntArray.valueAt(i3);
            parcel.writeInt(n7);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeSparseLongArray(Parcel parcel, int n3, SparseLongArray sparseLongArray, boolean n4) {
        if (sparseLongArray == null) {
            if (n4) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = sparseLongArray.size();
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7 = sparseLongArray.keyAt(i3);
            parcel.writeInt(n7);
            long l2 = sparseLongArray.valueAt(i3);
            parcel.writeLong(l2);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeString(Parcel parcel, int n3, String string2, boolean bl2) {
        if (string2 == null) {
            if (bl2) {
                string2 = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        parcel.writeString(string2);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeStringArray(Parcel parcel, int n3, String[] stringArray, boolean bl2) {
        if (stringArray == null) {
            if (bl2) {
                stringArray = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        parcel.writeStringArray(stringArray);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeStringList(Parcel parcel, int n3, List list, boolean bl2) {
        if (list == null) {
            if (bl2) {
                list = null;
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        parcel.writeStringList(list);
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeStringSparseArray(Parcel parcel, int n3, SparseArray sparseArray, boolean n4) {
        if (sparseArray == null) {
            if (n4) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = sparseArray.size();
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7 = sparseArray.keyAt(i3);
            parcel.writeInt(n7);
            String string2 = (String)sparseArray.valueAt(i3);
            parcel.writeString(string2);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeTypedArray(Parcel parcel, int n3, Parcelable[] parcelableArray, int n4, boolean n7) {
        if (parcelableArray == null) {
            if (n7) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n7 = parcelableArray.length;
        parcel.writeInt(n7);
        for (int i3 = 0; i3 < n7; ++i3) {
            Parcelable parcelable = parcelableArray[i3];
            if (parcelable == null) {
                parcel.writeInt(0);
                continue;
            }
            SafeParcelWriter.zzd(parcel, parcelable, n4);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeTypedList(Parcel parcel, int n3, List list, boolean n4) {
        if (list == null) {
            if (n4) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = list.size();
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            Parcelable parcelable = (Parcelable)list.get(i3);
            if (parcelable == null) {
                parcel.writeInt(0);
                continue;
            }
            SafeParcelWriter.zzd(parcel, parcelable, 0);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    public static void writeTypedSparseArray(Parcel parcel, int n3, SparseArray sparseArray, boolean n4) {
        if (sparseArray == null) {
            if (n4) {
                SafeParcelWriter.zzc(parcel, n3, 0);
            }
            return;
        }
        n3 = SafeParcelWriter.zza(parcel, n3);
        n4 = sparseArray.size();
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7 = sparseArray.keyAt(i3);
            parcel.writeInt(n7);
            Parcelable parcelable = (Parcelable)sparseArray.valueAt(i3);
            if (parcelable == null) {
                parcel.writeInt(0);
                continue;
            }
            SafeParcelWriter.zzd(parcel, parcelable, 0);
        }
        SafeParcelWriter.zzb(parcel, n3);
    }

    private static int zza(Parcel parcel, int n3) {
        parcel.writeInt(n3 |= 0xFFFF0000);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void zzb(Parcel parcel, int n3) {
        int n4 = parcel.dataPosition();
        int n7 = n4 - n3;
        parcel.setDataPosition(n3 += -4);
        parcel.writeInt(n7);
        parcel.setDataPosition(n4);
    }

    private static void zzc(Parcel parcel, int n3, int n4) {
        parcel.writeInt(n3 |= (n4 <<= 16));
    }

    private static void zzd(Parcel parcel, Parcelable parcelable, int n3) {
        int n4 = parcel.dataPosition();
        parcel.writeInt(1);
        int n7 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, n3);
        int n8 = parcel.dataPosition();
        parcel.setDataPosition(n4);
        n3 = n8 - n7;
        parcel.writeInt(n3);
        parcel.setDataPosition(n8);
    }
}

