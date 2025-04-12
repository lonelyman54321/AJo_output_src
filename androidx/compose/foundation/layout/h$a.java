/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h$a
extends Lambda
implements Function1 {
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public h$a(float f5, float f6, float f7, float f8) {
        this.c = f5;
        this.d = f6;
        this.e = f7;
        this.f = f8;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (mi1)object;
        object.getClass();
        float f5 = this.c;
        xs0_0 xs0_02 = new xs0_0(f5);
        object = ((mi1)object).a;
        ((na3_0)object).b(xs0_02, "start");
        f5 = this.d;
        xs0_02 = new xs0_0(f5);
        ((na3_0)object).b(xs0_02, "top");
        f5 = this.e;
        xs0_02 = new xs0_0(f5);
        ((na3_0)object).b(xs0_02, "end");
        f5 = this.f;
        xs0_02 = new xs0_0(f5);
        ((na3_0)object).b(xs0_02, "bottom");
        return Unit.a;
    }
}

