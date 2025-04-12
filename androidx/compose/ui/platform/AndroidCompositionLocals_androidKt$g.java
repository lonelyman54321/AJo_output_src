/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
package androidx.compose.ui.platform;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class AndroidCompositionLocals_androidKt$g
extends Lambda
implements Function1 {
    public final /* synthetic */ tr1_0 c;

    public AndroidCompositionLocals_androidKt$g(tr1_0 tr1_02) {
        this.c = tr1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Configuration)object;
        Configuration configuration = new Configuration((Configuration)object);
        object = AndroidCompositionLocals_androidKt.a;
        this.c.setValue(configuration);
        return Unit.a;
    }
}

