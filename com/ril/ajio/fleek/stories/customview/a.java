/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.fleek.stories.customview;

import com.ril.ajio.fleek.stories.customview.PausableProgressBar;
import com.ril.ajio.fleek.stories.customview.PausableProgressBar$a;
import com.ril.ajio.fleek.stories.customview.StoriesProgressView;
import com.ril.ajio.fleek.stories.customview.StoriesProgressView$b;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class a
implements PausableProgressBar$a {
    public final /* synthetic */ StoriesProgressView a;
    public final /* synthetic */ int b;

    public a(StoriesProgressView storiesProgressView, int n3) {
        this.a = storiesProgressView;
        this.b = n3;
    }

    public final void a() {
        int n3;
        Object object = this.a;
        ((StoriesProgressView)((Object)object)).d = n3 = this.b;
        object = ((StoriesProgressView)((Object)object)).b;
        if (object != null) {
            object.X6(n3);
        }
    }

    public final void b() {
        StoriesProgressView storiesProgressView = this.a;
        Object object = storiesProgressView.b;
        if (object != null) {
            object.J();
        }
        int n3 = storiesProgressView.f;
        ArrayList arrayList = storiesProgressView.a;
        if (n3 != 0) {
            int n4;
            object = storiesProgressView.b;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                object.B0();
            }
            if ((n4 = (n3 = storiesProgressView.d) + -1) >= 0) {
                ((PausableProgressBar)((Object)arrayList.get(n4))).setMinWithoutCallback();
                storiesProgressView.d = n3 = storiesProgressView.d + -1;
                object = (PausableProgressBar)((Object)arrayList.get(n3));
                ((PausableProgressBar)((Object)object)).b();
            } else {
                object = (PausableProgressBar)((Object)arrayList.get(n3));
                ((PausableProgressBar)((Object)object)).b();
            }
            storiesProgressView.f = false;
            return;
        }
        n3 = storiesProgressView.d + 1;
        int n7 = arrayList.size() + -1;
        if (n3 <= n7) {
            StoriesProgressView$b storiesProgressView$b = storiesProgressView.b;
            if (storiesProgressView$b != null) {
                Intrinsics.checkNotNull(storiesProgressView$b);
                storiesProgressView$b.V();
            }
            object = (PausableProgressBar)((Object)arrayList.get(n3));
            ((PausableProgressBar)((Object)object)).b();
            storiesProgressView.d = n3 = storiesProgressView.d + 1;
        } else {
            object = storiesProgressView.b;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                object.onComplete();
            }
        }
        storiesProgressView.e = false;
    }
}

