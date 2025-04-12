/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public class F13$c {
    public static void f(ShareVideo object) {
        Object object2 = f13_0.a;
        if (object != null) {
            object = ((ShareVideo)object).b;
            if (object != null) {
                boolean bl2;
                object2 = lz3_0.a;
                String string2 = "content";
                object2 = object.getScheme();
                boolean bl3 = string2.equalsIgnoreCase((String)object2);
                if (bl3 || (bl2 = ((String)(object2 = "file")).equalsIgnoreCase((String)(object = object.getScheme())))) {
                    return;
                }
                object = new FacebookException("ShareVideo must reference a video that is on the device");
                throw object;
            }
            object = new FacebookException("ShareVideo does not have a LocalUrl specified");
            throw object;
        }
        object = new FacebookException("Cannot share a null ShareVideo");
        throw object;
    }

    public void a(ShareLinkContent object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "linkContent");
        object = ((ShareContent)object).a;
        if (object != null && !(bl2 = lz3_0.B((Uri)object))) {
            object = new FacebookException("Content Url must be an http:// or https:// url");
            throw object;
        }
    }

    public final void b(ShareMedia object) {
        Object object2;
        Object object3;
        int n3;
        block4: {
            block3: {
                boolean bl2;
                block2: {
                    n3 = 1;
                    object3 = "medium";
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    object2 = f13_0.a;
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    object3 = "validator";
                    Intrinsics.checkNotNullParameter(this, (String)object3);
                    bl2 = object instanceof SharePhoto;
                    if (!bl2) break block2;
                    object = (SharePhoto)object;
                    this.d((SharePhoto)object);
                    break block3;
                }
                bl2 = object instanceof ShareVideo;
                if (!bl2) break block4;
                object = (ShareVideo)object;
                F13$c.f((ShareVideo)object);
            }
            return;
        }
        object2 = StringCompanionObject.INSTANCE;
        object2 = Locale.ROOT;
        object = object.getClass().getSimpleName();
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        object = IV0.a(objectArray, n3, (Locale)object2, "Invalid media type: %s", "format(locale, format, *args)");
        object3 = new FacebookException((String)object);
        throw object3;
    }

    public void c(ShareMediaContent iterator) {
        int n3;
        int n4 = 1;
        Intrinsics.checkNotNullParameter(iterator, "mediaContent");
        Object object = f13_0.a;
        iterator = ((ShareMediaContent)((Object)iterator)).g;
        if (iterator != null && (n3 = iterator.isEmpty()) == 0) {
            int n7;
            n3 = iterator.size();
            if (n3 <= (n7 = 6)) {
                iterator = iterator.iterator();
                while ((n4 = iterator.hasNext()) != 0) {
                    ShareMedia shareMedia = (ShareMedia)iterator.next();
                    this.b(shareMedia);
                }
                return;
            }
            object = StringCompanionObject.INSTANCE;
            object = Locale.ROOT;
            Integer n8 = n7;
            Object[] objectArray = new Object[n4];
            objectArray[0] = n8;
            String string2 = IV0.a(objectArray, n4, (Locale)object, "Cannot add more than %d media.", "format(locale, format, *args)");
            iterator = new Iterator(string2);
            throw iterator;
        }
        iterator = new Iterator("Must specify at least one medium in ShareMediaContent.");
        throw iterator;
    }

    public void d(SharePhoto object) {
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "photo");
        Object object2 = f13_0.a;
        if (object != null) {
            boolean bl2;
            boolean bl3;
            object2 = ((SharePhoto)object).b;
            object = ((SharePhoto)object).c;
            if (object2 == null && object == null) {
                object = new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
                throw object;
            }
            if (object2 == null && (bl3 = lz3_0.B((Uri)object))) {
                object = new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
                throw object;
            }
            if (object2 != null || !(bl2 = lz3_0.B((Uri)object))) {
                String string2;
                object = FacebookSdk.a();
                Intrinsics.checkNotNullParameter(object, "context");
                object2 = FacebookSdk.b();
                object = object.getPackageManager();
                if (object != null && (object = object.resolveContentProvider((String)(object2 = (string2 = "com.facebook.app.FacebookContentProvider").concat((String)object2)), 0)) == null) {
                    object = StringCompanionObject.INSTANCE;
                    object = new Object[n3];
                    object[0] = object2;
                    object = xh2_0.a((Object[])object, n3, "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", "format(format, *args)");
                    object = object.toString();
                    IllegalStateException illegalStateException = new IllegalStateException((String)object);
                    throw illegalStateException;
                }
            }
            return;
        }
        object = new FacebookException("Cannot share a null SharePhoto");
        throw object;
    }

    public void e(ShareStoryContent shareStoryContent) {
        f13_0.a(shareStoryContent, this);
    }

    public void g(ShareVideoContent object) {
        Intrinsics.checkNotNullParameter(object, "videoContent");
        Object object2 = f13_0.a;
        object2 = object.j;
        F13$c.f((ShareVideo)object2);
        object = object.i;
        if (object != null) {
            this.d((SharePhoto)object);
        }
    }
}

