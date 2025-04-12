/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.share.model;

import com.facebook.share.model.ShareContent$a;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhoto$a;
import java.util.ArrayList;
import java.util.List;

public final class SharePhotoContent$a
extends ShareContent$a {
    public final ArrayList g;

    public SharePhotoContent$a() {
        ArrayList arrayList;
        this.g = arrayList = new ArrayList();
    }

    public final void a(List object) {
        if (object != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                SharePhoto sharePhoto = (SharePhoto)object.next();
                if (sharePhoto == null) continue;
                ArrayList arrayList = this.g;
                SharePhoto$a sharePhoto$a = new SharePhoto$a();
                sharePhoto$a.a(sharePhoto);
                sharePhoto = new SharePhoto(sharePhoto$a);
                arrayList.add(sharePhoto);
            }
        }
    }
}

