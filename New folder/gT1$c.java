/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class gT1$c
extends Lambda
implements Function1 {
    public final /* synthetic */ Bundle c;

    public gT1$c(Bundle bundle) {
        this.c = bundle;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "argName");
        return this.c.containsKey((String)object) ^ true;
    }
}

