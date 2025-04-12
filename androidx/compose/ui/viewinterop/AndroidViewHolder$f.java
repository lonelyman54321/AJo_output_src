/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 */
package androidx.compose.ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.AndroidViewHolder$f$a;
import androidx.compose.ui.viewinterop.AndroidViewHolder$f$b;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class AndroidViewHolder$f
implements al1_1 {
    public final /* synthetic */ AndroidViewHolder a;
    public final /* synthetic */ xp1_0 b;

    public AndroidViewHolder$f(ViewFactoryHolder viewFactoryHolder, xp1_0 xp1_02) {
        this.a = viewFactoryHolder;
        this.b = xp1_02;
    }

    public final int a(Rj1 rj1, List list, int n3) {
        int n4 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        AndroidViewHolder androidViewHolder = this.a;
        ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams);
        int n7 = layoutParams.height;
        int n8 = AndroidViewHolder.d(androidViewHolder, 0, n3, n7);
        androidViewHolder.measure(n4, n8);
        return androidViewHolder.getMeasuredWidth();
    }

    public final bl1_0 c(dl1_1 dl1_12, List object, long l2) {
        int n3;
        Object object2;
        object = this.a;
        int n4 = object.getChildCount();
        if (n4 == 0) {
            int n7 = c60.k(l2);
            int n8 = c60.j(l2);
            AndroidViewHolder$f$a androidViewHolder$f$a = AndroidViewHolder$f$a.c;
            return cl1_0.a(dl1_12, n7, n8, androidViewHolder$f$a);
        }
        n4 = c60.k(l2);
        int n10 = 0;
        xp1_0 xp1_02 = null;
        if (n4 != 0) {
            object2 = object.getChildAt(0);
            n3 = c60.k(l2);
            object2.setMinimumWidth(n3);
        }
        if ((n4 = c60.j(l2)) != 0) {
            object2 = object.getChildAt(0);
            n10 = c60.j(l2);
            object2.setMinimumHeight(n10);
        }
        n4 = c60.k(l2);
        n10 = c60.i(l2);
        ViewGroup.LayoutParams layoutParams = ((AndroidViewHolder)object).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams);
        n3 = layoutParams.width;
        n4 = AndroidViewHolder.d((AndroidViewHolder)object, n4, n10, n3);
        n10 = c60.j(l2);
        int n14 = c60.h(l2);
        ViewGroup.LayoutParams layoutParams2 = ((AndroidViewHolder)object).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2);
        int n15 = layoutParams2.height;
        n14 = AndroidViewHolder.d((AndroidViewHolder)object, n10, n14, n15);
        object.measure(n4, n14);
        n14 = object.getMeasuredWidth();
        n15 = object.getMeasuredHeight();
        xp1_02 = this.b;
        object = (ViewFactoryHolder)object;
        object2 = new AndroidViewHolder$f$b((ViewFactoryHolder)object, xp1_02);
        return cl1_0.a(dl1_12, n14, n15, (Function1)object2);
    }

    public final int h(Rj1 rj1, List list, int n3) {
        int n4 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        AndroidViewHolder androidViewHolder = this.a;
        ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams);
        int n7 = layoutParams.height;
        int n8 = AndroidViewHolder.d(androidViewHolder, 0, n3, n7);
        androidViewHolder.measure(n4, n8);
        return androidViewHolder.getMeasuredWidth();
    }

    public final int i(Rj1 object, List list, int n3) {
        object = this.a;
        list = ((AndroidViewHolder)object).getLayoutParams();
        Intrinsics.checkNotNull(list);
        int n4 = ((ViewGroup.LayoutParams)list).width;
        n4 = AndroidViewHolder.d((AndroidViewHolder)object, 0, n3, n4);
        n3 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        object.measure(n4, n3);
        return object.getMeasuredHeight();
    }

    public final int j(Rj1 object, List list, int n3) {
        object = this.a;
        list = ((AndroidViewHolder)object).getLayoutParams();
        Intrinsics.checkNotNull(list);
        int n4 = ((ViewGroup.LayoutParams)list).width;
        n4 = AndroidViewHolder.d((AndroidViewHolder)object, 0, n3, n4);
        n3 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        object.measure(n4, n3);
        return object.getMeasuredHeight();
    }
}

