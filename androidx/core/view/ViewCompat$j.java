/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ContentInfo
 *  android.view.View
 */
package androidx.core.view;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

public final class ViewCompat$j {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static M60 b(View view, M60 m60) {
        Object object = m60.a.b();
        Objects.requireNonNull(object);
        view = view.performReceiveContent(object);
        if (view == null) {
            return null;
        }
        if (view == object) {
            return m60;
        }
        object = new M60$d((ContentInfo)view);
        m60 = new M60((M60$e)object);
        return m60;
    }
}

