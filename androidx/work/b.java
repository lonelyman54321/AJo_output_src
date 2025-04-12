/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import androidx.work.b$b;
import androidx.work.b$c;
import androidx.work.b$d;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class b {
    public static final b b;
    public final HashMap a;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b b2 = new b(linkedHashMap);
        b$b.b(b2);
        b = b2;
    }

    public b(b object) {
        HashMap hashMap;
        Intrinsics.checkNotNullParameter(object, "other");
        object = ((b)object).a;
        this.a = hashMap = new HashMap(object);
    }

    public b(Map map2) {
        HashMap hashMap;
        Intrinsics.checkNotNullParameter(map2, "values");
        this.a = hashMap = new HashMap(map2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final b a(byte[] var0) {
        block24: {
            block23: {
                var1_1 = 1;
                var2_2 = "bytes";
                Intrinsics.checkNotNullParameter(var0, (String)var2_2);
                var3_3 = ((Object)var0).length;
                var4_4 = 10240;
                if (var3_3 > var4_4) {
                    var13_21 = "Data cannot occupy more than 10240 bytes when serialized".toString();
                    var0 = new IllegalStateException(var13_21);
                    throw var0;
                }
                var3_3 = ((Object)var0).length;
                if (var3_3 == 0) {
                    return androidx.work.b.b;
                }
                var2_2 = new LinkedHashMap<String, Object>();
                var5_5 = new ByteArrayInputStream((byte[])var0);
                var6_8 = 2;
                var0 = new byte[var6_8];
                var5_5.read((byte[])var0);
                var7_9 = (byte)-21267;
                var8_10 = 0xFFFFAC;
                var9_11 = 0;
                var10_12 = var0[0];
                if (var10_12 == var8_10 && (var6_8 = var0[var1_1]) == var7_9) {
                    var6_8 = 1;
                } else {
                    var6_8 = 0;
                    var0 = null;
                }
                var5_5.reset();
                var7_9 = 0;
                if (var6_8 == 0) ** GOTO lbl59
                var0 = new ObjectInputStream;
                var0((InputStream)var5_5);
                try {
                    var4_4 = var0.readInt();
                    while (var9_11 < var4_4) {
                        var11_13 = var0.readUTF();
                        var12_15 = "readUTF()";
                        Intrinsics.checkNotNullExpressionValue(var11_13, (String)var12_15);
                        var12_15 = var0.readObject();
                        var2_2.put(var11_13, var12_15);
                        var9_11 += var1_1;
                    }
                }
                catch (Throwable var13_17) {
                    break block23;
                }
                xj3_1.b((Closeable)var0, null);
                break block24;
            }
            try {
                throw var13_17;
            }
            catch (Throwable var5_6) {
                block27: {
                    block25: {
                        block26: {
                            xj3_1.b((Closeable)var0, var13_17);
                            throw var5_6;
lbl59:
                            // 1 sources

                            var0 = new DataInputStream;
                            var0((InputStream)var5_5);
                            try {
                                var4_4 = var0.readShort();
                                var8_10 = -21521;
                                if (var4_4 != var8_10) break block25;
                                var4_4 = var0.readShort();
                                if (var4_4 != var1_1) break block26;
                                var4_4 = var0.readInt();
                                while (var9_11 < var4_4) {
                                    var8_10 = var0.readByte();
                                    var11_14 = b$b.a((DataInputStream)var0, (byte)var8_10);
                                    var12_16 = var0.readUTF();
                                    var14_22 = "key";
                                    Intrinsics.checkNotNullExpressionValue(var12_16, var14_22);
                                    var2_2.put(var12_16, var11_14);
                                    var9_11 += var1_1;
                                }
                            }
                            catch (Throwable var13_18) {}
                            xj3_1.b((Closeable)var0, null);
                            break block24;
                        }
                        var13_19 = "Unsupported version number: ";
                        var13_19 = hj0_0.a(var4_4, var13_19);
                        var13_19 = var13_19.toString();
                        var5_5 = new IllegalStateException(var13_19);
                        throw var5_5;
                        break block27;
                    }
                    var13_20 = "Magic number doesn't match: ";
                    var13_20 = hj0_0.a(var4_4, var13_20);
                    var13_20 = var13_20.toString();
                    var5_5 = new IllegalStateException(var13_20);
                    throw var5_5;
                }
                try {
                    throw var13_18;
                }
                catch (Throwable var5_7) {
                    try {
                        xj3_1.b((Closeable)var0, var13_18);
                        throw var5_7;
                    }
                    catch (IOException v0) {
                        var6_8 = xi0.a;
                        var0 = qx1.a();
                        var0.getClass();
                        break block24;
                    }
                    catch (ClassNotFoundException v1) {}
                }
            }
            var6_8 = xi0.a;
            var0 = qx1.a();
            var0.getClass();
        }
        var0 = new b;
        var0(var2_2);
        return var0;
    }

    public final int b(String string2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Object object = 0;
        HashMap hashMap = this.a;
        string2 = hashMap.get(string2);
        boolean bl2 = string2 instanceof Integer;
        if (bl2) {
            object = string2;
        }
        return ((Number)object).intValue();
    }

    public final String c(String string2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        HashMap hashMap = this.a;
        string2 = hashMap.get(string2);
        boolean bl2 = string2 instanceof String;
        if (!bl2) {
            string2 = null;
        }
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String[] d(String stringArray) {
        Intrinsics.checkNotNullParameter(stringArray, "key");
        Object object = this.a;
        stringArray = object.get(stringArray);
        int n3 = stringArray instanceof Object[];
        if (n3 == 0) return null;
        object = stringArray;
        object = stringArray;
        boolean bl2 = object instanceof Object[];
        if (!bl2) return null;
        n3 = ((Object[])object).length;
        b$c b$c = new b$c(stringArray);
        stringArray = new String[n3];
        int n4 = 0;
        while (n4 < n3) {
            Object object2 = n4;
            stringArray[n4] = object2 = b$c.invoke(object2);
            ++n4;
        }
        return stringArray;
    }

    public final boolean e(String object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "key");
        Class<String> clazz = String.class;
        Intrinsics.checkNotNullParameter(clazz, "klass");
        HashMap hashMap = this.a;
        object = hashMap.get(object);
        if (object != null && (bl2 = clazz.isAssignableFrom((Class<?>)(object = object.getClass())))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        Object[] objectArray;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object == null) return false;
        Set set = b.class;
        Serializable serializable = object.getClass();
        boolean bl3 = Intrinsics.areEqual(set, serializable);
        if (!bl3) return false;
        object = (b)object;
        serializable = this.a;
        set = ((HashMap)serializable).keySet();
        boolean bl4 = Intrinsics.areEqual(set, objectArray = ((HashMap)(object = ((b)object).a)).keySet());
        if (!bl4) {
            return false;
        }
        set = set.iterator();
        do {
            if (!(bl4 = set.hasNext())) return bl2;
            objectArray = (String)set.next();
            Object v4 = ((HashMap)serializable).get(objectArray);
            objectArray = ((HashMap)object).get(objectArray);
            if (v4 != null && objectArray != null) {
                boolean bl5 = v4 instanceof Object[];
                if (bl5) {
                    Object v5 = v4;
                    Object[] objectArray2 = (Object[])v4;
                    boolean bl6 = objectArray instanceof Object[];
                    if (bl6) {
                        objectArray = objectArray;
                        bl4 = qp_1.b(objectArray2, objectArray);
                        continue;
                    }
                }
                bl4 = Intrinsics.areEqual(v4, objectArray);
                continue;
            }
            if (v4 != objectArray) return false;
            bl4 = true;
        } while (bl4);
        return false;
    }

    public final int hashCode() {
        int n3;
        Iterator iterator = this.a.entrySet().iterator();
        int n4 = 0;
        while ((n3 = iterator.hasNext()) != 0) {
            Map.Entry entry = iterator.next();
            Object object = entry.getValue();
            boolean bl2 = object instanceof Object[];
            if (bl2) {
                entry = entry.getKey();
                n3 = Objects.hashCode(entry);
                object = (Object[])object;
                int n7 = Arrays.deepHashCode(object);
                n3 ^= n7;
            } else {
                n3 = ((Object)entry).hashCode();
            }
            n4 += n3;
        }
        return n4 * 31;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder("Data {");
        Object object = this.a.entrySet();
        Iterable iterable = object;
        iterable = (Iterable)object;
        b$d b$d = b$d.c;
        object = CollectionsKt.R(iterable, null, null, null, b$d, 31);
        charSequence.append((String)object);
        charSequence.append("}");
        charSequence = charSequence.toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuilder().apply(builderAction).toString()");
        return charSequence;
    }
}

