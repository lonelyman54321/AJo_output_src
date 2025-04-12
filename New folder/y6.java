/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnKeyListener
 */
import android.view.KeyEvent;
import android.view.View;
import androidx.navigation.e;
import androidx.navigation.i;
import kotlin.jvm.internal.Intrinsics;

public final class y6
implements View.OnKeyListener {
    public final /* synthetic */ z6_0 a;

    public /* synthetic */ y6(z6_0 z6_02) {
        this.a = z6_02;
    }

    public final boolean onKey(View object, int n3, KeyEvent keyEvent) {
        object = "this$0";
        z6_0 z6_02 = this.a;
        Intrinsics.checkNotNullParameter(z6_02, (String)object);
        int n4 = keyEvent.getAction();
        int n7 = 1;
        if (n4 == n7 && n3 == (n4 = 4)) {
            object = z6_02.w;
            String string2 = "navController";
            Object object2 = null;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n4 = 0;
                object = null;
            }
            if ((object = ((e)object).h()) != null) {
                object = ((i)object).h;
            } else {
                n4 = 0;
                object = null;
            }
            String string3 = "ajio_category_screen_l2";
            n4 = Intrinsics.areEqual(object, string3);
            if (n4) {
                object = z6_02.w;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object2 = object;
                }
                ((e)object2).q();
            } else {
                object = z6_02.x;
                if (object != null) {
                    object.a();
                }
            }
        } else {
            n7 = 0;
            keyEvent = null;
        }
        return n7;
    }
}

