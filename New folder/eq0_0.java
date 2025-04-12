/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.Window
 */
import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AbstractComposeView;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from eq0
 */
public final class eq0_0
extends AbstractComposeView
implements nq0_0 {
    public final Window i;
    public final ParcelableSnapshotMutableState j;
    public boolean k;
    public boolean l;

    public eq0_0(Context object, Window window) {
        super((Context)object, null, 6, 0);
        this.i = window;
        object = J83.g(z10.a);
        this.j = object;
    }

    public final void a(b30_0 object, int n3) {
        Function2 function2;
        object = object.g(1735448596);
        int n4 = n3 & 6;
        int n7 = 2;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).x(this) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        if ((n4 &= 3) == n7 && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            function2 = (Function2)this.j.getValue();
            n7 = 0;
            Integer n8 = 0;
            function2.invoke(object, n8);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = function2 = new eq0$a(this, n3);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void e(boolean bl2, int n3, int n4, int n7, int n8) {
        void var5_8;
        void var4_7;
        void var3_6;
        int n10;
        super.e(bl2, n10, (int)var3_6, (int)var4_7, (int)var5_8);
        boolean bl3 = this.k;
        if (!bl3) {
            boolean bl4 = false;
            View view = this.getChildAt(0);
            if (view == null) {
                return;
            }
            n10 = view.getMeasuredWidth();
            int n14 = view.getMeasuredHeight();
            Window window = this.i;
            window.setLayout(n10, n14);
        }
    }

    public final void f(int n3, int n4) {
        int n7 = this.k;
        if (n7 != 0) {
            super.f(n3, n4);
        } else {
            DisplayMetrics displayMetrics = this.getContext().getResources().getDisplayMetrics();
            float f5 = displayMetrics.density;
            Configuration configuration = this.getContext().getResources().getConfiguration();
            n3 = Math.round((float)configuration.screenWidthDp * f5);
            n4 = -1 << -1;
            n3 = View.MeasureSpec.makeMeasureSpec((int)n3, (int)n4);
            DisplayMetrics displayMetrics2 = this.getContext().getResources().getDisplayMetrics();
            float f6 = displayMetrics2.density;
            Configuration configuration2 = this.getContext().getResources().getConfiguration();
            int n8 = configuration2.screenHeightDp;
            float f7 = (float)n8 * f6;
            n7 = Math.round(f7);
            n4 = View.MeasureSpec.makeMeasureSpec((int)n7, (int)n4);
            super.f(n3, n4);
        }
    }

    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.l;
    }

    public final Window getWindow() {
        return this.i;
    }
}

