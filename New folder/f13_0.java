/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookException;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from F13
 */
public final class f13_0 {
    public static final F13$d a;
    public static final F13$c b;
    public static final F13$b c;

    static {
        F13$c f13$c;
        a = f13$c = new F13$c();
        f13$c = new F13$c();
        b = f13$c;
        new F13$c();
        f13$c = new F13$c();
        c = f13$c;
    }

    public static final void a(ShareStoryContent object, F13$c f13$c) {
        if (object != null) {
            SharePhoto sharePhoto = ((ShareStoryContent)object).h;
            object = ((ShareStoryContent)object).g;
            if (object != null || sharePhoto != null) {
                if (object != null) {
                    f13$c.b((ShareMedia)object);
                }
                if (sharePhoto != null) {
                    f13$c.d(sharePhoto);
                }
                return;
            }
        }
        object = new FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void b(ShareContent object, F13$c object2) {
        int n3 = 1;
        if (object == null) {
            object = new FacebookException("Must provide non-null content to share");
            throw object;
        }
        int n4 = object instanceof ShareLinkContent;
        if (n4 != 0) {
            object = (ShareLinkContent)object;
            ((F13$c)object2).a((ShareLinkContent)object);
            return;
        }
        n4 = object instanceof SharePhotoContent;
        if (n4 != 0) {
            object = (SharePhotoContent)object;
            object2.getClass();
            Object object3 = "photoContent";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            object = ((SharePhotoContent)object).g;
            if (object != null && (n4 = object.isEmpty()) == 0) {
                int n7;
                n4 = object.size();
                if (n4 > (n7 = 6)) {
                    object2 = StringCompanionObject.INSTANCE;
                    object2 = Locale.ROOT;
                    object3 = n7;
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object3;
                    object2 = IV0.a(objectArray, n3, (Locale)object2, "Cannot add more than %d photos.", "format(locale, format, *args)");
                    object = new FacebookException((String)object2);
                    throw object;
                }
                object = object.iterator();
                while ((n3 = object.hasNext()) != 0) {
                    SharePhoto sharePhoto = (SharePhoto)object.next();
                    ((F13$c)object2).d(sharePhoto);
                }
                return;
            }
            object = new FacebookException("Must specify at least one Photo in SharePhotoContent.");
            throw object;
        }
        n3 = object instanceof ShareVideoContent;
        if (n3 != 0) {
            object = (ShareVideoContent)object;
            ((F13$c)object2).g((ShareVideoContent)object);
            return;
        }
        n3 = object instanceof ShareMediaContent;
        if (n3 != 0) {
            object = (ShareMediaContent)object;
            ((F13$c)object2).c((ShareMediaContent)object);
            return;
        }
        n3 = object instanceof ShareCameraEffectContent;
        if (n3 == 0) {
            n3 = object instanceof ShareStoryContent;
            if (n3 == 0) return;
            object = (ShareStoryContent)object;
            ((F13$c)object2).e((ShareStoryContent)object);
            return;
        }
        object = (ShareCameraEffectContent)object;
        object2.getClass();
        object2 = "cameraEffectContent";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((ShareCameraEffectContent)object).g;
        boolean bl2 = lz3_0.A((String)object);
        if (!bl2) {
            return;
        }
        object = new FacebookException("Must specify a non-empty effectId");
        throw object;
    }
}

