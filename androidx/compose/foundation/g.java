/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation;

import androidx.compose.foundation.ScrollSemanticsElement;
import androidx.compose.foundation.ScrollingLayoutElement;
import kotlin.jvm.internal.Lambda;

public final class g
extends Lambda
implements gx0_2 {
    public final /* synthetic */ st2_2 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ TR0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;

    public g(st2_2 st2_22, boolean bl2, TR0 tR0, boolean bl3, boolean bl4) {
        this.c = st2_22;
        this.d = bl2;
        this.e = tR0;
        this.f = bl3;
        this.g = bl4;
        super(3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        object = (LP1)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        ((Number)object3).intValue();
        int n3 = 1478351300;
        object2.K(n3);
        boolean bl2 = this.f;
        boolean bl3 = this.g;
        st2_2 st2_22 = this.c;
        boolean bl4 = this.d;
        TR0 tR0 = this.e;
        Object object4 = object;
        object = new ScrollSemanticsElement(st2_22, bl4, tR0, bl2, bl3);
        boolean bl5 = this.g;
        object4 = bl5 ? pg2_0.Vertical : pg2_0.Horizontal;
        Object object5 = object4;
        st2_2 st2_23 = this.c;
        xr1_1 xr1_12 = st2_23.c;
        bl2 = this.d;
        boolean bl6 = this.f;
        TR0 tR02 = this.e;
        object4 = object;
        st2_22 = st2_23;
        object = hU2.a((LP1)object, st2_23, (pg2_0)((Object)object5), bl6, bl2, tR02, xr1_12, null, (b30_0)object2, 64);
        boolean bl7 = this.d;
        object4 = new ScrollingLayoutElement(st2_23, bl7, bl5);
        object = object.then((LP1)object4);
        object2.E();
        return object;
    }
}

