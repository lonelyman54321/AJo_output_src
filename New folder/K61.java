/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.navigation.e;
import androidx.navigation.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class K61
implements Function1 {
    public final /* synthetic */ e a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ dr0_0 c;

    public /* synthetic */ K61(e e2, Activity activity, dr0_0 dr0_02) {
        this.a = e2;
        this.b = activity;
        this.c = dr0_02;
    }

    public final Object invoke(Object object) {
        object = (o)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$this_switchTabs");
        Object object3 = "$this$navigate";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object2 = ((e)object2).i().n;
        if (object2 != null) {
            object3 = new Object();
            ((o)object).a((String)object2, (Function1)object3);
        }
        object2 = null;
        ((o)object).b = false;
        ((o)object).c = false;
        object = this.b;
        if (object != null && (object3 = this.c) != null && (object = dr0_0.w((Activity)object)) != null) {
            object3 = ((fq0_2)object).q;
            Object object4 = null;
            String string2 = "fleekViewModel";
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object3 = null;
            }
            ((dr0_0)object3).Z(false);
            object2 = ((fq0_2)object).q;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object4 = object2;
            }
            object2 = Boolean.FALSE;
            object3 = ((dr0_0)object4).s;
            ((h83_0)object3).setValue(object2);
            ((fq0_2)object).cb();
        }
        return Unit.a;
    }
}

