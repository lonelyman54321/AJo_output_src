/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.Bundle
 */
package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia$a;
import com.facebook.share.model.SharePhoto;
import kotlin.jvm.internal.Intrinsics;

public final class SharePhoto$a
extends ShareMedia$a {
    public Bitmap b;
    public Uri c;
    public boolean d;
    public String e;

    public final void a(SharePhoto object) {
        if (object != null) {
            boolean bl2;
            Bitmap bitmap;
            Bundle bundle = ((ShareMedia)object).a;
            Intrinsics.checkNotNullParameter(bundle, "parameters");
            this.a.putAll(bundle);
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareMedia.Builder");
            this.b = bitmap = ((SharePhoto)object).b;
            bitmap = ((SharePhoto)object).c;
            this.c = bitmap;
            this.d = bl2 = ((SharePhoto)object).d;
            this.e = object = ((SharePhoto)object).e;
        }
    }
}

