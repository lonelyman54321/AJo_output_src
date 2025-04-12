/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b$i
extends Lambda
implements Function0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ A30 e;
    public final /* synthetic */ iS2 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ View h;

    public b$i(Context context, Function1 function1, A30 a30, iS2 iS22, int n3, View view) {
        this.c = context;
        this.d = function1;
        this.e = a30;
        this.f = iS22;
        this.g = n3;
        this.h = view;
        super(0);
    }

    public final Object invoke() {
        ViewFactoryHolder viewFactoryHolder;
        Object object = this.h;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        Object object2 = object;
        object2 = (sg2_0)object;
        iS2 iS22 = this.f;
        int n3 = this.g;
        Context context = this.c;
        Function1 function1 = this.d;
        A30 a30 = this.e;
        object = viewFactoryHolder;
        viewFactoryHolder = new ViewFactoryHolder(context, function1, a30, iS22, n3, (sg2_0)object2);
        return viewFactoryHolder.getLayoutNode();
    }
}

