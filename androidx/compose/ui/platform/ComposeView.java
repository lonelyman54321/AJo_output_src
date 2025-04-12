/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ComposeView$a;
import kotlin.jvm.functions.Function2;

public final class ComposeView
extends AbstractComposeView {
    public final ParcelableSnapshotMutableState i;
    public boolean j;

    public ComposeView(Context context) {
        this(context, null, 6, 0);
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public ComposeView(Context object, AttributeSet attributeSet, int n3) {
        super((Context)object, attributeSet, n3);
        object = J83.g(null);
        this.i = object;
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int n3, int n4) {
        if ((n3 &= 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(b30_0 object, int n3) {
        Function2 function2;
        object = object.g(420213850);
        int n4 = n3 & 6;
        int n7 = 2;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).x((Object)this) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        if ((n4 &= 3) == n7 && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            function2 = (Function2)this.i.getValue();
            n7 = 0;
            if (function2 == null) {
                n4 = 358373017;
                ((j30_0)object).K(n4);
            } else {
                int n8 = 150107752;
                ((j30_0)object).K(n8);
                Integer n10 = 0;
                function2.invoke(object, n10);
            }
            ((j30_0)object).T(false);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = function2 = new ComposeView$a(this, n3);
        }
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.j;
    }

    public final void setContent(Function2 object) {
        boolean bl2;
        this.j = bl2 = true;
        Object object2 = this.i;
        ((h83_0)object2).setValue(object);
        boolean bl3 = this.isAttachedToWindow();
        if (bl3) {
            object = this.d;
            if (object == null && !(bl3 = this.isAttachedToWindow())) {
                object2 = "createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
            this.d();
        }
    }
}

