/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.DisplayCutout
 *  android.view.WindowInsets
 */
package androidx.core.view;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import androidx.core.view.f;
import androidx.core.view.f$f;
import androidx.core.view.f$g;
import java.util.Objects;

public class f$h
extends f$g {
    public f$h(f f5, WindowInsets windowInsets) {
        super(f5, windowInsets);
    }

    public f a() {
        WindowInsets windowInsets = ep.b(this.c);
        return androidx.core.view.f.h(null, windowInsets);
    }

    public or0 e() {
        Object object = FG3.a(this.c);
        if (object == null) {
            object = null;
        } else {
            or0 or02 = new or0((DisplayCutout)object);
            object = or02;
        }
        return object;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof f$h;
        if (!bl4) {
            return false;
        }
        object = (f$h)object;
        WindowInsets windowInsets = this.c;
        Object object2 = ((f$f)object).c;
        bl4 = Objects.equals(windowInsets, object2);
        if (!bl4 || !(bl2 = Objects.equals(object2 = this.g, object = ((f$f)object).g))) {
            bl3 = false;
        }
        return bl3;
    }

    public int hashCode() {
        return this.c.hashCode();
    }
}

