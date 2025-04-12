/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.compose.material.ripple;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.ui.R$id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class RippleContainer
extends ViewGroup {
    public final int a;
    public final ArrayList b;
    public final ArrayList c;
    public final rP2 d;
    public int e;

    public RippleContainer(Context context) {
        super(context);
        Object object;
        ArrayList<rP2> arrayList;
        Serializable serializable;
        this.a = 5;
        this.b = serializable = new Serializable();
        this.c = arrayList = new ArrayList<rP2>();
        this.d = object = new rP2();
        this.setClipChildren(false);
        super(context);
        this.addView((View)object);
        serializable.add(object);
        arrayList.add((rP2)object);
        this.e = 1;
        int n3 = R$id.hide_in_inspector_tag;
        serializable = Boolean.TRUE;
        this.setTag(n3, serializable);
    }

    public final RippleHostView a(qp2_0 qp2_02) {
        int n3;
        Object object = this.d;
        Object object2 = (RippleHostView)((Object)((rP2)object).a.get(qp2_02));
        if (object2 != null) {
            return object2;
        }
        object2 = this.c;
        Object object3 = "<this>";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        boolean bl2 = ((ArrayList)object2).isEmpty();
        if (bl2) {
            n3 = 0;
            object2 = null;
        } else {
            object2 = object2.remove(0);
        }
        object3 = ((rP2)object).a;
        object = ((rP2)object).b;
        if (object2 == null) {
            n3 = this.e;
            Object object4 = this.b;
            int n4 = xx_2.h((List)object4);
            if (n3 > n4) {
                Context context = this.getContext();
                object2 = new RippleHostView(context);
                this.addView((View)object2);
                ((ArrayList)object4).add(object2);
            } else {
                n3 = this.e;
                object2 = (RippleHostView)((Object)((ArrayList)object4).get(n3));
                if ((object4 = (qp2_0)((LinkedHashMap)object).get(object2)) != null) {
                    object4.B0();
                    Object object5 = (RippleHostView)((Object)((LinkedHashMap)object3).get(object4));
                    if (object5 != null) {
                        object5 = (qp2_0)object.remove(object5);
                    }
                    object3.remove(object4);
                    object2.c();
                }
            }
            int n7 = this.e;
            n4 = this.a + -1;
            this.e = n7 < n4 ? ++n7 : 0;
        }
        object3.put(qp2_02, object2);
        object.put(object2, qp2_02);
        return object2;
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
    }

    public final void onMeasure(int n3, int n4) {
        this.setMeasuredDimension(0, 0);
    }

    public final void requestLayout() {
    }
}

