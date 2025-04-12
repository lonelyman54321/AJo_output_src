/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.view.ViewGroup
 */
package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.b$g;
import androidx.fragment.app.c;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class b$g$b
extends Lambda
implements Function0 {
    public final /* synthetic */ b$g c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Ref$ObjectRef f;

    public b$g$b(b$g b$g, ViewGroup viewGroup, Object object, Ref$ObjectRef ref$ObjectRef) {
        this.c = b$g;
        this.d = viewGroup;
        this.e = object;
        this.f = ref$ObjectRef;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        Object object2 = ((b$g)object).f;
        Object object3 = this.d;
        Object object4 = this.e;
        ((b$g)object).q = object2 = ((GW0)object2).i((ViewGroup)object3, object4);
        if (object2 != null) {
            object2 = new c((ViewGroup)object3, (b$g)object, object4);
            object3 = this.f;
            object3.element = object2;
            object2 = "FragmentManager";
            int n3 = 2;
            boolean bl2 = Log.isLoggable((String)object2, (int)n3);
            if (bl2) {
                object2 = ((b$g)object).d;
                Objects.toString(object2);
                object = ((b$g)object).e;
                Objects.toString(object);
            }
            return Unit.a;
        }
        object = new StringBuilder("Unable to start transition ");
        ((StringBuilder)object).append(object4);
        ((StringBuilder)object).append(" for container ");
        ((StringBuilder)object).append(object3);
        ((StringBuilder)object).append('.');
        object = ((StringBuilder)object).toString();
        object = object.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }
}

