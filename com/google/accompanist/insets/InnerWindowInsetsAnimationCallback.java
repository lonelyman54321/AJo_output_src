/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsAnimationCompat$b;
import androidx.core.view.WindowInsetsAnimationCompat$d;
import androidx.core.view.f;
import com.google.accompanist.insets.InsetsKt;
import com.google.accompanist.insets.MutableInsets;
import com.google.accompanist.insets.MutableWindowInsetsType;
import com.google.accompanist.insets.RootWindowInsets;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

final class InnerWindowInsetsAnimationCallback
extends WindowInsetsAnimationCompat$b {
    private final RootWindowInsets windowInsets;

    public InnerWindowInsetsAnimationCallback(RootWindowInsets rootWindowInsets) {
        Intrinsics.checkNotNullParameter(rootWindowInsets, "windowInsets");
        super(0);
        this.windowInsets = rootWindowInsets;
    }

    private final void updateAnimation(MutableWindowInsetsType object, f iterator, List object2, int n3) {
        block7: {
            int n4;
            Object object3;
            block6: {
                boolean bl2 = (object2 = (Iterable)object2) instanceof Collection;
                if (!bl2) break block6;
                object3 = object2;
                object3 = (Collection)object2;
                bl2 = object3.isEmpty();
                if (bl2) break block7;
            }
            object3 = ((Iterable)object2).iterator();
            while ((n4 = object3.hasNext()) != 0) {
                WindowInsetsAnimationCompat$d windowInsetsAnimationCompat$d = ((WindowInsetsAnimationCompat)object3.next()).a;
                n4 = windowInsetsAnimationCompat$d.d() | n3;
                if (n4 == 0) continue;
                object3 = ((MutableWindowInsetsType)object).getAnimatedInsets();
                iterator = ((f)((Object)iterator)).a.f(n3);
                Object object4 = "platformInsets.getInsets(type)";
                Intrinsics.checkNotNullExpressionValue(iterator, (String)object4);
                InsetsKt.updateFrom((MutableInsets)object3, (ei1)((Object)iterator));
                iterator = ((Iterable)object2).iterator();
                boolean bl3 = iterator.hasNext();
                if (bl3) {
                    object2 = ((WindowInsetsAnimationCompat)iterator.next()).a;
                    float f5 = ((WindowInsetsAnimationCompat$d)object2).b();
                    while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                        object4 = ((WindowInsetsAnimationCompat)iterator.next()).a;
                        float f6 = ((WindowInsetsAnimationCompat$d)object4).b();
                        f5 = Math.max(f5, f6);
                    }
                    ((MutableWindowInsetsType)object).setAnimationFraction(f5);
                    break;
                }
                object = new NoSuchElementException();
                throw object;
            }
        }
    }

    public void onEnd(WindowInsetsAnimationCompat object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "animation");
        Object object2 = ((WindowInsetsAnimationCompat)object).a;
        int n4 = ((WindowInsetsAnimationCompat$d)object2).d() & 8;
        if (n4 != 0) {
            object2 = this.windowInsets.getIme();
            ((MutableWindowInsetsType)object2).onAnimationEnd();
        }
        if ((n4 = ((WindowInsetsAnimationCompat$d)(object = ((WindowInsetsAnimationCompat)object).a)).d() & 1) != 0) {
            object2 = this.windowInsets.getStatusBars();
            ((MutableWindowInsetsType)object2).onAnimationEnd();
        }
        if ((n4 = ((WindowInsetsAnimationCompat$d)object).d() & 2) != 0) {
            object2 = this.windowInsets.getNavigationBars();
            ((MutableWindowInsetsType)object2).onAnimationEnd();
        }
        if ((n4 = ((WindowInsetsAnimationCompat$d)object).d() & 0x10) != 0) {
            object2 = this.windowInsets.getSystemGestures();
            ((MutableWindowInsetsType)object2).onAnimationEnd();
        }
        if ((n3 = ((WindowInsetsAnimationCompat$d)object).d() & 0x80) != 0) {
            object = this.windowInsets.getDisplayCutout();
            ((MutableWindowInsetsType)object).onAnimationEnd();
        }
    }

    public void onPrepare(WindowInsetsAnimationCompat object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "animation");
        Object object2 = ((WindowInsetsAnimationCompat)object).a;
        int n4 = ((WindowInsetsAnimationCompat$d)object2).d() & 8;
        if (n4 != 0) {
            object2 = this.windowInsets.getIme();
            ((MutableWindowInsetsType)object2).onAnimationStart();
        }
        if ((n4 = ((WindowInsetsAnimationCompat$d)(object = ((WindowInsetsAnimationCompat)object).a)).d() & 1) != 0) {
            object2 = this.windowInsets.getStatusBars();
            ((MutableWindowInsetsType)object2).onAnimationStart();
        }
        if ((n4 = ((WindowInsetsAnimationCompat$d)object).d() & 2) != 0) {
            object2 = this.windowInsets.getNavigationBars();
            ((MutableWindowInsetsType)object2).onAnimationStart();
        }
        if ((n4 = ((WindowInsetsAnimationCompat$d)object).d() & 0x10) != 0) {
            object2 = this.windowInsets.getSystemGestures();
            ((MutableWindowInsetsType)object2).onAnimationStart();
        }
        if ((n3 = ((WindowInsetsAnimationCompat$d)object).d() & 0x80) != 0) {
            object = this.windowInsets.getDisplayCutout();
            ((MutableWindowInsetsType)object).onAnimationStart();
        }
    }

    public f onProgress(f f5, List list) {
        Intrinsics.checkNotNullParameter(f5, "platformInsets");
        Intrinsics.checkNotNullParameter(list, "runningAnimations");
        MutableWindowInsetsType mutableWindowInsetsType = this.windowInsets.getIme();
        this.updateAnimation(mutableWindowInsetsType, f5, list, 8);
        mutableWindowInsetsType = this.windowInsets.getStatusBars();
        this.updateAnimation(mutableWindowInsetsType, f5, list, 1);
        mutableWindowInsetsType = this.windowInsets.getNavigationBars();
        this.updateAnimation(mutableWindowInsetsType, f5, list, 2);
        mutableWindowInsetsType = this.windowInsets.getSystemGestures();
        this.updateAnimation(mutableWindowInsetsType, f5, list, 16);
        mutableWindowInsetsType = this.windowInsets.getDisplayCutout();
        this.updateAnimation(mutableWindowInsetsType, f5, list, 128);
        return f5;
    }
}

