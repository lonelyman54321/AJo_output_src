/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.SparseArray
 *  android.view.View
 */
package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.ViewFactoryHolder$a;
import androidx.compose.ui.viewinterop.ViewFactoryHolder$b;
import androidx.compose.ui.viewinterop.ViewFactoryHolder$c;
import androidx.compose.ui.viewinterop.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class ViewFactoryHolder
extends AndroidViewHolder {
    public iS2$a A;
    public Function1 B;
    public Function1 C;
    public Function1 D;
    public final View x;
    public final pU1 y;
    public final iS2 z;

    public ViewFactoryHolder() {
        throw null;
    }

    public ViewFactoryHolder(Context object, Function1 fx0_22, A30 object2, iS2 iS22, int n3, sg2_0 sg2_02) {
        Object object3;
        fx0_22 = (View)fx0_22.invoke(object);
        pU1 pU12 = new pU1();
        super((Context)object, (A30)object2, n3, pU12, (View)fx0_22, sg2_02);
        this.x = fx0_22;
        this.y = pU12;
        this.z = iS22;
        this.setClipChildren(false);
        object = String.valueOf(n3);
        object2 = null;
        if (iS22 != null) {
            object3 = iS22.f((String)object);
        } else {
            n3 = 0;
            object3 = null;
        }
        boolean bl2 = object3 instanceof SparseArray;
        if (bl2) {
            object2 = object3;
            object2 = (SparseArray)object3;
        }
        if (object2 != null) {
            fx0_22.restoreHierarchyState((SparseArray)object2);
        }
        if (iS22 != null) {
            super(this);
            object = iS22.b((String)object, (Function0)fx0_22);
            this.setSavableRegistryEntry((iS2$a)object);
        }
        object = androidx.compose.ui.viewinterop.b.a;
        this.B = object;
        this.C = object;
        this.D = object;
    }

    public static final void e(ViewFactoryHolder viewFactoryHolder) {
        viewFactoryHolder.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(iS2$a iS2$a) {
        iS2$a iS2$a2 = this.A;
        if (iS2$a2 != null) {
            iS2$a2.unregister();
        }
        this.A = iS2$a;
    }

    public final pU1 getDispatcher() {
        return this.y;
    }

    public final Function1 getReleaseBlock() {
        return this.D;
    }

    public final Function1 getResetBlock() {
        return this.C;
    }

    public final Function1 getUpdateBlock() {
        return this.B;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(Function1 fx0_22) {
        this.D = fx0_22;
        fx0_22 = new ViewFactoryHolder$a(this);
        this.setRelease((Function0)fx0_22);
    }

    public final void setResetBlock(Function1 fx0_22) {
        this.C = fx0_22;
        fx0_22 = new ViewFactoryHolder$b(this);
        this.setReset((Function0)fx0_22);
    }

    public final void setUpdateBlock(Function1 fx0_22) {
        this.B = fx0_22;
        fx0_22 = new ViewFactoryHolder$c(this);
        this.setUpdate((Function0)fx0_22);
    }
}

