/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.SparseArray
 */
package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.common.server.response.zan;
import com.google.android.gms.common.server.response.zaq;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SafeParcelResponse
extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR;
    private final int zaa;
    private final Parcel zab;
    private final int zac;
    private final zan zad;
    private final String zae;
    private int zaf;
    private int zag;

    static {
        zaq zaq2 = new zaq();
        CREATOR = zaq2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public SafeParcelResponse(int n3, Parcel object, zan zan2) {
        void var2_4;
        void var3_6;
        Parcel parcel;
        this.zaa = n3;
        this.zab = parcel = (Parcel)Preconditions.checkNotNull(object);
        this.zac = n3 = 2;
        this.zad = var3_6;
        if (var3_6 == null) {
            Object var2_3 = null;
        } else {
            String string2 = var3_6.zaa();
        }
        this.zae = var2_4;
        this.zaf = n3;
    }

    private SafeParcelResponse(SafeParcelable object, zan zan2, String string2) {
        Parcel parcel;
        int n3;
        this.zaa = n3 = 1;
        this.zab = parcel = Parcel.obtain();
        object.writeToParcel(parcel, 0);
        this.zac = n3;
        object = (zan)Preconditions.checkNotNull(zan2);
        this.zad = object;
        this.zae = object = (String)Preconditions.checkNotNull(string2);
        this.zaf = 2;
    }

    public SafeParcelResponse(zan object, String string2) {
        Parcel parcel;
        this.zaa = 1;
        this.zab = parcel = Parcel.obtain();
        this.zac = 0;
        object = (zan)Preconditions.checkNotNull(object);
        this.zad = object;
        this.zae = object = (String)Preconditions.checkNotNull(string2);
        this.zaf = 0;
    }

    public static SafeParcelResponse from(FastJsonResponse object) {
        String string2 = (String)Preconditions.checkNotNull(object.getClass().getCanonicalName());
        Object object2 = object.getClass();
        zan zan2 = new zan((Class)object2);
        SafeParcelResponse.zaF(zan2, (FastJsonResponse)object);
        zan2.zac();
        zan2.zad();
        object = (SafeParcelable)object;
        object2 = new SafeParcelResponse((SafeParcelable)object, zan2, string2);
        return object2;
    }

    private static void zaF(zan zan2, FastJsonResponse object) {
        Class clazz = object.getClass();
        boolean bl2 = zan2.zaf(clazz);
        if (!bl2) {
            object = ((FastJsonResponse)object).getFieldMappings();
            zan2.zae(clazz, (Map)object);
            clazz = object.keySet().iterator();
            while (bl2 = clazz.hasNext()) {
                InstantiationException instantiationException2;
                Object object2;
                block8: {
                    object2 = (String)clazz.next();
                    object2 = (FastJsonResponse$Field)object.get(object2);
                    Object object3 = ((FastJsonResponse$Field)object2).zag;
                    if (object3 == null) continue;
                    object3 = ((Class)object3).newInstance();
                    object3 = (FastJsonResponse)object3;
                    try {
                        SafeParcelResponse.zaF(zan2, (FastJsonResponse)object3);
                        continue;
                    }
                    catch (IllegalAccessException illegalAccessException) {
                    }
                    catch (InstantiationException instantiationException2) {
                        break block8;
                    }
                    object = ((FastJsonResponse$Field)object2).zag;
                    object = String.valueOf(((Class)Preconditions.checkNotNull(object)).getCanonicalName());
                    object = "Could not access object of type ".concat((String)object);
                    clazz = new IllegalStateException((String)object, illegalAccessException);
                    throw clazz;
                }
                object = ((FastJsonResponse$Field)object2).zag;
                object = String.valueOf(((Class)Preconditions.checkNotNull(object)).getCanonicalName());
                object = "Could not instantiate an object of type ".concat((String)object);
                clazz = new IllegalStateException((String)object, instantiationException2);
                throw clazz;
            }
        }
    }

    private final void zaG(FastJsonResponse$Field object) {
        int n3 = ((FastJsonResponse$Field)object).zaf;
        int n4 = -1;
        if (n3 != n4) {
            object = this.zab;
            if (object != null) {
                n4 = this.zaf;
                int n7 = 1;
                if (n4 != 0) {
                    if (n4 == n7) {
                        return;
                    }
                    object = new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                    throw object;
                }
                this.zag = n3 = SafeParcelWriter.beginObjectHeader((Parcel)object);
                this.zaf = n7;
                return;
            }
            object = new IllegalStateException("Internal Parcel object is null.");
            throw object;
        }
        object = new IllegalStateException("Field does not have a valid safe parcelable field id.");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void zaH(StringBuilder serializable, Map object, Parcel parcel) {
        int n3;
        int n4;
        Map.Entry entry;
        boolean bl2;
        SparseArray sparseArray = new SparseArray();
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            entry = object.next();
            FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field)entry.getValue();
            n4 = fastJsonResponse$Field.getSafeParcelableFieldId();
            sparseArray.put(n4, entry);
        }
        ((StringBuilder)serializable).append('{');
        int n7 = SafeParcelReader.validateObjectHeader(parcel);
        bl2 = false;
        entry = null;
        n4 = 0;
        float f5 = 0.0f;
        Object var7_8 = null;
        while ((n3 = parcel.dataPosition()) < n7) {
            long l2;
            double d2;
            Object object2;
            int n8;
            Iterator iterator;
            n3 = SafeParcelReader.readHeader(parcel);
            int n10 = SafeParcelReader.getFieldId(n3);
            Object object3 = (Map.Entry)sparseArray.get(n10);
            if (object3 == null) continue;
            Object object4 = ",";
            if (n4 != 0) {
                ((StringBuilder)serializable).append((String)object4);
            }
            String string2 = (String)object3.getKey();
            object3 = (FastJsonResponse$Field)object3.getValue();
            String string3 = "\"";
            ((StringBuilder)serializable).append(string3);
            ((StringBuilder)serializable).append(string2);
            String string4 = "\":";
            ((StringBuilder)serializable).append(string4);
            n4 = (int)(((FastJsonResponse$Field)object3).zaj() ? 1 : 0);
            if (n4 != 0) {
                n4 = ((FastJsonResponse$Field)object3).zac;
                switch (n4) {
                    default: {
                        object = hj0_0.a(n4, "Unknown field out type = ");
                        serializable = new IllegalArgumentException((String)object);
                        throw serializable;
                    }
                    case 11: {
                        serializable = new IllegalArgumentException("Method does not accept concrete type.");
                        throw serializable;
                    }
                    case 10: {
                        Bundle bundle = SafeParcelReader.createBundle(parcel, n3);
                        iterator = new Iterator();
                        object4 = bundle.keySet().iterator();
                        while ((n8 = object4.hasNext()) != 0) {
                            string3 = (String)object4.next();
                            object2 = (String)Preconditions.checkNotNull(bundle.getString(string3));
                            ((HashMap)((Object)iterator)).put(string3, object2);
                        }
                        Object object5 = FastJsonResponse.zaD((FastJsonResponse$Field)object3, iterator);
                        SafeParcelResponse.zaJ((StringBuilder)serializable, (FastJsonResponse$Field)object3, object5);
                        break;
                    }
                    case 8: 
                    case 9: {
                        byte[] byArray = SafeParcelReader.createByteArray(parcel, n3);
                        Object object6 = FastJsonResponse.zaD((FastJsonResponse$Field)object3, byArray);
                        SafeParcelResponse.zaJ((StringBuilder)serializable, (FastJsonResponse$Field)object3, object6);
                        break;
                    }
                    case 7: {
                        String string5 = SafeParcelReader.createString(parcel, n3);
                        Object object7 = FastJsonResponse.zaD((FastJsonResponse$Field)object3, string5);
                        SafeParcelResponse.zaJ((StringBuilder)serializable, (FastJsonResponse$Field)object3, object7);
                        break;
                    }
                    case 6: {
                        n4 = (int)(SafeParcelReader.readBoolean(parcel, n3) ? 1 : 0);
                        Boolean bl3 = n4 != 0;
                        Object object8 = FastJsonResponse.zaD((FastJsonResponse$Field)object3, bl3);
                        SafeParcelResponse.zaJ((StringBuilder)serializable, (FastJsonResponse$Field)object3, object8);
                        break;
                    }
                    case 5: {
                        BigDecimal bigDecimal = SafeParcelReader.createBigDecimal(parcel, n3);
                        Object object9 = FastJsonResponse.zaD((FastJsonResponse$Field)object3, bigDecimal);
                        SafeParcelResponse.zaJ((StringBuilder)serializable, (FastJsonResponse$Field)object3, object9);
                        break;
                    }
                    case 4: {
                        d2 = SafeParcelReader.readDouble(parcel, n3);
                        Double d5 = d2;
                        Object object10 = FastJsonResponse.zaD((FastJsonResponse$Field)object3, d5);
                        SafeParcelResponse.zaJ((StringBuilder)serializable, (FastJsonResponse$Field)object3, object10);
                        break;
                    }
                    case 3: {
                        f5 = SafeParcelReader.readFloat(parcel, n3);
                        Float f6 = Float.valueOf(f5);
                        Object object11 = FastJsonResponse.zaD((FastJsonResponse$Field)object3, f6);
                        SafeParcelResponse.zaJ((StringBuilder)serializable, (FastJsonResponse$Field)object3, object11);
                        break;
                    }
                    case 2: {
                        l2 = SafeParcelReader.readLong(parcel, n3);
                        Long l3 = l2;
                        Object object12 = FastJsonResponse.zaD((FastJsonResponse$Field)object3, l3);
                        SafeParcelResponse.zaJ((StringBuilder)serializable, (FastJsonResponse$Field)object3, object12);
                        break;
                    }
                    case 1: {
                        BigInteger bigInteger = SafeParcelReader.createBigInteger(parcel, n3);
                        Object object13 = FastJsonResponse.zaD((FastJsonResponse$Field)object3, bigInteger);
                        SafeParcelResponse.zaJ((StringBuilder)serializable, (FastJsonResponse$Field)object3, object13);
                        break;
                    }
                    case 0: {
                        n4 = SafeParcelReader.readInt(parcel, n3);
                        Integer n14 = n4;
                        Object object14 = FastJsonResponse.zaD((FastJsonResponse$Field)object3, n14);
                        SafeParcelResponse.zaJ((StringBuilder)serializable, (FastJsonResponse$Field)object3, object14);
                        break;
                    }
                }
            } else {
                n4 = (int)(((FastJsonResponse$Field)object3).zad ? 1 : 0);
                if (n4 != 0) {
                    String string6 = "[";
                    ((StringBuilder)serializable).append(string6);
                    n4 = ((FastJsonResponse$Field)object3).zac;
                    switch (n4) {
                        default: {
                            serializable = new IllegalStateException("Unknown field type out.");
                            throw serializable;
                        }
                        case 11: {
                            Parcel[] parcelArray = SafeParcelReader.createParcelArray(parcel, n3);
                            n3 = parcelArray.length;
                            string3 = null;
                            for (n8 = 0; n8 < n3; ++n8) {
                                if (n8 > 0) {
                                    ((StringBuilder)serializable).append((String)object4);
                                }
                                parcelArray[n8].setDataPosition(0);
                                object2 = ((FastJsonResponse$Field)object3).zah();
                                Parcel parcel2 = parcelArray[n8];
                                this.zaH((StringBuilder)serializable, (Map)object2, parcel2);
                            }
                            break;
                        }
                        case 8: 
                        case 9: 
                        case 10: {
                            serializable = new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            throw serializable;
                        }
                        case 7: {
                            String[] stringArray = SafeParcelReader.createStringArray(parcel, n3);
                            ArrayUtils.writeStringArray((StringBuilder)serializable, stringArray);
                            break;
                        }
                        case 6: {
                            boolean[] blArray = SafeParcelReader.createBooleanArray(parcel, n3);
                            ArrayUtils.writeArray((StringBuilder)serializable, blArray);
                            break;
                        }
                        case 5: {
                            Object[] objectArray = SafeParcelReader.createBigDecimalArray(parcel, n3);
                            ArrayUtils.writeArray((StringBuilder)serializable, objectArray);
                            break;
                        }
                        case 4: {
                            double[] dArray = SafeParcelReader.createDoubleArray(parcel, n3);
                            ArrayUtils.writeArray((StringBuilder)serializable, dArray);
                            break;
                        }
                        case 3: {
                            float[] fArray = SafeParcelReader.createFloatArray(parcel, n3);
                            ArrayUtils.writeArray((StringBuilder)serializable, fArray);
                            break;
                        }
                        case 2: {
                            long[] lArray = SafeParcelReader.createLongArray(parcel, n3);
                            ArrayUtils.writeArray((StringBuilder)serializable, lArray);
                            break;
                        }
                        case 1: {
                            Object[] objectArray = SafeParcelReader.createBigIntegerArray(parcel, n3);
                            ArrayUtils.writeArray((StringBuilder)serializable, objectArray);
                            break;
                        }
                        case 0: {
                            int[] nArray = SafeParcelReader.createIntArray(parcel, n3);
                            ArrayUtils.writeArray((StringBuilder)serializable, nArray);
                        }
                    }
                    String string7 = "]";
                    ((StringBuilder)serializable).append(string7);
                } else {
                    n4 = ((FastJsonResponse$Field)object3).zac;
                    switch (n4) {
                        default: {
                            serializable = new IllegalStateException("Unknown field type out");
                            throw serializable;
                        }
                        case 11: {
                            Parcel parcel3 = SafeParcelReader.createParcel(parcel, n3);
                            parcel3.setDataPosition(0);
                            iterator = ((FastJsonResponse$Field)object3).zah();
                            this.zaH((StringBuilder)serializable, (Map)((Object)iterator), parcel3);
                            break;
                        }
                        case 10: {
                            boolean bl4;
                            Bundle bundle = SafeParcelReader.createBundle(parcel, n3);
                            iterator = bundle.keySet();
                            object3 = "{";
                            ((StringBuilder)serializable).append((String)object3);
                            iterator = iterator.iterator();
                            n10 = 1;
                            while (bl4 = iterator.hasNext()) {
                                object2 = (String)iterator.next();
                                if (n10 == 0) {
                                    ((StringBuilder)serializable).append((String)object4);
                                }
                                ((StringBuilder)serializable).append(string3);
                                ((StringBuilder)serializable).append((String)object2);
                                ((StringBuilder)serializable).append("\":\"");
                                object3 = JsonUtils.escapeString(bundle.getString((String)object2));
                                ((StringBuilder)serializable).append((String)object3);
                                ((StringBuilder)serializable).append(string3);
                                n10 = 0;
                                object3 = null;
                            }
                            String string8 = "}";
                            ((StringBuilder)serializable).append(string8);
                            break;
                        }
                        case 9: {
                            byte[] byArray = SafeParcelReader.createByteArray(parcel, n3);
                            ((StringBuilder)serializable).append(string3);
                            String string9 = Base64Utils.encodeUrlSafe(byArray);
                            ((StringBuilder)serializable).append(string9);
                            ((StringBuilder)serializable).append(string3);
                            break;
                        }
                        case 8: {
                            byte[] byArray = SafeParcelReader.createByteArray(parcel, n3);
                            ((StringBuilder)serializable).append(string3);
                            String string10 = Base64Utils.encode(byArray);
                            ((StringBuilder)serializable).append(string10);
                            ((StringBuilder)serializable).append(string3);
                            break;
                        }
                        case 7: {
                            String string11 = SafeParcelReader.createString(parcel, n3);
                            ((StringBuilder)serializable).append(string3);
                            String string12 = JsonUtils.escapeString(string11);
                            ((StringBuilder)serializable).append(string12);
                            ((StringBuilder)serializable).append(string3);
                            break;
                        }
                        case 6: {
                            n4 = (int)(SafeParcelReader.readBoolean(parcel, n3) ? 1 : 0);
                            ((StringBuilder)serializable).append(n4 != 0);
                            break;
                        }
                        case 5: {
                            BigDecimal bigDecimal = SafeParcelReader.createBigDecimal(parcel, n3);
                            ((StringBuilder)serializable).append(bigDecimal);
                            break;
                        }
                        case 4: {
                            d2 = SafeParcelReader.readDouble(parcel, n3);
                            ((StringBuilder)serializable).append(d2);
                            break;
                        }
                        case 3: {
                            f5 = SafeParcelReader.readFloat(parcel, n3);
                            ((StringBuilder)serializable).append(f5);
                            break;
                        }
                        case 2: {
                            l2 = SafeParcelReader.readLong(parcel, n3);
                            ((StringBuilder)serializable).append(l2);
                            break;
                        }
                        case 1: {
                            BigInteger bigInteger = SafeParcelReader.createBigInteger(parcel, n3);
                            ((StringBuilder)serializable).append(bigInteger);
                            break;
                        }
                        case 0: {
                            n4 = SafeParcelReader.readInt(parcel, n3);
                            ((StringBuilder)serializable).append(n4);
                        }
                    }
                }
            }
            n4 = 1;
            f5 = Float.MIN_VALUE;
        }
        int n15 = parcel.dataPosition();
        if (n15 == n7) {
            ((StringBuilder)serializable).append('}');
            return;
        }
        object = hj0_0.a(n7, "Overread allowed size end=");
        serializable = new SafeParcelReader$ParseException((String)object, parcel);
        throw serializable;
    }

    private static final void zaI(StringBuilder serializable, int n3, Object object) {
        String string2 = "\"";
        switch (n3) {
            default: {
                String string3 = hj0_0.a(n3, "Unknown type = ");
                serializable = new IllegalArgumentException(string3);
                throw serializable;
            }
            case 11: {
                serializable = new IllegalArgumentException("Method does not accept concrete type.");
                throw serializable;
            }
            case 10: {
                HashMap hashMap = (HashMap)Preconditions.checkNotNull(object);
                MapUtils.writeStringMapToJson((StringBuilder)serializable, hashMap);
                return;
            }
            case 9: {
                ((StringBuilder)serializable).append(string2);
                String string4 = Base64Utils.encodeUrlSafe((byte[])object);
                ((StringBuilder)serializable).append(string4);
                ((StringBuilder)serializable).append(string2);
                return;
            }
            case 8: {
                ((StringBuilder)serializable).append(string2);
                String string5 = Base64Utils.encode((byte[])object);
                ((StringBuilder)serializable).append(string5);
                ((StringBuilder)serializable).append(string2);
                return;
            }
            case 7: {
                ((StringBuilder)serializable).append(string2);
                String string6 = JsonUtils.escapeString(Preconditions.checkNotNull(object).toString());
                ((StringBuilder)serializable).append(string6);
                ((StringBuilder)serializable).append(string2);
                return;
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
        }
        ((StringBuilder)serializable).append(object);
    }

    private static final void zaJ(StringBuilder stringBuilder, FastJsonResponse$Field fastJsonResponse$Field, Object object) {
        int n3 = fastJsonResponse$Field.zab;
        if (n3 != 0) {
            object = (ArrayList)object;
            String string2 = "[";
            stringBuilder.append(string2);
            n3 = ((ArrayList)object).size();
            for (int i3 = 0; i3 < n3; ++i3) {
                if (i3 != 0) {
                    String string3 = ",";
                    stringBuilder.append(string3);
                }
                int n4 = fastJsonResponse$Field.zaa;
                Object e2 = ((ArrayList)object).get(i3);
                SafeParcelResponse.zaI(stringBuilder, n4, e2);
            }
            stringBuilder.append("]");
            return;
        }
        int n7 = fastJsonResponse$Field.zaa;
        SafeParcelResponse.zaI(stringBuilder, n7, object);
    }

    public final void addConcreteTypeArrayInternal(FastJsonResponse$Field fastJsonResponse$Field, String arrayList, ArrayList arrayList2) {
        this.zaG(fastJsonResponse$Field);
        arrayList = new ArrayList<Parcel>();
        ArrayList arrayList3 = (ArrayList)Preconditions.checkNotNull(arrayList2);
        arrayList3.size();
        int n3 = arrayList2.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Parcel parcel = ((SafeParcelResponse)((FastJsonResponse)arrayList2.get(i3))).zaE();
            arrayList.add(parcel);
        }
        arrayList2 = this.zab;
        int n4 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeParcelList((Parcel)arrayList2, n4, arrayList, true);
    }

    public final void addConcreteTypeInternal(FastJsonResponse$Field fastJsonResponse$Field, String string2, FastJsonResponse fastJsonResponse) {
        this.zaG(fastJsonResponse$Field);
        string2 = ((SafeParcelResponse)fastJsonResponse).zaE();
        fastJsonResponse = this.zab;
        int n3 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeParcel((Parcel)fastJsonResponse, n3, (Parcel)string2, true);
    }

    public final Map getFieldMappings() {
        zan zan2 = this.zad;
        if (zan2 == null) {
            return null;
        }
        String string2 = (String)Preconditions.checkNotNull(this.zae);
        return zan2.zab(string2);
    }

    public final Object getValueObject(String object) {
        object = new UnsupportedOperationException("Converting to JSON does not require this method.");
        throw object;
    }

    public final boolean isPrimitiveFieldSet(String object) {
        object = new UnsupportedOperationException("Converting to JSON does not require this method.");
        throw object;
    }

    public final void setBooleanInternal(FastJsonResponse$Field fastJsonResponse$Field, String string2, boolean bl2) {
        this.zaG(fastJsonResponse$Field);
        string2 = this.zab;
        int n3 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeBoolean((Parcel)string2, n3, bl2);
    }

    public final void setDecodedBytesInternal(FastJsonResponse$Field fastJsonResponse$Field, String string2, byte[] byArray) {
        this.zaG(fastJsonResponse$Field);
        string2 = this.zab;
        int n3 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeByteArray((Parcel)string2, n3, byArray, true);
    }

    public final void setIntegerInternal(FastJsonResponse$Field fastJsonResponse$Field, String string2, int n3) {
        this.zaG(fastJsonResponse$Field);
        string2 = this.zab;
        int n4 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeInt((Parcel)string2, n4, n3);
    }

    public final void setLongInternal(FastJsonResponse$Field fastJsonResponse$Field, String string2, long l2) {
        this.zaG(fastJsonResponse$Field);
        string2 = this.zab;
        int n3 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeLong((Parcel)string2, n3, l2);
    }

    public final void setStringInternal(FastJsonResponse$Field fastJsonResponse$Field, String string2, String string3) {
        this.zaG(fastJsonResponse$Field);
        string2 = this.zab;
        int n3 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeString((Parcel)string2, n3, string3, true);
    }

    public final void setStringMapInternal(FastJsonResponse$Field fastJsonResponse$Field, String string2, Map map2) {
        boolean bl2;
        this.zaG(fastJsonResponse$Field);
        string2 = new Bundle();
        Iterator iterator = ((Map)Preconditions.checkNotNull(map2)).keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string3 = (String)iterator.next();
            String string4 = (String)map2.get(string3);
            string2.putString(string3, string4);
        }
        map2 = this.zab;
        int n3 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeBundle((Parcel)map2, n3, (Bundle)string2, true);
    }

    public final void setStringsInternal(FastJsonResponse$Field fastJsonResponse$Field, String object, ArrayList arrayList) {
        this.zaG(fastJsonResponse$Field);
        object = (ArrayList)Preconditions.checkNotNull(arrayList);
        int n3 = ((ArrayList)object).size();
        String[] stringArray = new String[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2;
            stringArray[i3] = string2 = (String)arrayList.get(i3);
        }
        object = this.zab;
        int n4 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeStringArray((Parcel)object, n4, stringArray, true);
    }

    public final String toString() {
        Preconditions.checkNotNull(this.zad, "Cannot convert to JSON on client side.");
        Parcel parcel = this.zaE();
        parcel.setDataPosition(0);
        StringBuilder stringBuilder = new StringBuilder(100);
        Object object = (String)Preconditions.checkNotNull(this.zae);
        object = (Map)Preconditions.checkNotNull(this.zad.zab((String)object));
        this.zaH(stringBuilder, (Map)object, parcel);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = this.zaa;
        int n7 = SafeParcelWriter.beginObjectHeader(parcel);
        int n8 = 1;
        SafeParcelWriter.writeInt(parcel, n8, n4);
        Object object = this.zaE();
        int n10 = 2;
        SafeParcelWriter.writeParcel(parcel, n10, object, false);
        n4 = this.zac;
        if (n4 != 0) {
            object = n4 != n8 ? this.zad : this.zad;
        } else {
            n4 = 0;
            object = null;
        }
        SafeParcelWriter.writeParcelable(parcel, 3, (Parcelable)object, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n7);
    }

    public final Parcel zaE() {
        int n3 = this.zaf;
        int n4 = 2;
        if (n3 != 0) {
            int n7 = 1;
            if (n3 == n7) {
                Parcel parcel = this.zab;
                n7 = this.zag;
                SafeParcelWriter.finishObjectHeader(parcel, n7);
                this.zaf = n4;
            }
        } else {
            Parcel parcel = this.zab;
            this.zag = n3 = SafeParcelWriter.beginObjectHeader(parcel);
            Parcel parcel2 = this.zab;
            SafeParcelWriter.finishObjectHeader(parcel2, n3);
            this.zaf = n4;
        }
        return this.zab;
    }

    public final void zab(FastJsonResponse$Field fastJsonResponse$Field, String string2, BigDecimal bigDecimal) {
        this.zaG(fastJsonResponse$Field);
        string2 = this.zab;
        int n3 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeBigDecimal((Parcel)string2, n3, bigDecimal, true);
    }

    public final void zad(FastJsonResponse$Field fastJsonResponse$Field, String object, ArrayList arrayList) {
        this.zaG(fastJsonResponse$Field);
        object = (ArrayList)Preconditions.checkNotNull(arrayList);
        int n3 = ((ArrayList)object).size();
        BigDecimal[] bigDecimalArray = new BigDecimal[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            BigDecimal bigDecimal;
            bigDecimalArray[i3] = bigDecimal = (BigDecimal)arrayList.get(i3);
        }
        object = this.zab;
        int n4 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeBigDecimalArray((Parcel)object, n4, bigDecimalArray, true);
    }

    public final void zaf(FastJsonResponse$Field fastJsonResponse$Field, String string2, BigInteger bigInteger) {
        this.zaG(fastJsonResponse$Field);
        string2 = this.zab;
        int n3 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeBigInteger((Parcel)string2, n3, bigInteger, true);
    }

    public final void zah(FastJsonResponse$Field fastJsonResponse$Field, String object, ArrayList arrayList) {
        this.zaG(fastJsonResponse$Field);
        object = (ArrayList)Preconditions.checkNotNull(arrayList);
        int n3 = ((ArrayList)object).size();
        BigInteger[] bigIntegerArray = new BigInteger[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            BigInteger bigInteger;
            bigIntegerArray[i3] = bigInteger = (BigInteger)arrayList.get(i3);
        }
        object = this.zab;
        int n4 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeBigIntegerArray((Parcel)object, n4, bigIntegerArray, true);
    }

    public final void zak(FastJsonResponse$Field fastJsonResponse$Field, String object, ArrayList arrayList) {
        this.zaG(fastJsonResponse$Field);
        object = (ArrayList)Preconditions.checkNotNull(arrayList);
        int n3 = ((ArrayList)object).size();
        boolean[] blArray = new boolean[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            Boolean bl3 = (Boolean)arrayList.get(i3);
            blArray[i3] = bl2 = bl3.booleanValue();
        }
        object = this.zab;
        int n4 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeBooleanArray((Parcel)object, n4, blArray, true);
    }

    public final void zan(FastJsonResponse$Field fastJsonResponse$Field, String string2, double d2) {
        this.zaG(fastJsonResponse$Field);
        string2 = this.zab;
        int n3 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeDouble((Parcel)string2, n3, d2);
    }

    public final void zap(FastJsonResponse$Field fastJsonResponse$Field, String object, ArrayList arrayList) {
        this.zaG(fastJsonResponse$Field);
        object = (ArrayList)Preconditions.checkNotNull(arrayList);
        int n3 = ((ArrayList)object).size();
        double[] dArray = new double[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            double d2;
            Double d5 = (Double)arrayList.get(i3);
            dArray[i3] = d2 = d5.doubleValue();
        }
        object = this.zab;
        int n4 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeDoubleArray((Parcel)object, n4, dArray, true);
    }

    public final void zar(FastJsonResponse$Field fastJsonResponse$Field, String string2, float f5) {
        this.zaG(fastJsonResponse$Field);
        string2 = this.zab;
        int n3 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeFloat((Parcel)string2, n3, f5);
    }

    public final void zat(FastJsonResponse$Field fastJsonResponse$Field, String object, ArrayList arrayList) {
        this.zaG(fastJsonResponse$Field);
        object = (ArrayList)Preconditions.checkNotNull(arrayList);
        int n3 = ((ArrayList)object).size();
        float[] fArray = new float[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            float f5;
            Float f6 = (Float)arrayList.get(i3);
            fArray[i3] = f5 = f6.floatValue();
        }
        object = this.zab;
        int n4 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeFloatArray((Parcel)object, n4, fArray, true);
    }

    public final void zaw(FastJsonResponse$Field fastJsonResponse$Field, String object, ArrayList arrayList) {
        this.zaG(fastJsonResponse$Field);
        object = (ArrayList)Preconditions.checkNotNull(arrayList);
        int n3 = ((ArrayList)object).size();
        int[] nArray = new int[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            Integer n7 = (Integer)arrayList.get(i3);
            nArray[i3] = n4 = n7.intValue();
        }
        object = this.zab;
        int n8 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeIntArray((Parcel)object, n8, nArray, true);
    }

    public final void zaz(FastJsonResponse$Field fastJsonResponse$Field, String object, ArrayList arrayList) {
        this.zaG(fastJsonResponse$Field);
        object = (ArrayList)Preconditions.checkNotNull(arrayList);
        int n3 = ((ArrayList)object).size();
        long[] lArray = new long[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            long l2;
            Long l3 = (Long)arrayList.get(i3);
            lArray[i3] = l2 = l3.longValue();
        }
        object = this.zab;
        int n4 = fastJsonResponse$Field.getSafeParcelableFieldId();
        SafeParcelWriter.writeLongArray((Parcel)object, n4, lArray, true);
    }
}

