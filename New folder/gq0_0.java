/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.util.Pair
 */
import android.content.Intent;
import android.util.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from gq0
 */
public final class gq0_0
implements w3 {
    public final /* synthetic */ bk_1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ gq0_0(bk_1 bk_12, int n3, Ref$ObjectRef ref$ObjectRef) {
        this.a = bk_12;
        this.b = n3;
        this.c = ref$ObjectRef;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(Object object) {
        Object object2 = this.a;
        int n3 = this.b;
        Ref$ObjectRef ref$ObjectRef = this.c;
        object = (Pair)object;
        Object object3 = "$launcher";
        Intrinsics.checkNotNullParameter(ref$ObjectRef, (String)object3);
        if (object2 == null) {
            object2 = new dk_1();
        }
        object3 = ((Pair)object).first;
        String string2 = "result.first";
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        object3 = (Number)object3;
        int n4 = ((Number)object3).intValue();
        object = (Intent)((Pair)object).second;
        object2.onActivityResult(n3, n4, (Intent)object);
        object = (I3)ref$ObjectRef.element;
        if (object == null) return;
        synchronized (object) {
            ((I3)object).b();
            object2 = null;
            ref$ObjectRef.element = null;
            object2 = Unit.a;
            return;
        }
    }
}

