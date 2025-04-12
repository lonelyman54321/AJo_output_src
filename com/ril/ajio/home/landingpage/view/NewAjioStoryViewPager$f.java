/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 */
package com.ril.ajio.home.landingpage.view;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.a;
import androidx.viewpager.widget.ViewPager;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;

public final class NewAjioStoryViewPager$f
extends a {
    public final /* synthetic */ NewAjioStoryViewPager a;

    public NewAjioStoryViewPager$f(NewAjioStoryViewPager newAjioStoryViewPager) {
        this.a = newAjioStoryViewPager;
    }

    public final void onInitializeAccessibilityEvent(View object, AccessibilityEvent accessibilityEvent) {
        int n3;
        int n4;
        super.onInitializeAccessibilityEvent((View)object, accessibilityEvent);
        object = ViewPager.class.getName();
        accessibilityEvent.setClassName((CharSequence)object);
        object = this.a;
        Uk2 uk2 = object.f;
        if (uk2 == null || (n4 = uk2.c()) <= (n3 = 1)) {
            n3 = 0;
        }
        accessibilityEvent.setScrollable(n3 != 0);
        n4 = accessibilityEvent.getEventType();
        n3 = 4096;
        if (n4 == n3 && (uk2 = object.f) != null) {
            n4 = uk2.c();
            accessibilityEvent.setItemCount(n4);
            n4 = object.g;
            accessibilityEvent.setFromIndex(n4);
            int n7 = object.g;
            accessibilityEvent.setToIndex(n7);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(View object, C2 c2) {
        int n3;
        int n4;
        super.onInitializeAccessibilityNodeInfo((View)object, c2);
        object = ViewPager.class.getName();
        c2.l((CharSequence)object);
        object = this.a;
        Uk2 uk2 = ((NewAjioStoryViewPager)((Object)object)).f;
        int n7 = 1;
        if (uk2 != null && (n4 = uk2.c()) > n7) {
            n4 = 1;
        } else {
            n4 = 0;
            uk2 = null;
        }
        c2.r(n4 != 0);
        n4 = (int)(((NewAjioStoryViewPager)((Object)object)).canScrollHorizontally(n7) ? 1 : 0);
        if (n4 != 0) {
            n4 = 4096;
            c2.a(n4);
        }
        if ((n3 = ((NewAjioStoryViewPager)((Object)object)).canScrollHorizontally(n4 = -1)) != 0) {
            n3 = 8192;
            c2.a(n3);
        }
    }

    public final boolean performAccessibilityAction(View view, int n3, Bundle bundle) {
        int n4 = super.performAccessibilityAction(view, n3, bundle);
        int n7 = 1;
        if (n4 != 0) {
            return n7 != 0;
        }
        n4 = 4096;
        NewAjioStoryViewPager newAjioStoryViewPager = this.a;
        if (n3 != n4) {
            n4 = 8192;
            if (n3 != n4) {
                return false;
            }
            n4 = (int)(newAjioStoryViewPager.canScrollHorizontally(-1) ? 1 : 0);
            if (n4 != 0) {
                n4 = newAjioStoryViewPager.g - n7;
                newAjioStoryViewPager.setCurrentItem(n4);
                return n7 != 0;
            }
            return false;
        }
        n4 = (int)(newAjioStoryViewPager.canScrollHorizontally(n7) ? 1 : 0);
        if (n4 != 0) {
            n4 = newAjioStoryViewPager.g + n7;
            newAjioStoryViewPager.setCurrentItem(n4);
            return n7 != 0;
        }
        return false;
    }
}

