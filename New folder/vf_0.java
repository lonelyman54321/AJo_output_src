/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.accessibility.AccessibilityNodeInfo
 */
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.c;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.a;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Vf
 */
public final class vf_0
extends a {
    public final /* synthetic */ AndroidComposeView a;
    public final /* synthetic */ xp1_0 b;
    public final /* synthetic */ AndroidComposeView c;

    public vf_0(AndroidComposeView androidComposeView, xp1_0 xp1_02, AndroidComposeView androidComposeView2) {
        this.a = androidComposeView;
        this.b = xp1_02;
        this.c = androidComposeView2;
    }

    public final void onInitializeAccessibilityNodeInfo(View object, C2 object2) {
        GY2 gY2;
        int n3;
        Object object3;
        int n4;
        Object object4;
        block17: {
            block16: {
                int n7;
                super.onInitializeAccessibilityNodeInfo((View)object, (C2)object2);
                object = this.a;
                object4 = ((AndroidComposeView)object).o;
                boolean n74 = ((c)object4).o();
                if (n74) {
                    object4 = ((C2)object2).a;
                    n4 = 0;
                    object3 = null;
                    object4.setVisibleToUser(false);
                }
                object4 = this.b;
                object3 = Vf$a.c;
                if ((object3 = JY2.b((xp1_0)object4, (Function1)object3)) != null) {
                    n4 = ((xp1_0)object3).b;
                    object3 = n4;
                } else {
                    n4 = 0;
                    object3 = null;
                }
                n3 = -1;
                if (object3 == null) break block16;
                gY2 = ((AndroidComposeView)object).getSemanticsOwner().a();
                int n8 = (Integer)object3;
                if (n8 != (n7 = gY2.g)) break block17;
            }
            object3 = n3;
        }
        ((C2)object2).b = n4 = ((Integer)object3).intValue();
        gY2 = ((C2)object2).a;
        AndroidComposeView androidComposeView = this.c;
        gY2.setParent((View)androidComposeView, n4);
        int n10 = ((xp1_0)object4).b;
        object3 = ((AndroidComposeView)object).o;
        Object object5 = ((c)object3).z;
        int n14 = ((Li1)object5).c(n10);
        int n15 = 22;
        if (n14 != n3) {
            AndroidViewHolder androidViewHolder = VY2.f(((AndroidComposeView)object).getAndroidViewsHandler$ui_release(), n14);
            if (androidViewHolder != null) {
                n14 = Build.VERSION.SDK_INT;
                if (n14 >= n15) {
                    U1.a((AccessibilityNodeInfo)gY2, androidViewHolder);
                }
            } else {
                int n16 = Build.VERSION.SDK_INT;
                if (n16 >= n15) {
                    T1.a((AccessibilityNodeInfo)gY2, (View)androidComposeView, n14);
                }
            }
            object5 = ((c)object3).B;
            AndroidComposeView.B((AndroidComposeView)object, n10, (AccessibilityNodeInfo)gY2, (String)object5);
        }
        if ((n14 = ((Li1)(object5 = ((c)object3).A)).c(n10)) != n3) {
            AndroidViewHolder androidViewHolder = VY2.f(((AndroidComposeView)object).getAndroidViewsHandler$ui_release(), n14);
            if (androidViewHolder != null) {
                ((C2)object2).u((View)androidViewHolder);
            } else {
                int n17 = Build.VERSION.SDK_INT;
                if (n17 >= n15) {
                    X1.a((AccessibilityNodeInfo)gY2, (View)androidComposeView, n14);
                }
            }
            object2 = ((c)object3).C;
            AndroidComposeView.B((AndroidComposeView)object, n10, (AccessibilityNodeInfo)gY2, (String)object2);
        }
    }
}

