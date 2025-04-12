/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Point
 *  android.view.View$DragShadowBuilder
 */
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import kotlin.jvm.functions.Function1;

public final class v20
extends View.DragShadowBuilder {
    public final Vo0 a;
    public final long b;
    public final Function1 c;

    public v20(Wo0 wo0, long l2, Function1 function1) {
        this.a = wo0;
        this.b = l2;
        this.c = function1;
    }

    public final void onDrawShadow(Canvas object) {
        long l2;
        Vo0 vo0;
        xl_0 xl_02 = new xl_0();
        bp1_0 bp1_02 = bp1_0.Ltr;
        Object object2 = Nf.a;
        object2 = new mf_0();
        ((mf_0)object2).a = object;
        object = xl_02.a;
        Vo0 vo02 = object.a;
        bp1_0 bp1_03 = object.b;
        iL iL2 = object.c;
        long l3 = object.d;
        object.a = vo0 = this.a;
        object.b = bp1_02;
        object.c = object2;
        object.d = l2 = this.b;
        ((mf_0)object2).p();
        this.c.invoke(xl_02);
        ((mf_0)object2).h();
        object.a = vo02;
        object.b = bp1_03;
        object.c = iL2;
        object.d = l3;
    }

    public final void onProvideShadowMetrics(Point point, Point point2) {
        long l2 = this.b;
        float f5 = C63.d(l2);
        Vo0 vo0 = this.a;
        f5 = vo0.E0(f5);
        int n3 = vo0.e0(f5);
        float f6 = C63.b(l2);
        f6 = vo0.E0(f6);
        int n4 = vo0.e0(f6);
        point.set(n3, n4);
        n4 = point.x / 2;
        int n7 = point.y / 2;
        point2.set(n4, n7);
    }
}

