/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.ads.internal.util.client;

import android.os.Bundle;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.Iterator;

public final class zzn {
    public static boolean zza(Bundle object, Bundle object2) {
        boolean bl2;
        block10: {
            bl2 = true;
            if (object != null && object2 != null) {
                int n3;
                int n4 = object.size();
                if (n4 != (n3 = object2.size())) {
                    return false;
                }
                Iterator iterator = object.keySet().iterator();
                while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    Object object3 = (String)iterator.next();
                    boolean bl3 = object2.containsKey((String)object3);
                    if (!bl3) {
                        return false;
                    }
                    Object object4 = object.get((String)object3);
                    object3 = object2.get((String)object3);
                    if (object4 != null && object3 != null) {
                        int n7 = object4 instanceof Bundle;
                        if (n7 != 0) {
                            n7 = object3 instanceof Bundle;
                            if (n7 != 0 && (n3 = (int)(zzn.zza((Bundle)(object4 = (Bundle)object4), (Bundle)(object3 = (Bundle)object3)) ? 1 : 0)) != 0) continue;
                            return false;
                        }
                        Class<?> clazz = object4.getClass();
                        n7 = clazz.isArray();
                        if (n7 != 0) {
                            n7 = Array.getLength(object4);
                            Class<?> clazz2 = object3.getClass();
                            int n8 = clazz2.isArray();
                            if (n8 != 0 && n7 == (n8 = Array.getLength(object3))) {
                                clazz2 = null;
                                for (n8 = 0; n8 < n7; ++n8) {
                                    Object object5;
                                    Object object6 = Array.get(object4, n8);
                                    boolean bl4 = Objects.equal(object6, object5 = Array.get(object3, n8));
                                    if (bl4) continue;
                                    return false;
                                }
                                continue;
                            }
                            return false;
                        }
                        n3 = (int)(object4.equals(object3) ? 1 : 0);
                        if (n3 != 0) continue;
                        return false;
                    }
                    object2 = object3;
                    object = object4;
                    break block10;
                }
                return bl2;
            }
        }
        if (object == null && object2 == null) {
            return bl2;
        }
        return false;
    }
}

