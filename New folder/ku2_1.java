/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
import android.view.View;
import android.view.ViewGroup;

/*
 * Renamed from ku2
 */
public final class ku2_1
implements View.OnLayoutChangeListener {
    public final /* synthetic */ mu2 a;

    public /* synthetic */ ku2_1(mu2 mu22) {
        this.a = mu22;
    }

    public final void onLayoutChange(View view, int n3, int n4, int n7, int n8, int n10, int n14, int n15, int n16) {
        int n17;
        ViewGroup.LayoutParams layoutParams;
        int n18;
        int n19;
        mu2 mu22 = this.a;
        Object object = mu22.a;
        n14 = object.getWidth();
        n16 = object.getPaddingLeft();
        n14 -= n16;
        n16 = object.getPaddingRight();
        n14 -= n16;
        n16 = object.getHeight();
        int n20 = object.getPaddingBottom();
        n16 -= n20;
        n8 = object.getPaddingTop();
        n16 -= n8;
        object = mu22.c;
        n20 = mu2.c((View)object);
        boolean bl2 = false;
        if (object != null) {
            n19 = object.getPaddingLeft();
            n18 = object.getPaddingRight() + n19;
        } else {
            n18 = 0;
            layoutParams = null;
        }
        n20 -= n18;
        if (object == null) {
            n19 = 0;
        } else {
            n19 = object.getHeight();
            layoutParams = object.getLayoutParams();
            n17 = layoutParams instanceof ViewGroup.MarginLayoutParams;
            if (n17 != 0) {
                layoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
                n17 = layoutParams.topMargin;
                n18 = layoutParams.bottomMargin;
                n19 += (n17 += n18);
            }
        }
        if (object != null) {
            n18 = object.getPaddingTop();
            n8 = object.getPaddingBottom() + n18;
        } else {
            n8 = 0;
            object = null;
        }
        n19 -= n8;
        object = mu22.i;
        n8 = mu2.c((View)object);
        layoutParams = mu22.k;
        n18 = mu2.c((View)layoutParams) + n8;
        n8 = Math.max(n20, n18);
        ViewGroup viewGroup = mu22.d;
        if (viewGroup == null) {
            n18 = 0;
            layoutParams = null;
        } else {
            n18 = viewGroup.getHeight();
            n17 = (viewGroup = viewGroup.getLayoutParams()) instanceof ViewGroup.MarginLayoutParams;
            if (n17 != 0) {
                viewGroup = (ViewGroup.MarginLayoutParams)viewGroup;
                n17 = viewGroup.topMargin;
                n20 = viewGroup.bottomMargin;
                n18 += (n17 += n20);
            }
        }
        n18 = n18 * 2 + n19;
        n20 = 1;
        if (n14 > n8 && n16 > n18) {
            n8 = 0;
            object = null;
        } else {
            n8 = 1;
        }
        n14 = (int)(mu22.A ? 1 : 0);
        if (n14 != n8) {
            mu22.A = n8;
            object = new du2_0(mu22);
            view.post((Runnable)object);
        }
        if ((n7 -= n3) != (n15 -= n10)) {
            bl2 = true;
        }
        if ((n3 = (int)(mu22.A ? 1 : 0)) == 0 && bl2) {
            eu2 eu22 = new eu2(mu22);
            view.post((Runnable)eu22);
        }
    }
}

