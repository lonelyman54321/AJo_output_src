/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.stl.fragment;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ril.ajio.stl.fragment.ShopTheLookFragment;
import com.ril.ajio.stl.fragment.ShopTheLookFragment$c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class a
extends qg3_2
implements Function2 {
    public final /* synthetic */ ShopTheLookFragment a;

    public a(ShopTheLookFragment shopTheLookFragment, f80_0 f80_02) {
        this.a = shopTheLookFragment;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ShopTheLookFragment shopTheLookFragment = this.a;
        object = new a(shopTheLookFragment, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((ShopTheLookFragment)object).Ra().h.e;
        mu1_1 mu1_12 = ((Fragment)object).getViewLifecycleOwner();
        bf1_0 bf1_02 = new bf1_0(object, 3);
        object = new ShopTheLookFragment$c(bf1_02);
        ((LiveData)object2).e(mu1_12, (F62)object);
        return Unit.a;
    }
}

