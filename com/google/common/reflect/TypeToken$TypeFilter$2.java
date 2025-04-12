/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.reflect.TypeToken;
import com.google.common.reflect.TypeToken$TypeFilter;

final class TypeToken$TypeFilter$2
extends TypeToken$TypeFilter {
    public boolean apply(TypeToken typeToken) {
        return typeToken.getRawType().isInterface();
    }
}

