/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Objects$ToStringHelper;
import java.util.Arrays;
import java.util.Collection;

public final class Objects {
    private Objects() {
        AssertionError assertionError = new AssertionError((Object)"Uninstantiable");
        throw assertionError;
    }

    public static boolean checkBundlesEquality(Bundle bundle, Bundle bundle2) {
        boolean bl2 = true;
        if (bundle != null && bundle2 != null) {
            Object object;
            int n3;
            int n4 = bundle.size();
            if (n4 != (n3 = bundle2.size())) {
                return false;
            }
            Object object2 = bundle.keySet();
            n3 = (int)(object2.containsAll((Collection<?>)(object = bundle2.keySet())) ? 1 : 0);
            if (n3 == 0) {
                return false;
            }
            object2 = object2.iterator();
            while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                object = (String)object2.next();
                Object object3 = bundle.get((String)object);
                n3 = (int)(Objects.equal(object3, object = bundle2.get((String)object)) ? 1 : 0);
                if (n3 != 0) continue;
                return false;
            }
            return bl2;
        }
        if (bundle == bundle2) {
            return bl2;
        }
        return false;
    }

    public static boolean equal(Object object, Object object2) {
        boolean bl2 = true;
        if (object != object2) {
            if (object != null) {
                boolean bl3 = object.equals(object2);
                if (!bl3) {
                    return false;
                }
            } else {
                bl2 = false;
            }
        }
        return bl2;
    }

    public static int hashCode(Object ... objectArray) {
        return Arrays.hashCode(objectArray);
    }

    public static Objects$ToStringHelper toStringHelper(Object object) {
        Objects$ToStringHelper objects$ToStringHelper = new Objects$ToStringHelper(object, null);
        return objects$ToStringHelper;
    }
}

