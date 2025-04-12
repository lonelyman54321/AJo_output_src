/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
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
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SafeParcelReader {
    private SafeParcelReader() {
    }

    public static BigDecimal createBigDecimal(Parcel object, int n3) {
        n3 = SafeParcelReader.readSize(object, n3);
        int n4 = object.dataPosition();
        if (n3 == 0) {
            return null;
        }
        byte[] byArray = object.createByteArray();
        int n7 = object.readInt();
        object.setDataPosition(n4 += n3);
        BigInteger bigInteger = new BigInteger(byArray);
        object = new BigDecimal(bigInteger, n7);
        return object;
    }

    public static BigDecimal[] createBigDecimalArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        int n7 = parcel.readInt();
        BigDecimal[] bigDecimalArray = new BigDecimal[n7];
        for (int i3 = 0; i3 < n7; ++i3) {
            BigDecimal bigDecimal;
            byte[] byArray = parcel.createByteArray();
            int n8 = parcel.readInt();
            BigInteger bigInteger = new BigInteger(byArray);
            bigDecimalArray[i3] = bigDecimal = new BigDecimal(bigInteger, n8);
        }
        parcel.setDataPosition(n4 += n3);
        return bigDecimalArray;
    }

    public static BigInteger createBigInteger(Parcel object, int n3) {
        n3 = SafeParcelReader.readSize(object, n3);
        int n4 = object.dataPosition();
        if (n3 == 0) {
            return null;
        }
        byte[] byArray = object.createByteArray();
        object.setDataPosition(n4 += n3);
        object = new BigInteger(byArray);
        return object;
    }

    public static BigInteger[] createBigIntegerArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        int n7 = parcel.readInt();
        BigInteger[] bigIntegerArray = new BigInteger[n7];
        for (int i3 = 0; i3 < n7; ++i3) {
            BigInteger bigInteger;
            byte[] byArray = parcel.createByteArray();
            bigIntegerArray[i3] = bigInteger = new BigInteger(byArray);
        }
        parcel.setDataPosition(n4 += n3);
        return bigIntegerArray;
    }

    public static boolean[] createBooleanArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        boolean[] blArray = parcel.createBooleanArray();
        parcel.setDataPosition(n4 += n3);
        return blArray;
    }

    public static ArrayList createBooleanList(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
        int n7 = parcel.readInt();
        for (int i3 = 0; i3 < n7; ++i3) {
            Boolean bl2;
            int n8 = parcel.readInt();
            if (n8) {
                n8 = 1;
            } else {
                n8 = 0;
                bl2 = null;
            }
            bl2 = n8 != 0;
            arrayList.add(bl2);
        }
        parcel.setDataPosition(n4 += n3);
        return arrayList;
    }

    public static Bundle createBundle(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(n4 += n3);
        return bundle;
    }

    public static byte[] createByteArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        byte[] byArray = parcel.createByteArray();
        parcel.setDataPosition(n4 += n3);
        return byArray;
    }

    public static byte[][] createByteArrayArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        int n7 = parcel.readInt();
        byte[][] byArrayArray = new byte[n7][];
        for (int i3 = 0; i3 < n7; ++i3) {
            byte[] byArray = parcel.createByteArray();
            byArrayArray[i3] = byArray;
        }
        parcel.setDataPosition(n4 += n3);
        return byArrayArray;
    }

    public static SparseArray createByteArraySparseArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        int n7 = parcel.readInt();
        SparseArray sparseArray = new SparseArray(n7);
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8 = parcel.readInt();
            byte[] byArray = parcel.createByteArray();
            sparseArray.append(n8, (Object)byArray);
        }
        parcel.setDataPosition(n4 += n3);
        return sparseArray;
    }

    public static char[] createCharArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        char[] cArray = parcel.createCharArray();
        parcel.setDataPosition(n4 += n3);
        return cArray;
    }

    public static double[] createDoubleArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        double[] dArray = parcel.createDoubleArray();
        parcel.setDataPosition(n4 += n3);
        return dArray;
    }

    public static ArrayList createDoubleList(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        ArrayList<Double> arrayList = new ArrayList<Double>();
        int n7 = parcel.readInt();
        for (int i3 = 0; i3 < n7; ++i3) {
            double d2 = parcel.readDouble();
            Double d5 = d2;
            arrayList.add(d5);
        }
        parcel.setDataPosition(n4 += n3);
        return arrayList;
    }

    public static SparseArray createDoubleSparseArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        SparseArray sparseArray = new SparseArray();
        int n7 = parcel.readInt();
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8 = parcel.readInt();
            double d2 = parcel.readDouble();
            Double d5 = d2;
            sparseArray.append(n8, (Object)d5);
        }
        parcel.setDataPosition(n4 += n3);
        return sparseArray;
    }

    public static float[] createFloatArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        float[] fArray = parcel.createFloatArray();
        parcel.setDataPosition(n4 += n3);
        return fArray;
    }

    public static ArrayList createFloatList(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        ArrayList<Float> arrayList = new ArrayList<Float>();
        int n7 = parcel.readInt();
        for (int i3 = 0; i3 < n7; ++i3) {
            float f5 = parcel.readFloat();
            Float f6 = Float.valueOf(f5);
            arrayList.add(f6);
        }
        parcel.setDataPosition(n4 += n3);
        return arrayList;
    }

    public static SparseArray createFloatSparseArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        SparseArray sparseArray = new SparseArray();
        int n7 = parcel.readInt();
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8 = parcel.readInt();
            float f5 = parcel.readFloat();
            Float f6 = Float.valueOf(f5);
            sparseArray.append(n8, (Object)f6);
        }
        parcel.setDataPosition(n4 += n3);
        return sparseArray;
    }

    public static IBinder[] createIBinderArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        IBinder[] iBinderArray = parcel.createBinderArray();
        parcel.setDataPosition(n4 += n3);
        return iBinderArray;
    }

    public static ArrayList createIBinderList(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        ArrayList arrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(n4 += n3);
        return arrayList;
    }

    public static SparseArray createIBinderSparseArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        int n7 = parcel.readInt();
        SparseArray sparseArray = new SparseArray(n7);
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8 = parcel.readInt();
            IBinder iBinder = parcel.readStrongBinder();
            sparseArray.append(n8, (Object)iBinder);
        }
        parcel.setDataPosition(n4 += n3);
        return sparseArray;
    }

    public static int[] createIntArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        int[] nArray = parcel.createIntArray();
        parcel.setDataPosition(n4 += n3);
        return nArray;
    }

    public static ArrayList createIntegerList(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n7 = parcel.readInt();
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8 = parcel.readInt();
            Integer n10 = n8;
            arrayList.add(n10);
        }
        parcel.setDataPosition(n4 += n3);
        return arrayList;
    }

    public static long[] createLongArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        long[] lArray = parcel.createLongArray();
        parcel.setDataPosition(n4 += n3);
        return lArray;
    }

    public static ArrayList createLongList(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        ArrayList<Long> arrayList = new ArrayList<Long>();
        int n7 = parcel.readInt();
        for (int i3 = 0; i3 < n7; ++i3) {
            long l2 = parcel.readLong();
            Long l3 = l2;
            arrayList.add(l3);
        }
        parcel.setDataPosition(n4 += n3);
        return arrayList;
    }

    public static Parcel createParcel(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        Parcel parcel2 = Parcel.obtain();
        parcel2.appendFrom(parcel, n4, n3);
        parcel.setDataPosition(n4 += n3);
        return parcel2;
    }

    public static Parcel[] createParcelArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        int n7 = parcel.readInt();
        Parcel[] parcelArray = new Parcel[n7];
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8 = parcel.readInt();
            if (n8 != 0) {
                int n10 = parcel.dataPosition();
                Parcel parcel2 = Parcel.obtain();
                parcel2.appendFrom(parcel, n10, n8);
                parcelArray[i3] = parcel2;
                parcel.setDataPosition(n10 += n8);
                continue;
            }
            parcelArray[i3] = null;
        }
        parcel.setDataPosition(n4 += n3);
        return parcelArray;
    }

    public static ArrayList createParcelList(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        int n7 = parcel.readInt();
        ArrayList<Parcel> arrayList = new ArrayList<Parcel>();
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8 = parcel.readInt();
            if (n8 != 0) {
                int n10 = parcel.dataPosition();
                Parcel parcel2 = Parcel.obtain();
                parcel2.appendFrom(parcel, n10, n8);
                arrayList.add(parcel2);
                parcel.setDataPosition(n10 += n8);
                continue;
            }
            arrayList.add(null);
        }
        parcel.setDataPosition(n4 += n3);
        return arrayList;
    }

    public static SparseArray createParcelSparseArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        int n7 = parcel.readInt();
        SparseArray sparseArray = new SparseArray();
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8 = parcel.readInt();
            int n10 = parcel.readInt();
            if (n10 != 0) {
                int n14 = parcel.dataPosition();
                Parcel parcel2 = Parcel.obtain();
                parcel2.appendFrom(parcel, n14, n10);
                sparseArray.append(n8, (Object)parcel2);
                parcel.setDataPosition(n14 += n10);
                continue;
            }
            sparseArray.append(n8, null);
        }
        parcel.setDataPosition(n4 += n3);
        return sparseArray;
    }

    public static Parcelable createParcelable(Parcel parcel, int n3, Parcelable.Creator creator) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        creator = (Parcelable)creator.createFromParcel(parcel);
        parcel.setDataPosition(n4 += n3);
        return creator;
    }

    public static SparseBooleanArray createSparseBooleanArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(n4 += n3);
        return sparseBooleanArray;
    }

    public static SparseIntArray createSparseIntArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        int n7 = parcel.readInt();
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8 = parcel.readInt();
            int n10 = parcel.readInt();
            sparseIntArray.append(n8, n10);
        }
        parcel.setDataPosition(n4 += n3);
        return sparseIntArray;
    }

    public static SparseLongArray createSparseLongArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        SparseLongArray sparseLongArray = new SparseLongArray();
        int n7 = parcel.readInt();
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8 = parcel.readInt();
            long l2 = parcel.readLong();
            sparseLongArray.append(n8, l2);
        }
        parcel.setDataPosition(n4 += n3);
        return sparseLongArray;
    }

    public static String createString(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        String string2 = parcel.readString();
        parcel.setDataPosition(n4 += n3);
        return string2;
    }

    public static String[] createStringArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        String[] stringArray = parcel.createStringArray();
        parcel.setDataPosition(n4 += n3);
        return stringArray;
    }

    public static ArrayList createStringList(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        ArrayList arrayList = parcel.createStringArrayList();
        parcel.setDataPosition(n4 += n3);
        return arrayList;
    }

    public static SparseArray createStringSparseArray(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        SparseArray sparseArray = new SparseArray();
        int n7 = parcel.readInt();
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8 = parcel.readInt();
            String string2 = parcel.readString();
            sparseArray.append(n8, (Object)string2);
        }
        parcel.setDataPosition(n4 += n3);
        return sparseArray;
    }

    public static Object[] createTypedArray(Parcel parcel, int n3, Parcelable.Creator objectArray) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        objectArray = parcel.createTypedArray((Parcelable.Creator)objectArray);
        parcel.setDataPosition(n4 += n3);
        return objectArray;
    }

    public static ArrayList createTypedList(Parcel parcel, int n3, Parcelable.Creator object) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        object = parcel.createTypedArrayList(object);
        parcel.setDataPosition(n4 += n3);
        return object;
    }

    public static SparseArray createTypedSparseArray(Parcel parcel, int n3, Parcelable.Creator creator) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        int n7 = parcel.readInt();
        SparseArray sparseArray = new SparseArray();
        for (int i3 = 0; i3 < n7; ++i3) {
            Object object;
            int n8 = parcel.readInt();
            int n10 = parcel.readInt();
            if (n10 != 0) {
                object = creator.createFromParcel(parcel);
            } else {
                n10 = 0;
                object = null;
            }
            sparseArray.append(n8, object);
        }
        parcel.setDataPosition(n4 += n3);
        return sparseArray;
    }

    public static void ensureAtEnd(Parcel parcel, int n3) {
        int n4 = parcel.dataPosition();
        if (n4 == n3) {
            return;
        }
        String string2 = hj0_0.a(n3, "Overread allowed size end=");
        SafeParcelReader$ParseException safeParcelReader$ParseException = new SafeParcelReader$ParseException(string2, parcel);
        throw safeParcelReader$ParseException;
    }

    public static int getFieldId(int n3) {
        return (char)n3;
    }

    public static boolean readBoolean(Parcel parcel, int n3) {
        int n4 = 4;
        SafeParcelReader.zzb(parcel, n3, n4);
        int n7 = parcel.readInt();
        return n7 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static Boolean readBooleanObject(Parcel parcel, int n3) {
        void var4_7;
        int n4 = SafeParcelReader.readSize(parcel, n3);
        if (n4 == 0) {
            return null;
        }
        int n7 = 4;
        SafeParcelReader.zza(parcel, n3, n4, n7);
        int bl2 = parcel.readInt();
        if (bl2 != 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            parcel = null;
        }
        return (boolean)var4_7;
    }

    public static byte readByte(Parcel parcel, int n3) {
        SafeParcelReader.zzb(parcel, n3, 4);
        return (byte)parcel.readInt();
    }

    public static char readChar(Parcel parcel, int n3) {
        SafeParcelReader.zzb(parcel, n3, 4);
        return (char)parcel.readInt();
    }

    public static double readDouble(Parcel parcel, int n3) {
        SafeParcelReader.zzb(parcel, n3, 8);
        return parcel.readDouble();
    }

    public static Double readDoubleObject(Parcel parcel, int n3) {
        int n4 = SafeParcelReader.readSize(parcel, n3);
        if (n4 == 0) {
            return null;
        }
        SafeParcelReader.zza(parcel, n3, n4, 8);
        return parcel.readDouble();
    }

    public static float readFloat(Parcel parcel, int n3) {
        SafeParcelReader.zzb(parcel, n3, 4);
        return parcel.readFloat();
    }

    public static Float readFloatObject(Parcel parcel, int n3) {
        int n4 = SafeParcelReader.readSize(parcel, n3);
        if (n4 == 0) {
            return null;
        }
        SafeParcelReader.zza(parcel, n3, n4, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int readHeader(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder readIBinder(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        IBinder iBinder = parcel.readStrongBinder();
        parcel.setDataPosition(n4 += n3);
        return iBinder;
    }

    public static int readInt(Parcel parcel, int n3) {
        SafeParcelReader.zzb(parcel, n3, 4);
        return parcel.readInt();
    }

    public static Integer readIntegerObject(Parcel parcel, int n3) {
        int n4 = SafeParcelReader.readSize(parcel, n3);
        if (n4 == 0) {
            return null;
        }
        SafeParcelReader.zza(parcel, n3, n4, 4);
        return parcel.readInt();
    }

    public static void readList(Parcel parcel, int n3, List list, ClassLoader classLoader) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(n4 += n3);
    }

    public static long readLong(Parcel parcel, int n3) {
        SafeParcelReader.zzb(parcel, n3, 8);
        return parcel.readLong();
    }

    public static Long readLongObject(Parcel parcel, int n3) {
        int n4 = SafeParcelReader.readSize(parcel, n3);
        if (n4 == 0) {
            return null;
        }
        SafeParcelReader.zza(parcel, n3, n4, 8);
        return parcel.readLong();
    }

    public static PendingIntent readPendingIntent(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        PendingIntent pendingIntent = PendingIntent.readPendingIntentOrNullFromParcel((Parcel)parcel);
        parcel.setDataPosition(n4 += n3);
        return pendingIntent;
    }

    public static short readShort(Parcel parcel, int n3) {
        SafeParcelReader.zzb(parcel, n3, 4);
        return (short)parcel.readInt();
    }

    public static int readSize(Parcel parcel, int n3) {
        int n4 = -65536;
        int n7 = n3 & n4;
        if (n7 != n4) {
            return (char)(n3 >> 16);
        }
        return parcel.readInt();
    }

    public static void skipUnknownField(Parcel parcel, int n3) {
        n3 = SafeParcelReader.readSize(parcel, n3);
        int n4 = parcel.dataPosition() + n3;
        parcel.setDataPosition(n4);
    }

    public static int validateObjectHeader(Parcel parcel) {
        int n3 = SafeParcelReader.readHeader(parcel);
        int n4 = SafeParcelReader.readSize(parcel, n3);
        int n7 = SafeParcelReader.getFieldId(n3);
        int n8 = parcel.dataPosition();
        int n10 = 20293;
        if (n7 == n10) {
            if ((n4 += n8) >= n8 && n4 <= (n3 = parcel.dataSize())) {
                return n4;
            }
            String string2 = D70.b(n8, n4, "Size read is invalid start=", " end=");
            SafeParcelReader$ParseException safeParcelReader$ParseException = new SafeParcelReader$ParseException(string2, parcel);
            throw safeParcelReader$ParseException;
        }
        String string3 = String.valueOf(Integer.toHexString(n3));
        string3 = "Expected object header. Got 0x".concat(string3);
        SafeParcelReader$ParseException safeParcelReader$ParseException = new SafeParcelReader$ParseException(string3, parcel);
        throw safeParcelReader$ParseException;
    }

    private static void zza(Parcel parcel, int n3, int n4, int n7) {
        if (n4 == n7) {
            return;
        }
        String string2 = Integer.toHexString(n4);
        String string3 = h30_0.a(fQ2.a("Expected size ", " got ", " (0x", n7, n4), string2, ")");
        SafeParcelReader$ParseException safeParcelReader$ParseException = new SafeParcelReader$ParseException(string3, parcel);
        throw safeParcelReader$ParseException;
    }

    private static void zzb(Parcel parcel, int n3, int n4) {
        if ((n3 = SafeParcelReader.readSize(parcel, n3)) == n4) {
            return;
        }
        String string2 = Integer.toHexString(n3);
        String string3 = h30_0.a(fQ2.a("Expected size ", " got ", " (0x", n4, n3), string2, ")");
        SafeParcelReader$ParseException safeParcelReader$ParseException = new SafeParcelReader$ParseException(string3, parcel);
        throw safeParcelReader$ParseException;
    }
}

