/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package android.support.v4.media.session;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi22;
import android.text.TextUtils;

class MediaSessionCompat$MediaSessionImplApi28
extends MediaSessionCompat$MediaSessionImplApi22 {
    public MediaSessionCompat$MediaSessionImplApi28(Context context, String string2, qB3 qB32, Bundle bundle) {
        super(context, string2, qB32, bundle);
    }

    public MediaSessionCompat$MediaSessionImplApi28(Object object) {
        super(object);
    }

    public final fn1_0 getCurrentControllerInfo() {
        Object object = dN1.a(this.mSessionFwk);
        fn1_0 fn1_02 = new Object();
        Object object2 = gN1.a(object);
        if (object2 != null) {
            boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
            if (!bl2) {
                String string2 = gN1.a(object);
                int n3 = hN1.a(object);
                int n4 = iN1.a(object);
                fn1_02.a = object2 = new lN1(string2, n3, n4);
                return fn1_02;
            }
            object = new IllegalArgumentException("packageName should be nonempty");
            throw object;
        }
        object = new NullPointerException("package shouldn't be null");
        throw object;
    }

    public void setCurrentControllerInfo(fn1_0 fn1_02) {
    }
}

