/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewParent
 */
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AbstractComposeView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class JC3
implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AbstractComposeView a;

    public JC3(AbstractComposeView abstractComposeView) {
        this.a = abstractComposeView;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View object) {
        boolean bl2;
        block5: {
            object = this.a;
            String string2 = "<this>";
            Intrinsics.checkNotNullParameter(object, string2);
            Object object2 = object.getParent();
            Object object3 = eD3.a;
            object2 = ez2_1.d((Function1)object3, object2).iterator();
            while (true) {
                boolean bl3 = object2.hasNext();
                bl2 = false;
                if (!bl3) break block5;
                object3 = (ViewParent)object2.next();
                int n3 = object3 instanceof View;
                if (n3 == 0) continue;
                object3 = (View)object3;
                Intrinsics.checkNotNullParameter(object3, string2);
                n3 = vw2.b;
                object3 = object3.getTag(n3);
                n3 = object3 instanceof Boolean;
                if (n3 != 0) {
                    object3 = (Boolean)object3;
                } else {
                    bl3 = false;
                    object3 = null;
                }
                if (object3 != null) {
                    bl2 = (Boolean)object3;
                }
                if (bl2) break;
            }
            bl2 = true;
        }
        if (!bl2) {
            ((AbstractComposeView)((Object)object)).c();
        }
    }
}

