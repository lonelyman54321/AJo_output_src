/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 *  android.net.Uri
 */
import android.content.res.AssetManager;
import android.net.Uri;

/*
 * Renamed from gq
 */
public final class gq_0
implements BP1 {
    public final AssetManager a;
    public final gq$a b;

    public gq_0(AssetManager assetManager, gq$a gq$a) {
        this.a = assetManager;
        this.b = gq$a;
    }

    public final BP1$a a(Object object, int n3, int n4, Z92 qn1_02) {
        object = (Uri)object;
        String string2 = object.toString().substring(22);
        qn1_02 = new k62(object);
        object = this.b;
        AssetManager assetManager = this.a;
        object = object.a(assetManager, string2);
        BP1$a bP1$a = new BP1$a(qn1_02, (ei0_0)object);
        return bP1$a;
    }

    public final boolean b(Object object) {
        boolean bl2;
        object = (Uri)object;
        Object object2 = object.getScheme();
        boolean bl3 = "file".equals(object2);
        boolean bl4 = false;
        if (bl3 && !(bl3 = (object2 = object.getPathSegments()).isEmpty()) && (bl2 = ((String)(object2 = "android_asset")).equals(object = object.getPathSegments().get(0)))) {
            bl4 = true;
        }
        return bl4;
    }
}

