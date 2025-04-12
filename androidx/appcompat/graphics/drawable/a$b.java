/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 */
package androidx.appcompat.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.graphics.drawable.b;
import androidx.appcompat.graphics.drawable.b$a;
import kotlin.jvm.internal.Intrinsics;

public final class a$b
extends b$a {
    public pb1_0 I;
    public ca3 J;

    public a$b(a$b object, a object2, Resources resources) {
        super((b$a)((Object)object), (b)((Object)object2), resources);
        if (object != null) {
            this.I = object2 = object.I;
            object = object.J;
            this.J = object;
        } else {
            super();
            this.I = object;
            super();
            this.J = object;
        }
    }

    public final void e() {
        Cloneable cloneable;
        this.I = cloneable = this.I.e();
        cloneable = this.J.d();
        this.J = cloneable;
    }

    public final int g(int n3) {
        int n4 = 0;
        Object object = null;
        if (n3 >= 0) {
            Object object2;
            Object object3 = this.J;
            object = 0;
            object3.getClass();
            Intrinsics.checkNotNullParameter(object3, "<this>");
            int[] nArray = ((ca3)object3).b;
            int n7 = ((ca3)object3).d;
            n3 = A62.a(n7, n3, nArray);
            if (n3 >= 0 && (object2 = ((ca3)object3).c[n3]) != (object3 = da3_0.a)) {
                object = object2;
            }
            n4 = (Integer)object;
        }
        return n4;
    }

    public final Drawable newDrawable() {
        a a2 = new a(this, null);
        return a2;
    }

    public final Drawable newDrawable(Resources resources) {
        a a2 = new a(this, resources);
        return a2;
    }
}

