/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 */
package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSource$Factory;
import androidx.media3.datasource.c$a;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import androidx.media3.exoplayer.drm.d;
import androidx.media3.exoplayer.drm.g$a;
import androidx.media3.exoplayer.drm.g$d;
import androidx.media3.exoplayer.drm.j;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class i
implements j {
    public final DataSource$Factory a;
    public final String b;
    public final boolean c;
    public final HashMap d;

    public i(String hashMap, boolean bl2, c$a c$a) {
        boolean bl3;
        bl3 = !bl2 || !(bl3 = TextUtils.isEmpty((CharSequence)((Object)hashMap)));
        ct3.a(bl3);
        this.a = c$a;
        this.b = hashMap;
        this.c = bl2;
        this.d = hashMap = new HashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte[] a(UUID uUID, g$a g$a) {
        Object object;
        i i3 = this;
        Object object2 = uUID;
        Object object3 = g$a;
        String string2 = g$a.b;
        boolean bl2 = this.c;
        if (bl2 || (bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            string2 = i3.b;
        }
        if (bl2 = TextUtils.isEmpty((CharSequence)string2)) {
            ti0_1 ti0_12;
            Uri uri = Collections.emptyMap();
            Uri uri2 = Uri.EMPTY;
            ct3.i(uri2, "The uri must be set.");
            object3 = ti0_12;
            string2 = uri2;
            ti0_12 = new ti0_1(uri2, 0L, 1, null, (Map)uri, 0L, -1, null, 0, null);
            ImmutableMap immutableMap = ImmutableMap.of();
            IllegalStateException illegalStateException = new IllegalStateException("No license URL");
            Object object4 = object2;
            ti0_1 ti0_13 = ti0_12;
            uri = uri2;
            object2 = new MediaDrmCallbackException(ti0_12, uri2, immutableMap, 0L, illegalStateException);
            throw object2;
        }
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Object object5 = OF.e;
        boolean bl3 = ((UUID)object5).equals(object2);
        object = bl3 ? "text/xml" : ((bl3 = ((UUID)(object = OF.c)).equals(object2)) ? "application/json" : "application/octet-stream");
        String string3 = "Content-Type";
        hashMap.put(string3, object);
        boolean bl4 = ((UUID)object5).equals(object2);
        if (bl4) {
            object2 = "SOAPAction";
            object5 = "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense";
            hashMap.put(object2, object5);
        }
        object5 = i3.d;
        synchronized (object5) {
            object2 = i3.d;
            hashMap.putAll((Map<Object, Object>)object2);
        }
        object2 = i3.a.a();
        object3 = ((g$a)object3).a;
        return androidx.media3.exoplayer.drm.d.a((DataSource)object2, string2, (byte[])object3, hashMap);
    }

    public final byte[] b(g$d object) {
        Object object2 = new StringBuilder();
        String string2 = ((g$d)object).b;
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append("&signedRequest=");
        object = gz3.l(((g$d)object).a);
        ((StringBuilder)object2).append((String)object);
        object = ((StringBuilder)object2).toString();
        object2 = this.a.a();
        Map map2 = Collections.emptyMap();
        return androidx.media3.exoplayer.drm.d.a((DataSource)object2, (String)object, null, map2);
    }
}

