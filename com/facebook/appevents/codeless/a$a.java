/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.facebook.appevents.codeless;

import android.view.View;
import com.facebook.appevents.codeless.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

public final class a$a
implements View.OnClickListener {
    public final CB0 a;
    public final WeakReference b;
    public final WeakReference c;
    public final View.OnClickListener d;
    public final boolean e;

    public a$a(CB0 onClickListener, View view, View view2) {
        Intrinsics.checkNotNullParameter(onClickListener, "mapping");
        Intrinsics.checkNotNullParameter(view, "rootView");
        Intrinsics.checkNotNullParameter(view2, "hostView");
        this.a = onClickListener;
        this.b = onClickListener = new WeakReference(view2);
        this.c = onClickListener = new WeakReference(view);
        this.d = onClickListener = xc3_0.f(view2);
        this.e = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(View object) {
        Throwable throwable3;
        block9: {
            Object object2;
            block8: {
                boolean bl2 = td0.b(this);
                if (bl2) {
                    return;
                }
                try {
                    bl2 = td0.b(this);
                    if (bl2) {
                        return;
                    }
                    object2 = "view";
                }
                catch (Throwable throwable2) {
                    td0.a(this, throwable2);
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    object2 = this.d;
                    if (object2 == null) break block8;
                    object2.onClick(object);
                }
                catch (Throwable throwable3) {
                    break block9;
                }
            }
            object = this.c;
            object = object.get();
            object2 = this.b;
            object2 = ((Reference)object2).get();
            object2 = (View)object2;
            if (object != null && object2 != null) {
                CB0 cB0 = this.a;
                String string2 = "null cannot be cast to non-null type com.facebook.appevents.codeless.internal.EventBinding";
                Intrinsics.checkNotNull(cB0, string2);
                com.facebook.appevents.codeless.a.a(cB0, object, (View)object2);
            }
            return;
        }
        td0.a(this, throwable3);
    }
}

