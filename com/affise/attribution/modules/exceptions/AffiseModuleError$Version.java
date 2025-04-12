/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.exceptions;

import com.affise.attribution.modules.AffiseModule;
import com.affise.attribution.modules.AffiseModules;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseModuleError$Version
extends Throwable {
    public AffiseModuleError$Version(AffiseModules object, AffiseModule affiseModule) {
        Intrinsics.checkNotNullParameter(object, "name");
        Intrinsics.checkNotNullParameter(affiseModule, "module");
        StringBuilder stringBuilder = new StringBuilder("module [");
        object = object.toString();
        Locale locale = Locale.ROOT;
        object = ((String)object).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(object, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        stringBuilder.append((String)object);
        stringBuilder.append(':');
        object = affiseModule.getVersion();
        stringBuilder.append((String)object);
        stringBuilder.append("] version is incompatible with [attribution:1.6.52], use same version as attribution");
        object = stringBuilder.toString();
        super((String)object);
    }
}

