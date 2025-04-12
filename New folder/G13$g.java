/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.Bundle
 */
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.AccessToken$b;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhoto$a;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.SharePhotoContent$a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

public final class G13$g
extends qI0$a {
    public final /* synthetic */ g13_0 b;

    public G13$g(g13_0 object) {
        this.b = object;
        object = G13$d.WEB;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(ShareContent serializable, boolean bl2) {
        Intrinsics.checkNotNullParameter(serializable, "content");
        int n3 = g13_0.i;
        serializable = serializable.getClass();
        Class clazz = ShareLinkContent.class;
        boolean bl3 = clazz.isAssignableFrom((Class<?>)serializable);
        if (bl3) return true;
        clazz = SharePhotoContent.class;
        boolean bl4 = clazz.isAssignableFrom((Class<?>)serializable);
        if (!bl4) return false;
        serializable = AccessToken.l;
        bl4 = AccessToken$b.c();
        if (!bl4) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final pm_0 b(ShareContent shareContent) {
        boolean bl2;
        Object object;
        ShareContent shareContent2 = shareContent;
        Intrinsics.checkNotNullParameter(shareContent, "content");
        Object object2 = this.b;
        Activity activity = ((qi0_0)object2).b();
        Object object3 = G13$d.WEB;
        g13_0.e((g13_0)object2, activity, shareContent, (G13$d)((Object)object3));
        object2 = ((g13_0)object2).a();
        F13$d f13$d = f13_0.a;
        f13_0.b(shareContent, f13$d);
        boolean bl3 = shareContent instanceof ShareLinkContent;
        object3 = "hashtag";
        String string2 = "shareContent";
        if (bl3) {
            Object object4 = shareContent;
            object4 = (ShareLinkContent)shareContent;
            Intrinsics.checkNotNullParameter(object4, "shareLinkContent");
            Intrinsics.checkNotNullParameter(object4, string2);
            string2 = new Bundle();
            Object object5 = ((ShareContent)object4).f;
            if (object5 != null) {
                object5 = ((ShareHashtag)object5).a;
            } else {
                boolean bl4 = false;
                object5 = null;
            }
            lz3_0.H((Bundle)string2, (String)object3, (String)object5);
            object5 = ((ShareContent)object4).a;
            lz3_0.I((Uri)object5, (Bundle)string2, "href");
            object3 = "quote";
            object4 = ((ShareLinkContent)object4).g;
            lz3_0.H((Bundle)string2, (String)object3, (String)object4);
            object = null;
        } else {
            Object object6;
            ShareHashtag shareHashtag;
            String string3;
            String string4;
            String string5;
            void var15_23;
            boolean bl5 = shareContent instanceof SharePhotoContent;
            if (!bl5) return null;
            Object object7 = shareContent;
            object7 = (SharePhotoContent)shareContent;
            Object object8 = ((pm_0)object2).a();
            SharePhotoContent$a sharePhotoContent$a = new SharePhotoContent$a();
            Object object9 = ((ShareContent)object7).a;
            sharePhotoContent$a.a = object9;
            object9 = "null cannot be cast to non-null type B of com.facebook.share.model.ShareContent.Builder";
            Intrinsics.checkNotNull(sharePhotoContent$a, (String)object9);
            List list = ((ShareContent)object7).b;
            if (list == null) {
                Object var15_21 = null;
            } else {
                List list2 = Collections.unmodifiableList(list);
            }
            sharePhotoContent$a.b = var15_23;
            Intrinsics.checkNotNull(sharePhotoContent$a, (String)object9);
            sharePhotoContent$a.c = string5 = ((ShareContent)object7).c;
            Intrinsics.checkNotNull(sharePhotoContent$a, (String)object9);
            sharePhotoContent$a.d = string4 = ((ShareContent)object7).d;
            Intrinsics.checkNotNull(sharePhotoContent$a, (String)object9);
            sharePhotoContent$a.e = string3 = ((ShareContent)object7).e;
            Intrinsics.checkNotNull(sharePhotoContent$a, (String)object9);
            sharePhotoContent$a.f = shareHashtag = ((ShareContent)object7).f;
            Intrinsics.checkNotNull(sharePhotoContent$a, (String)object9);
            object7 = ((SharePhotoContent)object7).g;
            sharePhotoContent$a.a((List)object7);
            object9 = new ArrayList();
            ArrayList<ls1$a_0> arrayList = new ArrayList<ls1$a_0>();
            int n3 = object7.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                object6 = (SharePhoto)object7.get(i3);
                Bitmap bitmap = ((SharePhoto)object6).b;
                if (bitmap != null) {
                    ls1$a_0 ls1$a_0 = ls1_1.b((UUID)object8, bitmap);
                    object = new SharePhoto$a();
                    ((SharePhoto$a)object).a((SharePhoto)object6);
                    object6 = Uri.parse((String)ls1$a_0.d);
                    ((SharePhoto$a)object).c = object6;
                    ((SharePhoto$a)object).b = null;
                    object6 = new SharePhoto((SharePhoto$a)object);
                    arrayList.add(ls1$a_0);
                }
                object = null;
                ((ArrayList)object9).add(object6);
            }
            object = null;
            sharePhotoContent$a.g.clear();
            sharePhotoContent$a.a((List)object9);
            ls1_1.a(arrayList);
            object7 = new SharePhotoContent(sharePhotoContent$a);
            Intrinsics.checkNotNullParameter(object7, "sharePhotoContent");
            Intrinsics.checkNotNullParameter(object7, string2);
            string2 = new Bundle();
            object8 = ((ShareContent)object7).f;
            object6 = object8 != null ? ((ShareHashtag)object8).a : null;
            lz3_0.H((Bundle)string2, (String)object3, (String)object6);
            object3 = ((SharePhotoContent)object7).g;
            if (object3 == null) {
                object3 = mz0_2.a;
            }
            object3 = (Iterable)object3;
            int n4 = yx_2.o((Iterable)object3, 10);
            object7 = new ArrayList(n4);
            object3 = object3.iterator();
            while ((n4 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object8 = String.valueOf(((SharePhoto)object3.next()).c);
                ((ArrayList)object7).add(object8);
            }
            n4 = 0;
            object8 = null;
            object3 = new String[]{};
            object3 = (String[])((ArrayList)object7).toArray((T[])object3);
            object7 = "media";
            string2.putStringArray((String)object7, (String[])object3);
        }
        if (bl3 || (bl2 = shareContent2 instanceof SharePhotoContent)) {
            object = "share";
        }
        hq0_0.e((pm_0)object2, (String)object, (Bundle)string2);
        return object2;
    }
}

