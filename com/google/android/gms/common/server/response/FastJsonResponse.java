/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.google.android.gms.common.server.response;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class FastJsonResponse {
    public static final Object zaD(FastJsonResponse$Field fastJsonResponse$Field, Object object) {
        FastJsonResponse$FieldConverter fastJsonResponse$FieldConverter = FastJsonResponse$Field.zac(fastJsonResponse$Field);
        if (fastJsonResponse$FieldConverter != null) {
            return fastJsonResponse$Field.zaf(object);
        }
        return object;
    }

    private final void zaE(FastJsonResponse$Field object, Object object2) {
        int n3 = ((FastJsonResponse$Field)object).zac;
        object2 = ((FastJsonResponse$Field)object).zae(object2);
        String string2 = ((FastJsonResponse$Field)object).zae;
        switch (n3) {
            default: {
                object2 = hj0_0.a(n3, "Unsupported type for conversion: ");
                object = new IllegalStateException((String)object2);
                throw object;
            }
            case 8: 
            case 9: {
                if (object2 != null) {
                    object2 = (byte[])object2;
                    this.setDecodedBytesInternal((FastJsonResponse$Field)object, string2, (byte[])object2);
                    return;
                }
                FastJsonResponse.zaG(string2);
                return;
            }
            case 7: {
                object2 = (String)object2;
                this.setStringInternal((FastJsonResponse$Field)object, string2, (String)object2);
                return;
            }
            case 6: {
                if (object2 != null) {
                    boolean bl2 = (Boolean)object2;
                    this.setBooleanInternal((FastJsonResponse$Field)object, string2, bl2);
                    return;
                }
                FastJsonResponse.zaG(string2);
                return;
            }
            case 5: {
                object2 = (BigDecimal)object2;
                this.zab((FastJsonResponse$Field)object, string2, (BigDecimal)object2);
                return;
            }
            case 4: {
                if (object2 != null) {
                    double d2 = (Double)object2;
                    this.zan((FastJsonResponse$Field)object, string2, d2);
                    return;
                }
                FastJsonResponse.zaG(string2);
                return;
            }
            case 2: {
                if (object2 != null) {
                    long l2 = (Long)object2;
                    this.setLongInternal((FastJsonResponse$Field)object, string2, l2);
                    return;
                }
                FastJsonResponse.zaG(string2);
                return;
            }
            case 1: {
                object2 = (BigInteger)object2;
                this.zaf((FastJsonResponse$Field)object, string2, (BigInteger)object2);
                return;
            }
            case 0: 
        }
        if (object2 != null) {
            int n4 = (Integer)object2;
            this.setIntegerInternal((FastJsonResponse$Field)object, string2, n4);
            return;
        }
        FastJsonResponse.zaG(string2);
    }

    private static final void zaF(StringBuilder stringBuilder, FastJsonResponse$Field object, Object object2) {
        int n3 = ((FastJsonResponse$Field)object).zaa;
        int n4 = 11;
        if (n3 != n4) {
            int n7 = 7;
            if (n3 == n7) {
                object = "\"";
                stringBuilder.append((String)object);
                object2 = JsonUtils.escapeString((String)object2);
                stringBuilder.append((String)object2);
                stringBuilder.append((String)object);
                return;
            }
            stringBuilder.append(object2);
            return;
        }
        object = ((FastJsonResponse$Field)object).zag;
        Preconditions.checkNotNull(object);
        object = ((FastJsonResponse)((Class)object).cast(object2)).toString();
        stringBuilder.append((String)object);
    }

    private static final void zaG(String string2) {
        Log.isLoggable((String)"FastJsonResponse", (int)6);
    }

    public void addConcreteTypeArrayInternal(FastJsonResponse$Field object, String string2, ArrayList arrayList) {
        object = new UnsupportedOperationException("Concrete type array not supported");
        throw object;
    }

    public void addConcreteTypeInternal(FastJsonResponse$Field object, String string2, FastJsonResponse fastJsonResponse) {
        object = new UnsupportedOperationException("Concrete type not supported");
        throw object;
    }

    public abstract Map getFieldMappings();

    public Object getFieldValue(FastJsonResponse$Field object) {
        int n3 = 1;
        StringBuilder stringBuilder = null;
        String string2 = "get";
        String string3 = ((FastJsonResponse$Field)object).zae;
        Object object2 = ((FastJsonResponse$Field)object).zag;
        if (object2 != null) {
            Class clazz;
            char c2;
            boolean bl2;
            object2 = this.getValueObject(string3);
            if (object2 == null) {
                bl2 = true;
            } else {
                bl2 = false;
                object2 = null;
            }
            object = ((FastJsonResponse$Field)object).zae;
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            object = "Concrete field shouldn't be value object: %s";
            Preconditions.checkState(bl2, (String)object, objectArray);
            try {
                c2 = string3.charAt(0);
            }
            catch (Exception exception) {
                clazz = new Class(exception);
                throw clazz;
            }
            c2 = Character.toUpperCase(c2);
            clazz = string3.substring(n3);
            stringBuilder = new StringBuilder(string2);
            stringBuilder.append(c2);
            stringBuilder.append((String)((Object)clazz));
            object = stringBuilder.toString();
            clazz = this.getClass();
            stringBuilder = null;
            object = clazz.getMethod((String)object, null);
            return ((Method)object).invoke((Object)this, null);
        }
        return this.getValueObject(string3);
    }

    public abstract Object getValueObject(String var1);

    public boolean isFieldSet(FastJsonResponse$Field object) {
        int n3 = ((FastJsonResponse$Field)object).zac;
        int n4 = 11;
        if (n3 == n4) {
            boolean bl2 = ((FastJsonResponse$Field)object).zad;
            if (bl2) {
                object = new UnsupportedOperationException("Concrete type arrays not supported");
                throw object;
            }
            object = new UnsupportedOperationException("Concrete types not supported");
            throw object;
        }
        object = ((FastJsonResponse$Field)object).zae;
        return this.isPrimitiveFieldSet((String)object);
    }

    public abstract boolean isPrimitiveFieldSet(String var1);

    public void setBooleanInternal(FastJsonResponse$Field object, String string2, boolean bl2) {
        object = new UnsupportedOperationException("Boolean not supported");
        throw object;
    }

    public void setDecodedBytesInternal(FastJsonResponse$Field object, String string2, byte[] byArray) {
        object = new UnsupportedOperationException("byte[] not supported");
        throw object;
    }

    public void setIntegerInternal(FastJsonResponse$Field object, String string2, int n3) {
        object = new UnsupportedOperationException("Integer not supported");
        throw object;
    }

    public void setLongInternal(FastJsonResponse$Field object, String string2, long l2) {
        object = new UnsupportedOperationException("Long not supported");
        throw object;
    }

    public void setStringInternal(FastJsonResponse$Field object, String string2, String string3) {
        object = new UnsupportedOperationException("String not supported");
        throw object;
    }

    public void setStringMapInternal(FastJsonResponse$Field object, String string2, Map map2) {
        object = new UnsupportedOperationException("String map not supported");
        throw object;
    }

    public void setStringsInternal(FastJsonResponse$Field object, String string2, ArrayList arrayList) {
        object = new UnsupportedOperationException("String list not supported");
        throw object;
    }

    public String toString() {
        int n3;
        Object object = this.getFieldMappings();
        int n4 = 100;
        StringBuilder stringBuilder = new StringBuilder(n4);
        Iterator iterator = object.keySet().iterator();
        block5: while ((n3 = iterator.hasNext()) != 0) {
            String string2;
            String string3 = (String)iterator.next();
            FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field)object.get(string3);
            boolean bl2 = this.isFieldSet(fastJsonResponse$Field);
            if (!bl2) continue;
            Object object2 = this.getFieldValue(fastJsonResponse$Field);
            object2 = FastJsonResponse.zaD(fastJsonResponse$Field, object2);
            int n7 = stringBuilder.length();
            String string4 = ",";
            if (n7 == 0) {
                string2 = "{";
                stringBuilder.append(string2);
            } else {
                stringBuilder.append(string4);
            }
            string2 = "\"";
            stringBuilder.append(string2);
            stringBuilder.append(string3);
            string3 = "\":";
            stringBuilder.append(string3);
            if (object2 == null) {
                string3 = "null";
                stringBuilder.append(string3);
                continue;
            }
            n3 = fastJsonResponse$Field.zac;
            switch (n3) {
                default: {
                    n3 = (int)(fastJsonResponse$Field.zab ? 1 : 0);
                    if (n3 != 0) {
                        object2 = (ArrayList)object2;
                        string3 = "[";
                        stringBuilder.append(string3);
                        n3 = ((ArrayList)object2).size();
                        string2 = null;
                        for (n7 = 0; n7 < n3; ++n7) {
                            Object e2;
                            if (n7 > 0) {
                                stringBuilder.append(string4);
                            }
                            if ((e2 = ((ArrayList)object2).get(n7)) == null) continue;
                            FastJsonResponse.zaF(stringBuilder, fastJsonResponse$Field, e2);
                        }
                        string3 = "]";
                        stringBuilder.append(string3);
                        continue block5;
                    }
                    FastJsonResponse.zaF(stringBuilder, fastJsonResponse$Field, object2);
                    continue block5;
                }
                case 10: {
                    object2 = (HashMap)object2;
                    MapUtils.writeStringMapToJson(stringBuilder, (HashMap)object2);
                    continue block5;
                }
                case 9: {
                    stringBuilder.append(string2);
                    object2 = (byte[])object2;
                    string3 = Base64Utils.encodeUrlSafe((byte[])object2);
                    stringBuilder.append(string3);
                    stringBuilder.append(string2);
                    continue block5;
                }
                case 8: 
            }
            stringBuilder.append(string2);
            object2 = (byte[])object2;
            string3 = Base64Utils.encode((byte[])object2);
            stringBuilder.append(string3);
            stringBuilder.append(string2);
        }
        int n8 = stringBuilder.length();
        if (n8 > 0) {
            object = "}";
            stringBuilder.append((String)object);
        } else {
            object = "{}";
            stringBuilder.append((String)object);
        }
        return stringBuilder.toString();
    }

    public final void zaA(FastJsonResponse$Field fastJsonResponse$Field, String string2) {
        Object object = FastJsonResponse$Field.zac(fastJsonResponse$Field);
        if (object != null) {
            this.zaE(fastJsonResponse$Field, string2);
            return;
        }
        object = fastJsonResponse$Field.zae;
        this.setStringInternal(fastJsonResponse$Field, (String)object, string2);
    }

    public final void zaB(FastJsonResponse$Field fastJsonResponse$Field, Map map2) {
        Object object = FastJsonResponse$Field.zac(fastJsonResponse$Field);
        if (object != null) {
            this.zaE(fastJsonResponse$Field, map2);
            return;
        }
        object = fastJsonResponse$Field.zae;
        this.setStringMapInternal(fastJsonResponse$Field, (String)object, map2);
    }

    public final void zaC(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
        Object object = FastJsonResponse$Field.zac(fastJsonResponse$Field);
        if (object != null) {
            this.zaE(fastJsonResponse$Field, arrayList);
            return;
        }
        object = fastJsonResponse$Field.zae;
        this.setStringsInternal(fastJsonResponse$Field, (String)object, arrayList);
    }

    public final void zaa(FastJsonResponse$Field fastJsonResponse$Field, BigDecimal bigDecimal) {
        Object object = FastJsonResponse$Field.zac(fastJsonResponse$Field);
        if (object != null) {
            this.zaE(fastJsonResponse$Field, bigDecimal);
            return;
        }
        object = fastJsonResponse$Field.zae;
        this.zab(fastJsonResponse$Field, (String)object, bigDecimal);
    }

    public void zab(FastJsonResponse$Field object, String string2, BigDecimal bigDecimal) {
        object = new UnsupportedOperationException("BigDecimal not supported");
        throw object;
    }

    public final void zac(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
        Object object = FastJsonResponse$Field.zac(fastJsonResponse$Field);
        if (object != null) {
            this.zaE(fastJsonResponse$Field, arrayList);
            return;
        }
        object = fastJsonResponse$Field.zae;
        this.zad(fastJsonResponse$Field, (String)object, arrayList);
    }

    public void zad(FastJsonResponse$Field object, String string2, ArrayList arrayList) {
        object = new UnsupportedOperationException("BigDecimal list not supported");
        throw object;
    }

    public final void zae(FastJsonResponse$Field fastJsonResponse$Field, BigInteger bigInteger) {
        Object object = FastJsonResponse$Field.zac(fastJsonResponse$Field);
        if (object != null) {
            this.zaE(fastJsonResponse$Field, bigInteger);
            return;
        }
        object = fastJsonResponse$Field.zae;
        this.zaf(fastJsonResponse$Field, (String)object, bigInteger);
    }

    public void zaf(FastJsonResponse$Field object, String string2, BigInteger bigInteger) {
        object = new UnsupportedOperationException("BigInteger not supported");
        throw object;
    }

    public final void zag(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
        Object object = FastJsonResponse$Field.zac(fastJsonResponse$Field);
        if (object != null) {
            this.zaE(fastJsonResponse$Field, arrayList);
            return;
        }
        object = fastJsonResponse$Field.zae;
        this.zah(fastJsonResponse$Field, (String)object, arrayList);
    }

    public void zah(FastJsonResponse$Field object, String string2, ArrayList arrayList) {
        object = new UnsupportedOperationException("BigInteger list not supported");
        throw object;
    }

    public final void zai(FastJsonResponse$Field fastJsonResponse$Field, boolean bl2) {
        Object object = FastJsonResponse$Field.zac(fastJsonResponse$Field);
        if (object != null) {
            Boolean bl3 = bl2;
            this.zaE(fastJsonResponse$Field, bl3);
            return;
        }
        object = fastJsonResponse$Field.zae;
        this.setBooleanInternal(fastJsonResponse$Field, (String)object, bl2);
    }

    public final void zaj(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
        Object object = FastJsonResponse$Field.zac(fastJsonResponse$Field);
        if (object != null) {
            this.zaE(fastJsonResponse$Field, arrayList);
            return;
        }
        object = fastJsonResponse$Field.zae;
        this.zak(fastJsonResponse$Field, (String)object, arrayList);
    }

    public void zak(FastJsonResponse$Field object, String string2, ArrayList arrayList) {
        object = new UnsupportedOperationException("Boolean list not supported");
        throw object;
    }

    public final void zal(FastJsonResponse$Field fastJsonResponse$Field, byte[] byArray) {
        Object object = FastJsonResponse$Field.zac(fastJsonResponse$Field);
        if (object != null) {
            this.zaE(fastJsonResponse$Field, byArray);
            return;
        }
        object = fastJsonResponse$Field.zae;
        this.setDecodedBytesInternal(fastJsonResponse$Field, (String)object, byArray);
    }

    public final void zam(FastJsonResponse$Field fastJsonResponse$Field, double d2) {
        Object object = FastJsonResponse$Field.zac(fastJsonResponse$Field);
        if (object != null) {
            Double d5 = d2;
            this.zaE(fastJsonResponse$Field, d5);
            return;
        }
        object = fastJsonResponse$Field.zae;
        this.zan(fastJsonResponse$Field, (String)object, d2);
    }

    public void zan(FastJsonResponse$Field object, String string2, double d2) {
        object = new UnsupportedOperationException("Double not supported");
        throw object;
    }

    public final void zao(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
        Object object = FastJsonResponse$Field.zac(fastJsonResponse$Field);
        if (object != null) {
            this.zaE(fastJsonResponse$Field, arrayList);
            return;
        }
        object = fastJsonResponse$Field.zae;
        this.zap(fastJsonResponse$Field, (String)object, arrayList);
    }

    public void zap(FastJsonResponse$Field object, String string2, ArrayList arrayList) {
        object = new UnsupportedOperationException("Double list not supported");
        throw object;
    }

    public final void zaq(FastJsonResponse$Field fastJsonResponse$Field, float f5) {
        Object object = FastJsonResponse$Field.zac(fastJsonResponse$Field);
        if (object != null) {
            Float f6 = Float.valueOf(f5);
            this.zaE(fastJsonResponse$Field, f6);
            return;
        }
        object = fastJsonResponse$Field.zae;
        this.zar(fastJsonResponse$Field, (String)object, f5);
    }

    public void zar(FastJsonResponse$Field object, String string2, float f5) {
        object = new UnsupportedOperationException("Float not supported");
        throw object;
    }

    public final void zas(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
        Object object = FastJsonResponse$Field.zac(fastJsonResponse$Field);
        if (object != null) {
            this.zaE(fastJsonResponse$Field, arrayList);
            return;
        }
        object = fastJsonResponse$Field.zae;
        this.zat(fastJsonResponse$Field, (String)object, arrayList);
    }

    public void zat(FastJsonResponse$Field object, String string2, ArrayList arrayList) {
        object = new UnsupportedOperationException("Float list not supported");
        throw object;
    }

    public final void zau(FastJsonResponse$Field fastJsonResponse$Field, int n3) {
        Object object = FastJsonResponse$Field.zac(fastJsonResponse$Field);
        if (object != null) {
            Integer n4 = n3;
            this.zaE(fastJsonResponse$Field, n4);
            return;
        }
        object = fastJsonResponse$Field.zae;
        this.setIntegerInternal(fastJsonResponse$Field, (String)object, n3);
    }

    public final void zav(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
        Object object = FastJsonResponse$Field.zac(fastJsonResponse$Field);
        if (object != null) {
            this.zaE(fastJsonResponse$Field, arrayList);
            return;
        }
        object = fastJsonResponse$Field.zae;
        this.zaw(fastJsonResponse$Field, (String)object, arrayList);
    }

    public void zaw(FastJsonResponse$Field object, String string2, ArrayList arrayList) {
        object = new UnsupportedOperationException("Integer list not supported");
        throw object;
    }

    public final void zax(FastJsonResponse$Field fastJsonResponse$Field, long l2) {
        Object object = FastJsonResponse$Field.zac(fastJsonResponse$Field);
        if (object != null) {
            Long l3 = l2;
            this.zaE(fastJsonResponse$Field, l3);
            return;
        }
        object = fastJsonResponse$Field.zae;
        this.setLongInternal(fastJsonResponse$Field, (String)object, l2);
    }

    public final void zay(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
        Object object = FastJsonResponse$Field.zac(fastJsonResponse$Field);
        if (object != null) {
            this.zaE(fastJsonResponse$Field, arrayList);
            return;
        }
        object = fastJsonResponse$Field.zae;
        this.zaz(fastJsonResponse$Field, (String)object, arrayList);
    }

    public void zaz(FastJsonResponse$Field object, String string2, ArrayList arrayList) {
        object = new UnsupportedOperationException("Long list not supported");
        throw object;
    }
}

