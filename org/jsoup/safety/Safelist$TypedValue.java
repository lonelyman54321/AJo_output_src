/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.safety;

import org.jsoup.helper.Validate;

abstract class Safelist$TypedValue {
    private final String value;

    public Safelist$TypedValue(String string2) {
        Validate.notNull(string2);
        this.value = string2;
    }

    public boolean equals(Object object) {
        Class<?> clazz;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object == null) {
            return false;
        }
        Object object2 = this.getClass();
        if (object2 != (clazz = object.getClass())) {
            return false;
        }
        object = (Safelist$TypedValue)object;
        object2 = this.value;
        if (object2 == null) {
            object = ((Safelist$TypedValue)object).value;
            if (object != null) {
                bl2 = false;
            }
            return bl2;
        }
        object = ((Safelist$TypedValue)object).value;
        return ((String)object2).equals(object);
    }

    public int hashCode() {
        int n3;
        String string2 = this.value;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        return 31 + n3;
    }

    public String toString() {
        return this.value;
    }
}

