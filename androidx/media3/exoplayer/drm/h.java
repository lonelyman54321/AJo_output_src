/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCrypto
 *  android.media.MediaCryptoException
 *  android.media.MediaDrm
 *  android.media.MediaDrm$KeyRequest
 *  android.media.MediaDrm$OnEventListener
 *  android.media.MediaDrm$PlaybackComponent
 *  android.media.metrics.LogSessionId
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package androidx.media3.exoplayer.drm;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import androidx.media3.common.DrmInitData$SchemeData;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$a;
import androidx.media3.exoplayer.drm.g;
import androidx.media3.exoplayer.drm.g$a;
import androidx.media3.exoplayer.drm.g$d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public final class h
implements g {
    public static final ww0_0 d;
    public final UUID a;
    public final MediaDrm b;
    public int c;

    static {
        ww0_0 ww0_02;
        d = ww0_02 = new Object();
    }

    public h(UUID object) {
        MediaDrm mediaDrm;
        object.getClass();
        Object object2 = OF.b;
        boolean bl2 = ((UUID)object2).equals(object);
        int n3 = 1;
        Object object3 = "Use C.CLEARKEY_UUID instead";
        ct3.b(bl2 ^= n3, (String)object3);
        this.a = object;
        int n4 = gz3.a;
        int n7 = 27;
        if (n4 >= n7 || (n4 = (int)(((UUID)(object3 = OF.c)).equals(object) ? 1 : 0)) == 0) {
            object2 = object;
        }
        this.b = mediaDrm = new MediaDrm((UUID)object2);
        this.c = n3;
        object2 = OF.d;
        boolean bl3 = ((UUID)object2).equals(object);
        if (bl3 && (bl3 = ((String)(object = "ASUS_Z00AD")).equals(object2 = gz3.d))) {
            object = "securityLevel";
            object2 = "L3";
            mediaDrm.setPropertyString((String)object, (String)object2);
        }
    }

    public final Map a(byte[] byArray) {
        return this.b.queryKeyStatus(byArray);
    }

    public final g$d b() {
        Object object = this.b.getProvisionRequest();
        byte[] byArray = object.getData();
        object = object.getDefaultUrl();
        g$d g$d = new g$d((String)object, byArray);
        return g$d;
    }

    public final byte[] c() {
        return this.b.openSession();
    }

    public final void d(byte[] byArray, byte[] byArray2) {
        this.b.restoreKeys(byArray, byArray2);
    }

    public final void e(DefaultDrmSessionManager$a defaultDrmSessionManager$a) {
        XW0 xW0 = new XW0(this, defaultDrmSessionManager$a);
        this.b.setOnEventListener((MediaDrm.OnEventListener)xW0);
    }

    public final void f(byte[] byArray) {
        this.b.provideProvisionResponse(byArray);
    }

    public final int g() {
        return 2;
    }

    public final void h(byte[] object, nu2 object2) {
        block10: {
            int n3 = gz3.a;
            int n4 = 31;
            if (n3 >= n4) {
                MediaDrm mediaDrm = this.b;
                object2 = ((nu2)object2).b;
                object2.getClass();
                object2 = ((nu2$a)object2).a;
                LogSessionId logSessionId = sF0.a();
                n4 = (int)(Wk0.b((LogSessionId)object2, logSessionId) ? 1 : 0);
                if (n4 != 0) break block10;
                object = YW0.a(mediaDrm, (byte[])object);
                object.getClass();
                object = ZW0.a(object);
                try {
                    aX0.a((MediaDrm.PlaybackComponent)object, (LogSessionId)object2);
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    object = "setLogSessionId failed.";
                    Cx.f((String)object);
                }
            }
        }
    }

    public final be0_0 i(byte[] byArray) {
        UUID uUID;
        int n3 = gz3.a;
        int n4 = 27;
        UUID uUID2 = this.a;
        if (n3 < n4 && (n3 = (int)((uUID = OF.c).equals(uUID2) ? 1 : 0)) != 0) {
            uUID2 = OF.b;
        }
        uw0_0 uw0_02 = new uw0_0(uUID2, byArray);
        return uw0_02;
    }

    public final void j(byte[] byArray) {
        this.b.closeSession(byArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte[] k(byte[] byArray, byte[] byArray2) {
        int n3;
        Object object;
        Object object2;
        block6: {
            object2 = OF.c;
            object = this.a;
            int n4 = ((UUID)object2).equals(object);
            if (n4 == 0) return this.b.provideKeyResponse(byArray, byArray2);
            n4 = gz3.a;
            int n7 = 27;
            if (n4 >= n7) {
                return this.b.provideKeyResponse(byArray, byArray2);
            }
            try {
                object = gz3.l(byArray2);
                object2 = new JSONObject((String)object);
                String string2 = "{\"keys\":[";
                object = new StringBuilder(string2);
                string2 = "keys";
                object2 = object2.getJSONArray(string2);
                n3 = 0;
                string2 = null;
                break block6;
            }
            catch (JSONException jSONException) {}
            object = gz3.l(byArray2);
            String string3 = "Failed to adjust response data: ";
            object = string3.concat((String)object);
            Cx.d((String)object, jSONException);
            return this.b.provideKeyResponse(byArray, byArray2);
        }
        while (true) {
            String string4;
            int n8;
            if (n3 >= (n8 = object2.length())) {
                object2 = "]}";
                ((StringBuilder)object).append((String)object2);
                object2 = ((StringBuilder)object).toString();
                object = StandardCharsets.UTF_8;
                byArray2 = ((String)object2).getBytes((Charset)object);
                return this.b.provideKeyResponse(byArray, byArray2);
            }
            if (n3 != 0) {
                string4 = ",";
                ((StringBuilder)object).append(string4);
            }
            string4 = object2.getJSONObject(n3);
            String string5 = "{\"k\":\"";
            ((StringBuilder)object).append(string5);
            string5 = "k";
            string5 = string4.getString(string5);
            char c2 = '+';
            char c3 = '-';
            string5 = string5.replace(c3, c2);
            char c5 = '/';
            char c6 = '_';
            string5 = string5.replace(c6, c5);
            ((StringBuilder)object).append(string5);
            string5 = "\",\"kid\":\"";
            ((StringBuilder)object).append(string5);
            string5 = "kid";
            string5 = string4.getString(string5);
            string5 = string5.replace(c3, c2);
            string5 = string5.replace(c6, c5);
            ((StringBuilder)object).append(string5);
            string5 = "\",\"kty\":\"";
            ((StringBuilder)object).append(string5);
            string5 = "kty";
            string4 = string4.getString(string5);
            ((StringBuilder)object).append(string4);
            string4 = "\"}";
            ((StringBuilder)object).append(string4);
            ++n3;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final g$a l(byte[] byArray, List list, int n3, HashMap hashMap) {
        Object object;
        Object object2;
        int n4;
        Object object3;
        int n7;
        String string2;
        int n8;
        short s7;
        int n10;
        Object object4;
        Object object5;
        int n14;
        String string3;
        Object object6;
        h h3;
        block24: {
            int n15;
            int n16;
            Object object7;
            int n17;
            Object object8;
            int n18;
            block20: {
                block23: {
                    block21: {
                        block19: {
                            void var18_21;
                            void var18_19;
                            byte[] byArray2;
                            Object object9;
                            block22: {
                                h3 = this;
                                object6 = list;
                                string3 = "<LA_URL>https://x</LA_URL>";
                                n14 = 23;
                                object5 = this.a;
                                if (list == null) break block21;
                                object4 = OF.d;
                                n18 = ((UUID)object4).equals(object5);
                                n10 = 1;
                                s7 = -1;
                                n8 = 0;
                                string2 = null;
                                if (n18 != 0) break block22;
                                object6 = (DrmInitData$SchemeData)list.get(0);
                                break block20;
                            }
                            n18 = gz3.a;
                            n7 = 28;
                            if (n18 < n7 || (n18 = list.size()) <= n10) break block19;
                            object4 = (DrmInitData$SchemeData)list.get(0);
                            object8 = null;
                            boolean bl2 = false;
                            object3 = null;
                            for (n7 = 0; n7 < (n17 = list.size()); var18_19 += n17, ++n7) {
                                object9 = (DrmInitData$SchemeData)object6.get(n7);
                                byArray2 = ((DrmInitData$SchemeData)object9).e;
                                byArray2.getClass();
                                String string4 = ((DrmInitData$SchemeData)object4).d;
                                object7 = ((DrmInitData$SchemeData)object9).d;
                                n16 = (int)(Objects.equals(object7, string4) ? 1 : 0);
                                if (n16 != 0 && (n17 = (int)(Objects.equals(object9 = ((DrmInitData$SchemeData)object9).c, string4 = ((DrmInitData$SchemeData)object4).c) ? 1 : 0)) != 0 && (object9 = UB2.a(byArray2)) != null) {
                                    n17 = byArray2.length;
                                    continue;
                                }
                                break block19;
                            }
                            object8 = new byte[var18_19];
                            boolean bl3 = false;
                            object3 = null;
                            n17 = 0;
                            object9 = null;
                            while (var18_21 < (n15 = list.size())) {
                                byArray2 = ((DrmInitData$SchemeData)object6.get((int)var18_21)).e;
                                byArray2.getClass();
                                n16 = byArray2.length;
                                System.arraycopy(byArray2, 0, object8, n17, n16);
                                n17 += n16;
                                ++var18_21;
                            }
                            object3 = ((DrmInitData$SchemeData)object4).c;
                            object9 = ((DrmInitData$SchemeData)object4).d;
                            object4 = ((DrmInitData$SchemeData)object4).b;
                            object6 = new DrmInitData$SchemeData((UUID)object4, (String)object3, (String)object9, (byte[])object8);
                            break block20;
                        }
                        object4 = null;
                        break block23;
                    }
                    n4 = 0;
                    object6 = null;
                    s7 = 0;
                    object2 = null;
                    n8 = 0;
                    string2 = null;
                    break block24;
                }
                for (n18 = 0; n18 < (n7 = list.size()); ++n18) {
                    object8 = (DrmInitData$SchemeData)object6.get(n18);
                    object3 = ((DrmInitData$SchemeData)object8).e;
                    object3.getClass();
                    object3 = UB2.a((byte[])object3);
                    int n19 = object3 == null ? -1 : ((UB2$a)object3).b;
                    n17 = gz3.a;
                    if ((n17 >= n14 || n19 != 0) && (n17 < n14 || n19 != n10)) continue;
                    object6 = object8;
                    break block20;
                }
                object6 = (DrmInitData$SchemeData)object6.get(0);
            }
            object4 = ((DrmInitData$SchemeData)object6).e;
            object4.getClass();
            object8 = OF.e;
            boolean bl4 = ((UUID)object8).equals(object5);
            if (bl4) {
                object3 = UB2.b((UUID)object5, (byte[])object4);
                if (object3 != null) {
                    object4 = object3;
                }
                object3 = new Xm2((byte[])object4);
                n17 = ((Xm2)object3).k();
                n15 = ((Xm2)object3).m();
                n16 = ((Xm2)object3).m();
                if (n15 == n10 && n16 == n10) {
                    n10 = ((Xm2)object3).m();
                    object = ((Xm2)object3).u(n10, (Charset)(object7 = StandardCharsets.UTF_16LE));
                    boolean bl5 = ((String)object).contains((CharSequence)(object3 = "<LA_URL>"));
                    if (!bl5) {
                        object4 = "</DATA>";
                        n18 = ((String)object).indexOf((String)object4);
                        if (n18 == s7) {
                            object2 = "Could not find the </DATA> tag. Skipping LA_URL workaround.";
                            Cx.f((String)object2);
                        }
                        object2 = new StringBuilder();
                        object3 = ((String)object).substring(0, n18);
                        ((StringBuilder)object2).append((String)object3);
                        ((StringBuilder)object2).append(string3);
                        object4 = ((String)object).substring(n18);
                        ((StringBuilder)object2).append((String)object4);
                        object4 = ((StringBuilder)object2).toString();
                        object = ByteBuffer.allocate(n17 += 52);
                        object2 = ByteOrder.LITTLE_ENDIAN;
                        ((ByteBuffer)object).order((ByteOrder)object2);
                        ((ByteBuffer)object).putInt(n17);
                        s7 = (short)n15;
                        ((ByteBuffer)object).putShort(s7);
                        s7 = (short)n16;
                        ((ByteBuffer)object).putShort(s7);
                        s7 = (short)(((String)object4).length() * 2);
                        ((ByteBuffer)object).putShort(s7);
                        object4 = ((String)object4).getBytes((Charset)object7);
                        ((ByteBuffer)object).put((byte[])object4);
                        object4 = ((ByteBuffer)object).array();
                    }
                } else {
                    object = "Unexpected record count or type. Skipping LA_URL workaround.";
                    Cx.e((String)object);
                }
                if (object4 != null) {
                    n10 = ((Object)object4).length;
                } else {
                    n10 = 0;
                    object = null;
                }
                object2 = ByteBuffer.allocate(n10 += 32);
                ((ByteBuffer)object2).putInt(n10);
                n10 = 1886614376;
                ((ByteBuffer)object2).putInt(n10);
                ((ByteBuffer)object2).putInt(0);
                long l2 = ((UUID)object8).getMostSignificantBits();
                ((ByteBuffer)object2).putLong(l2);
                l2 = ((UUID)object8).getLeastSignificantBits();
                ((ByteBuffer)object2).putLong(l2);
                if (object4 != null && (n10 = ((Object)object4).length) != 0) {
                    n10 = ((Object)object4).length;
                    ((ByteBuffer)object2).putInt(n10);
                    ((ByteBuffer)object2).put((byte[])object4);
                } else {
                    ((ByteBuffer)object2).putInt(0);
                }
                object4 = ((ByteBuffer)object2).array();
            }
            if (((n10 = gz3.a) < n14 && (s7 = (short)(((UUID)(object2 = OF.d)).equals(object5) ? 1 : 0)) != 0 || (s7 = (short)(((UUID)object8).equals(object5) ? 1 : 0)) != 0 && (s7 = (short)(((String)(object2 = "Amazon")).equals(string2 = gz3.c) ? 1 : 0)) != 0 && ((n8 = (int)((string2 = "AFTB").equals(object2 = gz3.d) ? 1 : 0)) != 0 || (n8 = (int)((string2 = "AFTS").equals(object2) ? 1 : 0)) != 0 || (n8 = (int)((string2 = "AFTM").equals(object2) ? 1 : 0)) != 0 || (s7 = (short)((string2 = "AFTT").equals(object2) ? 1 : 0)) != 0)) && (object2 = (Object)UB2.b((UUID)object5, (byte[])object4)) != null) {
                object4 = object2;
            }
            s7 = 26;
            string2 = ((DrmInitData$SchemeData)object6).d;
            if (n10 < s7 && (n10 = (int)(((UUID)(object = (Object)OF.c)).equals(object5) ? 1 : 0)) != 0 && ((n10 = (int)(((String)(object = "video/mp4")).equals(string2) ? 1 : 0)) != 0 || (n10 = (int)(((String)(object = (Object)"audio/mp4")).equals(string2) ? 1 : 0)) != 0)) {
                string2 = "cenc";
            }
            object2 = object4;
        }
        object4 = h3.b;
        object = byArray;
        n7 = n3;
        object3 = hashMap;
        object4 = object4.getKeyRequest(byArray, object2, string2, n3, hashMap);
        object = object4.getData();
        object2 = OF.c;
        short s8 = ((UUID)object2).equals(object5);
        if (s8 != 0 && (s8 = gz3.a) < (s7 = 27)) {
            object5 = gz3.l((byte[])object).replace('+', '-');
            n10 = 47;
            s7 = 95;
            object5 = ((String)object5).replace((char)n10, (char)s7);
            object = StandardCharsets.UTF_8;
            object = ((String)object5).getBytes((Charset)object);
        }
        object5 = object4.getDefaultUrl();
        int n20 = string3.equals(object5);
        object2 = "";
        if (n20 != 0 || (n20 = gz3.a) >= (n8 = 33) && (n20 = (int)((string3 = "https://default.url").equals(object5) ? 1 : 0)) != 0 && ((n8 = (int)(Objects.equals(string3 = h3.b.getPropertyString("version"), string2 = "1.2") ? 1 : 0)) != 0 || (n20 = (int)(Objects.equals(string3, string2 = "aidl-1") ? 1 : 0)) != 0)) {
            object5 = object2;
        }
        if ((n20 = (int)(TextUtils.isEmpty((CharSequence)object5) ? 1 : 0)) != 0 && object6 != null && (n20 = (int)(TextUtils.isEmpty((CharSequence)(object6 = ((DrmInitData$SchemeData)object6).c)) ? 1 : 0)) == 0) {
            object5 = object6;
        }
        if ((n4 = gz3.a) < n14) return new g$a((String)object5, (byte[])object);
        Ls.a((MediaDrm.KeyRequest)object4);
        return new g$a((String)object5, (byte[])object);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean m(String string2, byte[] byArray) {
        Object object;
        boolean bl2;
        block14: {
            void var1_4;
            block13: {
                MediaCrypto mediaCrypto;
                int n3 = gz3.a;
                int n4 = 31;
                bl2 = true;
                UUID uUID = this.a;
                if (n3 >= n4) {
                    object = OF.d;
                    n3 = (int)(uUID.equals(object) ? 1 : 0);
                    mediaCrypto = this.b;
                    if (n3 != 0) {
                        String string3;
                        object = mediaCrypto.getPropertyString("version");
                        boolean bl3 = ((String)object).startsWith(string3 = "v5.");
                        if (!(bl3 || (bl3 = ((String)object).startsWith(string3 = "14.")) || (bl3 = ((String)object).startsWith(string3 = "15.")) || (n3 = (int)(((String)object).startsWith(string3 = "16.0") ? 1 : 0)) != 0)) {
                            n3 = 1;
                        } else {
                            n3 = 0;
                            object = null;
                        }
                    } else {
                        object = OF.c;
                        n3 = (int)(uUID.equals(object) ? 1 : 0);
                    }
                    if (n3 != 0) {
                        int n7 = VW0.a((MediaDrm)mediaCrypto, byArray);
                        return bX0.a((MediaDrm)mediaCrypto, string2, n7);
                    }
                }
                n3 = 0;
                object = null;
                try {
                    mediaCrypto = new MediaCrypto(uUID, byArray);
                }
                catch (Throwable throwable) {
                    break block13;
                }
                catch (MediaCryptoException mediaCryptoException) {
                    break block14;
                }
                try {
                    bl2 = mediaCrypto.requiresSecureDecoderComponent(string2);
                }
                catch (Throwable throwable) {
                    object = mediaCrypto;
                    break block13;
                }
                catch (MediaCryptoException mediaCryptoException) {
                    object = mediaCrypto;
                    break block14;
                }
                mediaCrypto.release();
                return bl2;
            }
            if (object == null) throw var1_4;
            object.release();
            throw var1_4;
        }
        if (object == null) return bl2;
        object.release();
        return bl2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void release() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        int n3;
                        this.c = n3 = this.c + -1;
                        if (n3 != 0) break block4;
                        MediaDrm mediaDrm = this.b;
                        mediaDrm.release();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

