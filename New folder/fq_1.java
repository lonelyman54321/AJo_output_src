/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.webkit.MimeTypeMap
 */
import android.net.Uri;
import android.webkit.MimeTypeMap;
import kotlin.collections.CollectionsKt;

/*
 * Renamed from fq
 */
public final class fq_1
implements el0_0 {
    public final Uri a;
    public final ba2 b;

    public fq_1(Uri uri, ba2 ba22) {
        this.a = uri;
        this.b = ba22;
    }

    public final Object a(f80_0 object) {
        Object object2 = object = CollectionsKt.G(this.a.getPathSegments(), 1);
        object = CollectionsKt.R((Iterable)object, "/", null, null, null, 62);
        Object object3 = this.b;
        ie2_2 ie2_22 = o72_0.b(o72_0.h(object3.a.getAssets().open((String)object)));
        dq_0 dq_02 = new dq_0((String)object);
        object3 = object3.a;
        zz_1 zz_12 = new zz_1(object3, 2);
        f93_0 f93_02 = new f93_0(ie2_22, zz_12, dq_02);
        object = m.b(MimeTypeMap.getSingleton(), (String)object);
        object3 = ri0.DISK;
        object2 = new N93(f93_02, (String)object, (ri0)((Object)object3));
        return object2;
    }
}

