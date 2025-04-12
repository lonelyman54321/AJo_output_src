/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.ripple.RippleContainer;
import kotlin.jvm.internal.Intrinsics;

public final class BP2 {
    public static final boolean a = Intrinsics.areEqual(Build.DEVICE, "layoutlib");

    public static final RippleContainer a(ViewGroup viewGroup) {
        RippleContainer rippleContainer;
        block2: {
            int n3 = viewGroup.getChildCount();
            for (int i3 = 0; i3 < n3; ++i3) {
                rippleContainer = viewGroup.getChildAt(i3);
                boolean bl2 = rippleContainer instanceof RippleContainer;
                if (!bl2) {
                    continue;
                }
                break block2;
            }
            Context context = viewGroup.getContext();
            rippleContainer = new RippleContainer(context);
            viewGroup.addView((View)rippleContainer);
        }
        return rippleContainer;
    }

    public static final ViewGroup b(View object) {
        boolean bl2;
        while (!(bl2 = object instanceof ViewGroup)) {
            Object object2 = object;
            object2 = object.getParent();
            boolean bl3 = object2 instanceof View;
            if (bl3) {
                object = object2;
                continue;
            }
            object2 = new StringBuilder("Couldn't find a valid parent for ");
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
            object = ((StringBuilder)object2).toString();
            object = object.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        return (ViewGroup)object;
    }
}

