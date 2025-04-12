/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.n;
import androidx.fragment.app.n$b;
import androidx.fragment.app.n$c$b;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class m
implements Runnable {
    public final /* synthetic */ n a;
    public final /* synthetic */ n$b b;

    public /* synthetic */ m(n n3, n$b n$b) {
        this.a = n3;
        this.b = n$b;
    }

    public final void run() {
        n n3 = this.a;
        Intrinsics.checkNotNullParameter(n3, "this$0");
        n$b n$b = this.b;
        Intrinsics.checkNotNullParameter(n$b, "$operation");
        Object object = n3.b;
        boolean bl2 = ((ArrayList)object).contains(n$b);
        if (bl2) {
            object = n$b.a;
            n$b = n$b.c.mView;
            String string2 = "operation.fragment.mView";
            Intrinsics.checkNotNullExpressionValue(n$b, string2);
            n3 = n3.a;
            ((n$c$b)((Object)object)).applyState((View)n$b, (ViewGroup)n3);
        }
    }
}

