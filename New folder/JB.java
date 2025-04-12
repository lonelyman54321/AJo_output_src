/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class JB
implements Function2 {
    public final /* synthetic */ lQ2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Component c;
    public final /* synthetic */ Product d;
    public final /* synthetic */ dr0_0 e;
    public final /* synthetic */ Activity f;
    public final /* synthetic */ i90_0 g;
    public final /* synthetic */ yp0_0 h;
    public final /* synthetic */ int i;

    public /* synthetic */ JB(String string2, Component component, Product product, dr0_0 dr0_02, Activity activity, c80 c802, yp0_0 yp0_02, int n3) {
        mq2_0 mq2_02 = mq2_0.a;
        this.a = mq2_02;
        this.b = string2;
        this.c = component;
        this.d = product;
        this.e = dr0_02;
        this.f = activity;
        this.g = c802;
        this.h = yp0_02;
        this.i = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        Intrinsics.checkNotNullParameter(this.a, "$this_MiniPLPRowItem");
        Component component = this.c;
        Intrinsics.checkNotNullParameter(component, "$item");
        Product product = this.d;
        Intrinsics.checkNotNullParameter(product, "$product");
        dr0_0 dr0_02 = this.e;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        object = this.g;
        Intrinsics.checkNotNullParameter(object, "$coroutineScope");
        yp0_0 yp0_02 = this.h;
        Intrinsics.checkNotNullParameter(yp0_02, "$fleekBrandPageGAEventsUtil");
        int n3 = Me3.b(this.i | 1);
        Activity activity = this.f;
        Object object4 = object;
        object4 = (c80)object;
        WB.e(this.b, component, product, dr0_02, activity, (c80)object4, yp0_02, (b30_0)object3, n3);
        return Unit.a;
    }
}

