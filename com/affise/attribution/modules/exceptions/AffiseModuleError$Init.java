/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.exceptions;

import com.affise.attribution.modules.AffiseModule;
import com.affise.attribution.modules.AffiseModules;
import com.affise.attribution.modules.AffiseModules$Companion;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseModuleError$Init
extends Throwable {
    public AffiseModuleError$Init(AffiseModule object) {
        Intrinsics.checkNotNullParameter(object, "module");
        StringBuilder stringBuilder = new StringBuilder("module [");
        Object object2 = AffiseModules.Companion;
        String string2 = object.getClass().getName();
        object2 = ((AffiseModules$Companion)object2).from(string2);
        if (object2 == null || (object2 = ((Enum)object2).name()) == null) {
            object = object.getClass();
            object2 = ((Class)object).getSimpleName();
        }
        object = h30_0.a(stringBuilder, (String)object2, "] init failed");
        super((String)object);
    }
}

