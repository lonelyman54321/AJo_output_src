/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.view.View
 */
package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import androidx.fragment.app.n$c;
import androidx.fragment.app.n$c$a;
import androidx.fragment.app.n$c$b;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

public final class n$b
extends n$c {
    public final h l;

    public n$b(n$c$b n$c$b, n$c$a n$c$a, h h3) {
        Intrinsics.checkNotNullParameter((Object)n$c$b, "finalState");
        Intrinsics.checkNotNullParameter((Object)n$c$a, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(h3, "fragmentStateManager");
        Fragment fragment = h3.c;
        Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
        super(n$c$b, n$c$a, fragment);
        this.l = h3;
    }

    public final void b() {
        super.b();
        this.c.mTransitioning = false;
        this.l.i();
    }

    public final void e() {
        boolean bl2 = this.h;
        if (bl2) {
            return;
        }
        bl2 = true;
        float f5 = Float.MIN_VALUE;
        this.h = bl2;
        Object object = this.b;
        n$c$a n$c$a = n$c$a.ADDING;
        String string2 = "FragmentManager";
        int n3 = 2;
        String string3 = "fragmentStateManager.fragment";
        h h3 = this.l;
        if (object == n$c$a) {
            float f6;
            float f7;
            int n4;
            object = h3.c;
            Intrinsics.checkNotNullExpressionValue(object, string3);
            n$c$a = ((Fragment)object).mView.findFocus();
            if (n$c$a != null) {
                ((Fragment)object).setFocusedView((View)n$c$a);
                n4 = Log.isLoggable((String)string2, (int)n3);
                if (n4 != 0) {
                    ((Object)((Object)n$c$a)).toString();
                    ((Fragment)object).toString();
                }
            }
            n$c$a = this.c.requireView();
            Intrinsics.checkNotNullExpressionValue((Object)n$c$a, "this.fragment.requireView()");
            string2 = n$c$a.getParent();
            n3 = 0;
            if (string2 == null) {
                h3.a();
                n$c$a.setAlpha(0.0f);
            }
            if ((n4 = (f7 = (f6 = n$c$a.getAlpha()) - 0.0f) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) == 0 && (n4 = n$c$a.getVisibility()) == 0) {
                n4 = 4;
                f6 = 5.6E-45f;
                n$c$a.setVisibility(n4);
            }
            f5 = ((Fragment)object).getPostOnViewCreatedAlpha();
            n$c$a.setAlpha(f5);
        } else {
            n$c$a = n$c$a.REMOVING;
            if (object == n$c$a) {
                object = h3.c;
                Intrinsics.checkNotNullExpressionValue(object, string3);
                n$c$a = ((Fragment)object).requireView();
                string3 = "fragment.requireView()";
                Intrinsics.checkNotNullExpressionValue((Object)n$c$a, string3);
                boolean bl3 = Log.isLoggable((String)string2, (int)n3);
                if (bl3) {
                    string2 = n$c$a.findFocus();
                    Objects.toString(string2);
                    ((Object)((Object)n$c$a)).toString();
                    ((Fragment)object).toString();
                }
                n$c$a.clearFocus();
            }
        }
    }
}

