/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static boolean isEmpty(Collection collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    public static List listOf() {
        return Collections.emptyList();
    }

    public static List listOf(Object object) {
        return Collections.singletonList(object);
    }

    public static List listOf(Object ... objectArray) {
        int n3 = objectArray.length;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                return Collections.unmodifiableList(Arrays.asList(objectArray));
            }
            return Collections.singletonList(objectArray[0]);
        }
        return Collections.emptyList();
    }

    public static Map mapOf(Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
        Map map2 = CollectionUtils.zza(3, false);
        map2.put(object, object2);
        map2.put(object3, object4);
        map2.put(object5, object6);
        return Collections.unmodifiableMap(map2);
    }

    public static Map mapOf(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12) {
        Map map2 = CollectionUtils.zza(6, false);
        map2.put(object, object2);
        map2.put(object3, object4);
        map2.put(object5, object6);
        map2.put(object7, object8);
        map2.put(object9, object10);
        map2.put(object11, object12);
        return Collections.unmodifiableMap(map2);
    }

    public static Map mapOfKeyValueArrays(Object[] object, Object[] object2) {
        int n3 = ((Object[])object).length;
        int n4 = ((Object[])object2).length;
        if (n3 == n4) {
            if (n3 != 0) {
                n4 = 1;
                if (n3 != n4) {
                    Map map2 = CollectionUtils.zza(n3, false);
                    for (int i3 = 0; i3 < (n4 = ((Object[])object).length); ++i3) {
                        Object object3 = object[i3];
                        Object object4 = object2[i3];
                        map2.put(object3, object4);
                    }
                    return Collections.unmodifiableMap(map2);
                }
                object = object[0];
                object2 = object2[0];
                return Collections.singletonMap(object, object2);
            }
            return Collections.emptyMap();
        }
        object2 = D70.b(n3, n4, "Key and values array lengths not equal: ", " != ");
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public static Set mutableSetOfWithSize(int n3) {
        Set set;
        if (n3 == 0) {
            set = new Np();
        } else {
            boolean bl2 = true;
            set = CollectionUtils.zzb(n3, bl2);
        }
        return set;
    }

    public static Set setOf(Object object, Object object2, Object object3) {
        Set set = CollectionUtils.zzb(3, false);
        set.add(object);
        set.add(object2);
        set.add(object3);
        return Collections.unmodifiableSet(set);
    }

    public static Set setOf(Object ... object) {
        int n3 = ((Object[])object).length;
        if (n3 != 0) {
            int n4 = 1;
            Set set = null;
            if (n3 != n4) {
                int n7 = 2;
                if (n3 != n7) {
                    int n8 = 3;
                    if (n3 != n8) {
                        int n10 = 4;
                        if (n3 != n10) {
                            Set set2 = CollectionUtils.zzb(n3, false);
                            Collections.addAll(set2, object);
                            return Collections.unmodifiableSet(set2);
                        }
                        Object object2 = object[0];
                        Object object3 = object[n4];
                        Object object4 = object[n7];
                        object = object[n8];
                        set = CollectionUtils.zzb(n10, false);
                        set.add(object2);
                        set.add(object3);
                        set.add(object4);
                        set.add(object);
                        return Collections.unmodifiableSet(set);
                    }
                    Object object5 = object[0];
                    Object object6 = object[n4];
                    object = object[n7];
                    return CollectionUtils.setOf(object5, object6, object);
                }
                Object object7 = object[0];
                object = object[n4];
                Set set3 = CollectionUtils.zzb(n7, false);
                set3.add(object7);
                set3.add(object);
                return Collections.unmodifiableSet(set3);
            }
            return Collections.singleton(object[0]);
        }
        return Collections.emptySet();
    }

    private static Map zza(int n3, boolean n4) {
        Map map2;
        n4 = 256;
        if (n3 <= n4) {
            map2 = new a53(n3);
        } else {
            float f5 = 1.0f;
            map2 = new HashMap(n3, f5);
        }
        return map2;
    }

    private static Set zzb(int n3, boolean bl2) {
        Set set;
        boolean bl3 = true;
        int n4 = bl3 != bl2 ? 256 : 128;
        if (n3 <= n4) {
            set = new Np(n3);
        } else {
            float f5;
            if (bl3 != bl2) {
                int n7 = 1065353216;
                f5 = 1.0f;
            } else {
                int n8 = 1061158912;
                f5 = 0.75f;
            }
            HashSet hashSet = new HashSet(n3, f5);
            set = hashSet;
        }
        return set;
    }
}

